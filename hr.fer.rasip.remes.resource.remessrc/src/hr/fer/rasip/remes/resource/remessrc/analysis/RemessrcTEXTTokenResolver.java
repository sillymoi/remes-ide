/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package hr.fer.rasip.remes.resource.remessrc.analysis;

public class RemessrcTEXTTokenResolver implements hr.fer.rasip.remes.resource.remessrc.IRemessrcTokenResolver {
	
	private hr.fer.rasip.remes.resource.remessrc.analysis.RemessrcDefaultTokenResolver defaultTokenResolver = new hr.fer.rasip.remes.resource.remessrc.analysis.RemessrcDefaultTokenResolver();
	
	public java.lang.String deResolve(java.lang.Object value, org.eclipse.emf.ecore.EStructuralFeature feature, org.eclipse.emf.ecore.EObject container) {
		java.lang.String result = defaultTokenResolver.deResolve(value, feature, container);
		return result;
	}
	
	public void resolve(java.lang.String lexem, org.eclipse.emf.ecore.EStructuralFeature feature, hr.fer.rasip.remes.resource.remessrc.IRemessrcTokenResolveResult result) {
		defaultTokenResolver.resolve(lexem, feature, result);
	}
	
	public void setOptions(java.util.Map<?,?> options) {
		defaultTokenResolver.setOptions(options);
	}
	
}
