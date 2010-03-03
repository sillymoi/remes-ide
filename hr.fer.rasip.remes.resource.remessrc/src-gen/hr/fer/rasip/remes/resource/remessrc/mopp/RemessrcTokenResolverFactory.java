/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package hr.fer.rasip.remes.resource.remessrc.mopp;

public class RemessrcTokenResolverFactory implements hr.fer.rasip.remes.resource.remessrc.IRemessrcTokenResolverFactory {
	
	private java.util.Map<java.lang.String, hr.fer.rasip.remes.resource.remessrc.IRemessrcTokenResolver> tokenName2TokenResolver;
	private java.util.Map<java.lang.String, hr.fer.rasip.remes.resource.remessrc.IRemessrcTokenResolver> featureName2CollectInTokenResolver;
	private static hr.fer.rasip.remes.resource.remessrc.IRemessrcTokenResolver defaultResolver = new hr.fer.rasip.remes.resource.remessrc.analysis.RemessrcDefaultTokenResolver();
	
	public RemessrcTokenResolverFactory() {
		tokenName2TokenResolver = new java.util.HashMap<java.lang.String, hr.fer.rasip.remes.resource.remessrc.IRemessrcTokenResolver>();
		featureName2CollectInTokenResolver = new java.util.HashMap<java.lang.String, hr.fer.rasip.remes.resource.remessrc.IRemessrcTokenResolver>();
		registerTokenResolver("INTEGER", new hr.fer.rasip.remes.resource.remessrc.analysis.RemessrcINTEGERTokenResolver());
		registerTokenResolver("T_GLOBAL", new hr.fer.rasip.remes.resource.remessrc.analysis.RemessrcT_GLOBALTokenResolver());
		registerTokenResolver("T_READABLE", new hr.fer.rasip.remes.resource.remessrc.analysis.RemessrcT_READABLETokenResolver());
		registerTokenResolver("T_WRITEABLE", new hr.fer.rasip.remes.resource.remessrc.analysis.RemessrcT_WRITEABLETokenResolver());
		registerTokenResolver("T_URGENT", new hr.fer.rasip.remes.resource.remessrc.analysis.RemessrcT_URGENTTokenResolver());
		registerTokenResolver("TYPE", new hr.fer.rasip.remes.resource.remessrc.analysis.RemessrcTYPETokenResolver());
		registerTokenResolver("ID", new hr.fer.rasip.remes.resource.remessrc.analysis.RemessrcIDTokenResolver());
		registerTokenResolver("QUOTED_40_41", new hr.fer.rasip.remes.resource.remessrc.analysis.RemessrcQUOTED_40_41TokenResolver());
		registerTokenResolver("QUOTED_91_93", new hr.fer.rasip.remes.resource.remessrc.analysis.RemessrcQUOTED_91_93TokenResolver());
	}
	
	public hr.fer.rasip.remes.resource.remessrc.IRemessrcTokenResolver createTokenResolver(java.lang.String tokenName) {
		return internalCreateResolver(tokenName2TokenResolver, tokenName);
	}
	
	public hr.fer.rasip.remes.resource.remessrc.IRemessrcTokenResolver createCollectInTokenResolver(java.lang.String featureName) {
		return internalCreateResolver(featureName2CollectInTokenResolver, featureName);
	}
	
	protected boolean registerTokenResolver(java.lang.String tokenName, hr.fer.rasip.remes.resource.remessrc.IRemessrcTokenResolver resolver){
		return internalRegisterTokenResolver(tokenName2TokenResolver, tokenName, resolver);
	}
	
	protected boolean registerCollectInTokenResolver(java.lang.String featureName, hr.fer.rasip.remes.resource.remessrc.IRemessrcTokenResolver resolver){
		return internalRegisterTokenResolver(featureName2CollectInTokenResolver, featureName, resolver);
	}
	
	protected hr.fer.rasip.remes.resource.remessrc.IRemessrcTokenResolver deRegisterTokenResolver(java.lang.String tokenName){
		return tokenName2TokenResolver.remove(tokenName);
	}
	
	private hr.fer.rasip.remes.resource.remessrc.IRemessrcTokenResolver internalCreateResolver(java.util.Map<java.lang.String, hr.fer.rasip.remes.resource.remessrc.IRemessrcTokenResolver> resolverMap, String key) {
		if (resolverMap.containsKey(key)){
			return resolverMap.get(key);
		} else {
			return defaultResolver;
		}
	}
	
	private boolean internalRegisterTokenResolver(java.util.Map<java.lang.String, hr.fer.rasip.remes.resource.remessrc.IRemessrcTokenResolver> resolverMap, java.lang.String key, hr.fer.rasip.remes.resource.remessrc.IRemessrcTokenResolver resolver) {
		if (!resolverMap.containsKey(key)) {
			resolverMap.put(key,resolver);
			return true;
		}
		return false;
	}
	
}
