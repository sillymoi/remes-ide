/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package hr.fer.rasip.remes.resource.remessrc.mopp;

// Abstract super class for all expected elements. Provides methods to
// add followers
public abstract class RemessrcAbstractExpectedElement implements hr.fer.rasip.remes.resource.remessrc.IRemessrcExpectedElement {
	
	private org.eclipse.emf.ecore.EClass ruleMetaclass;
	private java.util.Set<hr.fer.rasip.remes.resource.remessrc.util.RemessrcPair<hr.fer.rasip.remes.resource.remessrc.IRemessrcExpectedElement, org.eclipse.emf.ecore.EStructuralFeature[]>> followers = new java.util.LinkedHashSet<hr.fer.rasip.remes.resource.remessrc.util.RemessrcPair<hr.fer.rasip.remes.resource.remessrc.IRemessrcExpectedElement, org.eclipse.emf.ecore.EStructuralFeature[]>>();
	
	public RemessrcAbstractExpectedElement(org.eclipse.emf.ecore.EClass ruleMetaclass) {
		super();
		this.ruleMetaclass = ruleMetaclass;
	}
	
	public org.eclipse.emf.ecore.EClass getRuleMetaclass() {
		return ruleMetaclass;
	}
	
	public void addFollower(hr.fer.rasip.remes.resource.remessrc.IRemessrcExpectedElement follower, org.eclipse.emf.ecore.EStructuralFeature[] path) {
		followers.add(new hr.fer.rasip.remes.resource.remessrc.util.RemessrcPair<hr.fer.rasip.remes.resource.remessrc.IRemessrcExpectedElement, org.eclipse.emf.ecore.EStructuralFeature[]>(follower, path));
	}
	
	public java.util.Collection<hr.fer.rasip.remes.resource.remessrc.util.RemessrcPair<hr.fer.rasip.remes.resource.remessrc.IRemessrcExpectedElement, org.eclipse.emf.ecore.EStructuralFeature[]>> getFollowers() {
		return followers;
	}
	
}
