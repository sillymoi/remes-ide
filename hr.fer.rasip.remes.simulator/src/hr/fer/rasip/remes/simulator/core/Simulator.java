/**
 * 
 */
package hr.fer.rasip.remes.simulator.core;

import hr.fer.rasip.remes.simulator.core.datatypes.ClockType;
import hr.fer.rasip.remes.simulator.core.datatypes.ResourceType;
import hr.fer.rasip.remes.simulator.core.datatypes.Type;

import java.util.Collection;

import com.domainlanguage.intervals.Interval;

/**
 * @author Marin Orlic <marin.orlic@fer.hr>
 *
 */
public interface Simulator {
	
	/** Marks the end of the initialization process, should be called before the main event loop */
	void begin();
	
	/** Performs cleanup tasks */
	void end();
	
	/** Consumes an argument from the command line */
	public String consumeArgument(String key);
	
	/** Checks if the simulator is in debugger mode */
	public boolean isDebugging();
	
	/** Returns current state of the simulator to allow adding steps */
	public SimulatorState getState();

	/** Sets the filter used to sieve transitions to be executed */
	public void setTransitionFilter(TransitionFilter filter);
	
	/** Returns the transition filter */
	public TransitionFilter getTransitionFilter();
	
	/** Adds a mode to simulator */
	public void addMode(Mode mode);
	
	/** Adds and activates transition in the simulator */
//	public void addActiveTransition(Transition t);
	
	/** Adds and activates transitions in the simulator */
//	public void addActiveTransitions(Collection<Transition> t);	
	
	/** Adds a mode to collection of top-modes */
	public void addTopMode(Mode mode);
	
	/** Returns a mode by its name */
	public Mode getMode(String name);
	
	/** Retrieves a list of top-modes */
	public Collection<Mode> getTopModes();
	
	/** Adds a mode to trigger waiting list */
//	public void addWaitingMode(Mode mode);
	
	/** Adds a global variable */
	public void addGlobal(Variable<? extends Type> global);

	/** Accesses a global variable by its name */
	Variable<? extends Type> getGlobal(String name);
	
	/** Retrieves a list of all global variables */
	Collection<Variable<? extends Type>> getGlobals();
	
	/** Adds a clock variable */
	public void addClock(Mode m, Variable<ClockType> clock);

	/** Performs a transition between modes 
	 * @param transition 
	 * @throws SimulatorDeadlockException */
//	public void performTransition(Transition t) throws SimulatorDeadlockException;
	
	/** Returns a reference to resource variable, creating it if necessary */
	public Variable<ResourceType> createResource(String name);
	
	/** Returns a reference to resource variable */
	public Variable<ResourceType> getResource(String name);
	
	/** Adds all top-modes to active modes list */
	public void activateTopModes();
			
	/** Runs the simulation 
	 * @throws SimulatorDeadlockException */
	public boolean run() throws SimulatorDeadlockException;

	/** Gets current clock ticks */
	public Interval getClockTicks();
	
	/** Activates a waiting mode */
//	public void triggerMode(String name);
// Should be private?
	/** Checks all active modes and transitions to find the earliest deadline */
	public Deadline getEarliestDeadline();
	
	/** Reports a message to System.out, includes current system time */
	public void report(String string);
	
	public class Deadline {
		public Collection<Transition> transitions = null;
		public Interval deadline = null;
		
		public Deadline(Interval i, Collection<Transition> ts) {
			this.deadline = i;
			this.transitions = ts;
		}
	}

	/** Sets the simulator's running flag. */
	void setRunning(boolean running);

	/** Checks the simulator's running flag. */
	boolean isRunning();

	
}
