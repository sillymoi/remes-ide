package se.mdh.progresside.remes.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import se.mdh.progresside.remes.diagram.edit.commands.VariableCreateCommand;
import se.mdh.progresside.remes.diagram.providers.RemesElementTypes;

/**
 * @generated
 */
public class SubModeSubModeVariablesCompartmentItemSemanticEditPolicy extends
		RemesBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public SubModeSubModeVariablesCompartmentItemSemanticEditPolicy() {
		super(RemesElementTypes.SubMode_2007);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (RemesElementTypes.Variable_3022 == req.getElementType()) {
			return getGEFWrapper(new VariableCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
