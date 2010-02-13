package se.mdh.progresside.remes.diagram.part;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import java.util.Map;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;

import se.mdh.progresside.remes.CompositeEntryPoint;
import se.mdh.progresside.remes.CompositeExitPoint;
import se.mdh.progresside.remes.CompositeMode;
import se.mdh.progresside.remes.ConditionalConnector;
import se.mdh.progresside.remes.Edge;
import se.mdh.progresside.remes.EntryPoint;
import se.mdh.progresside.remes.ExitPoint;
import se.mdh.progresside.remes.InitEdge;
import se.mdh.progresside.remes.InitPoint;
import se.mdh.progresside.remes.Mode;
import se.mdh.progresside.remes.RemesDiagram;
import se.mdh.progresside.remes.RemesPackage;
import se.mdh.progresside.remes.Resource;
import se.mdh.progresside.remes.SubMode;
import se.mdh.progresside.remes.Variable;
import se.mdh.progresside.remes.diagram.edit.parts.CompositeEntryPointEditPart;
import se.mdh.progresside.remes.diagram.edit.parts.CompositeExitPointEditPart;
import se.mdh.progresside.remes.diagram.edit.parts.CompositeModeCompositeModeCompartmentEditPart;
import se.mdh.progresside.remes.diagram.edit.parts.CompositeModeCompositeModeVariablesCompartmentEditPart;
import se.mdh.progresside.remes.diagram.edit.parts.CompositeModeEditPart;
import se.mdh.progresside.remes.diagram.edit.parts.ConditionalConnectorEditPart;
import se.mdh.progresside.remes.diagram.edit.parts.EdgeEditPart;
import se.mdh.progresside.remes.diagram.edit.parts.EntryPoint2EditPart;
import se.mdh.progresside.remes.diagram.edit.parts.EntryPoint3EditPart;
import se.mdh.progresside.remes.diagram.edit.parts.EntryPoint4EditPart;
import se.mdh.progresside.remes.diagram.edit.parts.EntryPointEditPart;
import se.mdh.progresside.remes.diagram.edit.parts.ExitPoint2EditPart;
import se.mdh.progresside.remes.diagram.edit.parts.ExitPoint3EditPart;
import se.mdh.progresside.remes.diagram.edit.parts.ExitPoint4EditPart;
import se.mdh.progresside.remes.diagram.edit.parts.ExitPointEditPart;
import se.mdh.progresside.remes.diagram.edit.parts.InitEdgeEditPart;
import se.mdh.progresside.remes.diagram.edit.parts.InitPointEditPart;
import se.mdh.progresside.remes.diagram.edit.parts.RemesDiagramEditPart;
import se.mdh.progresside.remes.diagram.edit.parts.Resource2EditPart;
import se.mdh.progresside.remes.diagram.edit.parts.ResourceEditPart;
import se.mdh.progresside.remes.diagram.edit.parts.SubMode2EditPart;
import se.mdh.progresside.remes.diagram.edit.parts.SubModeEditPart;
import se.mdh.progresside.remes.diagram.edit.parts.SubModeSubModeResourcesCompartment2EditPart;
import se.mdh.progresside.remes.diagram.edit.parts.SubModeSubModeResourcesCompartmentEditPart;
import se.mdh.progresside.remes.diagram.edit.parts.SubModeSubModeVariablesCompartment2EditPart;
import se.mdh.progresside.remes.diagram.edit.parts.SubModeSubModeVariablesCompartmentEditPart;
import se.mdh.progresside.remes.diagram.edit.parts.Variable2EditPart;
import se.mdh.progresside.remes.diagram.edit.parts.Variable3EditPart;
import se.mdh.progresside.remes.diagram.edit.parts.VariableEditPart;
import se.mdh.progresside.remes.diagram.providers.RemesElementTypes;

/**
 * @generated
 */
public class RemesDiagramUpdater {

	/**
	 * @generated
	 */
	public static List getSemanticChildren(View view) {
		switch (RemesVisualIDRegistry.getVisualID(view)) {
		case SubModeEditPart.VISUAL_ID:
			return getSubMode_2001SemanticChildren(view);
		case CompositeModeEditPart.VISUAL_ID:
			return getCompositeMode_2002SemanticChildren(view);
		case SubMode2EditPart.VISUAL_ID:
			return getSubMode_3003SemanticChildren(view);
		case ConditionalConnectorEditPart.VISUAL_ID:
			return getConditionalConnector_3006SemanticChildren(view);
		case SubModeSubModeVariablesCompartmentEditPart.VISUAL_ID:
			return getSubModeSubModeVariablesCompartment_7001SemanticChildren(view);
		case SubModeSubModeResourcesCompartmentEditPart.VISUAL_ID:
			return getSubModeSubModeResourcesCompartment_7002SemanticChildren(view);
		case CompositeModeCompositeModeVariablesCompartmentEditPart.VISUAL_ID:
			return getCompositeModeCompositeModeVariablesCompartment_7003SemanticChildren(view);
		case CompositeModeCompositeModeCompartmentEditPart.VISUAL_ID:
			return getCompositeModeCompositeModeCompartment_7004SemanticChildren(view);
		case SubModeSubModeVariablesCompartment2EditPart.VISUAL_ID:
			return getSubModeSubModeVariablesCompartment_7005SemanticChildren(view);
		case SubModeSubModeResourcesCompartment2EditPart.VISUAL_ID:
			return getSubModeSubModeResourcesCompartment_7006SemanticChildren(view);
		case RemesDiagramEditPart.VISUAL_ID:
			return getRemesDiagram_1000SemanticChildren(view);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getSubMode_2001SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		SubMode modelElement = (SubMode) view.getElement();
		List result = new LinkedList();
		{
			EntryPoint childElement = modelElement.getEntryPoint();
			int visualID = RemesVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == EntryPointEditPart.VISUAL_ID) {
				result.add(new RemesNodeDescriptor(childElement, visualID));
			}
		}
		{
			ExitPoint childElement = modelElement.getExitPoint();
			int visualID = RemesVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ExitPointEditPart.VISUAL_ID) {
				result.add(new RemesNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getCompositeMode_2002SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		CompositeMode modelElement = (CompositeMode) view.getElement();
		List result = new LinkedList();
		{
			EntryPoint childElement = modelElement.getEntryPoint();
			int visualID = RemesVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == EntryPoint4EditPart.VISUAL_ID) {
				result.add(new RemesNodeDescriptor(childElement, visualID));
			}
		}
		{
			ExitPoint childElement = modelElement.getExitPoint();
			int visualID = RemesVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ExitPoint4EditPart.VISUAL_ID) {
				result.add(new RemesNodeDescriptor(childElement, visualID));
			}
		}
		{
			InitPoint childElement = modelElement.getInitPoint();
			int visualID = RemesVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == InitPointEditPart.VISUAL_ID) {
				result.add(new RemesNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getSubMode_3003SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		SubMode modelElement = (SubMode) view.getElement();
		List result = new LinkedList();
		{
			EntryPoint childElement = modelElement.getEntryPoint();
			int visualID = RemesVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == EntryPoint2EditPart.VISUAL_ID) {
				result.add(new RemesNodeDescriptor(childElement, visualID));
			}
		}
		{
			ExitPoint childElement = modelElement.getExitPoint();
			int visualID = RemesVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ExitPoint2EditPart.VISUAL_ID) {
				result.add(new RemesNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getConditionalConnector_3006SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		ConditionalConnector modelElement = (ConditionalConnector) view
				.getElement();
		List result = new LinkedList();
		{
			EntryPoint childElement = modelElement.getEntryPoint();
			int visualID = RemesVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == EntryPoint3EditPart.VISUAL_ID) {
				result.add(new RemesNodeDescriptor(childElement, visualID));
			}
		}
		{
			ExitPoint childElement = modelElement.getExitPoint();
			int visualID = RemesVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ExitPoint3EditPart.VISUAL_ID) {
				result.add(new RemesNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getSubModeSubModeVariablesCompartment_7001SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		SubMode modelElement = (SubMode) containerView.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getVariables().iterator(); it.hasNext();) {
			Variable childElement = (Variable) it.next();
			int visualID = RemesVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == VariableEditPart.VISUAL_ID) {
				result.add(new RemesNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getSubModeSubModeResourcesCompartment_7002SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		SubMode modelElement = (SubMode) containerView.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getResources().iterator(); it.hasNext();) {
			Resource childElement = (Resource) it.next();
			int visualID = RemesVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ResourceEditPart.VISUAL_ID) {
				result.add(new RemesNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getCompositeModeCompositeModeVariablesCompartment_7003SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		CompositeMode modelElement = (CompositeMode) containerView.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getVariables().iterator(); it.hasNext();) {
			Variable childElement = (Variable) it.next();
			int visualID = RemesVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Variable3EditPart.VISUAL_ID) {
				result.add(new RemesNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getCompositeModeCompositeModeCompartment_7004SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		CompositeMode modelElement = (CompositeMode) containerView.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getSubModes().iterator(); it.hasNext();) {
			SubMode childElement = (SubMode) it.next();
			int visualID = RemesVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == SubMode2EditPart.VISUAL_ID) {
				result.add(new RemesNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator it = modelElement.getConditionalConnectors().iterator(); it
				.hasNext();) {
			ConditionalConnector childElement = (ConditionalConnector) it
					.next();
			int visualID = RemesVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ConditionalConnectorEditPart.VISUAL_ID) {
				result.add(new RemesNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		{
			CompositeEntryPoint childElement = modelElement
					.getCompositeEntryPoint();
			int visualID = RemesVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == CompositeEntryPointEditPart.VISUAL_ID) {
				result.add(new RemesNodeDescriptor(childElement, visualID));
			}
		}
		{
			CompositeExitPoint childElement = modelElement
					.getCompositeExitPoint();
			int visualID = RemesVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == CompositeExitPointEditPart.VISUAL_ID) {
				result.add(new RemesNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getSubModeSubModeVariablesCompartment_7005SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		SubMode modelElement = (SubMode) containerView.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getVariables().iterator(); it.hasNext();) {
			Variable childElement = (Variable) it.next();
			int visualID = RemesVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Variable2EditPart.VISUAL_ID) {
				result.add(new RemesNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getSubModeSubModeResourcesCompartment_7006SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		SubMode modelElement = (SubMode) containerView.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getResources().iterator(); it.hasNext();) {
			Resource childElement = (Resource) it.next();
			int visualID = RemesVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Resource2EditPart.VISUAL_ID) {
				result.add(new RemesNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getRemesDiagram_1000SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		RemesDiagram modelElement = (RemesDiagram) view.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getModes().iterator(); it.hasNext();) {
			Mode childElement = (Mode) it.next();
			int visualID = RemesVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == SubModeEditPart.VISUAL_ID) {
				result.add(new RemesNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CompositeModeEditPart.VISUAL_ID) {
				result.add(new RemesNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getContainedLinks(View view) {
		switch (RemesVisualIDRegistry.getVisualID(view)) {
		case RemesDiagramEditPart.VISUAL_ID:
			return getRemesDiagram_1000ContainedLinks(view);
		case SubModeEditPart.VISUAL_ID:
			return getSubMode_2001ContainedLinks(view);
		case CompositeModeEditPart.VISUAL_ID:
			return getCompositeMode_2002ContainedLinks(view);
		case VariableEditPart.VISUAL_ID:
			return getVariable_3001ContainedLinks(view);
		case ResourceEditPart.VISUAL_ID:
			return getResource_3002ContainedLinks(view);
		case EntryPointEditPart.VISUAL_ID:
			return getEntryPoint_3008ContainedLinks(view);
		case ExitPointEditPart.VISUAL_ID:
			return getExitPoint_3009ContainedLinks(view);
		case SubMode2EditPart.VISUAL_ID:
			return getSubMode_3003ContainedLinks(view);
		case Variable2EditPart.VISUAL_ID:
			return getVariable_3004ContainedLinks(view);
		case Resource2EditPart.VISUAL_ID:
			return getResource_3005ContainedLinks(view);
		case EntryPoint2EditPart.VISUAL_ID:
			return getEntryPoint_3010ContainedLinks(view);
		case ExitPoint2EditPart.VISUAL_ID:
			return getExitPoint_3011ContainedLinks(view);
		case ConditionalConnectorEditPart.VISUAL_ID:
			return getConditionalConnector_3006ContainedLinks(view);
		case EntryPoint3EditPart.VISUAL_ID:
			return getEntryPoint_3012ContainedLinks(view);
		case ExitPoint3EditPart.VISUAL_ID:
			return getExitPoint_3013ContainedLinks(view);
		case Variable3EditPart.VISUAL_ID:
			return getVariable_3007ContainedLinks(view);
		case EntryPoint4EditPart.VISUAL_ID:
			return getEntryPoint_3014ContainedLinks(view);
		case ExitPoint4EditPart.VISUAL_ID:
			return getExitPoint_3015ContainedLinks(view);
		case CompositeEntryPointEditPart.VISUAL_ID:
			return getCompositeEntryPoint_3016ContainedLinks(view);
		case CompositeExitPointEditPart.VISUAL_ID:
			return getCompositeExitPoint_3017ContainedLinks(view);
		case InitPointEditPart.VISUAL_ID:
			return getInitPoint_3018ContainedLinks(view);
		case EdgeEditPart.VISUAL_ID:
			return getEdge_4001ContainedLinks(view);
		case InitEdgeEditPart.VISUAL_ID:
			return getInitEdge_4002ContainedLinks(view);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getIncomingLinks(View view) {
		switch (RemesVisualIDRegistry.getVisualID(view)) {
		case SubModeEditPart.VISUAL_ID:
			return getSubMode_2001IncomingLinks(view);
		case CompositeModeEditPart.VISUAL_ID:
			return getCompositeMode_2002IncomingLinks(view);
		case VariableEditPart.VISUAL_ID:
			return getVariable_3001IncomingLinks(view);
		case ResourceEditPart.VISUAL_ID:
			return getResource_3002IncomingLinks(view);
		case EntryPointEditPart.VISUAL_ID:
			return getEntryPoint_3008IncomingLinks(view);
		case ExitPointEditPart.VISUAL_ID:
			return getExitPoint_3009IncomingLinks(view);
		case SubMode2EditPart.VISUAL_ID:
			return getSubMode_3003IncomingLinks(view);
		case Variable2EditPart.VISUAL_ID:
			return getVariable_3004IncomingLinks(view);
		case Resource2EditPart.VISUAL_ID:
			return getResource_3005IncomingLinks(view);
		case EntryPoint2EditPart.VISUAL_ID:
			return getEntryPoint_3010IncomingLinks(view);
		case ExitPoint2EditPart.VISUAL_ID:
			return getExitPoint_3011IncomingLinks(view);
		case ConditionalConnectorEditPart.VISUAL_ID:
			return getConditionalConnector_3006IncomingLinks(view);
		case EntryPoint3EditPart.VISUAL_ID:
			return getEntryPoint_3012IncomingLinks(view);
		case ExitPoint3EditPart.VISUAL_ID:
			return getExitPoint_3013IncomingLinks(view);
		case Variable3EditPart.VISUAL_ID:
			return getVariable_3007IncomingLinks(view);
		case EntryPoint4EditPart.VISUAL_ID:
			return getEntryPoint_3014IncomingLinks(view);
		case ExitPoint4EditPart.VISUAL_ID:
			return getExitPoint_3015IncomingLinks(view);
		case CompositeEntryPointEditPart.VISUAL_ID:
			return getCompositeEntryPoint_3016IncomingLinks(view);
		case CompositeExitPointEditPart.VISUAL_ID:
			return getCompositeExitPoint_3017IncomingLinks(view);
		case InitPointEditPart.VISUAL_ID:
			return getInitPoint_3018IncomingLinks(view);
		case EdgeEditPart.VISUAL_ID:
			return getEdge_4001IncomingLinks(view);
		case InitEdgeEditPart.VISUAL_ID:
			return getInitEdge_4002IncomingLinks(view);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getOutgoingLinks(View view) {
		switch (RemesVisualIDRegistry.getVisualID(view)) {
		case SubModeEditPart.VISUAL_ID:
			return getSubMode_2001OutgoingLinks(view);
		case CompositeModeEditPart.VISUAL_ID:
			return getCompositeMode_2002OutgoingLinks(view);
		case VariableEditPart.VISUAL_ID:
			return getVariable_3001OutgoingLinks(view);
		case ResourceEditPart.VISUAL_ID:
			return getResource_3002OutgoingLinks(view);
		case EntryPointEditPart.VISUAL_ID:
			return getEntryPoint_3008OutgoingLinks(view);
		case ExitPointEditPart.VISUAL_ID:
			return getExitPoint_3009OutgoingLinks(view);
		case SubMode2EditPart.VISUAL_ID:
			return getSubMode_3003OutgoingLinks(view);
		case Variable2EditPart.VISUAL_ID:
			return getVariable_3004OutgoingLinks(view);
		case Resource2EditPart.VISUAL_ID:
			return getResource_3005OutgoingLinks(view);
		case EntryPoint2EditPart.VISUAL_ID:
			return getEntryPoint_3010OutgoingLinks(view);
		case ExitPoint2EditPart.VISUAL_ID:
			return getExitPoint_3011OutgoingLinks(view);
		case ConditionalConnectorEditPart.VISUAL_ID:
			return getConditionalConnector_3006OutgoingLinks(view);
		case EntryPoint3EditPart.VISUAL_ID:
			return getEntryPoint_3012OutgoingLinks(view);
		case ExitPoint3EditPart.VISUAL_ID:
			return getExitPoint_3013OutgoingLinks(view);
		case Variable3EditPart.VISUAL_ID:
			return getVariable_3007OutgoingLinks(view);
		case EntryPoint4EditPart.VISUAL_ID:
			return getEntryPoint_3014OutgoingLinks(view);
		case ExitPoint4EditPart.VISUAL_ID:
			return getExitPoint_3015OutgoingLinks(view);
		case CompositeEntryPointEditPart.VISUAL_ID:
			return getCompositeEntryPoint_3016OutgoingLinks(view);
		case CompositeExitPointEditPart.VISUAL_ID:
			return getCompositeExitPoint_3017OutgoingLinks(view);
		case InitPointEditPart.VISUAL_ID:
			return getInitPoint_3018OutgoingLinks(view);
		case EdgeEditPart.VISUAL_ID:
			return getEdge_4001OutgoingLinks(view);
		case InitEdgeEditPart.VISUAL_ID:
			return getInitEdge_4002OutgoingLinks(view);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getRemesDiagram_1000ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getSubMode_2001ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCompositeMode_2002ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getVariable_3001ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getResource_3002ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getEntryPoint_3008ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getExitPoint_3009ContainedLinks(View view) {
		ExitPoint modelElement = (ExitPoint) view.getElement();
		List result = new LinkedList();
		result.addAll(getContainedTypeModelFacetLinks_Edge_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getSubMode_3003ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getVariable_3004ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getResource_3005ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getConditionalConnector_3006ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getVariable_3007ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getEntryPoint_3014ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getExitPoint_3015ContainedLinks(View view) {
		ExitPoint modelElement = (ExitPoint) view.getElement();
		List result = new LinkedList();
		result.addAll(getContainedTypeModelFacetLinks_Edge_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getCompositeEntryPoint_3016ContainedLinks(View view) {
		CompositeEntryPoint modelElement = (CompositeEntryPoint) view
				.getElement();
		List result = new LinkedList();
		result.addAll(getContainedTypeModelFacetLinks_Edge_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getCompositeExitPoint_3017ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getInitPoint_3018ContainedLinks(View view) {
		InitPoint modelElement = (InitPoint) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getContainedTypeModelFacetLinks_InitEdge_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getEntryPoint_3012ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getExitPoint_3013ContainedLinks(View view) {
		ExitPoint modelElement = (ExitPoint) view.getElement();
		List result = new LinkedList();
		result.addAll(getContainedTypeModelFacetLinks_Edge_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getEntryPoint_3010ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getExitPoint_3011ContainedLinks(View view) {
		ExitPoint modelElement = (ExitPoint) view.getElement();
		List result = new LinkedList();
		result.addAll(getContainedTypeModelFacetLinks_Edge_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getEdge_4001ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getInitEdge_4002ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getSubMode_2001IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCompositeMode_2002IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getVariable_3001IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getResource_3002IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getEntryPoint_3008IncomingLinks(View view) {
		EntryPoint modelElement = (EntryPoint) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_Edge_4001(modelElement,
				crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_InitEdge_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getExitPoint_3009IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getSubMode_3003IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getVariable_3004IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getResource_3005IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getConditionalConnector_3006IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getVariable_3007IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getEntryPoint_3014IncomingLinks(View view) {
		EntryPoint modelElement = (EntryPoint) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_Edge_4001(modelElement,
				crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_InitEdge_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getExitPoint_3015IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCompositeEntryPoint_3016IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCompositeExitPoint_3017IncomingLinks(View view) {
		CompositeExitPoint modelElement = (CompositeExitPoint) view
				.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_Edge_4001(modelElement,
				crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_InitEdge_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getInitPoint_3018IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getEntryPoint_3012IncomingLinks(View view) {
		EntryPoint modelElement = (EntryPoint) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_Edge_4001(modelElement,
				crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_InitEdge_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getExitPoint_3013IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getEntryPoint_3010IncomingLinks(View view) {
		EntryPoint modelElement = (EntryPoint) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_Edge_4001(modelElement,
				crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_InitEdge_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getExitPoint_3011IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getEdge_4001IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getInitEdge_4002IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getSubMode_2001OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCompositeMode_2002OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getVariable_3001OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getResource_3002OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getEntryPoint_3008OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getExitPoint_3009OutgoingLinks(View view) {
		ExitPoint modelElement = (ExitPoint) view.getElement();
		List result = new LinkedList();
		result.addAll(getOutgoingTypeModelFacetLinks_Edge_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getSubMode_3003OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getVariable_3004OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getResource_3005OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getConditionalConnector_3006OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getVariable_3007OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getEntryPoint_3014OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getExitPoint_3015OutgoingLinks(View view) {
		ExitPoint modelElement = (ExitPoint) view.getElement();
		List result = new LinkedList();
		result.addAll(getOutgoingTypeModelFacetLinks_Edge_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getCompositeEntryPoint_3016OutgoingLinks(View view) {
		CompositeEntryPoint modelElement = (CompositeEntryPoint) view
				.getElement();
		List result = new LinkedList();
		result.addAll(getOutgoingTypeModelFacetLinks_Edge_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getCompositeExitPoint_3017OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getInitPoint_3018OutgoingLinks(View view) {
		InitPoint modelElement = (InitPoint) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_InitEdge_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getEntryPoint_3012OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getExitPoint_3013OutgoingLinks(View view) {
		ExitPoint modelElement = (ExitPoint) view.getElement();
		List result = new LinkedList();
		result.addAll(getOutgoingTypeModelFacetLinks_Edge_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getEntryPoint_3010OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getExitPoint_3011OutgoingLinks(View view) {
		ExitPoint modelElement = (ExitPoint) view.getElement();
		List result = new LinkedList();
		result.addAll(getOutgoingTypeModelFacetLinks_Edge_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getEdge_4001OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getInitEdge_4002OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	private static Collection getContainedTypeModelFacetLinks_Edge_4001(
			ExitPoint container) {
		Collection result = new LinkedList();
		for (Iterator links = container.getExitEdges().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Edge) {
				continue;
			}
			Edge link = (Edge) linkObject;
			if (EdgeEditPart.VISUAL_ID != RemesVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			EntryPoint dst = link.getConnectTo();
			ExitPoint src = link.getConnectFrom();
			result.add(new RemesLinkDescriptor(src, dst, link,
					RemesElementTypes.Edge_4001, EdgeEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getContainedTypeModelFacetLinks_InitEdge_4002(
			InitPoint container) {
		Collection result = new LinkedList();
		InitEdge link = container.getInitEdge();
		if (InitEdgeEditPart.VISUAL_ID != RemesVisualIDRegistry
				.getLinkWithClassVisualID(link)) {
			return result;
		}
		EntryPoint dst = link.getConnectTo();
		InitPoint src = link.getConnectFrom();
		result.add(new RemesLinkDescriptor(src, dst, link,
				RemesElementTypes.InitEdge_4002, InitEdgeEditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingTypeModelFacetLinks_Edge_4001(
			EntryPoint target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() != RemesPackage.eINSTANCE
					.getEdge_ConnectTo()
					|| false == setting.getEObject() instanceof Edge) {
				continue;
			}
			Edge link = (Edge) setting.getEObject();
			if (EdgeEditPart.VISUAL_ID != RemesVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			ExitPoint src = link.getConnectFrom();
			result.add(new RemesLinkDescriptor(src, target, link,
					RemesElementTypes.Edge_4001, EdgeEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingTypeModelFacetLinks_InitEdge_4002(
			EntryPoint target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() != RemesPackage.eINSTANCE
					.getInitEdge_ConnectTo()
					|| false == setting.getEObject() instanceof InitEdge) {
				continue;
			}
			InitEdge link = (InitEdge) setting.getEObject();
			if (InitEdgeEditPart.VISUAL_ID != RemesVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			InitPoint src = link.getConnectFrom();
			result
					.add(new RemesLinkDescriptor(src, target, link,
							RemesElementTypes.InitEdge_4002,
							InitEdgeEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingTypeModelFacetLinks_Edge_4001(
			ExitPoint source) {
		ExitPoint container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof ExitPoint) {
				container = (ExitPoint) element;
			}
		}
		if (container == null) {
			return Collections.EMPTY_LIST;
		}
		Collection result = new LinkedList();
		for (Iterator links = container.getExitEdges().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Edge) {
				continue;
			}
			Edge link = (Edge) linkObject;
			if (EdgeEditPart.VISUAL_ID != RemesVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			EntryPoint dst = link.getConnectTo();
			ExitPoint src = link.getConnectFrom();
			if (src != source) {
				continue;
			}
			result.add(new RemesLinkDescriptor(src, dst, link,
					RemesElementTypes.Edge_4001, EdgeEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingTypeModelFacetLinks_InitEdge_4002(
			InitPoint source) {
		InitPoint container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof InitPoint) {
				container = (InitPoint) element;
			}
		}
		if (container == null) {
			return Collections.EMPTY_LIST;
		}
		Collection result = new LinkedList();
		InitEdge link = container.getInitEdge();
		if (InitEdgeEditPart.VISUAL_ID != RemesVisualIDRegistry
				.getLinkWithClassVisualID(link)) {
			return result;
		}
		EntryPoint dst = link.getConnectTo();
		InitPoint src = link.getConnectFrom();
		if (src != source) {
			return result;
		}
		result.add(new RemesLinkDescriptor(src, dst, link,
				RemesElementTypes.InitEdge_4002, InitEdgeEditPart.VISUAL_ID));
		return result;
	}

}
