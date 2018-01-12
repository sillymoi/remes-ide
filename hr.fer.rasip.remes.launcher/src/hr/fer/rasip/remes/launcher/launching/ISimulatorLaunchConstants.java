package hr.fer.rasip.remes.launcher.launching;

/**
 * This interface contains the common constants used to launch REMES behaviors.
 * Some code was copied from M2M ATL project.
 * 
 * @author <a href="mailto:marin.orlic@fer.hr">Marin Orlic</a>
 */
public interface ISimulatorLaunchConstants {

	/** Launch type. */
	String LAUNCH_CONFIG_TYPE_ID = "hr.fer.rasip.remes.launcher.launchConfigurationType"; //$NON-NLS-1$

	/** REMES File Name. */
	String REMES_FILE_NAME_ATTR = "hr.fer.rasip.remes.launcher.RemesFileName"; //$NON-NLS-1$
	
	/** Package Name. */
	String PACKAGE_NAME_ATTR = "hr.fer.rasip.remes.launcher.GeneratedPackageName"; //$NON-NLS-1$

	/** Profile Name. */
	String PROFILE_FILE_NAME_ATTR = "hr.fer.rasip.remes.launcher.ProfileFileName"; //$NON-NLS-1$
	
	/** Default Package Name. */
	String DEFAULT_PACKAGE_NAME = "generated";
	
	/** REMES icon path. */
	String REMES_ICON_PATH = "remes_logo.gif"; //$NON-NLS-1$

	/** REMES extensions. */
	String[] REMES_EXTENSIONS = new String[] {"remes", "remes_diagram"}; //$NON-NLS-1$ //$NON-NLS-2$

	/** Profile extensions. */
	String[] PROFILE_EXTENSIONS = new String[] {"profile"}; //$NON-NLS-1$ //$NON-NsLS-2$

	/** Simulator plugin. */
	String SIMULATOR_PLUGIN_ID = "hr.fer.rasip.remes.simulator";

	/** Classpath identifier */
	String SIMULATOR_CLASSPATH_CONTAINER_ID = "hr.fer.rasip.remes.simulator";

	/** Classpath identifier */
	String SIMULATOR_CLASSPATH_CONTAINER_PATH = "hr.fer.rasip.remes.simulator/LIBS";

	/** Source folder for the generated files */
	String GENERATED_SOURCE_FOLDER = "src-gen";
	
	/** Source folder for the generated files */
	String GENERATED_BINARY_FOLDER = "bin";

	/** Suffix for Simulator class names */
	String SIMULATOR_CLASS_SUFFIX = "Simulator";
}