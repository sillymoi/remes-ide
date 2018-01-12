package hr.fer.rasip.remes.datastore.framework.impl;

import hr.fer.rasip.remes.datastore.framework.Activator;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.debug.core.DebugPlugin;
import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationType;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.debug.core.ILaunchManager;
import org.eclipse.emf.common.util.BasicMonitor;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.launching.IJavaLaunchConfigurationConstants;
import org.eclipse.jdt.launching.IRuntimeClasspathEntry;
import org.eclipse.jdt.launching.JavaRuntime;
import org.osgi.framework.Bundle;

/**
 * Utility class for starting HSQLDB tools
 * 
 * @author Fernando Lozano (www.lozano.eti.br)
 * @author Marin Orlic <marin.orlic@fer.hr>
 */

public class HsqldbUtil {

	/**
	 * Creates a list of classpath entries.
	 * @param list
	 */
	protected static List<String> getClasspathEntries() {
		ArrayList<String> cp = new ArrayList<String>();
		
		// Find the bundle
		Bundle hsql = Platform.getBundle("org.hsqldb.core");
		if(hsql != null) {
			try {
				String bundlePath = FileLocator.getBundleFile(hsql).getAbsolutePath();
				cp.add(bundlePath);
			} catch (IOException e) {
				Activator.log(IStatus.ERROR, "Unable to resolve data store server classpath from bundle information", e);
			}
		}
				
		return cp;
	}
	
	/**
	 * Launches a Java class
	 * @param proj Java project
	 * @param name launch name
	 * @param mainClass main class name (qualified)
	 * @param args command-line args
	 * @return launch descriptor
	 * @throws CoreException if launch fails
	 */
	protected static ILaunch launch(IJavaProject proj, String name, String mainClass, String args, IProgressMonitor monitor) throws CoreException {
		
		if(monitor == null)
			monitor = new NullProgressMonitor();
		
		/**
		 * 1 - create configuration
		 * 1 - set classpath
		 * 3 - launch
		 */
		monitor.beginTask("Launching data store server", 5);
		
		ILaunchManager manager = DebugPlugin.getDefault().getLaunchManager();
		ILaunchConfigurationType type = manager.getLaunchConfigurationType(IJavaLaunchConfigurationConstants.ID_JAVA_APPLICATION);
		ILaunchConfiguration config = null;
		// if the configuration already exists, use it!
		ILaunchConfiguration[] configurations = manager.getLaunchConfigurations(type);
		for (int i = 0; i < configurations.length; i++) {
			if (configurations[i].getName().equals(name))
				config = configurations[i];
		}
		// else create a new one
		if (config == null || config != null) { // TODO test ports
			ILaunchConfigurationWorkingCopy wc = type.newInstance(null, name);
			wc.setAttribute(IJavaLaunchConfigurationConstants.ATTR_PROJECT_NAME, proj.getProject().getName());
			// create current directory
			
			IFolder workdir = proj.getProject().getFolder(".data"); // TODO - EXT
			if(!workdir.exists())
				workdir.create(IResource.HIDDEN, true, new NullProgressMonitor());
			
			wc.setAttribute(IJavaLaunchConfigurationConstants.ATTR_WORKING_DIRECTORY, workdir.getLocation().toString());

			// use the suplied args
			wc.setAttribute(IJavaLaunchConfigurationConstants.ATTR_MAIN_TYPE_NAME, mainClass);
			wc.setAttribute(IJavaLaunchConfigurationConstants.ATTR_PROGRAM_ARGUMENTS, args);
			
			monitor.worked(1);
			
			// set classpath
			List<String> classpath = getClasspathEntries();
			ArrayList<String> classpathMementos = new ArrayList<String>();
			
			for (String entry : classpath) {
				IPath path = new Path(entry);
				path = new Path(path.toFile().getAbsolutePath());
				IRuntimeClasspathEntry rcpEntry = JavaRuntime.newArchiveRuntimeClasspathEntry(path);
				//cpEntry.setClasspathProperty(IRuntimeClasspathEntry.ARCHIVE);
				classpathMementos.add(rcpEntry.getMemento());
			}
			
			IPath path = new Path(JavaRuntime.JRE_CONTAINER);
			// Not needed
//				if (!fJREBlock.isDefaultJRE()) {
//					IVMInstall vm = fJREBlock.getJRE();
//					if (vm != null) {
//						path = path.append(vm.getVMInstallType().getId());
//						path = path.append(vm.getName());
//					}
//				}

			try {
				IClasspathEntry cpEntry = JavaCore.newContainerEntry(path);
				// from org.eclipse.jdt.internal.debug.ui.actions.AddLibraryAction run()
				IRuntimeClasspathEntry rcpEntry = JavaRuntime.newRuntimeContainerClasspathEntry(cpEntry.getPath(), IRuntimeClasspathEntry.STANDARD_CLASSES);
				classpathMementos.add(rcpEntry.getMemento());
			} catch (CoreException ex) {
				Activator.log(IStatus.WARNING, "Unable to set launch classpath", ex);
			}
		
			wc.setAttribute(IJavaLaunchConfigurationConstants.ATTR_CLASSPATH, classpathMementos);
			wc.setAttribute(IJavaLaunchConfigurationConstants.ATTR_DEFAULT_CLASSPATH, false);
			
			// Save the new config
			config = wc.doSave();
			
			monitor.worked(1);
		} else {
			monitor.worked(2);
		}
		
		// Launch the configuration
		ILaunch launch = config.launch(ILaunchManager.RUN_MODE, new BasicMonitor.EclipseSubProgress(monitor, 3));
		monitor.done();
	
		return launch;
	}
}
