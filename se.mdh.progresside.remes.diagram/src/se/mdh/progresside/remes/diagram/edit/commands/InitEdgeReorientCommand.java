package se.mdh.progresside.remes.diagram.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

import se.mdh.progresside.remes.EntryPoint;
import se.mdh.progresside.remes.InitEdge;
import se.mdh.progresside.remes.InitPoint;
import se.mdh.progresside.remes.diagram.edit.policies.RemesBaseItemSemanticEditPolicy;

/**
 * @generated
 */
public class InitEdgeReorientCommand extends EditElementCommand {

	/**
	 * @generated
	 */
	private final int reorientDirection;

	/**
	 * @generated
	 */
	private final EObject oldEnd;

	/**
	 * @generated
	 */
	private final EObject newEnd;

	/**
	 * @generated
	 */
	public InitEdgeReorientCommand(ReorientRelationshipRequest request) {
		super(request.getLabel(), request.getRelationship(), request);
		reorientDirection = request.getDirection();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	 * @generated
	 */
	public boolean canExecute() {
		if (false == getElementToEdit() instanceof InitEdge) {
			return false;
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return canReorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return canReorientTarget();
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean canReorientSource() {
		if (!(oldEnd instanceof InitPoint && newEnd instanceof InitPoint)) {
			return false;
		}
		EntryPoint target = getLink().getConnectTo();
		if (!(getLink().eContainer() instanceof InitPoint)) {
			return false;
		}
		InitPoint container = (InitPoint) getLink().eContainer();
		return RemesBaseItemSemanticEditPolicy.LinkConstraints
				.canExistInitEdge_4002(container, getNewSource(), target);
	}

	/**
	 * @generated
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof EntryPoint && newEnd instanceof EntryPoint)) {
			return false;
		}
		InitPoint source = getLink().getConnectFrom();
		if (!(getLink().eContainer() instanceof InitPoint)) {
			return false;
		}
		InitPoint container = (InitPoint) getLink().eContainer();
		return RemesBaseItemSemanticEditPolicy.LinkConstraints
				.canExistInitEdge_4002(container, source, getNewTarget());
	}

	/**
	 * @generated
	 */
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor,
			IAdaptable info) throws ExecutionException {
		if (!canExecute()) {
			throw new ExecutionException(
					"Invalid arguments in reorient link command"); //$NON-NLS-1$
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return reorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return reorientTarget();
		}
		throw new IllegalStateException();
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientSource() throws ExecutionException {
		getLink().setConnectFrom(getNewSource());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientTarget() throws ExecutionException {
		getLink().setConnectTo(getNewTarget());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected InitEdge getLink() {
		return (InitEdge) getElementToEdit();
	}

	/**
	 * @generated
	 */
	protected InitPoint getOldSource() {
		return (InitPoint) oldEnd;
	}

	/**
	 * @generated
	 */
	protected InitPoint getNewSource() {
		return (InitPoint) newEnd;
	}

	/**
	 * @generated
	 */
	protected EntryPoint getOldTarget() {
		return (EntryPoint) oldEnd;
	}

	/**
	 * @generated
	 */
	protected EntryPoint getNewTarget() {
		return (EntryPoint) newEnd;
	}
}
