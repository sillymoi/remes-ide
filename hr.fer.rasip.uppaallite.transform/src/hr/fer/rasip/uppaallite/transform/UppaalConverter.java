package hr.fer.rasip.uppaallite.transform;

import hr.fer.rasip.uppaal.UppaalPackage;
import hr.fer.rasip.uppaallite.UppaallitePackage;

import java.net.URI;
import java.net.URL;
import java.util.Collections;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.filesystem.URIUtil;
import org.eclipse.m2m.atl.core.ATLCoreException;
import org.eclipse.m2m.atl.core.IExtractor;
import org.eclipse.m2m.atl.core.IModel;
import org.eclipse.m2m.atl.core.IReferenceModel;
import org.eclipse.m2m.atl.core.ModelFactory;
import org.eclipse.m2m.atl.core.emf.EMFInjector;
import org.eclipse.m2m.atl.core.launch.ILauncher;
import org.eclipse.m2m.atl.core.service.CoreService;
import org.osgi.framework.Bundle;

public class UppaalConverter {
	private static EMFInjector injector;
	private static IExtractor extractor;

	private static IReferenceModel uppaalflatMetamodel;
	private static IReferenceModel uppaalliteMetamodel;

	private static final String uppaalflatURI = UppaalPackage.eNS_URI;
	private static final String uppaalliteURI = UppaallitePackage.eNS_URI;

	private static URL flatToLiteAsmURL;
	private static URL liteToFlatAsmURL;
	private static URL liteToFlatLibURL;
	private static URL liteToFlatCoraLibURL;
	
	static {
		// ATL remes2pta transformation
		Bundle bundle = Platform.getBundle("hr.fer.rasip.uppaallite.transform"); //$NON-NLS-1$
		flatToLiteAsmURL = bundle.getEntry("transformations/uFlat2uLite.asm"); //$NON-NLS-1$
		liteToFlatAsmURL = bundle.getEntry("transformations/uLite2uFlat.asm"); //$NON-NLS-1$
		liteToFlatLibURL = bundle.getEntry("transformations/uLite2uFlatCostLib.asm"); //$NON-NLS-1$
		liteToFlatCoraLibURL = bundle.getEntry("transformations/uLite2uFlatCoraCostLib.asm"); //$NON-NLS-1$
		
		try {
			injector = (EMFInjector) CoreService.getInjector("EMF"); //$NON-NLS-1$
			extractor = CoreService.getExtractor("EMF"); //$NON-NLS-1$		
			
			// Metamodels 
			ModelFactory factory = CoreService.createModelFactory("EMF"); //$NON-NLS-1$
			uppaalflatMetamodel = factory.newReferenceModel();
			uppaalliteMetamodel = factory.newReferenceModel();
			
			injector.inject(uppaalliteMetamodel, uppaalliteURI);
			injector.inject(uppaalflatMetamodel, uppaalflatURI);
			
		} catch (ATLCoreException e) {
			e.printStackTrace();
		}
	}
	
	public static void transformFlatToLite(IFile uFlatFile, IFile uLiteFile) throws Exception{
		
		ModelFactory factory = CoreService.createModelFactory("EMF"); //$NON-NLS-1$
		
		// Getting launcher
		ILauncher launcher = null;
		launcher = CoreService.getLauncher("EMF-specific VM"); //$NON-NLS-1$
		launcher.initialize(Collections.<String, Object> emptyMap());

		// Creating models
		IModel uppaalflatModel = factory.newModel(uppaalflatMetamodel);
		IModel uppaalliteModel = factory.newModel(uppaalliteMetamodel);

		// Loading existing model
		injector.inject(uppaalflatModel, uFlatFile.getLocationURI().toString());

		// Launching
		launcher.addInOutModel(uppaalflatModel, "IN", "UFLAT"); //$NON-NLS-1$ //$NON-NLS-2$
		launcher.addInOutModel(uppaalliteModel, "OUT", "ULITE"); //$NON-NLS-1$ //$NON-NLS-2$

		launcher.launch(ILauncher.RUN_MODE, new NullProgressMonitor(), Collections
				.<String, Object> emptyMap(), flatToLiteAsmURL.openStream());

		// Saving model
		try {
			extractor.extract(uppaalliteModel, uLiteFile.getLocationURI().toString());
		} catch (ATLCoreException e) {
			e.printStackTrace();
		}
		
		// Refresh workspace
		refreshWorkspace();
	}
	
	public static void transformLiteToFlat(IFile uLiteFile, IFile uFlatFile) throws Exception{
		transformLiteToFlat(uLiteFile, uFlatFile, liteToFlatLibURL);
	}
	
	public static void transformLiteToFlatCora(IFile uLiteFile, IFile uFlatFile) throws Exception{
		transformLiteToFlat(uLiteFile, uFlatFile, liteToFlatCoraLibURL);
	}
	
	private static void transformLiteToFlat(IFile uLiteFile, IFile uFlatFile, URL libURL) throws Exception{
		
		ModelFactory factory = CoreService.createModelFactory("EMF"); //$NON-NLS-1$
		
		// Getting launcher
		ILauncher launcher = null;
		launcher = CoreService.getLauncher("EMF-specific VM"); //$NON-NLS-1$
		launcher.initialize(Collections.<String, Object> emptyMap());

		// Creating models
		IModel uppaalflatModel = factory.newModel(uppaalflatMetamodel);
		IModel uppaalliteModel = factory.newModel(uppaalliteMetamodel);

		// Loading existing model
		injector.inject(uppaalliteModel, uLiteFile.getFullPath().toString());

		// Launching
		launcher.addLibrary("LIB", libURL.openStream());
		launcher.addInOutModel(uppaalliteModel, "IN", "ULITE"); //$NON-NLS-1$ //$NON-NLS-2$
		launcher.addInOutModel(uppaalflatModel, "OUT", "UFLAT"); //$NON-NLS-1$ //$NON-NLS-2$

		launcher.launch(ILauncher.RUN_MODE, new NullProgressMonitor(), Collections
				.<String, Object> emptyMap(), liteToFlatAsmURL.openStream());

		// Saving model
		try {
			extractor.extract(uppaalflatModel, uFlatFile.getLocationURI().toString());
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
