package se.mdh.progresside.uppaal.views;

import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;

public class TraceViewer extends TableViewer {

	public TraceViewer(Composite parent) {
		super(parent, SWT.SINGLE | SWT.H_SCROLL | SWT.V_SCROLL | SWT.BORDER);
		setContentProvider(new TraceContentProvider());
		setLabelProvider(new TraceLabelProvider());
	}
}
