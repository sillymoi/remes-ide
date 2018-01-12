package hr.fer.rasip.remes.datastore.framework.registry;


import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtension;
import org.eclipse.core.runtime.IExtensionPoint;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.IRegistryEventListener;
import org.eclipse.core.runtime.Platform;

/**
 * Registry backing up extension point for model registration.
 * 
 * @author Marin Orlic <marin.orlic@fer.hr>
 */
public class ModelsRegistry implements IRegistryEventListener {

	/**
	 * The only instance.
	 */
	private static final ModelsRegistry INSTANCE = new ModelsRegistry();

	/**
	 * Provides the only ModelsRegistry instance.
	 */
	public static ModelsRegistry getInstance() {
		return INSTANCE;
	}

	/**
	 * Starts initializes the registry
	 */
	public static void startRegistry() {
		getInstance().addExtPointListener();
		for (ModelDescriptor model : ModelDescriptorReader.read()) {
			getInstance().registerModel(model);
		}
	}

	/**
	 * Adds the extensions point listener
	 */
	private void addExtPointListener() {
		IExtensionRegistry registry = Platform.getExtensionRegistry();
		registry.addListener(this, ModelDescriptorReader.MODELS_EXTENSION_POINT);
	}

	/**
	 * Remove the extensions point listener
	 */
	private void removeExtPointListener() {
		IExtensionRegistry registry = Platform.getExtensionRegistry();
		registry.removeListener(this);
	}

	/**
	 * Stops the registry
	 */
	public static void stopRegistry() {
		getInstance().removeExtPointListener();
		getInstance().clear();
	}

	private Map<String, ModelDescriptor> _registryMap = new HashMap<String, ModelDescriptor>();

	/**
	 * Creates the registry.
	 */
	private ModelsRegistry() {
	}

	private void clear() {
		_registryMap.clear();
	}

	void registerModel(ModelDescriptor model) {
		_registryMap.put(model.getId(), model);
	}

	void unregisterModel(ModelDescriptor model) {
		_registryMap.remove(model.getId());
	}

	public ModelDescriptor[] getModelDescriptors() {
		Collection<ModelDescriptor> coll = _registryMap.values();
		return coll.toArray(new ModelDescriptor[coll.size()]);
	}

	public ModelDescriptor getModel(String modelId) {
		return _registryMap.get(modelId);
	}

	@Override
	public void added(IExtension[] extensions) {
		for (IExtension extension : extensions) {
			for (IConfigurationElement configElt : extension.getConfigurationElements()) {
				ModelDescriptor model = ModelDescriptorReader.createModelDescriptor(configElt);
				if (model != null)
					getInstance().registerModel(model);
			}
		}
	}

	@Override
	public void added(IExtensionPoint[] extensionPoints) {
		// do nothing
	}

	@Override
	public void removed(IExtension[] extensions) {
		for (IExtension extension : extensions) {
			for (IConfigurationElement configElt : extension.getConfigurationElements()) {
				ModelDescriptor model = ModelDescriptorReader.createModelDescriptor(configElt);
				if (model != null)
					getInstance().unregisterModel(model);
			}
		}
	}

	@Override
	public void removed(IExtensionPoint[] extensionPoints) {
		// do nothing
	}
}
