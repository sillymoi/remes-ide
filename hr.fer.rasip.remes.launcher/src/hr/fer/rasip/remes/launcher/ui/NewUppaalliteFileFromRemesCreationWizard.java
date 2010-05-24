package hr.fer.rasip.remes.launcher.ui;

import hr.fer.rasip.remes.launcher.Remes2UppaalliteConverter;
import hr.fer.rasip.remes.launcher.RemesModelManager;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.dialogs.WizardNewFileCreationPage;

import se.mdh.progresside.components.core.IArchModel;
import se.mdh.progresside.proComMetamodel.proSave.Component;
import se.mdh.progresside.proComMetamodel.proSave.impl.ComponentImpl;
import se.mdh.progresside.proComMetamodel.util.ProComComponentResourceFactory;

public class NewUppaalliteFileFromRemesCreationWizard extends Wizard{
	
	private WizardNewFileCreationPage remesFileCreationPage;
	private WizardNewFileCreationPage uppalliteFileCreationPage;
	private IArchModel myArchModel;
	
	public NewUppaalliteFileFromRemesCreationWizard(IArchModel archModel){
		assert archModel != null : "ArchModel must be specified"; //$NON-NLS-1$
		
		remesFileCreationPage = new WizardNewFileCreationPage("Remes + ProSave to Uppaallite transformation Wizard", StructuredSelection.EMPTY);
		remesFileCreationPage.setTitle("Remes File");
		remesFileCreationPage.setDescription("Create new Composite Remes file by connecting all component Remes models");

		
		String fileName = getComponentName(archModel);
		IPath filePath =  new Path(archModel.getCorrespondingResource().getProject().getFullPath().append("/system Models").toString());
			
		remesFileCreationPage.setContainerFullPath(filePath);
		remesFileCreationPage.setFileName(getUniqueFileName(filePath, fileName, "remes")); //$NON-NLS-1$
		
		uppalliteFileCreationPage = new WizardNewFileCreationPage("Remes + ProSave to Uppaallite transformation Wizard", StructuredSelection.EMPTY);
		uppalliteFileCreationPage.setTitle("Uppaallite File");
		uppalliteFileCreationPage.setDescription("Create new Uppaallite file based on Remes and ProCom model");
		
		uppalliteFileCreationPage.setContainerFullPath(filePath);
		uppalliteFileCreationPage.setFileName(getUniqueFileName(filePath, fileName, "uppaallite")); //$NON-NLS-1$
		
		myArchModel = archModel;
	}
	

	
	private String getComponentName(IArchModel archModel){
		String name = null;
		ResourceSet resourceSet = new ResourceSetImpl();
		Resource modelResource = resourceSet.getResource(ProComComponentResourceFactory.getEmfResource(archModel.getCorrespondingResource()).getURI(), true);
		for (Object element : modelResource.getContents()) {
			if (element instanceof ComponentImpl) {
				Component c = (Component) element;
				name = c.getName();
			}
		}
		return name;
	}
	

	public void addPages() {
		addPage(remesFileCreationPage);
		addPage(uppalliteFileCreationPage);
	}
	
	public static String getUniqueFileName(IPath containerFullPath,
			String fileName, String extension) {
		if (containerFullPath == null) {
			containerFullPath = new Path(""); //$NON-NLS-1$
		}
		if (fileName == null || fileName.trim().length() == 0) {
			fileName = "default"; //$NON-NLS-1$
		}
		IPath filePath = containerFullPath.append(fileName);
		if (extension != null && !extension.equals(filePath.getFileExtension())) {
			filePath = filePath.addFileExtension(extension);
		}
		extension = filePath.getFileExtension();
		fileName = filePath.removeFileExtension().lastSegment();
		int i = 1;
		while (ResourcesPlugin.getWorkspace().getRoot().exists(filePath)) {
			i++;
			filePath = containerFullPath.append(fileName + i);
			if (extension != null) {
				filePath = filePath.addFileExtension(extension);
			}
		}
		return filePath.lastSegment();
	}

	@Override
	public boolean performFinish() {
		
		IFile remesFile = remesFileCreationPage.createNewFile();
		IFile uppaalliteFile = uppalliteFileCreationPage.createNewFile();
		RemesModelManager.createCompositeRemesModel(remesFile, myArchModel);
		Remes2UppaalliteConverter.doConvertArchitecture(remesFile, uppaalliteFile, myArchModel);
		return true;
	}
}