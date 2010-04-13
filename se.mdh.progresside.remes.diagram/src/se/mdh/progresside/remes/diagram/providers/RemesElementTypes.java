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
	public static final IElementType SubMode_2007 = getElementType("se.mdh.progresside.remes.diagram.SubMode_2007"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType CompositeMode_2008 = getElementType("se.mdh.progresside.remes.diagram.CompositeMode_2008"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Variable_3022 = getElementType("se.mdh.progresside.remes.diagram.Variable_3022"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Resource_3023 = getElementType("se.mdh.progresside.remes.diagram.Resource_3023"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType EntryPoint_3024 = getElementType("se.mdh.progresside.remes.diagram.EntryPoint_3024"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType ExitPoint_3025 = getElementType("se.mdh.progresside.remes.diagram.ExitPoint_3025"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Constant_3041 = getElementType("se.mdh.progresside.remes.diagram.Constant_3041"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType SubMode_3026 = getElementType("se.mdh.progresside.remes.diagram.SubMode_3026"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Variable_3027 = getElementType("se.mdh.progresside.remes.diagram.Variable_3027"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Resource_3028 = getElementType("se.mdh.progresside.remes.diagram.Resource_3028"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType EntryPoint_3029 = getElementType("se.mdh.progresside.remes.diagram.EntryPoint_3029"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType ExitPoint_3030 = getElementType("se.mdh.progresside.remes.diagram.ExitPoint_3030"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Constant_3042 = getElementType("se.mdh.progresside.remes.diagram.Constant_3042"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType ConditionalConnector_3031 = getElementType("se.mdh.progresside.remes.diagram.ConditionalConnector_3031"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType EntryPoint_3032 = getElementType("se.mdh.progresside.remes.diagram.EntryPoint_3032"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType ExitPoint_3033 = getElementType("se.mdh.progresside.remes.diagram.ExitPoint_3033"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Variable_3034 = getElementType("se.mdh.progresside.remes.diagram.Variable_3034"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType EntryPoint_3035 = getElementType("se.mdh.progresside.remes.diagram.EntryPoint_3035"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType ExitPoint_3036 = getElementType("se.mdh.progresside.remes.diagram.ExitPoint_3036"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType CompositeEntryPoint_3037 = getElementType("se.mdh.progresside.remes.diagram.CompositeEntryPoint_3037"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType CompositeExitPoint_3038 = getElementType("se.mdh.progresside.remes.diagram.CompositeExitPoint_3038"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType InitPoint_3039 = getElementType("se.mdh.progresside.remes.diagram.InitPoint_3039"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Resource_3040 = getElementType("se.mdh.progresside.remes.diagram.Resource_3040"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Constant_3043 = getElementType("se.mdh.progresside.remes.diagram.Constant_3043"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Edge_4028 = getElementType("se.mdh.progresside.remes.diagram.Edge_4028"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType InitEdge_4029 = getElementType("se.mdh.progresside.remes.diagram.InitEdge_4029"); //$NON-NLS-1$

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

			elements.put(SubMode_2007, RemesPackage.eINSTANCE.getSubMode());

			elements.put(CompositeMode_2008, RemesPackage.eINSTANCE
					.getCompositeMode());

			elements.put(Variable_3022, RemesPackage.eINSTANCE.getVariable());

			elements.put(Resource_3023, RemesPackage.eINSTANCE.getResource());

			elements.put(EntryPoint_3024, RemesPackage.eINSTANCE
					.getEntryPoint());

			elements.put(ExitPoint_3025, RemesPackage.eINSTANCE.getExitPoint());

			elements.put(Constant_3041, RemesPackage.eINSTANCE.getConstant());

			elements.put(SubMode_3026, RemesPackage.eINSTANCE.getSubMode());

			elements.put(Variable_3027, RemesPackage.eINSTANCE.getVariable());

			elements.put(Resource_3028, RemesPackage.eINSTANCE.getResource());

			elements.put(EntryPoint_3029, RemesPackage.eINSTANCE
					.getEntryPoint());

			elements.put(ExitPoint_3030, RemesPackage.eINSTANCE.getExitPoint());

			elements.put(Constant_3042, RemesPackage.eINSTANCE.getConstant());

			elements.put(ConditionalConnector_3031, RemesPackage.eINSTANCE
					.getConditionalConnector());

			elements.put(EntryPoint_3032, RemesPackage.eINSTANCE
					.getEntryPoint());

			elements.put(ExitPoint_3033, RemesPackage.eINSTANCE.getExitPoint());

			elements.put(Variable_3034, RemesPackage.eINSTANCE.getVariable());

			elements.put(EntryPoint_3035, RemesPackage.eINSTANCE
					.getEntryPoint());

			elements.put(ExitPoint_3036, RemesPackage.eINSTANCE.getExitPoint());

			elements.put(CompositeEntryPoint_3037, RemesPackage.eINSTANCE
					.getCompositeEntryPoint());

			elements.put(CompositeExitPoint_3038, RemesPackage.eINSTANCE
					.getCompositeExitPoint());

			elements.put(InitPoint_3039, RemesPackage.eINSTANCE.getInitPoint());

			elements.put(Resource_3040, RemesPackage.eINSTANCE.getResource());

			elements.put(Constant_3043, RemesPackage.eINSTANCE.getConstant());

			elements.put(Edge_4028, RemesPackage.eINSTANCE.getEdge());

			elements.put(InitEdge_4029, RemesPackage.eINSTANCE.getInitEdge());
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
			KNOWN_ELEMENT_TYPES.add(SubMode_2007);
			KNOWN_ELEMENT_TYPES.add(CompositeMode_2008);
			KNOWN_ELEMENT_TYPES.add(Variable_3022);
			KNOWN_ELEMENT_TYPES.add(Resource_3023);
			KNOWN_ELEMENT_TYPES.add(EntryPoint_3024);
			KNOWN_ELEMENT_TYPES.add(ExitPoint_3025);
			KNOWN_ELEMENT_TYPES.add(Constant_3041);
			KNOWN_ELEMENT_TYPES.add(SubMode_3026);
			KNOWN_ELEMENT_TYPES.add(Variable_3027);
			KNOWN_ELEMENT_TYPES.add(Resource_3028);
			KNOWN_ELEMENT_TYPES.add(EntryPoint_3029);
			KNOWN_ELEMENT_TYPES.add(ExitPoint_3030);
			KNOWN_ELEMENT_TYPES.add(Constant_3042);
			KNOWN_ELEMENT_TYPES.add(ConditionalConnector_3031);
			KNOWN_ELEMENT_TYPES.add(EntryPoint_3032);
			KNOWN_ELEMENT_TYPES.add(ExitPoint_3033);
			KNOWN_ELEMENT_TYPES.add(Variable_3034);
			KNOWN_ELEMENT_TYPES.add(EntryPoint_3035);
			KNOWN_ELEMENT_TYPES.add(ExitPoint_3036);
			KNOWN_ELEMENT_TYPES.add(CompositeEntryPoint_3037);
			KNOWN_ELEMENT_TYPES.add(CompositeExitPoint_3038);
			KNOWN_ELEMENT_TYPES.add(InitPoint_3039);
			KNOWN_ELEMENT_TYPES.add(Resource_3040);
			KNOWN_ELEMENT_TYPES.add(Constant_3043);
			KNOWN_ELEMENT_TYPES.add(Edge_4028);
			KNOWN_ELEMENT_TYPES.add(InitEdge_4029);
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
			return SubMode_2007;
		case CompositeModeEditPart.VISUAL_ID:
			return CompositeMode_2008;
		case VariableEditPart.VISUAL_ID:
			return Variable_3022;
		case ResourceEditPart.VISUAL_ID:
			return Resource_3023;
		case EntryPointEditPart.VISUAL_ID:
			return EntryPoint_3024;
		case ExitPointEditPart.VISUAL_ID:
			return ExitPoint_3025;
		case ConstantEditPart.VISUAL_ID:
			return Constant_3041;
		case SubMode2EditPart.VISUAL_ID:
			return SubMode_3026;
		case Variable2EditPart.VISUAL_ID:
			return Variable_3027;
		case Resource2EditPart.VISUAL_ID:
			return Resource_3028;
		case EntryPoint2EditPart.VISUAL_ID:
			return EntryPoint_3029;
		case ExitPoint2EditPart.VISUAL_ID:
			return ExitPoint_3030;
		case Constant2EditPart.VISUAL_ID:
			return Constant_3042;
		case ConditionalConnectorEditPart.VISUAL_ID:
			return ConditionalConnector_3031;
		case EntryPoint3EditPart.VISUAL_ID:
			return EntryPoint_3032;
		case ExitPoint3EditPart.VISUAL_ID:
			return ExitPoint_3033;
		case Variable3EditPart.VISUAL_ID:
			return Variable_3034;
		case EntryPoint4EditPart.VISUAL_ID:
			return EntryPoint_3035;
		case ExitPoint4EditPart.VISUAL_ID:
			return ExitPoint_3036;
		case CompositeEntryPointEditPart.VISUAL_ID:
			return CompositeEntryPoint_3037;
		case CompositeExitPointEditPart.VISUAL_ID:
			return CompositeExitPoint_3038;
		case InitPointEditPart.VISUAL_ID:
			return InitPoint_3039;
		case Resource3EditPart.VISUAL_ID:
			return Resource_3040;
		case Constant3EditPart.VISUAL_ID:
			return Constant_3043;
		case EdgeEditPart.VISUAL_ID:
			return Edge_4028;
		case InitEdgeEditPart.VISUAL_ID:
			return InitEdge_4029;
		}
		return null;
	}

}
