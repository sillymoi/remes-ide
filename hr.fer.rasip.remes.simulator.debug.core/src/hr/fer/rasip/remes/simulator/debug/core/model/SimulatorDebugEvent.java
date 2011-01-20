/**
 * 
 */
package hr.fer.rasip.remes.simulator.debug.core.model;

import java.util.EventObject;

/**
 * @author Marin Orlic <marin.orlic@fer.hr>
 *
 */
public class SimulatorDebugEvent extends EventObject {

	/**
	 * Serialization support
	 */
	private static final long serialVersionUID = 855975776726705639L;

	public static final int UNSPECIFIED = 0;
	public static final int STARTED = 1;
	public static final int TERMINATED = 2;
	public static final int SUSPENDED = 3;
	public static final int RESUMED = 4;

	public static final int EVT_FIRST = STARTED;
	public static final int EVT_LAST = RESUMED;

	public static final int DETAIL_CLIENT = 1;
	public static final int DETAIL_STEP = 2;
	
	// Events
	private static final String MSG_STARTED = "started";
	private static final String MSG_TERMINATED = "terminated";
	private static final String MSG_SUSPENDED = "suspended";
	private static final String MSG_RESUMED = "resumed";
	
	// Details
	private static final String MSG_STEP = "step";
	private static final String MSG_CLIENT = "client";
	
	private int kind = UNSPECIFIED;
	private int detail = UNSPECIFIED;
	
	public SimulatorDebugEvent(Object source) {
		this(source, UNSPECIFIED);
	}
	
	public SimulatorDebugEvent(Object source, int kind) {
		super(source);
		if(kind < EVT_FIRST || kind > EVT_LAST) 
			throw new IllegalArgumentException("kind not one of the allowed constants, see SimulatorDebugEvent");
		setKind(kind);
	}

	public SimulatorDebugEvent(Object source, int kind, int detail) {
		this(source, kind);
		setDetail(detail);
	}

	/**
	 * @return the kind
	 */
	public int getKind() {
		return kind;
	}

	/**
	 * @param kind the kind to set
	 */
	public void setKind(int kind) {
		this.kind = kind;
	}

	/**
	 * @return the detail
	 */
	public int getDetail() {
		return detail;
	}

	/**
	 * @param detail the detail to set
	 */
	public void setDetail(int detail) {
		this.detail = detail;
	}

	/**
	 * Parses the event string received from the simulator and creates a corresponding event.
	 * @param source event source
	 * @param message event message
	 * @return initialized event object
	 */
	protected static SimulatorDebugEvent createEvent(Object source, String message) {
		int kind = UNSPECIFIED;
		int detail = UNSPECIFIED;
		if(message.startsWith(MSG_STARTED)) {
			kind = STARTED;
		} else if(message.startsWith(MSG_TERMINATED)) {
			kind = TERMINATED;
		} else if(message.startsWith(MSG_SUSPENDED)) {
			kind = SUSPENDED;
			if(message.endsWith(MSG_STEP)) {
				detail = DETAIL_STEP;
			} else if(message.endsWith(MSG_CLIENT)) {
				detail = DETAIL_CLIENT;
			}
		} else if(message.startsWith(MSG_RESUMED)) {
			kind = RESUMED;
			if(message.endsWith(MSG_STEP)) {
				detail = DETAIL_STEP;
			} else if(message.endsWith(MSG_CLIENT)) {
				detail = DETAIL_CLIENT;
			}
		}
		
		return new SimulatorDebugEvent(source, kind, detail);	
	}

}
