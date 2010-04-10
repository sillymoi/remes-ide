package se.mdh.progresside.remes.diagram.edit.parts;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.MarginBorder;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.draw2d.RoundedRectangle;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gef.editpolicies.NonResizableEditPolicy;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gmf.runtime.diagram.core.edithelpers.CreateElementRequestAdapter;
import org.eclipse.gmf.runtime.diagram.ui.editparts.AbstractBorderedShapeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IBorderItemEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.BorderItemSelectionEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.CreationEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.DragDropEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.figures.BorderItemLocator;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewAndElementRequest;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;

import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.widgets.Display;
import se.mdh.progresside.remes.diagram.edit.policies.SubModeCanonicalEditPolicy;
import se.mdh.progresside.remes.diagram.edit.policies.SubModeItemSemanticEditPolicy;
import se.mdh.progresside.remes.diagram.part.RemesVisualIDRegistry;
import se.mdh.progresside.remes.diagram.providers.RemesElementTypes;

/**
 * @generated
 */
public class SubModeEditPart extends AbstractBorderedShapeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 2007;

	/**
	 * @generated
	 */
	protected IFigure contentPane;

	/**
	 * @generated
	 */
	protected IFigure primaryShape;

	/**
	 * @generated
	 */
	public SubModeEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		installEditPolicy(EditPolicyRoles.CREATION_ROLE,
				new CreationEditPolicy());
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new SubModeItemSemanticEditPolicy());
		installEditPolicy(EditPolicyRoles.DRAG_DROP_ROLE,
				new DragDropEditPolicy());
		installEditPolicy(EditPolicyRoles.CANONICAL_ROLE,
				new SubModeCanonicalEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());
		// XXX need an SCR to runtime to have another abstract superclass that would let children add reasonable editpolicies
		// removeEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.CONNECTION_HANDLES_ROLE);
	}

	/**
	 * @generated
	 */
	protected LayoutEditPolicy createLayoutEditPolicy() {
		LayoutEditPolicy lep = new LayoutEditPolicy() {

			protected EditPolicy createChildEditPolicy(EditPart child) {
				View childView = (View) child.getModel();
				switch (RemesVisualIDRegistry.getVisualID(childView)) {
				case EntryPointEditPart.VISUAL_ID:
				case ExitPointEditPart.VISUAL_ID:
					return new BorderItemSelectionEditPolicy();
				}
				EditPolicy result = child
						.getEditPolicy(EditPolicy.PRIMARY_DRAG_ROLE);
				if (result == null) {
					result = new NonResizableEditPolicy();
				}
				return result;
			}

			protected Command getMoveChildrenCommand(Request request) {
				return null;
			}

			protected Command getCreateCommand(CreateRequest request) {
				return null;
			}
		};
		return lep;
	}

	/**
	 * @generated
	 */
	protected IFigure createNodeShape() {
		SubModeFigure figure = new SubModeFigure();
		return primaryShape = figure;
	}

	/**
	 * @generated
	 */
	public SubModeFigure getPrimaryShape() {
		return (SubModeFigure) primaryShape;
	}

	/**
	 * Generated implementation is overriden to provide offset for entry and
	 * exit points which are located on the border. This will make the points
	 * overlap the border.
	 * 
	 * @generated NOT
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof SubModeInitializationEditPart) {
			((SubModeInitializationEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureSubModeInitializationFigure());
			return true;
		}
		if (childEditPart instanceof SubModeInvariantEditPart) {
			((SubModeInvariantEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureSubModeInvariantFigure());
			return true;
		}
		if (childEditPart instanceof SubModeNameEditPart) {
			((SubModeNameEditPart) childEditPart).setLabel(getPrimaryShape()
					.getFigureSubModeNameFigure());
			return true;
		}
		if (childEditPart instanceof SubModeIsUrgentEditPart) {
			((SubModeIsUrgentEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureSubModeIsUrgentFigure());
			return true;
		}
		if (childEditPart instanceof EntryPointEditPart) {
			BorderItemLocator locator = new BorderItemLocator(getMainFigure(),
					PositionConstants.WEST);
			locator.setBorderItemOffset(new Dimension(5, 5));
			getBorderedFigure().getBorderItemContainer().add(
					((EntryPointEditPart) childEditPart).getFigure(), locator);
			return true;
		}
		if (childEditPart instanceof ExitPointEditPart) {
			BorderItemLocator locator = new BorderItemLocator(getMainFigure(),
					PositionConstants.EAST);
			locator.setBorderItemOffset(new Dimension(5, 5));
			getBorderedFigure().getBorderItemContainer().add(
					((ExitPointEditPart) childEditPart).getFigure(), locator);
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof SubModeInvariantEditPart) {
			return true;
		}
		if (childEditPart instanceof SubModeNameEditPart) {
			return true;
		}
		if (childEditPart instanceof SubModeIsUrgentEditPart) {
			return true;
		}
		if (childEditPart instanceof SubModeInitializationEditPart) {
			return true;
		}
		if (childEditPart instanceof EntryPointEditPart) {
			getBorderedFigure().getBorderItemContainer().remove(
					((EntryPointEditPart) childEditPart).getFigure());
			return true;
		}
		if (childEditPart instanceof ExitPointEditPart) {
			getBorderedFigure().getBorderItemContainer().remove(
					((ExitPointEditPart) childEditPart).getFigure());
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
	protected void removeChildVisual(EditPart childEditPart) {
		if (removeFixedChild(childEditPart)) {
			return;
		}
		super.removeChildVisual(childEditPart);
	}

	/**
	 * @generated
	 */
	protected IFigure getContentPaneFor(IGraphicalEditPart editPart) {
		if (editPart instanceof IBorderItemEditPart) {
			return getBorderedFigure().getBorderItemContainer();
		}
		return getContentPane();
	}

	/**
	 * @generated
	 */
	protected NodeFigure createNodePlate() {
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(40, 40);
		return result;
	}

	/**
	 * Creates figure for this edit part.
	 * 
	 * Body of this method does not depend on settings in generation model so
	 * you may safely remove <i>generated</i> tag and modify it.
	 * 
	 * @generated
	 */
	protected NodeFigure createMainFigure() {
		NodeFigure figure = createNodePlate();
		figure.setLayoutManager(new StackLayout());
		IFigure shape = createNodeShape();
		figure.add(shape);
		contentPane = setupContentPane(shape);
		return figure;
	}

	/**
	 * Default implementation treats passed figure as content pane. Respects
	 * layout one may have set for generated figure.
	 * 
	 * @param nodeShape
	 *            instance of generated figure class
	 * @generated
	 */
	protected IFigure setupContentPane(IFigure nodeShape) {
		if (nodeShape.getLayoutManager() == null) {
			ConstrainedToolbarLayout layout = new ConstrainedToolbarLayout();
			layout.setSpacing(5);
			nodeShape.setLayoutManager(layout);
		}
		return nodeShape; // use nodeShape itself as contentPane
	}

	/**
	 * @generated
	 */
	public IFigure getContentPane() {
		if (contentPane != null) {
			return contentPane;
		}
		return super.getContentPane();
	}

	/**
	 * @generated
	 */
	protected void setForegroundColor(Color color) {
		if (primaryShape != null) {
			primaryShape.setForegroundColor(color);
		}
	}

	/**
	 * @generated
	 */
	protected void setBackgroundColor(Color color) {
		if (primaryShape != null) {
			primaryShape.setBackgroundColor(color);
		}
	}

	/**
	 * @generated
	 */
	protected void setLineWidth(int width) {
		if (primaryShape instanceof Shape) {
			((Shape) primaryShape).setLineWidth(width);
		}
	}

	/**
	 * @generated
	 */
	protected void setLineType(int style) {
		if (primaryShape instanceof Shape) {
			((Shape) primaryShape).setLineStyle(style);
		}
	}

	/**
	 * @generated
	 */
	public EditPart getPrimaryChildEditPart() {
		return getChildBySemanticHint(RemesVisualIDRegistry
				.getType(SubModeNameEditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public EditPart getTargetEditPart(Request request) {
		if (request instanceof CreateViewAndElementRequest) {
			CreateElementRequestAdapter adapter = ((CreateViewAndElementRequest) request)
					.getViewAndElementDescriptor()
					.getCreateElementRequestAdapter();
			IElementType type = (IElementType) adapter
					.getAdapter(IElementType.class);
			if (type == RemesElementTypes.Variable_3022) {
				return getChildBySemanticHint(RemesVisualIDRegistry
						.getType(SubModeSubModeVariablesCompartmentEditPart.VISUAL_ID));
			}
			if (type == RemesElementTypes.Resource_3023) {
				return getChildBySemanticHint(RemesVisualIDRegistry
						.getType(SubModeSubModeResourcesCompartmentEditPart.VISUAL_ID));
			}
		}
		return super.getTargetEditPart(request);
	}

	/**
	 * @generated
	 */
	public class SubModeFigure extends RoundedRectangle {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureSubModeNameFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureSubModeInitializationFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureSubModeInvariantFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureSubModeIsUrgentFigure;

		/**
		 * @generated
		 */
		public SubModeFigure() {
			this.setCornerDimensions(new Dimension(getMapMode().DPtoLP(8),
					getMapMode().DPtoLP(8)));
			this.setLineWidth(2);
			this.setBorder(new MarginBorder(getMapMode().DPtoLP(5),
					getMapMode().DPtoLP(5), getMapMode().DPtoLP(5),
					getMapMode().DPtoLP(5)));
			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureSubModeNameFigure = new WrappingLabel();
			fFigureSubModeNameFigure.setText("Submode Name");

			fFigureSubModeNameFigure.setFont(FFIGURESUBMODENAMEFIGURE_FONT);

			this.add(fFigureSubModeNameFigure);

			fFigureSubModeInitializationFigure = new WrappingLabel();
			fFigureSubModeInitializationFigure.setText("");

			this.add(fFigureSubModeInitializationFigure);

			fFigureSubModeInvariantFigure = new WrappingLabel();
			fFigureSubModeInvariantFigure.setText("");

			this.add(fFigureSubModeInvariantFigure);

			fFigureSubModeIsUrgentFigure = new WrappingLabel();
			fFigureSubModeIsUrgentFigure.setText("false");

			this.add(fFigureSubModeIsUrgentFigure);

		}

		/**
		 * @generated
		 */
		private boolean myUseLocalCoordinates = false;

		/**
		 * @generated
		 */
		protected boolean useLocalCoordinates() {
			return myUseLocalCoordinates;
		}

		/**
		 * @generated
		 */
		protected void setUseLocalCoordinates(boolean useLocalCoordinates) {
			myUseLocalCoordinates = useLocalCoordinates;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureSubModeNameFigure() {
			return fFigureSubModeNameFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureSubModeInitializationFigure() {
			return fFigureSubModeInitializationFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureSubModeInvariantFigure() {
			return fFigureSubModeInvariantFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureSubModeIsUrgentFigure() {
			return fFigureSubModeIsUrgentFigure;
		}

	}

	/**
	 * @generated
	 */
	static final Font FFIGURESUBMODENAMEFIGURE_FONT = new Font(Display
			.getCurrent(),
			Display.getDefault().getSystemFont().getFontData()[0].getName(), 9,
			SWT.BOLD);

}
