package hr.fer.rasip.uppaallite.subdiagram.edit.parts;

import hr.fer.rasip.uppaallite.UppaallitePackage;
import hr.fer.rasip.uppaallite.subdiagram.edit.policies.LocationType3ItemSemanticEditPolicy;
import hr.fer.rasip.uppaallite.subdiagram.edit.policies.TemplateTypeCanonicalEditPolicy;
import hr.fer.rasip.uppaallite.subdiagram.part.UppaalliteVisualIDRegistry;
import hr.fer.rasip.uppaallite.subdiagram.providers.UppaalliteElementTypes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.ConnectionAnchor;
import org.eclipse.draw2d.Ellipse;
import org.eclipse.draw2d.EllipseAnchor;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gef.ConnectionEditPart;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.GraphicalEditPart;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gef.editpolicies.NonResizableEditPolicy;
import org.eclipse.gef.editpolicies.ResizableEditPolicy;
import org.eclipse.gef.handles.MoveHandle;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gmf.runtime.diagram.ui.editparts.AbstractBorderedShapeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IBorderItemEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.BorderItemSelectionEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.CanonicalEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.figures.BorderItemLocator;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.widgets.Display;

/**
 * @generated
 */
public class LocationType3EditPart extends AbstractBorderedShapeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 2009;

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
	public LocationType3EditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new LocationType3ItemSemanticEditPolicy());
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
				switch (UppaalliteVisualIDRegistry.getVisualID(childView)) {
				case LocationTypeName3EditPart.VISUAL_ID:
				case LocationTypeInvariant3EditPart.VISUAL_ID:
					return new BorderItemSelectionEditPolicy() {

						protected List createSelectionHandles() {
							MoveHandle mh = new MoveHandle(
									(GraphicalEditPart) getHost());
							mh.setBorder(null);
							return Collections.singletonList(mh);
						}
					};
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
		LocationTypeUrgentFigure figure = new LocationTypeUrgentFigure();
		return primaryShape = figure;
	}

	/**
	 * @generated
	 */
	public LocationTypeUrgentFigure getPrimaryShape() {
		return (LocationTypeUrgentFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected void addBorderItem(IFigure borderItemContainer,
			IBorderItemEditPart borderItemEditPart) {
		if (borderItemEditPart instanceof LocationTypeName3EditPart
				|| borderItemEditPart instanceof LocationTypeInvariant3EditPart) {
			BorderItemLocator locator = new BorderItemLocator(getMainFigure(),
					PositionConstants.SOUTH);
			locator.setBorderItemOffset(new Dimension(-20, -20));
			borderItemContainer.add(borderItemEditPart.getFigure(), locator);
		} else {
			super.addBorderItem(borderItemContainer, borderItemEditPart);
		}
	}

	/**
	 * @generated
	 */
	protected NodeFigure createNodePlate() {
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(32, 32);
		return result;
	}

	/**
	 * @generated
	 */
	public EditPolicy getPrimaryDragEditPolicy() {
		EditPolicy result = super.getPrimaryDragEditPolicy();
		if (result instanceof ResizableEditPolicy) {
			ResizableEditPolicy ep = (ResizableEditPolicy) result;
			ep.setResizeDirections(PositionConstants.NONE);
		}
		return result;
	}

	/**
	 * Creates figure for this edit part.
	 * 
	 * Body of this method does not depend on settings in generation model
	 * so you may safely remove <i>generated</i> tag and modify it.
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
	 * Default implementation treats passed figure as content pane.
	 * Respects layout one may have set for generated figure.
	 * @param nodeShape instance of generated figure class
	 * @generated
	 */
	protected IFigure setupContentPane(IFigure nodeShape) {
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
		return getChildBySemanticHint(UppaalliteVisualIDRegistry
				.getType(LocationTypeName3EditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/getMARelTypesOnSource() {
		List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/types = new ArrayList/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/();
		types.add(UppaalliteElementTypes.TransitionType_4002);
		return types;
	}

	/**
	 * @generated
	 */
	public List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/getMARelTypesOnSourceAndTarget(
			IGraphicalEditPart targetEditPart) {
		List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/types = new ArrayList/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/();
		if (targetEditPart instanceof LocationTypeEditPart) {
			types.add(UppaalliteElementTypes.TransitionType_4002);
		}
		if (targetEditPart instanceof LocationType2EditPart) {
			types.add(UppaalliteElementTypes.TransitionType_4002);
		}
		if (targetEditPart instanceof hr.fer.rasip.uppaallite.subdiagram.edit.parts.LocationType3EditPart) {
			types.add(UppaalliteElementTypes.TransitionType_4002);
		}
		if (targetEditPart instanceof LocationType4EditPart) {
			types.add(UppaalliteElementTypes.TransitionType_4002);
		}
		if (targetEditPart instanceof LocationType5EditPart) {
			types.add(UppaalliteElementTypes.TransitionType_4002);
		}
		if (targetEditPart instanceof LocationType6EditPart) {
			types.add(UppaalliteElementTypes.TransitionType_4002);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/getMATypesForTarget(
			IElementType relationshipType) {
		List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/types = new ArrayList/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/();
		if (relationshipType == UppaalliteElementTypes.TransitionType_4002) {
			types.add(UppaalliteElementTypes.LocationType_2007);
		}
		if (relationshipType == UppaalliteElementTypes.TransitionType_4002) {
			types.add(UppaalliteElementTypes.LocationType_2008);
		}
		if (relationshipType == UppaalliteElementTypes.TransitionType_4002) {
			types.add(UppaalliteElementTypes.LocationType_2009);
		}
		if (relationshipType == UppaalliteElementTypes.TransitionType_4002) {
			types.add(UppaalliteElementTypes.LocationType_2010);
		}
		if (relationshipType == UppaalliteElementTypes.TransitionType_4002) {
			types.add(UppaalliteElementTypes.LocationType_2011);
		}
		if (relationshipType == UppaalliteElementTypes.TransitionType_4002) {
			types.add(UppaalliteElementTypes.LocationType_2012);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/getMARelTypesOnTarget() {
		List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/types = new ArrayList/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/();
		types.add(UppaalliteElementTypes.TransitionType_4002);
		return types;
	}

	/**
	 * @generated
	 */
	public List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/getMATypesForSource(
			IElementType relationshipType) {
		List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/types = new ArrayList/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/();
		if (relationshipType == UppaalliteElementTypes.TransitionType_4002) {
			types.add(UppaalliteElementTypes.LocationType_2007);
		}
		if (relationshipType == UppaalliteElementTypes.TransitionType_4002) {
			types.add(UppaalliteElementTypes.LocationType_2008);
		}
		if (relationshipType == UppaalliteElementTypes.TransitionType_4002) {
			types.add(UppaalliteElementTypes.LocationType_2009);
		}
		if (relationshipType == UppaalliteElementTypes.TransitionType_4002) {
			types.add(UppaalliteElementTypes.LocationType_2010);
		}
		if (relationshipType == UppaalliteElementTypes.TransitionType_4002) {
			types.add(UppaalliteElementTypes.LocationType_2011);
		}
		if (relationshipType == UppaalliteElementTypes.TransitionType_4002) {
			types.add(UppaalliteElementTypes.LocationType_2012);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public class LocationTypeUrgentFigure extends Ellipse {

		/**
		 * @generated
		 */
		public LocationTypeUrgentFigure() {
			this.setLineWidth(2);
			this.setForegroundColor(ColorConstants.black);
			this.setBackgroundColor(THIS_BACK);
			this.setSize(getMapMode().DPtoLP(32), getMapMode().DPtoLP(32));
			createContents();
		}

		/**
		 * @generated NOT
		 */
		private void createContents() {

			WrappingLabel l0 = new WrappingLabel();
			l0.setText("U");

			l0.setFont(L0_FONT);

			l0.setLocation(new Point(getMapMode().DPtoLP(0), getMapMode()
					.DPtoLP(1)));
			l0.setSize(getMapMode().DPtoLP(32), getMapMode().DPtoLP(32));

			// Force alignment - the rest of this method is generated
			l0.setAlignment(PositionConstants.CENTER | PositionConstants.MIDDLE);

			this.add(l0);

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

	}

	/**
	 * @generated
	 */
	static final Color THIS_BACK = new Color(null, 32, 150, 255);

	/**
	 * @generated
	 */
	static final Font L0_FONT = new Font(Display.getCurrent(), "Arial", 22,
			SWT.NORMAL);

	/**
	 * @generated NOT
	 */
	protected void handleNotificationEvent(Notification notification) {
		int type = notification.getEventType();
		Object feature = notification.getFeature();
		if ((UppaallitePackage.eINSTANCE.getLocationType_Committed().equals(
				feature)
				|| UppaallitePackage.eINSTANCE.getLocationType_Urgent().equals(
						feature) || UppaallitePackage.eINSTANCE
				.getLocationType_Initial().equals(feature))
				&& type == Notification.SET) {
			CanonicalEditPolicy canonicalEditPolicy = (CanonicalEditPolicy) getParent()
					.getEditPolicy(EditPolicyRoles.CANONICAL_ROLE);
			canonicalEditPolicy.refresh();
			if (getParent().getEditPolicy(EditPolicyRoles.CANONICAL_ROLE) instanceof TemplateTypeCanonicalEditPolicy)
				((TemplateTypeCanonicalEditPolicy) canonicalEditPolicy)
						.layout();
		}
		super.handleNotificationEvent(notification);
	}

	/**
	 * Replaces default ConnectionAnchor with EllipseAnchor
	 * @see org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart#getSourceConnectionAnchor(org.eclipse.gef.ConnectionEditPart)
	 * @see org.eclipse.draw2d.EllipseAnchor
	 * 
	 * @generated NOT
	 */
	@Override
	public ConnectionAnchor getSourceConnectionAnchor(
			ConnectionEditPart connEditPart) {
		return new EllipseAnchor(getFigure());
	}

	/**
	 * Replaces default ConnectionAnchor with EllipseAnchor
	 * @see org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart#getSourceConnectionAnchor(org.eclipse.gef.Request)
	 * @see org.eclipse.draw2d.EllipseAnchor
	 * 
	 * @generated NOT
	 */
	@Override
	public ConnectionAnchor getSourceConnectionAnchor(Request request) {
		return new EllipseAnchor(getFigure());
	}

	/**
	 * Replaces default ConnectionAnchor with EllipseAnchor
	 * @see org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart#getTargetConnectionAnchor(org.eclipse.gef.ConnectionEditPart)
	 * @see org.eclipse.draw2d.EllipseAnchor
	 * 
	 * @generated NOT
	 */
	@Override
	public ConnectionAnchor getTargetConnectionAnchor(
			ConnectionEditPart connEditPart) {
		return new EllipseAnchor(getFigure());
	}

	/**
	 * Replaces default ConnectionAnchor with EllipseAnchor
	 * @see org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart#getTargetConnectionAnchor(org.eclipse.gef.Request)
	 * @see org.eclipse.draw2d.EllipseAnchor
	 * 
	 * @generated NOT
	 */
	@Override
	public ConnectionAnchor getTargetConnectionAnchor(Request request) {
		return new EllipseAnchor(getFigure());
	}
}
