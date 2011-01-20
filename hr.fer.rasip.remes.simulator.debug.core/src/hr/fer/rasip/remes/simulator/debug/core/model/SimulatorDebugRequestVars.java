/**
 * 
 */
package hr.fer.rasip.remes.simulator.debug.core.model;

/**
 * @author Marin Orlic <marin.orlic@fer.hr>
 *
 */
public class SimulatorDebugRequestVars extends SimulatorDebugRequest {

	/** List of variable signatures */
	private String[] vars = null;

	/** 
	 * Constructor - constants should be used instead of directly instancing this class.
	 * 
	 * @param message to send to the simulator
	 * @param response expected from the simulator
	 */
	protected SimulatorDebugRequestVars(String frameName) {
		super(SimulatorDebugRequest.REQ_VARS + " " + frameName, null);
	}

	/**
	 * Parses the received response.
	 * @see hr.fer.rasip.remes.simulator.debug.core.model.SimulatorDebugRequest#isSuccessful(java.lang.String)
	 */
	@Override
	public boolean isSuccessful() {
		return (vars != null);
	}

	/**
	 * @return the vars
	 */
	public String[] getVars() {
		return vars;
	}

	/* (non-Javadoc)
	 * @see hr.fer.rasip.remes.simulator.debug.core.model.SimulatorDebugRequest#parseResponse(java.lang.String)
	 */
	@Override
	public void parseResponse(String response) {
		if (response != null && !response.isEmpty()) {
			this.vars = response.split("#");
		}
	}	
	
}
