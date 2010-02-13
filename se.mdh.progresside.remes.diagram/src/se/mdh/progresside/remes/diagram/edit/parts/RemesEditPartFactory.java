package se.mdh.progresside.remes.diagram.edit.parts;

import org.eclipse.draw2d.FigureUtilities;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Text;

import se.mdh.progresside.remes.diagram.part.RemesVisualIDRegistry;

/**
 * @generated
 */
public class RemesEditPartFactory implements EditPartFactory {

	/**
	 * @generated
	 */
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (RemesVisualIDRegistry.getVisualID(view)) {

			case RemesDiagramEditPart.VISUAL_ID:
				return new RemesDiagramEditPart(view);

			case SubModeEditPart.VISUAL_ID:
				return new SubModeEditPart(view);

			case SubModeNameEditPart.VISUAL_ID:
				return new SubModeNameEditPart(view);

			case SubModeInitializationEditPart.VISUAL_ID:
				return new SubModeInitializationEditPart(view);

			case SubModeInvariantEditPart.VISUAL_ID:
				return new SubModeInvariantEditPart(view);

			case SubModeIsUrgentEditPart.VISUAL_ID:
				return new SubModeIsUrgentEditPart(view);

			case CompositeModeEditPart.VISUAL_ID:
				return new CompositeModeEditPart(view);

			case CompositeModeNameEditPart.VISUAL_ID:
				return new CompositeModeNameEditPart(view);

			case CompositeModeInitializationEditPart.VISUAL_ID:
				return new CompositeModeInitializationEditPart(view);

			case VariableEditPart.VISUAL_ID:
				return new VariableEditPart(view);

			case ResourceEditPart.VISUAL_ID:
				return new ResourceEditPart(view);

			case EntryPointEditPart.VISUAL_ID:
				return new EntryPointEditPart(view);

			case ExitPointEditPart.VISUAL_ID:
				return new ExitPointEditPart(view);

			case SubMode2EditPart.VISUAL_ID:
				return new SubMode2EditPart(view);

			case SubModeName2EditPart.VISUAL_ID:
				return new SubModeName2EditPart(view);

			case SubModeInitialization2EditPart.VISUAL_ID:
				return new SubModeInitialization2EditPart(view);

			case SubModeInvariant2EditPart.VISUAL_ID:
				return new SubModeInvariant2EditPart(view);

			case SubModeIsUrgent2EditPart.VISUAL_ID:
				return new SubModeIsUrgent2EditPart(view);

			case Variable2EditPart.VISUAL_ID:
				return new Variable2EditPart(view);

			case Resource2EditPart.VISUAL_ID:
				return new Resource2EditPart(view);

			case EntryPoint2EditPart.VISUAL_ID:
				return new EntryPoint2EditPart(view);

			case ExitPoint2EditPart.VISUAL_ID:
				return new ExitPoint2EditPart(view);

			case ConditionalConnectorEditPart.VISUAL_ID:
				return new ConditionalConnectorEditPart(view);

			case ConditionalConnectorNameEditPart.VISUAL_ID:
				return new ConditionalConnectorNameEditPart(view);

			case EntryPoint3EditPart.VISUAL_ID:
				return new EntryPoint3EditPart(view);

			case ExitPoint3EditPart.VISUAL_ID:
				return new ExitPoint3EditPart(view);

			case Variable3EditPart.VISUAL_ID:
				return new Variable3EditPart(view);

			case EntryPoint4EditPart.VISUAL_ID:
				return new EntryPoint4EditPart(view);

			case ExitPoint4EditPart.VISUAL_ID:
				return new ExitPoint4EditPart(view);

			case CompositeEntryPointEditPart.VISUAL_ID:
				return new CompositeEntryPointEditPart(view);

			case CompositeExitPointEditPart.VISUAL_ID:
				return new CompositeExitPointEditPart(view);

			case InitPointEditPart.VISUAL_ID:
				return new InitPointEditPart(view);

			case SubModeSubModeVariablesCompartmentEditPart.VISUAL_ID:
				return new SubModeSubModeVariablesCompartmentEditPart(view);

			case SubModeSubModeResourcesCompartmentEditPart.VISUAL_ID:
				return new SubModeSubModeResourcesCompartmentEditPart(view);

			case CompositeModeCompositeModeVariablesCompartmentEditPart.VISUAL_ID:
				return new CompositeModeCompositeModeVariablesCompartmentEditPart(
						view);

			case CompositeModeCompositeModeCompartmentEditPart.VISUAL_ID:
				return new CompositeModeCompositeModeCompartmentEditPart(view);

			case SubModeSubModeVariablesCompartment2EditPart.VISUAL_ID:
				return new SubModeSubModeVariablesCompartment2EditPart(view);

			case SubModeSubModeResourcesCompartment2EditPart.VISUAL_ID:
				return new SubModeSubModeResourcesCompartment2EditPart(view);

			case EdgeEditPart.VISUAL_ID:
				return new EdgeEditPart(view);

			case EdgeActionGuardEditPart.VISUAL_ID:
				return new EdgeActionGuardEditPart(view);

			case InitEdgeEditPart.VISUAL_ID:
				return new InitEdgeEditPart(view);

			case InitEdgeInitializationEditPart.VISUAL_ID:
				return new InitEdgeInitializationEditPart(view);

			}
		}
		return createUnrecognizedEditPart(context, model);
	}

	/**
	 * @generated
	 */
	private EditPart createUnrecognizedEditPart(EditPart context, Object model) {
		// Handle creation of unrecognized child node EditParts here
		return null;
	}

	/**
	 * @generated
	 */
	public static CellEditorLocator getTextCellEditorLocator(
			ITextAwareEditPart source) {
		if (source.getFigure() instanceof WrappingLabel)
			return new TextCellEditorLocator((WrappingLabel) source.getFigure());
		else {
			return new LabelCellEditorLocator((Label) source.getFigure());
		}
	}

	/**
	 * @generated
	 */
	static private class TextCellEditorLocator implements CellEditorLocator {

		/**
		 * @generated
		 */
		private WrappingLabel wrapLabel;

		/**
		 * @generated
		 */
		public TextCellEditorLocator(WrappingLabel wrapLabel) {
			this.wrapLabel = wrapLabel;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getWrapLabel() {
			return wrapLabel;
		}

		/**
		 * @generated
		 */
		public void relocate(CellEditor celleditor) {
			Text text = (Text) celleditor.getControl();
			Rectangle rect = getWrapLabel().getTextBounds().getCopy();
			getWrapLabel().translateToAbsolute(rect);
			if (getWrapLabel().isTextWrapOn()
					&& getWrapLabel().getText().length() > 0) {
				rect.setSize(new Dimension(text.computeSize(rect.width,
						SWT.DEFAULT)));
			} else {
				int avr = FigureUtilities.getFontMetrics(text.getFont())
						.getAverageCharWidth();
				rect.setSize(new Dimension(text.computeSize(SWT.DEFAULT,
						SWT.DEFAULT)).expand(avr * 2, 0));
			}
			if (!rect.equals(new Rectangle(text.getBounds()))) {
				text.setBounds(rect.x, rect.y, rect.width, rect.height);
			}
		}
	}

	/**
	 * @generated
	 */
	private static class LabelCellEditorLocator implements CellEditorLocator {

		/**
		 * @generated
		 */
		private Label label;

		/**
		 * @generated
		 */
		public LabelCellEditorLocator(Label label) {
			this.label = label;
		}

		/**
		 * @generated
		 */
		public Label getLabel() {
			return label;
		}

		/**
		 * @generated
		 */
		public void relocate(CellEditor celleditor) {
			Text text = (Text) celleditor.getControl();
			Rectangle rect = getLabel().getTextBounds().getCopy();
			getLabel().translateToAbsolute(rect);
			int avr = FigureUtilities.getFontMetrics(text.getFont())
					.getAverageCharWidth();
			rect.setSize(new Dimension(text.computeSize(SWT.DEFAULT,
					SWT.DEFAULT)).expand(avr * 2, 0));
			if (!rect.equals(new Rectangle(text.getBounds()))) {
				text.setBounds(rect.x, rect.y, rect.width, rect.height);
			}
		}
	}
}
