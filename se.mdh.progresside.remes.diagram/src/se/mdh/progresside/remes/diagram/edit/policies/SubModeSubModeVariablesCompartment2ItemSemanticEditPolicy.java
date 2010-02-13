package se.mdh.progresside.remes.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import se.mdh.progresside.remes.diagram.edit.commands.Variable2CreateCommand;
import se.mdh.progresside.remes.diagram.providers.RemesElementTypes;

/**
 * @generated
 */
public class SubModeSubModeVariablesCompartment2ItemSemanticEditPolicy extends
		RemesBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public SubModeSubModeVariablesCompartment2ItemSemanticEditPolicy() {
		super(RemesElementTypes.SubMode_3003);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (RemesElementTypes.Variable_3004 == req.getElementType()) {
			return getGEFWrapper(new Variable2CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
