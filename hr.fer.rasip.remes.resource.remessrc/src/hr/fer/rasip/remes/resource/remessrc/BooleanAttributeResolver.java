package hr.fer.rasip.remes.resource.remessrc;

public abstract class BooleanAttributeResolver implements hr.fer.rasip.remes.resource.remessrc.IRemessrcTokenResolver {

	public java.lang.String deResolve(java.lang.Object value, org.eclipse.emf.ecore.EStructuralFeature feature, org.eclipse.emf.ecore.EObject container) {
		if (Boolean.TRUE.equals(value)) {
			return getKeyword();
		} else {
			return "";
		}
	}
	
	public void resolve(java.lang.String lexem, org.eclipse.emf.ecore.EStructuralFeature feature, hr.fer.rasip.remes.resource.remessrc.IRemessrcTokenResolveResult result) {
		if (getKeyword().equals(lexem)) {
			result.setResolvedToken(Boolean.TRUE);
		} else {
			result.setResolvedToken(Boolean.FALSE);
		}
	}
	
	public void setOptions(java.util.Map<?,?> options) {
	}
	
	public abstract String getKeyword();
}
