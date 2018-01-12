/**
 * 
 */
package hr.fer.rasip.remes.simulator.ui.navigator.commands;

import hr.fer.rasip.remes.simulator.ui.navigator.core.SimulatorDataStore;

import org.eclipse.core.expressions.PropertyTester;
import org.eclipse.core.runtime.Assert;

/**
 * @author Marin Orlic <marin.orlic@fer.hr>
 * 
 */
public class ServerRunningPropertyTester extends PropertyTester {

	/**
	 * Property checking if server is running.
	 */
	public static final String PROP_SERVER_RUNNING = "isServerRunning";

	/**
	 * Checks if a server is running for a data store.
	 */
	@Override
	public boolean test(Object receiver, String property, Object[] args, Object expectedValue) {

		SimulatorDataStore store = (SimulatorDataStore) receiver;

		if (PROP_SERVER_RUNNING.equals(property)) {
			if (expectedValue == null) {
				return store.isDataStoreServerRunning();
			} else {
				return store.isDataStoreServerRunning() 
						== ((Boolean) expectedValue).booleanValue();
			}
		}
		Assert.isTrue(false);

		return false;
	}
}
