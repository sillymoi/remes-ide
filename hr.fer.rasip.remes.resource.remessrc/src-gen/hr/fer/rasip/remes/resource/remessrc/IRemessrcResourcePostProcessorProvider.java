/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package hr.fer.rasip.remes.resource.remessrc;

// Implementors of this interface can provide a post-processor
// for text resources.
public interface IRemessrcResourcePostProcessorProvider {
	
	// Returns the processor that shall be called after text
	// resource are successfully parsed.
	public hr.fer.rasip.remes.resource.remessrc.IRemessrcResourcePostProcessor getResourcePostProcessor();
}
