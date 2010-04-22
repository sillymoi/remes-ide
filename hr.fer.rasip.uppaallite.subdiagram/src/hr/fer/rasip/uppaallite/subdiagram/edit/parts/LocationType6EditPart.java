package hr.fer.rasip.uppaallite.subdiagram.edit.parts;

import hr.fer.rasip.uppaallite.UppaallitePackage;
import hr.fer.rasip.uppaallite.subdiagram.edit.policies.LocationType6ItemSemanticEditPolicy;
import hr.fer.rasip.uppaallite.subdiagram.edit.policies.TemplateTypeCanonicalEditPolicy;
import hr.fer.rasip.uppaallite.subdiagram.part.UppaalliteVisualIDRegistry;
import hr.fer.rasip.uppaallite.subdiagram.providers.UppaalliteElementTypes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.emf.common.notify.Notification;
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
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.lite.svg.SVGFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.graphics.Color;

/**
 * @generated
 */
public class LocationType6EditPart extends AbstractBorderedShapeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 2006;

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
	public LocationType6EditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new LocationType6ItemSemanticEditPolicy());
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
				case LocationTypeName6EditPart.VISUAL_ID:
				case LocationTypeInvariant6EditPart.VISUAL_ID:
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
		LocationTypeInitCommitedFigure figure = new LocationTypeInitCommitedFigure();
		return primaryShape = figure;
	}

	/**
	 * @generated
	 */
	public LocationTypeInitCommitedFigure getPrimaryShape() {
		return (LocationTypeInitCommitedFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected void addBorderItem(IFigure borderItemContainer,
			IBorderItemEditPart borderItemEditPart) {
		if (borderItemEditPart instanceof LocationTypeName6EditPart
				|| borderItemEditPart instanceof LocationTypeInvariant6EditPart) {
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
				.getType(LocationTypeName6EditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/getMARelTypesOnSource() {
		List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/types = new ArrayList/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/();
		types.add(UppaalliteElementTypes.TransitionType_4001);
		return types;
	}

	/**
	 * @generated
	 */
	public List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/getMARelTypesOnSourceAndTarget(
			IGraphicalEditPart targetEditPart) {
		List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/types = new ArrayList/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/();
		if (targetEditPart instanceof LocationTypeEditPart) {
			types.add(UppaalliteElementTypes.TransitionType_4001);
		}
		if (targetEditPart instanceof LocationType2EditPart) {
			types.add(UppaalliteElementTypes.TransitionType_4001);
		}
		if (targetEditPart instanceof LocationType3EditPart) {
			types.add(UppaalliteElementTypes.TransitionType_4001);
		}
		if (targetEditPart instanceof LocationType4EditPart) {
			types.add(UppaalliteElementTypes.TransitionType_4001);
		}
		if (targetEditPart instanceof LocationType5EditPart) {
			types.add(UppaalliteElementTypes.TransitionType_4001);
		}
		if (targetEditPart instanceof hr.fer.rasip.uppaallite.subdiagram.edit.parts.LocationType6EditPart) {
			types.add(UppaalliteElementTypes.TransitionType_4001);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/getMATypesForTarget(
			IElementType relationshipType) {
		List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/types = new ArrayList/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/();
		if (relationshipType == UppaalliteElementTypes.TransitionType_4001) {
			types.add(UppaalliteElementTypes.LocationType_2001);
		}
		if (relationshipType == UppaalliteElementTypes.TransitionType_4001) {
			types.add(UppaalliteElementTypes.LocationType_2002);
		}
		if (relationshipType == UppaalliteElementTypes.TransitionType_4001) {
			types.add(UppaalliteElementTypes.LocationType_2003);
		}
		if (relationshipType == UppaalliteElementTypes.TransitionType_4001) {
			types.add(UppaalliteElementTypes.LocationType_2004);
		}
		if (relationshipType == UppaalliteElementTypes.TransitionType_4001) {
			types.add(UppaalliteElementTypes.LocationType_2005);
		}
		if (relationshipType == UppaalliteElementTypes.TransitionType_4001) {
			types.add(UppaalliteElementTypes.LocationType_2006);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/getMARelTypesOnTarget() {
		List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/types = new ArrayList/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/();
		types.add(UppaalliteElementTypes.TransitionType_4001);
		return types;
	}

	/**
	 * @generated
	 */
	public List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/getMATypesForSource(
			IElementType relationshipType) {
		List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/types = new ArrayList/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/();
		if (relationshipType == UppaalliteElementTypes.TransitionType_4001) {
			types.add(UppaalliteElementTypes.LocationType_2001);
		}
		if (relationshipType == UppaalliteElementTypes.TransitionType_4001) {
			types.add(UppaalliteElementTypes.LocationType_2002);
		}
		if (relationshipType == UppaalliteElementTypes.TransitionType_4001) {
			types.add(UppaalliteElementTypes.LocationType_2003);
		}
		if (relationshipType == UppaalliteElementTypes.TransitionType_4001) {
			types.add(UppaalliteElementTypes.LocationType_2004);
		}
		if (relationshipType == UppaalliteElementTypes.TransitionType_4001) {
			types.add(UppaalliteElementTypes.LocationType_2005);
		}
		if (relationshipType == UppaalliteElementTypes.TransitionType_4001) {
			types.add(UppaalliteElementTypes.LocationType_2006);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public class LocationTypeInitCommitedFigure extends SVGFigure {

		/**
		 * @generated
		 */
		public LocationTypeInitCommitedFigure() {
			this
					.setURI("platform:/plugin/hr.fer.rasip.uppaallite.subdiagram/icons/LocationTypeInitCommitedImage.svg");
			this.setSpecifyCanvasWidth(false);
			this.setSpecifyCanvasHeight(false);
			this.setPreferredSize(new Dimension(getMapMode().DPtoLP(32),
					getMapMode().DPtoLP(32)));
			this.setMaximumSize(new Dimension(getMapMode().DPtoLP(32),
					getMapMode().DPtoLP(32)));
			this.setMinimumSize(new Dimension(getMapMode().DPtoLP(32),
					getMapMode().DPtoLP(32)));
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
	 * @generated NOT
	 */
	protected void handleNotificationEvent(Notification notification) {
		int type = notification.getEventType();
		Object feature = notification.getFeature();
		if ((UppaallitePackage.eINSTANCE.getLocationType_Commited().equals(
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

}