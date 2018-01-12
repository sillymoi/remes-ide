package hr.fer.rasip.remes.launcher.component.launching;

import hr.fer.rasip.remes.launcher.launching.ISimulatorLaunchConstants;

/**
 * This interface contains the common constants used to launch REMES behaviors.
 * Some code was copied from M2M ATL project.
 * 
 * @author <a href="mailto:marin.orlic@fer.hr">Marin Orlic</a>
 */
public interface IComponentSimulatorLaunchConstants extends ISimulatorLaunchConstants {

	/** Launch type. */
	String LAUNCH_CONFIG_TYPE_ID = "hr.fer.rasip.remes.launcher.component.launchConfigurationType"; //$NON-NLS-1$

		/** Component UUID */
	String COMPONENT_UUID_ATTR = "hr.fer.rasip.remes.launcher.component.ComponentUUID"; //$NON-NLS-1$
	
	/** REMES icon path. */
	String REMES_ICON_PATH = "remes_components.gif"; //$NON-NLS-1$
}