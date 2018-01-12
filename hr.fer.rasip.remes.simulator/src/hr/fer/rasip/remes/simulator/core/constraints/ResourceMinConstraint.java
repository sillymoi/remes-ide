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
public class ResourceMinConstraint extends ResourceConstraint implements ResourceConstraintCheck {

	public ResourceMinConstraint(String res, Operation op, int bound) {
		super(res, op, bound, "min(" + res + ") " + op + " " + bound);
	}
	
	public ResourceMinConstraint(String res, Operation op, int bound, String description) {
		super(res, op, bound, description);
	}

	@Override
	public boolean check(Variable<ResourceType> resource, ResourceType data, Interval ticks) {
		if(resource == null || data == null)
			return false;
		if(data.getValue().hasLowerLimit()) {
			if(operation == Operation.LessOrEqual || operation == Operation.Equal || operation == Operation.GreaterOrEqual) {
				if(data.getValue().lowerLimit().intValue() == bound) // Lower equals bound
					return true;
			}
			
			switch(operation) {
			case LessOrEqual:
				// fall through
			case LessThan:
				return data.getValue().lowerLimit() < bound;
			case GreaterOrEqual:
				// fall through
			case GreaterThan:
				return data.getValue().lowerLimit() > bound;
			}			
		}
		else {
			switch(operation) {
			case LessOrEqual:
			case LessThan:
				return true; // Lower limit is infinity

			case Equal:
			case GreaterOrEqual:
			case GreaterThan:
				return false; // Lower limit is infinity
			}
		}
		
		return false;
	}

	@Override
	public String toString() {
		return getDescription();
	}	
}
