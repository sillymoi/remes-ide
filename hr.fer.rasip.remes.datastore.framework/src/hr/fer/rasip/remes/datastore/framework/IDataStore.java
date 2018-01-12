/**
 * 
 */
package hr.fer.rasip.remes.datastore.framework;

import java.sql.Connection;
import java.sql.SQLException;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.teneo.hibernate.SessionWrapper;

/**
 * Data store access interface.
 * 
 * @author Marin Orlic <marin.orlic@fer.hr>
 */
public interface IDataStore {

	/**
	 * Checks if the server of this data store is started.
	 * @return true if the underlying data store server is running.
	 */
	boolean isStarted();

	/**
	 * Opens a Teneo session to this data store. Will start the server if
	 * necessary. This is a long-running operation and should not be run on UI
	 * thread.
	 * 
	 * @param monitor - progress monitor used to notify user
	 * @return ORM session wrapper that can be used to manage entities 
	 * @see org.eclipse.emf.teneo.hibernate.SessionWrapper
	 */
	SessionWrapper getSession(IProgressMonitor monitor);
	
	/**
	 * Opens a JDBC connection with this data store. Will start the server if
	 * necessary. This is a long-running operation and should not be run on UI
	 * thread.
	 * 
	 * @param monitor - progress monitor used to notify user
	 * @return connection to this data store
	 * @see java.sql.Connection
	 */
	Connection getConnection(IProgressMonitor monitor);
	
	/**
	 * Returns the JDBC connection string that can be used to connect to
	 * the data store server manually. Clients connecting to the server from 
	 * the same JVM should use getConnection() to open a connection.
	 * 
	 * @return JDBC connection string for the data store server.
	 * @see #getConnection()
	 */
	String getConnectionURL();

	/**
	 * Disposes of this data store, taking care of underlying resources.
	 * 
	 * @param monitor - progress monitor used to notify user
	 */
	void dispose(IProgressMonitor monitor);

	/**
	 * Adds an IDataStoreEventListener to this data store.
	 * Listener will receive notifications on data store start and stop events.
	 * 
	 * @param listener 
	 * @see hr.fer.rasip.remes.datastore.framework.IDataStoreEventListener 
	 */
	void addDataStoreEventListener(IDataStoreEventListener listener);
	
	/**
	 * Removes an IDataStoreEventListener from this data store.
	 * @param listener
	 * @see hr.fer.rasip.remes.datastore.framework.IDataStoreEventListener
	 */
	void removeDataStoreEventListener(IDataStoreEventListener listener);

	/**
	 * Forces the data store server to start. This is a long-running 
	 * operation and should not be run on UI thread.
	 * 
	 * @param monitor - progress monitor used to notify user
	 * @throws CoreException
	 */
	void start(IProgressMonitor monitor) throws CoreException;
	
	/**
	 * Forces the data store server to stop. This is a long-running 
	 * operation and should not be run on UI thread.
	 * 
	 * @param monitor - progress monitor used to notify user
	 * @throws CoreException
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 */
	void stop(IProgressMonitor monitor) throws CoreException, ClassNotFoundException, SQLException;

	/**
	 * Returns the ORM mapping XML defined for the data store (underlying HbDataStore).
	 * 
	 * @return text of the XML mapping
	 */
	String getMappingXML();

}
