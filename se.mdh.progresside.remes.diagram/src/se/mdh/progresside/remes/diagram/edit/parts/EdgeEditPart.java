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

import se.mdh.progresside.remes.diagram.edit.policies.EdgeItemSemanticEditPolicy;

/**
 * @generated
 */
public class EdgeEditPart extends ConnectionNodeEditPart implements
		ITreeBranchEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 4028;

	/**
	 * @generated
	 */
	public EdgeEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new EdgeItemSemanticEditPolicy());
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof EdgeActionGuardEditPart) {
			((EdgeActionGuardEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureEdgeActionGuardFigure());
			return true;
		}
		if (childEditPart instanceof EdgeActionBodyEditPart) {
			((EdgeActionBodyEditPart) childEditPart).setLabel(getPrimaryShape()
					.getFigureEdgeActionBodyFigure());
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
		if (childEditPart instanceof EdgeActionGuardEditPart) {
			return true;
		}
		if (childEditPart instanceof EdgeActionBodyEditPart) {
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
		return new EdgeFigure();
	}

	/**
	 * @generated
	 */
	public EdgeFigure getPrimaryShape() {
		return (EdgeFigure) getFigure();
	}

	/**
	 * @generated
	 */
	public class EdgeFigure extends PolylineConnectionEx {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureEdgeActionGuardFigure;

		/**
		 * @generated
		 */
		private WrappingLabel fFigureEdgeActionBodyFigure;

		/**
		 * @generated
		 */
		public EdgeFigure() {
			this.setLineWidth(1);

			createContents();
			setTargetDecoration(createTargetDecoration());
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureEdgeActionGuardFigure = new WrappingLabel();
			fFigureEdgeActionGuardFigure.setText("<...>");

			this.add(fFigureEdgeActionGuardFigure);

			fFigureEdgeActionBodyFigure = new WrappingLabel();
			fFigureEdgeActionBodyFigure.setText("[...]");

			this.add(fFigureEdgeActionBodyFigure);

		}

		/**
		 * @generated
		 */
		private RotatableDecoration createTargetDecoration() {
			PolylineDecoration df = new PolylineDecoration();
			df.setLineWidth(2);
			df.setForegroundColor(ColorConstants.green);
			df.setBackgroundColor(ColorConstants.green);
			return df;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureEdgeActionGuardFigure() {
			return fFigureEdgeActionGuardFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureEdgeActionBodyFigure() {
			return fFigureEdgeActionBodyFigure;
		}

	}

}
