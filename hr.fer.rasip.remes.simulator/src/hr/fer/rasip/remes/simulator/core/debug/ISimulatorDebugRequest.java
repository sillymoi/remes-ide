/**
 * 
 */
package hr.fer.rasip.remes.simulator.core.debug;

/**
 * @author Marin Orlic <marin.orlic@fer.hr>
 *
 */
public interface ISimulatorDebugRequest {

	enum KIND {
		UNSPECIFIED,
		TERMINATE,
		THREADS, VARS, STACK, 
		SUSPEND, RESUME, STEP, 
	}
	
	String getResponse();
	String getRequestData();
	
	KIND getKind();
}
