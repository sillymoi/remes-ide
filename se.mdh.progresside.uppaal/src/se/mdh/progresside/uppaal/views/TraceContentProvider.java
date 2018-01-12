/**
 * 
 */
package se.mdh.progresside.uppaal.views;

import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.Viewer;

class TraceContentProvider implements IStructuredContentProvider,
		Trace.TraceModifiedListener, ISelectionChangedListener {

	private Viewer viewer;
	private Trace trace;

	public void inputChanged(Viewer v, Object oldInput, Object newInput) {

		if (viewer != null) {
			viewer.removeSelectionChangedListener(this);
		}

		this.viewer = v;
		viewer.addSelectionChangedListener(this);

		if (oldInput != null) {
			Trace trace = (Trace) oldInput;
			trace.removeListener(this);
			trace.setTraceCropConfirmationCallback(null);
		}
		if (newInput != null) {
			trace = (Trace) newInput;
			trace.addListener(this);
			trace.setTraceCropConfirmationCallback(new Trace.TraceCropConfirmationCallback() {

				@Override
				public boolean confirm() {
					return MessageDialog
							.openConfirm(viewer.getControl().getShell(),
									"Upaal CORA Simulator",
									"Warning: this will destroy a part of the current trace! Continue?");
				}
			});
		}
	}

	public void dispose() {
	}

	public Object[] getElements(Object parent) {
		Trace trace = (Trace) parent;
		return trace.getTraceElements().toArray();
	}

	@Override
	public void selectionChanged(SelectionChangedEvent event) {
		TraceElement element = (TraceElement) ((StructuredSelection) event
				.getSelection()).getFirstElement();
		if (element == null) {
			trace.setNextStateIndex(trace.getTraceElements().size());
		} else {
			trace.setNextStateIndex(trace.getTraceElements().indexOf(element));
		}

	}

	@Override
	public void traceModified() {
		if (viewer != null) {
			viewer.refresh();
		}
	}

}