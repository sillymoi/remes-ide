package se.mdh.progresside.remes.diagram.edit.parts;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Connection;
import org.eclipse.draw2d.PolylineDecoration;
import org.eclipse.draw2d.RotatableDecoration;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITreeBranchEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.notation.View;

import se.mdh.progresside.remes.diagram.edit.policies.WriteEdgeItemSemanticEditPolicy;

/**
 * @generated
 */
public class WriteEdgeEditPart extends ConnectionNodeEditPart implements
		ITreeBranchEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 4030;

	/**
	 * @generated
	 */
	public WriteEdgeEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new WriteEdgeItemSemanticEditPolicy());
	}

	/**
	 * Creates figure for this edit part.
	 * 
	 * Body of this method does not depend on settings in generation model
	 * so you may safely remove <i>generated</i> tag and modify it.
	 * 
	 * @generated
	 */

	protected Connection createConnectionFigure() {
		return new WriteEdgeFigure();
	}

	/**
	 * @generated
	 */
	public WriteEdgeFigure getPrimaryShape() {
		return (WriteEdgeFigure) getFigure();
	}

	/**
	 * @generated
	 */
	public class WriteEdgeFigure extends PolylineConnectionEx {

		/**
		 * @generated
		 */
		public WriteEdgeFigure() {
			this.setLineWidth(1);

			setTargetDecoration(createTargetDecoration());
		}

		/**
		 * @generated
		 */
		private RotatableDecoration createTargetDecoration() {
			PolylineDecoration df = new PolylineDecoration();
			df.setLineWidth(2);
			df.setForegroundColor(ColorConstants.blue);
			df.setBackgroundColor(ColorConstants.blue);
			return df;
		}

	}

}
