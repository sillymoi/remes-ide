package hr.fer.rasip.remes.simulator.core;

import java.util.ArrayList;
import java.util.Collection;

public abstract class CompositeMode extends Mode 
{	
	protected ArrayList<SubMode> subModes = new ArrayList<SubMode>();
	
	private boolean initialized = false;
	private ArrayList<Transition> initTransitions = new ArrayList<Transition>(); // Init edges
	private ArrayList<Transition> externalTransitions = new ArrayList<Transition>(); // Outside edges
	
	public CompositeMode(Simulator env, Behaviour beh) {
		super(env, beh, null);
		
		// Initialize structural components
		createStructure();
	}
	
	public CompositeMode(Simulator env, Behaviour beh, Mode parent) {
		super(env, beh, parent);
		
		// Initialize structural components
		createStructure();
	}
	
	/** Creates the structural components */
	protected void createStructure() {
		
	}
	
	/**
	 * Returns mode full name in form parent-full-name.mode-name
	 * @see hr.fer.rasip.remes.simulator.core.Mode#getFullName()
	 */
	@Override
	public String getFullName() {
		return getBehaviour().getName() + "." + getName();
	}

	
	/** Returns the transitions */
	@Override
	@SuppressWarnings("unchecked")
	public Collection<Transition> getTransitions() {
		if(!isInitialized())
			return (Collection<Transition>) initTransitions.clone(); // Return init transitions
		else
			return super.getTransitions(); // Return entry transitions
	}

	@SuppressWarnings("unchecked")
	public Collection<Transition> getExternalTransitions() {
		return (Collection<Transition>) externalTransitions.clone(); // Return external transitions
	}
	
	protected boolean isInitialized() {
		return initialized;
	}
	
	public void setInitialized() {
		initialized = true;
	}
	
	public void addSubMode(SubMode mode) {
		assert(mode != null);
		
		this.subModes.add(mode);
	}

	@Override
	public void addTransition(Transition t) {
		assert(t != null);
		
		if(t.isInitTransition()) { 
			// Init transition
			this.initTransitions.add(t);
		} else if(t.getConnectTo() == null) {
			// Virtual mode exit transition (external)
			this.externalTransitions.add(t);
		} else if(t.getConnectFrom() == this && t.getConnectTo().getParent() != this) {
			// Exit transition (external)
			this.externalTransitions.add(t);
		} else {
			// Internal transition
			super.addTransition(t);
		}
	}

	@Override
	public Variable<?> getVariable(String name) {
		Variable<?> var = super.getVariable(name);
		
		// Check in current mode and in globals
		if(var != null)
			return var;
		else
			return getEnvironment().getGlobal(name);
	}

	@Override
	public String toString() {
		return "CompositeMode [" + getFullName() + "]";
	}	

}
