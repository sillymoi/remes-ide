/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package hr.fer.rasip.remes.resource.remessrc;

// Implementors of this interface can be configured by a
// map of options (or parameters).
public interface IRemessrcConfigurable {
	
	// Passed the options given by the map to the configurable
	// object.
	public void setOptions(java.util.Map<?,?> options);
}
