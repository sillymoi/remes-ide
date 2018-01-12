package se.mdh.progresside.uppaal.launch.simulator;

import org.eclipse.debug.ui.AbstractLaunchConfigurationTabGroup;
import org.eclipse.debug.ui.ILaunchConfigurationDialog;
import org.eclipse.debug.ui.ILaunchConfigurationTab;

import se.mdh.progresside.uppaal.launch.verifyer.UppaalVerifierLaunchConfigurationMainTab;
import se.mdh.progresside.uppaal.launch.verifyer.UppaalVerifierLaunchConfigurationOptionsTab;
import se.mdh.progresside.uppaal.launch.verifyer.UppaalVerifierLaunchConfigurationQueryTab;

public class LaunchVerifierConfigurationTabGroup extends
		AbstractLaunchConfigurationTabGroup {

	public LaunchVerifierConfigurationTabGroup() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void createTabs(ILaunchConfigurationDialog dialog, String mode) {
		setTabs(new ILaunchConfigurationTab[] {
				new UppaalVerifierLaunchConfigurationMainTab(),
				new UppaalVerifierLaunchConfigurationQueryTab(),
				new UppaalVerifierLaunchConfigurationOptionsTab() });
	}

}
