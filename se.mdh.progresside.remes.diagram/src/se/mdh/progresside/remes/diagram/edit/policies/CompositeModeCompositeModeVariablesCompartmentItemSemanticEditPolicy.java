package se.mdh.progresside.remes.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import se.mdh.progresside.remes.diagram.edit.commands.Variable3CreateCommand;
import se.mdh.progresside.remes.diagram.providers.RemesElementTypes;

/**
 * @generated
 */
public class CompositeModeCompositeModeVariablesCompartmentItemSemanticEditPolicy
		extends RemesBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public CompositeModeCompositeModeVariablesCompartmentItemSemanticEditPolicy() {
		super(RemesElementTypes.CompositeMode_2002);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (RemesElementTypes.Variable_3007 == req.getElementType()) {
			return getGEFWrapper(new Variable3CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
