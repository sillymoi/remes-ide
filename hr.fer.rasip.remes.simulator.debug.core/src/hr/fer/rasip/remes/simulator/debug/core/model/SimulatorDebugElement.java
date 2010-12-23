/**
 * 
 */
package hr.fer.rasip.remes.simulator.debug.core.model;

import hr.fer.rasip.remes.simulator.debug.core.Activator;

import org.eclipse.debug.core.model.DebugElement;
import org.eclipse.debug.core.model.IDebugTarget;

/**
 * @author Marin Orlic <marin.orlic@fer.hr>
 *
 */
public class SimulatorDebugElement extends DebugElement {

	/**
	 * Constructs a new debug element in the given target.
	 * 
	 * @param target debug target
	 */
	public SimulatorDebugElement(IDebugTarget target) {
		super(target);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.debug.core.model.IDebugElement#getModelIdentifier()
	 */
	@Override
	public String getModelIdentifier() {
		return Activator.ID_SIMULATOR_DEBUG_MODEL;
	}

	/**
	 * Returns the debug target as a simulator debug target.
	 * 
	 * @return simulator debug target
	 */
	protected SimulatorDebugTarget getSimulatorDebugTarget() {
	    return (SimulatorDebugTarget) getDebugTarget();
	}
	
}
