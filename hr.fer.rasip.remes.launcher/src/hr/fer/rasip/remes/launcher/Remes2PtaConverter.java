/**
 * 
 */
package hr.fer.rasip.remes.launcher;

import hr.fer.rasip.remes.launcher.actions.Remes2PtaAction;

import java.net.URL;
import java.util.Collections;
import java.util.UUID;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.m2m.atl.core.ATLCoreException;
import org.eclipse.m2m.atl.core.IExtractor;
import org.eclipse.m2m.atl.core.IModel;
import org.eclipse.m2m.atl.core.IReferenceModel;
import org.eclipse.m2m.atl.core.ModelFactory;
import org.eclipse.m2m.atl.core.emf.EMFInjector;
import org.eclipse.m2m.atl.core.launch.ILauncher;
import org.eclipse.m2m.atl.core.service.CoreService;
import org.osgi.framework.Bundle;

import se.mdh.progresside.behaviours.core.IBehaviourModel;
import se.mdh.progresside.behaviours.internal.core.BehaviourModel;
import se.mdh.progresside.components.ComponentsPlugin;
import se.mdh.progresside.components.core.IArchModel;
import se.mdh.progresside.components.core.IComponent;
import se.mdh.progresside.components.core.IProComModelManager;
import se.mdh.progresside.proComMetamodel.procomPackage;
import se.mdh.progresside.proComMetamodel.proSave.Component;
import se.mdh.progresside.proComMetamodel.proSave.CompositeComponent;
import se.mdh.progresside.proComMetamodel.proSave.ProSavePackage;
import se.mdh.progresside.proComMetamodel.proSave.SubcomponentInstance;
import se.mdh.progresside.proComMetamodel.proSave.impl.ComponentImpl;
import se.mdh.progresside.proComMetamodel.util.ProComComponentResourceFactory;
import se.mdh.progresside.remes.RemesPackage;
import UppaalFlat11.UppaalFlat11Package;

/**
 * @author Marin
 *
 */
public class Remes2PtaConverter {
	private static EMFInjector injector;
	private static IExtractor extractor;

	private static IReferenceModel remesMetamodel;
	private static IReferenceModel uppaalMetamodel;
	private static IReferenceModel prosaveMetamodel;

	private static final String remesURI = RemesPackage.eNS_URI; //"http://www.mdh.se/progresside/remes/1.2.0/remes.ecore"; //$NON-NLS-1$
	private static final String prosaveURI = ProSavePackage.eNS_URI;
	private static final String uppaalURI = UppaalFlat11Package.eNS_URI; //"file:/D:/Dokumenti/Faks/PhD/Podaci/uppaal-flat-1_1.xsd"; //$NON-NLS-1$
	
	private static URL asmURL;

	private IArchModel archModel;
	
	static {
		// ATL remes2pta transformation
		Bundle bundle = Platform.getBundle(Remes2PtaAction.BUNDLE_NAME); //$NON-NLS-1$
		asmURL = bundle.getEntry("resources/remes2pta.asm"); //$NON-NLS-1$
		
		try {
			injector = (EMFInjector) CoreService.getInjector("EMF"); //$NON-NLS-1$
			extractor = CoreService.getExtractor("EMF"); //$NON-NLS-1$		
		} catch (ATLCoreException e) {
			e.printStackTrace();
		}
	}
	
	public Remes2PtaConverter(IArchModel model) {
		this.archModel = model;
		
		try {
			// Metamodels 
			ModelFactory factory = CoreService.createModelFactory("EMF"); //$NON-NLS-1$
			remesMetamodel = factory.newReferenceModel();
			uppaalMetamodel = factory.newReferenceModel();
			prosaveMetamodel = factory.newReferenceModel();
			
			injector.inject(remesMetamodel, remesURI);
			injector.inject(uppaalMetamodel, uppaalURI);
			injector.inject(prosaveMetamodel, prosaveURI);
		}
		catch (ATLCoreException e) {
			e.printStackTrace();
		}
	}
	
	public void doConvertArchitecture() {
		//IProComModelManager modelManager = ComponentsPlugin.getDefault().getProComModelManager();
		//IProComElement proComElement = modelManager.getProComElement(archModel.getCorrespondingResource());
		ResourceSet resourceSet = new ResourceSetImpl();
		Resource modelResource = resourceSet.getResource(ProComComponentResourceFactory.getEmfResource(archModel.getCorrespondingResource()).getURI(), true);
		
		for (Object element : modelResource.getContents()) {
			if (element instanceof ComponentImpl) {
				Component c = (Component) element;
				
				System.out.println("Component: " + c.getName()); //$NON-NLS-1$
				
				// TODO: konverzija komponente
				
				IComponent componentResource = getComponentResource(c);
				if(componentResource != null) {
					IBehaviourModel behModel = BehaviourModel.getForComponent(componentResource);	
					doConvertBehaviour(behModel);
				}
				
				if(c.getRealization() instanceof CompositeComponent) {
					CompositeComponent cc = (CompositeComponent) c.getRealization();
					
					EList<SubcomponentInstance>  subComponents = cc.getSubcomponentInst();
					for(SubcomponentInstance subComponent: subComponents){
						System.out.println("SubComponent: " + subComponent.getImplComponent().getName()); //$NON-NLS-1$

						// TODO
						
						IComponent subComponentResource = getComponentResource(subComponent.getImplComponent());
						
						if(subComponentResource != null) {
							IBehaviourModel behModel = BehaviourModel.getForComponent(subComponentResource);
							
							doConvertBehaviour(behModel);
						}
					}
				}
			}
		}
	}
	
	private IComponent getComponentResource(Component c) {
		// Find the enclosing project for that component
		IProComModelManager mgr = ComponentsPlugin.getDefault().getProComModelManager();
		for(IProject project: mgr.getAllProjects(true)) {
			UUID uuid = UUID.fromString(c.getUUID());
			if(mgr.componentExists(project, uuid))
				return mgr.getComponent(project, uuid);
		}
		return null;
	}

	public void doConvertBehaviour(IBehaviourModel behModel) {
		if(!behModel.getCorrespondingResource().exists())
			return;

		ResourceSet resourceSet = new ResourceSetImpl();
		Resource resource = resourceSet.getResource(URI.createFileURI(behModel.getCorrespondingResource().getFullPath().toString()), true);

		IResource componentResource = behModel.getCorrespondingResource();
		IPath path = new Path(componentResource.getName().replace(componentResource.getFileExtension(), "uppaalflat11"));
		IFile file = componentResource.getParent().getFile(path);
		
		try {
			remes2pta(resource, file);
			file.getParent().refreshLocal(IProject.DEPTH_INFINITE, null);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private void remes2pta(Resource inputModel, IFile outputFile) throws Exception {

		// Defaults
		ModelFactory factory = CoreService.createModelFactory("EMF"); //$NON-NLS-1$
		
		// Metamodels 
/*		remesMetamodel = factory.newReferenceModel();
		uppaalMetamodel = factory.newReferenceModel();

		injector.inject(remesMetamodel, remesURI);
		injector.inject(uppaalMetamodel, uppaalURI); 
*/		
		// bundle.getEntry("metamodels/UppaalFlat1_1.ecore").toString());
		
		// Getting launcher
		ILauncher launcher = null;
		launcher = CoreService.getLauncher("EMF-specific VM"); //$NON-NLS-1$
		launcher.initialize(Collections.<String, Object> emptyMap());
		
		// Creating models
		IModel remesModel = factory.newModel(remesMetamodel);
		IModel ptaModel = factory.newModel(uppaalMetamodel);
		
		// Loading existing model
		injector.inject(remesModel, inputModel);
	
		// Launching
		launcher.addInOutModel(remesModel, "IN", "REMES"); //$NON-NLS-1$ //$NON-NLS-2$
		launcher.addInOutModel(ptaModel, "OUT", "UPPAAL"); //$NON-NLS-1$ //$NON-NLS-2$
		launcher.launch(ILauncher.RUN_MODE, new NullProgressMonitor(), Collections
				.<String, Object> emptyMap(), asmURL.openStream());

		extractor.extract(ptaModel, outputFile.getFullPath().toString());

		// Saving model: remesfile + uppaalflat11 file extension
		/*
		String ptaLocation = file.getFullPath().toString().replaceAll(file.getFileExtension(), "uppaalflat11"); //$NON-NLS-1$
		extractor.extract(ptaModel, ptaLocation);
		
		// Refresh workspace
		file.getParent().refreshLocal(IProject.DEPTH_INFINITE, null);
		return file;*/
	}
	
	public void testLoadComponent() {
		ResourceSet resourceSet = new ResourceSetImpl();
		Resource resource = resourceSet.getResource(ProComComponentResourceFactory.getEmfResource(archModel.getCorrespondingResource()).getURI(), true);
		
		CompositeComponent component = (CompositeComponent)resource.getContents().get(0).eContents().get(1);
		EList<SubcomponentInstance>  subComponents = component.getSubcomponentInst();
		for(SubcomponentInstance subComponent: subComponents){
			EObject eObject = (EObject)subComponent.eCrossReferences().get(0);
			System.out.println(eObject);
			Resource otherResource = eObject.eResource();
			System.out.println(subComponent.getImplComponent().getName());
			if(otherResource != null){
				System.out.println(otherResource.getContents());
				//Component comp = (Component)otherResource.getContents().get(0);
			}
			//System.out.println(comp.getName());
		}
	}
}
