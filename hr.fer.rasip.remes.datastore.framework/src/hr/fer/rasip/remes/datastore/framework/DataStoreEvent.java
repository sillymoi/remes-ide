/**
 * 
 */
package hr.fer.rasip.remes.datastore.framework;

import java.util.EventObject;

/**
 * Event object for data store events. Contains info on event kind:
 *  UNSPECIFIED - event object is not initialized
 *  STARTED - DataStore was started
 *  STOPPED - DataStore was stopped
 *  
 * @author Marin Orlic <marin.orlic@fer.hr>
 */
public class DataStoreEvent extends EventObject {

	private static final long serialVersionUID = 4605833790231175902L;
	
	public static final int UNSPECIFIED = 0;
	public static final int STARTED = 1;
	public static final int STOPPED = 2;
	
	private int fKind = UNSPECIFIED;
	
	public DataStoreEvent(Object source) {
		this(source, UNSPECIFIED);
	}
	
	public DataStoreEvent(Object source, int kind) {
		super(source);
		if(kind != STARTED && kind != STOPPED) 
			throw new IllegalArgumentException("kind not one of the allowed constants, see DataStoreEvent.KIND");
		setKind(kind);
	}

	/**
	 * @return the fKind
	 */
	public int getKind() {
		return fKind;
	}

	/**
	 * @param kind the Kind to set
	 */
	public void setKind(int kind) {
		this.fKind = kind;
	}
	
	
}
