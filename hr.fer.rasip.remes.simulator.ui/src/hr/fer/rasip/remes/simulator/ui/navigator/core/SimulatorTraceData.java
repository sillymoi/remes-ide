/**
 * 
 */
package hr.fer.rasip.remes.simulator.ui.navigator.core;

import hr.fer.rasip.remes.simulator.traces.SimulatorRun;

/**
 * @author Marin
 *
 */
public class SimulatorTraceData {
	private String name = null;
	private SimulatorDataStore dataStore = null;
	
	/**
	 * Constructs the data element and sets name
	 * @param name
	 */
	public SimulatorTraceData(String name) {
		this.name = name;
	}
	
	public SimulatorTraceData(SimulatorDataStore ds, SimulatorRun simulatorRun) {
		this.name = simulatorRun.getBehaviorName() + " (" + simulatorRun.getTimestamp() + ")";
		this.dataStore = ds;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the dataStore
	 */
	public SimulatorDataStore getDataStore() {
		return dataStore;
	}

	/**
	 * @param dataStore the dataStore to set
	 */
	public void setDataStore(SimulatorDataStore dataStore) {
		this.dataStore = dataStore;
	}
}
