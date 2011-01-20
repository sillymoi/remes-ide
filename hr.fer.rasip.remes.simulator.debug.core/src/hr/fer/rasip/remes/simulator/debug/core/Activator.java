package hr.fer.rasip.remes.simulator.debug.core;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Plugin;
import org.eclipse.core.runtime.Status;
import org.osgi.framework.BundleContext;

/**
 * The activator class controls the plug-in life cycle
 */
public class Activator extends Plugin {

	// The plug-in ID
	public static final String PLUGIN_ID = "hr.fer.rasip.remes.simulator.debug.core";

	public static final String ID_SIMULATOR_DEBUG_MODEL = PLUGIN_ID + ".model";
	
	// The shared instance
	private static Activator plugin;
	
	/**
	 * The constructor
	 */
	public Activator() {
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.core.runtime.Plugins#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.core.runtime.Plugin#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext context) throws Exception {
		plugin = null;
		super.stop(context);
	}

	/**
	 * Returns the shared instance
	 *
	 * @return the shared instance
	 */
	public static Activator getDefault() {
		return plugin;
	}

	/**
	 * @param level 
	 * @param message
	 */
	public static void log(int level, String message) {
		Activator.getDefault().getLog().log(new Status(level, Activator.PLUGIN_ID, message)); 
	}

	/**
	 * @param level 
	 * @param message
	 * @param t
	 */
	public static void log(int level, String message, Throwable t) {
		Activator.getDefault().getLog().log(new Status(level, Activator.PLUGIN_ID, message, t)); 
	}
	
	/**
	 * @param level 
	 * @param message
	 */
	public static void log(IStatus status) {
		Activator.getDefault().getLog().log(status); 
	}
	
}
