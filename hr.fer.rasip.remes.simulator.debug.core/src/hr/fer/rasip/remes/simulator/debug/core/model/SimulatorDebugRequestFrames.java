/**
 * 
 */
package hr.fer.rasip.remes.simulator.debug.core.model;

/**
 * @author Marin Orlic <marin.orlic@fer.hr>
 *
 */
public class SimulatorDebugRequestFrames extends SimulatorDebugRequest {

	/** List of frame names */
	private String[] frames = null;

	/** 
	 * Constructor - constants should be used instead of directly instancing this class.
	 * 
	 * @param message to send to the simulator
	 * @param response expected from the simulator
	 */
	protected SimulatorDebugRequestFrames(String threadName) {
		super(SimulatorDebugRequest.REQ_STACK + " " + threadName, null);
	}

	/**
	 * Parses the received response.
	 * @see hr.fer.rasip.remes.simulator.debug.core.model.SimulatorDebugRequest#isSuccessful(java.lang.String)
	 */
	@Override
	public boolean isSuccessful() {
		return (frames != null);
	}

	/**
	 * @return the frames
	 */
	public String[] getFrames() {
		return frames;
	}

	/* (non-Javadoc)
	 * @see hr.fer.rasip.remes.simulator.debug.core.model.SimulatorDebugRequest#parseResponse(java.lang.String)
	 */
	@Override
	public void parseResponse(String response) {
		if (response != null) {
			this.frames = response.split("#");
		}
	}	
	
}
