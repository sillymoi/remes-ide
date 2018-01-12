/**
 * 
 */
package hr.fer.rasip.remes.simulator.core.constraints;

import hr.fer.rasip.remes.simulator.core.Simulator;
import hr.fer.rasip.remes.simulator.core.Variable;
import hr.fer.rasip.remes.simulator.core.datatypes.ResourceType;

import com.domainlanguage.intervals.Interval;

/**
 * @author Marin
 *
 */
public class ResourceMinDerivedConstraint extends ResourceMinConstraint implements ResourceConstraintCheck {

	/** Last recorded resource value */
	protected ResourceType lastValue = null;
	
	/** Last recorded clock */
	protected Interval lastTicks = null;

	/** Simulator environment */
	protected Simulator simulator;
	
	public ResourceMinDerivedConstraint(String res, Operation op, int bound, Simulator simulator, String description) {
		super(res, op, bound, description);
		this.simulator = simulator;
	}
	
	public ResourceMinDerivedConstraint(String res, Operation op, int bound, Simulator simulator) {
		super(res, op, bound, "min(" + res + "') " + op + " " + bound);
		this.simulator = simulator;
	}

	@Override
	public boolean check(Variable<ResourceType> resource, ResourceType data, Interval ticks) {
		// Check if we got null values
		if(resource == null || data == null)
			return false;

		if(lastValue == null) {
			this.lastValue = new ResourceType(Interval.duplicate(data.getValue())); // Store the new
			this.lastTicks = ticks;
			return true; // Wait until the derivation can be calculated
		}		
		
		Interval clock = ticks.relate(this.lastTicks); // Get clock update
		Interval diff = data.getValue().offset(this.lastValue.getValue(), false); // Subtract the old from the new
		
		Integer lower = (diff.lowerLimit() == null || clock.lowerLimit() == 0) ? null : diff.lowerLimit() / clock.lowerLimit(); // Calculate time diff
		Integer upper = (diff.upperLimit() == null || clock.upperLimit() == 0) ? null : diff.upperLimit() / clock.upperLimit();
		diff = Interval.over(lower, diff.hasLowerLimit(), upper, diff.hasUpperLimit());
		
		this.lastValue = new ResourceType(Interval.duplicate(data.getValue())); // Store the new
		this.lastTicks = this.simulator.getClockTicks();
		
		// Use the superclass to do the checking
		return super.check(resource, new ResourceType(diff), ticks);
	}

	@Override
	public String toString() {
		return getDescription();
	}	

}
