/**
 * 
 */
package hr.fer.rasip.remes.datastore.framework.impl;

import org.eclipse.debug.core.model.IProcess;

/**
 * Data store server tracking object. Keeps the necessary information to connect with underlying
 * DB server (process ID, connection params).
 * 
 * @author Marin Orlic <marin.orlic@fer.hr>
 *
 */
public class DataStoreServer {
	
	private IDataStoreServerParams params = null;
	private DataStore dataStore = null;
	private IProcess[] processes = null;
	
	/**
	 * Creates a data store server object.
	 * 
	 * @param ds associated data store
	 * @param options server options
	 * @param processes actual server processes
	 */
	public DataStoreServer(DataStore ds, IDataStoreServerParams options, IProcess[] processes) {
		this.params = options;
		this.dataStore = ds;
		this.processes = processes;
	}
	
//	public void start() {
//		
//	}
//	
//	public void stop() {
//		
//	}

	/**
	 * Returns the options used to create this server.
	 * @return the params.
	 */
	public IDataStoreServerParams getParams() {
		return params;
	}

	/**
	 * Returns the data store associated with this server.
	 * @return the data store.
	 */
	public DataStore getDataStore() {
		return dataStore;
	}


	/**
	 * Returns the processes associated with this server.
	 * @return process list for this server.
	 */
	public IProcess[] getProcesses() {
		return this.processes;
	}
}
