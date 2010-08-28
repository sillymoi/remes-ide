package hr.fer.rasip.uppaallite.subdiagram.providers;

import hr.fer.rasip.uppaallite.UppaallitePackage;
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
import hr.fer.rasip.uppaallite.subdiagram.edit.parts.TransitionTypeAssignmentEditPart;
import hr.fer.rasip.uppaallite.subdiagram.edit.parts.TransitionTypeGuardEditPart;
import hr.fer.rasip.uppaallite.subdiagram.edit.parts.TransitionTypeSyncEditPart;
import hr.fer.rasip.uppaallite.subdiagram.parsers.MessageFormatParser;
import hr.fer.rasip.uppaallite.subdiagram.part.UppaalliteVisualIDRegistry;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.GetParserOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserProvider;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserService;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.parser.ParserHintAdapter;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class UppaalliteParserProvider extends AbstractProvider implements
		IParserProvider {

	/**
	 * @generated
	 */
	private IParser locationTypeName_5013Parser;

	/**
	 * @generated
	 */
	private IParser getLocationTypeName_5013Parser() {
		if (locationTypeName_5013Parser == null) {
			EAttribute[] features = new EAttribute[] { UppaallitePackage.eINSTANCE
					.getLocationType_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			locationTypeName_5013Parser = parser;
		}
		return locationTypeName_5013Parser;
	}

	/**
	 * @generated
	 */
	private IParser locationTypeInvariant_5014Parser;

	/**
	 * @generated
	 */
	private IParser getLocationTypeInvariant_5014Parser() {
		if (locationTypeInvariant_5014Parser == null) {
			EAttribute[] features = new EAttribute[] { UppaallitePackage.eINSTANCE
					.getLocationType_Invariant() };
			MessageFormatParser parser = new MessageFormatParser(features);
			locationTypeInvariant_5014Parser = parser;
		}
		return locationTypeInvariant_5014Parser;
	}

	/**
	 * @generated
	 */
	private IParser locationTypeName_5015Parser;

	/**
	 * @generated
	 */
	private IParser getLocationTypeName_5015Parser() {
		if (locationTypeName_5015Parser == null) {
			EAttribute[] features = new EAttribute[] { UppaallitePackage.eINSTANCE
					.getLocationType_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			locationTypeName_5015Parser = parser;
		}
		return locationTypeName_5015Parser;
	}

	/**
	 * @generated
	 */
	private IParser locationTypeInvariant_5016Parser;

	/**
	 * @generated
	 */
	private IParser getLocationTypeInvariant_5016Parser() {
		if (locationTypeInvariant_5016Parser == null) {
			EAttribute[] features = new EAttribute[] { UppaallitePackage.eINSTANCE
					.getLocationType_Invariant() };
			MessageFormatParser parser = new MessageFormatParser(features);
			locationTypeInvariant_5016Parser = parser;
		}
		return locationTypeInvariant_5016Parser;
	}

	/**
	 * @generated
	 */
	private IParser locationTypeName_5017Parser;

	/**
	 * @generated
	 */
	private IParser getLocationTypeName_5017Parser() {
		if (locationTypeName_5017Parser == null) {
			EAttribute[] features = new EAttribute[] { UppaallitePackage.eINSTANCE
					.getLocationType_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			locationTypeName_5017Parser = parser;
		}
		return locationTypeName_5017Parser;
	}

	/**
	 * @generated
	 */
	private IParser locationTypeInvariant_5018Parser;

	/**
	 * @generated
	 */
	private IParser getLocationTypeInvariant_5018Parser() {
		if (locationTypeInvariant_5018Parser == null) {
			EAttribute[] features = new EAttribute[] { UppaallitePackage.eINSTANCE
					.getLocationType_Invariant() };
			MessageFormatParser parser = new MessageFormatParser(features);
			locationTypeInvariant_5018Parser = parser;
		}
		return locationTypeInvariant_5018Parser;
	}

	/**
	 * @generated
	 */
	private IParser locationTypeName_5019Parser;

	/**
	 * @generated
	 */
	private IParser getLocationTypeName_5019Parser() {
		if (locationTypeName_5019Parser == null) {
			EAttribute[] features = new EAttribute[] { UppaallitePackage.eINSTANCE
					.getLocationType_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			locationTypeName_5019Parser = parser;
		}
		return locationTypeName_5019Parser;
	}

	/**
	 * @generated
	 */
	private IParser locationTypeInvariant_5020Parser;

	/**
	 * @generated
	 */
	private IParser getLocationTypeInvariant_5020Parser() {
		if (locationTypeInvariant_5020Parser == null) {
			EAttribute[] features = new EAttribute[] { UppaallitePackage.eINSTANCE
					.getLocationType_Invariant() };
			MessageFormatParser parser = new MessageFormatParser(features);
			locationTypeInvariant_5020Parser = parser;
		}
		return locationTypeInvariant_5020Parser;
	}

	/**
	 * @generated
	 */
	private IParser locationTypeName_5021Parser;

	/**
	 * @generated
	 */
	private IParser getLocationTypeName_5021Parser() {
		if (locationTypeName_5021Parser == null) {
			EAttribute[] features = new EAttribute[] { UppaallitePackage.eINSTANCE
					.getLocationType_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			locationTypeName_5021Parser = parser;
		}
		return locationTypeName_5021Parser;
	}

	/**
	 * @generated
	 */
	private IParser locationTypeInvariant_5022Parser;

	/**
	 * @generated
	 */
	private IParser getLocationTypeInvariant_5022Parser() {
		if (locationTypeInvariant_5022Parser == null) {
			EAttribute[] features = new EAttribute[] { UppaallitePackage.eINSTANCE
					.getLocationType_Invariant() };
			MessageFormatParser parser = new MessageFormatParser(features);
			locationTypeInvariant_5022Parser = parser;
		}
		return locationTypeInvariant_5022Parser;
	}

	/**
	 * @generated
	 */
	private IParser locationTypeName_5023Parser;

	/**
	 * @generated
	 */
	private IParser getLocationTypeName_5023Parser() {
		if (locationTypeName_5023Parser == null) {
			EAttribute[] features = new EAttribute[] { UppaallitePackage.eINSTANCE
					.getLocationType_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			locationTypeName_5023Parser = parser;
		}
		return locationTypeName_5023Parser;
	}

	/**
	 * @generated
	 */
	private IParser locationTypeInvariant_5024Parser;

	/**
	 * @generated
	 */
	private IParser getLocationTypeInvariant_5024Parser() {
		if (locationTypeInvariant_5024Parser == null) {
			EAttribute[] features = new EAttribute[] { UppaallitePackage.eINSTANCE
					.getLocationType_Invariant() };
			MessageFormatParser parser = new MessageFormatParser(features);
			locationTypeInvariant_5024Parser = parser;
		}
		return locationTypeInvariant_5024Parser;
	}

	/**
	 * @generated
	 */
	private IParser transitionTypeAssignment_6004Parser;

	/**
	 * @generated
	 */
	private IParser getTransitionTypeAssignment_6004Parser() {
		if (transitionTypeAssignment_6004Parser == null) {
			EAttribute[] features = new EAttribute[] { UppaallitePackage.eINSTANCE
					.getTransitionType_Assignment() };
			MessageFormatParser parser = new MessageFormatParser(features);
			transitionTypeAssignment_6004Parser = parser;
		}
		return transitionTypeAssignment_6004Parser;
	}

	/**
	 * @generated
	 */
	private IParser transitionTypeGuard_6005Parser;

	/**
	 * @generated
	 */
	private IParser getTransitionTypeGuard_6005Parser() {
		if (transitionTypeGuard_6005Parser == null) {
			EAttribute[] features = new EAttribute[] { UppaallitePackage.eINSTANCE
					.getTransitionType_Guard() };
			MessageFormatParser parser = new MessageFormatParser(features);
			transitionTypeGuard_6005Parser = parser;
		}
		return transitionTypeGuard_6005Parser;
	}

	/**
	 * @generated
	 */
	private IParser transitionTypeSync_6006Parser;

	/**
	 * @generated
	 */
	private IParser getTransitionTypeSync_6006Parser() {
		if (transitionTypeSync_6006Parser == null) {
			EAttribute[] features = new EAttribute[] { UppaallitePackage.eINSTANCE
					.getTransitionType_Sync() };
			MessageFormatParser parser = new MessageFormatParser(features);
			transitionTypeSync_6006Parser = parser;
		}
		return transitionTypeSync_6006Parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case LocationTypeNameEditPart.VISUAL_ID:
			return getLocationTypeName_5013Parser();
		case LocationTypeInvariantEditPart.VISUAL_ID:
			return getLocationTypeInvariant_5014Parser();
		case LocationTypeName2EditPart.VISUAL_ID:
			return getLocationTypeName_5015Parser();
		case LocationTypeInvariant2EditPart.VISUAL_ID:
			return getLocationTypeInvariant_5016Parser();
		case LocationTypeName3EditPart.VISUAL_ID:
			return getLocationTypeName_5017Parser();
		case LocationTypeInvariant3EditPart.VISUAL_ID:
			return getLocationTypeInvariant_5018Parser();
		case LocationTypeName4EditPart.VISUAL_ID:
			return getLocationTypeName_5019Parser();
		case LocationTypeInvariant4EditPart.VISUAL_ID:
			return getLocationTypeInvariant_5020Parser();
		case LocationTypeName5EditPart.VISUAL_ID:
			return getLocationTypeName_5021Parser();
		case LocationTypeInvariant5EditPart.VISUAL_ID:
			return getLocationTypeInvariant_5022Parser();
		case LocationTypeName6EditPart.VISUAL_ID:
			return getLocationTypeName_5023Parser();
		case LocationTypeInvariant6EditPart.VISUAL_ID:
			return getLocationTypeInvariant_5024Parser();
		case TransitionTypeAssignmentEditPart.VISUAL_ID:
			return getTransitionTypeAssignment_6004Parser();
		case TransitionTypeGuardEditPart.VISUAL_ID:
			return getTransitionTypeGuard_6005Parser();
		case TransitionTypeSyncEditPart.VISUAL_ID:
			return getTransitionTypeSync_6006Parser();
		}
		return null;
	}

	/**
	 * Utility method that consults ParserService
	 * @generated
	 */
	public static IParser getParser(IElementType type, EObject object,
			String parserHint) {
		return ParserService.getInstance().getParser(
				new HintAdapter(type, object, parserHint));
	}

	/**
	 * @generated
	 */
	public IParser getParser(IAdaptable hint) {
		String vid = (String) hint.getAdapter(String.class);
		if (vid != null) {
			return getParser(UppaalliteVisualIDRegistry.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(UppaalliteVisualIDRegistry.getVisualID(view));
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (UppaalliteElementTypes.getElement(hint) == null) {
				return false;
			}
			return getParser(hint) != null;
		}
		return false;
	}

	/**
	 * @generated
	 */
	private static class HintAdapter extends ParserHintAdapter {

		/**
		 * @generated
		 */
		private final IElementType elementType;

		/**
		 * @generated
		 */
		public HintAdapter(IElementType type, EObject object, String parserHint) {
			super(object, parserHint);
			assert type != null;
			elementType = type;
		}

		/**
		 * @generated
		 */
		public Object getAdapter(Class adapter) {
			if (IElementType.class.equals(adapter)) {
				return elementType;
			}
			return super.getAdapter(adapter);
		}
	}

}
