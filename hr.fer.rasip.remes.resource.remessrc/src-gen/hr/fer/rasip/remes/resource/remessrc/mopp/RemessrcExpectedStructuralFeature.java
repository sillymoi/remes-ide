/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package hr.fer.rasip.remes.resource.remessrc.mopp;

// A representation for a range in a document where a structural feature (e.g.,
// a reference) is expected.
public class RemessrcExpectedStructuralFeature extends hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcAbstractExpectedElement {
	private org.eclipse.emf.ecore.EStructuralFeature feature;
	private String tokenName;
	
	public RemessrcExpectedStructuralFeature(org.eclipse.emf.ecore.EClass ruleMetaclass, org.eclipse.emf.ecore.EStructuralFeature feature, String tokenName) {
		super(ruleMetaclass);
		this.feature = feature;
		this.tokenName = tokenName;
	}
	
	public org.eclipse.emf.ecore.EStructuralFeature getFeature() {
		return feature;
	}
	
	public String getTokenName() {
		return tokenName;
	}
	
	public java.lang.String toString() {
		return "EFeature " + feature.getEContainingClass().getName() + "." + feature.getName();
	}
	
	public boolean equals(java.lang.Object o) {
		if (o instanceof RemessrcExpectedStructuralFeature) {
			return this.feature.equals(((RemessrcExpectedStructuralFeature) o).feature);
		}
		return false;
	}
}
