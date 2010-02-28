package se.mdh.progresside.remes.diagram.edit.parts;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Connection;
import org.eclipse.draw2d.PolylineDecoration;
import org.eclipse.draw2d.RotatableDecoration;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITreeBranchEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.notation.View;

import se.mdh.progresside.remes.diagram.edit.policies.InitEdgeItemSemanticEditPolicy;

/**
 * @generated
 */
public class InitEdgeEditPart extends ConnectionNodeEditPart implements
		ITreeBranchEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 4029;

	/**
	 * @generated
	 */
	public InitEdgeEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new InitEdgeItemSemanticEditPolicy());
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof InitEdgeInitializationEditPart) {
			((InitEdgeInitializationEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureInitEdgeInitializationFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected void addChildVisual(EditPart childEditPart, int index) {
		if (addFixedChild(childEditPart)) {
			return;
		}
		super.addChildVisual(childEditPart, -1);
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof InitEdgeInitializationEditPart) {
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected void removeChildVisual(EditPart childEditPart) {
		if (removeFixedChild(childEditPart)) {
			return;
		}
		super.removeChildVisual(childEditPart);
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
		return new InitEdgeFigure();
	}

	/**
	 * @generated
	 */
	public InitEdgeFigure getPrimaryShape() {
		return (InitEdgeFigure) getFigure();
	}

	/**
	 * @generated
	 */
	public class InitEdgeFigure extends PolylineConnectionEx {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureInitEdgeInitializationFigure;

		/**
		 * @generated
		 */
		public InitEdgeFigure() {
			this.setLineWidth(1);

			createContents();
			setTargetDecoration(createTargetDecoration());
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureInitEdgeInitializationFigure = new WrappingLabel();
			fFigureInitEdgeInitializationFigure.setText("<...>");

			this.add(fFigureInitEdgeInitializationFigure);

		}

		/**
		 * @generated
		 */
		private RotatableDecoration createTargetDecoration() {
			PolylineDecoration df = new PolylineDecoration();
			df.setLineWidth(2);
			df.setForegroundColor(ColorConstants.orange);
			df.setBackgroundColor(ColorConstants.orange);
			return df;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureInitEdgeInitializationFigure() {
			return fFigureInitEdgeInitializationFigure;
		}

	}

}
