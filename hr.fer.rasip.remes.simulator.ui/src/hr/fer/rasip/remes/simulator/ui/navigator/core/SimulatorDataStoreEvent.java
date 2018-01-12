/**
 * 
 */
package hr.fer.rasip.remes.simulator.ui.navigator.core;

import java.util.EventObject;

/**
 * @author Marin
 *
 */
public class SimulatorDataStoreEvent extends EventObject {
	
	private static final long serialVersionUID = -6230714703131203299L;

	public static final int UNSPECIFIED = 0;
	public static final int STARTED = 1;
	public static final int STOPPED = 2;
	
	private int fKind = UNSPECIFIED;
	
	public SimulatorDataStoreEvent(Object source) {
		this(source, UNSPECIFIED);
	}
	
	public SimulatorDataStoreEvent(Object source, int kind) {
		super(source);
		if(kind != STARTED && kind != STOPPED) 
			throw new IllegalArgumentException("kind not one of the allowed constants, see SimulatorDataStoreEvent.KIND");
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
