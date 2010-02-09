/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package hr.fer.rasip.remes.resource.remessrc;

// A mapping from an identifier to an EObject.
//
// @param <ReferenceType> the type of the reference this mapping points to.
public interface IRemessrcElementMapping<ReferenceType> extends hr.fer.rasip.remes.resource.remessrc.IRemessrcReferenceMapping<ReferenceType> {
	
	// Returns the target object the identifier is mapped to.
	public ReferenceType getTargetElement();
}
