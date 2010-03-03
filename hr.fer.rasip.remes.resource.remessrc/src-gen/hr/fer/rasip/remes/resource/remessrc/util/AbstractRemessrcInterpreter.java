/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package hr.fer.rasip.remes.resource.remessrc.util;

public class AbstractRemessrcInterpreter<ResultType, ContextType> {
	
	private java.util.Stack<org.eclipse.emf.ecore.EObject> interpretationStack = new java.util.Stack<org.eclipse.emf.ecore.EObject>();
	
	public ResultType interprete(ContextType context) {
		ResultType result = null;
		while (!interpretationStack.empty()) {
			org.eclipse.emf.ecore.EObject next = interpretationStack.pop();
			result = interprete(next, context);
		}
		return result;
	}
	
	public ResultType interprete(org.eclipse.emf.ecore.EObject object, ContextType context) {
		ResultType result = null;
		if (object instanceof se.mdh.progresside.remes.Constant) {
			result = interprete_se_mdh_progresside_remes_Constant((se.mdh.progresside.remes.Constant) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof se.mdh.progresside.remes.Resource) {
			result = interprete_se_mdh_progresside_remes_Resource((se.mdh.progresside.remes.Resource) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof se.mdh.progresside.remes.Variable) {
			result = interprete_se_mdh_progresside_remes_Variable((se.mdh.progresside.remes.Variable) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof se.mdh.progresside.remes.Referable) {
			result = interprete_se_mdh_progresside_remes_Referable((se.mdh.progresside.remes.Referable) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof se.mdh.progresside.remes.InitEdge) {
			result = interprete_se_mdh_progresside_remes_InitEdge((se.mdh.progresside.remes.InitEdge) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof se.mdh.progresside.remes.Edge) {
			result = interprete_se_mdh_progresside_remes_Edge((se.mdh.progresside.remes.Edge) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof se.mdh.progresside.remes.CompositeExitPoint) {
			result = interprete_se_mdh_progresside_remes_CompositeExitPoint((se.mdh.progresside.remes.CompositeExitPoint) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof se.mdh.progresside.remes.CompositeEntryPoint) {
			result = interprete_se_mdh_progresside_remes_CompositeEntryPoint((se.mdh.progresside.remes.CompositeEntryPoint) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof se.mdh.progresside.remes.ExitPoint) {
			result = interprete_se_mdh_progresside_remes_ExitPoint((se.mdh.progresside.remes.ExitPoint) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof se.mdh.progresside.remes.EntryPoint) {
			result = interprete_se_mdh_progresside_remes_EntryPoint((se.mdh.progresside.remes.EntryPoint) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof se.mdh.progresside.remes.InitPoint) {
			result = interprete_se_mdh_progresside_remes_InitPoint((se.mdh.progresside.remes.InitPoint) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof se.mdh.progresside.remes.Point) {
			result = interprete_se_mdh_progresside_remes_Point((se.mdh.progresside.remes.Point) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof se.mdh.progresside.remes.ConditionalConnector) {
			result = interprete_se_mdh_progresside_remes_ConditionalConnector((se.mdh.progresside.remes.ConditionalConnector) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof se.mdh.progresside.remes.SubMode) {
			result = interprete_se_mdh_progresside_remes_SubMode((se.mdh.progresside.remes.SubMode) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof se.mdh.progresside.remes.CompositeMode) {
			result = interprete_se_mdh_progresside_remes_CompositeMode((se.mdh.progresside.remes.CompositeMode) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof se.mdh.progresside.remes.Mode) {
			result = interprete_se_mdh_progresside_remes_Mode((se.mdh.progresside.remes.Mode) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof se.mdh.progresside.remes.ControlPath) {
			result = interprete_se_mdh_progresside_remes_ControlPath((se.mdh.progresside.remes.ControlPath) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof se.mdh.progresside.remes.RemesDiagram) {
			result = interprete_se_mdh_progresside_remes_RemesDiagram((se.mdh.progresside.remes.RemesDiagram) object, context);
		}
		if (result != null) {
			return result;
		}
		return result;
	}
	
	public ResultType interprete_se_mdh_progresside_remes_RemesDiagram(se.mdh.progresside.remes.RemesDiagram object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_se_mdh_progresside_remes_ControlPath(se.mdh.progresside.remes.ControlPath object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_se_mdh_progresside_remes_Mode(se.mdh.progresside.remes.Mode object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_se_mdh_progresside_remes_CompositeMode(se.mdh.progresside.remes.CompositeMode object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_se_mdh_progresside_remes_SubMode(se.mdh.progresside.remes.SubMode object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_se_mdh_progresside_remes_ConditionalConnector(se.mdh.progresside.remes.ConditionalConnector object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_se_mdh_progresside_remes_Point(se.mdh.progresside.remes.Point object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_se_mdh_progresside_remes_InitPoint(se.mdh.progresside.remes.InitPoint object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_se_mdh_progresside_remes_EntryPoint(se.mdh.progresside.remes.EntryPoint object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_se_mdh_progresside_remes_ExitPoint(se.mdh.progresside.remes.ExitPoint object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_se_mdh_progresside_remes_CompositeEntryPoint(se.mdh.progresside.remes.CompositeEntryPoint object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_se_mdh_progresside_remes_CompositeExitPoint(se.mdh.progresside.remes.CompositeExitPoint object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_se_mdh_progresside_remes_Edge(se.mdh.progresside.remes.Edge object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_se_mdh_progresside_remes_InitEdge(se.mdh.progresside.remes.InitEdge object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_se_mdh_progresside_remes_Referable(se.mdh.progresside.remes.Referable object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_se_mdh_progresside_remes_Variable(se.mdh.progresside.remes.Variable object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_se_mdh_progresside_remes_Resource(se.mdh.progresside.remes.Resource object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_se_mdh_progresside_remes_Constant(se.mdh.progresside.remes.Constant object, ContextType context) {
		return null;
	}
	
	public void addObjectToInterprete(org.eclipse.emf.ecore.EObject object) {
		interpretationStack.push(object);
	}
	
}
