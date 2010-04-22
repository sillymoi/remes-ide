package hr.fer.rasip.uppaallite.diagram.part;

import hr.fer.rasip.uppaallite.UppaalDiagram;
import hr.fer.rasip.uppaallite.UppaallitePackage;
import hr.fer.rasip.uppaallite.diagram.edit.parts.TemplateTypeEditPart;
import hr.fer.rasip.uppaallite.diagram.edit.parts.TemplateTypeNameEditPart;
import hr.fer.rasip.uppaallite.diagram.edit.parts.UppaalDiagramEditPart;

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
	private static final String DEBUG_KEY = "hr.fer.rasip.uppaallite.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (UppaalDiagramEditPart.MODEL_ID.equals(view.getType())) {
				return UppaalDiagramEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return hr.fer.rasip.uppaallite.diagram.part.UppaalliteVisualIDRegistry
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
		if (UppaallitePackage.eINSTANCE.getUppaalDiagram().isSuperTypeOf(
				domainElement.eClass())
				&& isDiagram((UppaalDiagram) domainElement)) {
			return UppaalDiagramEditPart.VISUAL_ID;
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
		String containerModelID = hr.fer.rasip.uppaallite.diagram.part.UppaalliteVisualIDRegistry
				.getModelID(containerView);
		if (!UppaalDiagramEditPart.MODEL_ID.equals(containerModelID)) {
			return -1;
		}
		int containerVisualID;
		if (UppaalDiagramEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = hr.fer.rasip.uppaallite.diagram.part.UppaalliteVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = UppaalDiagramEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case UppaalDiagramEditPart.VISUAL_ID:
			if (UppaallitePackage.eINSTANCE.getTemplateType().isSuperTypeOf(
					domainElement.eClass())) {
				return TemplateTypeEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = hr.fer.rasip.uppaallite.diagram.part.UppaalliteVisualIDRegistry
				.getModelID(containerView);
		if (!UppaalDiagramEditPart.MODEL_ID.equals(containerModelID)) {
			return false;
		}
		int containerVisualID;
		if (UppaalDiagramEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = hr.fer.rasip.uppaallite.diagram.part.UppaalliteVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = UppaalDiagramEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case TemplateTypeEditPart.VISUAL_ID:
			if (TemplateTypeNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case UppaalDiagramEditPart.VISUAL_ID:
			if (TemplateTypeEditPart.VISUAL_ID == nodeVisualID) {
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
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 * 
	 * @generated
	 */
	private static boolean isDiagram(UppaalDiagram element) {
		return true;
	}

}
