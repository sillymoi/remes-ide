/**
 * 
 */
package hr.fer.rasip.remes.simulator.core;

/**
 * @author Marin Orlic <marin.orlic@fer.hr>
 *
 */
public abstract class CompositeExitTransition extends Transition {

	/**
	 * Creates the Transition
	 * @param from mode 
	 * @param to mode
	 */
	public CompositeExitTransition(Mode from, CompositeMode to) {
		super(from, to);
	}

	/**
	 * Performs the composite mode exit transition.
	 * @see hr.fer.rasip.remes.simulator.core.Transition#performTransition(hr.fer.rasip.remes.simulator.core.SimulatorState)
	 */
	@Override
	public void performTransition(SimulatorState ss) throws SimulatorDeadlockException {
		super.performTransition(ss);
		
		// Replace entry edges with external edges
		CompositeMode cc = (CompositeMode) getConnectTo();
		ss.removeWaitingTransitions(cc);
		ss.addWaitingTransitions(cc.getExternalTransitions()); // Transitions will exit the mode 
	}
}
