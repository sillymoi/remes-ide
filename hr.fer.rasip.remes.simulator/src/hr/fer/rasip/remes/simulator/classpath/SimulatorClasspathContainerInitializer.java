package hr.fer.rasip.remes.simulator.classpath;

import hr.fer.rasip.remes.simulator.Activator;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.HashSet;
import java.util.Set;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.jdt.core.ClasspathContainerInitializer;
import org.eclipse.jdt.core.IClasspathContainer;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.osgi.framework.Bundle;
import org.osgi.framework.Constants;

/**
 * Initializes a custom classpath container referencing all libraries required by this plugin and the plugin itself.
 * @author <a href="mailto:marin.orlic@fer.hr">Marin Orlic</a> 
 *
 */
public class SimulatorClasspathContainerInitializer extends	ClasspathContainerInitializer {

	private static class SimulatorContainer implements IClasspathContainer {
		
		private final IClasspathEntry[] fEntries;
		private final IPath fPath;

		public SimulatorContainer(IPath path, IClasspathEntry[] entries) {
			fPath= path;
			fEntries= entries;
		}

		public IClasspathEntry[] getClasspathEntries() {
			return fEntries;
		}

		public String getDescription() {
			return "REMES Simulator";
		}

		public int getKind() {
			return IClasspathContainer.K_APPLICATION;
		}

		public IPath getPath() {
			return fPath;
		}
	}
	
	/**
	 * Default public constructor (required by API).
	 * 
	 * @see org.eclipse.jdt.core.ClasspathContainerInitializer
	 */
	public SimulatorClasspathContainerInitializer() {
		
	}

	/**
	 * Initializes a ClasspathContainer for REMES Simulator.
	 * 
	 * {@inheritDoc}
	 * @see org.eclipse.jdt.core.ClasspathContainerInitializer#initialize(org.eclipse.core.runtime.IPath, org.eclipse.jdt.core.IJavaProject)
	 */
	@Override
	public void initialize(IPath containerPath, IJavaProject project) throws CoreException {
		if (isValidSimulatorContainerPath(containerPath)) {		
			SimulatorContainer container = getNewContainer(containerPath);
			JavaCore.setClasspathContainer(containerPath, new IJavaProject[] { project }, new IClasspathContainer[] { container }, null);
		}
	} 
	
	/** 
	 * Create a new container using arguments within path.
	 * 
	 * @param containerPath
	 * @return 
	 */
	private SimulatorContainer getNewContainer(IPath containerPath) {
		IClasspathEntry entry = null;
		String extra = containerPath.segment(1); // Ignored for now
		
		IClasspathEntry[] entries = getSimulatorClasspathEntries(extra);
		
		return new SimulatorContainer(containerPath, entries);
	}
	
	/**
	 * Checks if a given path is valid for this ClasspathContainer.
	 * The path should have two segments. 
	 * The first part of the path is required to be {@link ISimulatorLaunchConstants#SIMULATOR_CLASSPATH_CONTAINER_ID},
	 * and the second part of the path is not used at the time.
	 * 
	 * @param Classpath container path.
	 * @return true if the classpath container path is valid.
	 */
	private static boolean isValidSimulatorContainerPath(IPath path) {
		return path != null && path.segmentCount() == 2 && Activator.PLUGIN_ID.equals(path.segment(0));
	}

	/**
	 * Creates a REMES simulator classpath entry.
	 * @param list
	 */
	private IClasspathEntry[] getSimulatorClasspathEntries(String extra) {
		Set<IClasspathEntry> entries = new HashSet<IClasspathEntry>();
	
		// Check if we have simulator enabled
		Bundle bundle = Activator.getDefault().getBundle();

		// Add the bundle itself
		IClasspathEntry simulatorCoreEntry = JavaCore.newLibraryEntry(getPathInBundle(bundle, ""), null, null);
		entries.add(simulatorCoreEntry);
		
		String[] libs = getLibraries(bundle);
		
		if (libs != null) {	
			// Load all libraries listen in Bundle-Classpath manifest header
			for(int i=0; i<libs.length; i++) {
				IClasspathEntry libEntry = JavaCore.newLibraryEntry(getPathInBundle(bundle, libs[i]), null, null); //$NON-NLS-1$
				entries.add(libEntry);
			}
		} 
		
		return entries.toArray(new IClasspathEntry[entries.size()]);
	}
	
	private String[] getLibraries(Bundle bundle) {
		if(bundle == null) {
			return null;
		}
		String libs = (String) bundle.getHeaders().get(Constants.BUNDLE_CLASSPATH);
		if(libs == null) {
			return new String[] { "" }; //$NON-NLS-1$
		}
		String[] res = libs.split(",");
		for(int i=0; i<res.length; i++) {
			if(res[i].equals(".")) { // If classpath equals ".", NPE is thrown within API
				res[i] = "";
			}
		}
		return res;
	}
	
	private IPath getPathInBundle(Bundle bundle, String relativePath) {
		if (bundle == null)
			return null;

		URL local = null;
		try {
			local = FileLocator.toFileURL(bundle.getEntry(relativePath));
		} catch (IOException e) {
			return null;
		}
		
		String fullPath = new File(local.getPath()).getAbsolutePath();
		return Path.fromOSString(fullPath);
	}
}
