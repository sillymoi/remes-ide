package hr.fer.rasip.remes.simulator.core.constraints;

import com.domainlanguage.intervals.Interval;

import hr.fer.rasip.remes.simulator.core.Variable;
import hr.fer.rasip.remes.simulator.core.datatypes.ResourceType;

public interface ResourceConstraintCheck {
	public abstract boolean check(Variable<ResourceType> resource, ResourceType data, Interval ticks);
}

