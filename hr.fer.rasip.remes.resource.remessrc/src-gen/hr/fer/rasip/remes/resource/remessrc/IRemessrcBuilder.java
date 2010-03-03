/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package hr.fer.rasip.remes.resource.remessrc;

public interface IRemessrcBuilder {
	
	public boolean isBuildingNeeded(org.eclipse.emf.common.util.URI uri);
	
	public org.eclipse.core.runtime.IStatus build(hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcResource resource, org.eclipse.core.runtime.IProgressMonitor monitor);
}
