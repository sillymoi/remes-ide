package se.mdh.progresside.uppaal.views;

import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;

import com.uppaal.engine.Engine;
import com.uppaal.model.system.UppaalSystem;

public class TransitionsViewer extends TableViewer {

	public TransitionsViewer(Composite parent) {
		super(parent, SWT.SINGLE | SWT.H_SCROLL
				| SWT.V_SCROLL | SWT.BORDER);
		setContentProvider(new TransitionsContentProvider());
		setLabelProvider(new TransitionsLabelProvider());
	}

	public void init(Engine engine, UppaalSystem system) {
		TransitionsContentProvider provider = (TransitionsContentProvider) getContentProvider();
		provider.setEngine(engine);
		provider.setSystem(system);
		setInput(system.getInitial());
	}
}
