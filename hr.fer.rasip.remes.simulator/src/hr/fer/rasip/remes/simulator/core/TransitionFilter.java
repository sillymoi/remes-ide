/**
 * 
 */
package hr.fer.rasip.remes.simulator.core;

import hr.fer.rasip.remes.simulator.core.Simulator.Deadline;

import com.domainlanguage.intervals.Interval;
import com.google.common.collect.Multimap;

/**
 * @author Marin Orlic <marin.orlic@fer.hr>
 *
 */
public interface TransitionFilter {
	public Deadline filterTransitions(Multimap<Interval, Transition> transitions);
}
