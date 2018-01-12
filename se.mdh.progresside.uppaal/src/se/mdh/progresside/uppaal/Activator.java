package se.mdh.progresside.uppaal;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.util.IPropertyChangeListener;
import org.eclipse.jface.util.PropertyChangeEvent;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.console.ConsolePlugin;
import org.eclipse.ui.console.IConsole;
import org.eclipse.ui.console.IConsoleConstants;
import org.eclipse.ui.console.IConsoleManager;
import org.eclipse.ui.console.IConsoleView;
import org.eclipse.ui.console.MessageConsole;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

import se.mdh.progresside.uppaal.preferences.PreferenceConstants;

import com.uppaal.engine.Engine;
import com.uppaal.engine.EngineStub;

/**
 * The activator class controls the plug-in life cycle
 */
public class Activator extends AbstractUIPlugin {

	private static final String UPPAAL_CONSOLE_NAME = "Uppaal Console";

	public static final String UPPAAL_ICON_KEY = "UPPAAL_ICON";
	public static final String RUN_ICON_KEY = "RUN_ICON";
	
	// The plug-in ID
	public static final String PLUGIN_ID = "se.mdh.progresside.uppaal";

	// The shared instance
	private static Activator plugin;

	private Engine engine;

	private IPropertyChangeListener engineUpdater = new IPropertyChangeListener() {

		@Override
		public void propertyChange(PropertyChangeEvent event) {
			String property = event.getProperty();
			if (PreferenceConstants.UPPAAL_PATH.equals(property)) {
				// restart engine
				stopEngine();
				startEngine();
			}

		}
	};

	/**
	 * The constructor
	 */
	public Activator() {
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.core.runtime.Plugins#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;

		getImageRegistry().put(
				UPPAAL_ICON_KEY,
				ImageDescriptor.createFromURL(getBundle().getResource(
						"icons/icon.gif")));

		getImageRegistry().put(
				RUN_ICON_KEY,
				ImageDescriptor.createFromURL(getBundle().getResource(
						"icons/run.gif")));

		getPreferenceStore().addPropertyChangeListener(engineUpdater);
		startEngine();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.core.runtime.Plugin#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext context) throws Exception {
		plugin = null;
		stopEngine();

		getImageRegistry().remove(UPPAAL_ICON_KEY);

		getPreferenceStore().removePropertyChangeListener(engineUpdater);
		super.stop(context);
	}

	private void stopEngine() {
		if (engine != null) {
			engine.cancel();
		}
	}

	private void startEngine() {
		IPreferenceStore preferenceStore = getPreferenceStore();
		String path = preferenceStore
				.getString(PreferenceConstants.UPPAAL_PATH);
		if (path == null || path.isEmpty()) {
			engine = null;
		} else {
			engine = new Engine(EngineStub.LOCAL, 0, "localhost", path);
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

	public void logError(String message, Throwable ex) {
		getLog().log(new Status(IStatus.ERROR, PLUGIN_ID, message, ex));
	}

	public void logInfo(String message) {
		getLog().log(new Status(IStatus.INFO, PLUGIN_ID, message));
	}

	public IStatus createErrorStatus(String message, Throwable t) {
		return new Status(IStatus.ERROR, PLUGIN_ID, message, t);
	}

	public IStatus createOkStatus(String message) {
		return new Status(IStatus.OK, PLUGIN_ID, message);
	}

	public Engine getConfiguredEngine() {
		return engine;
	}

	public MessageConsole getUppaalConsole() {
		ConsolePlugin plugin = ConsolePlugin.getDefault();
		IConsoleManager conMan = plugin.getConsoleManager();
		IConsole[] existing = conMan.getConsoles();
		for (int i = 0; i < existing.length; i++)
			if (UPPAAL_CONSOLE_NAME.equals(existing[i].getName()))
				return (MessageConsole) existing[i];

		// no console found, so create a new one
		MessageConsole myConsole = new MessageConsole(UPPAAL_CONSOLE_NAME,
				getImageRegistry().getDescriptor(UPPAAL_ICON_KEY));
		
		conMan.addConsoles(new IConsole[] { myConsole });
		return myConsole;
	}

	public MessageConsole revealUppaalConsole() {

		MessageConsole uppaalConsole = getUppaalConsole();

		IWorkbench workbench = PlatformUI.getWorkbench();
		IWorkbenchWindow activeWorkbenchWindow = workbench
				.getActiveWorkbenchWindow();

		IWorkbenchPage page = activeWorkbenchWindow.getActivePage();
		String id = IConsoleConstants.ID_CONSOLE_VIEW;
		try {
			IConsoleView view = (IConsoleView) page.showView(id);
			view.display(uppaalConsole);

		} catch (PartInitException e) {
			logError("Failed to show Uppaal Console", e);
		}

		return uppaalConsole;
	}

}
