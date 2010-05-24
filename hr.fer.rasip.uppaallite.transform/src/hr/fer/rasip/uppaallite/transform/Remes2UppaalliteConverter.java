package hr.fer.rasip.uppaallite.transform;


import hr.fer.rasip.uppaallite.UppaallitePackage;
import se.mdh.progresside.remes.RemesPackage;

import java.net.URL;
import java.util.Collections;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Platform;
import org.eclipse.m2m.atl.core.ATLCoreException;
import org.eclipse.m2m.atl.core.IExtractor;
import org.eclipse.m2m.atl.core.IModel;
import org.eclipse.m2m.atl.core.IReferenceModel;
import org.eclipse.m2m.atl.core.ModelFactory;
import org.eclipse.m2m.atl.core.emf.EMFInjector;
import org.eclipse.m2m.atl.core.launch.ILauncher;
import org.eclipse.m2m.atl.core.service.CoreService;
import org.osgi.framework.Bundle;

public class Remes2UppaalliteConverter{
	private static EMFInjector injector;
	private static IExtractor extractor;
	
	private static IReferenceModel remesMetamodel;
	private static IReferenceModel uppaalliteMetamodel;
	
	private static final String remesURI = RemesPackage.eNS_URI;
	private static final String uppaalliteURI = UppaallitePackage.eNS_URI;
	
	private static URL asmURL;
	
	static {
		// ATL remes2pta transformation
		Bundle bundle = Platform.getBundle("hr.fer.rasip.uppaallite.transform"); //$NON-NLS-1$
		asmURL = bundle.getEntry("transformations/simpleRemes2ulite.asm"); //$NON-NLS-1$
		
		try {
			injector = (EMFInjector) CoreService.getInjector("EMF"); //$NON-NLS-1$
			extractor = CoreService.getExtractor("EMF"); //$NON-NLS-1$		
			
			// Metamodels 
			ModelFactory factory = CoreService.createModelFactory("EMF"); //$NON-NLS-1$
			remesMetamodel = factory.newReferenceModel();
			uppaalliteMetamodel = factory.newReferenceModel();
			
			injector.inject(remesMetamodel, remesURI);
			injector.inject(uppaalliteMetamodel, uppaalliteURI);
		} catch (ATLCoreException e) {
			e.printStackTrace();
		}
	}
	
	public static void transformRemes2Uppaallite(IFile remesFile, IFile uppaalliteFile) throws Exception{
		
		ModelFactory factory = CoreService.createModelFactory("EMF"); //$NON-NLS-1$
		
		// Getting launcher
		ILauncher launcher = null;
		launcher = CoreService.getLauncher("EMF-specific VM"); //$NON-NLS-1$
		launcher.initialize(Collections.<String, Object> emptyMap());
	
		// Creating models
		IModel remesModel = factory.newModel(remesMetamodel);
		IModel uppaalliteModel = factory.newModel(uppaalliteMetamodel);
	
		// Loading existing model
		injector.inject(remesModel, remesFile.getLocationURI().toString());
	
		// Launching
		launcher.addInOutModel(remesModel, "IN", "REMES"); //$NON-NLS-1$ //$NON-NLS-2$
		launcher.addInOutModel(uppaalliteModel, "OUT", "ULITE"); //$NON-NLS-1$ //$NON-NLS-2$
	
		launcher.launch(ILauncher.RUN_MODE, new NullProgressMonitor(), Collections
				.<String, Object> emptyMap(), asmURL.openStream());
	
		// Saving model
		try {
			extractor.extract(uppaalliteModel,uppaalliteFile.getLocationURI().toString());
		} catch (ATLCoreException e) {
			e.printStackTrace();
		}
		
		// Refresh workspace
		refreshWorkspace();
		
	}
	
	public static void refreshWorkspace() throws CoreException{
		IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
		root.refreshLocal(IProject.DEPTH_INFINITE, null);
	}
}