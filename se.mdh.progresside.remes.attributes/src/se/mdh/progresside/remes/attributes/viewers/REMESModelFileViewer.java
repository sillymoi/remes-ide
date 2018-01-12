package se.mdh.progresside.remes.attributes.viewers;

import java.io.IOException;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;

import se.mdh.progresside.attributes.BasicAttributeTypes.viewers.AbstractModelFileViewer;
import se.mdh.progresside.base.util.FileUtils;
import se.mdh.progresside.remes.attributes.REMESCst;
import se.mdh.progresside.remes.diagram.part.RemesDiagramEditorUtil;

public abstract class REMESModelFileViewer extends AbstractModelFileViewer {

	protected String getSubFolderName() {
		return REMESCst.REMES_MODEL_SUBFOLDER_NAME;
	}

	@Override
	protected String getAttrValue() {
		return new Path(getSubFolderName()).append(REMESCst.REMES_DIAGRAM_FILE).toPortableString();
	}

	@Override
	public void updateFiles(IPath modelFolderPath, IFile componentModelFile) {
		IPath subFolderPath = modelFolderPath.append(getSubFolderName());
		IFolder subFolder = FileUtils.getFolder(subFolderPath);
		FileUtils.createFolder(subFolder, false);
		
		updateModelFile(subFolderPath, componentModelFile);
		
		FileUtils.refresh(subFolder);
	}

	private void updateModelFile(IPath subFolderPath, IFile componentModelFile) {
		IPath remesFilePath = subFolderPath.append(REMESCst.REMES_FILE);
		IPath remesDiagramPath = subFolderPath.append(REMESCst.REMES_DIAGRAM_FILE);
		IFile remesFile = FileUtils.getFile(remesFilePath);
		final Resource r = getAttributable().eResource();
		final URI remesModelURI = URI.createPlatformResourceURI(remesFilePath.toString(), true);
		final TransactionalEditingDomain domain = TransactionalEditingDomain.Factory.INSTANCE
					.createEditingDomain(r.getResourceSet());
		if (!remesFile.exists()) {
			final URI remesDiagramURI = URI.createPlatformResourceURI(remesDiagramPath.toString(), true);
			
			domain.getCommandStack().execute(new RecordingCommand(domain) {
				protected void doExecute() {
					RemesDiagramEditorUtil.createDiagram(remesDiagramURI, remesModelURI, new NullProgressMonitor());
				}
			});
		}
		
		// update remes model
		Resource remesModelRes = new ResourceSetImpl().createResource(remesModelURI);
		try {
			remesModelRes.load(null);
		} catch (IOException e) {
			e.printStackTrace();
			return;
		}
		generateRemesModel(remesModelRes);
		
	}
	
	protected abstract void generateRemesModel(Resource remesModelRes);
}