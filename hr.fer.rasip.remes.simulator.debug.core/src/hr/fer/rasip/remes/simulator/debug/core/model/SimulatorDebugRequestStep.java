/**
 * 
 */
package hr.fer.rasip.remes.simulator.debug.core.model;

/**
 * @author Marin Orlic <marin.orlic@fer.hr>
 *
 */
public class SimulatorDebugRequestStep extends SimulatorDebugRequest {

	protected SimulatorDebugRequestStep() {
		super(SimulatorDebugRequest.REQ_STEP, SimulatorDebugRequest.RESP_OK);
	}
	
}
