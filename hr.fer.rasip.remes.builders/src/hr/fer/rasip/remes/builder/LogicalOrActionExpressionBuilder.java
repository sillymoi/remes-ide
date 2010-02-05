package hr.fer.rasip.remes.builder;

import hr.fer.rasip.remes.grammars.expressions.ast.AbstractRoot;
import hr.fer.rasip.remes.grammars.expressions.ast.ActionRoot;
import hr.fer.rasip.remes.grammars.expressions.ast.LogicalRoot;
import hr.fer.rasip.remes.grammars.expressions.ast.ResourceRoot;
import hr.fer.rasip.remes.grammars.expressions.ast.VariableReference;
import hr.fer.rasip.remes.grammars.expressions.parser.RemesActionParserHelper;
import hr.fer.rasip.remes.grammars.expressions.parser.RemesLogicalParserHelper;
import hr.fer.rasip.remes.grammars.expressions.parser.RemesResourceParserHelper;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.resources.IResourceDeltaVisitor;
import org.eclipse.core.resources.IResourceVisitor;
import org.eclipse.core.resources.IncrementalProjectBuilder;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

import se.mdh.progresside.remes.CompositeMode;
import se.mdh.progresside.remes.Constant;
import se.mdh.progresside.remes.Edge;
import se.mdh.progresside.remes.InitEdge;
import se.mdh.progresside.remes.Mode;
import se.mdh.progresside.remes.Referable;
import se.mdh.progresside.remes.RemesDiagram;
import se.mdh.progresside.remes.SubMode;
import se.mdh.progresside.remes.Variable;
import se.mdh.progresside.remes.provider.EdgeItemProvider;
import se.mdh.progresside.remes.provider.InitEdgeItemProvider;
import se.mdh.progresside.remes.provider.RemesItemProviderAdapterFactory;
import se.mdh.progresside.remes.provider.ResourceItemProvider;
import se.mdh.progresside.remes.provider.SubModeItemProvider;


public class LogicalOrActionExpressionBuilder extends IncrementalProjectBuilder {

	/**
	 * @author Marin
	 *
	 */
	public class ResolvedReferable {

		private Referable referable = null;
		
		public Referable getReferable() {
			return referable;
		}

		public void setReferable(Referable ref) {
			this.referable = ref; 
		}
	}

	class SampleDeltaVisitor implements IResourceDeltaVisitor {
		/*
		 * (non-Javadoc)
		 * 
		 * @see org.eclipse.core.resources.IResourceDeltaVisitor#visit(org.eclipse.core.resources.IResourceDelta)
		 */
		public boolean visit(IResourceDelta delta) throws CoreException {
			IResource resource = delta.getResource();
			switch (delta.getKind()) {
			case IResourceDelta.ADDED:
				// handle added resource
				checkInvariantsGuardsAndActions(resource);
				break;
			case IResourceDelta.REMOVED:
				// handle removed resource
				break;
			case IResourceDelta.CHANGED:
				// handle changed resource
				checkInvariantsGuardsAndActions(resource);
				break;
			}
			//return true to continue visiting children.
			return true;
		}
	}

	class SampleResourceVisitor implements IResourceVisitor {
		public boolean visit(IResource resource) {
			checkInvariantsGuardsAndActions(resource);
			//return true to continue visiting children.
			return true;
		}
	}

	public static final String BUILDER_ID = "hr.fer.rasip.remes.builders.LogicalExpressionBuilder"; //$NON-NLS-1$
	private static final String MARKER_TYPE = "hr.fer.rasip.remes.builders.logicalExpressionProblem"; //$NON-NLS-1$

	private RemesLogicalParserHelper logicalParserHelper = null;
	private RemesActionParserHelper actionParserHelper = null;
	private RemesResourceParserHelper resourceParserHelper = null;

	private void addMarker(IFile file, String message, Object location, int severity) {
		try {
			IMarker marker = file.createMarker(MARKER_TYPE);
			marker.setAttribute(IMarker.MESSAGE, message);
			marker.setAttribute(IMarker.SEVERITY, severity);
			marker.setAttribute(IMarker.LOCATION, location);
		} catch (CoreException e) {
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.core.internal.events.InternalBuilder#build(int,
	 *      java.util.Map, org.eclipse.core.runtime.IProgressMonitor)
	 */
	protected IProject[] build(int kind, Map args, IProgressMonitor monitor)
			throws CoreException {
		if (kind == FULL_BUILD) {
			fullBuild(monitor);
		} else {
			IResourceDelta delta = getDelta(getProject());
			if (delta == null) {
				fullBuild(monitor);
			} else {
				incrementalBuild(delta, monitor);
			}
		}
		return null;
	}

	void checkInvariantsGuardsAndActions(IResource resource) {
		if (resource instanceof IFile 
				&& (resource.getName().endsWith(".remes") // //$NON-NLS-1$
				  || resource.getName().endsWith(".remes_diagram"))) { //$NON-NLS-1$
			IFile file = (IFile) resource;
			deleteMarkers(file);
			
			RemesItemProviderAdapterFactory factory = new RemesItemProviderAdapterFactory();	
			SubModeItemProvider subModeProvider = (SubModeItemProvider) factory.createSubModeAdapter();
			ResourceItemProvider resourceProvider = (ResourceItemProvider) factory.createResourceAdapter();
			EdgeItemProvider edgeProvider = (EdgeItemProvider) factory.createEdgeAdapter();
			
			try {
				// Load model
				ResourceSet resourceSet = new ResourceSetImpl();
				Resource emf = resourceSet.createResource(URI.createFileURI(resource.getFullPath().toString()));
				emf.load(Collections.EMPTY_MAP);

				if(emf.getContents().isEmpty())
					return;

				for(Iterator<EObject> it = emf.getAllContents(); it.hasNext();) {
					EObject obj = it.next();
					
					if(obj instanceof SubMode) {
						SubMode mode = (SubMode) obj;
						String invariant = mode.getInvariant();

						// Clear parsed invariant
						mode.setParsedInvariant(null);
						
						if(invariant != null  && !invariant.isEmpty()) {
							RemesLogicalParserHelper parser = getLogicalParserHelper();
							
							if(!parser.parseString(invariant)) {
								// Syntax error
								addMarker(file, "Syntax error in mode invariant: " + invariant , (subModeProvider != null) ? subModeProvider.getText(mode) : "Mode", IMarker.SEVERITY_ERROR);
								return;
							}
	
							// Get parsed tree
							LogicalRoot root = parser.getLogicalRoot();
							
							// See if the semantics are correct													
							if(root != null && checkModeInvariantSemantics(file, mode, root))
								mode.setParsedInvariant(parser.getLogicalRoot());
						}
					}
					else if(obj instanceof Edge) {
						Edge edge = (Edge) obj;
						String guard = edge.getActionGuard();

						// Clear parsed action guard
						edge.setParsedActionGuard(null);
						
						if(guard != null && !guard.isEmpty()) {
							RemesLogicalParserHelper parser = getLogicalParserHelper();
							
							if(!parser.parseString(guard)) {
								// Syntax error
								addMarker(file, "Syntax error in edge guard: " + guard , (edgeProvider != null) ? edgeProvider.getText(edge) : "Edge", IMarker.SEVERITY_ERROR);
							}
							else {
								// Get parsed tree
								LogicalRoot root = parser.getLogicalRoot();
								
								if(root != null && checkEdgeGuardSemantics(file, edge, root))
									edge.setParsedActionGuard(root);
							}
						}
						
						String action = edge.getActionBody();

						// Clear parsed action body
						edge.setParsedActionBody(null);

						if(action != null && !action.isEmpty()) {
							RemesActionParserHelper parser = getActionParserHelper();
							
							if(!parser.parseString(action)) {
								// Syntax error
								addMarker(file, "Syntax error in edge action: " + action , (edgeProvider != null) ? edgeProvider.getText(edge) : "Edge", IMarker.SEVERITY_ERROR);
							}
							else {
								// Get parsed tree
								ActionRoot root = parser.getActionRoot();
								
								// See if the semantics are correct
								if(root != null && checkEdgeActionSemantics(file, edge, root))
									edge.setParsedActionBody(root);
							}
						}
					}
					else if(obj instanceof InitEdge) {
						InitEdge edge = (InitEdge) obj;
						String action = edge.getInitialization();

						// Clear parsed expression
						edge.setParsedInitialization(null);

						if(action != null && !action.isEmpty()) {
							RemesActionParserHelper parser = getActionParserHelper();
							
							if(!parser.parseString(action)) {
								// Syntax error
								addMarker(file, "Syntax error in edge action: " + action , (edgeProvider != null) ? edgeProvider.getText(edge) : "Edge", IMarker.SEVERITY_ERROR);
								// Clear parsed guard
								edge.setParsedInitialization(null);
							}
							else {
								// Get parsed tree
								ActionRoot root = parser.getActionRoot();
								
								// See if the semantics are correct
								if(root != null && checkInitActionSemantics(file, edge, root))
									edge.setParsedInitialization(root);
							}
						}
					}
					else if(obj instanceof se.mdh.progresside.remes.Resource) {
						se.mdh.progresside.remes.Resource res = (se.mdh.progresside.remes.Resource) obj;
						String change = res.getExpression();
						
						// Clear parsed expression
						res.setParsedExpression(null);

						if(change != null && !change.isEmpty()) {
							RemesResourceParserHelper parser = getResourceParserHelper();
							
							if(!parser.parseString(change)) {
								// Syntax error
								addMarker(file, "Syntax error in resource expression: " + change , (resourceProvider != null) ? resourceProvider.getText(res) : "Resource", IMarker.SEVERITY_ERROR);
							}
							else {
								// Get parsed tree
								ResourceRoot root = parser.getResourceRoot();
								
								// See if the semantics are correct
								if(root != null && res.getName().equals(root.getReferencedVariables().get(0).getName())) {// Using the same name
									((VariableReference) root.getReferencedVariables().get(0)).setResolved(res); // This is simple
									res.setParsedExpression(root);
								}
								else
									addMarker(file, "Invalid resource name '" + root.getReferencedVariables().get(0).getName() + "' in expression", (resourceProvider != null) ? resourceProvider.getText(res) : "Resource", IMarker.SEVERITY_ERROR);
							}
						}
					}
				}
				
				emf.save(Collections.EMPTY_MAP);
	
			} catch (Exception e1) {
				addMarker(file, e1.getLocalizedMessage(), e1.getCause().toString(), IMarker.SEVERITY_ERROR);
			}
		}
	}

	// TODO - this goes to validation
	private boolean checkModeInvariantSemantics(IFile file,	SubMode mode, LogicalRoot root)
	{
		if(file == null || root == null || mode == null) return true;
		
		HashMap<String, VariableReference> missing = resolveVariableReferences(file, root, mode);
		
		if(missing != null) {
			for(String name : missing.keySet()) {
				addMarker(file, "Unknown variable: " + name, getModeLabel(mode), IMarker.SEVERITY_ERROR);
			}
			return false;
		}
		return true;
	}

	// TODO - this goes to validation
	private boolean checkEdgeGuardSemantics(IFile file, Edge edge, LogicalRoot root) 
	{
		if(file == null || root == null || edge == null) return true;

		RemesItemProviderAdapterFactory factory = new RemesItemProviderAdapterFactory();	
		EdgeItemProvider provider = (EdgeItemProvider) factory.createEdgeAdapter();

		HashMap<String, VariableReference> missing = resolveVariableReferences(file, root, edge);
		
		if(missing != null) {
			for(String name : missing.keySet()) {
				addMarker(file, "Unknown variable: " + name, (provider != null) ? provider.getText(edge) : "Edge", IMarker.SEVERITY_ERROR);
			}
			return false;
		}
		return true;
	}

	// TODO - this goes to validation
	private boolean checkEdgeActionSemantics(IFile file, Edge edge, ActionRoot root) 
	{
		if(file == null || root == null || edge == null) return true;

		RemesItemProviderAdapterFactory factory = new RemesItemProviderAdapterFactory();	
		EdgeItemProvider provider = (EdgeItemProvider) factory.createEdgeAdapter();

		HashMap<String, VariableReference> missing = resolveVariableReferences(file, root, edge);
		
		if(missing != null) {
			for(String name : missing.keySet()) {
				addMarker(file, "Unknown variable: " + name, (provider != null) ? provider.getText(edge) : "Edge", IMarker.SEVERITY_ERROR);
			}
			return false;
		}
		return true;
	}

	// TODO - this goes to validation
	private boolean checkInitActionSemantics(IFile file, InitEdge edge, ActionRoot root) 
	{
		if(file == null || root == null || edge == null) return true;

		RemesItemProviderAdapterFactory factory = new RemesItemProviderAdapterFactory();	
		InitEdgeItemProvider provider = (InitEdgeItemProvider) factory.createInitEdgeAdapter();

		HashMap<String, VariableReference> missing = resolveVariableReferences(file, root, edge);
		
		if(missing != null) {
			for(String name : missing.keySet()) {
				addMarker(file, "Unknown variable: " + name, (provider != null) ? provider.getText(edge) : "InitEdge", IMarker.SEVERITY_ERROR);
			}
			return false;
		}
		return true;
	}

	private void deleteMarkers(IFile file) {
		try {
			file.deleteMarkers(MARKER_TYPE, false, IResource.DEPTH_ZERO);
		} catch (CoreException ce) {
		}
	}

	protected void fullBuild(final IProgressMonitor monitor)
			throws CoreException {
		try {
			getProject().accept(new SampleResourceVisitor());
		} catch (CoreException e) {
		}
	}

	protected void incrementalBuild(IResourceDelta delta,
			IProgressMonitor monitor) throws CoreException {
		// the visitor does the work.
		delta.accept(new SampleDeltaVisitor());
	}
	
	private RemesLogicalParserHelper getLogicalParserHelper() {
		if(this.logicalParserHelper == null)
			this.logicalParserHelper = new RemesLogicalParserHelper();
		
		return this.logicalParserHelper;
	}
	
	private RemesActionParserHelper getActionParserHelper() {
		if(this.actionParserHelper == null)
			this.actionParserHelper = new RemesActionParserHelper();
		
		return this.actionParserHelper;
	}

	private RemesResourceParserHelper getResourceParserHelper() {
		if(this.resourceParserHelper == null)
			this.resourceParserHelper = new RemesResourceParserHelper();
		
		return this.resourceParserHelper;
	}

	private HashMap<String, VariableReference> resolveVariableReferences(IFile file, AbstractRoot root, EObject parent) 
	{
		if(root == null || parent == null) return null;
		
		// No variables - nothing to check 
		if(root.getReferencedVariables() == null)
			return null;
		
		// TODO - cacheirati ovo!.. mozda ici obratno? prvo pokupiti sve varijable a onda traziti umjesto da se ovako setam nonstop?
		// Create a list of resolved variable references
		HashMap<String, Referable> resolved = new HashMap<String, Referable>();
		
		// Create a list of unresolved variable references
		HashMap<String, VariableReference> missing = new HashMap<String, VariableReference>();
		
		// Carry return values from function
		ResolvedReferable ptr = new ResolvedReferable();
		
		// Check if all referenced variables exist
		for (VariableReference ref : root.getReferencedVariables()) 
		{
			// Clear output object
			ptr.setReferable(null);
			
			// Check cache
			if(resolved.containsKey(ref.getName())) {
				Referable var = resolved.get(ref.getName());
				ref.setResolved(var);
				continue;
			}
			
			if(missing.containsKey(ref.getName()))				
				continue;
			
			// First check upstream
			EObject context = parent;
			Mode ourMode = null;
			
			boolean found = false;
			while(context.eContainer() != null) {
				if(context instanceof Mode) {
					// Save our mode for future reference
					if(ourMode == null) ourMode = (Mode) context;
					
					// Check if variable reference can be resolved in current mode
					if(modeHasVariableReference(file, (Mode) context, ref, (ourMode != context), ptr)) {
						found = true;
						break;
					}
				}

				context = context.eContainer(); // Go up
			}
			
			// Resolved our variable, go on
			if(found) {
				resolved.put(ref.getName(), ptr.getReferable());
				ref.setResolved(ptr.getReferable());
				continue;
			}
			
			// Now check with all modes
			context = parent;
						
			// Go to the Diagram level
			while(!(context instanceof RemesDiagram || context == null)) context = context.eContainer();
			
			if(context == null) { // Definitely something wrong, should have a Diagram on top
				missing.put(ref.getName(), ref);
				continue;
			}
			
			// Save diagram reference
			RemesDiagram diagram = (RemesDiagram) context;
			
			// Now check with all modes
			for(Mode m : diagram.getModes()) {
				if(m == ourMode) continue;
				
				// Check if the mode has this variable
				if(modeHasVariableReference(file, m, ref, true, ptr)) {
					found = true;
					break;
				}
				
				// If we're dealing with composite mode, check its submodes
				if(m instanceof CompositeMode) {
					for(Mode sm : ((CompositeMode) m).getSubModes()) {
						if(sm == ourMode) continue;
						
						// Check if the mode has this variable
						if(modeHasVariableReference(file, m, ref, true, ptr)) {
							found = true;
							break;
						}
					}
				}
			}
			
			if(!found) { 
				missing.put(ref.getName(), ref);
			} else {
				resolved.put(ref.getName(), ptr.getReferable());
				ref.setResolved(ptr.getReferable());
			}
		}
		
		// Return the list of unresolved variable references
		return (missing.isEmpty() ? null : missing);
	}
	
	boolean modeHasVariableReference(IFile file, Mode mode, VariableReference ref, boolean checkAccess, ResolvedReferable resolver) 
	{
		// TODO - check variable access, for this we would need to know rhs/lhs
		Variable var = mode.findVariableByName(ref.getName());
		se.mdh.progresside.remes.Resource res = mode.findResourceByName(ref.getName());
		Constant cst = mode.findConstantByName(ref.getName());
		
		if(var != null) {
			// Check arrays
			if(var.getVectorSize()==0 && ref.getArrayIndex() != null) {
				addMarker(file, "Mode invariant: Referenced variable " + ref.getName() + " is not an array", getModeLabel(mode), IMarker.SEVERITY_ERROR);
				return true;
			}
				
			if(var.getVectorSize() != 0 && ref.getArrayIndex() == null)	{
				addMarker(file, "Mode invariant: Referenced variable " + ref.getName() + " is an array", getModeLabel(mode), IMarker.SEVERITY_ERROR);
				return true;
			}
					
			// No way to do a meaningful statical test of array size references
			resolver.setReferable(var);
			return true;
			
		} else if(cst != null) {
			// Check arrays
			if(ref.getArrayIndex() != null)	{
				addMarker(file, "Mode invariant: Constant " + ref.getName() + " cannot be an array", getModeLabel(mode), IMarker.SEVERITY_ERROR);
				return true;
			}
			
			// Found our reference target
			resolver.setReferable(cst);
			return true;
		} else if(res != null) {
			// Check arrays
			if(ref.getArrayIndex() != null)	{
				addMarker(file, "Mode invariant: Resource " + ref.getName() + " cannot be an array", getModeLabel(mode), IMarker.SEVERITY_ERROR);
				return true;
			}
			
			// Found our reference target
			resolver.setReferable(res);
			return true;
		}
		
		// Not found
		return false;
	}

	private String getModeLabel(Mode mode) {
		if(mode.getName() == null || mode.getName().isEmpty())
			return "Mode";
		else
			return mode.getName();
	}
}
