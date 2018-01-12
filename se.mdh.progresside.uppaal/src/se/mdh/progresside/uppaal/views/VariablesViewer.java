package se.mdh.progresside.uppaal.views;

import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;

import com.uppaal.model.system.SystemState;
import com.uppaal.model.system.UppaalSystem;

public class VariablesViewer extends TableViewer {

	public VariablesViewer(Composite parent) {
		super(parent, SWT.SINGLE | SWT.H_SCROLL | SWT.V_SCROLL | SWT.BORDER);
		setLabelProvider(new LabelProvider());
		setContentProvider(new VariablesContentProvider());
	}

	public void init(UppaalSystem system, SystemState state) {
		((VariablesContentProvider) getContentProvider()).setSystem(system);
		setInput(state);
	}
}
