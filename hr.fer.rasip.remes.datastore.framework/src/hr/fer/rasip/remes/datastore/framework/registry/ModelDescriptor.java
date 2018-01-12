/**
 * 
 */
package hr.fer.rasip.remes.datastore.framework.registry;

/**
 * Descriptor for model registration entries.
 * 
 * @author Marin Orlic <marin.orlic@fer.hr>
 */
public class ModelDescriptor {
	String id = null;
	String nsURI = null;
	
	/**
	 * Constructs a model descriptor.
	 * @param id
	 * @param nsURI
	 */
	public ModelDescriptor(String id, String nsURI) {
		this.id = id;
		this.nsURI = nsURI;
	}
	
	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}
	/**
	 * @return the nsURI
	 */
	public String getNsURI() {
		return nsURI;
	}
	/**
	 * @param nsURI the nsURI to set
	 */
	public void setNsURI(String nsURI) {
		this.nsURI = nsURI;
	}
	
	
}
