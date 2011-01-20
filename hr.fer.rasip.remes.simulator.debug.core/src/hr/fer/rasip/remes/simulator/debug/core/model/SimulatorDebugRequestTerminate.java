/**
 * 
 */
package hr.fer.rasip.remes.simulator.debug.core.model;

/**
 * @author Marin Orlic <marin.orlic@fer.hr>
 *
 */
public class SimulatorDebugRequestTerminate extends SimulatorDebugRequest {

	protected SimulatorDebugRequestTerminate() {
		super(SimulatorDebugRequest.REQ_TERMINATE, SimulatorDebugRequest.RESP_OK);
	}

}
