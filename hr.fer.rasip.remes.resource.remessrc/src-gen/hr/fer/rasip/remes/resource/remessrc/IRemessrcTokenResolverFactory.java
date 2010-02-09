/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package hr.fer.rasip.remes.resource.remessrc;

// A TokenResolverFactory creates TokenResolvers for a given token name.
// They may be implemented like a registry.
public interface IRemessrcTokenResolverFactory {
	
	// Creates a token resolver for normal tokens of type 'tokenName'.
	public hr.fer.rasip.remes.resource.remessrc.IRemessrcTokenResolver createTokenResolver(String tokenName);
	
	// Creates a token resolver for COLLECT-IN tokens that are stores in
	// feature 'featureName'.
	public hr.fer.rasip.remes.resource.remessrc.IRemessrcTokenResolver createCollectInTokenResolver(String featureName);
}
