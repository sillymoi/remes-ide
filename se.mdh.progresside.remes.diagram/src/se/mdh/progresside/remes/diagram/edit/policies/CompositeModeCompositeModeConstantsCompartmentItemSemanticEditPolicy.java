package se.mdh.progresside.remes.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import se.mdh.progresside.remes.diagram.edit.commands.Constant3CreateCommand;
import se.mdh.progresside.remes.diagram.providers.RemesElementTypes;

/**
 * @generated
 */
public class CompositeModeCompositeModeConstantsCompartmentItemSemanticEditPolicy
		extends RemesBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public CompositeModeCompositeModeConstantsCompartmentItemSemanticEditPolicy() {
		super(RemesElementTypes.CompositeMode_2008);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (RemesElementTypes.Constant_3043 == req.getElementType()) {
			return getGEFWrapper(new Constant3CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
