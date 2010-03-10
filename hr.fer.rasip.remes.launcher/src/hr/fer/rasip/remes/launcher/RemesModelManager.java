package hr.fer.rasip.remes.launcher;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.UUID;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.*;
import org.eclipse.emf.edit.tree.TreeFactory;
import org.eclipse.emf.edit.tree.TreeNode;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

import se.mdh.progresside.behaviours.core.IBehaviourModel;
import se.mdh.progresside.behaviours.internal.core.BehaviourModel;
import se.mdh.progresside.components.ComponentsPlugin;
import se.mdh.progresside.components.core.IArchModel;
import se.mdh.progresside.components.core.IComponent;
import se.mdh.progresside.components.core.IProComModelManager;
import se.mdh.progresside.proComMetamodel.proSave.Component;
import se.mdh.progresside.proComMetamodel.proSave.CompositeComponent;
import se.mdh.progresside.proComMetamodel.proSave.SubcomponentInstance;
import se.mdh.progresside.proComMetamodel.proSave.impl.ComponentImpl;
import se.mdh.progresside.proComMetamodel.util.ProComComponentResourceFactory;
import se.mdh.progresside.remes.RemesDiagram;

public class RemesModelManager {
	private IArchModel archModel;
	
	public RemesModelManager(IArchModel model) {
		this.archModel = model;
	}
	
	public void createCompositeRemesModel(){
		ResourceSet resourceSet = new ResourceSetImpl();
		Resource modelResource = resourceSet.getResource(ProComComponentResourceFactory.getEmfResource(archModel.getCorrespondingResource()).getURI(), true);
		
		Resource resultResource = resourceSet.createResource(modelResource.getURI().trimSegments(4).appendSegments(new String[]{"system Models", "res.remes"}));

		for (Object element : modelResource.getContents()) {
			if (element instanceof ComponentImpl) {
				Component c = (Component) element;
				
				if(c.getRealization() instanceof CompositeComponent) {
					CompositeComponent cc = (CompositeComponent) c.getRealization();
					
					EList<SubcomponentInstance>  subComponents = cc.getSubcomponentInst();
					for(SubcomponentInstance subComponent: subComponents){
						
						IComponent subComponentResource = getComponentResource(subComponent.getImplComponent());
						if(subComponentResource != null) {
							IBehaviourModel behModel = BehaviourModel.getForComponent(subComponentResource);
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
			}
		}
	}
	
	public void mergeRemesModels(IBehaviourModel componentBehModel, Resource resultResource){
			if(resultResource != null){

				ResourceSet resourceSet = new ResourceSetImpl();
				RemesDiagram diagramResult = (RemesDiagram)resultResource.getContents().get(0);
				Resource subCompResource = resourceSet.getResource(URI.createFileURI(componentBehModel.getCorrespondingResource().getFullPath().toString()), true);
				RemesDiagram diagram = (RemesDiagram)subCompResource.getContents().get(0);
				diagramResult.getModes().addAll(diagram.getModes());
				resultResource.getContents().set(0, diagramResult);
				try {
					resultResource.save(null);
				} catch (IOException e) {
					e.printStackTrace();
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

}
