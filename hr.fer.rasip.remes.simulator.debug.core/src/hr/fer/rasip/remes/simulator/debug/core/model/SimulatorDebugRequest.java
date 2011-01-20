/**
 * 
 */
package hr.fer.rasip.remes.simulator.debug.core.model;

/**
 * @author Marin Orlic <marin.orlic@fer.hr>
 *
 */
public class SimulatorDebugRequest {
	
	/** Signals the simulator to terminate. */
	protected static final String REQ_TERMINATE = "terminate";

	/** Signals the simulator to send thread list. */
	protected static final String REQ_THREADS = "threads";
	
	/** Signals the simulator to suspend execution. */
	protected static final String REQ_SUSPEND = "suspend";

	/** Signals the simulator to perform a single step in execution. */
	protected static final String REQ_STEP = "step";

	/** Signals the simulator to resume execution. */
	protected static final String REQ_RESUME = "resume";

	/** Signals the simulator to retrieve a list of variable for the stack frame. */
	protected static final String REQ_VARS = "vars";
	
	/** Signals the simulator to retrieve a list of stack frames for the current thread. */
	protected static final String REQ_STACK = "stack";
	
	/** Success response. */
	protected static final String RESP_OK = "ok";

	
	/** Request message. */
	private String message = "";
	
	/** Expected response. */
	private String response = "";

	/** Flag marking the request as successful. */
	private boolean success;
		
	/** 
	 * Constructor - inheriting classes should be used instead of directly instancing this class.
	 * 
	 * @param message to send to the simulator
	 * @param response expected from the simulator
	 */
	protected SimulatorDebugRequest(String message, String response) {
		this.message = message;
		this.response = response;
	}

	/**
	 * Message to be sent to the simulator.
	 * @return the message
	 */
	public String getMessage() {
		return this.message;
	}
	
	/**
	 * Checks if the received response is expected.
	 * @return true if the received response was ok
	 */
	public boolean isSuccessful() {
		return this.success;
	}

	/**
	 * Parses the received response.
	 * @param resp
	 */
	public void parseResponse(String response) {
		this.success = response.startsWith(this.response);
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "[message=" + message + ", expected response=" + response + "]";
	}
}
