package hr.fer.rasip.uppaallite.transform;

import hr.fer.rasip.uppaallite.UppaallitePackage;

import java.io.IOException;
import java.net.URL;
//import java.net.URI;
import java.util.Collections;


import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.m2m.atl.core.ATLCoreException;
import org.eclipse.m2m.atl.core.IExtractor;
import org.eclipse.m2m.atl.core.IInjector;
import org.eclipse.m2m.atl.core.IModel;
import org.eclipse.m2m.atl.core.IReferenceModel;
import org.eclipse.m2m.atl.core.ModelFactory;
import org.eclipse.m2m.atl.core.emf.EMFInjector;
import org.eclipse.m2m.atl.core.launch.ILauncher;
import org.eclipse.m2m.atl.core.service.CoreService;
import org.osgi.framework.Bundle;

import UppaalFlat11.UppaalFlat11Package;

public class UppaalConverter {
	private static EMFInjector injector;
	private static IExtractor extractor;

	private static IReferenceModel uppaalflatMetamodel;
	private static IReferenceModel uppaalliteMetamodel;


	private static final String uppaalflatURI = UppaalFlat11Package.eNS_URI;
	private static final String uppaalliteURI = UppaallitePackage.eNS_URI;

	private static URL flatToLiteAsmURL;
	private static URL liteToFlatAsmURL;
	
	static {
		// ATL remes2pta transformation
		Bundle bundle = Platform.getBundle("hr.fer.rasip.uppaallite.transform"); //$NON-NLS-1$
		flatToLiteAsmURL = bundle.getEntry("transformations/uFlat2uLite.asm"); //$NON-NLS-1$
		liteToFlatAsmURL = bundle.getEntry("transformations/uLite2uFlat.asm"); //$NON-NLS-1$
		
		try {
			injector = (EMFInjector) CoreService.getInjector("EMF"); //$NON-NLS-1$
			extractor = CoreService.getExtractor("EMF"); //$NON-NLS-1$		
			
			// Metamodels 
			ModelFactory factory = CoreService.createModelFactory("EMF"); //$NON-NLS-1$
			uppaalflatMetamodel = factory.newReferenceModel();
			uppaalliteMetamodel = factory.newReferenceModel();
			
			injector.inject(uppaalflatMetamodel, uppaalflatURI);
			injector.inject(uppaalliteMetamodel, uppaalliteURI);
		} catch (ATLCoreException e) {
			e.printStackTrace();
		}
	}
	
	public static IFile transformFlatToLite(IFile file) throws Exception{
		
		ModelFactory factory = CoreService.createModelFactory("EMF"); //$NON-NLS-1$
		
		// Getting launcher
		ILauncher launcher = null;
		launcher = CoreService.getLauncher("EMF-specific VM"); //$NON-NLS-1$
		launcher.initialize(Collections.<String, Object> emptyMap());

		// Creating models
		IModel uppaalflatModel = factory.newModel(uppaalflatMetamodel);
		IModel uppaalliteModel = factory.newModel(uppaalliteMetamodel);

		// Loading existing model
		injector.inject(uppaalflatModel, file.getFullPath().toString());

		// Launching
		launcher.addInOutModel(uppaalflatModel, "IN", "UFLAT"); //$NON-NLS-1$ //$NON-NLS-2$
		launcher.addInOutModel(uppaalliteModel, "OUT", "ULITE"); //$NON-NLS-1$ //$NON-NLS-2$

		launcher.launch(ILauncher.RUN_MODE, new NullProgressMonitor(), Collections
				.<String, Object> emptyMap(), flatToLiteAsmURL.openStream());

		// Saving model
		String uppaallitePath = file.getFullPath().removeFileExtension().addFileExtension("uppaallite").toString();
		try {
			extractor.extract(uppaalliteModel, uppaallitePath);
		} catch (ATLCoreException e) {
			e.printStackTrace();
		}
		
		// Refresh workspace
		refreshWorkspace();
		
		return getIFileFromURI(java.net.URI.create(uppaallitePath));
	}
	

	public static void transformLiteToFlat(Resource uppaalliteModelResource) throws Exception{
		ModelFactory factory = CoreService.createModelFactory("EMF"); //$NON-NLS-1$
		
		// Getting launcher
		ILauncher launcher = null;
		launcher = CoreService.getLauncher("EMF-specific VM"); //$NON-NLS-1$
		launcher.initialize(Collections.<String, Object> emptyMap());

		// Creating models
		IModel uppaalflatModel = factory.newModel(uppaalflatMetamodel);
		IModel uppaalliteModel = factory.newModel(uppaalliteMetamodel);

		// Loading existing model
		injector.inject(uppaalliteModel, uppaalliteModelResource);

		// Launching
		launcher.addInOutModel(uppaalliteModel, "IN", "ULITE"); //$NON-NLS-1$ //$NON-NLS-2$
		launcher.addInOutModel(uppaalflatModel, "OUT", "UFLAT"); //$NON-NLS-1$ //$NON-NLS-2$

		try {
			launcher.launch(ILauncher.RUN_MODE, new NullProgressMonitor(), Collections
					.<String, Object> emptyMap(), liteToFlatAsmURL.openStream());
		} catch (IOException e1) {
			e1.printStackTrace();
		}

		// Saving model
		String uppaalflatPath = uppaalliteModelResource.getURI().trimFileExtension().appendFileExtension("uppaalflat11").toString().replaceAll("platform:/resource", "");
		String uppaalflatPath2 = "asdf";
		uppaalflatPath2.toString();
		try {
			extractor.extract(uppaalflatModel, uppaalflatPath);
		} catch (ATLCoreException e) {
			e.printStackTrace();
		}
		
		// Refresh workspace
		refreshWorkspace();
	}
	public static void transformLiteToFlat(IFile file) throws Exception{
		
		ModelFactory factory = CoreService.createModelFactory("EMF"); //$NON-NLS-1$
		
		// Getting launcher
		ILauncher launcher = null;
		launcher = CoreService.getLauncher("EMF-specific VM"); //$NON-NLS-1$
		launcher.initialize(Collections.<String, Object> emptyMap());

		// Creating models
		IModel uppaalflatModel = factory.newModel(uppaalflatMetamodel);
		IModel uppaalliteModel = factory.newModel(uppaalliteMetamodel);

		// Loading existing model
		injector.inject(uppaalliteModel, file.getFullPath().toString());

		// Launching
		launcher.addInOutModel(uppaalliteModel, "IN", "ULITE"); //$NON-NLS-1$ //$NON-NLS-2$
		launcher.addInOutModel(uppaalflatModel, "OUT", "UFLAT"); //$NON-NLS-1$ //$NON-NLS-2$

		launcher.launch(ILauncher.RUN_MODE, new NullProgressMonitor(), Collections
				.<String, Object> emptyMap(), liteToFlatAsmURL.openStream());

		// Saving model
		String uppaalflatPath = file.getFullPath().removeFileExtension().addFileExtension("uppaalflat11").toString();
		try {
			extractor.extract(uppaalliteModel, uppaalflatPath);
		} catch (ATLCoreException e) {
			e.printStackTrace();
		}
		
		// Refresh workspace
		refreshWorkspace();
	}
	
	private static IFile getIFileFromURI(java.net.URI uri){ 
		IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot(); 
		java.net.URI rootUri = root.getLocationURI(); 
		uri = rootUri.relativize(uri); 
		IPath path = new Path(uri.getPath()); 
		return root.getFile(path); 
	} 
	
	public static void refreshWorkspace() throws CoreException{
		IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
		root.refreshLocal(IProject.DEPTH_INFINITE, null);
	}

}
