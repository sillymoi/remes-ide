/**
 * 
 */
package hr.fer.rasip.remes.simulator.core;

/**
 * @author Marin Orlic <marin.orlic@fer.hr>
 *
 */
public class SimulatorDeadlockException extends Exception {

	/**
	 * Serialization support 
	 */
	private static final long serialVersionUID = 6957528211638853108L;
	
	/**
	 * Status information
	 */
	Transition attempt = null;
	Mode block = null;
	
	/**
	 * 
	 */
	public SimulatorDeadlockException() {
		super();
	}

	/**
	 * @param arg0
	 */
	public SimulatorDeadlockException(String arg0) {
		super(arg0);
	}

	/**
	 * @param arg0
	 */
	public SimulatorDeadlockException(Throwable arg0) {
		super(arg0);
	}

	/**
	 * @param arg0
	 * @param arg1
	 */
	public SimulatorDeadlockException(String arg0, Throwable arg1) {
		super(arg0, arg1);
	}

	/**
	 * @param t
	 * @param entering
	 */
	public SimulatorDeadlockException(Transition t, Mode m) {
		this.attempt = t;
		this.block = m;
	}

	/**
	 * @return the attempt
	 */
	public Transition getAttempt() {
		return attempt;
	}

	/**
	 * @return the block
	 */
	public Mode getBlock() {
		return block;
	}
}
