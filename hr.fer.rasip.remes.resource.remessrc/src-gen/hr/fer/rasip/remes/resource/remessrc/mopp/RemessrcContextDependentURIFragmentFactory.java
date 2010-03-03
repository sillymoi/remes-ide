/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package hr.fer.rasip.remes.resource.remessrc.mopp;

// A factory for ContextDependentURIFragments. Given a feasible reference resolver,
// the factory returns a matching fragment that used the resolver to resolver proxy
// objects.
//
// @param <ContainerType> the type of the class containing the reference to be resolved
// @param <ReferenceType> the type of the reference to be resolved
//
public class RemessrcContextDependentURIFragmentFactory<ContainerType extends org.eclipse.emf.ecore.EObject, ReferenceType extends org.eclipse.emf.ecore.EObject>  implements hr.fer.rasip.remes.resource.remessrc.IRemessrcContextDependentURIFragmentFactory<ContainerType, ReferenceType> {
	
	private final hr.fer.rasip.remes.resource.remessrc.IRemessrcReferenceResolver<ContainerType, ReferenceType> resolver;
	
	public RemessrcContextDependentURIFragmentFactory(hr.fer.rasip.remes.resource.remessrc.IRemessrcReferenceResolver<ContainerType, ReferenceType> resolver) {
		this.resolver = resolver;
	}
	
	public hr.fer.rasip.remes.resource.remessrc.IRemessrcContextDependentURIFragment<?> create(String identifier, ContainerType container, org.eclipse.emf.ecore.EReference reference, int positionInReference, org.eclipse.emf.ecore.EObject proxy) {
		
		return new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcContextDependentURIFragment<ContainerType, ReferenceType>(identifier, container, reference, positionInReference, proxy) {
			public hr.fer.rasip.remes.resource.remessrc.IRemessrcReferenceResolver<ContainerType, ReferenceType> getResolver() {
				return resolver;
			}
		};
	}
}
