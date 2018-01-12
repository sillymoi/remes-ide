/**
 * 
 */
package hr.fer.rasip.remes.simulator.core;

import hr.fer.rasip.remes.simulator.core.datatypes.BooleanType;
import hr.fer.rasip.remes.simulator.core.datatypes.Type;

/**
 * @author Marin Orlic <marin.orlic@fer.hr>
 *
 */
public abstract class Transition implements TraceElement
{
	/**
	 * Transitions end-point.
	 */
	private Mode connectFrom = null;
	private Mode connectTo = null;
	
	/**
	 * Creates the Transition
	 * @param from mode 
	 * @param to mode
	 * @param isInit marks the transition to act as init edge
	 */
	public Transition(Mode from, Mode to) {
		this.connectFrom = from;
		this.connectTo = to;
	}
	
	/**
	 * @return the connectFrom
	 */
	public Mode getConnectFrom() {
		return connectFrom;
	}

	/**
	 * @return the connectTo
	 */
	public Mode getConnectTo() {
		return connectTo;
	}
	
	/**
	 * @return the initTransition
	 */
	public boolean isInitTransition() {
		return false;
	}

	/**
	 * Evaluates the transition's guard expression.
	 * Default implementation returns BooleanType(true).
	 * 
	 * @return Type - BooleanType(true)
	 */
	public Type evaluateGuard() {
		return new BooleanType(true);
	}
	
	/**
	 * Performs the action defined for the transition.
	 * Default implementation does nothing.
	 */
	public void performAction() {
		return;
	}

	/**
	 * Performs the transition (mode switching) in the simulator.
	 * @param ss State of the Simulator
	 * @throws SimulatorDeadlockException
	 */
	public void performTransition(SimulatorState ss) throws SimulatorDeadlockException {
		assert(ss != null);
		
		Mode leaving = getConnectFrom();
		Mode entering = getConnectTo();
		
		// Leave mode
		ss.removeActiveMode(leaving);
		ss.removeWaitingTransitions(leaving);
		ss.removeActiveTransition(this);
		leaving.onExitMode();
		leaving.performRenamings();
		
		// Do the action bit
		performAction();
		
		// Enter mode - housekeeping
		ss.addActiveMode(entering);
		
		// Add its transitions to waiting
		ss.addWaitingTransitions(entering.getTransitions());
	
		// Enter mode
		entering.onEnterMode();
	}
	
	/**
	 * Mark this as NOT Mode in Simulator trace.
	 */
	@Override
	public boolean isMode() {
		return false;
	}

	/**
	 * Mark this as transition in Simulator trace.
	 */
	@Override
	public boolean isTransition() {
		return true;
	}

	/**
	 * If set, this transition will be treated as high-priority system transition, an executed immediately.
	 * @return
	 */
	public boolean isSystemTransition() {
		return false;
	}
	
	/**
	 * Returns the source file associated with the source mode.
	 * 
	 * @return
	 */
	@Override
	public String getSourceName() {
		return getConnectFrom().getSourceName();
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Transition [" + connectFrom.getName() 
				+ ", " + connectTo.getName() + "]";
	}
}
