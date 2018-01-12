package hr.fer.rasip.remes.launcher.launching.ui;

import org.eclipse.debug.ui.AbstractLaunchConfigurationTabGroup;
import org.eclipse.debug.ui.CommonTab;
import org.eclipse.debug.ui.ILaunchConfigurationDialog;
import org.eclipse.debug.ui.ILaunchConfigurationTab;
import org.eclipse.debug.ui.sourcelookup.SourceLookupTab;
import org.eclipse.jdt.debug.ui.launchConfigurations.JavaArgumentsTab;
import org.eclipse.jdt.debug.ui.launchConfigurations.JavaClasspathTab;
import org.eclipse.jdt.debug.ui.launchConfigurations.JavaJRETab;

public class SimulatorLaunchConfigurationTabGroup extends AbstractLaunchConfigurationTabGroup {
	
	/**
	 * Constructs a new Simulator tab group.
	 */
	public SimulatorLaunchConfigurationTabGroup() {
	}
	
	/**
	 * Creates configuration tabs - reuses Java JRE, Java Classpath, Source lookup and Common tabs.
	 * @see org.eclipse.debug.ui.ILaunchConfigurationTabGroup#createTabs(org.eclipse.debug.ui.ILaunchConfigurationDialog, java.lang.String)
	 */
	public void createTabs(ILaunchConfigurationDialog dialog, String mode) {
		ILaunchConfigurationTab[] tabs = new ILaunchConfigurationTab[] {
			new MainTab(),
			new JavaArgumentsTab(),
			new JavaJRETab(),
			new JavaClasspathTab(),
			new SourceLookupTab(),	
			new CommonTab()
		};
		setTabs(tabs);
	}
}