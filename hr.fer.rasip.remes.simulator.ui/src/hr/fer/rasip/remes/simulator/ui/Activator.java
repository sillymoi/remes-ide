package hr.fer.rasip.remes.simulator.ui;

import hr.fer.rasip.remes.simulator.traces.provider.TracesItemProviderAdapterFactory;
import hr.fer.rasip.remes.simulator.ui.SimulatorUIImages;
import hr.fer.rasip.remes.simulator.ui.navigator.commands.DoubleClickListener;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.ReflectiveItemProviderAdapterFactory;
import org.eclipse.emf.edit.provider.resource.ResourceItemProviderAdapterFactory;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.ui.IViewPart;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.navigator.resources.ProjectExplorer;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

/**
 * The activator class controls the plug-in life cycle
 */
public class Activator extends AbstractUIPlugin {

	// The plug-in ID
	public static final String PLUGIN_ID = "hr.fer.rasip.remes.simulator.ui";

	// The shared instance
	private static Activator plugin;

	// Adapter factory for EMF items
	private ComposedAdapterFactory adapterFactory;
	
	/**
	 * The constructor
	 */
	public Activator() {
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;
		adapterFactory = createAdapterFactory();
		
		// Add double-click listener to open views on double click
//		IWorkbenchWindow window = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
//		IViewPart view = window.getActivePage().findView("org.eclipse.ui.navigator.ProjectExplorer");
//		if(view != null) {
//			((ProjectExplorer)(view)).getCommonViewer().addDoubleClickListener(new DoubleClickListener());
//		}
	}

	/**
	 * @generated
	 */
	public AdapterFactory getItemProvidersAdapterFactory() {
		return adapterFactory;
	}
	
	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext context) throws Exception {
		adapterFactory.dispose();
		adapterFactory = null;
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
	 * Creates the adapter factories for label providers.
	 * @return
	 */
	protected ComposedAdapterFactory createAdapterFactory() {
		List factories = new ArrayList();
		fillItemProviderFactories(factories);
		return new ComposedAdapterFactory(factories);
	}

	/**
	 * Creates a list of associated factories.
	 * @param factories
	 */
	protected void fillItemProviderFactories(List factories) {
		factories.add(new TracesItemProviderAdapterFactory());
		factories.add(new ResourceItemProviderAdapterFactory());
		factories.add(new ReflectiveItemProviderAdapterFactory());
	}

	
	/**
	 * Returns an image descriptor for the image file at the given
	 * plug-in relative path
	 *
	 * @param path the path
	 * @return the image descriptor
	 */
	public static ImageDescriptor getImageDescriptor(String path) {
		return imageDescriptorFromPlugin(PLUGIN_ID, path);
	}

	/**
	 * Initializes the image registry with plugin-defined images
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#initializeImageRegistry(org.eclipse.jface.resource.ImageRegistry)
	 */
	@Override
	protected void initializeImageRegistry(ImageRegistry reg) {
		reg.put(SimulatorUIImages.IMG_CHART_INTERVAL, getImageDescriptor("icons/chart-interval.gif"));
		reg.put(SimulatorUIImages.IMG_RENDER_DIFFERENCE, getImageDescriptor("icons/diff-renderer.gif"));
		reg.put(SimulatorUIImages.IMG_RENDER_BOX, getImageDescriptor("icons/box-renderer.gif"));
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
