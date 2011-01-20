/**
 * 
 */
package hr.fer.rasip.remes.simulator.debug.core.model;

/**
 * @author Marin Orlic <marin.orlic@fer.hr>
 *
 */
public class SimulatorDebugRequestResume extends SimulatorDebugRequest {

	protected SimulatorDebugRequestResume() {
		super(SimulatorDebugRequest.REQ_RESUME, SimulatorDebugRequest.RESP_OK);
	}
	
}
