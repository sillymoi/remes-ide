package se.mdh.progresside.remes.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import se.mdh.progresside.remes.diagram.edit.commands.ConstantCreateCommand;
import se.mdh.progresside.remes.diagram.providers.RemesElementTypes;

/**
 * @generated
 */
public class SubModeSubModeConstantsCompartmentItemSemanticEditPolicy extends
		RemesBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public SubModeSubModeConstantsCompartmentItemSemanticEditPolicy() {
		super(RemesElementTypes.SubMode_2007);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (RemesElementTypes.Constant_3041 == req.getElementType()) {
			return getGEFWrapper(new ConstantCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
