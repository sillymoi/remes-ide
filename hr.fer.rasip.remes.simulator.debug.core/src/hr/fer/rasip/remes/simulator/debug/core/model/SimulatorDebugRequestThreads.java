/**
 * 
 */
package hr.fer.rasip.remes.simulator.debug.core.model;

/**
 * @author Marin Orlic <marin.orlic@fer.hr>
 *
 */
public class SimulatorDebugRequestThreads extends SimulatorDebugRequest {

	/** List of thread names */
	private String[] threads = null;

	/** 
	 * Constructor - constants should be used instead of directly instancing this class.
	 * 
	 * @param message to send to the simulator
	 * @param response expected from the simulator
	 */
	protected SimulatorDebugRequestThreads() {
		super(SimulatorDebugRequest.REQ_THREADS, null);
	}

	/**
	 * Parses the received response.
	 * @see hr.fer.rasip.remes.simulator.debug.core.model.SimulatorDebugRequest#isSuccessful(java.lang.String)
	 */
	@Override
	public boolean isSuccessful() {
		return (threads != null);
	}

	/**
	 * @return the threads
	 */
	public String[] getThreads() {
		return threads;
	}

	/* (non-Javadoc)
	 * @see hr.fer.rasip.remes.simulator.debug.core.model.SimulatorDebugRequest#parseResponse(java.lang.String)
	 */
	@Override
	public void parseResponse(String response) {
		if (response != null) {
			this.threads = response.split("#");
		}
	}	
	
}
