package hr.fer.rasip.remes.launcher;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Collections;
import java.util.Iterator;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.m2m.atl.core.ATLCoreException;
import org.eclipse.m2m.atl.core.IExtractor;
import org.eclipse.m2m.atl.core.IInjector;
import org.eclipse.m2m.atl.core.IModel;
import org.eclipse.m2m.atl.core.IReferenceModel;
import org.eclipse.m2m.atl.core.ModelFactory;
import org.eclipse.m2m.atl.core.launch.ILauncher;
import org.eclipse.m2m.atl.core.service.CoreService;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.osgi.framework.Bundle;

import UppaalFlat11.UppaalFlat11Factory;
import se.mdh.progresside.remes.RemesFactory;


public class Remes2PtaAction implements IObjectActionDelegate {

	private static IInjector injector;

	private static IExtractor extractor;

	private static IReferenceModel remesMetamodel;
	private static IReferenceModel uppaalMetamodel;

	private static final String BUNDLE_NAME = "hr.fer.rasip.remes.launcher"; //$NON-NLS-1$

	private static URL asmURL;

	private ISelection currentSelection;

	static {
		// ATL remes2pta transformation

		Bundle bundle = Platform.getBundle(BUNDLE_NAME); //$NON-NLS-1$
		asmURL = bundle.getEntry("resources/remes2pta.asm"); //$NON-NLS-1$
		try {
			injector = CoreService.getInjector("EMF"); //$NON-NLS-1$
			extractor = CoreService.getExtractor("EMF"); //$NON-NLS-1$			
		} catch (ATLCoreException e) {
			e.printStackTrace();
		}
	}
	
	public Remes2PtaAction() {
		super();
	}
	
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
	}
	
	public void run(IAction action) {
		// Getting files from selection
		IStructuredSelection iss = (IStructuredSelection) currentSelection;
		for (Iterator<?> iterator = iss.iterator(); iterator.hasNext();) {
			IFile file = null;
			try {
				file = remes2pta((IFile)iterator.next());
			} catch (Exception e) {
				throw new RuntimeException(e);
			}
			IFile xmlFile = uppaalflat2xml(file);
//			runUppaalCora(xmlFile, "C:\\uppaal-cora-060910");
		}
	}

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
	
	
	public void selectionChanged(IAction action, ISelection selection) {
		this.currentSelection = selection;
	}
}