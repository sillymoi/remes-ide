package hr.fer.rasip.uppaallite.diagram.part;

import hr.fer.rasip.uppaallite.TemplateType;
import hr.fer.rasip.uppaallite.UppaalDiagram;
import hr.fer.rasip.uppaallite.diagram.edit.parts.TemplateTypeEditPart;
import hr.fer.rasip.uppaallite.diagram.edit.parts.UppaalDiagramEditPart;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class UppaalliteDiagramUpdater {

	/**
	 * @generated
	 */
	public static List getSemanticChildren(View view) {
		switch (UppaalliteVisualIDRegistry.getVisualID(view)) {
		case UppaalDiagramEditPart.VISUAL_ID:
			return getUppaalDiagram_1000SemanticChildren(view);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getUppaalDiagram_1000SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		UppaalDiagram modelElement = (UppaalDiagram) view.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getTemplate().iterator(); it.hasNext();) {
			TemplateType childElement = (TemplateType) it.next();
			int visualID = UppaalliteVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == TemplateTypeEditPart.VISUAL_ID) {
				result
						.add(new UppaalliteNodeDescriptor(childElement,
								visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getContainedLinks(View view) {
		switch (UppaalliteVisualIDRegistry.getVisualID(view)) {
		case UppaalDiagramEditPart.VISUAL_ID:
			return getUppaalDiagram_1000ContainedLinks(view);
		case TemplateTypeEditPart.VISUAL_ID:
			return getTemplateType_2001ContainedLinks(view);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getIncomingLinks(View view) {
		switch (UppaalliteVisualIDRegistry.getVisualID(view)) {
		case TemplateTypeEditPart.VISUAL_ID:
			return getTemplateType_2001IncomingLinks(view);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getOutgoingLinks(View view) {
		switch (UppaalliteVisualIDRegistry.getVisualID(view)) {
		case TemplateTypeEditPart.VISUAL_ID:
			return getTemplateType_2001OutgoingLinks(view);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getUppaalDiagram_1000ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getTemplateType_2001ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getTemplateType_2001IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getTemplateType_2001OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

}
