/**
 * 
 */
package hr.fer.rasip.remes.datastore.framework.registry;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.Platform;

/**
 * The class retrieves the descriptions of models 
 * contributed to the framework via the respective extension point.
 * 
 * @author Marin Orlic <marin.orlic@fer.hr>
 */
public class ModelDescriptorReader {
	public static final String MODELS_EXTENSION_POINT = "hr.fer.rasip.remes.datastore.framework.models";
	
	public static final String MODEL_ELEM = "model";	
	public static final String ID_ATTR = "id";
	public static final String NSURI_ATTR = "nsURI";
	
	/**
	 * Gathers all extensions of the framework's extension point for
	 * adding new model descriptors and provides their list in the form of 
	 * model descriptors.
	 * 
	 * @return list of model descriptors, always non-null
	 */
	public static List<ModelDescriptor> read() {
		IExtensionRegistry registry = Platform.getExtensionRegistry();
		IConfigurationElement[] modelElements = registry.getConfigurationElementsFor(MODELS_EXTENSION_POINT);
		
		List<ModelDescriptor> descriptors = new ArrayList<ModelDescriptor>();
		for (IConfigurationElement elem : modelElements) {
			ModelDescriptor md = createModelDescriptor(elem); 
			if (md != null) {
				descriptors.add(md);
			}
		}
		
		return descriptors;
	}
	
	/**
	 * Creates a model descriptor for a given element of contribution mark-up.
	 * 
	 * @param el element describing a model
	 * @return model descriptor
	 */
	public static ModelDescriptor createModelDescriptor(IConfigurationElement el) {
		ModelDescriptor out = null;
		
		if (el != null && el.getName().equals(MODEL_ELEM)) {
			String id = el.getAttribute(ID_ATTR);
			String nsURI = el.getAttribute(NSURI_ATTR);
			
			out = new ModelDescriptor(id, nsURI);
		}
		
		return out;
	}
}
