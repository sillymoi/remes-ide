/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package hr.fer.rasip.remes.resource.remessrc;

// This interface is extended by all other EMFText runtime
// API interfaces for generated components. It provides
// access to the plug-in meta information.
public interface IRemessrcTextResourcePluginPart {
	
	// Returns a meta information object for the language plug-in
	// that contains this part.
	public hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcMetaInformation getMetaInformation();
}
