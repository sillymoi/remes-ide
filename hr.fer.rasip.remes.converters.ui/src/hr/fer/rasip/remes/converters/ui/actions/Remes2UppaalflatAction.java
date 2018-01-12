package hr.fer.rasip.remes.converters.ui.actions;

import hr.fer.rasip.remes.converters.ui.wizards.NewUppaalflatFileFromRemesCreationWizard;


//import java.io.IOException;
//import java.util.Collections;
import java.util.Iterator;

//import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
//import org.eclipse.emf.common.util.EList;
//import org.eclipse.emf.ecore.EObject;
//import org.eclipse.emf.ecore.resource.Resource;
//import org.eclipse.emf.ecore.resource.ResourceSet;
//import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jdt.core.dom.AST;
import org.eclipse.jdt.core.dom.ASTParser;
import org.eclipse.jdt.core.dom.CompilationUnit;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;

//import se.mdh.progresside.proComMetamodel.proSave.Component;
//import se.mdh.progresside.proComMetamodel.proSave.CompositeComponent;
//import se.mdh.progresside.proComMetamodel.proSave.SubcomponentInstance;

import se.mdh.progresside.components.core.IArchModel;
import se.mdh.progresside.components.core.IComponent;
import se.mdh.progresside.components.internal.core.ArchModel;


public class Remes2UppaalflatAction implements IObjectActionDelegate {
	
//	public static final String BUNDLE_NAME = "hr.fer.rasip.remes.launcher"; //$NON-NLS-1$

	private ISelection currentSelection;
	private IWorkbenchPart targetPart;
	
	public Remes2UppaalflatAction() {
		super();
	}
	
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		this.targetPart = targetPart;
	}

	/**
	 * @see IActionDelegate#selectionChanged(IAction, ISelection)
	 */
	public void selectionChanged(IAction action, ISelection selection) {
		this.currentSelection = selection;
	}

	public void run(IAction action) {
		// Getting files from selection
		if(this.currentSelection instanceof IStructuredSelection) {
			IStructuredSelection iss = (IStructuredSelection) currentSelection;
			for (Iterator<?> iterator = iss.iterator(); iterator.hasNext();) {
				Object element = iterator.next();
				if (element instanceof IComponent) {
					IArchModel archModel = ArchModel.getForComponent((IComponent) element);
					Wizard wizard = new NewUppaalflatFileFromRemesCreationWizard(archModel);
					runWizard(wizard);
					try {
						archModel.getProject().refreshLocal(IProject.DEPTH_INFINITE, null);
					} catch (CoreException e) {
						e.printStackTrace();
					}
				}
				else{
				}
			}
		}
	}
	
	private void runWizard(Wizard wizard){
		WizardDialog dialog = new WizardDialog(getShell(), wizard);
		dialog.create();
		dialog.getShell().setSize(Math.max(500, dialog.getShell().getSize().x),
				500);
		dialog.open();
	}

	private Shell getShell() {
		return targetPart.getSite().getShell();
	}
	
/*	private void testLoadComponents(IFile file) {
		ResourceSet resourceSet = new ResourceSetImpl();
		try {
			Resource resource = resourceSet.createResource(org.eclipse.emf.common.util.URI.createFileURI(file.getFullPath().toString()));
			resource.load(Collections.EMPTY_MAP);
			
			CompositeComponent component = (CompositeComponent)resource.getContents().get(0).eContents().get(1);
			EList<SubcomponentInstance>  subComponents = component.getSubcomponentInst();
			for(SubcomponentInstance subComponent: subComponents){
				EObject eObject = (EObject)subComponent.eCrossReferences().get(0);
				System.out.println(eObject);
				Resource otherResource = eObject.eResource();
				System.out.println(subComponent.getImplComponent().getName());
				if(otherResource != null){
					System.out.println(otherResource.getContents());
					Component comp= (Component)otherResource.getContents().get(0);
				}
			}
		}
		catch(IOException ioe) {
			ioe.printStackTrace();
		}
	}

	private void echoSubCompNames(IFile file){
		ResourceSet resourceSet = new ResourceSetImpl();
		Resource resource = resourceSet.getResource(org.eclipse.emf.common.util.URI.createFileURI(file.getFullPath().toString()), true);
		CompositeComponent component = (CompositeComponent)resource.getContents().get(0).eContents().get(1);
		EList<SubcomponentInstance>  subComponents = component.getSubcomponentInst();
		for(SubcomponentInstance subComponent: subComponents){
			EObject eObject = (EObject)subComponent.eCrossReferences().get(0);
			System.out.println(eObject);
			Resource otherResource = eObject.eResource();
			System.out.println(subComponent.getImplComponent().getName());
			if(otherResource != null){
				System.out.println(otherResource.getContents());
				Component comp= (Component)otherResource.getContents().get(0);
			}
			//System.out.println(comp.getName());
		}
	}
	/*
	private IFile remes2pta(IFile file) throws Exception {

		// Defaults
		//Bundle bundle = Platform.getBundle(BUNDLE_NAME); //$NON-NLS-1$
		ModelFactory factory = CoreService.createModelFactory("EMF"); //$NON-NLS-1$
				
		// Get model nsURI
		//String remesURI = RemesFactory.eINSTANCE.getRemesPackage().getNsURI();
		//String uppaalURI = UppaalFlat11Factory.eINSTANCE.getUppaalFlat11Package().getNsURI();
		String remesURI = "http://www.mdh.se/progresside/remes/1.2.0/remes.ecore"; //$NON-NLS-1$
		String uppaalURI = "file:/D:/Dokumenti/Faks/PhD/Podaci/uppaal-flat-1_1.xsd"; //$NON-NLS-1$
		
		// Metamodels 
		remesMetamodel = factory.newReferenceModel();
		uppaalMetamodel = factory.newReferenceModel();

		injector.inject(remesMetamodel, remesURI);
		injector.inject(uppaalMetamodel, uppaalURI); 
		
		// bundle.getEntry("metamodels/UppaalFlat1_1.ecore").toString());
		
		// Getting launcher
		ILauncher launcher = null;
		launcher = CoreService.getLauncher("EMF-specific VM"); //$NON-NLS-1$
		launcher.initialize(Collections.<String, Object> emptyMap());
		
		// Creating models
		IModel remesModel = factory.newModel(remesMetamodel);
		IModel ptaModel = factory.newModel(uppaalMetamodel);
		
		// Loading existing model
		injector.inject(remesModel, file.getFullPath().toString());
		
		// Launching
		launcher.addInOutModel(remesModel, "IN", "REMES"); //$NON-NLS-1$ //$NON-NLS-2$
		launcher.addInOutModel(ptaModel, "OUT", "UPPAAL"); //$NON-NLS-1$ //$NON-NLS-2$
		launcher.launch(ILauncher.RUN_MODE, new NullProgressMonitor(), Collections
				.<String, Object> emptyMap(), asmURL.openStream());
		
		// Saving model: remesfile + uppaalflat11 file extension
		String ptaLocation = file.getFullPath().toString().replaceAll(file.getFileExtension(), "uppaalflat11"); //$NON-NLS-1$
		extractor.extract(ptaModel, ptaLocation);
		
		// Refresh workspace
		file.getParent().refreshLocal(IProject.DEPTH_INFINITE, null);
		return file;
	}
	
	//TODO: implement
	private void runUppaalCora(IFile file, String uppaal){
			URI model = null;
			URI traceURI = null;
			URI realTraceURI = null;
			URI newTraceURI = null;
			IFile traceFile = null;
		try {
			model = new URI(file.getLocationURI().toString());
			traceURI = new URI(file.getLocationURI().toString().replaceAll(file.getName().toString(), file.getName().replaceAll("."+file.getFileExtension(), "")));
			realTraceURI = new URI(file.getLocationURI().toString().replaceAll(file.getName().toString(), file.getName().replaceAll("."+file.getFileExtension(), "-1.xtr")));
			newTraceURI = new URI(file.getLocationURI().toString().replaceAll(file.getName().toString(), file.getName().replaceAll(file.getFileExtension(), "xtr")));

		} catch (URISyntaxException e) {
			e.printStackTrace();
		}
		
		try {
			Runtime.getRuntime().exec(uppaal+"/bin-Win32/verifyta.exe -t 0 -f \""+traceURI.toString().replaceAll("file:/", "").replaceAll("%20", "\\ ")+ "\" C:/uppaal-cora-060910/demo/vrptw.xml C:/uppaal-cora-060910/demo/vrptw.q");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		traceFile = getIFileFromURI(newTraceURI);
		java.io.File input = new java.io.File(realTraceURI);
		
		if(traceFile.exists()){
			try {
				traceFile.delete(true, null);
			} catch (CoreException e) {
				e.printStackTrace();
			}
		}
			
		try {
			traceFile.create(new FileInputStream(input), true, null);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (CoreException e) {
			e.printStackTrace();
		}

	}
	private IFile uppaalflat2xml(IFile file){
		
		IFile xmlFile = null;
		try {
			URI uppalflatURI = new URI(file.getLocationURI().toString().replaceAll(file.getName().toString(), file.getName().replaceAll(file.getFileExtension(), "uppaalflat11")));
			URI xmlURI = new URI(file.getLocationURI().toString().replaceAll(file.getName().toString(), file.getName().replaceAll(file.getFileExtension(), "xml")));

			IFile uppaalFile = getIFileFromURI(uppalflatURI);
			xmlFile = getIFileFromURI(xmlURI);
			java.io.File input = new java.io.File(uppalflatURI);
			if(xmlFile.exists()){
				try {
					xmlFile.delete(true, null);
				} catch (CoreException e) {
					e.printStackTrace();
				}
			}
				
			try {
				xmlFile.create(new FileInputStream(input), true, null);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (CoreException e) {
				e.printStackTrace();
			}
		} catch (URISyntaxException e) {
			e.printStackTrace();
		}
		return xmlFile;
	}
	
	private IFile getIFileFromURI(URI uri){ 
		IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot(); 
		URI rootUri = root.getLocationURI(); 
		uri = rootUri.relativize(uri); 
		IPath path = new Path(uri.getPath()); 
		return root.getFile(path); 
	}
	*/
}