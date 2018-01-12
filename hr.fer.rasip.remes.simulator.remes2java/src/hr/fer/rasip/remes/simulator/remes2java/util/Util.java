/**
 * 
 */
package hr.fer.rasip.remes.simulator.remes2java.util;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.XMIResource;

/**
 * @author Marin Orlic <marin.orlic@fer.hr>
 *
 */
public class Util {
	public static String getXmiId(EObject obj) {
		String id = "_UNKNOWN";
		Resource res = obj.eResource();
		
		if(res instanceof XMIResource) {
			XMIResource xmi = (XMIResource) res;
			
			id = xmi.getID(obj);
		}
		
		return id;
	}
	
	public static String getSourceName(EObject obj) {
		String id = "_UNKNOWN";
		Resource res = obj.eResource();
		URI uri = res.getURI();
		
		if(uri.isFile()) {
			id = uri.toFileString();
		} else if(!uri.hasFragment() && !uri.hasQuery()){
			id = uri.lastSegment(); // Wild guess
		}
		
		return id;
	}
}
