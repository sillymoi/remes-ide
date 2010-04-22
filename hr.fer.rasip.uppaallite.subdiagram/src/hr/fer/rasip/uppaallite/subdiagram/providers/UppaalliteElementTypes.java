package hr.fer.rasip.uppaallite.subdiagram.providers;

import hr.fer.rasip.uppaallite.UppaallitePackage;
import hr.fer.rasip.uppaallite.subdiagram.edit.parts.LocationType2EditPart;
import hr.fer.rasip.uppaallite.subdiagram.edit.parts.LocationType3EditPart;
import hr.fer.rasip.uppaallite.subdiagram.edit.parts.LocationType4EditPart;
import hr.fer.rasip.uppaallite.subdiagram.edit.parts.LocationType5EditPart;
import hr.fer.rasip.uppaallite.subdiagram.edit.parts.LocationType6EditPart;
import hr.fer.rasip.uppaallite.subdiagram.edit.parts.LocationTypeEditPart;
import hr.fer.rasip.uppaallite.subdiagram.edit.parts.TemplateTypeEditPart;
import hr.fer.rasip.uppaallite.subdiagram.edit.parts.TransitionTypeEditPart;
import hr.fer.rasip.uppaallite.subdiagram.part.UppaalliteDiagramEditorPlugin;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.swt.graphics.Image;

/**
 * @generated
 */
public class UppaalliteElementTypes extends ElementInitializers {

	/**
	 * @generated
	 */
	private UppaalliteElementTypes() {
	}

	/**
	 * @generated
	 */
	private static Map elements;

	/**
	 * @generated
	 */
	private static ImageRegistry imageRegistry;

	/**
	 * @generated
	 */
	private static Set KNOWN_ELEMENT_TYPES;

	/**
	 * @generated
	 */
	public static final IElementType TemplateType_1000 = getElementType("hr.fer.rasip.uppaallite.subdiagram.TemplateType_1000"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType LocationType_2001 = getElementType("hr.fer.rasip.uppaallite.subdiagram.LocationType_2001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType LocationType_2002 = getElementType("hr.fer.rasip.uppaallite.subdiagram.LocationType_2002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType LocationType_2003 = getElementType("hr.fer.rasip.uppaallite.subdiagram.LocationType_2003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType LocationType_2004 = getElementType("hr.fer.rasip.uppaallite.subdiagram.LocationType_2004"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType LocationType_2005 = getElementType("hr.fer.rasip.uppaallite.subdiagram.LocationType_2005"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType LocationType_2006 = getElementType("hr.fer.rasip.uppaallite.subdiagram.LocationType_2006"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType TransitionType_4001 = getElementType("hr.fer.rasip.uppaallite.subdiagram.TransitionType_4001"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	private static ImageRegistry getImageRegistry() {
		if (imageRegistry == null) {
			imageRegistry = new ImageRegistry();
		}
		return imageRegistry;
	}

	/**
	 * @generated
	 */
	private static String getImageRegistryKey(ENamedElement element) {
		return element.getName();
	}

	/**
	 * @generated
	 */
	private static ImageDescriptor getProvidedImageDescriptor(
			ENamedElement element) {
		if (element instanceof EStructuralFeature) {
			EStructuralFeature feature = ((EStructuralFeature) element);
			EClass eContainingClass = feature.getEContainingClass();
			EClassifier eType = feature.getEType();
			if (eContainingClass != null && !eContainingClass.isAbstract()) {
				element = eContainingClass;
			} else if (eType instanceof EClass
					&& !((EClass) eType).isAbstract()) {
				element = eType;
			}
		}
		if (element instanceof EClass) {
			EClass eClass = (EClass) element;
			if (!eClass.isAbstract()) {
				return UppaalliteDiagramEditorPlugin.getInstance()
						.getItemImageDescriptor(
								eClass.getEPackage().getEFactoryInstance()
										.create(eClass));
			}
		}
		// TODO : support structural features
		return null;
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(ENamedElement element) {
		String key = getImageRegistryKey(element);
		ImageDescriptor imageDescriptor = getImageRegistry().getDescriptor(key);
		if (imageDescriptor == null) {
			imageDescriptor = getProvidedImageDescriptor(element);
			if (imageDescriptor == null) {
				imageDescriptor = ImageDescriptor.getMissingImageDescriptor();
			}
			getImageRegistry().put(key, imageDescriptor);
		}
		return imageDescriptor;
	}

	/**
	 * @generated
	 */
	public static Image getImage(ENamedElement element) {
		String key = getImageRegistryKey(element);
		Image image = getImageRegistry().get(key);
		if (image == null) {
			ImageDescriptor imageDescriptor = getProvidedImageDescriptor(element);
			if (imageDescriptor == null) {
				imageDescriptor = ImageDescriptor.getMissingImageDescriptor();
			}
			getImageRegistry().put(key, imageDescriptor);
			image = getImageRegistry().get(key);
		}
		return image;
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(IAdaptable hint) {
		ENamedElement element = getElement(hint);
		if (element == null) {
			return null;
		}
		return getImageDescriptor(element);
	}

	/**
	 * @generated
	 */
	public static Image getImage(IAdaptable hint) {
		ENamedElement element = getElement(hint);
		if (element == null) {
			return null;
		}
		return getImage(element);
	}

	/**
	 * Returns 'type' of the ecore object associated with the hint.
	 * 
	 * @generated
	 */
	public static ENamedElement getElement(IAdaptable hint) {
		Object type = hint.getAdapter(IElementType.class);
		if (elements == null) {
			elements = new IdentityHashMap();

			elements.put(TemplateType_1000, UppaallitePackage.eINSTANCE
					.getTemplateType());

			elements.put(LocationType_2001, UppaallitePackage.eINSTANCE
					.getLocationType());

			elements.put(LocationType_2002, UppaallitePackage.eINSTANCE
					.getLocationType());

			elements.put(LocationType_2003, UppaallitePackage.eINSTANCE
					.getLocationType());

			elements.put(LocationType_2004, UppaallitePackage.eINSTANCE
					.getLocationType());

			elements.put(LocationType_2005, UppaallitePackage.eINSTANCE
					.getLocationType());

			elements.put(LocationType_2006, UppaallitePackage.eINSTANCE
					.getLocationType());

			elements.put(TransitionType_4001, UppaallitePackage.eINSTANCE
					.getTransitionType());
		}
		return (ENamedElement) elements.get(type);
	}

	/**
	 * @generated
	 */
	private static IElementType getElementType(String id) {
		return ElementTypeRegistry.getInstance().getType(id);
	}

	/**
	 * @generated
	 */
	public static boolean isKnownElementType(IElementType elementType) {
		if (KNOWN_ELEMENT_TYPES == null) {
			KNOWN_ELEMENT_TYPES = new HashSet();
			KNOWN_ELEMENT_TYPES.add(TemplateType_1000);
			KNOWN_ELEMENT_TYPES.add(LocationType_2001);
			KNOWN_ELEMENT_TYPES.add(LocationType_2002);
			KNOWN_ELEMENT_TYPES.add(LocationType_2003);
			KNOWN_ELEMENT_TYPES.add(LocationType_2004);
			KNOWN_ELEMENT_TYPES.add(LocationType_2005);
			KNOWN_ELEMENT_TYPES.add(LocationType_2006);
			KNOWN_ELEMENT_TYPES.add(TransitionType_4001);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	 * @generated
	 */
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case TemplateTypeEditPart.VISUAL_ID:
			return TemplateType_1000;
		case LocationTypeEditPart.VISUAL_ID:
			return LocationType_2001;
		case LocationType2EditPart.VISUAL_ID:
			return LocationType_2002;
		case LocationType3EditPart.VISUAL_ID:
			return LocationType_2003;
		case LocationType4EditPart.VISUAL_ID:
			return LocationType_2004;
		case LocationType5EditPart.VISUAL_ID:
			return LocationType_2005;
		case LocationType6EditPart.VISUAL_ID:
			return LocationType_2006;
		case TransitionTypeEditPart.VISUAL_ID:
			return TransitionType_4001;
		}
		return null;
	}

}
