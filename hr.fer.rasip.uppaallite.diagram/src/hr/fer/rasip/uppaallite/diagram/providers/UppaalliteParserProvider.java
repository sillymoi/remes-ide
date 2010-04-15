package hr.fer.rasip.uppaallite.diagram.providers;

import hr.fer.rasip.uppaallite.UppaallitePackage;
import hr.fer.rasip.uppaallite.diagram.edit.parts.LocationTypeInvariant2EditPart;
import hr.fer.rasip.uppaallite.diagram.edit.parts.LocationTypeInvariant3EditPart;
import hr.fer.rasip.uppaallite.diagram.edit.parts.LocationTypeInvariantEditPart;
import hr.fer.rasip.uppaallite.diagram.edit.parts.LocationTypeName2EditPart;
import hr.fer.rasip.uppaallite.diagram.edit.parts.LocationTypeName3EditPart;
import hr.fer.rasip.uppaallite.diagram.edit.parts.LocationTypeNameEditPart;
import hr.fer.rasip.uppaallite.diagram.edit.parts.TransitionTypeAssignmentEditPart;
import hr.fer.rasip.uppaallite.diagram.edit.parts.TransitionTypeGuardEditPart;
import hr.fer.rasip.uppaallite.diagram.edit.parts.TransitionTypeSyncEditPart;
import hr.fer.rasip.uppaallite.diagram.parsers.MessageFormatParser;
import hr.fer.rasip.uppaallite.diagram.part.UppaalliteVisualIDRegistry;

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
	private IParser locationTypeName_5001Parser;

	/**
	 * @generated
	 */
	private IParser getLocationTypeName_5001Parser() {
		if (locationTypeName_5001Parser == null) {
			EAttribute[] features = new EAttribute[] { UppaallitePackage.eINSTANCE
					.getLocationType_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			locationTypeName_5001Parser = parser;
		}
		return locationTypeName_5001Parser;
	}

	/**
	 * @generated
	 */
	private IParser locationTypeInvariant_5002Parser;

	/**
	 * @generated
	 */
	private IParser getLocationTypeInvariant_5002Parser() {
		if (locationTypeInvariant_5002Parser == null) {
			EAttribute[] features = new EAttribute[] { UppaallitePackage.eINSTANCE
					.getLocationType_Invariant() };
			MessageFormatParser parser = new MessageFormatParser(features);
			locationTypeInvariant_5002Parser = parser;
		}
		return locationTypeInvariant_5002Parser;
	}

	/**
	 * @generated
	 */
	private IParser locationTypeName_5003Parser;

	/**
	 * @generated
	 */
	private IParser getLocationTypeName_5003Parser() {
		if (locationTypeName_5003Parser == null) {
			EAttribute[] features = new EAttribute[] { UppaallitePackage.eINSTANCE
					.getLocationType_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			locationTypeName_5003Parser = parser;
		}
		return locationTypeName_5003Parser;
	}

	/**
	 * @generated
	 */
	private IParser locationTypeInvariant_5004Parser;

	/**
	 * @generated
	 */
	private IParser getLocationTypeInvariant_5004Parser() {
		if (locationTypeInvariant_5004Parser == null) {
			EAttribute[] features = new EAttribute[] { UppaallitePackage.eINSTANCE
					.getLocationType_Invariant() };
			MessageFormatParser parser = new MessageFormatParser(features);
			locationTypeInvariant_5004Parser = parser;
		}
		return locationTypeInvariant_5004Parser;
	}

	/**
	 * @generated
	 */
	private IParser locationTypeName_5005Parser;

	/**
	 * @generated
	 */
	private IParser getLocationTypeName_5005Parser() {
		if (locationTypeName_5005Parser == null) {
			EAttribute[] features = new EAttribute[] { UppaallitePackage.eINSTANCE
					.getLocationType_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			locationTypeName_5005Parser = parser;
		}
		return locationTypeName_5005Parser;
	}

	/**
	 * @generated
	 */
	private IParser locationTypeInvariant_5006Parser;

	/**
	 * @generated
	 */
	private IParser getLocationTypeInvariant_5006Parser() {
		if (locationTypeInvariant_5006Parser == null) {
			EAttribute[] features = new EAttribute[] { UppaallitePackage.eINSTANCE
					.getLocationType_Invariant() };
			MessageFormatParser parser = new MessageFormatParser(features);
			locationTypeInvariant_5006Parser = parser;
		}
		return locationTypeInvariant_5006Parser;
	}

	/**
	 * @generated
	 */
	private IParser transitionTypeAssignment_6001Parser;

	/**
	 * @generated
	 */
	private IParser getTransitionTypeAssignment_6001Parser() {
		if (transitionTypeAssignment_6001Parser == null) {
			EAttribute[] features = new EAttribute[] { UppaallitePackage.eINSTANCE
					.getTransitionType_Assignment() };
			MessageFormatParser parser = new MessageFormatParser(features);
			transitionTypeAssignment_6001Parser = parser;
		}
		return transitionTypeAssignment_6001Parser;
	}

	/**
	 * @generated
	 */
	private IParser transitionTypeGuard_6002Parser;

	/**
	 * @generated
	 */
	private IParser getTransitionTypeGuard_6002Parser() {
		if (transitionTypeGuard_6002Parser == null) {
			EAttribute[] features = new EAttribute[] { UppaallitePackage.eINSTANCE
					.getTransitionType_Guard() };
			MessageFormatParser parser = new MessageFormatParser(features);
			transitionTypeGuard_6002Parser = parser;
		}
		return transitionTypeGuard_6002Parser;
	}

	/**
	 * @generated
	 */
	private IParser transitionTypeSync_6003Parser;

	/**
	 * @generated
	 */
	private IParser getTransitionTypeSync_6003Parser() {
		if (transitionTypeSync_6003Parser == null) {
			EAttribute[] features = new EAttribute[] { UppaallitePackage.eINSTANCE
					.getTransitionType_Sync() };
			MessageFormatParser parser = new MessageFormatParser(features);
			transitionTypeSync_6003Parser = parser;
		}
		return transitionTypeSync_6003Parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case LocationTypeNameEditPart.VISUAL_ID:
			return getLocationTypeName_5001Parser();
		case LocationTypeInvariantEditPart.VISUAL_ID:
			return getLocationTypeInvariant_5002Parser();
		case LocationTypeName2EditPart.VISUAL_ID:
			return getLocationTypeName_5003Parser();
		case LocationTypeInvariant2EditPart.VISUAL_ID:
			return getLocationTypeInvariant_5004Parser();
		case LocationTypeName3EditPart.VISUAL_ID:
			return getLocationTypeName_5005Parser();
		case LocationTypeInvariant3EditPart.VISUAL_ID:
			return getLocationTypeInvariant_5006Parser();
		case TransitionTypeAssignmentEditPart.VISUAL_ID:
			return getTransitionTypeAssignment_6001Parser();
		case TransitionTypeGuardEditPart.VISUAL_ID:
			return getTransitionTypeGuard_6002Parser();
		case TransitionTypeSyncEditPart.VISUAL_ID:
			return getTransitionTypeSync_6003Parser();
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
