/**
 * 
 */
package hr.fer.rasip.remes.simulator.core;

import hr.fer.rasip.remes.simulator.core.datatypes.BooleanType;
import hr.fer.rasip.remes.simulator.core.datatypes.Type;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

import com.domainlanguage.intervals.Interval;

/**
 * @author Marin Orlic <marin.orlic@fer.hr>
 *
 */
public abstract class Mode implements TraceElement
{
	/** Simulator instance */
	protected Simulator environment = null;
	
	/** Enclosing behavior */
	private Behaviour behaviour = null;

	/** Mode's parent */
	private Mode parent = null;	
	
	/** Stores all variables */
	private HashMap<String, Variable<? extends Type>> variables = new HashMap<String, Variable<? extends Type>>();

	/** Stores outgoing transitions */
	private ArrayList<Transition> transitions = new ArrayList<Transition>();

	/** Stores the data transfered to this mode */
	private DataPot inputData = new DataPot();
	
	/** Stores the data transfered from this mode */
	private DataPot outputData = new DataPot();

	/** Stores outgoing renamings */
	private ArrayList<Renaming> renamings = new ArrayList<Renaming>();
	
	/** Default constructor */
	public Mode(Simulator env, Behaviour beh, Mode parent) {
		this.environment = env;
		this.behaviour = beh;
		this.parent = parent;
	}

	/** Convenience constructor */
	public Mode(Simulator env, Behaviour beh) {
		this(env, beh, null);
	}
	
	/** Gets mode name */
	public abstract String getName();

	/** Gets mode full name */
	public abstract String getFullName();
	
	/** Accesses the simulator environment */
	public Simulator getEnvironment() {
		return environment;
	}

	/** Returns the enclosing behavior */
	public Behaviour getBehaviour() {
		return behaviour;
	}
	
	/** Returns the parent mode */
	public Mode getParent() {
		return parent;
	}
	
	/** Adds a variable to map */
	public void addVariable(Variable<? extends Type> var) {
		variables.put(var.getName(), var);
	}
	
	/** Find variable by name, look only in current context (mode) */
	public Variable<? extends Type> getVariable(String name) {
		return variables.get(name);
	}
	
	/** Retrieves a list of all variables declared for this mode */
	public Collection<Variable<? extends Type>> getVariables() {
		return variables.values();
	}
	
	/** Adds a transition to map */
	public void addTransition(Transition t) {
		transitions.add(t);
	}
	
	/** Returns all transitions 
	 * @param predecessor */
	@SuppressWarnings("unchecked")
	public Collection<Transition> getTransitions() {
		return (Collection<Transition>) transitions.clone();
	}
	
	/** Activates the mode */
	public void onEnterMode() {
		// Copy data from input data pot to variables
		receiveData();
		
		getEnvironment().report("Entering Mode: " + this.getFullName());
	}
	
	/** Exit mode */
	public void onExitMode() {
		// Copy variables to output pot
		sendData();
		
		getEnvironment().report("Exiting Mode: " + this.getFullName());
	}
	
	/**
	 * @return the inputData
	 */
	public DataPot getInputData() {
		return inputData;
	}

	/**
	 * @return the outputData
	 */
	public DataPot getOutputData() {
		return outputData;
	}

	/** Adds a renaming to map */
	public void addRenaming(Renaming r) {
		renamings.add(r);
	}
	
	/** Gets all renamings */
	private Collection<Renaming> getRenamings() {
		return renamings;
	}
	
	/** Check when does the mode's invariant still hold */
	public Type invariantHolds() {
		return new BooleanType(true);
	}

	/** Check if it's possible to enter mode - it's invariant holds */
	public boolean canEnter() {
		Type condition = invariantHolds();
		
		switch(condition.getType()) {
			case BOOLEAN:
				return (Boolean) condition.getValue();
			case CLOCK:
				return ! (((Interval) condition.getValue()).isEmpty());
		}
		return false;
	}
	
	/** Perform resource updates */
	public void performContinuousStep(Interval iv) {
		
	}
	
	/** 
	 * Send data to a mode.
	 * The default implementation copies all local variables to pot. 
	 */
	public void sendData() {
		// Default copies all local variables to pot
		Collection<String> names = variables.keySet();
		
		for(String name : names) {
			Type data = getVariable(name).value();
			
			assert(data != null);
	
			if(data.isTransferrable()) {
				// Store the data
				getOutputData().put(name, data);
				
				getEnvironment().report(getFullName() + ": output data [" + name + "] = " + data);
			}
		}
	}

	/** 
	 * Receive data from a mode.
	 * The default implementation copies all pot data to variables.
	 */
	public void receiveData() {
		Collection<String> names = getInputData().getNames();
		
		for(String name : names) {
			Type data = getInputData().get(name);
			Variable<? extends Type> var = getVariable(name);
			
			assert(data != null && var != null);
	
			// Store the data
			var.setValue(data);
			
			getEnvironment().report(getFullName() + ": var " + var.getName() + " = " + var.value());
		}
		
		getInputData().empty();
	}

	/**
	 * Performs the data transfer to other modes.
	 */
	public void performRenamings() {
		for(Renaming r : getRenamings()) {
			r.rename();
		}
	}

	/**
	 * Mark this as Mode
	 * @see hr.fer.rasip.remes.simulator.core.TraceElement#isMode()
	 */
	@Override
	public boolean isMode() {
		return true;
	}

	/**
	 * Mark this as NOT transition
	 * @see hr.fer.rasip.remes.simulator.core.TraceElement#isTransition()
	 */
	@Override
	public boolean isTransition() {
		return false;
	}
}
