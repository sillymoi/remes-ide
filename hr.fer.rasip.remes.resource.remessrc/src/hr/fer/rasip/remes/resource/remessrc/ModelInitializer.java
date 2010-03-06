/**
 * 
 */
package hr.fer.rasip.remes.resource.remessrc;

import hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcResource;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;

import se.mdh.progresside.remes.ConditionalConnector;
import se.mdh.progresside.remes.Mode;
import se.mdh.progresside.remes.CompositeMode;
import se.mdh.progresside.remes.RemesDiagram;
import se.mdh.progresside.remes.SubMode;
import se.mdh.progresside.remes.util.RemesDefaultElementFactory;

/**
 * @author Marin Orlic <marin.orlic@fer.hr>
 *
 */
public class ModelInitializer implements IRemessrcResourcePostProcessor,
		IRemessrcResourcePostProcessorProvider, IRemessrcOptionProvider {

	/**
	 * Configures the editor to use resource post-processor.
	 * @see hr.fer.rasip.remes.resource.remessrc.IRemessrcOptionProvider#getOptions()
	 */
	@Override
	public Map<?, ?> getOptions() {
		Map<String, Object> options = new HashMap<String, Object>();
		options.put(IRemessrcOptions.RESOURCE_POSTPROCESSOR_PROVIDER, new ModelInitializer());
		return options;
	}

	/**
	 * Initializes model internals. 
	 * @see hr.fer.rasip.remes.resource.remessrc.IRemessrcResourcePostProcessor#process(hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcResource)
	 */
	@Override
	public void process(RemessrcResource resource) {
		List<EObject> contents = resource.getContents();
		for (EObject next : contents) {
			RemesDefaultElementFactory factory = new RemesDefaultElementFactory();
			
			if(next instanceof RemesDiagram) {
				RemesDiagram diagram = (RemesDiagram) next;
				
				// Initialize all modes and conditional connectors
				for(Mode m : diagram.getModes()) {
					if(m instanceof CompositeMode) {
						CompositeMode composite = (CompositeMode) m;
						factory.initDefaultCompositeMode(composite);
						
						for(ConditionalConnector cc : composite.getConditionalConnectors()) { 
							factory.initDefaultConditionalConnector(cc);
						}
					} else if(m instanceof SubMode){ // Just in case further Mode types get added
						factory.initDefaultSubMode((SubMode) m);
					} else 
						throw new UnsupportedOperationException();
				}
			}
		}
	}

	/**
	 * Returns this class as the resource post-processor.
	 * @see hr.fer.rasip.remes.resource.remessrc.IRemessrcResourcePostProcessorProvider#getResourcePostProcessor()
	 */
	@Override
	public IRemessrcResourcePostProcessor getResourcePostProcessor() {
		return new ModelInitializer();
	}

}
