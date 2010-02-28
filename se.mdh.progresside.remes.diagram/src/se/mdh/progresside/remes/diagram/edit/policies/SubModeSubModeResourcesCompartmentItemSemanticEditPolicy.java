package se.mdh.progresside.remes.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import se.mdh.progresside.remes.diagram.edit.commands.ResourceCreateCommand;
import se.mdh.progresside.remes.diagram.providers.RemesElementTypes;

/**
 * @generated
 */
public class SubModeSubModeResourcesCompartmentItemSemanticEditPolicy extends
		RemesBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public SubModeSubModeResourcesCompartmentItemSemanticEditPolicy() {
		super(RemesElementTypes.SubMode_2007);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (RemesElementTypes.Resource_3023 == req.getElementType()) {
			return getGEFWrapper(new ResourceCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
