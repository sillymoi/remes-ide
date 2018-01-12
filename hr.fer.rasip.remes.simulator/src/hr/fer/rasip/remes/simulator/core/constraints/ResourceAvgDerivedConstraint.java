/**
 * 
 */
package hr.fer.rasip.remes.simulator.core.constraints;

import com.domainlanguage.intervals.Interval;

import hr.fer.rasip.remes.simulator.core.Variable;
import hr.fer.rasip.remes.simulator.core.datatypes.ResourceType;

/**
 * @author Marin
 *
 */
public class ResourceAvgDerivedConstraint extends ResourceAvgConstraint implements ResourceConstraintCheck {

	public ResourceAvgDerivedConstraint(String res, Operation op, int bound) {
		super(res, op, bound, "avg(" + res + "') " + op + " " + bound);
	}
	
	public ResourceAvgDerivedConstraint(String res, Operation op, int bound, String description) {
		super(res, op, bound, description);
	}

	@Override
	public boolean check(Variable<ResourceType> resource, ResourceType data, Interval ticks) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String toString() {
		return getDescription();
	}
}
