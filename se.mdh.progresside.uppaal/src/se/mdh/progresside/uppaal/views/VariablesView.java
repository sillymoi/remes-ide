package se.mdh.progresside.uppaal.views;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.part.ViewPart;

import com.uppaal.model.system.SystemState;
import com.uppaal.model.system.UppaalSystem;

public class VariablesView extends ViewPart {

	public static final String ID = "se.mdh.progresside.uppaal.views.VariablesView";
	private VariablesViewer viewer;

	public VariablesView() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void createPartControl(Composite parent) {
		viewer = new VariablesViewer(parent);
	}

	@Override
	public void setFocus() {
		viewer.getControl().setFocus();
	}

	public void init(UppaalSystem system, SystemState state) {
		viewer.init(system, state);
	}

}
