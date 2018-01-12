/**
 * 
 */
package hr.fer.rasip.remes.simulator.core.impl;

import java.util.Collection;

import com.domainlanguage.intervals.Interval;
import com.google.common.collect.Multimap;

import hr.fer.rasip.remes.simulator.core.Transition;
import hr.fer.rasip.remes.simulator.core.TransitionFilter;
import hr.fer.rasip.remes.simulator.core.Simulator.Deadline;

/**
 * @author Marin Orlic <marin.orlic@fer.hr>
 *
 */
public class FirstDeadlineTransitionFilter implements TransitionFilter {

	/**
	 * Returns just the first transition 
	 * @see hr.fer.rasip.remes.simulator.core.TransitionFilter#filterTransitions(java.util.Collection)
	 */
	@Override
	public Deadline filterTransitions(Multimap<Interval, Transition> transitions) {
		@SuppressWarnings("unchecked")
		Interval earliest = (Interval) java.util.Collections.min(transitions.keySet());

		Collection<Transition> ts = transitions.get(earliest);
		Deadline result = new Deadline(earliest, ts);
		return result;
	}
}
