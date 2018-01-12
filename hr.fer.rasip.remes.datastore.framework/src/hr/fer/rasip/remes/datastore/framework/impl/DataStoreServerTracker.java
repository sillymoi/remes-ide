/**
 * 
 */
package hr.fer.rasip.remes.datastore.framework.impl;

import hr.fer.rasip.remes.datastore.framework.Activator;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.debug.core.DebugEvent;
import org.eclipse.debug.core.DebugPlugin;
import org.eclipse.debug.core.IDebugEventSetListener;
import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.model.IProcess;
import org.eclipse.emf.common.util.BasicMonitor;
import org.eclipse.jdt.core.IJavaProject;

/**
 * Database server tracker, responsible for starting and stopping DB servers.
 * Registers a debug event listener to be notified when server process finishes.
 * 
 * @author Fernando Lozano (www.lozano.eti.br)
 * @author Marin Orlic <marin.orlic@fer.hr>
 */
public class DataStoreServerTracker {

	private static final String SERVER_CLASS_NAME = "org.hsqldb.Server";

//	private static final String RUNNING_PROPERTY = "running";

	/**
	 * Map between processes and related server objects.
	 */
	private HashMap<IProcess, DataStoreServer> servers = new HashMap<IProcess, DataStoreServer>();
	
	/**
	 * The only instance.
	 */
	private static final DataStoreServerTracker INSTANCE = new DataStoreServerTracker();
	
	/**
	 * Listener for DebugEvents, to know if a server was stopped by clients
	 * or died by itself.
	 */
	private IDebugEventSetListener listener = new IDebugEventSetListener() {
	    public void handleDebugEvents(DebugEvent[] events) {
	    	// Handle termination events
			if (events[0].getKind() == DebugEvent.TERMINATE) {
				Object source = events[0].getSource();
				if (source instanceof IProcess) {
					// Check the server process in the list
					DataStoreServer server = servers.get(source);
					if (server != null) {
//						try {
							// Notify data store that server is stopped
							server.getDataStore().notifyServerStopped();
							servers.remove(source);
							//setRunning(server, null);
//						}
//						catch (CoreException ce) {
//							// TODO Auto-generated catch block
//							System.err.println("HsqldbServerTracker.handleDebugEvents");
//							System.err.println(ActionUtil.getStatusMessages(ce));
//						}
					}
				}
			}
	    }
	};
	
	/**
	 * Provides the only tracker instance.
	 */
	public static DataStoreServerTracker getInstance() {
		return INSTANCE;
	}

//	/**
//	 * Checks if a server is running for the specified project.
//	 * @param proj IProject to check
//	 * @return true if the server is marked as running
//	 * @throws CoreException thrown if IProject.getSessionProperty() fails
//	 * @deprecated
//	 */
//	public boolean isRunning(IProject proj) throws CoreException {
//		if(proj == null)
//			return false;
//		if(!proj.isOpen())
//			return false;
//		
//		Object value = proj.getSessionProperty(new QualifiedName(Activator.PLUGIN_ID, RUNNING_PROPERTY));
//		return value != null;
//	}
	
//	/**
//	 * Checks if a server is running.
//	 * @param proj DataStoreServer to check
//	 * @return true if the server is marked as running
//	 * @throws CoreException thrown if IProject.getSessionProperty() fails
//	 * @deprecated
//	 */
//	public boolean isRunning(DataStoreServer server) throws CoreException {
//		if(server == null)
//			return false;
//		
//		IProject proj = server.getDataStore().getJavaProject().getProject();
//		return isRunning(proj);
//	}
	
//	/**
//	 * 
//	 * @param server
//	 * @param value
//	 * @throws CoreException
//	 * @deprecated
//	 */
//	public void setRunning(DataStoreServer server, Boolean value) throws CoreException {
//		if (value != null && value.equals(Boolean.FALSE))
//			value = null;
//		IProject proj = server.getDataStore().getJavaProject().getProject();    
//		proj.setSessionProperty(new QualifiedName(Activator.PLUGIN_ID, RUNNING_PROPERTY), value);
////		HsqldbRunningDecorator.updateDecorators(javaProj);
//	}
	
//	/**
//	 * 
//	 * @param proj
//	 * @param value
//	 * @throws CoreException
//	 * @deprecated
//	 */
//	public void setRunning(IProject proj, Boolean value) throws CoreException {
//		if(proj == null || !proj.isOpen())
//			return;
//		
//		if (value != null && value.equals(Boolean.FALSE))
//			value = null;
//		proj.setSessionProperty(new QualifiedName(Activator.PLUGIN_ID, RUNNING_PROPERTY), value);
////		HsqldbRunningDecorator.updateDecorators(javaProj);
//	}
	
	/**
	 * Starts a server for the data store using Java launch.
	 * @param ds data store
	 * @throws CoreException if launching fails
	 */
	public DataStoreServer startDataStoreServer(DataStore ds, IProgressMonitor monitor) throws CoreException {
		
		if(monitor == null)
			monitor = new NullProgressMonitor();
		
		monitor.beginTask("Starting data store server", 5); // 1 - setup, 3 - launch, 1 - save params
		
		IJavaProject jpr = ds.getJavaProject();
		IProject proj = jpr.getProject();
		
		// Build command-line params
		IDataStoreServerParams params = new DataStoreServerParams(proj);
		
		String database = params.getDatabase();
		int port = params.getPort();
		
		// TODO - extract this to params
		String args = 
			"--database.0 \"" + database + "\" " + // Escape DB path
			"--port " + port + " " +
			"--dbname.0 database --silent false"
			;
		
		monitor.worked(1);
		
		// Start the server as a Java app
		ILaunch launch = HsqldbUtil.launch(jpr, jpr.getElementName() + " data store server", SERVER_CLASS_NAME, args, new BasicMonitor.EclipseSubProgress(monitor, 3));
		
		// Create a server tracking object
		DataStoreServer server = new DataStoreServer(ds, params, launch.getProcesses());
				
		// Save the server process
		//FIXME - if the process is not launched, there will be no processes
		servers.put(launch.getProcesses()[0], server);
		
		// Mark project to have a running server
		//setRunning(proj, Boolean.TRUE);
		
		// Save server parameters to project
		// TODO
		params.save(proj);
		monitor.worked(1);
		
		monitor.done();
		return server;
	}

	/**
	 * Stops the server for data store with a SQL command.
	 * 
	 * @param ds data store
	 * @throws SQLException if JDBC fails
	 */
	public void stopDataStoreServer(DataStore ds, IProgressMonitor monitor) throws SQLException {
		
		if(monitor == null)
			monitor = new NullProgressMonitor();
		
		monitor.beginTask("Stopping data store server", 4); // 1 - open connection, 3 - execute shutdown
		
		Connection conn = ds.getConnection(new BasicMonitor.EclipseSubProgress(monitor, 1));
		if(conn != null) {
			String sql = "SHUTDOWN COMPACT"; // TODO configure this as a property
			Statement stmt = conn.createStatement();
		
			stmt.executeUpdate(sql);
			monitor.worked(3);
			
			stmt.close();
			monitor.worked(1);
		} else {
			monitor.worked(4);
		}
		
		monitor.done();
	}
	
	/**
	 * Stops the data store server with a SQL command.
	 * 
	 * @param server data store server
	 * @throws SQLException if JDBC fails
	 */
	public void stopDataStoreServer(DataStoreServer server, IProgressMonitor monitor) throws SQLException {
		stopDataStoreServer(server.getDataStore(), monitor);
	}
	
	/**
	 * Stops all tracked servers.
	 */
	public void shutdownAllServers(IProgressMonitor monitor) {
		
		if(monitor == null)
			monitor = new NullProgressMonitor();
		
		monitor.beginTask("Stopping all data store servers", servers.values().size()); // 1 per each server
		
		for(DataStoreServer server : servers.values()) {
			try {
				stopDataStoreServer(server, new BasicMonitor.EclipseSubProgress(monitor, 1));
			}
			catch (Exception e) {
				Activator.log(IStatus.ERROR, "Unable to stop all data store servers", e);
			}
		}
		
		monitor.done();
	}
	
	/**
	 * Creates the tracker.
	 */
	private DataStoreServerTracker() {
		DebugPlugin debug = DebugPlugin.getDefault();
		debug.addDebugEventListener(listener);
	}
	
}
