/**
 * 
 */
package hr.fer.rasip.remes.simulator.ui.navigator.core;

import hr.fer.rasip.remes.datastore.framework.DataStoreEvent;
import hr.fer.rasip.remes.datastore.framework.DataStoreFactory;
import hr.fer.rasip.remes.datastore.framework.IDataStore;
import hr.fer.rasip.remes.datastore.framework.IDataStoreEventListener;
import hr.fer.rasip.remes.simulator.traces.SimulatorRun;
import hr.fer.rasip.remes.simulator.ui.Activator;

import java.sql.SQLException;
import java.util.List;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.ListenerList;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.PlatformObject;
import org.eclipse.core.runtime.QualifiedName;
import org.eclipse.emf.common.util.BasicMonitor;
import org.eclipse.emf.teneo.hibernate.SessionWrapper;
import org.eclipse.jdt.core.IJavaProject;

/**
 * @author Marin Orlic <marin.orlic@fer.hr>
 * 
 */
public class SimulatorDataStore extends PlatformObject {
		
	private static final String SAVED_TRACE_COUNT = "traces.count";
	private static final QualifiedName SAVED_TRACE_PROPERTY = new QualifiedName(Activator.PLUGIN_ID, SAVED_TRACE_COUNT);
	private static final SimulatorRun[] EMPTY_TRACES = new SimulatorRun[0];
	
	private String name = "Simulator runs";
	private int traceCount = 0;
	private SimulatorRun[] traces = EMPTY_TRACES;
	private IDataStore ds = null;
	private IJavaProject enclosingProject = null;
	
	/**
	 * The collection of data store event listeners.
	 */
	private ListenerList eventListeners = new ListenerList();
	
	/**
	 * Listener to forward data store events.
	 */
	private IDataStoreEventListener listener = new IDataStoreEventListener() {
		
		@Override
		public void handleDataStoreEvent(DataStoreEvent event) {
			SimulatorDataStoreEvent sde = new SimulatorDataStoreEvent(SimulatorDataStore.this, event.getKind());
			fireDataStoreEvent(sde);
		}

	};
	
	/**
	 * Constructs the data store and initializes underlying structures.
	 * @param project
	 */
	public SimulatorDataStore(IJavaProject project) {
		IDataStore ds = DataStoreFactory.getInstance().getForProject(project);
		this.ds = ds;
		this.ds.addDataStoreEventListener(listener);
		this.enclosingProject = project;
		
		IProject proj = project.getProject();
		
		try {
			String value = proj.getPersistentProperty(SAVED_TRACE_PROPERTY);
			if(value != null) {
				this.traceCount = Integer.parseInt(value);
			}
		} catch (CoreException ce) {
			// TODO Auto-generated catch block
			ce.printStackTrace();
		} catch (NumberFormatException nfe) {			
			// TODO Auto-generated catch block
			nfe.printStackTrace();
		}
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * @return the enclosingProject
	 */
	public IProject getProject() {
		return enclosingProject.getProject();
	}

	/**
	 * Loads the traces from data store. Method is public to allow the content provider to manage
	 * data store loading.
	 * @return traces loaded from the data store
	 */
	public SimulatorRun[] loadTracesFromDataStore(IProgressMonitor monitor) {
		
		if(monitor == null)
			monitor = new NullProgressMonitor();
		
		monitor.beginTask("Loading traces from data store", 2); // 1 - open session, 1 - load
		
		SessionWrapper sess = getSession(new BasicMonitor.EclipseSubProgress(monitor, 1));
		
		if(sess == null)
			return EMPTY_TRACES;
		
		try {
			monitor.subTask("Loading traces");

			@SuppressWarnings("unchecked")
			List<SimulatorRun> result = (List<SimulatorRun>) sess.executeQuery("from traces.SimulatorRun");
		
			monitor.worked(1);
			
			if(result != null && !result.isEmpty()) {
				this.traceCount = result.size();
				this.traces = result.toArray(new SimulatorRun[0]);
				
				try {
					this.enclosingProject.getProject().setPersistentProperty(SAVED_TRACE_PROPERTY, Integer.toString(this.traceCount));
				} catch (CoreException e) {
					Activator.log(IStatus.WARNING, "Unable to set trace count property to project metadata", e);
				}
				return this.traces;			
			}
		} finally {
			sess.close();
			monitor.done();
		}
		
		return null;
	}

	public SessionWrapper getSession(IProgressMonitor monitor) {
		return this.ds.getSession(monitor);
	}

	/**
	 * Cleans up the IDataStore.
	 */
	public void dispose(IProgressMonitor monitor) {
		this.ds.removeDataStoreEventListener(listener);
		this.traceCount = 0;
		this.traces = EMPTY_TRACES;
		this.ds.dispose(monitor);
	}

	/**
	 * @return the traceCount
	 */
	public int getTraceCount() {
		return this.traceCount;
	}
	
	/**
	 * Checks if the underlying data store has a server running.
	 * @return true if the data store server is running
	 */
	public boolean isDataStoreServerRunning() {
		return this.ds.isStarted();
	}

	/**
	 * Starts the data store server.
	 * This is a long-running operation and should not be run on UI thread.
	 */
	public void startDataStoreServer(IProgressMonitor monitor) {
		try {
			this.ds.start(monitor);
		} catch (CoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * Stops the data store server.
	 * This is a long-running operation and should not be run on UI thread.
	 */
	public void stopDataStoreServer(IProgressMonitor monitor) {
		try {
			this.ds.stop(monitor);
		} catch (CoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public String getConnectionURL() {
		if(isDataStoreServerRunning()) {
			return this.ds.getConnectionURL();
		} else {
			return "";
		}
	}
	
	/**
	 * Returns the traces cached in this object.
	 * @return the traces
	 */
	public SimulatorRun[] getTraces() {
		return this.traces;
	}
	
	/**
	 * Deletes the traces from this data store.
	 * If the data store is not started, this is a long-running 
	 * operation and should not be run on UI thread.
	 *
	 * @param traces
	 */
	public void deleteTraces(SimulatorRun[] traces, IProgressMonitor monitor) {
		
		if(monitor == null)
			monitor = new NullProgressMonitor();
		
		monitor.beginTask("Deleting traces from data store", 2+traces.length); // 1 - open session, 1 per trace, 1 - commit
		
		if(this.ds != null) {
			SessionWrapper sess = getSession(new BasicMonitor.EclipseSubProgress(monitor, 1));
			try {
				sess.beginTransaction();
				
				for(SimulatorRun run : traces) {
					sess.delete(run);
					monitor.worked(1);
				}
				
				sess.commitTransaction();
				monitor.worked(1);
				
			} catch(Exception e) {
				sess.rollbackTransaction();
				Activator.log(IStatus.ERROR, "Unable to delete traces from data store", e);
			} finally {
				sess.close();
				monitor.done();
			}
		}
	}
	
	/**
	 * Adds an ISimulatorDataStoreEventListener to this data store.
	 * Listener will receive notifications on data store start and stop events.
	 * 
	 * @param listener 
	 */
	public void addDataStoreEventListener(ISimulatorDataStoreEventListener listener) {
		this.eventListeners.add(listener);
	}
	
	/**
	 * Removes an ISimulatorDataStoreEventListener from this data store.
	 * @param listener
	 * @see hr.fer.rasip.remes.datastore.framework.IDataStoreEventListener
	 */
	public void removeDataStoreEventListener(ISimulatorDataStoreEventListener listener) {
		this.eventListeners.remove(listener);
	}

	/**
	 * Fires events to registered listeners.
	 * @param event
	 */
	private void fireDataStoreEvent(SimulatorDataStoreEvent event) {
		Object[] listeners = this.eventListeners.getListeners();
		for (int i = 0; i < listeners.length; ++i) {
			((ISimulatorDataStoreEventListener) listeners[i]).handleDataStoreEvent(event);
		}
	}

	public String getMappingXML() {
		return this.ds.getMappingXML();
	}
}
