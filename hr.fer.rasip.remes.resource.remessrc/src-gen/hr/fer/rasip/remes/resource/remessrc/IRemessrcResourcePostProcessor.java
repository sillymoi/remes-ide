/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package hr.fer.rasip.remes.resource.remessrc;

// Implementors of this interface can be used to post-process
// parsed text resources. This can be useful to validate or
// modify the model that was instantiated for the text.
public interface IRemessrcResourcePostProcessor {
	
	// Processes the resource after it was parsed.
	//
	// @param resource the resource to validate of modify
	public void process(hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcResource resource);
}
