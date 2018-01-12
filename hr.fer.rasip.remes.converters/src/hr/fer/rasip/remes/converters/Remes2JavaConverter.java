/**
 * 
 */
package hr.fer.rasip.remes.converters;

import hr.fer.rasip.remes.grammars.expressions.ast.ActionRoot;
import hr.fer.rasip.remes.grammars.expressions.ast.AstFactory;
import hr.fer.rasip.remes.grammars.expressions.ast.AstPackage;
import hr.fer.rasip.remes.grammars.expressions.ast.BinaryExpression;
import hr.fer.rasip.remes.grammars.expressions.ast.BinaryOperation;
import hr.fer.rasip.remes.grammars.expressions.ast.LogicalRoot;
import hr.fer.rasip.remes.grammars.expressions.ast.ResolvedType;
import hr.fer.rasip.remes.profile.profile.PlatformProfile;
import hr.fer.rasip.remes.profile.profile.ProfileFactory;
import hr.fer.rasip.remes.profile.profile.ProfilePackage;
import hr.fer.rasip.remes.profile.profile.ResourceType;
import hr.fer.rasip.remes.simulator.remes2java.files.GenerateConstraints;
import hr.fer.rasip.remes.simulator.remes2java.files.GenerateModes;
import hr.fer.rasip.remes.simulator.remes2java.files.GenerateSimulator;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.BasicMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.XMIResource;

import se.mdh.progresside.remes.ConditionalConnector;
import se.mdh.progresside.remes.Edge;
import se.mdh.progresside.remes.EntryPoint;
import se.mdh.progresside.remes.ExitPoint;
import se.mdh.progresside.remes.InitEdge;
import se.mdh.progresside.remes.InitPoint;
import se.mdh.progresside.remes.RemesDiagram;
import se.mdh.progresside.remes.RemesFactory;
import se.mdh.progresside.remes.RemesPackage;
import se.mdh.progresside.remes.WriteEdge;
import se.mdh.progresside.remes.WritePoint;
import se.mdh.progresside.remes.util.RemesResourceFactoryImpl;

/**
 * Runs the acceleo generation to create java files corresponding to the REMES
 * behavior.
 * 
 * @author <a href="mailto:marin.orlic@fer.hr">Marin Orlic</a>
 */
public class Remes2JavaConverter {
	
	/**
	 * The only instance.
	 */
	private static Remes2JavaConverter INSTANCE = new Remes2JavaConverter();
	
	protected Remes2JavaConverter() {
		try {
			// Register package
			Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("remes", new RemesResourceFactoryImpl());
			Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("remes_diagram", new RemesResourceFactoryImpl());
			RemesPackage.eINSTANCE.eClass();
			AstPackage.eINSTANCE.eClass();
			ProfilePackage.eINSTANCE.eClass();
		} catch (Throwable t) {
			IStatus status = new Status(Status.ERROR, Activator.PLUGIN_ID, t.getMessage(), t);
			Activator.log(status);
		}
	}
	
	/**
	 * Provides the only Remes2JavaConverter instance.
	 */
	public static Remes2JavaConverter getInstance() {
		return INSTANCE;
	}
	
	/**
	 * @param monitor
	 * @return
	 */
	public static IStatus remes2java(IProgressMonitor monitor, IFile modelFile, IFile profile, IFolder target, String mainType, String packageName, String proComSpecific) {
		if (monitor == null) {
			monitor = new NullProgressMonitor();
		}

		monitor.beginTask("Generating simulator code", 3); //$NON-NLS-1$

		// check for cancellation
		if (monitor.isCanceled()) {
			return Status.CANCEL_STATUS;
		}

		try {
			URI modelURI = URI.createPlatformResourceURI(modelFile.getFullPath().toString(), true);

			// Load profile model
			EObject profileModel;
			profileModel = getProfileModel(profile);

			// check for cancellation
			if (monitor.isCanceled()) {
				return Status.CANCEL_STATUS;
			}

			// Prepare arguments
			ArrayList<Object> args = new ArrayList<Object>();
		
			// Set package name for generated files
			args.add(packageName);

			// Prepare model
			EObject model = prepareModel(modelURI);
			if (model == null) {
				return new Status(IStatus.ERROR, Activator.PLUGIN_ID, "Unable to load REMES model from " + modelURI);
			}

			// Generate mode structure
			GenerateModes genModes = new GenerateModes(model, target.getLocation().toFile(), args);
			genModes.doGenerate(new BasicMonitor.EclipseSubProgress(monitor, 1));

			// check for cancellation
			if (monitor.isCanceled()) {
				return Status.CANCEL_STATUS;
			}

			// Prepare arguments
			args = new ArrayList<Object>();
			args.add(packageName);

			// Generate profile constraints checker
			GenerateConstraints genProfile = new GenerateConstraints(profileModel, target.getLocation().toFile(), args);
			genProfile.doGenerate(new BasicMonitor.EclipseSubProgress(monitor, 1));
			
			// Prepare arguments
			args = new ArrayList<Object>();
			args.add(profileModel);
			args.add(packageName);
			args.add(mainType);
			args.add(proComSpecific);

			// Generate main simulator class
			GenerateSimulator genSim = new GenerateSimulator(model, target.getLocation().toFile(), args);
			genSim.doGenerate(new BasicMonitor.EclipseSubProgress(monitor, 1));
			
			// check for cancellation
			if (monitor.isCanceled()) {
				return Status.CANCEL_STATUS;
			}
			
		} catch (Throwable t) {
			IStatus status = new Status(IStatus.ERROR, Activator.PLUGIN_ID, "Failed to generate simulator classes: " + t.toString(), t);
			Activator.log(status); // FIXME return error status
			return status;
		} finally {
			try {
				modelFile.getProject().refreshLocal(IProject.DEPTH_INFINITE, monitor);
			} catch (CoreException e) {
				IStatus status = new Status(IStatus.ERROR, Activator.PLUGIN_ID, e.getMessage(), e);
				Activator.log(status);
				return status;
			}

			monitor.done();
		}

		return Status.OK_STATUS;
	}

	/**
	 * @param monitor
	 * @return
	 */
	public static IStatus generateRemesModeClasses(IFile modelFile, IFile profile, IFolder target, String packageName, IProgressMonitor monitor) {
		if (monitor == null) {
			monitor = new NullProgressMonitor();
		}

		monitor.beginTask("Generating mode classes", 1); //$NON-NLS-1$

		// check for cancellation
		if (monitor.isCanceled()) {
			return Status.CANCEL_STATUS;
		}

		try {
			URI modelURI = URI.createPlatformResourceURI(modelFile.getFullPath().toString(), true);

			// check for cancellation
			if (monitor.isCanceled()) {
				return Status.CANCEL_STATUS;
			}

			// Prepare arguments
			ArrayList<String> args = new ArrayList<String>();
		
			// Set package name for generated files
			args.add(packageName);

			// Prepare model
			EObject model = prepareModel(modelURI);
			if (model == null) {
				return Status.OK_STATUS;
			}

			GenerateModes genModes = new GenerateModes(model, target.getLocation().toFile(), args);
			genModes.doGenerate(new BasicMonitor.EclipseSubProgress(monitor, 1));
			
		} catch (Throwable t) {
			IStatus status = new Status(IStatus.ERROR, Activator.PLUGIN_ID, "Failed to generate mode classes: " + t.toString(), t);
			Activator.log(status); // FIXME return error status
			return status;
		} finally {
			monitor.done();
		}

		return Status.OK_STATUS;
	}
	
	/**
	 * TODO: This code is almost duplicate.
	 * @param monitor
	 * @return
	 */
	public static IStatus generateRemesModeClasses(EObject model, IFile profile, IFolder target, String packageName, IProgressMonitor monitor) {
		if (monitor == null) {
			monitor = new NullProgressMonitor();
		}

		monitor.beginTask("Generating mode classes", 1); //$NON-NLS-1$

		// check for cancellation
		if (monitor.isCanceled()) {
			return Status.CANCEL_STATUS;
		}

		try {
			// check for cancellation
			if (monitor.isCanceled()) {
				return Status.CANCEL_STATUS;
			}

			// Prepare arguments
			ArrayList<String> args = new ArrayList<String>();
		
			// Set package name for generated files
			args.add(packageName);

			// Prepare model
			model = prepareModel(model);
			if (model == null) {
				return Status.OK_STATUS;
			}
			
			GenerateModes genModes = new GenerateModes(model, target.getLocation().toFile(), args);
			genModes.doGenerate(new BasicMonitor.EclipseSubProgress(monitor, 1));
			
		} catch (Throwable t) {
			IStatus status = new Status(IStatus.ERROR, Activator.PLUGIN_ID, "Failed to generate mode classes: " + t.toString(), t);
			Activator.log(status); // FIXME return error status
			return status;
		} finally {
			monitor.done();
		}

		return Status.OK_STATUS;
	}
	
	/**
	 * TODO: This code is almost duplicate.
	 * 
	 * @param monitor
	 * @return
	 */
	public static IStatus generateSimulatorClass(IFile modelFile, IFile profile, IFolder target, String mainType, String packageName, String proComSpecific, IProgressMonitor monitor) {
		if (monitor == null) {
			monitor = new NullProgressMonitor();
		}

		// prepare model - 1
		// generate constraints - 1
		// generate code - 2
		monitor.beginTask("Generating simulator code", 4); //$NON-NLS-1$
		
		try {
			URI modelURI = URI.createPlatformResourceURI(modelFile.getFullPath().toString(), true);

			// Load profile model
			EObject profileModel = getProfileModel(profile);

			// Prepare model
			EObject model = prepareModel(modelURI);
			if (model == null) {
				return Status.OK_STATUS;
			}
			monitor.worked(1);
			
			// Check for cancellation
			if (monitor.isCanceled()) {
				return Status.CANCEL_STATUS;
			}

			// Prepare arguments
			ArrayList<Object> args = new ArrayList<Object>();
			args.add(packageName);

			// Generate profile constraints checker
			GenerateConstraints genProfile = new GenerateConstraints(profileModel, target.getLocation().toFile(), args);
			genProfile.doGenerate(new BasicMonitor.EclipseSubProgress(monitor, 1));
			
			// Prepare arguments
			args = new ArrayList<Object>();
			args.add(profileModel);
			args.add(packageName);
			args.add(mainType);
			args.add(proComSpecific);

			GenerateSimulator genSim = new GenerateSimulator(model, target.getLocation().toFile(), args);
			genSim.doGenerate(new BasicMonitor.EclipseSubProgress(monitor, 2));
			
		} catch (Throwable t) {
			IStatus status = new Status(IStatus.ERROR, Activator.PLUGIN_ID, "Failed to generate simulator class: " + t.toString(), t);
			Activator.log(status); // FIXME return error status
			return status;
		} finally {
			monitor.done();
		}

		return Status.OK_STATUS;
	}

	/**
	 * @param monitor
	 * @return
	 */
	public static IStatus generateSimulatorClass(EObject model, IFile profile, IFolder target, String mainType, String packageName, String proComSpecific, IProgressMonitor monitor) {
		if (monitor == null) {
			monitor = new NullProgressMonitor();
		}

		// prepare model - 1
		// generate constraints - 1
		// generate code - 2
		monitor.beginTask("Generating simulator code", 4); //$NON-NLS-1$

		// check for cancellation
		if (monitor.isCanceled()) {
			return Status.CANCEL_STATUS;
		}

		try {
			// Load profile model
			EObject profileModel = getProfileModel(profile);

			// Prepare model
			model = prepareModel(model);
			if (model == null) {
				return Status.OK_STATUS;
			}
			monitor.worked(1);
			
			// Check for cancellation
			if (monitor.isCanceled()) {
				return Status.CANCEL_STATUS;
			}

			// Prepare arguments
			ArrayList<Object> args = new ArrayList<Object>();
			args.add(packageName);

			// Generate profile constraints checker
			GenerateConstraints genProfile = new GenerateConstraints(profileModel, target.getLocation().toFile(), args);
			genProfile.doGenerate(new BasicMonitor.EclipseSubProgress(monitor, 1));
			
			// Prepare arguments
			args = new ArrayList<Object>();
			args.add(profileModel);
			args.add(packageName);
			args.add(mainType);
			args.add(proComSpecific);

			GenerateSimulator genSim = new GenerateSimulator(model, target.getLocation().toFile(), args);
			genSim.doGenerate(new BasicMonitor.EclipseSubProgress(monitor, 2));
			
		} catch (Throwable t) {
			IStatus status = new Status(IStatus.ERROR, Activator.PLUGIN_ID, "Failed to generate simulator class: " + t.toString(), t);
			Activator.log(status); // FIXME return error status
			return status;
		} finally {
			monitor.done();
		}

		return Status.OK_STATUS;
	}
	
	/**
	 * Loads the profile model from the specified file. Will generate a default profile if no profile file is given.
	 * 
	 * @param profile file with the profile model resource. If null, a default profile will be generated.
	 * @return a loaded or generated profile model.
	 */
	private static EObject getProfileModel(IFile profile) {
		EObject profileModel;
		if(profile != null) {
			URI profileURI = URI.createPlatformResourceURI(profile.getFullPath().toString(), true);
			profileModel = loadProfile(profileURI);
		} else {
			profileModel = createDefaultProfile();
		}
		return profileModel;
	}
	
	/**
	 * Loads the profile model from the specified resource.
	 * 
	 * @param uri profile model resource URI.
	 * @return loaded model.
	 */
	private static EObject loadProfile(URI uri) {
		ResourceSet resourceSet = new ResourceSetImpl();
		Resource emf = resourceSet.createResource(uri);
	
		try {
			emf.load(Collections.EMPTY_MAP);
			if (emf.getContents().isEmpty()) {
				return null;
			}
			
			for (Iterator<EObject> it = emf.getAllContents(); it.hasNext();) {
				EObject obj = it.next();
	
				if (obj instanceof PlatformProfile) {
					return obj;
				}
			}
			return null;
			
		} catch (IOException e) {
			Activator.log(IStatus.ERROR, e.getMessage(), e);
		}
	
		return null;
	}

	/**
	 * Generates a default profile, with three default resources:
	 *  "cpu" of type cpu, "mem" of type memory and "eng" of type power.
	 *  
	 * @return generated default profile model.
	 */
	private static EObject createDefaultProfile() {
		PlatformProfile profile = ProfileFactory.eINSTANCE.createPlatformProfile();
		hr.fer.rasip.remes.profile.profile.Resource cpu = ProfileFactory.eINSTANCE.createResource();
		hr.fer.rasip.remes.profile.profile.Resource mem = ProfileFactory.eINSTANCE.createResource();
		hr.fer.rasip.remes.profile.profile.Resource eng = ProfileFactory.eINSTANCE.createResource();
		
		profile.setName("Default");
		
		cpu.setName("cpu");
		cpu.setType(ResourceType.CPU);

		mem.setName("mem");
		mem.setType(ResourceType.MEMORY);

		eng.setName("eng");
		eng.setType(ResourceType.POWER);

		profile.getResources().add(cpu);
		profile.getResources().add(mem);
		profile.getResources().add(eng);
		
		return profile;
	}

	
	/**
	 * A convenience method to avoid M2M. Removes conditional connectors from
	 * REMES models.
	 * 
	 * @param model object
	 * @return EObject representing the REMES model with conditional connectors
	 *         removed.
	 */
	private static EObject prepareModel(URI modelURI) {
		ResourceSet resourceSet = new ResourceSetImpl();
		Resource emf = resourceSet.createResource(modelURI);

		try {
			emf.load(Collections.EMPTY_MAP);
			if (emf.getContents().isEmpty()) {
				return null;
			}

			RemesDiagram d = null;
			for (Iterator<EObject> it = emf.getAllContents(); it.hasNext();) {
				EObject obj = it.next();

				if (obj instanceof RemesDiagram) {
					d = (RemesDiagram) obj;
					break;
				}
			}
			
			return prepareModel(d);
		} catch (IOException e) {
			Activator.log(IStatus.ERROR, e.getMessage(), e);
		}

		return null;
	}
	
	
	/**
	 * A convenience method to avoid M2M. Removes conditional connectors from
	 * REMES models.
	 * 
	 * @param model object
	 * @return EObject representing the REMES model with conditional connectors
	 *         removed.
	 */
	private static EObject prepareModel(EObject model) {
		// Check if model is specified
		if(model == null)
			return null;

		ArrayList<EObject> toRemove = new ArrayList<EObject>();

//		RemesDiagram d = null;
		
		for (Iterator<EObject> it = model.eAllContents(); it.hasNext();) {
			EObject obj = it.next();

//			if(obj instanceof RemesDiagram) {
//				d = (RemesDiagram) obj;
//				continue;
//			}
			
			if (obj instanceof ConditionalConnector) {
				ConditionalConnector cc = (ConditionalConnector) obj;

				toRemove.addAll(rerouteConditionalEdges(cc));
				toRemove.add(cc);
			}
			
			if (obj instanceof InitEdge) { // Needs special care as EOpposite is not set on InitEdge
				InitEdge ie = (InitEdge) obj;
				
				if(ie.getConnectTo().getContainer() instanceof ConditionalConnector) {
					rerouteConditionalInitEdge(ie);
					toRemove.add(ie);
				}
			}
		}
		
		for (EObject e : toRemove) {
			EcoreUtil.delete(e);
		}
		
		return model;
	}

	/**
	 * Removes a conditional connector from the control path of a REMES model.
	 * 
	 * @param cc conditional connector to remove.
	 * @return a list of edges that can be deleted from the model.
	 */
	private static List<Edge> rerouteConditionalEdges(ConditionalConnector cc) {
		EntryPoint entry = cc.getEntryPoint();
		ExitPoint exit = cc.getExitPoint();

		List<Edge> entryEdges = entry.getEntryEdges();
		List<Edge> exitEdges = exit.getExitEdges();

		ArrayList<Edge> toRemove = new ArrayList<Edge>();

		// Combine edges, handle special cases of InitEdge and WriteEdge
		for (Edge ie : entryEdges) {
			for (Edge xe : exitEdges) {
				if (ie instanceof InitEdge) {
					InitEdge initEdge = (InitEdge) ie;
					
 					// Connections
					InitPoint in = initEdge.getConnectFrom();
					EntryPoint out = xe.getConnectTo();

					// Guard
					if(xe.getActionGuard() != null) {
						Activator.log(IStatus.WARNING, "Conditional connector with initialization edge cannot be removed without loss of guard on exiting edge: " 
								+ xe.getActionGuard());
					}
						
					// Action
					String actionIn = initEdge.getInitialization();
					String actionOut = xe.getActionBody();

					// Parsed action
					ActionRoot parsedActionIn = initEdge.getParsedInitialization();
					ActionRoot parsedActionOut = xe.getParsedActionBody();

					// Create a replacement edge
					InitEdge newEdge = RemesFactory.eINSTANCE.createInitEdge();
					newEdge.setConnectFrom(in);
					newEdge.setConnectTo(out);

					String txtAction = mergeExpressionText(actionIn, actionOut, ", "); //$NON-NLS-1$
					newEdge.setInitialization(txtAction);

					ActionRoot newAction = mergeActions(parsedActionIn, parsedActionOut);
					newEdge.setParsedInitialization(newAction);
				} else if (xe instanceof WriteEdge) {
					WriteEdge we = (WriteEdge) xe;
					
 					// Connections
					ExitPoint in = ie.getConnectFrom();
					WritePoint out = we.getConnectTo();

					// Guard
					if(ie.getActionGuard() != null || ie.getActionBody() != null) {
						Activator.log(IStatus.WARNING, "Conditional connector with write edge cannot be removed without loss of guard and action on entering edge: " 
								+ ie.getActionGuard() + ", " + ie.getActionBody());
					}
						
					// Create a replacement edge
					WriteEdge newEdge = RemesFactory.eINSTANCE.createWriteEdge();
					newEdge.setConnectFrom(in);
					newEdge.setConnectTo(out);
				} else {
					// Connections
					ExitPoint in = ie.getConnectFrom();
					EntryPoint out = xe.getConnectTo();

					// Guard
					String guardIn = ie.getActionGuard();
					String guardOut = xe.getActionGuard();

					// Action
					String actionIn = ie.getActionBody();
					String actionOut = xe.getActionBody();

					// Parsed guard & action
					LogicalRoot parsedGuardIn = ie.getParsedActionGuard();
					LogicalRoot parsedGuardOut = xe.getParsedActionGuard();

					ActionRoot parsedActionIn = ie.getParsedActionBody();
					ActionRoot parsedActionOut = xe.getParsedActionBody();

					// Create a replacement edge
					Edge newEdge = RemesFactory.eINSTANCE.createEdge();
					newEdge.setConnectFrom(in);
					newEdge.setConnectTo(out);

					String txtGuard = mergeExpressionText(guardIn, guardOut, "&&"); //$NON-NLS-1$
					String txtAction = mergeExpressionText(actionIn, actionOut, ", "); //$NON-NLS-1$
					newEdge.setActionGuard(txtGuard);
					newEdge.setActionBody(txtAction);

					LogicalRoot newGuard = mergeGuards(parsedGuardIn, parsedGuardOut, txtGuard);
					newEdge.setParsedActionGuard(newGuard);

					ActionRoot newAction = mergeActions(parsedActionIn, parsedActionOut);
					newEdge.setParsedActionBody(newAction);
				}
				toRemove.add(xe);
			}
			toRemove.add(ie);
		}

		return toRemove;
	}

	public static String getXmiId(EObject obj) {
		String id = "_UNKNOWN";
		Resource res = obj.eResource();
		
		if(res instanceof XMIResource) {
			XMIResource xmi = (XMIResource) res;
			
			id = xmi.getID(obj);
		}
		
		return id;
	}
	
	/**
	 * Removes a InitEdge connected to a conditional connector from the control path of a REMES model.
	 * 
	 * @param cc conditional connector to remove.
	 */
	private static void rerouteConditionalInitEdge(InitEdge ie) {
		if(ie.getConnectTo().getContainer() instanceof ConditionalConnector) {
			ConditionalConnector cc = (ConditionalConnector) ie.getConnectTo().getContainer();
			
			ExitPoint exit = cc.getExitPoint();
			List<Edge> exitEdges = exit.getExitEdges();

			// Combine edges, handle special cases of InitEdge and WriteEdge
			for (Edge xe : exitEdges) {
				// Connections
				InitPoint in = ie.getConnectFrom();
				EntryPoint out = xe.getConnectTo();

				// Guard
				if(xe.getActionGuard() != null) {
					Activator.log(IStatus.WARNING, "Conditional connector with initialization edge cannot be removed without loss of guard on exiting edge: " 
							+ xe.getActionGuard());
				}
					
				// Action
				String actionIn = ie.getInitialization();
				String actionOut = xe.getActionBody();

				// Parsed action
				ActionRoot parsedActionIn = ie.getParsedInitialization();
				ActionRoot parsedActionOut = xe.getParsedActionBody();

				// Create a replacement edge
				InitEdge newEdge = RemesFactory.eINSTANCE.createInitEdge();
				newEdge.setConnectFrom(in);
				newEdge.setConnectTo(out);

				String txtAction = mergeExpressionText(actionIn, actionOut, ", "); //$NON-NLS-1$
				newEdge.setInitialization(txtAction);

				ActionRoot newAction = mergeActions(parsedActionIn, parsedActionOut);
				newEdge.setParsedInitialization(newAction);
			}
		}
	}
	
	/**
	 * @param expr1
	 * @param expr2
	 * @return
	 */
	private static ActionRoot mergeActions(ActionRoot expr1, ActionRoot expr2) {
		if (expr1 == null)
			return expr2;

		if (expr2 == null)
			return expr1;

		ActionRoot merge = AstFactory.eINSTANCE.createActionRoot();
		merge.getExpressions().addAll(expr1.getExpressions());
		merge.getExpressions().addAll(expr2.getExpressions());
		merge.setType(expr2.getType());

		return merge;
	}

	/**
	 * Merges two expression string with an AND operator. Takes care of null
	 * values for expressions.
	 * 
	 * @param expr1
	 * @param expr2
	 * @param text
	 * @return expr1 AND expr2
	 */
	private static LogicalRoot mergeGuards(LogicalRoot expr1,
			LogicalRoot expr2, String text) {
		if (expr1 == null)
			return expr2;

		if (expr2 == null)
			return expr1;

		LogicalRoot merge = AstFactory.eINSTANCE.createLogicalRoot();
		BinaryExpression be = AstFactory.eINSTANCE.createBinaryExpression();
		be.setOperation(BinaryOperation.AND);
		be.setParam1(expr1.getExpression());
		be.setParam2(expr2.getExpression());
		be.setType(ResolvedType.BOOLEAN);
		be.setText(text);
		merge.setExpression(be);

		return merge;
	}

	/**
	 * Merges two expression string with a glue operator. Takes care of null
	 * values for expressions.
	 * 
	 * @param expr1
	 * @param expr2
	 * @param glue
	 * @return merged expression in form of ( expr1 ) glue ( expr2 )
	 */
	private static String mergeExpressionText(String expr1, String expr2, String glue) {
		if (expr1 == null || expr1.isEmpty())
			return expr2;

		if (expr2 == null || expr2.isEmpty())
			return expr1;

		StringBuilder sb = new StringBuilder("(");
		sb.append(expr1).append(")").append(glue).append("(").append(expr2)
				.append(")");
		return sb.toString();
	}

}
