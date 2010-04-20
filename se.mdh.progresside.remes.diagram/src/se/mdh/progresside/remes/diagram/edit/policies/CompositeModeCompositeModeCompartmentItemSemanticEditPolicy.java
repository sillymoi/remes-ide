package se.mdh.progresside.remes.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import se.mdh.progresside.remes.diagram.edit.commands.CompositeEntryPointCreateCommand;
import se.mdh.progresside.remes.diagram.edit.commands.CompositeExitPointCreateCommand;
import se.mdh.progresside.remes.diagram.edit.commands.ConditionalConnectorCreateCommand;
import se.mdh.progresside.remes.diagram.edit.commands.InitPointCreateCommand;
import se.mdh.progresside.remes.diagram.edit.commands.SubMode2CreateCommand;
import se.mdh.progresside.remes.diagram.providers.RemesElementTypes;

/**
 * @generated
 */
public class CompositeModeCompositeModeCompartmentItemSemanticEditPolicy extends
		RemesBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public CompositeModeCompositeModeCompartmentItemSemanticEditPolicy() {
		super(RemesElementTypes.CompositeMode_2008);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (RemesElementTypes.SubMode_3026 == req.getElementType()) {
			return getGEFWrapper(new SubMode2CreateCommand(req));
		}
		if (RemesElementTypes.ConditionalConnector_3031 == req.getElementType()) {
			return getGEFWrapper(new ConditionalConnectorCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
