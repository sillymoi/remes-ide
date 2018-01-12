package hr.fer.rasip.remes.launcher.component.ui;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

/**
 * The activator class controls the plug-in life cycle
 */
public class Activator extends AbstractUIPlugin {

	/**
	 * The plug-in ID.
	 */
	public static final String PLUGIN_ID = "hr.fer.rasip.remes.launcher.component.ui";

	/**
	 * The shared instance.
	 */
	private static Activator plugin;
	
	/**
	 * Gets the image at the given plug-in relative path.
	 */
	private static Map<String, Image> path2image = new HashMap<String, Image>();
	
	/**
	 * The constructor
	 */
	public Activator() {
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext context) throws Exception {
		plugin = null;
		super.stop(context);
	}

	/**
	 * Looks for an image in the icons folder.
	 * 
	 * @param path
	 *            the image path
	 * @return the searched Image
	 */
	public static Image getImage(String path) {
		Image result = path2image.get(path);
		if (result == null && !path2image.containsKey(path)) {
			ImageDescriptor descriptor = getImageDescriptor(path);
			if (descriptor != null) {
				result = descriptor.createImage();
				path2image.put(path, result);
			}
		}
		if (result != null) {
			if (result.isDisposed()) {
				result = null;
			}
		}
		return result;
	}

	/**
	 * Returns the image descriptor with the given relative path.
	 * 
	 * @param name
	 *            the image name
	 * @return the image descriptor
	 */
	public static ImageDescriptor getImageDescriptor(String name) {
		String pluginDir = plugin.getBundle().getEntry("/").toString(); //$NON-NLS-1$
		String iconPath = "icons/"; //$NON-NLS-1$
		try {
			return ImageDescriptor.createFromURL(new URL(pluginDir + iconPath + name));
		} catch (MalformedURLException mfe) {
			return ImageDescriptor.getMissingImageDescriptor();
		}
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
	 * Creates a log entry with this plugin's ID, a given log level (from IStatus) and a message.
	 * 
	 * @see IStatus
	 * @see IStatus#getSeverity()
	 * @see Status#Status(int, String, String)
	 * 
	 * @param level 
	 * @param message
	 */
	public static void log(int level, String message) {
		Activator.getDefault().getLog().log(new Status(level, Activator.PLUGIN_ID, message)); 
	}

	/**
	 * Creates a log entry with this plugin's ID, a given log level (from IStatus) and a message.
	 * 
	 * @see IStatus
	 * @see IStatus#getSeverity()
	 * @see Status#Status(int, String, String, Throwable)
	 * 
	 * @param level 
	 * @param message
	 * @param t
	 */
	public static void log(int level, String message, Throwable t) {
		Activator.getDefault().getLog().log(new Status(level, Activator.PLUGIN_ID, message, t)); 
	}

}
