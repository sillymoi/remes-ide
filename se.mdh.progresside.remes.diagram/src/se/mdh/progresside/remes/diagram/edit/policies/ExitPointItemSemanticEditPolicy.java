package se.mdh.progresside.remes.diagram.edit.policies;

import java.util.Iterator;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.UnexecutableCommand;
import org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.View;

import se.mdh.progresside.remes.diagram.edit.commands.EdgeCreateCommand;
import se.mdh.progresside.remes.diagram.edit.commands.EdgeReorientCommand;
import se.mdh.progresside.remes.diagram.edit.commands.WriteEdgeCreateCommand;
import se.mdh.progresside.remes.diagram.edit.commands.WriteEdgeReorientCommand;
import se.mdh.progresside.remes.diagram.edit.parts.EdgeEditPart;
import se.mdh.progresside.remes.diagram.edit.parts.WriteEdgeEditPart;
import se.mdh.progresside.remes.diagram.part.RemesVisualIDRegistry;
import se.mdh.progresside.remes.diagram.providers.RemesElementTypes;

/**
 * @generated
 */
public class ExitPointItemSemanticEditPolicy extends
		RemesBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ExitPointItemSemanticEditPolicy() {
		super(RemesElementTypes.ExitPoint_3025);
	}

	/**
	 * @generated NOT
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return UnexecutableCommand.INSTANCE;
	}

	/**
	 * @generated
	 */
	protected Command getCreateRelationshipCommand(CreateRelationshipRequest req) {
		Command command = req.getTarget() == null ? getStartCreateRelationshipCommand(req)
				: getCompleteCreateRelationshipCommand(req);
		return command != null ? command : super
				.getCreateRelationshipCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getStartCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (RemesElementTypes.Edge_4028 == req.getElementType()) {
			return getGEFWrapper(new EdgeCreateCommand(req, req.getSource(),
					req.getTarget()));
		}
		if (RemesElementTypes.WriteEdge_4030 == req.getElementType()) {
			return getGEFWrapper(new WriteEdgeCreateCommand(req, req
					.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (RemesElementTypes.Edge_4028 == req.getElementType()) {
			return null;
		}
		if (RemesElementTypes.WriteEdge_4030 == req.getElementType()) {
			return null;
		}
		return null;
	}

	/**
	 * Returns command to reorient EClass based link. New link target or source
	 * should be the domain model element associated with this node.
	 * 
	 * @generated
	 */
	protected Command getReorientRelationshipCommand(
			ReorientRelationshipRequest req) {
		switch (getVisualID(req)) {
		case EdgeEditPart.VISUAL_ID:
			return getGEFWrapper(new EdgeReorientCommand(req));
		case WriteEdgeEditPart.VISUAL_ID:
			return getGEFWrapper(new WriteEdgeReorientCommand(req));
		}
		return super.getReorientRelationshipCommand(req);
	}

}
