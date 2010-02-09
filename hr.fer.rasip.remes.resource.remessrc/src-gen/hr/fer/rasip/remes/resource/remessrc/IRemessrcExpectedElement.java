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
	public void addFollower(hr.fer.rasip.remes.resource.remessrc.IRemessrcExpectedElement follower);
	public java.util.Collection<hr.fer.rasip.remes.resource.remessrc.IRemessrcExpectedElement> getFollowers();
}
