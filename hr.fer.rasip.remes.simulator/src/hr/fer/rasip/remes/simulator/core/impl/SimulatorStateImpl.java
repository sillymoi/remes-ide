package hr.fer.rasip.remes.simulator.core.impl;

import hr.fer.rasip.remes.simulator.core.Mode;
import hr.fer.rasip.remes.simulator.core.SimulatorState;
import hr.fer.rasip.remes.simulator.core.TraceElement;
import hr.fer.rasip.remes.simulator.core.Transition;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import com.google.common.collect.HashMultimap;

public class SimulatorStateImpl implements SimulatorState {

	private HashMap<String, Mode> activeModes = new HashMap<String, Mode>();
//	private HashMap<String, Mode> waitingModes = new HashMap<String, Mode>();
	private HashMap<Mode, Transition> activeTransitions = new HashMap<Mode, Transition>();
	private HashMultimap<Mode, Transition> waitingTransitions = HashMultimap.create();
	private TraceElement executingElement = null;
		
	@Override
	public void addActiveMode(Mode m) {
		activeModes.put(m.getFullName(), m);
	}

	@Override
	public void removeActiveMode(Mode m) {
		if(activeModes.containsKey(m.getFullName()))
			activeModes.remove(m.getFullName());
	}

	@Override
	public Collection<Mode> getActiveModes() {
		return activeModes.values();
	}

	@Override
	public void addActiveModes(Map<String, Mode> modes) {
		if(modes != null) {
			activeModes.putAll(modes);
		}
	}
/*
	@Override
	public void addWaitingMode(Mode m) {
		waitingModes.put(m.getName(), m);		
	}

	@Override
	public Collection<Mode> getWaitingModes() {
		return waitingModes.values();
	}

	@Override
	public void removeWaitingMode(Mode m) {
		if(waitingModes.containsKey(m.getName()))
			waitingModes.remove(m.getName());		
	}
*/
	@Override
	public void removeActiveMode(String name) {
		if(activeModes.containsKey(name))
			activeModes.remove(name);				
	}
/*
	@Override
	public void removeWaitingMode(String name) {
		if(waitingModes.containsKey(name))
			waitingModes.remove(name);				
	}
	*/
/*
	@Override
	public void activateMode(String name) {
		Mode m = waitingModes.get(name);
		waitingModes.remove(name);
		if(m != null)
			activeModes.put(m.getName(), m);
	}

	@Override
	public void activateMode(Mode m) {
		assert(m != null && m == waitingModes.get(m.getName()));
		
		waitingModes.remove(m.getName());
		activeModes.put(m.getName(), m);
	}
*/
	@Override
	public boolean isModeActive(String name) {
		return activeModes.containsKey(name);
	}

	@Override
	public boolean isModeActive(Mode m) {
		return activeModes.containsValue(m);
	}
/*
	@Override
	public boolean isModeWaiting(String name) {
		return waitingModes.containsKey(name);
	}
	*/
/*
	@Override
	public boolean isModeWaiting(Mode m) {
		return waitingModes.containsValue(m);
	}

	@Override
	public void waitMode(String name) {
		Mode m = activeModes.get(name);
		activeModes.remove(name);
		if(m != null)
			waitingModes.put(m.getName(), m);
	}

	@Override
	public void waitMode(Mode m) {
		assert(m != null && m == activeModes.get(m.getName()));
		
		activeModes.remove(m.getName());
		waitingModes.put(m.getName(), m);
	}
*/
	@Override
	public void addActiveTransition(Transition t) {
		assert(t != null);
		
		activeTransitions.put(t.getConnectFrom(), t);
	}

	@Override
	public void addActiveTransitions(Collection<Transition> transitions) {
		assert(transitions != null);
		
		for(Transition t: transitions)
			addActiveTransition(t);
	}
	
	@Override
	public Transition getActiveTransition(Mode m) {
		assert(m != null);
		
		return activeTransitions.get(m);
	}

	@Override
	public Collection<Transition> getActiveTransitions() {
		return activeTransitions.values();
	}

	@Override
	public void removeActiveTransition(Transition t) {
		assert(t != null);
		
		activeTransitions.remove(t.getConnectFrom());
	}

	@Override
	public void clearActiveTransitions() {
		activeTransitions.clear();
	}

	@Override
	public void addWaitingTransition(Transition t) {
		assert(t != null);
		
		waitingTransitions.put(t.getConnectFrom(), t);
	}

	@Override
	public void addWaitingTransitions(Collection<Transition> transitions) {
		assert(transitions != null);
		
		for(Transition t: transitions)
			addWaitingTransition(t);
	}

	@Override
	public Collection<Transition> getWaitingTransitions(Mode m) {
		assert(m != null);
		
		return waitingTransitions.get(m);
	}

	@Override
	public Collection<Transition> getWaitingTransitions() {
		return waitingTransitions.values();
	}

	@Override
	public void removeWaitingTransition(Transition t) {
		assert(t != null);
		
		waitingTransitions.remove(t.getConnectFrom(), t);
	}

	@Override
	public void removeWaitingTransitions(Mode m) {
		assert(m != null);
		
		waitingTransitions.removeAll(m);
	}
	
	@Override
	public Collection<TraceElement> getActiveElements() {
		ArrayList<TraceElement> result = new ArrayList<TraceElement>();
		
		result.addAll(activeModes.values());
		result.addAll(activeTransitions.values());
		
		return result;
	}

	@Override
	public TraceElement getExecutingElement() {
		return executingElement;
	}

	@Override
	public void setExecutingElement(TraceElement executingElement) {
		this.executingElement = executingElement;
	}
	
	@Override
	public void clearExecutingElement() {
		setExecutingElement(null);
	}
}
