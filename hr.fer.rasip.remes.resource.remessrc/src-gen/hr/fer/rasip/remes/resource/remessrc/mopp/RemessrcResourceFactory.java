/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package hr.fer.rasip.remes.resource.remessrc.mopp;

public class RemessrcResourceFactory implements org.eclipse.emf.ecore.resource.Resource.Factory {
	
	public RemessrcResourceFactory() {
		super();
	}
	
	public org.eclipse.emf.ecore.resource.Resource createResource(org.eclipse.emf.common.util.URI uri) {
		return new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcResource(uri);
	}
}
