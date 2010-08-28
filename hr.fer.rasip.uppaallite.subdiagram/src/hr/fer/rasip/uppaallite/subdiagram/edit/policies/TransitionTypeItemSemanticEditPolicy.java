package hr.fer.rasip.uppaallite.subdiagram.edit.policies;

import hr.fer.rasip.uppaallite.subdiagram.providers.UppaalliteElementTypes;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;

/**
 * @generated
 */
public class TransitionTypeItemSemanticEditPolicy extends
		UppaalliteBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public TransitionTypeItemSemanticEditPolicy() {
		super(UppaalliteElementTypes.TransitionType_4002);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return getGEFWrapper(new DestroyElementCommand(req));
	}

}
