package hr.fer.rasip.remes.simulator.core.impl;

import hr.fer.rasip.remes.simulator.core.Mode;
import hr.fer.rasip.remes.simulator.core.Simulator;
import hr.fer.rasip.remes.simulator.core.SimulatorDeadlockException;
import hr.fer.rasip.remes.simulator.core.SimulatorState;
import hr.fer.rasip.remes.simulator.core.Transition;
import hr.fer.rasip.remes.simulator.core.TransitionFilter;
import hr.fer.rasip.remes.simulator.core.Variable;
import hr.fer.rasip.remes.simulator.core.datatypes.ClockType;
import hr.fer.rasip.remes.simulator.core.datatypes.ResourceType;
import hr.fer.rasip.remes.simulator.core.datatypes.Type;
import hr.fer.rasip.remes.simulator.core.datatypes.Type.TYPE_CODE;
import hr.fer.rasip.remes.simulator.core.debug.ISimulatorEvent;
import hr.fer.rasip.remes.simulator.core.debug.SimulatorDebugger;
import hr.fer.rasip.remes.simulator.core.debug.SimulatorEvent;

import java.util.Collection;
import java.util.HashMap;

import com.domainlanguage.intervals.Interval;
import com.google.common.collect.HashMultimap;

public class SimulatorImpl implements Simulator 
{	
	/** Default constructor */
	public SimulatorImpl(String args[]) {
		super();
		
		// Parse command line
		parseArguments(args);
		
		// Check if there's a debug flag
		if(consumeArgument("debug") != null) {
				this.debugger = new SimulatorDebugger(this);
				this.debugging = true;
		}
		
		// Keep track of time
		addClock(null, globalClock);
		
		// Inheriting classes should call 
		// postInitialize(); now
	}

	/**
	 * Stores the command line arguments as key-value pairs
	 */
	protected HashMap<String, String> options = new HashMap<String, String>();
	
	/**
	 * A flag marking the simulator is in debug mode
	 */
	protected boolean debugging;
	
	/**
	 * Simulator debugger attachment
	 */
	protected SimulatorDebugger debugger;
	
	/**
	 * Stores the transition filter
	 * Default filter returns just the first transition
	 */
	protected TransitionFilter transitionFilter = new FirstDeadlineTransitionFilter();
	
	/**
	 * Stores modes
	 */
	 protected HashMap<String, Mode> modes = new HashMap<String, Mode>();
	
	/**
	 * Stores top-level modes
	 */
	protected HashMap<String, Mode> topModes = new HashMap<String, Mode>();
	
	/**
	 * Stores global variables
	 */
	HashMap<String, Variable<? extends Type>> globals = new HashMap<String, Variable<?>>();

	/**
	 * Stores clock variables
	 */
	HashMultimap<Mode, Variable<ClockType>> clockVars = HashMultimap.create();
		
	/**
	 * Stores resources
	 */
	HashMap<String, Variable<ResourceType>> resources = new HashMap<String, Variable<ResourceType>>();

	/**
	 * Stores transitions
	 */
//	MultiValueMap transitions = new MultiValueMap();
	
	/**
	 * Simulator state
	 */
	SimulatorState state = new SimulatorStateImpl();
	
	/**
	 * Global clock
	 */
	Variable<ClockType> globalClock = new Variable<ClockType>("globalClock", TYPE_CODE.CLOCK, null, false, false, 0);

	/**
	 * Simulator should run or stop?
	 */
	boolean running = true;

	/**
	 * Simulator is suspended?
	 */
//	boolean suspended = true;

	private void parseArguments(String[] args) {
		for(int i=0; i<args.length; i++) {
			String key = null;
			String value = null;
			if(args[i].startsWith("-")) { // This is a key
				key = args[i].substring(1); // Remove the starting -
				if(args.length >= i+2) {
					if(!args[i+1].startsWith("-")) {
						value = args[i+1];
						i++; // consumed two options instead of one
					} else { // binary option
						value = "true";
					}
				} else { // this else can be combined with the one above
					value = "true"; // last option, no value
				}
			}
			
			this.options.put(key, value);
		}
	}
	
	@Override
	public void begin() {
		// Check if all arguments are consumed
		if(!this.options.isEmpty()) {
			System.err.println("Unknown arguments: ");
			for(String key : this.options.keySet()) {
				System.out.println("  " + key + ": " + this.options.get(key));
			}
		}
		
		// Notify debugger
		sendEvent(SimulatorEvent.STARTED);
	}
	
	@Override
	public void end() {
		// Notify debugger
		sendEvent(SimulatorEvent.TERMINATED);
	}
	
	@Override
	public String consumeArgument(String key) {
		String value = this.options.get(key);
		this.options.remove(key);
		return value;
	}
	
	@Override
	public boolean isDebugging() {
		return this.debugging;
	}
	
	@Override
	public SimulatorState getState() {
		return this.state;
	}

	@Override
	public Variable<ResourceType> createResource(String name) {
		Variable<ResourceType> res = new Variable<ResourceType>(name, TYPE_CODE.RESOURCE, null, true, true, 0);
		resources.put(name, res);
		return res;
	}

	@Override
	public void addGlobal(Variable<? extends Type> global) {
		globals.put(global.getName(), global);
	}
	
	@Override
	public Variable<? extends Type> getGlobal(String name) {
		return globals.get(name);
	}

	@Override
	public Collection<Variable<? extends Type>> getGlobals() {
		return globals.values();
	}
	
	@Override
	public void setTransitionFilter(TransitionFilter filter) {
		assert(filter != null);
		this.transitionFilter = filter;
	}

	@Override
	public TransitionFilter getTransitionFilter() {
		return this.transitionFilter;
	}

	@Override
	public void addMode(Mode mode) {
		modes.put(mode.getFullName(), mode);
	}
	
	@Override
	public void addTopMode(Mode mode) {
		topModes.put(mode.getFullName(), mode);
	}

	@Override
	public Collection<Mode> getTopModes() {
		return topModes.values();
	}
/*
	@Override
	public void addWaitingMode(Mode mode) {
		getState().addWaitingMode(mode);
	}
*/
/*	
	@Override
	public void addActiveTransition(Transition t) {
		assert(t != null);
		
		transitions.put(t.getConnectFrom(), t);
	}
*/
	
	@Override
	public Mode getMode(String name) {
		return modes.get(name);
	}

	/*	@Override
	public void addActiveTransitions(Collection<Transition> ts) {
		assert(ts != null);
		
		for(Transition t : ts) {
			addActiveTransition(t);
		}
	}
*/
	@Override
	public void addClock(Mode m, Variable<ClockType> clock) {
		assert(m != null && clock != null);
		
		clockVars.put(m, clock);
	}
	
	@Override
	public Interval getClockTicks() {
		return globalClock.value().getValue();
	}

	@Override
	public Variable<ResourceType> getResource(String type) {
		return resources.get(type);
	}

	@Override
	public void activateTopModes() {
		getState().addActiveModes(topModes);
		
		for(Mode m : topModes.values()) {
			getState().addWaitingTransitions(m.getTransitions());
		}
		
		return;
	}
	
	private HashMultimap<Interval, Transition> calculateDeadlines() {
		HashMultimap<Interval, Transition> list = HashMultimap.create();
		HashMultimap<Interval, Transition> system = HashMultimap.create();
		HashMap<Mode, Type> invariants = new HashMap<Mode, Type>();
		
		// Calculate mode invariants
		Collection<Mode> activeModes = getState().getActiveModes();
		for(Mode m : activeModes) {
			Type inv = m.invariantHolds();
			invariants.put(m, inv);
		}
		
		// Check which transitions can be activated
		for(Transition t : getState().getWaitingTransitions()) {
			if(t.isSystemTransition()) {
				system.put(Interval.single(0), t);
				continue;
			}
			
			if(!activeModes.contains(t.getConnectFrom()))
				continue;
			
			Type guard = t.evaluateGuard();
			Type invariant = invariants.get(t.getConnectFrom());
			Type valuation = invariant.and(guard);

			// In case of urgent modes, or modes with no clock constraint in invariant,
			// the deadline is determined by the edge guard
			if(invariant.getType() == TYPE_CODE.BOOLEAN)
				valuation = guard;
				
			if(valuation.getType() == TYPE_CODE.BOOLEAN) {
				if((Boolean) valuation.getValue())
					list.put(Interval.single(0), t);
			} else if(valuation.getType() == TYPE_CODE.CLOCK) {
				Interval deadline = (Interval) valuation.getValue();
				
				// Check if deadline is in the future
				if(deadline.lowerLimit().intValue() >= 0)
					list.put(deadline, t);
			} else {
				System.out.println("UNKNOWN TYPE OF EDGE GUARD EVALUATION RESULT: " + valuation.getType().name());
			}
		}
		
		// Check if there are dead modes
		for(Mode m : invariants.keySet()) {
			
		}
		
		// If system transitions are found, execute them first
		if(!system.isEmpty())
			return system;
		else
			return list;
	}
	
	@Override
	public Deadline getEarliestDeadline() {
		HashMultimap<Interval, Transition> deadlines = calculateDeadlines();
		
		// DEBUG: check what's in the box
		if(false) {
			HashMap<Mode, Integer> modeFreq = new HashMap<Mode, Integer>();
	
			for(Interval iv : (Collection<Interval>) deadlines.keySet()) {
				for(Transition t : (Collection<Transition>) deadlines.get(iv)) {
					Mode m = t.getConnectFrom();
					Integer count = modeFreq.get(m);
					modeFreq.put(m, (count==null) ? 1 : count+1);
	
					System.out.println("Mode: " + m.getName() + ", " + t.getClass().getSuperclass().getSimpleName() + "::" + t.getClass().getSimpleName() + ":" + ((t.getConnectTo()==null)?"null":t.getConnectTo().getName()) + " @ " + iv);
				}
			}
	
			for(Mode m : modeFreq.keySet()) {
				System.out.println("Mode: " + m.getName() + ", count = " + modeFreq.get(m));
			}
		}
		//DEBUG end		

		Deadline result = getTransitionFilter().filterTransitions(deadlines);
//		System.out.println("DEBUG: Earliest deadline: " + result.deadline + ", with " + result.transitions.size() + " transitions");
		
		return result;
	}

	@Override
	public boolean run() throws SimulatorDeadlockException {
		if(!isRunning())
			return running;
		
		// Handle events
		handleDebugEvents();
		
		// See if there's anything to do
 		if(getState().getActiveElements().isEmpty())
			return false; // We're done

		// Get next deadline
		Deadline deadline = getEarliestDeadline();
		Interval elapsed = deadline.deadline;
		Collection<Transition> toPerform = deadline.transitions;
		
		// Check if deadline is bounded
		if(!elapsed.hasUpperLimit())
			elapsed = Interval.single(elapsed.lowerLimit()); // TODO: find the next deadline and intersect
		
		if(!elapsed.equals(Interval.single(-1))) {
			// Advance the clocks
			for(Variable<ClockType> clk : clockVars.values()) {
				clk.value().offset(elapsed);
			}
			
			// Run continuous steps		
			for(Mode m : getState().getActiveModes()) {
				getState().setExecutingElement(m); // Save for error reporting
				m.performContinuousStep(elapsed);	
			}
			
			// Advance global clock
			// DONE with the rest of clocks globalClock.value().offset(elapsed);
		}
		
		// TODO: transactions?
		
		// Execute the transition
		if(toPerform != null) {
			selectAndPerformModeTransitions(toPerform);
//			for(Transition t : toPerform)
//				t.performTransition(getState()); // Ordering is not guaranteed
		}
		
		// Clear active transitions for next iteration
		getState().clearActiveTransitions();
		getState().clearExecutingElement();
		
		// Debug
		StringBuilder sb = new StringBuilder();
		for(Variable<ClockType> clock : clockVars.values()) {
			sb.append(clock.getFullName()).append("=").append(clock.value()).append(" ");
		}
		report("Clocks:"+sb.toString());
		
		return true;
	}

	@Override
	public void setRunning(boolean running) {
		this.running = running;
	}
	
	@Override
	public boolean isRunning() {
		return this.running;
	}

//	@Override
//	public void setSuspended(boolean suspended) {
//		this.suspended = suspended;
//	}
//	
//	@Override
//	public boolean isSuspended() {
//		return this.suspended;
//	}
	
	protected void handleDebugEvents() {
		if(isDebugging()) {
			this.debugger.handleRequests();
		}
	}

	protected void sendEvent(ISimulatorEvent payload) {
		if(isDebugging()) {
			this.debugger.sendEvent(payload);
		}
	}
	
	private void selectAndPerformModeTransitions(Collection<Transition> toPerform) throws SimulatorDeadlockException {
		HashMultimap<Mode, Transition> modeTransitions = HashMultimap.create();
		
		for(Transition t : toPerform) {
			modeTransitions.put(t.getConnectFrom(), t);
		}
		
		for(Mode m : (Collection<Mode>) modeTransitions.keySet()) {
			Collection<Transition> ts = modeTransitions.get(m);
			
			if(ts == null)
				continue;
			
			if(ts.size() != 1) // Single transition
				System.out.println("MULTIPLE OUTGOING TRANSITIONS ENABLED FOR SAME DEADLINE");
			
			Transition t = ts.iterator().next();
			getState().setExecutingElement(t); // Save for error reporting
			t.performTransition(getState()); // Perform transition
		}
	}
	
	@Override
	public void report(String message) {
		System.out.print("@TIME:");
		System.out.print(getClockTicks());
		System.out.print(":");
		System.out.println(message);		
	}
}
