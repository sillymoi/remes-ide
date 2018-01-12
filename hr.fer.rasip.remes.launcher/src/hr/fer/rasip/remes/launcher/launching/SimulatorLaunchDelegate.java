package hr.fer.rasip.remes.launcher.launching;

import hr.fer.rasip.remes.converters.Remes2JavaConverter;
import hr.fer.rasip.remes.launcher.Activator;
import hr.fer.rasip.remes.simulator.debug.core.model.SimulatorDebugTarget;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.IncrementalProjectBuilder;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchManager;
import org.eclipse.debug.core.model.IDebugTarget;
import org.eclipse.emf.common.util.BasicMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IPackageFragmentRoot;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.launching.AbstractJavaLaunchConfigurationDelegate;
import org.eclipse.jdt.launching.ExecutionArguments;
import org.eclipse.jdt.launching.IVMRunner;
import org.eclipse.jdt.launching.JavaLaunchDelegate;
import org.eclipse.jdt.launching.JavaRuntime;
import org.eclipse.jdt.launching.VMRunnerConfiguration;

import se.mdh.progresside.remes.Mode;
import se.mdh.progresside.remes.RemesDiagram;

import com.ibm.icu.text.MessageFormat;

/** 
 * Copied from {@link org.eclipse.jdt.launching.JavaLaunchDelegate}, messages replaced with plain strings.
 * {@inheritDoc}
 * @see JavaLaunchDelegate
 */
public class SimulatorLaunchDelegate extends AbstractJavaLaunchConfigurationDelegate {

	/**
	 * Overriden to allow launching on non-Java projects.
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.jdt.launching.AbstractJavaLaunchConfigurationDelegate#preLaunchCheck(org.eclipse.debug.core.ILaunchConfiguration,
	 *      java.lang.String, org.eclipse.core.runtime.IProgressMonitor)
	 * @see org.eclipse.debug.core.model.ILaunchConfigurationDelegate2#preLaunchCheck(org.eclipse.debug.core.ILaunchConfiguration,
	 *      java.lang.String, org.eclipse.core.runtime.IProgressMonitor)
	 */
	public boolean preLaunchCheck(ILaunchConfiguration configuration,
			String mode, IProgressMonitor monitor) throws CoreException {
		// Get Java project
		IJavaProject javaProject = getJavaProject(configuration);
		if (javaProject != null) {
			return super.preLaunchCheck(configuration, mode, monitor);
		}
		// If Java project setup failed, abort launch
		return false; 
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.debug.core.model.ILaunchConfigurationDelegate#launch(org.eclipse.debug.core.ILaunchConfiguration, java.lang.String, org.eclipse.debug.core.ILaunch, org.eclipse.core.runtime.IProgressMonitor)
	 */
	public void launch(ILaunchConfiguration configuration, String mode, ILaunch launch, IProgressMonitor monitor) throws CoreException {
		
		if (monitor == null) {
			monitor = new NullProgressMonitor();
		}
		
		// Start monitor
		// load configuration    - 1
		// create simulator code - 2
		// refresh               - 1
		// build                 - 2
		// run java vm           - 2
		monitor.beginTask(MessageFormat.format("{0}...", new String[]{configuration.getName()}), 8); //$NON-NLS-1$
		// check for cancellation
		if (monitor.isCanceled()) {
			return;
		}
	
		try {
			// Workspace
			IWorkspaceRoot wsRoot = ResourcesPlugin.getWorkspace().getRoot();

			// Get project
			IProject project = getProject(configuration, wsRoot);

			// Get Java project
			IJavaProject jpr = getJavaProject(configuration);
			if(jpr == null) {
				return; // Misconfiguration
			}
			
			// Get profile model file name
			IFile profile = getProfileFile(configuration);

			// Get package name
			String packageName = getPackageName(configuration);
			
			// Get main type name
			String mainTypeName = getMainTypeName(configuration, project); 
			
			// Finish configuration
			monitor.worked(1);
			
			// Generate simulator classes
			IStatus result = createSimulatorCode(configuration, packageName, mainTypeName, profile, project, jpr, new BasicMonitor.EclipseSubProgress(monitor, 2));
			
			if(!result.isOK()) {
				return; //FIXME log
			}
				
			// Check for cancellation
 			if (monitor.isCanceled()) {
				return;
			}	
			
			// Refresh project
			project.refreshLocal(IProject.DEPTH_INFINITE, new BasicMonitor.EclipseSubProgress(monitor, 1));
			
			// Force build
			ResourcesPlugin.getWorkspace().build(IncrementalProjectBuilder.INCREMENTAL_BUILD, new BasicMonitor.EclipseSubProgress(monitor, 2));

			// check for cancellation
			if (monitor.isCanceled()) {
				return;
			}	
						
			// Add simulator debug args if needed
			String additionalArgs = "";
			if (mode.equals(ILaunchManager.DEBUG_MODE)) {
				additionalArgs = "-debug -requestPort 7367 -eventPort 7368"; // TODO - make these preferences
			}
			
			// Run Java
			startJavaVM(configuration, mode, launch, packageName, mainTypeName, additionalArgs, new BasicMonitor.EclipseSubProgress(monitor, 2));

			// Add simulator debug target 
			if (mode.equals(ILaunchManager.DEBUG_MODE)) {
				IDebugTarget target = new SimulatorDebugTarget(launch, "localhost", 7367, 7368); //TODO
				launch.addDebugTarget(target);
			}

		} 
		finally {
			monitor.done();
		}
	}

	/**
	 * @param configuration
	 * @param packageName
	 * @param profile
	 * @param project
	 * @param jpr
	 * @param monitor
	 * @return
	 * @throws CoreException
	 * @throws JavaModelException
	 */
	protected IStatus createSimulatorCode(ILaunchConfiguration configuration,	String packageName, String mainTypeName, IFile profile, IProject project, IJavaProject jpr, IProgressMonitor monitor) throws CoreException, JavaModelException {
		// Get model file name
		String modelFileName = getModelFileName(configuration);

		// Find model file			
		IResource res = jpr.getProject().getWorkspace().getRoot().findMember(modelFileName);
		if (!(res instanceof IFile)) {
			return new Status(IStatus.ERROR, Activator.PLUGIN_ID, "Behavior to launch is not specified."); 
		}
		IFile file = (IFile) res;			

		// Add src-gen to source folders and classpath					
		IFolder srcgen = configureSourceFolder(jpr, 
				project.getFolder(ISimulatorLaunchConstants.GENERATED_SOURCE_FOLDER),
				project.getFolder(ISimulatorLaunchConstants.GENERATED_BINARY_FOLDER));
						
		// Prepare REMES-specific connection information
		String externalConnections = createREMESConnections(file);
		
		// Generate java files
		IStatus result = Remes2JavaConverter.remes2java(new BasicMonitor.EclipseSubProgress(monitor, 4), file, profile, srcgen, mainTypeName, packageName, externalConnections);
		return result;
	}

	/**
	 * Reads the model file name from the configuration.
	 * 
	 * @param configuration launch configuration.
	 * @return model file name (empty string if there is no model file name).
	 * @throws CoreException if the model file name attribute in the configuration is not a string value.
	 * @see ILaunchConfiguration#getAttribute(String, String)
	 */
	protected String getModelFileName(ILaunchConfiguration configuration) throws CoreException {
		String modelFileName = configuration.getAttribute(ISimulatorLaunchConstants.REMES_FILE_NAME_ATTR, "");
		return modelFileName;
	}
	
	/**
	 * Figures out the type name for the main class for the behavior.
	 * 
	 * @param component to run in simulator.
	 * @return main type name (file name + 'Simulator')
	 * @throws CoreException if the model file name is not configured properly.
	 */
	protected String getMainTypeName(ILaunchConfiguration configuration, IProject project) throws CoreException {
		// Get the model file name
		String modelFileName = getModelFileName(configuration);
		
		// Find model resource
		IResource res = project.getWorkspace().getRoot().findMember(modelFileName);
		
		// Create name (with lots of strings)
		String name = res.getName();
		String nameNoExt = name.substring(0, name.length()-res.getFileExtension().length()-1);
		
		if(nameNoExt.length() > 1) {
			String first = nameNoExt.substring(0, 1).toUpperCase();
			String last = nameNoExt.substring(1).toLowerCase();
			nameNoExt = first.concat(last);
		} else {
			nameNoExt = nameNoExt.toUpperCase();
		}
		
		return nameNoExt.concat(ISimulatorLaunchConstants.SIMULATOR_CLASS_SUFFIX); 
	}

	/**
	 * @param configuration
	 * @param wsRoot
	 * @param profile
	 * @return
	 * @throws CoreException
	 */
	protected IFile getProfileFile(ILaunchConfiguration configuration) throws CoreException {
		// Get profile file name from configuration
		String profileFileName = getProfileFileName(configuration);

		if (!profileFileName.isEmpty()) {
			// Find profile
			IResource resProfile = ResourcesPlugin.getWorkspace().getRoot().findMember(profileFileName);

			// Check if profile path is correct
			if (!(resProfile instanceof IFile)) {
				return null;
			}

			return (IFile) resProfile;
		}
		return null;
	}

	/**
	 * @param configuration
	 * @return
	 * @throws CoreException
	 */
	protected String getProfileFileName(ILaunchConfiguration configuration) throws CoreException {
		String profileFileName = configuration.getAttribute(ISimulatorLaunchConstants.PROFILE_FILE_NAME_ATTR, "");
		return profileFileName;
	}

	/**
	 * @param monitor
	 * @param componentFolder
	 * @param javaProject
	 * @param projectRelativePath
	 * @return
	 * @throws CoreException
	 * @throws JavaModelException
	 */
	protected IFolder configureSourceFolder(IJavaProject javaProject, IFolder sourceFolder, IFolder outputFolder) throws CoreException, JavaModelException {
		// Configure Java project, add component source folders and classpath
		if(!sourceFolder.exists())
			sourceFolder.create(false, true, null);
		if(!outputFolder.exists())
			outputFolder.create(false, true, null);
		
		// Create classpath entry for source
		ArrayList<IClasspathEntry> cpEntries = new ArrayList<IClasspathEntry>(); 
		
		IPackageFragmentRoot source = javaProject.getPackageFragmentRoot(sourceFolder);
		IPackageFragmentRoot output = javaProject.getPackageFragmentRoot(outputFolder);
		cpEntries.add(JavaCore.newSourceEntry(source.getPath(), new IPath[] {}, output.getPath()));

		// Add classpath
		javaProject.setRawClasspath(mergeClasspathEntries(javaProject.getRawClasspath(), cpEntries), new NullProgressMonitor()); // worked(1)
		return sourceFolder;
	}
	
	/**
	 * @param configuration
	 * @param wsRoot
	 * @return
	 * @throws CoreException
	 */
	protected IProject getProject(ILaunchConfiguration configuration, IWorkspaceRoot wsRoot) throws CoreException {
		String projectName = getJavaProjectName(configuration);
		if(projectName.isEmpty()) {
			return null;
		}
		
		// Get project from the workspace
		IProject project = wsRoot.getProject(projectName);
		if(!project.exists()) {
			return null;
		}
		
		return project;
	}
	
	protected String createREMESConnections(IFile remesFile) {
		// Init output
		StringBuilder sb = new StringBuilder();
		
		// Load model
		URI remesURI = URI.createPlatformResourceURI(remesFile.getFullPath().toString(), true);
		ResourceSet resourceSet = new ResourceSetImpl();
		Resource emf = resourceSet.createResource(remesURI);
	
		try {
			emf.load(Collections.EMPTY_MAP);
			if (!emf.getContents().isEmpty()) {
				for (Iterator<EObject> it = emf.getAllContents(); it.hasNext();) {
					EObject obj = it.next();
		
					// Find Remes diagram
					if (obj instanceof RemesDiagram) {
						RemesDiagram diag = (RemesDiagram) obj;

						// Wire all top-level modes
						for(Mode mode : diag.getModes()) {
							// Create transitions
							String modeName = "mode" + mode.getName();
							sb.append(modeName).append(".addTransition(new Transition(");
							sb.append(modeName).append(", ").append(modeName).append(") {\n");
							sb.append("public String getObjectId() {\n");
							sb.append("\treturn \"").append(Remes2JavaConverter.getXmiId(mode)).append("\";\n");
							sb.append("}\n}\n");
							sb.append(");\n");
						}
						
						break; // Finished, handle just one diagram
					}
				}	
			}
		} catch (IOException e) {
			Activator.log(IStatus.ERROR, e.getMessage(), e);
		}

		return sb.toString();
	}

	/**
	 * @param configuration
	 * @return
	 * @throws CoreException
	 */
	protected String getPackageName(ILaunchConfiguration configuration)
			throws CoreException {
		String packageName = configuration.getAttribute(ISimulatorLaunchConstants.PACKAGE_NAME_ATTR, ISimulatorLaunchConstants.DEFAULT_PACKAGE_NAME);
		return packageName;
	}
	
	protected IClasspathEntry getSimulatorCoreClasspath() {
		IClasspathEntry container = JavaCore.newContainerEntry(getSimulatorCorePath());
		
		return container;
	}

	/**
	 * @return
	 */
	private Path getSimulatorCorePath() {
		return new Path(ISimulatorLaunchConstants.SIMULATOR_CLASSPATH_CONTAINER_PATH);
	}

	protected IClasspathEntry[] mergeClasspathEntries(IClasspathEntry[] oldCp, ArrayList<IClasspathEntry> newCp) {
		ArrayList<IClasspathEntry> list = new ArrayList<IClasspathEntry>();
		
		// Copy all existing classpath entries
		for(int i=0; i<oldCp.length; i++) {
			list.add(oldCp[i]);
		}
		
		// Merge new items
		for (IClasspathEntry cp : newCp) {
			boolean equal = false;
			for(int i=0; i<oldCp.length; i++) {
				if(oldCp[i].getPath().equals(cp.getPath())) {
					equal = true;
					break;
				}
			}
			if(!equal) {
				list.add(cp);
			}
		}

		return list.toArray(new IClasspathEntry[list.size()]);
	}
	
	/**
	 * Overriden to allow the launch to add Java nature to the project and initialize it.
	 * {@inheritDoc}
	 * @see org.eclipse.jdt.launching.AbstractJavaLaunchConfigurationDelegate#getJavaProject(org.eclipse.debug.core.ILaunchConfiguration)
	 */
	@Override
	public IJavaProject getJavaProject(ILaunchConfiguration configuration) throws CoreException {
		IJavaProject javaProject = null;
		javaProject = super.getJavaProject(configuration);
		if (javaProject == null) {
			// Need to configure the project
			String projectName = getJavaProjectName(configuration);
			if(projectName != null) {
				projectName = projectName.trim();
				if (projectName.length() > 0) {
					IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject(projectName);
				
					// Configure project
					if(!project.hasNature(JavaCore.NATURE_ID)) {
						// Add Java nature
						IProjectDescription description = project.getDescription();
						
						String[] natures = description.getNatureIds();
						String[] newNatures = new String[natures.length + 1];
						System.arraycopy(natures, 0, newNatures, 0, natures.length);
						newNatures[natures.length] = JavaCore.NATURE_ID;
						
						description.setNatureIds(newNatures);
						project.setDescription(description, null);
		
						// Create Java project
						javaProject = JavaCore.create(project); 
		
						// Set classpath
						List<IClasspathEntry> entries = new ArrayList<IClasspathEntry>();
//						IVMInstall vmInstall = JavaRuntime.getDefaultVMInstall();

						// Add JRE libraries
						entries.add(JavaCore.newContainerEntry(new Path(JavaRuntime.JRE_CONTAINER)));
						
						// Add simulator libraries
						entries.add(getSimulatorCoreClasspath());
						
						// Add libs to project class path
						javaProject.setRawClasspath(entries.toArray(new IClasspathEntry[entries.size()]), null);	
					}
				}
			}
		}
		
		// Check & add simulator classpath
		IClasspathEntry[] cp = javaProject.getRawClasspath();
		IPath simlibs = getSimulatorCorePath();
		boolean found = false;
		
		for (int i = 0; i < cp.length; i++) {
			if(cp[i].getPath().equals(simlibs)) {
				found = true;
				break;
			}
		}
		
		if(!found) {
			IClasspathEntry[] newCp = new IClasspathEntry[cp.length + 1];
			System.arraycopy(cp, 0, newCp, 0, cp.length);
			newCp[cp.length] = getSimulatorCoreClasspath();
			javaProject.setRawClasspath(newCp, null);
		}
		
		return javaProject;
	}

	/**
	 * Starts the Java VM to launch the main simulator class.
	 * 
	 * @param configuration launch configuration with the launch parameters.
	 * @param mode launch mode to start in (run/debug).
	 * @param launch launch instance.
	 * @param monitor ProcessMonitor to notify progress.
	 * @param packageName package name for the main class.
	 * @param mainTypeName main class (excluding package).
	 * @throws CoreException passed on from JavaTools.
	 */
	protected void startJavaVM(ILaunchConfiguration configuration, String mode, ILaunch launch, String packageName, String mainTypeName, String additionalArgs, IProgressMonitor monitor) throws CoreException {
		monitor.beginTask("Starting Java VM...", 5);
		
		// Check for cancellation
		if (monitor.isCanceled()) {
			return;
		}	

		monitor.subTask("Verifying launch attributes..."); 
						
//		String mainTypeName = verifyMainTypeName(configuration);
		// Figure out the main type name
		String mainType = packageName + "." + mainTypeName;
		
		IVMRunner runner = getVMRunner(configuration, mode);

		// Get working dir for VM
		File workingDir = verifyWorkingDirectory(configuration);
		String workingDirName = null;
		if (workingDir != null) {
			workingDirName = workingDir.getAbsolutePath();
		}
		
		// Environment variables
		String[] envp= getEnvironment(configuration);
		
		// Program & VM arguments
		String pgmArgs = getProgramArguments(configuration);
		String vmArgs = getVMArguments(configuration);
		ExecutionArguments execArgs = new ExecutionArguments(vmArgs, pgmArgs + " " + additionalArgs);
		
		// VM-specific attributes
		Map vmAttributesMap = getVMSpecificAttributesMap(configuration);
		
		// Classpath
		String[] classpath = getClasspath(configuration);
		
		// Create VM config
		VMRunnerConfiguration runConfig = new VMRunnerConfiguration(mainType, classpath);
		runConfig.setProgramArguments(execArgs.getProgramArgumentsArray());
		runConfig.setEnvironment(envp);
		runConfig.setVMArguments(execArgs.getVMArgumentsArray());
		runConfig.setWorkingDirectory(workingDirName);
		runConfig.setVMSpecificAttributesMap(vmAttributesMap);

		// Bootpath
		runConfig.setBootClassPath(getBootpath(configuration));
		
		// check for cancellation
		if (monitor.isCanceled()) {
			return;
		}		
		
		// stop in main
		prepareStopInMain(configuration);
		
		// done the verification phase
		monitor.worked(1);
		
		monitor.subTask("Creating source locator..."); 
		// set the default source locator if required
		setDefaultSourceLocator(launch, configuration);
		monitor.worked(2);		
		
		// check for cancellation
		if (monitor.isCanceled()) {
			return;
		}
		
		// Launch the configuration - 1 unit of work
		runner.run(runConfig, launch, monitor);
		monitor.worked(2);
		
		// Finish
		monitor.done();
	}
}