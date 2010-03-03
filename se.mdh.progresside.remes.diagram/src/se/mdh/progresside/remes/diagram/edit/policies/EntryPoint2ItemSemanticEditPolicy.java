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
import se.mdh.progresside.remes.diagram.edit.commands.InitEdgeCreateCommand;
import se.mdh.progresside.remes.diagram.edit.commands.InitEdgeReorientCommand;
import se.mdh.progresside.remes.diagram.edit.parts.EdgeEditPart;
import se.mdh.progresside.remes.diagram.edit.parts.InitEdgeEditPart;
import se.mdh.progresside.remes.diagram.part.RemesVisualIDRegistry;
import se.mdh.progresside.remes.diagram.providers.RemesElementTypes;

/**
 * @generated
 */
public class EntryPoint2ItemSemanticEditPolicy extends
		RemesBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public EntryPoint2ItemSemanticEditPolicy() {
		super(RemesElementTypes.EntryPoint_3029);
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
			return null;
		}
		if (RemesElementTypes.InitEdge_4029 == req.getElementType()) {
			return null;
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (RemesElementTypes.Edge_4028 == req.getElementType()) {
			return getGEFWrapper(new EdgeCreateCommand(req, req.getSource(),
					req.getTarget()));
		}
		if (RemesElementTypes.InitEdge_4029 == req.getElementType()) {
			return getGEFWrapper(new InitEdgeCreateCommand(req,
					req.getSource(), req.getTarget()));
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
		case InitEdgeEditPart.VISUAL_ID:
			return getGEFWrapper(new InitEdgeReorientCommand(req));
		}
		return super.getReorientRelationshipCommand(req);
	}

}
