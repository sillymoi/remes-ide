/**
 * 
 */
package hr.fer.rasip.remes.simulator.core.constraints;

import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

import com.domainlanguage.intervals.Interval;

import hr.fer.rasip.remes.simulator.core.Simulator;
import hr.fer.rasip.remes.simulator.core.Variable;
import hr.fer.rasip.remes.simulator.core.datatypes.ResourceType;
import hr.fer.rasip.remes.simulator.core.datatypes.Type;

/**
 * @author Marin
 *
 */
public class ResourceConstraintObserver implements Observer {

	/** Environment */
	protected Simulator simulator;
	
	/** Resource check list */
	protected ArrayList<ResourceConstraintCheck> checks = new ArrayList<ResourceConstraintCheck>();

	/**
	 * Constructs the observer.
	 * @param simulator
	 */
	public ResourceConstraintObserver(Simulator simulator) {
		this.simulator = simulator;
	}

	/**
	 * Runs all configured resource constraints.
	 */
	@Override
	@SuppressWarnings("unchecked")
	public void update(Observable source, Object param) {
		if(source instanceof Variable<?> && param instanceof Type) {
			// Convert observed types
			Variable<ResourceType> var = (Variable<ResourceType>) source;
			ResourceType data = (ResourceType) param;
			Interval ticks = this.simulator.getClockTicks();
			
			// Run the checks
			for(ResourceConstraintCheck check : checks) {
				if(!check.check(var, data, ticks)) {
					StringBuilder sb = new StringBuilder("RESOURCE CONSTRAINT VIOLATED: ");
					sb.append(check).append(" in ");
					sb.append(this.simulator.getState().getExecutingElement());
					sb.append(", value = ").append(data.getValue());
					this.simulator.report(sb.toString());
				}
			}
		}
		
	}
	
	/**
	 * Adds a check to the list.
	 * @param check
	 */
	public void addConstraint(ResourceConstraintCheck check) {
		if(check != null)
			this.checks.add(check);
	}
	
	/**
	 * Returns the configured resource constraints as array.
	 * @return
	 */
	public ResourceConstraintCheck[] getConstraints() {
		ResourceConstraintCheck[] array = new ResourceConstraintCheck[checks.size()];
		checks.toArray(array);
		return array;
	}
}
