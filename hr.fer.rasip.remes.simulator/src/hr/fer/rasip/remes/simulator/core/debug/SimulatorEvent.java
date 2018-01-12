/**
 * 
 */
package hr.fer.rasip.remes.simulator.core.debug;

/**
 * @author Marin Orlic <marin.orlic@fer.hr>
 *
 */
public class SimulatorEvent implements ISimulatorEvent {

	/** Notifies of simulator startup. */
	protected static final String EVT_STARTED = "started";

	/** Notifies of simulator termination. */
	protected static final String EVT_TERMINATED = "terminated";
	
	/** Notifies that the simulator was suspended on client request. */
	protected static final String EVT_SUSPENDED_CLIENT = "suspended client";

	/** Notifies that the simulator was suspended on stepping. */
	protected static final String EVT_SUSPENDED_STEP = "suspended step";

	/** Notifies that the simulator was suspended on client request. */
	protected static final String EVT_RESUMED_CLIENT = "resumed client";

	/** Notifies that the simulator was suspended on client request. */
	protected static final String EVT_RESUMED_STEP = "resumed step";

	/** Notifies that the simulator was resumed for one step on client request. */
//	protected static final String EVT_STEP_CLIENT = "step client";
	
	/** Event message. */
	private String message = "";

	/** Simulator startup event. */
	public static final SimulatorEvent STARTED = new SimulatorEvent(EVT_STARTED);

	/** Simulator termination event. */
	public static final SimulatorEvent TERMINATED = new SimulatorEvent(EVT_TERMINATED);
	
	/** Simulator suspended event. */
	public static final SimulatorEvent SUSPENDED_CLIENT = new SimulatorEvent(EVT_SUSPENDED_CLIENT);

	/** Simulator suspended step event. */
	public static final SimulatorEvent SUSPENDED_STEP = new SimulatorEvent(EVT_SUSPENDED_STEP);

	/** Simulator resumed event. */
	public static final SimulatorEvent RESUMED_CLIENT = new SimulatorEvent(EVT_RESUMED_CLIENT);

	/** Simulator resumed step event. */
	public static final SimulatorEvent RESUMED_STEP = new SimulatorEvent(EVT_RESUMED_STEP);

	
	/** Simulator step event. */
//	public static final SimulatorEvent STEP_CLIENT = new SimulatorEvent(EVT_STEP_CLIENT);
	
	/** 
	 * Constructor - constants should be used instead of directly instancing this class.
	 * 
	 * @param message to send to the simulator
	 * @param response expected from the simulator
	 */
	private SimulatorEvent(String message) {
		this.message = message;
	}

	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}

}
