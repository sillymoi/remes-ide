package se.mdh.progresside.remes.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;

import se.mdh.progresside.remes.RemesDiagram;
import se.mdh.progresside.remes.RemesPackage;
import se.mdh.progresside.remes.diagram.edit.parts.CompositeEntryPointEditPart;
import se.mdh.progresside.remes.diagram.edit.parts.CompositeExitPointEditPart;
import se.mdh.progresside.remes.diagram.edit.parts.CompositeModeCompositeModeCompartmentEditPart;
import se.mdh.progresside.remes.diagram.edit.parts.CompositeModeCompositeModeVariablesCompartmentEditPart;
import se.mdh.progresside.remes.diagram.edit.parts.CompositeModeEditPart;
import se.mdh.progresside.remes.diagram.edit.parts.CompositeModeInitializationEditPart;
import se.mdh.progresside.remes.diagram.edit.parts.CompositeModeNameEditPart;
import se.mdh.progresside.remes.diagram.edit.parts.ConditionalConnectorEditPart;
import se.mdh.progresside.remes.diagram.edit.parts.ConditionalConnectorNameEditPart;
import se.mdh.progresside.remes.diagram.edit.parts.EdgeActionGuardEditPart;
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
import se.mdh.progresside.remes.diagram.edit.parts.InitEdgeInitializationEditPart;
import se.mdh.progresside.remes.diagram.edit.parts.InitPointEditPart;
import se.mdh.progresside.remes.diagram.edit.parts.RemesDiagramEditPart;
import se.mdh.progresside.remes.diagram.edit.parts.Resource2EditPart;
import se.mdh.progresside.remes.diagram.edit.parts.ResourceEditPart;
import se.mdh.progresside.remes.diagram.edit.parts.SubMode2EditPart;
import se.mdh.progresside.remes.diagram.edit.parts.SubModeEditPart;
import se.mdh.progresside.remes.diagram.edit.parts.SubModeInitialization2EditPart;
import se.mdh.progresside.remes.diagram.edit.parts.SubModeInitializationEditPart;
import se.mdh.progresside.remes.diagram.edit.parts.SubModeInvariant2EditPart;
import se.mdh.progresside.remes.diagram.edit.parts.SubModeInvariantEditPart;
import se.mdh.progresside.remes.diagram.edit.parts.SubModeIsUrgent2EditPart;
import se.mdh.progresside.remes.diagram.edit.parts.SubModeIsUrgentEditPart;
import se.mdh.progresside.remes.diagram.edit.parts.SubModeName2EditPart;
import se.mdh.progresside.remes.diagram.edit.parts.SubModeNameEditPart;
import se.mdh.progresside.remes.diagram.edit.parts.SubModeSubModeResourcesCompartment2EditPart;
import se.mdh.progresside.remes.diagram.edit.parts.SubModeSubModeResourcesCompartmentEditPart;
import se.mdh.progresside.remes.diagram.edit.parts.SubModeSubModeVariablesCompartment2EditPart;
import se.mdh.progresside.remes.diagram.edit.parts.SubModeSubModeVariablesCompartmentEditPart;
import se.mdh.progresside.remes.diagram.edit.parts.Variable2EditPart;
import se.mdh.progresside.remes.diagram.edit.parts.Variable3EditPart;
import se.mdh.progresside.remes.diagram.edit.parts.VariableEditPart;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class RemesVisualIDRegistry {

	/**
	 * @generated
	 */
	private static final String DEBUG_KEY = "se.mdh.progresside.remes.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (RemesDiagramEditPart.MODEL_ID.equals(view.getType())) {
				return RemesDiagramEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return se.mdh.progresside.remes.diagram.part.RemesVisualIDRegistry
				.getVisualID(view.getType());
	}

	/**
	 * @generated
	 */
	public static String getModelID(View view) {
		View diagram = view.getDiagram();
		while (view != diagram) {
			EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
			if (annotation != null) {
				return (String) annotation.getDetails().get("modelID"); //$NON-NLS-1$
			}
			view = (View) view.eContainer();
		}
		return diagram != null ? diagram.getType() : null;
	}

	/**
	 * @generated
	 */
	public static int getVisualID(String type) {
		try {
			return Integer.parseInt(type);
		} catch (NumberFormatException e) {
			if (Boolean.TRUE.toString().equalsIgnoreCase(
					Platform.getDebugOption(DEBUG_KEY))) {
				RemesDiagramEditorPlugin.getInstance().logError(
						"Unable to parse view type as a visualID number: "
								+ type);
			}
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static String getType(int visualID) {
		return String.valueOf(visualID);
	}

	/**
	 * @generated
	 */
	public static int getDiagramVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (RemesPackage.eINSTANCE.getRemesDiagram().isSuperTypeOf(
				domainElement.eClass())
				&& isDiagram((RemesDiagram) domainElement)) {
			return RemesDiagramEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static int getNodeVisualID(View containerView, EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		String containerModelID = se.mdh.progresside.remes.diagram.part.RemesVisualIDRegistry
				.getModelID(containerView);
		if (!RemesDiagramEditPart.MODEL_ID.equals(containerModelID)) {
			return -1;
		}
		int containerVisualID;
		if (RemesDiagramEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = se.mdh.progresside.remes.diagram.part.RemesVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = RemesDiagramEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case SubModeEditPart.VISUAL_ID:
			if (RemesPackage.eINSTANCE.getEntryPoint().isSuperTypeOf(
					domainElement.eClass())) {
				return EntryPointEditPart.VISUAL_ID;
			}
			if (RemesPackage.eINSTANCE.getExitPoint().isSuperTypeOf(
					domainElement.eClass())) {
				return ExitPointEditPart.VISUAL_ID;
			}
			break;
		case CompositeModeEditPart.VISUAL_ID:
			if (RemesPackage.eINSTANCE.getEntryPoint().isSuperTypeOf(
					domainElement.eClass())) {
				return EntryPoint4EditPart.VISUAL_ID;
			}
			if (RemesPackage.eINSTANCE.getExitPoint().isSuperTypeOf(
					domainElement.eClass())) {
				return ExitPoint4EditPart.VISUAL_ID;
			}
			if (RemesPackage.eINSTANCE.getInitPoint().isSuperTypeOf(
					domainElement.eClass())) {
				return InitPointEditPart.VISUAL_ID;
			}
			break;
		case SubMode2EditPart.VISUAL_ID:
			if (RemesPackage.eINSTANCE.getEntryPoint().isSuperTypeOf(
					domainElement.eClass())) {
				return EntryPoint2EditPart.VISUAL_ID;
			}
			if (RemesPackage.eINSTANCE.getExitPoint().isSuperTypeOf(
					domainElement.eClass())) {
				return ExitPoint2EditPart.VISUAL_ID;
			}
			break;
		case ConditionalConnectorEditPart.VISUAL_ID:
			if (RemesPackage.eINSTANCE.getEntryPoint().isSuperTypeOf(
					domainElement.eClass())) {
				return EntryPoint3EditPart.VISUAL_ID;
			}
			if (RemesPackage.eINSTANCE.getExitPoint().isSuperTypeOf(
					domainElement.eClass())) {
				return ExitPoint3EditPart.VISUAL_ID;
			}
			break;
		case SubModeSubModeVariablesCompartmentEditPart.VISUAL_ID:
			if (RemesPackage.eINSTANCE.getVariable().isSuperTypeOf(
					domainElement.eClass())) {
				return VariableEditPart.VISUAL_ID;
			}
			break;
		case SubModeSubModeResourcesCompartmentEditPart.VISUAL_ID:
			if (RemesPackage.eINSTANCE.getResource().isSuperTypeOf(
					domainElement.eClass())) {
				return ResourceEditPart.VISUAL_ID;
			}
			break;
		case CompositeModeCompositeModeVariablesCompartmentEditPart.VISUAL_ID:
			if (RemesPackage.eINSTANCE.getVariable().isSuperTypeOf(
					domainElement.eClass())) {
				return Variable3EditPart.VISUAL_ID;
			}
			break;
		case CompositeModeCompositeModeCompartmentEditPart.VISUAL_ID:
			if (RemesPackage.eINSTANCE.getSubMode().isSuperTypeOf(
					domainElement.eClass())) {
				return SubMode2EditPart.VISUAL_ID;
			}
			if (RemesPackage.eINSTANCE.getConditionalConnector().isSuperTypeOf(
					domainElement.eClass())) {
				return ConditionalConnectorEditPart.VISUAL_ID;
			}
			if (RemesPackage.eINSTANCE.getCompositeEntryPoint().isSuperTypeOf(
					domainElement.eClass())) {
				return CompositeEntryPointEditPart.VISUAL_ID;
			}
			if (RemesPackage.eINSTANCE.getCompositeExitPoint().isSuperTypeOf(
					domainElement.eClass())) {
				return CompositeExitPointEditPart.VISUAL_ID;
			}
			break;
		case SubModeSubModeVariablesCompartment2EditPart.VISUAL_ID:
			if (RemesPackage.eINSTANCE.getVariable().isSuperTypeOf(
					domainElement.eClass())) {
				return Variable2EditPart.VISUAL_ID;
			}
			break;
		case SubModeSubModeResourcesCompartment2EditPart.VISUAL_ID:
			if (RemesPackage.eINSTANCE.getResource().isSuperTypeOf(
					domainElement.eClass())) {
				return Resource2EditPart.VISUAL_ID;
			}
			break;
		case RemesDiagramEditPart.VISUAL_ID:
			if (RemesPackage.eINSTANCE.getSubMode().isSuperTypeOf(
					domainElement.eClass())) {
				return SubModeEditPart.VISUAL_ID;
			}
			if (RemesPackage.eINSTANCE.getCompositeMode().isSuperTypeOf(
					domainElement.eClass())) {
				return CompositeModeEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = se.mdh.progresside.remes.diagram.part.RemesVisualIDRegistry
				.getModelID(containerView);
		if (!RemesDiagramEditPart.MODEL_ID.equals(containerModelID)) {
			return false;
		}
		int containerVisualID;
		if (RemesDiagramEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = se.mdh.progresside.remes.diagram.part.RemesVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = RemesDiagramEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case SubModeEditPart.VISUAL_ID:
			if (SubModeNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SubModeInitializationEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SubModeInvariantEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SubModeIsUrgentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SubModeSubModeVariablesCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SubModeSubModeResourcesCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (EntryPointEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ExitPointEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CompositeModeEditPart.VISUAL_ID:
			if (CompositeModeNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CompositeModeInitializationEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CompositeModeCompositeModeVariablesCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CompositeModeCompositeModeCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (EntryPoint4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ExitPoint4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (InitPointEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SubMode2EditPart.VISUAL_ID:
			if (SubModeName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SubModeInitialization2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SubModeInvariant2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SubModeIsUrgent2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SubModeSubModeVariablesCompartment2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SubModeSubModeResourcesCompartment2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (EntryPoint2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ExitPoint2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ConditionalConnectorEditPart.VISUAL_ID:
			if (ConditionalConnectorNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (EntryPoint3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ExitPoint3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SubModeSubModeVariablesCompartmentEditPart.VISUAL_ID:
			if (VariableEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SubModeSubModeResourcesCompartmentEditPart.VISUAL_ID:
			if (ResourceEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CompositeModeCompositeModeVariablesCompartmentEditPart.VISUAL_ID:
			if (Variable3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CompositeModeCompositeModeCompartmentEditPart.VISUAL_ID:
			if (SubMode2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ConditionalConnectorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CompositeEntryPointEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CompositeExitPointEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SubModeSubModeVariablesCompartment2EditPart.VISUAL_ID:
			if (Variable2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SubModeSubModeResourcesCompartment2EditPart.VISUAL_ID:
			if (Resource2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case RemesDiagramEditPart.VISUAL_ID:
			if (SubModeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CompositeModeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case EdgeEditPart.VISUAL_ID:
			if (EdgeActionGuardEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case InitEdgeEditPart.VISUAL_ID:
			if (InitEdgeInitializationEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static int getLinkWithClassVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (RemesPackage.eINSTANCE.getEdge().isSuperTypeOf(
				domainElement.eClass())) {
			return EdgeEditPart.VISUAL_ID;
		}
		if (RemesPackage.eINSTANCE.getInitEdge().isSuperTypeOf(
				domainElement.eClass())) {
			return InitEdgeEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 * 
	 * @generated
	 */
	private static boolean isDiagram(RemesDiagram element) {
		return true;
	}

}
