package hr.fer.rasip.uppaallite.diagram.providers;

import hr.fer.rasip.uppaallite.diagram.edit.parts.UppaalDiagramEditPart;
import hr.fer.rasip.uppaallite.diagram.part.UppaalliteDiagramEditorPlugin;
import hr.fer.rasip.uppaallite.diagram.part.UppaalliteVisualIDRegistry;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class UppaalliteValidationProvider {

	/**
	 * @generated
	 */
	private static boolean constraintsActive = false;

	/**
	 * @generated
	 */
	public static boolean shouldConstraintsBePrivate() {
		return false;
	}

	/**
	 * @generated
	 */
	public static void runWithConstraints(
			TransactionalEditingDomain editingDomain, Runnable operation) {
		final Runnable op = operation;
		Runnable task = new Runnable() {
			public void run() {
				try {
					constraintsActive = true;
					op.run();
				} finally {
					constraintsActive = false;
				}
			}
		};
		if (editingDomain != null) {
			try {
				editingDomain.runExclusive(task);
			} catch (Exception e) {
				UppaalliteDiagramEditorPlugin.getInstance().logError(
						"Validation failed", e); //$NON-NLS-1$
			}
		} else {
			task.run();
		}
	}

	/**
	 * @generated
	 */
	static boolean isInDefaultEditorContext(Object object) {
		if (shouldConstraintsBePrivate() && !constraintsActive) {
			return false;
		}
		if (object instanceof View) {
			return constraintsActive
					&& UppaalDiagramEditPart.MODEL_ID
							.equals(UppaalliteVisualIDRegistry
									.getModelID((View) object));
		}
		return true;
	}

}
