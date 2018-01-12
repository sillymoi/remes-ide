package se.mdh.progresside.uppaal.launch.simulator;

import org.eclipse.debug.ui.AbstractLaunchConfigurationTabGroup;
import org.eclipse.debug.ui.ILaunchConfigurationDialog;
import org.eclipse.debug.ui.ILaunchConfigurationTab;


public class LaunchSimulatorConfigurationTabGroup extends
		AbstractLaunchConfigurationTabGroup {

	public LaunchSimulatorConfigurationTabGroup() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void createTabs(ILaunchConfigurationDialog dialog, String mode) {
		setTabs(new ILaunchConfigurationTab[] { new UppaalSimulatorLaunchConfigurationTab() });
	}
		

}
