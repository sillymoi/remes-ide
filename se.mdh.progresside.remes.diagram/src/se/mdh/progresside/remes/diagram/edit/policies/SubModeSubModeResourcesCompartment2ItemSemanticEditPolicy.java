package se.mdh.progresside.remes.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import se.mdh.progresside.remes.diagram.edit.commands.Resource2CreateCommand;
import se.mdh.progresside.remes.diagram.providers.RemesElementTypes;

/**
 * @generated
 */
public class SubModeSubModeResourcesCompartment2ItemSemanticEditPolicy extends
		RemesBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public SubModeSubModeResourcesCompartment2ItemSemanticEditPolicy() {
		super(RemesElementTypes.SubMode_3026);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (RemesElementTypes.Resource_3028 == req.getElementType()) {
			return getGEFWrapper(new Resource2CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
