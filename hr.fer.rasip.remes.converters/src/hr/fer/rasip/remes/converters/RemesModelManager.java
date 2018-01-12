package hr.fer.rasip.remes.converters;

import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.UUID;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

import se.mdh.progresside.components.ComponentsPlugin;
import se.mdh.progresside.components.core.IArchModel;
import se.mdh.progresside.components.core.IComponent;
import se.mdh.progresside.components.core.IProComModelManager;
import se.mdh.progresside.proComMetamodel.IdentifiableElement;
import se.mdh.progresside.proComMetamodel.proSave.Component;
import se.mdh.progresside.proComMetamodel.proSave.CompositeComponent;
import se.mdh.progresside.proComMetamodel.proSave.ProSaveSubsystem;
import se.mdh.progresside.proComMetamodel.proSave.SubcomponentInstance;
import se.mdh.progresside.proComMetamodel.proSave.impl.ComponentImpl;
import se.mdh.progresside.proComMetamodel.proSys.CompositeSubsystem;
import se.mdh.progresside.proComMetamodel.proSys.Subsystem;
import se.mdh.progresside.proComMetamodel.proSys.SubsystemInstance;
import se.mdh.progresside.proComMetamodel.proSys.impl.SubsystemImpl;
import se.mdh.progresside.proComMetamodel.util.ProComComponentResourceFactory;
import se.mdh.progresside.remes.RemesDiagram;
import se.mdh.progresside.remes.RemesFactory;
import se.mdh.progresside.remes.attributes.IREMESModel;
import se.mdh.progresside.remes.attributes.impl.REMESModel;

/**
 * Utility class to manipulate REMES models. 
 * @author Marin
 */
public class RemesModelManager {
	
	/**
	 * Creates a composite REMES model from all related models for a composite component.
	 * 
	 * @param archModel corresponding to a composite component.
	 * @param remesFile resulting REMES model file with all modes.
	 */
	public static void createCompositeRemesModel(IFile remesFile, IArchModel archModel){
		ResourceSet resourceSet = new ResourceSetImpl();
		Resource modelResource = resourceSet.getResource(ProComComponentResourceFactory.getEmfResource(archModel.getCorrespondingResource()).getURI(), true);
		Resource resultResource = null;
		if(remesFile == null){ // FIXME use RemedDiagramUtil to create this
			resultResource = resourceSet.createResource(modelResource.getURI().trimSegments(4).appendSegments(new String[]{"system Models", "res.remes"}));
		}
		else{
			resultResource= resourceSet.createResource(URI.createPlatformResourceURI(remesFile.getFullPath().toString(), true));
		}
		for (Object element : modelResource.getContents()) {
			if (element instanceof ComponentImpl) {
				Component c = (Component) element;
				
				if(c.getRealization() instanceof CompositeComponent) {
					CompositeComponent cc = (CompositeComponent) c.getRealization();
					
					EList<SubcomponentInstance>  subComponents = cc.getSubcomponentInst();
					for(SubcomponentInstance subComponent: subComponents){
						
						IComponent subComponentResource = getComponentResource(subComponent.getImplComponent());
						if(subComponentResource != null) {
							IREMESModel behModel = REMESModel.getForComponent(subComponentResource);
							if(subComponents.indexOf(subComponent) == 0){
								Resource subCompResource = resourceSet.getResource(URI.createFileURI(behModel.getCorrespondingResource().getFullPath().toString()), true);
								RemesDiagram diagram = (RemesDiagram)subCompResource.getContents().get(0);
								resultResource.getContents().add(diagram);
								try {
									resultResource.save(null);
								} catch (IOException e) {
									e.printStackTrace();
								}
							}else{
								mergeRemesModels(behModel, resultResource);
							}
						}
					}
				}
			} else if (element instanceof SubsystemImpl) {
				Subsystem s = (Subsystem) element;
				
				if(s.getRealization() instanceof CompositeSubsystem) {
					CompositeSubsystem cs = (CompositeSubsystem) s.getRealization();
					
					EList<SubsystemInstance> internalSubsystems = cs.getInternalSubsystems();
					for(SubsystemInstance subSystem: internalSubsystems){
						
						IComponent subComponentResource = getComponentResource(subSystem.getImplSubsystem());
						if(subComponentResource != null) {
							IREMESModel behModel = REMESModel.getForComponent(subComponentResource);
							if(internalSubsystems.indexOf(subSystem) == 0){
								Resource subCompResource = resourceSet.getResource(URI.createFileURI(behModel.getCorrespondingResource().getFullPath().toString()), true);
								RemesDiagram diagram = (RemesDiagram)subCompResource.getContents().get(0);
								resultResource.getContents().add(diagram);
								try {
									resultResource.save(null);
								} catch (IOException e) {
									e.printStackTrace();
								}
							}else{
								mergeRemesModels(behModel, resultResource);
							}
						}
					}
				} else if (s.getRealization() instanceof ProSaveSubsystem) {
					ProSaveSubsystem proSaveSubsystem = (ProSaveSubsystem) s.getRealization();
					
					EList<SubcomponentInstance> subcomponents = proSaveSubsystem.getSubcomponentInst();
					for(SubcomponentInstance subcomponent: subcomponents){
						
						IComponent subComponentResource = getComponentResource(subcomponent.getImplComponent());
						if(subComponentResource != null) {
							IREMESModel behModel = REMESModel.getForComponent(subComponentResource);
							if(subcomponents.indexOf(subcomponent) == 0){
								Resource subCompResource = resourceSet.getResource(URI.createFileURI(behModel.getCorrespondingResource().getFullPath().toString()), true);
								RemesDiagram diagram = (RemesDiagram)subCompResource.getContents().get(0);
								resultResource.getContents().add(diagram);
								try {
									resultResource.save(null);
								} catch (IOException e) {
									e.printStackTrace();
								}
							}else{
								mergeRemesModels(behModel, resultResource);
							}
						}
					}
				}
			}
		}
	}
	
	/**
	 * Creates a composite REMES model from all related models for a composite component.
	 * 
	 * @param archModel corresponding to a composite component.
	 * @return EObject RemesDiagram with all modes.
	 */
	public static EObject createCompositeRemesModel(IArchModel archModel){
		// Load model
		ResourceSet resourceSet = new ResourceSetImpl();
		Resource modelResource = resourceSet.getResource(ProComComponentResourceFactory.getEmfResource(archModel.getCorrespondingResource()).getURI(), true);
		
		try {
			modelResource.load(Collections.EMPTY_MAP);
		} catch (IOException e) {
			Activator.log(IStatus.ERROR, e.getMessage(), e);
			return null;
		}
	
		RemesDiagram result = RemesFactory.eINSTANCE.createRemesDiagram();
		
		for (Object element : modelResource.getContents()) {
			if (element instanceof ComponentImpl) {
				Component c = (Component) element;
				
				if(c.getRealization() instanceof CompositeComponent) {
					CompositeComponent cc = (CompositeComponent) c.getRealization();
					
					EList<SubcomponentInstance>  subComponents = cc.getSubcomponentInst();
					for(SubcomponentInstance subComponent: subComponents){
						
						IComponent subComponentResource = getComponentResource(subComponent.getImplComponent());
						if(subComponentResource != null) {
							IREMESModel behModel = REMESModel.getForComponent(subComponentResource);
							mergeRemesModels(behModel, result);
						}
					}
				}
			} else if (element instanceof SubsystemImpl) {
				Subsystem s = (Subsystem) element;
				
				if(s.getRealization() instanceof CompositeSubsystem) {
					CompositeSubsystem cs = (CompositeSubsystem) s.getRealization();
					
					EList<SubsystemInstance> internalSubsystems = cs.getInternalSubsystems();
					for(SubsystemInstance subSystem: internalSubsystems){
						
						IComponent subComponentResource = getComponentResource(subSystem.getImplSubsystem());
						if(subComponentResource != null) {
							IREMESModel behModel = REMESModel.getForComponent(subComponentResource);
							mergeRemesModels(behModel, result);
						}
					}
				}
			}
		}
		
		return result;
	}
	
	/**
	 * Merges REMES diagrams - adds all modes from a IREMESModel to RemesDiagram.
	 * 
	 * @param componentBehModel referencing the REMES model
	 * @param result diagram to add the modes to.
	 */
	public static void mergeRemesModels(IREMESModel componentBehModel, RemesDiagram result){			
		if(result != null){
			ResourceSet resourceSet = new ResourceSetImpl();
			Resource subCompResource = resourceSet.getResource(URI.createFileURI(componentBehModel.getCorrespondingResource().getFullPath().toString()), true);
			RemesDiagram diagram = (RemesDiagram)subCompResource.getContents().get(0);
			result.getModes().addAll(EcoreUtil.copyAll(diagram.getModes()));
		}	
	}

	/**
	 * Merges REMES diagrams - adds all modes from a IREMESModel to EMF Resource.
	 * 
	 * @param componentBehModel referencing the REMES model
	 * @param resultResource resource to add the modes to.
	 */
	public static void mergeRemesModels(IREMESModel componentBehModel, Resource resultResource){
		if(resultResource != null){
			RemesDiagram diagramResult = (RemesDiagram)resultResource.getContents().get(0);
	
			mergeRemesModels(componentBehModel, diagramResult);
			resultResource.getContents().set(0, diagramResult);
			try {
				resultResource.save(null);
			} catch (IOException e) {
				Activator.log(IStatus.ERROR, e.getMessage(), e);
			}
		}	
	}
	
	/**
	 * Loads a RemesDiagram from a file.
	 * 
	 * @param remesFile containing the model resource.
	 * @return model EObject.
	 */
	public static EObject getRemesModel(IFile remesFile) {
		ResourceSet resourceSet = new ResourceSetImpl();
		Resource model = resourceSet.createResource(URI.createPlatformResourceURI(remesFile.getFullPath().toString(), true));

		try {
			model.load(Collections.EMPTY_MAP);
			if (model.getContents().isEmpty()) {
				return null;
			}
			
			for (Iterator<EObject> it = model.getAllContents(); it.hasNext();) {
				EObject obj = it.next();
	
				if (obj instanceof RemesDiagram) {
					return obj;
				}
			}
			return null;
			
		} catch (IOException e) {
			Activator.log(IStatus.ERROR, e.getMessage(), e);
		}
	
		return null;
	}
	
	/**
	 * Retrieves the IComponent from the Component reference.
	 * 
	 * @param c component to find in the workspace.
	 * @return IComponent corresponding to the Component.
	 */
	private static IComponent getComponentResource(IdentifiableElement element) {
		// Find the enclosing project for that component
		IProComModelManager mgr = ComponentsPlugin.getDefault().getProComModelManager();
		for(IProject project: mgr.getAllProjects(true)) {
			UUID uuid = UUID.fromString(element.getUUID());
			if(mgr.componentExists(project, uuid))
				return mgr.getComponent(project, uuid);
		}
		return null;
	}

}
