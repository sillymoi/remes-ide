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
	
	private java.util.Set<hr.fer.rasip.remes.resource.remessrc.IRemessrcExpectedElement> followers = new java.util.LinkedHashSet<hr.fer.rasip.remes.resource.remessrc.IRemessrcExpectedElement>();
	
	public RemessrcAbstractExpectedElement() {
		super();
	}
	
	public void addFollower(hr.fer.rasip.remes.resource.remessrc.IRemessrcExpectedElement follower) {
		followers.add(follower);
	}
	
	public java.util.Collection<hr.fer.rasip.remes.resource.remessrc.IRemessrcExpectedElement> getFollowers() {
		return followers;
	}
	
}
