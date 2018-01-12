/**
 * 
 */
package hr.fer.rasip.remes.simulator.core;

import hr.fer.rasip.remes.simulator.core.datatypes.Type;

import java.util.Collection;
import java.util.HashMap;

/**
 * @author Marin Orlic <marin.orlic@fer.hr>
 *
 */
public class DataPot {
	
	/** Pot contents */
	private HashMap<String, Type> contents = new HashMap<String, Type>();
	
	/** Get a variable from the pot */
	public Type get(String name) {
		return contents.get(name);
	}
	
	/** Put a variable in the pot */
	public void put(String name, Type data) {
		contents.put(name, data);
	}
	
	/** Get all variable names */
	public Collection<String> getNames() {
		return contents.keySet();
	}

	/** Empties the pot */
	public void empty() {
		contents.clear();
	}
}
