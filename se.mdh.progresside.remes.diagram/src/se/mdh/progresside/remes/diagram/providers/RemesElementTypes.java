package se.mdh.progresside.remes.diagram.providers;

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

import se.mdh.progresside.remes.RemesPackage;
import se.mdh.progresside.remes.diagram.edit.parts.CompositeEntryPointEditPart;
import se.mdh.progresside.remes.diagram.edit.parts.CompositeExitPointEditPart;
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
import se.mdh.progresside.remes.diagram.edit.parts.Variable2EditPart;
import se.mdh.progresside.remes.diagram.edit.parts.Variable3EditPart;
import se.mdh.progresside.remes.diagram.edit.parts.VariableEditPart;
import se.mdh.progresside.remes.diagram.part.RemesDiagramEditorPlugin;

/**
 * @generated
 */
public class RemesElementTypes extends ElementInitializers {

	/**
	 * @generated
	 */
	private RemesElementTypes() {
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
	public static final IElementType RemesDiagram_1000 = getElementType("se.mdh.progresside.remes.diagram.RemesDiagram_1000"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType SubMode_2001 = getElementType("se.mdh.progresside.remes.diagram.SubMode_2001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType CompositeMode_2002 = getElementType("se.mdh.progresside.remes.diagram.CompositeMode_2002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Variable_3001 = getElementType("se.mdh.progresside.remes.diagram.Variable_3001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Resource_3002 = getElementType("se.mdh.progresside.remes.diagram.Resource_3002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType EntryPoint_3008 = getElementType("se.mdh.progresside.remes.diagram.EntryPoint_3008"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType ExitPoint_3009 = getElementType("se.mdh.progresside.remes.diagram.ExitPoint_3009"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType SubMode_3003 = getElementType("se.mdh.progresside.remes.diagram.SubMode_3003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Variable_3004 = getElementType("se.mdh.progresside.remes.diagram.Variable_3004"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Resource_3005 = getElementType("se.mdh.progresside.remes.diagram.Resource_3005"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ConditionalConnector_3006 = getElementType("se.mdh.progresside.remes.diagram.ConditionalConnector_3006"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Variable_3007 = getElementType("se.mdh.progresside.remes.diagram.Variable_3007"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType EntryPoint_3014 = getElementType("se.mdh.progresside.remes.diagram.EntryPoint_3014"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType ExitPoint_3015 = getElementType("se.mdh.progresside.remes.diagram.ExitPoint_3015"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType CompositeEntryPoint_3016 = getElementType("se.mdh.progresside.remes.diagram.CompositeEntryPoint_3016"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType CompositeExitPoint_3017 = getElementType("se.mdh.progresside.remes.diagram.CompositeExitPoint_3017"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType InitPoint_3018 = getElementType("se.mdh.progresside.remes.diagram.InitPoint_3018"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType EntryPoint_3012 = getElementType("se.mdh.progresside.remes.diagram.EntryPoint_3012"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType ExitPoint_3013 = getElementType("se.mdh.progresside.remes.diagram.ExitPoint_3013"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType EntryPoint_3010 = getElementType("se.mdh.progresside.remes.diagram.EntryPoint_3010"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType ExitPoint_3011 = getElementType("se.mdh.progresside.remes.diagram.ExitPoint_3011"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Edge_4001 = getElementType("se.mdh.progresside.remes.diagram.Edge_4001"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType InitEdge_4002 = getElementType("se.mdh.progresside.remes.diagram.InitEdge_4002"); //$NON-NLS-1$

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
				return RemesDiagramEditorPlugin.getInstance()
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

			elements.put(RemesDiagram_1000, RemesPackage.eINSTANCE
					.getRemesDiagram());

			elements.put(SubMode_2001, RemesPackage.eINSTANCE.getSubMode());

			elements.put(CompositeMode_2002, RemesPackage.eINSTANCE
					.getCompositeMode());

			elements.put(Variable_3001, RemesPackage.eINSTANCE.getVariable());

			elements.put(Resource_3002, RemesPackage.eINSTANCE.getResource());

			elements.put(EntryPoint_3008, RemesPackage.eINSTANCE
					.getEntryPoint());

			elements.put(ExitPoint_3009, RemesPackage.eINSTANCE.getExitPoint());

			elements.put(SubMode_3003, RemesPackage.eINSTANCE.getSubMode());

			elements.put(Variable_3004, RemesPackage.eINSTANCE.getVariable());

			elements.put(Resource_3005, RemesPackage.eINSTANCE.getResource());

			elements.put(EntryPoint_3010, RemesPackage.eINSTANCE
					.getEntryPoint());

			elements.put(ExitPoint_3011, RemesPackage.eINSTANCE.getExitPoint());

			elements.put(ConditionalConnector_3006, RemesPackage.eINSTANCE
					.getConditionalConnector());

			elements.put(EntryPoint_3012, RemesPackage.eINSTANCE
					.getEntryPoint());

			elements.put(ExitPoint_3013, RemesPackage.eINSTANCE.getExitPoint());

			elements.put(Variable_3007, RemesPackage.eINSTANCE.getVariable());

			elements.put(EntryPoint_3014, RemesPackage.eINSTANCE
					.getEntryPoint());

			elements.put(ExitPoint_3015, RemesPackage.eINSTANCE.getExitPoint());

			elements.put(CompositeEntryPoint_3016, RemesPackage.eINSTANCE
					.getCompositeEntryPoint());

			elements.put(CompositeExitPoint_3017, RemesPackage.eINSTANCE
					.getCompositeExitPoint());

			elements.put(InitPoint_3018, RemesPackage.eINSTANCE.getInitPoint());

			elements.put(Edge_4001, RemesPackage.eINSTANCE.getEdge());

			elements.put(InitEdge_4002, RemesPackage.eINSTANCE.getInitEdge());
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
			KNOWN_ELEMENT_TYPES.add(RemesDiagram_1000);
			KNOWN_ELEMENT_TYPES.add(SubMode_2001);
			KNOWN_ELEMENT_TYPES.add(CompositeMode_2002);
			KNOWN_ELEMENT_TYPES.add(Variable_3001);
			KNOWN_ELEMENT_TYPES.add(Resource_3002);
			KNOWN_ELEMENT_TYPES.add(EntryPoint_3008);
			KNOWN_ELEMENT_TYPES.add(ExitPoint_3009);
			KNOWN_ELEMENT_TYPES.add(SubMode_3003);
			KNOWN_ELEMENT_TYPES.add(Variable_3004);
			KNOWN_ELEMENT_TYPES.add(Resource_3005);
			KNOWN_ELEMENT_TYPES.add(EntryPoint_3010);
			KNOWN_ELEMENT_TYPES.add(ExitPoint_3011);
			KNOWN_ELEMENT_TYPES.add(ConditionalConnector_3006);
			KNOWN_ELEMENT_TYPES.add(EntryPoint_3012);
			KNOWN_ELEMENT_TYPES.add(ExitPoint_3013);
			KNOWN_ELEMENT_TYPES.add(Variable_3007);
			KNOWN_ELEMENT_TYPES.add(EntryPoint_3014);
			KNOWN_ELEMENT_TYPES.add(ExitPoint_3015);
			KNOWN_ELEMENT_TYPES.add(CompositeEntryPoint_3016);
			KNOWN_ELEMENT_TYPES.add(CompositeExitPoint_3017);
			KNOWN_ELEMENT_TYPES.add(InitPoint_3018);
			KNOWN_ELEMENT_TYPES.add(Edge_4001);
			KNOWN_ELEMENT_TYPES.add(InitEdge_4002);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	 * @generated
	 */
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case RemesDiagramEditPart.VISUAL_ID:
			return RemesDiagram_1000;
		case SubModeEditPart.VISUAL_ID:
			return SubMode_2001;
		case CompositeModeEditPart.VISUAL_ID:
			return CompositeMode_2002;
		case VariableEditPart.VISUAL_ID:
			return Variable_3001;
		case ResourceEditPart.VISUAL_ID:
			return Resource_3002;
		case EntryPointEditPart.VISUAL_ID:
			return EntryPoint_3008;
		case ExitPointEditPart.VISUAL_ID:
			return ExitPoint_3009;
		case SubMode2EditPart.VISUAL_ID:
			return SubMode_3003;
		case Variable2EditPart.VISUAL_ID:
			return Variable_3004;
		case Resource2EditPart.VISUAL_ID:
			return Resource_3005;
		case EntryPoint2EditPart.VISUAL_ID:
			return EntryPoint_3010;
		case ExitPoint2EditPart.VISUAL_ID:
			return ExitPoint_3011;
		case ConditionalConnectorEditPart.VISUAL_ID:
			return ConditionalConnector_3006;
		case EntryPoint3EditPart.VISUAL_ID:
			return EntryPoint_3012;
		case ExitPoint3EditPart.VISUAL_ID:
			return ExitPoint_3013;
		case Variable3EditPart.VISUAL_ID:
			return Variable_3007;
		case EntryPoint4EditPart.VISUAL_ID:
			return EntryPoint_3014;
		case ExitPoint4EditPart.VISUAL_ID:
			return ExitPoint_3015;
		case CompositeEntryPointEditPart.VISUAL_ID:
			return CompositeEntryPoint_3016;
		case CompositeExitPointEditPart.VISUAL_ID:
			return CompositeExitPoint_3017;
		case InitPointEditPart.VISUAL_ID:
			return InitPoint_3018;
		case EdgeEditPart.VISUAL_ID:
			return Edge_4001;
		case InitEdgeEditPart.VISUAL_ID:
			return InitEdge_4002;
		}
		return null;
	}

}
