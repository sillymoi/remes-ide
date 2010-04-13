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
import se.mdh.progresside.remes.Constant;
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
import se.mdh.progresside.remes.diagram.edit.parts.CompositeModeCompositeModeConstantsCompartmentEditPart;
import se.mdh.progresside.remes.diagram.edit.parts.CompositeModeCompositeModeResourcesCompartmentEditPart;
import se.mdh.progresside.remes.diagram.edit.parts.CompositeModeCompositeModeVariablesCompartmentEditPart;
import se.mdh.progresside.remes.diagram.edit.parts.CompositeModeEditPart;
import se.mdh.progresside.remes.diagram.edit.parts.ConditionalConnectorEditPart;
import se.mdh.progresside.remes.diagram.edit.parts.Constant2EditPart;
import se.mdh.progresside.remes.diagram.edit.parts.Constant3EditPart;
import se.mdh.progresside.remes.diagram.edit.parts.ConstantEditPart;
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
import se.mdh.progresside.remes.diagram.edit.parts.Resource3EditPart;
import se.mdh.progresside.remes.diagram.edit.parts.ResourceEditPart;
import se.mdh.progresside.remes.diagram.edit.parts.SubMode2EditPart;
import se.mdh.progresside.remes.diagram.edit.parts.SubModeEditPart;
import se.mdh.progresside.remes.diagram.edit.parts.SubModeSubModeConstantsCompartmentEditPart;
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
			return getSubMode_2007SemanticChildren(view);
		case CompositeModeEditPart.VISUAL_ID:
			return getCompositeMode_2008SemanticChildren(view);
		case SubMode2EditPart.VISUAL_ID:
			return getSubMode_3026SemanticChildren(view);
		case ConditionalConnectorEditPart.VISUAL_ID:
			return getConditionalConnector_3031SemanticChildren(view);
		case SubModeSubModeConstantsCompartmentEditPart.VISUAL_ID:
			return getSubModeSubModeConstantsCompartment_7019SemanticChildren(view);
		case SubModeSubModeVariablesCompartmentEditPart.VISUAL_ID:
			return getSubModeSubModeVariablesCompartment_7020SemanticChildren(view);
		case SubModeSubModeResourcesCompartmentEditPart.VISUAL_ID:
			return getSubModeSubModeResourcesCompartment_7027SemanticChildren(view);
		case CompositeModeCompositeModeConstantsCompartmentEditPart.VISUAL_ID:
			return getCompositeModeCompositeModeConstantsCompartment_7026SemanticChildren(view);
		case CompositeModeCompositeModeVariablesCompartmentEditPart.VISUAL_ID:
			return getCompositeModeCompositeModeVariablesCompartment_7021SemanticChildren(view);
		case CompositeModeCompositeModeResourcesCompartmentEditPart.VISUAL_ID:
			return getCompositeModeCompositeModeResourcesCompartment_7022SemanticChildren(view);
		case CompositeModeCompositeModeCompartmentEditPart.VISUAL_ID:
			return getCompositeModeCompositeModeCompartment_7025SemanticChildren(view);
		case SubModeSubModeVariablesCompartment2EditPart.VISUAL_ID:
			return getSubModeSubModeVariablesCompartment_7024SemanticChildren(view);
		case SubModeSubModeResourcesCompartment2EditPart.VISUAL_ID:
			return getSubModeSubModeResourcesCompartment_7028SemanticChildren(view);
		case RemesDiagramEditPart.VISUAL_ID:
			return getRemesDiagram_1000SemanticChildren(view);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getSubMode_2007SemanticChildren(View view) {
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
	public static List getCompositeMode_2008SemanticChildren(View view) {
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
	public static List getSubMode_3026SemanticChildren(View view) {
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
		for (Iterator it = modelElement.getConstants().iterator(); it.hasNext();) {
			Constant childElement = (Constant) it.next();
			int visualID = RemesVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Constant2EditPart.VISUAL_ID) {
				result.add(new RemesNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getConditionalConnector_3031SemanticChildren(View view) {
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
	public static List getSubModeSubModeConstantsCompartment_7019SemanticChildren(
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
		for (Iterator it = modelElement.getConstants().iterator(); it.hasNext();) {
			Constant childElement = (Constant) it.next();
			int visualID = RemesVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ConstantEditPart.VISUAL_ID) {
				result.add(new RemesNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getSubModeSubModeVariablesCompartment_7020SemanticChildren(
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
	public static List getSubModeSubModeResourcesCompartment_7027SemanticChildren(
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
	public static List getCompositeModeCompositeModeVariablesCompartment_7021SemanticChildren(
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
	public static List getCompositeModeCompositeModeResourcesCompartment_7022SemanticChildren(
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
		for (Iterator it = modelElement.getResources().iterator(); it.hasNext();) {
			Resource childElement = (Resource) it.next();
			int visualID = RemesVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Resource3EditPart.VISUAL_ID) {
				result.add(new RemesNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getCompositeModeCompositeModeCompartment_7025SemanticChildren(
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
	public static List getCompositeModeCompositeModeConstantsCompartment_7026SemanticChildren(
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
		for (Iterator it = modelElement.getConstants().iterator(); it.hasNext();) {
			Constant childElement = (Constant) it.next();
			int visualID = RemesVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Constant3EditPart.VISUAL_ID) {
				result.add(new RemesNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getSubModeSubModeVariablesCompartment_7024SemanticChildren(
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
	public static List getSubModeSubModeResourcesCompartment_7028SemanticChildren(
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
			return getSubMode_2007ContainedLinks(view);
		case CompositeModeEditPart.VISUAL_ID:
			return getCompositeMode_2008ContainedLinks(view);
		case VariableEditPart.VISUAL_ID:
			return getVariable_3022ContainedLinks(view);
		case ResourceEditPart.VISUAL_ID:
			return getResource_3023ContainedLinks(view);
		case EntryPointEditPart.VISUAL_ID:
			return getEntryPoint_3024ContainedLinks(view);
		case ExitPointEditPart.VISUAL_ID:
			return getExitPoint_3025ContainedLinks(view);
		case ConstantEditPart.VISUAL_ID:
			return getConstant_3041ContainedLinks(view);
		case SubMode2EditPart.VISUAL_ID:
			return getSubMode_3026ContainedLinks(view);
		case Variable2EditPart.VISUAL_ID:
			return getVariable_3027ContainedLinks(view);
		case Resource2EditPart.VISUAL_ID:
			return getResource_3028ContainedLinks(view);
		case EntryPoint2EditPart.VISUAL_ID:
			return getEntryPoint_3029ContainedLinks(view);
		case ExitPoint2EditPart.VISUAL_ID:
			return getExitPoint_3030ContainedLinks(view);
		case Constant2EditPart.VISUAL_ID:
			return getConstant_3042ContainedLinks(view);
		case ConditionalConnectorEditPart.VISUAL_ID:
			return getConditionalConnector_3031ContainedLinks(view);
		case EntryPoint3EditPart.VISUAL_ID:
			return getEntryPoint_3032ContainedLinks(view);
		case ExitPoint3EditPart.VISUAL_ID:
			return getExitPoint_3033ContainedLinks(view);
		case Variable3EditPart.VISUAL_ID:
			return getVariable_3034ContainedLinks(view);
		case EntryPoint4EditPart.VISUAL_ID:
			return getEntryPoint_3035ContainedLinks(view);
		case ExitPoint4EditPart.VISUAL_ID:
			return getExitPoint_3036ContainedLinks(view);
		case CompositeEntryPointEditPart.VISUAL_ID:
			return getCompositeEntryPoint_3037ContainedLinks(view);
		case CompositeExitPointEditPart.VISUAL_ID:
			return getCompositeExitPoint_3038ContainedLinks(view);
		case InitPointEditPart.VISUAL_ID:
			return getInitPoint_3039ContainedLinks(view);
		case Resource3EditPart.VISUAL_ID:
			return getResource_3040ContainedLinks(view);
		case Constant3EditPart.VISUAL_ID:
			return getConstant_3043ContainedLinks(view);
		case EdgeEditPart.VISUAL_ID:
			return getEdge_4028ContainedLinks(view);
		case InitEdgeEditPart.VISUAL_ID:
			return getInitEdge_4029ContainedLinks(view);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getIncomingLinks(View view) {
		switch (RemesVisualIDRegistry.getVisualID(view)) {
		case SubModeEditPart.VISUAL_ID:
			return getSubMode_2007IncomingLinks(view);
		case CompositeModeEditPart.VISUAL_ID:
			return getCompositeMode_2008IncomingLinks(view);
		case VariableEditPart.VISUAL_ID:
			return getVariable_3022IncomingLinks(view);
		case ResourceEditPart.VISUAL_ID:
			return getResource_3023IncomingLinks(view);
		case EntryPointEditPart.VISUAL_ID:
			return getEntryPoint_3024IncomingLinks(view);
		case ExitPointEditPart.VISUAL_ID:
			return getExitPoint_3025IncomingLinks(view);
		case ConstantEditPart.VISUAL_ID:
			return getConstant_3041IncomingLinks(view);
		case SubMode2EditPart.VISUAL_ID:
			return getSubMode_3026IncomingLinks(view);
		case Variable2EditPart.VISUAL_ID:
			return getVariable_3027IncomingLinks(view);
		case Resource2EditPart.VISUAL_ID:
			return getResource_3028IncomingLinks(view);
		case EntryPoint2EditPart.VISUAL_ID:
			return getEntryPoint_3029IncomingLinks(view);
		case ExitPoint2EditPart.VISUAL_ID:
			return getExitPoint_3030IncomingLinks(view);
		case Constant2EditPart.VISUAL_ID:
			return getConstant_3042IncomingLinks(view);
		case ConditionalConnectorEditPart.VISUAL_ID:
			return getConditionalConnector_3031IncomingLinks(view);
		case EntryPoint3EditPart.VISUAL_ID:
			return getEntryPoint_3032IncomingLinks(view);
		case ExitPoint3EditPart.VISUAL_ID:
			return getExitPoint_3033IncomingLinks(view);
		case Variable3EditPart.VISUAL_ID:
			return getVariable_3034IncomingLinks(view);
		case EntryPoint4EditPart.VISUAL_ID:
			return getEntryPoint_3035IncomingLinks(view);
		case ExitPoint4EditPart.VISUAL_ID:
			return getExitPoint_3036IncomingLinks(view);
		case CompositeEntryPointEditPart.VISUAL_ID:
			return getCompositeEntryPoint_3037IncomingLinks(view);
		case CompositeExitPointEditPart.VISUAL_ID:
			return getCompositeExitPoint_3038IncomingLinks(view);
		case InitPointEditPart.VISUAL_ID:
			return getInitPoint_3039IncomingLinks(view);
		case Resource3EditPart.VISUAL_ID:
			return getResource_3040IncomingLinks(view);
		case Constant3EditPart.VISUAL_ID:
			return getConstant_3043IncomingLinks(view);
		case EdgeEditPart.VISUAL_ID:
			return getEdge_4028IncomingLinks(view);
		case InitEdgeEditPart.VISUAL_ID:
			return getInitEdge_4029IncomingLinks(view);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getOutgoingLinks(View view) {
		switch (RemesVisualIDRegistry.getVisualID(view)) {
		case SubModeEditPart.VISUAL_ID:
			return getSubMode_2007OutgoingLinks(view);
		case CompositeModeEditPart.VISUAL_ID:
			return getCompositeMode_2008OutgoingLinks(view);
		case VariableEditPart.VISUAL_ID:
			return getVariable_3022OutgoingLinks(view);
		case ResourceEditPart.VISUAL_ID:
			return getResource_3023OutgoingLinks(view);
		case EntryPointEditPart.VISUAL_ID:
			return getEntryPoint_3024OutgoingLinks(view);
		case ExitPointEditPart.VISUAL_ID:
			return getExitPoint_3025OutgoingLinks(view);
		case ConstantEditPart.VISUAL_ID:
			return getConstant_3041OutgoingLinks(view);
		case SubMode2EditPart.VISUAL_ID:
			return getSubMode_3026OutgoingLinks(view);
		case Variable2EditPart.VISUAL_ID:
			return getVariable_3027OutgoingLinks(view);
		case Resource2EditPart.VISUAL_ID:
			return getResource_3028OutgoingLinks(view);
		case EntryPoint2EditPart.VISUAL_ID:
			return getEntryPoint_3029OutgoingLinks(view);
		case ExitPoint2EditPart.VISUAL_ID:
			return getExitPoint_3030OutgoingLinks(view);
		case Constant2EditPart.VISUAL_ID:
			return getConstant_3042OutgoingLinks(view);
		case ConditionalConnectorEditPart.VISUAL_ID:
			return getConditionalConnector_3031OutgoingLinks(view);
		case EntryPoint3EditPart.VISUAL_ID:
			return getEntryPoint_3032OutgoingLinks(view);
		case ExitPoint3EditPart.VISUAL_ID:
			return getExitPoint_3033OutgoingLinks(view);
		case Variable3EditPart.VISUAL_ID:
			return getVariable_3034OutgoingLinks(view);
		case EntryPoint4EditPart.VISUAL_ID:
			return getEntryPoint_3035OutgoingLinks(view);
		case ExitPoint4EditPart.VISUAL_ID:
			return getExitPoint_3036OutgoingLinks(view);
		case CompositeEntryPointEditPart.VISUAL_ID:
			return getCompositeEntryPoint_3037OutgoingLinks(view);
		case CompositeExitPointEditPart.VISUAL_ID:
			return getCompositeExitPoint_3038OutgoingLinks(view);
		case InitPointEditPart.VISUAL_ID:
			return getInitPoint_3039OutgoingLinks(view);
		case Resource3EditPart.VISUAL_ID:
			return getResource_3040OutgoingLinks(view);
		case Constant3EditPart.VISUAL_ID:
			return getConstant_3043OutgoingLinks(view);
		case EdgeEditPart.VISUAL_ID:
			return getEdge_4028OutgoingLinks(view);
		case InitEdgeEditPart.VISUAL_ID:
			return getInitEdge_4029OutgoingLinks(view);
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
	public static List getSubMode_2007ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCompositeMode_2008ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getVariable_3022ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getResource_3023ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getEntryPoint_3024ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getExitPoint_3025ContainedLinks(View view) {
		ExitPoint modelElement = (ExitPoint) view.getElement();
		List result = new LinkedList();
		result.addAll(getContainedTypeModelFacetLinks_Edge_4028(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getConstant_3041ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getSubMode_3026ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getVariable_3027ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getResource_3028ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getEntryPoint_3029ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getExitPoint_3030ContainedLinks(View view) {
		ExitPoint modelElement = (ExitPoint) view.getElement();
		List result = new LinkedList();
		result.addAll(getContainedTypeModelFacetLinks_Edge_4028(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getConstant_3042ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getConditionalConnector_3031ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getEntryPoint_3032ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getExitPoint_3033ContainedLinks(View view) {
		ExitPoint modelElement = (ExitPoint) view.getElement();
		List result = new LinkedList();
		result.addAll(getContainedTypeModelFacetLinks_Edge_4028(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getVariable_3034ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getEntryPoint_3035ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getExitPoint_3036ContainedLinks(View view) {
		ExitPoint modelElement = (ExitPoint) view.getElement();
		List result = new LinkedList();
		result.addAll(getContainedTypeModelFacetLinks_Edge_4028(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getCompositeEntryPoint_3037ContainedLinks(View view) {
		CompositeEntryPoint modelElement = (CompositeEntryPoint) view
				.getElement();
		List result = new LinkedList();
		result.addAll(getContainedTypeModelFacetLinks_Edge_4028(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getCompositeExitPoint_3038ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getInitPoint_3039ContainedLinks(View view) {
		InitPoint modelElement = (InitPoint) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getContainedTypeModelFacetLinks_InitEdge_4029(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getResource_3040ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getConstant_3043ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getEdge_4028ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getInitEdge_4029ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getSubMode_2007IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCompositeMode_2008IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getVariable_3022IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getResource_3023IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getEntryPoint_3024IncomingLinks(View view) {
		EntryPoint modelElement = (EntryPoint) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_Edge_4028(modelElement,
				crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_InitEdge_4029(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getExitPoint_3025IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getConstant_3041IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getSubMode_3026IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getVariable_3027IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getResource_3028IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getEntryPoint_3029IncomingLinks(View view) {
		EntryPoint modelElement = (EntryPoint) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_Edge_4028(modelElement,
				crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_InitEdge_4029(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getExitPoint_3030IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getConstant_3042IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getConditionalConnector_3031IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getEntryPoint_3032IncomingLinks(View view) {
		EntryPoint modelElement = (EntryPoint) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_Edge_4028(modelElement,
				crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_InitEdge_4029(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getExitPoint_3033IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getVariable_3034IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getEntryPoint_3035IncomingLinks(View view) {
		EntryPoint modelElement = (EntryPoint) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_Edge_4028(modelElement,
				crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_InitEdge_4029(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getExitPoint_3036IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCompositeEntryPoint_3037IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCompositeExitPoint_3038IncomingLinks(View view) {
		CompositeExitPoint modelElement = (CompositeExitPoint) view
				.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_Edge_4028(modelElement,
				crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_InitEdge_4029(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getInitPoint_3039IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getResource_3040IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getConstant_3043IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getEdge_4028IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getInitEdge_4029IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getSubMode_2007OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCompositeMode_2008OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getVariable_3022OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getResource_3023OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getEntryPoint_3024OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getExitPoint_3025OutgoingLinks(View view) {
		ExitPoint modelElement = (ExitPoint) view.getElement();
		List result = new LinkedList();
		result.addAll(getOutgoingTypeModelFacetLinks_Edge_4028(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getConstant_3041OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getSubMode_3026OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getVariable_3027OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getResource_3028OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getEntryPoint_3029OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getExitPoint_3030OutgoingLinks(View view) {
		ExitPoint modelElement = (ExitPoint) view.getElement();
		List result = new LinkedList();
		result.addAll(getOutgoingTypeModelFacetLinks_Edge_4028(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getConstant_3042OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getConditionalConnector_3031OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getEntryPoint_3032OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getExitPoint_3033OutgoingLinks(View view) {
		ExitPoint modelElement = (ExitPoint) view.getElement();
		List result = new LinkedList();
		result.addAll(getOutgoingTypeModelFacetLinks_Edge_4028(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getVariable_3034OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getEntryPoint_3035OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getExitPoint_3036OutgoingLinks(View view) {
		ExitPoint modelElement = (ExitPoint) view.getElement();
		List result = new LinkedList();
		result.addAll(getOutgoingTypeModelFacetLinks_Edge_4028(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getCompositeEntryPoint_3037OutgoingLinks(View view) {
		CompositeEntryPoint modelElement = (CompositeEntryPoint) view
				.getElement();
		List result = new LinkedList();
		result.addAll(getOutgoingTypeModelFacetLinks_Edge_4028(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getCompositeExitPoint_3038OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getInitPoint_3039OutgoingLinks(View view) {
		InitPoint modelElement = (InitPoint) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_InitEdge_4029(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getResource_3040OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getConstant_3043OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getEdge_4028OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getInitEdge_4029OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	private static Collection getContainedTypeModelFacetLinks_Edge_4028(
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
					RemesElementTypes.Edge_4028, EdgeEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getContainedTypeModelFacetLinks_InitEdge_4029(
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
				RemesElementTypes.InitEdge_4029, InitEdgeEditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingTypeModelFacetLinks_Edge_4028(
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
					RemesElementTypes.Edge_4028, EdgeEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingTypeModelFacetLinks_InitEdge_4029(
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
							RemesElementTypes.InitEdge_4029,
							InitEdgeEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingTypeModelFacetLinks_Edge_4028(
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
					RemesElementTypes.Edge_4028, EdgeEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingTypeModelFacetLinks_InitEdge_4029(
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
				RemesElementTypes.InitEdge_4029, InitEdgeEditPart.VISUAL_ID));
		return result;
	}

}
