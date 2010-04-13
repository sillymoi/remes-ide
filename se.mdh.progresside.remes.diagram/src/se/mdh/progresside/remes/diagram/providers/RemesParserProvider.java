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
import se.mdh.progresside.remes.diagram.edit.parts.Resource3EditPart;
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
	private IParser subModeName_5040Parser;

	/**
	 * @generated
	 */
	private IParser getSubModeName_5040Parser() {
		if (subModeName_5040Parser == null) {
			EAttribute[] features = new EAttribute[] { RemesPackage.eINSTANCE
					.getControlPath_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { RemesPackage.eINSTANCE
					.getControlPath_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			subModeName_5040Parser = parser;
		}
		return subModeName_5040Parser;
	}

	/**
	 * @generated
	 */
	private IParser subModeInitialization_5041Parser;

	/**
	 * @generated
	 */
	private IParser getSubModeInitialization_5041Parser() {
		if (subModeInitialization_5041Parser == null) {
			EAttribute[] features = new EAttribute[] { RemesPackage.eINSTANCE
					.getMode_Initialization() };
			EAttribute[] editableFeatures = new EAttribute[] { RemesPackage.eINSTANCE
					.getMode_Initialization() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			subModeInitialization_5041Parser = parser;
		}
		return subModeInitialization_5041Parser;
	}

	/**
	 * @generated
	 */
	private IParser subModeInvariant_5042Parser;

	/**
	 * @generated
	 */
	private IParser getSubModeInvariant_5042Parser() {
		if (subModeInvariant_5042Parser == null) {
			EAttribute[] features = new EAttribute[] { RemesPackage.eINSTANCE
					.getSubMode_Invariant() };
			EAttribute[] editableFeatures = new EAttribute[] { RemesPackage.eINSTANCE
					.getSubMode_Invariant() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			subModeInvariant_5042Parser = parser;
		}
		return subModeInvariant_5042Parser;
	}

	/**
	 * @generated
	 */
	private IParser subModeIsUrgent_5043Parser;

	/**
	 * @generated
	 */
	private IParser getSubModeIsUrgent_5043Parser() {
		if (subModeIsUrgent_5043Parser == null) {
			EAttribute[] features = new EAttribute[] { RemesPackage.eINSTANCE
					.getSubMode_IsUrgent() };
			EAttribute[] editableFeatures = new EAttribute[] { RemesPackage.eINSTANCE
					.getSubMode_IsUrgent() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			subModeIsUrgent_5043Parser = parser;
		}
		return subModeIsUrgent_5043Parser;
	}

	/**
	 * @generated
	 */
	private IParser compositeModeName_5049Parser;

	/**
	 * @generated
	 */
	private IParser getCompositeModeName_5049Parser() {
		if (compositeModeName_5049Parser == null) {
			EAttribute[] features = new EAttribute[] { RemesPackage.eINSTANCE
					.getControlPath_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			compositeModeName_5049Parser = parser;
		}
		return compositeModeName_5049Parser;
	}

	/**
	 * @generated
	 */
	private IParser compositeModeInitialization_5050Parser;

	/**
	 * @generated
	 */
	private IParser getCompositeModeInitialization_5050Parser() {
		if (compositeModeInitialization_5050Parser == null) {
			EAttribute[] features = new EAttribute[] { RemesPackage.eINSTANCE
					.getMode_Initialization() };
			MessageFormatParser parser = new MessageFormatParser(features);
			compositeModeInitialization_5050Parser = parser;
		}
		return compositeModeInitialization_5050Parser;
	}

	/**
	 * @generated
	 */
	private IParser variable_3022Parser;

	/**
	 * @generated
	 */
	private IParser getVariable_3022Parser() {
		if (variable_3022Parser == null) {
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
			variable_3022Parser = parser;
		}
		return variable_3022Parser;
	}

	/**
	 * @generated
	 */
	private IParser resource_3023Parser;

	/**
	 * @generated
	 */
	private IParser getResource_3023Parser() {
		if (resource_3023Parser == null) {
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
			resource_3023Parser = parser;
		}
		return resource_3023Parser;
	}

	/**
	 * @generated
	 */
	private IParser subModeName_5044Parser;

	/**
	 * @generated
	 */
	private IParser getSubModeName_5044Parser() {
		if (subModeName_5044Parser == null) {
			EAttribute[] features = new EAttribute[] { RemesPackage.eINSTANCE
					.getControlPath_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { RemesPackage.eINSTANCE
					.getControlPath_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			subModeName_5044Parser = parser;
		}
		return subModeName_5044Parser;
	}

	/**
	 * @generated
	 */
	private IParser subModeInitialization_5045Parser;

	/**
	 * @generated
	 */
	private IParser getSubModeInitialization_5045Parser() {
		if (subModeInitialization_5045Parser == null) {
			EAttribute[] features = new EAttribute[] { RemesPackage.eINSTANCE
					.getMode_Initialization() };
			EAttribute[] editableFeatures = new EAttribute[] { RemesPackage.eINSTANCE
					.getMode_Initialization() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			subModeInitialization_5045Parser = parser;
		}
		return subModeInitialization_5045Parser;
	}

	/**
	 * @generated
	 */
	private IParser subModeInvariant_5046Parser;

	/**
	 * @generated
	 */
	private IParser getSubModeInvariant_5046Parser() {
		if (subModeInvariant_5046Parser == null) {
			EAttribute[] features = new EAttribute[] { RemesPackage.eINSTANCE
					.getSubMode_Invariant() };
			EAttribute[] editableFeatures = new EAttribute[] { RemesPackage.eINSTANCE
					.getSubMode_Invariant() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			subModeInvariant_5046Parser = parser;
		}
		return subModeInvariant_5046Parser;
	}

	/**
	 * @generated
	 */
	private IParser subModeIsUrgent_5047Parser;

	/**
	 * @generated
	 */
	private IParser getSubModeIsUrgent_5047Parser() {
		if (subModeIsUrgent_5047Parser == null) {
			EAttribute[] features = new EAttribute[] { RemesPackage.eINSTANCE
					.getSubMode_IsUrgent() };
			EAttribute[] editableFeatures = new EAttribute[] { RemesPackage.eINSTANCE
					.getSubMode_IsUrgent() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			subModeIsUrgent_5047Parser = parser;
		}
		return subModeIsUrgent_5047Parser;
	}

	/**
	 * @generated
	 */
	private IParser variable_3027Parser;

	/**
	 * @generated
	 */
	private IParser getVariable_3027Parser() {
		if (variable_3027Parser == null) {
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
			variable_3027Parser = parser;
		}
		return variable_3027Parser;
	}

	/**
	 * @generated
	 */
	private IParser resource_3028Parser;

	/**
	 * @generated
	 */
	private IParser getResource_3028Parser() {
		if (resource_3028Parser == null) {
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
			resource_3028Parser = parser;
		}
		return resource_3028Parser;
	}

	/**
	 * @generated
	 */
	private IParser conditionalConnectorName_5048Parser;

	/**
	 * @generated
	 */
	private IParser getConditionalConnectorName_5048Parser() {
		if (conditionalConnectorName_5048Parser == null) {
			EAttribute[] features = new EAttribute[] { RemesPackage.eINSTANCE
					.getControlPath_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			conditionalConnectorName_5048Parser = parser;
		}
		return conditionalConnectorName_5048Parser;
	}

	/**
	 * @generated
	 */
	private IParser variable_3034Parser;

	/**
	 * @generated
	 */
	private IParser getVariable_3034Parser() {
		if (variable_3034Parser == null) {
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
			variable_3034Parser = parser;
		}
		return variable_3034Parser;
	}

	/**
	 * @generated
	 */
	private IParser resource_3040Parser;

	/**
	 * @generated
	 */
	private IParser getResource_3040Parser() {
		if (resource_3040Parser == null) {
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
			resource_3040Parser = parser;
		}
		return resource_3040Parser;
	}

	/**
	 * @generated
	 */
	private IParser edgeActionGuard_6028Parser;

	/**
	 * @generated
	 */
	private IParser getEdgeActionGuard_6028Parser() {
		if (edgeActionGuard_6028Parser == null) {
			EAttribute[] features = new EAttribute[] { RemesPackage.eINSTANCE
					.getEdge_ActionGuard() };
			MessageFormatParser parser = new MessageFormatParser(features);
			edgeActionGuard_6028Parser = parser;
		}
		return edgeActionGuard_6028Parser;
	}

	/**
	 * @generated
	 */
	private IParser initEdgeInitialization_6029Parser;

	/**
	 * @generated
	 */
	private IParser getInitEdgeInitialization_6029Parser() {
		if (initEdgeInitialization_6029Parser == null) {
			EAttribute[] features = new EAttribute[] { RemesPackage.eINSTANCE
					.getInitEdge_Initialization() };
			MessageFormatParser parser = new MessageFormatParser(features);
			initEdgeInitialization_6029Parser = parser;
		}
		return initEdgeInitialization_6029Parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case SubModeNameEditPart.VISUAL_ID:
			return getSubModeName_5040Parser();
		case SubModeInitializationEditPart.VISUAL_ID:
			return getSubModeInitialization_5041Parser();
		case SubModeInvariantEditPart.VISUAL_ID:
			return getSubModeInvariant_5042Parser();
		case SubModeIsUrgentEditPart.VISUAL_ID:
			return getSubModeIsUrgent_5043Parser();
		case CompositeModeNameEditPart.VISUAL_ID:
			return getCompositeModeName_5049Parser();
		case CompositeModeInitializationEditPart.VISUAL_ID:
			return getCompositeModeInitialization_5050Parser();
		case VariableEditPart.VISUAL_ID:
			return getVariable_3022Parser();
		case ResourceEditPart.VISUAL_ID:
			return getResource_3023Parser();
		case SubModeName2EditPart.VISUAL_ID:
			return getSubModeName_5044Parser();
		case SubModeInitialization2EditPart.VISUAL_ID:
			return getSubModeInitialization_5045Parser();
		case SubModeInvariant2EditPart.VISUAL_ID:
			return getSubModeInvariant_5046Parser();
		case SubModeIsUrgent2EditPart.VISUAL_ID:
			return getSubModeIsUrgent_5047Parser();
		case Variable2EditPart.VISUAL_ID:
			return getVariable_3027Parser();
		case Resource2EditPart.VISUAL_ID:
			return getResource_3028Parser();
		case ConditionalConnectorNameEditPart.VISUAL_ID:
			return getConditionalConnectorName_5048Parser();
		case Variable3EditPart.VISUAL_ID:
			return getVariable_3034Parser();
		case Resource3EditPart.VISUAL_ID:
			return getResource_3040Parser();
		case EdgeActionGuardEditPart.VISUAL_ID:
			return getEdgeActionGuard_6028Parser();
		case InitEdgeInitializationEditPart.VISUAL_ID:
			return getInitEdgeInitialization_6029Parser();
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
