package hr.fer.rasip.remes.simulator.core;

import hr.fer.rasip.remes.simulator.core.datatypes.Type;

public abstract class SubMode extends Mode {
	public SubMode(Simulator env, Behaviour beh, Mode parent) {
		super(env, beh, parent);
	}

	/**
	 * Returns mode full name in form parent-full-name.mode-name
	 * @see hr.fer.rasip.remes.simulator.core.Mode#getFullName()
	 */
	@Override
	public String getFullName() {
		if(getParent() != null)
			return getParent().getFullName() + "." + getName();
		else
			return getBehaviour().getName() + "." + getName();
	}

	@Override
	public Variable<? extends Type> getVariable(String name) {
		Variable<? extends Type> var = super.getVariable(name);
		
		// Check in current mode, parent mode and in globals
		if(var != null)
			return var;
		else if(getParent() != null)
			return getParent().getVariable(name);
		else
			return null;
	}

	@Override
	public String toString() {
		return "SubMode [" + getFullName() + "]";
	}
}
