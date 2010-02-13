package se.mdh.progresside.remes.diagram.providers;

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

import se.mdh.progresside.remes.RemesPackage;
import se.mdh.progresside.remes.diagram.edit.parts.CompositeModeInitializationEditPart;
import se.mdh.progresside.remes.diagram.edit.parts.CompositeModeNameEditPart;
import se.mdh.progresside.remes.diagram.edit.parts.ConditionalConnectorNameEditPart;
import se.mdh.progresside.remes.diagram.edit.parts.EdgeActionGuardEditPart;
import se.mdh.progresside.remes.diagram.edit.parts.InitEdgeInitializationEditPart;
import se.mdh.progresside.remes.diagram.edit.parts.Resource2EditPart;
import se.mdh.progresside.remes.diagram.edit.parts.ResourceEditPart;
import se.mdh.progresside.remes.diagram.edit.parts.SubModeInitialization2EditPart;
import se.mdh.progresside.remes.diagram.edit.parts.SubModeInitializationEditPart;
import se.mdh.progresside.remes.diagram.edit.parts.SubModeInvariant2EditPart;
import se.mdh.progresside.remes.diagram.edit.parts.SubModeInvariantEditPart;
import se.mdh.progresside.remes.diagram.edit.parts.SubModeIsUrgent2EditPart;
import se.mdh.progresside.remes.diagram.edit.parts.SubModeIsUrgentEditPart;
import se.mdh.progresside.remes.diagram.edit.parts.SubModeName2EditPart;
import se.mdh.progresside.remes.diagram.edit.parts.SubModeNameEditPart;
import se.mdh.progresside.remes.diagram.edit.parts.Variable2EditPart;
import se.mdh.progresside.remes.diagram.edit.parts.Variable3EditPart;
import se.mdh.progresside.remes.diagram.edit.parts.VariableEditPart;
import se.mdh.progresside.remes.diagram.parsers.MessageFormatParser;
import se.mdh.progresside.remes.diagram.part.RemesVisualIDRegistry;

/**
 * @generated
 */
public class RemesParserProvider extends AbstractProvider implements
		IParserProvider {

	/**
	 * @generated
	 */
	private IParser subModeName_5001Parser;

	/**
	 * @generated
	 */
	private IParser getSubModeName_5001Parser() {
		if (subModeName_5001Parser == null) {
			EAttribute[] features = new EAttribute[] { RemesPackage.eINSTANCE
					.getControlPath_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { RemesPackage.eINSTANCE
					.getControlPath_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			subModeName_5001Parser = parser;
		}
		return subModeName_5001Parser;
	}

	/**
	 * @generated
	 */
	private IParser subModeInitialization_5002Parser;

	/**
	 * @generated
	 */
	private IParser getSubModeInitialization_5002Parser() {
		if (subModeInitialization_5002Parser == null) {
			EAttribute[] features = new EAttribute[] { RemesPackage.eINSTANCE
					.getMode_Initialization() };
			EAttribute[] editableFeatures = new EAttribute[] { RemesPackage.eINSTANCE
					.getMode_Initialization() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			subModeInitialization_5002Parser = parser;
		}
		return subModeInitialization_5002Parser;
	}

	/**
	 * @generated
	 */
	private IParser subModeInvariant_5003Parser;

	/**
	 * @generated
	 */
	private IParser getSubModeInvariant_5003Parser() {
		if (subModeInvariant_5003Parser == null) {
			EAttribute[] features = new EAttribute[] { RemesPackage.eINSTANCE
					.getSubMode_Invariant() };
			EAttribute[] editableFeatures = new EAttribute[] { RemesPackage.eINSTANCE
					.getSubMode_Invariant() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			subModeInvariant_5003Parser = parser;
		}
		return subModeInvariant_5003Parser;
	}

	/**
	 * @generated
	 */
	private IParser subModeIsUrgent_5004Parser;

	/**
	 * @generated
	 */
	private IParser getSubModeIsUrgent_5004Parser() {
		if (subModeIsUrgent_5004Parser == null) {
			EAttribute[] features = new EAttribute[] { RemesPackage.eINSTANCE
					.getSubMode_IsUrgent() };
			EAttribute[] editableFeatures = new EAttribute[] { RemesPackage.eINSTANCE
					.getSubMode_IsUrgent() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			subModeIsUrgent_5004Parser = parser;
		}
		return subModeIsUrgent_5004Parser;
	}

	/**
	 * @generated
	 */
	private IParser compositeModeName_5010Parser;

	/**
	 * @generated
	 */
	private IParser getCompositeModeName_5010Parser() {
		if (compositeModeName_5010Parser == null) {
			EAttribute[] features = new EAttribute[] { RemesPackage.eINSTANCE
					.getControlPath_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			compositeModeName_5010Parser = parser;
		}
		return compositeModeName_5010Parser;
	}

	/**
	 * @generated
	 */
	private IParser compositeModeInitialization_5011Parser;

	/**
	 * @generated
	 */
	private IParser getCompositeModeInitialization_5011Parser() {
		if (compositeModeInitialization_5011Parser == null) {
			EAttribute[] features = new EAttribute[] { RemesPackage.eINSTANCE
					.getMode_Initialization() };
			MessageFormatParser parser = new MessageFormatParser(features);
			compositeModeInitialization_5011Parser = parser;
		}
		return compositeModeInitialization_5011Parser;
	}

	/**
	 * @generated
	 */
	private IParser variable_3001Parser;

	/**
	 * @generated
	 */
	private IParser getVariable_3001Parser() {
		if (variable_3001Parser == null) {
			EAttribute[] features = new EAttribute[] {
					RemesPackage.eINSTANCE.getReferable_Name(),
					RemesPackage.eINSTANCE.getVariable_VectorSize(),
					RemesPackage.eINSTANCE.getVariable_Type(),
					RemesPackage.eINSTANCE.getVariable_Global() };
			EAttribute[] editableFeatures = new EAttribute[] {
					RemesPackage.eINSTANCE.getReferable_Name(),
					RemesPackage.eINSTANCE.getVariable_Type() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("{0}{1,choice,0#|0<[{1}]}:{2}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}:{1}"); //$NON-NLS-1$
			parser.setEditPattern("{0}:{1}"); //$NON-NLS-1$
			variable_3001Parser = parser;
		}
		return variable_3001Parser;
	}

	/**
	 * @generated
	 */
	private IParser resource_3002Parser;

	/**
	 * @generated
	 */
	private IParser getResource_3002Parser() {
		if (resource_3002Parser == null) {
			EAttribute[] features = new EAttribute[] {
					RemesPackage.eINSTANCE.getResource_Expression(),
					RemesPackage.eINSTANCE.getResource_Type() };
			EAttribute[] editableFeatures = new EAttribute[] {
					RemesPackage.eINSTANCE.getResource_Expression(),
					RemesPackage.eINSTANCE.getResource_Type() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("{0}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}:{1}"); //$NON-NLS-1$
			parser.setEditPattern("{0}:{1}"); //$NON-NLS-1$
			resource_3002Parser = parser;
		}
		return resource_3002Parser;
	}

	/**
	 * @generated
	 */
	private IParser subModeName_5005Parser;

	/**
	 * @generated
	 */
	private IParser getSubModeName_5005Parser() {
		if (subModeName_5005Parser == null) {
			EAttribute[] features = new EAttribute[] { RemesPackage.eINSTANCE
					.getControlPath_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { RemesPackage.eINSTANCE
					.getControlPath_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			subModeName_5005Parser = parser;
		}
		return subModeName_5005Parser;
	}

	/**
	 * @generated
	 */
	private IParser subModeInitialization_5006Parser;

	/**
	 * @generated
	 */
	private IParser getSubModeInitialization_5006Parser() {
		if (subModeInitialization_5006Parser == null) {
			EAttribute[] features = new EAttribute[] { RemesPackage.eINSTANCE
					.getMode_Initialization() };
			EAttribute[] editableFeatures = new EAttribute[] { RemesPackage.eINSTANCE
					.getMode_Initialization() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			subModeInitialization_5006Parser = parser;
		}
		return subModeInitialization_5006Parser;
	}

	/**
	 * @generated
	 */
	private IParser subModeInvariant_5007Parser;

	/**
	 * @generated
	 */
	private IParser getSubModeInvariant_5007Parser() {
		if (subModeInvariant_5007Parser == null) {
			EAttribute[] features = new EAttribute[] { RemesPackage.eINSTANCE
					.getSubMode_Invariant() };
			EAttribute[] editableFeatures = new EAttribute[] { RemesPackage.eINSTANCE
					.getSubMode_Invariant() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			subModeInvariant_5007Parser = parser;
		}
		return subModeInvariant_5007Parser;
	}

	/**
	 * @generated
	 */
	private IParser subModeIsUrgent_5008Parser;

	/**
	 * @generated
	 */
	private IParser getSubModeIsUrgent_5008Parser() {
		if (subModeIsUrgent_5008Parser == null) {
			EAttribute[] features = new EAttribute[] { RemesPackage.eINSTANCE
					.getSubMode_IsUrgent() };
			EAttribute[] editableFeatures = new EAttribute[] { RemesPackage.eINSTANCE
					.getSubMode_IsUrgent() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			subModeIsUrgent_5008Parser = parser;
		}
		return subModeIsUrgent_5008Parser;
	}

	/**
	 * @generated
	 */
	private IParser variable_3004Parser;

	/**
	 * @generated
	 */
	private IParser getVariable_3004Parser() {
		if (variable_3004Parser == null) {
			EAttribute[] features = new EAttribute[] {
					RemesPackage.eINSTANCE.getReferable_Name(),
					RemesPackage.eINSTANCE.getVariable_VectorSize(),
					RemesPackage.eINSTANCE.getVariable_Type(),
					RemesPackage.eINSTANCE.getVariable_Global() };
			EAttribute[] editableFeatures = new EAttribute[] {
					RemesPackage.eINSTANCE.getReferable_Name(),
					RemesPackage.eINSTANCE.getVariable_Type(),
					RemesPackage.eINSTANCE.getVariable_Global() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("{0}{1,choice,0#|0<[{1}]}:{2}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}:{1}"); //$NON-NLS-1$
			parser.setEditPattern("{0}:{1}"); //$NON-NLS-1$
			variable_3004Parser = parser;
		}
		return variable_3004Parser;
	}

	/**
	 * @generated
	 */
	private IParser resource_3005Parser;

	/**
	 * @generated
	 */
	private IParser getResource_3005Parser() {
		if (resource_3005Parser == null) {
			EAttribute[] features = new EAttribute[] {
					RemesPackage.eINSTANCE.getResource_Expression(),
					RemesPackage.eINSTANCE.getResource_Type() };
			EAttribute[] editableFeatures = new EAttribute[] {
					RemesPackage.eINSTANCE.getResource_Expression(),
					RemesPackage.eINSTANCE.getResource_Type() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("{0}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}:{1}"); //$NON-NLS-1$
			parser.setEditPattern("{0}:{1}"); //$NON-NLS-1$
			resource_3005Parser = parser;
		}
		return resource_3005Parser;
	}

	/**
	 * @generated
	 */
	private IParser conditionalConnectorName_5009Parser;

	/**
	 * @generated
	 */
	private IParser getConditionalConnectorName_5009Parser() {
		if (conditionalConnectorName_5009Parser == null) {
			EAttribute[] features = new EAttribute[] { RemesPackage.eINSTANCE
					.getControlPath_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			conditionalConnectorName_5009Parser = parser;
		}
		return conditionalConnectorName_5009Parser;
	}

	/**
	 * @generated
	 */
	private IParser variable_3007Parser;

	/**
	 * @generated
	 */
	private IParser getVariable_3007Parser() {
		if (variable_3007Parser == null) {
			EAttribute[] features = new EAttribute[] {
					RemesPackage.eINSTANCE.getReferable_Name(),
					RemesPackage.eINSTANCE.getVariable_VectorSize(),
					RemesPackage.eINSTANCE.getVariable_Type(),
					RemesPackage.eINSTANCE.getVariable_Global() };
			EAttribute[] editableFeatures = new EAttribute[] {
					RemesPackage.eINSTANCE.getReferable_Name(),
					RemesPackage.eINSTANCE.getVariable_Type() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("{0}{1,choice,0#|0<[{1}]}:{2}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}:{1}"); //$NON-NLS-1$
			parser.setEditPattern("{0}:{1}"); //$NON-NLS-1$
			variable_3007Parser = parser;
		}
		return variable_3007Parser;
	}

	/**
	 * @generated
	 */
	private IParser edgeActionGuard_6001Parser;

	/**
	 * @generated
	 */
	private IParser getEdgeActionGuard_6001Parser() {
		if (edgeActionGuard_6001Parser == null) {
			EAttribute[] features = new EAttribute[] { RemesPackage.eINSTANCE
					.getEdge_ActionGuard() };
			MessageFormatParser parser = new MessageFormatParser(features);
			edgeActionGuard_6001Parser = parser;
		}
		return edgeActionGuard_6001Parser;
	}

	/**
	 * @generated
	 */
	private IParser initEdgeInitialization_6002Parser;

	/**
	 * @generated
	 */
	private IParser getInitEdgeInitialization_6002Parser() {
		if (initEdgeInitialization_6002Parser == null) {
			EAttribute[] features = new EAttribute[] { RemesPackage.eINSTANCE
					.getInitEdge_Initialization() };
			MessageFormatParser parser = new MessageFormatParser(features);
			initEdgeInitialization_6002Parser = parser;
		}
		return initEdgeInitialization_6002Parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case SubModeNameEditPart.VISUAL_ID:
			return getSubModeName_5001Parser();
		case SubModeInitializationEditPart.VISUAL_ID:
			return getSubModeInitialization_5002Parser();
		case SubModeInvariantEditPart.VISUAL_ID:
			return getSubModeInvariant_5003Parser();
		case SubModeIsUrgentEditPart.VISUAL_ID:
			return getSubModeIsUrgent_5004Parser();
		case CompositeModeNameEditPart.VISUAL_ID:
			return getCompositeModeName_5010Parser();
		case CompositeModeInitializationEditPart.VISUAL_ID:
			return getCompositeModeInitialization_5011Parser();
		case VariableEditPart.VISUAL_ID:
			return getVariable_3001Parser();
		case ResourceEditPart.VISUAL_ID:
			return getResource_3002Parser();
		case SubModeName2EditPart.VISUAL_ID:
			return getSubModeName_5005Parser();
		case SubModeInitialization2EditPart.VISUAL_ID:
			return getSubModeInitialization_5006Parser();
		case SubModeInvariant2EditPart.VISUAL_ID:
			return getSubModeInvariant_5007Parser();
		case SubModeIsUrgent2EditPart.VISUAL_ID:
			return getSubModeIsUrgent_5008Parser();
		case Variable2EditPart.VISUAL_ID:
			return getVariable_3004Parser();
		case Resource2EditPart.VISUAL_ID:
			return getResource_3005Parser();
		case ConditionalConnectorNameEditPart.VISUAL_ID:
			return getConditionalConnectorName_5009Parser();
		case Variable3EditPart.VISUAL_ID:
			return getVariable_3007Parser();
		case EdgeActionGuardEditPart.VISUAL_ID:
			return getEdgeActionGuard_6001Parser();
		case InitEdgeInitializationEditPart.VISUAL_ID:
			return getInitEdgeInitialization_6002Parser();
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
			return getParser(RemesVisualIDRegistry.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(RemesVisualIDRegistry.getVisualID(view));
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (RemesElementTypes.getElement(hint) == null) {
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
