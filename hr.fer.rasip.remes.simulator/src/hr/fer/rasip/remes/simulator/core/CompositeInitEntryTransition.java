/**
 * 
 */
package hr.fer.rasip.remes.simulator.core;

/**
 * @author Marin Orlic <marin.orlic@fer.hr>
 *
 */
public abstract class CompositeInitEntryTransition extends Transition {

	boolean initTransition = false;
	
	/**
	 * Creates the Transition
	 * @param from mode 
	 * @param to mode
	 * @param isInitTransition does this transition act as mode initialization
	 */
	public CompositeInitEntryTransition(CompositeMode from, Mode to, boolean isInitTransition) {
		super(from, to);
		this.initTransition = isInitTransition;
	}

	/**
	 * Performs the transition. In case of init transition, marks the entered mode as initialized.
	 * @see hr.fer.rasip.remes.simulator.core.Transition#performTransition(hr.fer.rasip.remes.simulator.core.SimulatorState)
	 */
	@Override
	public void performTransition(SimulatorState ss) throws SimulatorDeadlockException {
		assert(ss != null);
		
		CompositeMode leaving = (CompositeMode) getConnectFrom();
		Mode entering = getConnectTo();
		
		// Clean pending transitions
		ss.removeWaitingTransitions(leaving);
		ss.removeActiveTransition(this);
				
		// Do the action bit
		performAction();
		
		// Mark mode initialized
		if(isInitTransition())
			leaving.setInitialized();
		
		// Enter mode - housekeeping
		ss.addActiveMode(entering);
		
		// Add its transitions to waiting
		ss.addWaitingTransitions(entering.getTransitions());
	
		// Enter mode
		entering.onEnterMode();
	}
		
	/**
	 * @return the initTransition
	 */
	@Override
	public boolean isInitTransition() {
		return initTransition;
	}	
}
