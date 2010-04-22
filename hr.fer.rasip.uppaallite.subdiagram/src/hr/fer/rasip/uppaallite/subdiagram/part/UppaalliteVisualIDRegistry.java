package hr.fer.rasip.uppaallite.subdiagram.part;

import hr.fer.rasip.uppaallite.LocationType;
import hr.fer.rasip.uppaallite.TemplateType;
import hr.fer.rasip.uppaallite.UppaallitePackage;
import hr.fer.rasip.uppaallite.subdiagram.edit.parts.LocationType2EditPart;
import hr.fer.rasip.uppaallite.subdiagram.edit.parts.LocationType3EditPart;
import hr.fer.rasip.uppaallite.subdiagram.edit.parts.LocationType4EditPart;
import hr.fer.rasip.uppaallite.subdiagram.edit.parts.LocationType5EditPart;
import hr.fer.rasip.uppaallite.subdiagram.edit.parts.LocationType6EditPart;
import hr.fer.rasip.uppaallite.subdiagram.edit.parts.LocationTypeEditPart;
import hr.fer.rasip.uppaallite.subdiagram.edit.parts.LocationTypeInvariant2EditPart;
import hr.fer.rasip.uppaallite.subdiagram.edit.parts.LocationTypeInvariant3EditPart;
import hr.fer.rasip.uppaallite.subdiagram.edit.parts.LocationTypeInvariant4EditPart;
import hr.fer.rasip.uppaallite.subdiagram.edit.parts.LocationTypeInvariant5EditPart;
import hr.fer.rasip.uppaallite.subdiagram.edit.parts.LocationTypeInvariant6EditPart;
import hr.fer.rasip.uppaallite.subdiagram.edit.parts.LocationTypeInvariantEditPart;
import hr.fer.rasip.uppaallite.subdiagram.edit.parts.LocationTypeName2EditPart;
import hr.fer.rasip.uppaallite.subdiagram.edit.parts.LocationTypeName3EditPart;
import hr.fer.rasip.uppaallite.subdiagram.edit.parts.LocationTypeName4EditPart;
import hr.fer.rasip.uppaallite.subdiagram.edit.parts.LocationTypeName5EditPart;
import hr.fer.rasip.uppaallite.subdiagram.edit.parts.LocationTypeName6EditPart;
import hr.fer.rasip.uppaallite.subdiagram.edit.parts.LocationTypeNameEditPart;
import hr.fer.rasip.uppaallite.subdiagram.edit.parts.TemplateTypeEditPart;
import hr.fer.rasip.uppaallite.subdiagram.edit.parts.TransitionTypeAssignmentEditPart;
import hr.fer.rasip.uppaallite.subdiagram.edit.parts.TransitionTypeEditPart;
import hr.fer.rasip.uppaallite.subdiagram.edit.parts.TransitionTypeGuardEditPart;
import hr.fer.rasip.uppaallite.subdiagram.edit.parts.TransitionTypeSyncEditPart;
import hr.fer.rasip.uppaallite.subdiagram.expressions.UppaalliteAbstractExpression;
import hr.fer.rasip.uppaallite.subdiagram.expressions.UppaalliteOCLFactory;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class UppaalliteVisualIDRegistry {

	/**
	 * @generated
	 */
	private static final String DEBUG_KEY = "hr.fer.rasip.uppaallite.subdiagram/debug/visualID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	private static UppaalliteAbstractExpression LocationType_2001_Constraint;

	/**
	 * @generated
	 */
	private static UppaalliteAbstractExpression LocationType_2002_Constraint;

	/**
	 * @generated
	 */
	private static UppaalliteAbstractExpression LocationType_2003_Constraint;

	/**
	 * @generated
	 */
	private static UppaalliteAbstractExpression LocationType_2004_Constraint;

	/**
	 * @generated
	 */
	private static UppaalliteAbstractExpression LocationType_2005_Constraint;

	/**
	 * @generated
	 */
	private static UppaalliteAbstractExpression LocationType_2006_Constraint;

	/**
	 * @generated
	 */
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (TemplateTypeEditPart.MODEL_ID.equals(view.getType())) {
				return TemplateTypeEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return hr.fer.rasip.uppaallite.subdiagram.part.UppaalliteVisualIDRegistry
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
				UppaalliteDiagramEditorPlugin.getInstance().logError(
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
		if (UppaallitePackage.eINSTANCE.getTemplateType().isSuperTypeOf(
				domainElement.eClass())
				&& isDiagram((TemplateType) domainElement)) {
			return TemplateTypeEditPart.VISUAL_ID;
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
		String containerModelID = hr.fer.rasip.uppaallite.subdiagram.part.UppaalliteVisualIDRegistry
				.getModelID(containerView);
		if (!TemplateTypeEditPart.MODEL_ID.equals(containerModelID)) {
			return -1;
		}
		int containerVisualID;
		if (TemplateTypeEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = hr.fer.rasip.uppaallite.subdiagram.part.UppaalliteVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = TemplateTypeEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case TemplateTypeEditPart.VISUAL_ID:
			if (UppaallitePackage.eINSTANCE.getLocationType().isSuperTypeOf(
					domainElement.eClass())
					&& isLocationType_2001((LocationType) domainElement)) {
				return LocationTypeEditPart.VISUAL_ID;
			}
			if (UppaallitePackage.eINSTANCE.getLocationType().isSuperTypeOf(
					domainElement.eClass())
					&& isLocationType_2002((LocationType) domainElement)) {
				return LocationType2EditPart.VISUAL_ID;
			}
			if (UppaallitePackage.eINSTANCE.getLocationType().isSuperTypeOf(
					domainElement.eClass())
					&& isLocationType_2003((LocationType) domainElement)) {
				return LocationType3EditPart.VISUAL_ID;
			}
			if (UppaallitePackage.eINSTANCE.getLocationType().isSuperTypeOf(
					domainElement.eClass())
					&& isLocationType_2004((LocationType) domainElement)) {
				return LocationType4EditPart.VISUAL_ID;
			}
			if (UppaallitePackage.eINSTANCE.getLocationType().isSuperTypeOf(
					domainElement.eClass())
					&& isLocationType_2005((LocationType) domainElement)) {
				return LocationType5EditPart.VISUAL_ID;
			}
			if (UppaallitePackage.eINSTANCE.getLocationType().isSuperTypeOf(
					domainElement.eClass())
					&& isLocationType_2006((LocationType) domainElement)) {
				return LocationType6EditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = hr.fer.rasip.uppaallite.subdiagram.part.UppaalliteVisualIDRegistry
				.getModelID(containerView);
		if (!TemplateTypeEditPart.MODEL_ID.equals(containerModelID)) {
			return false;
		}
		int containerVisualID;
		if (TemplateTypeEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = hr.fer.rasip.uppaallite.subdiagram.part.UppaalliteVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = TemplateTypeEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case LocationTypeEditPart.VISUAL_ID:
			if (LocationTypeNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (LocationTypeInvariantEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case LocationType2EditPart.VISUAL_ID:
			if (LocationTypeName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (LocationTypeInvariant2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case LocationType3EditPart.VISUAL_ID:
			if (LocationTypeName3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (LocationTypeInvariant3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case LocationType4EditPart.VISUAL_ID:
			if (LocationTypeName4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (LocationTypeInvariant4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case LocationType5EditPart.VISUAL_ID:
			if (LocationTypeName5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (LocationTypeInvariant5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case LocationType6EditPart.VISUAL_ID:
			if (LocationTypeName6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (LocationTypeInvariant6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TemplateTypeEditPart.VISUAL_ID:
			if (LocationTypeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (LocationType2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (LocationType3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (LocationType4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (LocationType5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (LocationType6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TransitionTypeEditPart.VISUAL_ID:
			if (TransitionTypeAssignmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TransitionTypeGuardEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TransitionTypeSyncEditPart.VISUAL_ID == nodeVisualID) {
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
		if (UppaallitePackage.eINSTANCE.getTransitionType().isSuperTypeOf(
				domainElement.eClass())) {
			return TransitionTypeEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 * 
	 * @generated
	 */
	private static boolean isDiagram(TemplateType element) {
		return true;
	}

	/**
	 * @generated
	 */
	private static boolean isLocationType_2001(LocationType domainElement) {
		if (LocationType_2001_Constraint == null) { // lazy initialization
			LocationType_2001_Constraint = UppaalliteOCLFactory
					.getExpression(
							"self.commited = self.urgent and self.initial = false", UppaallitePackage.eINSTANCE.getLocationType()); //$NON-NLS-1$
		}
		Object result = LocationType_2001_Constraint.evaluate(domainElement);
		return result instanceof Boolean && ((Boolean) result).booleanValue();
	}

	/**
	 * @generated
	 */
	private static boolean isLocationType_2002(LocationType domainElement) {
		if (LocationType_2002_Constraint == null) { // lazy initialization
			LocationType_2002_Constraint = UppaalliteOCLFactory
					.getExpression(
							"self.commited = true and self.urgent = false and self.initial = false", UppaallitePackage.eINSTANCE.getLocationType()); //$NON-NLS-1$
		}
		Object result = LocationType_2002_Constraint.evaluate(domainElement);
		return result instanceof Boolean && ((Boolean) result).booleanValue();
	}

	/**
	 * @generated
	 */
	private static boolean isLocationType_2003(LocationType domainElement) {
		if (LocationType_2003_Constraint == null) { // lazy initialization
			LocationType_2003_Constraint = UppaalliteOCLFactory
					.getExpression(
							"self.commited = false and self.urgent = true and self.initial = false", UppaallitePackage.eINSTANCE.getLocationType()); //$NON-NLS-1$
		}
		Object result = LocationType_2003_Constraint.evaluate(domainElement);
		return result instanceof Boolean && ((Boolean) result).booleanValue();
	}

	/**
	 * @generated
	 */
	private static boolean isLocationType_2004(LocationType domainElement) {
		if (LocationType_2004_Constraint == null) { // lazy initialization
			LocationType_2004_Constraint = UppaalliteOCLFactory
					.getExpression(
							"self.commited = self.urgent and self.initial = true", UppaallitePackage.eINSTANCE.getLocationType()); //$NON-NLS-1$
		}
		Object result = LocationType_2004_Constraint.evaluate(domainElement);
		return result instanceof Boolean && ((Boolean) result).booleanValue();
	}

	/**
	 * @generated
	 */
	private static boolean isLocationType_2005(LocationType domainElement) {
		if (LocationType_2005_Constraint == null) { // lazy initialization
			LocationType_2005_Constraint = UppaalliteOCLFactory
					.getExpression(
							"self.commited = false and self.urgent = true and self.initial = true", UppaallitePackage.eINSTANCE.getLocationType()); //$NON-NLS-1$
		}
		Object result = LocationType_2005_Constraint.evaluate(domainElement);
		return result instanceof Boolean && ((Boolean) result).booleanValue();
	}

	/**
	 * @generated
	 */
	private static boolean isLocationType_2006(LocationType domainElement) {
		if (LocationType_2006_Constraint == null) { // lazy initialization
			LocationType_2006_Constraint = UppaalliteOCLFactory
					.getExpression(
							"self.commited = true and self.urgent = false and self.initial = true", UppaallitePackage.eINSTANCE.getLocationType()); //$NON-NLS-1$
		}
		Object result = LocationType_2006_Constraint.evaluate(domainElement);
		return result instanceof Boolean && ((Boolean) result).booleanValue();
	}

}
