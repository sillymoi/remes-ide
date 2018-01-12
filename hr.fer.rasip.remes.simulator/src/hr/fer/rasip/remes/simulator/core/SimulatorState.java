/**
 * 
 */
package hr.fer.rasip.remes.simulator.core;

import java.util.Collection;
import java.util.Map;

/**
 * @author Marin Orlic <marin.orlic@fer.hr>
 *
 */
public interface SimulatorState 
{
	public void addActiveMode(Mode m);
	public void removeActiveMode(Mode m);
	public void removeActiveMode(String name);
/*	
	public void addWaitingMode(Mode m);
	public void removeWaitingMode(Mode m);
	public void removeWaitingMode(String name);

	public void waitMode(String name);
	public void waitMode(Mode m);
	
	public boolean isModeWaiting(String name);
	public boolean isModeWaiting(Mode m);
	*/
/*	
	public void triggerMode(String name);
	public void triggerMode(Mode m);
	public boolean isModeTriggered(String name);

	public void activateMode(String name);
	public void activateMode(Mode m);
*/	
	public boolean isModeActive(String name);
	public boolean isModeActive(Mode m);
	
	public Collection<Mode> getActiveModes();
//	public Collection<Mode> getWaitingModes();
//	public Collection<Mode> getTriggeredModes();
	public void addActiveModes(Map<String, Mode> modes);
	
	public void addActiveTransition(Transition t);
	public void addActiveTransitions(Collection<Transition> transitions);
	public Transition getActiveTransition(Mode m);
	public Collection<Transition> getActiveTransitions();
	public void removeActiveTransition(Transition t);
	public void clearActiveTransitions();

	public void addWaitingTransition(Transition t);
	public void addWaitingTransitions(Collection<Transition> transitions);
	public Collection<Transition> getWaitingTransitions(Mode m);
	public Collection<Transition> getWaitingTransitions();
	public void removeWaitingTransition(Transition t);
	public void removeWaitingTransitions(Mode m);
	
	public Collection<TraceElement> getActiveElements();
	public TraceElement getExecutingElement();
	public void setExecutingElement(TraceElement executingElement);
	public void clearExecutingElement();
}
