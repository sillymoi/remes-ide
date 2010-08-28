package hr.fer.rasip.uppaallite.subdiagram.part;

import hr.fer.rasip.uppaallite.LocationType;
import hr.fer.rasip.uppaallite.TemplateType;
import hr.fer.rasip.uppaallite.TransitionType;
import hr.fer.rasip.uppaallite.UppaallitePackage;
import hr.fer.rasip.uppaallite.subdiagram.edit.parts.LocationType2EditPart;
import hr.fer.rasip.uppaallite.subdiagram.edit.parts.LocationType3EditPart;
import hr.fer.rasip.uppaallite.subdiagram.edit.parts.LocationType4EditPart;
import hr.fer.rasip.uppaallite.subdiagram.edit.parts.LocationType5EditPart;
import hr.fer.rasip.uppaallite.subdiagram.edit.parts.LocationType6EditPart;
import hr.fer.rasip.uppaallite.subdiagram.edit.parts.LocationTypeEditPart;
import hr.fer.rasip.uppaallite.subdiagram.edit.parts.TemplateTypeEditPart;
import hr.fer.rasip.uppaallite.subdiagram.edit.parts.TransitionTypeEditPart;
import hr.fer.rasip.uppaallite.subdiagram.providers.UppaalliteElementTypes;

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

/**
 * @generated
 */
public class UppaalliteDiagramUpdater {

	/**
	 * @generated
	 */
	public static List getSemanticChildren(View view) {
		switch (UppaalliteVisualIDRegistry.getVisualID(view)) {
		case TemplateTypeEditPart.VISUAL_ID:
			return getTemplateType_1000SemanticChildren(view);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getTemplateType_1000SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		TemplateType modelElement = (TemplateType) view.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getLocation().iterator(); it.hasNext();) {
			LocationType childElement = (LocationType) it.next();
			int visualID = UppaalliteVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == LocationTypeEditPart.VISUAL_ID) {
				result
						.add(new UppaalliteNodeDescriptor(childElement,
								visualID));
				continue;
			}
			if (visualID == LocationType2EditPart.VISUAL_ID) {
				result
						.add(new UppaalliteNodeDescriptor(childElement,
								visualID));
				continue;
			}
			if (visualID == LocationType3EditPart.VISUAL_ID) {
				result
						.add(new UppaalliteNodeDescriptor(childElement,
								visualID));
				continue;
			}
			if (visualID == LocationType4EditPart.VISUAL_ID) {
				result
						.add(new UppaalliteNodeDescriptor(childElement,
								visualID));
				continue;
			}
			if (visualID == LocationType5EditPart.VISUAL_ID) {
				result
						.add(new UppaalliteNodeDescriptor(childElement,
								visualID));
				continue;
			}
			if (visualID == LocationType6EditPart.VISUAL_ID) {
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
		case TemplateTypeEditPart.VISUAL_ID:
			return getTemplateType_1000ContainedLinks(view);
		case LocationTypeEditPart.VISUAL_ID:
			return getLocationType_2007ContainedLinks(view);
		case LocationType2EditPart.VISUAL_ID:
			return getLocationType_2008ContainedLinks(view);
		case LocationType3EditPart.VISUAL_ID:
			return getLocationType_2009ContainedLinks(view);
		case LocationType4EditPart.VISUAL_ID:
			return getLocationType_2010ContainedLinks(view);
		case LocationType5EditPart.VISUAL_ID:
			return getLocationType_2011ContainedLinks(view);
		case LocationType6EditPart.VISUAL_ID:
			return getLocationType_2012ContainedLinks(view);
		case TransitionTypeEditPart.VISUAL_ID:
			return getTransitionType_4002ContainedLinks(view);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getIncomingLinks(View view) {
		switch (UppaalliteVisualIDRegistry.getVisualID(view)) {
		case LocationTypeEditPart.VISUAL_ID:
			return getLocationType_2007IncomingLinks(view);
		case LocationType2EditPart.VISUAL_ID:
			return getLocationType_2008IncomingLinks(view);
		case LocationType3EditPart.VISUAL_ID:
			return getLocationType_2009IncomingLinks(view);
		case LocationType4EditPart.VISUAL_ID:
			return getLocationType_2010IncomingLinks(view);
		case LocationType5EditPart.VISUAL_ID:
			return getLocationType_2011IncomingLinks(view);
		case LocationType6EditPart.VISUAL_ID:
			return getLocationType_2012IncomingLinks(view);
		case TransitionTypeEditPart.VISUAL_ID:
			return getTransitionType_4002IncomingLinks(view);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getOutgoingLinks(View view) {
		switch (UppaalliteVisualIDRegistry.getVisualID(view)) {
		case LocationTypeEditPart.VISUAL_ID:
			return getLocationType_2007OutgoingLinks(view);
		case LocationType2EditPart.VISUAL_ID:
			return getLocationType_2008OutgoingLinks(view);
		case LocationType3EditPart.VISUAL_ID:
			return getLocationType_2009OutgoingLinks(view);
		case LocationType4EditPart.VISUAL_ID:
			return getLocationType_2010OutgoingLinks(view);
		case LocationType5EditPart.VISUAL_ID:
			return getLocationType_2011OutgoingLinks(view);
		case LocationType6EditPart.VISUAL_ID:
			return getLocationType_2012OutgoingLinks(view);
		case TransitionTypeEditPart.VISUAL_ID:
			return getTransitionType_4002OutgoingLinks(view);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getTemplateType_1000ContainedLinks(View view) {
		TemplateType modelElement = (TemplateType) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getContainedTypeModelFacetLinks_TransitionType_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getLocationType_2007ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getLocationType_2008ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getLocationType_2009ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getLocationType_2010ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getLocationType_2011ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getLocationType_2012ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getTransitionType_4002ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getLocationType_2007IncomingLinks(View view) {
		LocationType modelElement = (LocationType) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_TransitionType_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getLocationType_2008IncomingLinks(View view) {
		LocationType modelElement = (LocationType) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_TransitionType_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getLocationType_2009IncomingLinks(View view) {
		LocationType modelElement = (LocationType) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_TransitionType_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getLocationType_2010IncomingLinks(View view) {
		LocationType modelElement = (LocationType) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_TransitionType_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getLocationType_2011IncomingLinks(View view) {
		LocationType modelElement = (LocationType) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_TransitionType_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getLocationType_2012IncomingLinks(View view) {
		LocationType modelElement = (LocationType) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_TransitionType_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getTransitionType_4002IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getLocationType_2007OutgoingLinks(View view) {
		LocationType modelElement = (LocationType) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_TransitionType_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getLocationType_2008OutgoingLinks(View view) {
		LocationType modelElement = (LocationType) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_TransitionType_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getLocationType_2009OutgoingLinks(View view) {
		LocationType modelElement = (LocationType) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_TransitionType_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getLocationType_2010OutgoingLinks(View view) {
		LocationType modelElement = (LocationType) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_TransitionType_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getLocationType_2011OutgoingLinks(View view) {
		LocationType modelElement = (LocationType) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_TransitionType_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getLocationType_2012OutgoingLinks(View view) {
		LocationType modelElement = (LocationType) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_TransitionType_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getTransitionType_4002OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	private static Collection getContainedTypeModelFacetLinks_TransitionType_4002(
			TemplateType container) {
		Collection result = new LinkedList();
		for (Iterator links = container.getTransition().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof TransitionType) {
				continue;
			}
			TransitionType link = (TransitionType) linkObject;
			if (TransitionTypeEditPart.VISUAL_ID != UppaalliteVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			LocationType dst = link.getTarget();
			LocationType src = link.getSource();
			result.add(new UppaalliteLinkDescriptor(src, dst, link,
					UppaalliteElementTypes.TransitionType_4002,
					TransitionTypeEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingTypeModelFacetLinks_TransitionType_4002(
			LocationType target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() != UppaallitePackage.eINSTANCE
					.getTransitionType_Target()
					|| false == setting.getEObject() instanceof TransitionType) {
				continue;
			}
			TransitionType link = (TransitionType) setting.getEObject();
			if (TransitionTypeEditPart.VISUAL_ID != UppaalliteVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			LocationType src = link.getSource();
			result.add(new UppaalliteLinkDescriptor(src, target, link,
					UppaalliteElementTypes.TransitionType_4002,
					TransitionTypeEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingTypeModelFacetLinks_TransitionType_4002(
			LocationType source) {
		TemplateType container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof TemplateType) {
				container = (TemplateType) element;
			}
		}
		if (container == null) {
			return Collections.EMPTY_LIST;
		}
		Collection result = new LinkedList();
		for (Iterator links = container.getTransition().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof TransitionType) {
				continue;
			}
			TransitionType link = (TransitionType) linkObject;
			if (TransitionTypeEditPart.VISUAL_ID != UppaalliteVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			LocationType dst = link.getTarget();
			LocationType src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new UppaalliteLinkDescriptor(src, dst, link,
					UppaalliteElementTypes.TransitionType_4002,
					TransitionTypeEditPart.VISUAL_ID));
		}
		return result;
	}

}
