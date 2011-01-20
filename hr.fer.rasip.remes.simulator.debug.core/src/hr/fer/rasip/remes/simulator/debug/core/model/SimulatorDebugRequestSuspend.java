/**
 * 
 */
package hr.fer.rasip.remes.simulator.debug.core.model;

/**
 * @author Marin Orlic <marin.orlic@fer.hr>
 *
 */
public class SimulatorDebugRequestSuspend extends SimulatorDebugRequest {

	protected SimulatorDebugRequestSuspend() {
		super(SimulatorDebugRequest.REQ_SUSPEND, SimulatorDebugRequest.RESP_OK);
	}

}
