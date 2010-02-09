/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package hr.fer.rasip.remes.resource.remessrc.util;

// Class TextResourceUtil can be used to perform common tasks on text resources,
// such as loading and saving resources, as well as, checking them for errors.
public class RemessrcTextResourceUtil {
	
	public static hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcResource getResource(org.eclipse.core.resources.IFile file) {
		org.eclipse.emf.ecore.resource.ResourceSet rs = new org.eclipse.emf.ecore.resource.impl.ResourceSetImpl();
		org.eclipse.emf.ecore.resource.Resource csResource = rs.getResource(org.eclipse.emf.common.util.URI.createPlatformResourceURI(file.getFullPath().toString(),true), true);
		return (hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcResource) csResource;
	}
	
	public static hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcResource getResource(java.io.File file) {
		return getResource(file, null);
	}
	
	public static hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcResource getResource(java.io.File file, java.util.Map<?,?> options) {
		org.eclipse.emf.ecore.resource.ResourceSet rs = new org.eclipse.emf.ecore.resource.impl.ResourceSetImpl();
		if (options != null) {
			rs.getLoadOptions().putAll(options);
		}
		org.eclipse.emf.ecore.resource.Resource csResource = rs.getResource(org.eclipse.emf.common.util.URI.createFileURI(file.getAbsolutePath()), true);
		return (hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcResource) csResource;
	}
}
