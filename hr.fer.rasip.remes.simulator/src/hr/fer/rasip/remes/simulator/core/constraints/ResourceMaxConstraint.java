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
public class ResourceMaxConstraint extends ResourceConstraint implements ResourceConstraintCheck {
	
	public ResourceMaxConstraint(String res, Operation op, int bound) {
		super(res, op, bound, "max(" + res + ") " + op + " " + bound);
	}

	public ResourceMaxConstraint(String res, Operation op, int bound, String description) {
		super(res, op, bound, description);
	}
	
	@Override
	public boolean check(Variable<ResourceType> resource, ResourceType data, Interval ticks) {
		if(resource == null || data == null)
			return false;
		if(data.getValue().hasUpperLimit()) {
			if(operation == Operation.LessOrEqual || operation == Operation.Equal || operation == Operation.GreaterOrEqual) {
				if(data.getValue().upperLimit().intValue() == bound) // Upper equals bound
					return true;
			} 
			
			switch(operation) {
			case LessOrEqual:
				// fall through
			case LessThan:
				return data.getValue().upperLimit() < bound;
			case GreaterOrEqual:
				// fall through
			case GreaterThan:
				return data.getValue().upperLimit() > bound;
			}		
		}
		else {
			switch(operation) {
			case LessOrEqual:
			case LessThan:
			case Equal:
				return false; // Upper limit is infinity

			case GreaterOrEqual:
			case GreaterThan:
				return true; // Upper limit is infinity
			}
		}
		
		return false;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return getDescription();
	}	
}
