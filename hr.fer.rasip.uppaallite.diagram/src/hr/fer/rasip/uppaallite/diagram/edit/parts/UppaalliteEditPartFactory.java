package hr.fer.rasip.uppaallite.diagram.edit.parts;

import hr.fer.rasip.uppaallite.diagram.part.UppaalliteVisualIDRegistry;

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

/**
 * @generated
 */
public class UppaalliteEditPartFactory implements EditPartFactory {

	/**
	 * @generated
	 */
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (UppaalliteVisualIDRegistry.getVisualID(view)) {

			case TemplateTypeEditPart.VISUAL_ID:
				return new TemplateTypeEditPart(view);

			case LocationTypeEditPart.VISUAL_ID:
				return new LocationTypeEditPart(view);

			case LocationTypeNameEditPart.VISUAL_ID:
				return new LocationTypeNameEditPart(view);

			case LocationTypeInvariantEditPart.VISUAL_ID:
				return new LocationTypeInvariantEditPart(view);

			case LocationType2EditPart.VISUAL_ID:
				return new LocationType2EditPart(view);

			case LocationTypeName2EditPart.VISUAL_ID:
				return new LocationTypeName2EditPart(view);

			case LocationTypeInvariant2EditPart.VISUAL_ID:
				return new LocationTypeInvariant2EditPart(view);

			case LocationType3EditPart.VISUAL_ID:
				return new LocationType3EditPart(view);

			case LocationTypeName3EditPart.VISUAL_ID:
				return new LocationTypeName3EditPart(view);

			case LocationTypeInvariant3EditPart.VISUAL_ID:
				return new LocationTypeInvariant3EditPart(view);

			case TransitionTypeEditPart.VISUAL_ID:
				return new TransitionTypeEditPart(view);

			case TransitionTypeAssignmentEditPart.VISUAL_ID:
				return new TransitionTypeAssignmentEditPart(view);

			case TransitionTypeGuardEditPart.VISUAL_ID:
				return new TransitionTypeGuardEditPart(view);

			case TransitionTypeSyncEditPart.VISUAL_ID:
				return new TransitionTypeSyncEditPart(view);

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
