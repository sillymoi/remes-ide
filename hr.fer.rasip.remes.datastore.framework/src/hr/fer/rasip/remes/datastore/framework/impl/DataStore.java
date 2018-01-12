/**
 * 
 */
package hr.fer.rasip.remes.datastore.framework.impl;

import hr.fer.rasip.remes.datastore.framework.Activator;
import hr.fer.rasip.remes.datastore.framework.DataStoreEvent;
import hr.fer.rasip.remes.datastore.framework.IDataStore;
import hr.fer.rasip.remes.datastore.framework.IDataStoreEventListener;
import hr.fer.rasip.remes.datastore.framework.registry.ModelDescriptor;
import hr.fer.rasip.remes.datastore.framework.registry.ModelsRegistry;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Properties;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.ListenerList;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.BasicMonitor;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.teneo.extension.ExtensionManager;
import org.eclipse.emf.teneo.hibernate.HbDataStore;
import org.eclipse.emf.teneo.hibernate.HbHelper;
import org.eclipse.emf.teneo.hibernate.SessionWrapper;
import org.eclipse.emf.teneo.mapping.strategy.EntityNameStrategy;
import org.eclipse.emf.teneo.mapping.strategy.impl.QualifyingEntityNameStrategy;
import org.eclipse.jdt.core.IJavaProject;
import org.hibernate.cfg.Environment;

/**
 * Data store implementation.
 * 
 * @author Marin Orlic <marin.orlic@fer.hr>
 */
public class DataStore implements IDataStore {

	/**
	 * Java project containing this data store.
	 */
	private IJavaProject enclosingProject = null;
	
	/**
	 *  Underlying Teneo data store for mapping. 
	 */
	private HbDataStore hbDataStore = null;
	
	/**
	 * Underlying server.
	 */
	private DataStoreServer server = null;
	
	/**
	 * Flag marking if the data store is started. 
	 */
	private boolean isStarted = false;
	
	/**
	 * The collection of data store event listeners.
	 */
	private ListenerList eventListeners = new ListenerList();
	
	/**
	 * Create a data store object for the specified project.
	 * Data store is a reference object, it's creation has nothing to do with actual
	 * underlying database creation. Database is created when data store is first started.
	 * @param project
	 */
	public DataStore(IJavaProject project) {
		this.enclosingProject = project;
		//System.out.println("Created data store " + this + " for project " + project);
	}
	
	/**
	 * Disposes of this data store, automatically stopping it if necessary. 
	 */
	@Override
	public void dispose(IProgressMonitor monitor) {
		try {
			stop(monitor);
			//System.out.println("Disposing DataStore " + this);
		} catch (CoreException e) {
			Activator.log(IStatus.ERROR, "Error occurred when stopping data store in dispose", e);
		} catch (ClassNotFoundException e) {
			Activator.log(IStatus.ERROR, "Error occurred when stopping data store in dispose", e);
		} catch (SQLException e) {
			Activator.log(IStatus.ERROR, "Error occurred when stopping data store in dispose", e);
		}
	}

	/**
	 * Starts the data store database server. EMF packages that have been registered via
	 * the models extension point are added to the underlying Teneo data store.
	 */
	public void start(IProgressMonitor monitor) throws CoreException {
		if(monitor == null)
			monitor = new NullProgressMonitor();
		
		monitor.beginTask("Starting data store", 1); // 1 - start server
		if(!isStarted()) {
			this.server = DataStoreServerTracker.getInstance().startDataStoreServer(this, new BasicMonitor.EclipseSubProgress(monitor, 1));	
			
			if(!monitor.isCanceled()) {
				setStarted(true);
				
				// Notify event listeners
				notifyStart();
			}
		}
		
		monitor.done();
	}

	/**
	 * Stop the data store database server.
	 */
	public void stop(IProgressMonitor monitor) throws CoreException, ClassNotFoundException, SQLException {
		if(monitor == null)
			monitor = new NullProgressMonitor();
		
		monitor.beginTask("Starting data store", 2); // 1 - Stop data store, 1 - stop server
		if(isStarted()) {
			if(this.hbDataStore != null) {
				this.hbDataStore.close();
			}
			monitor.worked(1);
			
			DataStoreServerTracker.getInstance().stopDataStoreServer(this, new BasicMonitor.EclipseSubProgress(monitor, 1));
			// notifyServerStopped() will take care of the cleanup 
		}
		
		monitor.done();
	}

	/**
	 * Used by DataStoreServerTracker to notify this data store that the server was stopped.
	 */
	protected void notifyServerStopped() {
		setStarted(false);
		
		// Perhaps it doesn't make much sense trying to close a Hibernate data store when the server is down
		// ... but still
		if(this.hbDataStore != null) {
			this.hbDataStore.close();
			
			// Deregister data store
			HbHelper.INSTANCE.deRegisterDataStore(this.hbDataStore);
		}
		
		this.hbDataStore = null;
		this.server = null;
		
		// Notify event listeners
		notifyStop();
	}
	
	/**
	 * Checks if the data store server is started.
	 * @return true if the data store is running the server.
	 */
	public boolean isStarted() {
		return this.isStarted;
	}

	/**
	 * Sets the isStarted flag
	 * @param started value to set
	 */
	protected void setStarted(boolean started) {
		this.isStarted = started;
	}
	
	/**
	 * Fires events to registered listeners.
	 * @param event
	 */
	private void fireDataStoreEvent(DataStoreEvent event) {
		Object[] listeners = eventListeners.getListeners();
		for (int i = 0; i < listeners.length; ++i) {
			((IDataStoreEventListener) listeners[i]).handleDataStoreEvent(event);
		}
	}

	/**
	 * Registers a listener for events on this datastore.
	 */
	@Override
	public void addDataStoreEventListener(IDataStoreEventListener listener) {
		eventListeners.add(listener);
	}
	
	/**
	 * Unregisters a listener for events on this datastore.
	 */
	@Override
	public void removeDataStoreEventListener(IDataStoreEventListener listener) {
		eventListeners.remove(listener);
	}

	/**
	 * Fires notification of data store start event.
	 */
	private void notifyStart() {
		DataStoreEvent event = new DataStoreEvent(this, DataStoreEvent.STARTED);
		
		fireDataStoreEvent(event);
	}
	
	/**
	 * Fires notification of data store stop event.
	 */
	private void notifyStop() {
		DataStoreEvent event = new DataStoreEvent(this, DataStoreEvent.STOPPED);
		
		fireDataStoreEvent(event);
	}

	@Override
	public String getConnectionURL() {
		return getConnectionURL(this.server.getParams());
	}

	// Should this go into params or server? 
	// TODO:refactor server and/or params to make it DB-independent
	protected String getConnectionURL(IDataStoreServerParams params) {
		return "jdbc:hsqldb:hsql://localhost:" + params.getPort() + "/database";
	}
	
	@Override
	public Connection getConnection(IProgressMonitor monitor) {
	
		if(monitor == null)
			monitor = new NullProgressMonitor();
		
		monitor.beginTask("Opening connection to data store", 2); // 1 - Start data store, 1 - open connection
		
		Connection conn = null;
		if(!isStarted()) {
			try {
				start(new BasicMonitor.EclipseSubProgress(monitor, 1));
			} catch (CoreException e) {
				Activator.log(IStatus.ERROR, "Unable to start data store", e);
			}
		}
		
		if(isStarted() && !monitor.isCanceled()) {
			try {
				IDataStoreServerParams params = this.server.getParams();
				
				// Create a JDBC connection
				Class.forName("org.hsqldb.jdbcDriver");
				String url = getConnectionURL(params);
				conn = DriverManager.getConnection(url, params.getUser(), params.getPasswd());				
			} catch (ClassNotFoundException e) {
				Activator.log(IStatus.ERROR, "Unable to load JDBC driver", e);
			} catch (SQLException e) {
				Activator.log(IStatus.ERROR, "Error opening JDBC connection to data", e);
			} finally {
				monitor.worked(1); // We're almost done
			}
		}
		
		monitor.done();
		return conn;
	}

	/**
	 * Returns a Hibernate session to the data store. Store will be started and session
	 * will be initialized if necessary.
	 */
	@Override
	public SessionWrapper getSession(IProgressMonitor monitor) {
		
		if(monitor == null)
			monitor = new NullProgressMonitor();
		
		monitor.beginTask("Opening session with data store", 3); // 1 - Start data store, 2 - open session
		
		SessionWrapper sess = null;
		
		if(!isStarted()) {
			try {
				start(new BasicMonitor.EclipseSubProgress(monitor, 1));
			} catch (CoreException e) {
				Activator.log(IStatus.ERROR, "Unable to start data store", e);
			}
		}
		
		monitor.worked(1);
		if(isStarted() && !monitor.isCanceled()) {
			sess = getHbDataStore(new BasicMonitor.EclipseSubProgress(monitor, 1)).createSessionWrapper();
		}
		monitor.worked(1);
		
		monitor.done();
		return sess;
	}

	/**
	 * Creates and initializes a Teneo HbDataStore 
	 * @return
	 */
	private HbDataStore getHbDataStore(IProgressMonitor monitor) {

		if(monitor == null)
			monitor = new NullProgressMonitor();
		
		/* 1 - create data store
		 * 1 - register models
		 * 3 - initialize (build mappings and data structure)
		 */
		monitor.beginTask("Creating data store", 5); 
		
		if(this.hbDataStore == null) {
			IDataStoreServerParams params = this.server.getParams();

			// Set the database information, Environment is org.hibernate.cfg.Environment
			final Properties props = new Properties();
			props.setProperty(Environment.DRIVER, "org.hsqldb.jdbcDriver"); // TODO move this to params
			props.setProperty(Environment.URL, getConnectionURL(params));
			props.setProperty(Environment.USER, params.getUser());
			props.setProperty(Environment.PASS, params.getPasswd());
			props.setProperty(Environment.DIALECT, org.hibernate.dialect.HSQLDialect.class.getName());

			props.setProperty(org.eclipse.emf.teneo.PersistenceOptions.AUTO_ADD_REFERENCED_EPACKAGES, "true");
			
			// Create and initialize the HbDataStore
			HbDataStore hbStore = HbHelper.INSTANCE.createRegisterDataStore(this.enclosingProject.getProject().getName() + "Datastore");
			
			monitor.worked(1);
			
			// Get the extension manager used by the data store 
			final ExtensionManager extensionManager = hbStore.getExtensionManager();
			 
			// Set the custom extension using the ExtensionPoint name and the 
			// class name of the custom ExtensionPoint. Note all names are fully qualified!
			extensionManager.registerExtension(EntityNameStrategy.class.getName(), QualifyingEntityNameStrategy.class.getName());
			
			monitor.subTask("Registering packages");
			
			// Register packages
			ModelDescriptor[] models = ModelsRegistry.getInstance().getModelDescriptors();
			if(models.length > 0) {
				ArrayList<EPackage> packages = new ArrayList<EPackage>(models.length);
				for(int i=0; i<models.length; i++) {
					EPackage ePackage = EPackage.Registry.INSTANCE.getEPackage(models[i].getNsURI());
					if(ePackage != null) {
						packages.add(ePackage);
					} else {
						Activator.log(IStatus.WARNING, "Registered EPackage not found: " + models[i].getNsURI());
					}
				}
				
				EPackage[] pkgs = new EPackage[packages.size()];
				hbStore.setEPackages(packages.toArray(pkgs));
			}
			
			monitor.worked(1);
			
			if(!monitor.isCanceled()) {
				monitor.subTask("Initializing data store");
				hbStore.setProperties(props);
				hbStore.initialize();
				this.hbDataStore = hbStore;
				
				monitor.worked(3);
			} else {
				HbHelper.INSTANCE.deRegisterDataStore(hbStore);
				this.hbDataStore = null;
			}
			
			
			//this.test();
		} else {
			monitor.worked(5);
		}
		
		monitor.done();
		
		return this.hbDataStore;
	}
	
	/**
	 * Returns the associated project.
	 * @return java project
	 */
	protected IJavaProject getJavaProject() {
		return this.enclosingProject;
	}

	/**
	 * Retrieves the mapping XML (HBM) for the O/R mapper. The mapping XML is
	 * defined only if the data store has an associated HbDataStore which was
	 * initialized previously.
	 * 
	 * @return XML defining O/R mapping (Hibernate HBM)
	 */
	@Override
	public String getMappingXML() {
		if(this.hbDataStore != null && this.hbDataStore.isInitialized()) {
			return this.hbDataStore.getMappingXML();
		} else {
			return "";
		}
	}

//	protected DataStoreServer getServer() {
//		return this.server;
//	}
}