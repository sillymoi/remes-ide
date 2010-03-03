/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package hr.fer.rasip.remes.resource.remessrc;

// An element that is expected at a given position in a resource
// stream.
public interface IRemessrcExpectedElement {
	
	public java.lang.String getTokenName();
	public org.eclipse.emf.ecore.EClass getRuleMetaclass();
	public void addFollower(hr.fer.rasip.remes.resource.remessrc.IRemessrcExpectedElement follower, org.eclipse.emf.ecore.EStructuralFeature[] path);
	public java.util.Collection<hr.fer.rasip.remes.resource.remessrc.util.RemessrcPair<hr.fer.rasip.remes.resource.remessrc.IRemessrcExpectedElement, org.eclipse.emf.ecore.EStructuralFeature[]>> getFollowers();
}
