package hr.fer.rasip.remes.launcher.component.launching;

import hr.fer.rasip.remes.converters.Activator;
import hr.fer.rasip.remes.converters.Remes2JavaConverter;
import hr.fer.rasip.remes.converters.RemesModelManager;
import hr.fer.rasip.remes.launcher.launching.SimulatorLaunchDelegate;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.emf.common.util.BasicMonitor;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.launching.JavaLaunchDelegate;

import se.mdh.progresside.components.ComponentsPlugin;
import se.mdh.progresside.components.core.IArchModel;
import se.mdh.progresside.components.core.IComponent;
import se.mdh.progresside.components.core.IProComModelManager;
import se.mdh.progresside.components.core.IComponent.ComponentRealizationType;
import se.mdh.progresside.components.internal.core.ArchModel;
import se.mdh.progresside.components.internal.core.ProComModelManager;
import se.mdh.progresside.proComMetamodel.proSave.Component;
import se.mdh.progresside.proComMetamodel.proSave.CompositeComponent;
import se.mdh.progresside.proComMetamodel.proSave.Connection;
import se.mdh.progresside.proComMetamodel.proSave.DataPort;
import se.mdh.progresside.proComMetamodel.proSave.SubcomponentInstance;
import se.mdh.progresside.proComMetamodel.proSave.TriggerPort;
import se.mdh.progresside.proComMetamodel.proSave.impl.ComponentImpl;
import se.mdh.progresside.proComMetamodel.util.ProComComponentResourceFactory;
import se.mdh.progresside.remes.attributes.IREMESModel;
import se.mdh.progresside.remes.attributes.REMESCst;
import se.mdh.progresside.remes.attributes.impl.REMESModel;

/** 
 * Copied from {@link org.eclipse.jdt.launching.JavaLaunchDelegate}, messages replaced with plain strings.
 * {@inheritDoc}
 * @see JavaLaunchDelegate
 */
public class ComponentSimulatorLaunchDelegate extends SimulatorLaunchDelegate {

	/** Mapping between C types and simulator TYPE_CODEs */
	protected static final Map<String, String> MAP_C_TYPE_TO_TYPE_CODE = new HashMap<String, String>() { 
		private static final long serialVersionUID = -3135383694818373078L;
		{
			put("int", "TYPE_CODE.INTEGER");
			put("float", "TYPE_CODE.FLOAT");
			put("bool", "TYPE_CODE.BOOLEAN");
		}
	};
	
	protected static final String TYPE_CODE_DEFAULT = "TYPE_CODE.INTEGER";
	
	/**
	 * @param configuration
	 * @param packageName 
	 * @param mainTypeName 
	 * @param profile
	 * @param wsRoot
	 * @param project
	 * @param jpr
	 * @param monitor
	 * @return
	 * @throws CoreException
	 * @throws JavaModelException
	 */
	protected IStatus createSimulatorCode(ILaunchConfiguration configuration, String packageName, String mainTypeName, IFile profile, IProject project, IJavaProject jpr, IProgressMonitor monitor) throws CoreException, JavaModelException {
		
		if(monitor == null) {
			monitor = new NullProgressMonitor();
		}
		
		// Initialize monitor
		// load/create behavior model - 2 
		// create procom connections  - 1
		// configure project          - 1 
		// generate files             - 4
		monitor.beginTask("Generating simulator code...", 8); //$NON-NLS-1$
		
		IStatus result = Status.OK_STATUS;
		
		try {
			// Get component UUID
			IComponent component = getComponent(configuration, project);
			if(component == null) {
				return new Status(IStatus.ERROR, Activator.PLUGIN_ID, "Component to launch is not specified."); 
			}
					
			// Locate component folder
			IFolder componentFolder = project.getFolder(component.getCorrespondingResource().getProjectRelativePath());
			
			// REMES root path
			String componentRelativePath = ProComModelManager.PROJECT_COMPONENT_MODELS_FOLDER + "/" + REMESCst.REMES_MODEL_SUBFOLDER_NAME + "/";

			// Check to see if there is a corresponding behavior model
			IREMESModel behModel = REMESModel.getForComponent(component);
			EObject remesModel;
			
			if(behModel == null) { 
				generateRemesModeCodeForCompositeComponent(configuration, component, profile, packageName, jpr, new BasicMonitor.EclipseSubProgress(monitor, 2));
				remesModel = RemesModelManager.createCompositeRemesModel(ArchModel.getForComponent(component));
			} else {
				// Load existing model
				IFile remesFile = jpr.getProject().getWorkspace().getRoot().getFile(behModel.getCorrespondingResource().getFullPath());
				remesModel = RemesModelManager.getRemesModel(remesFile);
				
				// Set src-gen and output folders
				IFolder srcgen = configureSourceFolder(jpr, 
							componentFolder.getFolder(componentRelativePath + IComponentSimulatorLaunchConstants.GENERATED_SOURCE_FOLDER),
							componentFolder.getFolder(componentRelativePath + IComponentSimulatorLaunchConstants.GENERATED_BINARY_FOLDER));
				
				Remes2JavaConverter.generateRemesModeClasses(remesModel, profile, srcgen, packageName, new BasicMonitor.EclipseSubProgress(monitor, 2));
			}
			
			// Prepare procom-specific connection information
			String externalConnections = createProcomConnections(component);
			monitor.worked(1);
				
			// Set src-gen and output folders (duplicates are ignored)
			IFolder srcgen = configureSourceFolder(jpr, 
					componentFolder.getFolder(componentRelativePath + IComponentSimulatorLaunchConstants.GENERATED_SOURCE_FOLDER),
					componentFolder.getFolder(componentRelativePath + IComponentSimulatorLaunchConstants.GENERATED_BINARY_FOLDER));
			
			// Project configuration done
			monitor.worked(1);
			
			if (monitor.isCanceled()) {
				return Status.CANCEL_STATUS;
			}
			
			// Generate java files
			result = Remes2JavaConverter.generateSimulatorClass(remesModel, profile, srcgen, mainTypeName, packageName, externalConnections, new BasicMonitor.EclipseSubProgress(monitor, 4));
		} catch (JavaModelException jme) {
			throw jme;
		} catch (CoreException ce) {
			throw ce;
		} finally {
			monitor.done();
		}
		
		return result;
	}

	/**
	 * Finds the component in the project based on its UUID stored in the launch configuration.
	 * 
	 * @param configuration launch configuration
	 * @param project container project
	 * @return component having the UUID stored in the launch configuration
	 * @throws CoreException passed on from getComponentUUID()
	 */
	protected IComponent getComponent(ILaunchConfiguration configuration, IProject project) throws CoreException {
		// Find component by UUID
		UUID uuid = getComponentUUID(configuration);

		if(uuid == null)
			return null; // TODO throw?
					
		// Get component
		IComponent component = ComponentsPlugin.getDefault().getProComModelManager().getComponent(project, uuid);
		return component;
	}

	/**
	 * @param configuration
	 * @return
	 * @throws CoreException
	 */
	protected UUID getComponentUUID(ILaunchConfiguration configuration)
			throws CoreException {
		String uuidString = configuration.getAttribute(IComponentSimulatorLaunchConstants.COMPONENT_UUID_ATTR, "");

		if(uuidString.isEmpty()) {
			return null;
		}
		return UUID.fromString(uuidString);
	}

	/**
	 * Figures out the type name for the main class for the component.
	 * 
	 * @param component to run in simulator.
	 * @return main type name (component name + 'Simulator')
	 * @throws CoreException if component cannot be located.
	 */
	protected String getMainTypeName(ILaunchConfiguration configuration, IProject project) throws CoreException {
		IComponent component = getComponent(configuration, project);
		return component.getComponentName().concat(IComponentSimulatorLaunchConstants.SIMULATOR_CLASS_SUFFIX); //$NON-NLS-1$
	}
	
	protected String createProcomConnections(IComponent component) {
		// Do this only for composite components
		if(component.getComponentRealizationType() == ComponentRealizationType.COMPOSITE) {
			ResourceSet resourceSet = new ResourceSetImpl();
			Resource modelResource = resourceSet.getResource(				
					ProComComponentResourceFactory.getEmfResource(
							ArchModel.getForComponent(component).getCorrespondingResource()).getURI(), true);
			
			StringBuilder sb = new StringBuilder();
			
			for(Object element : modelResource.getContents()) {
				if(element instanceof ComponentImpl) {
					Component c = (Component) element;
					
					if(c.getRealization() instanceof CompositeComponent) {
						CompositeComponent cc = (CompositeComponent) c.getRealization();
												
						List<SubcomponentInstance> connectedComponents = new ArrayList<SubcomponentInstance>();
						
						// Go through all connections
						for(Connection conn : cc.getConnection()) {
							String src= ((Component) conn.getSourceSubcomponent().eCrossReferences().get(0)).getName();
							String dest= ((Component) conn.getDestSubcomponent().eCrossReferences().get(0)).getName();
							
							// Create transitions and renamings
							if(conn.getSourcePort() instanceof TriggerPort) {
								//sb.append("// Component connections (control)\n");
								sb.append("mode").append(src).append(".addTransition(new Transition(mode");
								sb.append(src).append(", mode").append(dest).append(") {");
								sb.append("public String getObjectId() {\n");
								sb.append("\treturn \"").append(conn.getUUID()).append("\";\n");
								sb.append("}\n}\n");
								sb.append(");\n");
								
								// Mark as visited
								connectedComponents.add(conn.getSourceSubcomponent());
							} else {
								//sb.append("// Component connections (data)\n");
								sb.append("mode").append(src);
								sb.append(".addRenaming(new Renaming(mode");
								sb.append(src).append(", mode").append(dest);
								sb.append(", \"").append(conn.getSourcePort().getName());
								sb.append("\", \"").append(conn.getDestPort().getName());
								sb.append("\", ").append(portTypeToTypeCode(((DataPort) conn.getSourcePort()).getType()));
								sb.append("));\n");
							}
						}
						
						// Create exit transitions for components that do have dangling exit trigger ports
						for(SubcomponentInstance sub : cc.getSubcomponentInst()) {
							if(!connectedComponents.contains(sub)) {
								String name= ((Component) sub.eCrossReferences().get(0)).getName();

								sb.append("mode").append(name);
								sb.append(".addTransition(new ModeExitSystemTransition(mode").append(name).append("){");
								sb.append("public String getObjectId() {\n");
								sb.append("\treturn \"").append(((Component) sub.eCrossReferences().get(0)).getUUID()).append("\";\n");
								sb.append("}\n}\n");
								sb.append(");\n");
							}
						}			
					}
				}
			}

			return sb.toString();
		}
		
		return "";
	}

	/**
	 * Provides a mapping between component port type (String) to TYPE_CODE (enum).
	 * @param type
	 * @return
	 */
	private String portTypeToTypeCode(String type) {
		if(MAP_C_TYPE_TO_TYPE_CODE.containsKey(type)) {
			return MAP_C_TYPE_TO_TYPE_CODE.get(type);
		} else {
			return TYPE_CODE_DEFAULT;
		}
	}
	
/*	private void rewriteClasses(IJavaProject jpr, String mainClass) {
		try {	
			org.eclipse.jdt.core.IType type = jpr.findType(mainClass);
			if(type == null)
				return;
			
			ICompilationUnit lwCompilationUnit = type.getCompilationUnit();
			System.out.println(type);
			
			// Write changes
			ITextFileBufferManager bufferManager = FileBuffers.getTextFileBufferManager(); // get the buffer manager
			IPath path = type.getPath(); 
			try {
				bufferManager.connect(path, LocationKind.IFILE, null); // Connect to the file
				ITextFileBuffer textFileBuffer = bufferManager.getTextFileBuffer(path, LocationKind.IFILE); 
				// retrieve the buffer
				IDocument document = textFileBuffer.getDocument(); 
				// ... edit the document here ...
				StringBuffer source = new StringBuffer("// Component connections (control)\n")
				.append("modeClock.addTransition(new Transition(modeClock, modeHC));\n")
				.append("modeHC.addTransition(new Transition(modeHC, modeRS));\n")
				.append("modeRS.addTransition(new ModeExitSystemTransition(modeRS));\n")
				.append("\n")
				.append("// Component connections (data)\n")
				.append("modeHC.addRenaming(new Renaming(modeHC, modeRS, \"temp\", \"temp\", TYPE_CODE.INTEGER));\n")
				.append("modeRS.addRenaming(new Renaming(modeRS, modeHC, \"tempROD\", \"tempROD\", TYPE_CODE.INTEGER));");
				
				ASTParser parser = ASTParser.newParser(AST.JLS3);  // handles JDK 1.0, 1.1, 1.2, 1.3, 1.4, 1.5, 1.6
				parser.setSource(source.toString().toCharArray());
				parser.setKind(ASTParser.K_STATEMENTS);
				final ASTNode stmts = parser.createAST(null);				
				
				parser.setSource(lwCompilationUnit);
				parser.setKind(ASTParser.K_COMPILATION_UNIT);
				final CompilationUnit cunit = (CompilationUnit) parser.createAST(null);
	
				// Perform changes
				final ASTRewrite rewrite = ASTRewrite.create(cunit.getAST());
				
				ASTVisitor visitor = new ASTVisitor(false) {	
					public boolean visit(MethodDeclaration node) {
						//if(node.getName().getIdentifier().equals(IComponentSimulatorLaunchConstants.CONNECTIONS_PLACEHOLDER_METHOD)) { //$NON-NLS-1$				
						//	rewrite.set(node, MethodDeclaration.BODY_PROPERTY, stmts, null); 
						//}
						return false;
					}

					public boolean visit(MethodInvocation node) {
						System.out.println(node);
						return false;
					}
				};
				
				cunit.accept(visitor);
				
				// write changes
				TextEdit ted = rewrite.rewriteAST(document, null);
				ted.apply(document);
				
				// commit changes to underlying file
				textFileBuffer.commit(null, false); // ProgressMonitor, Overwrite
	
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				try {
					bufferManager.disconnect(path, LocationKind.IFILE, null);
				} catch (CoreException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		} catch (JavaModelException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}				
		
	}
*/
	protected void generateRemesModeCodeForCompositeComponent(ILaunchConfiguration configuration, IComponent component, IFile profile, String packageName, IJavaProject jpr, IProgressMonitor monitor) throws CoreException {
				
		// Initialize monitor
		if(monitor == null) {
			monitor = new NullProgressMonitor();
		}
		
		// Architectural model
		IArchModel archModel = ArchModel.getForComponent(component);
		
		// REMES root path
		String componentRelativePath = ProComModelManager.PROJECT_COMPONENT_MODELS_FOLDER + "/" + REMESCst.REMES_MODEL_SUBFOLDER_NAME + "/";
				
		ResourceSet resourceSet = new ResourceSetImpl();
		Resource componentModel = resourceSet.getResource(ProComComponentResourceFactory.getEmfResource(archModel.getCorrespondingResource()).getURI(), true);
		
		try {
			for (Object element : componentModel.getContents()) {

				if (element instanceof ComponentImpl) {
					Component c = (Component) element;
					
					if(c.getRealization() instanceof CompositeComponent) {
						CompositeComponent cc = (CompositeComponent) c.getRealization();
						
						EList<SubcomponentInstance>  subComponents = cc.getSubcomponentInst();
						
						// Initialize according to number of elements
						monitor.beginTask("Generating behavior code...", subComponents.size()); //$NON-NLS-1$
						
						for(SubcomponentInstance subComponent: subComponents){
							
							IComponent subComponentResource = getComponentResource(subComponent.getImplComponent());
							if(subComponentResource != null) {
								IREMESModel behModel = REMESModel.getForComponent(subComponentResource);
								
								IFile file = (IFile) behModel.getCorrespondingResource().getAdapter(IFile.class);
								if(file == null) { 
									monitor.worked(1);
									continue;
								}
	
								IFolder componentFolder = jpr.getProject().getFolder(subComponentResource.getCorrespondingResource().getProjectRelativePath()); // Is this ok?
	
								// Set src-gen and output folders
								IFolder srcgen = configureSourceFolder(jpr, 
											componentFolder.getFolder(componentRelativePath + IComponentSimulatorLaunchConstants.GENERATED_SOURCE_FOLDER),
											componentFolder.getFolder(componentRelativePath + IComponentSimulatorLaunchConstants.GENERATED_BINARY_FOLDER));
								
								Remes2JavaConverter.generateRemesModeClasses(file, profile, srcgen, packageName, new BasicMonitor.EclipseSubProgress(monitor, 1));
							} else {
								monitor.worked(1);
							}
						}
					}
				}
			}
		} catch (JavaModelException jme) {
			throw jme;
		} catch (CoreException ce) {
			throw ce;
		} finally {
			monitor.done();
		}
	}
	
	protected IComponent getComponentResource(Component c) {
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
