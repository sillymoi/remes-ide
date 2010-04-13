package se.mdh.progresside.remes.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import se.mdh.progresside.remes.diagram.edit.commands.Resource3CreateCommand;
import se.mdh.progresside.remes.diagram.providers.RemesElementTypes;

/**
 * @generated
 */
public class CompositeModeCompositeModeResourcesCompartmentItemSemanticEditPolicy
		extends RemesBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public CompositeModeCompositeModeResourcesCompartmentItemSemanticEditPolicy() {
		super(RemesElementTypes.CompositeMode_2008);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (RemesElementTypes.Resource_3040 == req.getElementType()) {
			return getGEFWrapper(new Resource3CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
