/**
 * 
 */
package hr.fer.rasip.remes.datastore.framework;

import hr.fer.rasip.remes.datastore.framework.impl.DataStore;

import java.sql.SQLException;
import java.util.HashMap;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;

/**
 * Factory used to create data store objects. Maintains a mapping between
 * DataStore objects and related IJavaProjects. Requesting a data store for
 * the same project more than once will return the same object.
 * 
 * Factory registers a resource change listener to monitor project close/delete
 * events. If a project associated with a data store is closed or deleted, the
 * corresponding data store will be stopped.
 * 
 * @author Marin Orlic <marin.orlic@fer.hr>
 */
public class DataStoreFactory {

	/**
	 * Map between data stores and their related projects.
	 */
	private HashMap<IJavaProject, DataStore> projectDataStoreMap = new HashMap<IJavaProject, DataStore>();

	/**
	 * The only instance.
	 */
	private static DataStoreFactory INSTANCE = null;

	/**
	 * Resource change listener to monitor project close events.
	 */
	private IResourceChangeListener projectListener = new IResourceChangeListener() {
		@Override
		public void resourceChanged(IResourceChangeEvent event) {
			// If the project is about to be closed or deleted, we need to stop the corresponding datastore
			if((event.getType() & IResourceChangeEvent.PRE_CLOSE) > 0
			 ||(event.getType() & IResourceChangeEvent.PRE_DELETE) > 0) {
				IResource res = event.getResource();
				if(res != null && res instanceof IProject) {
					IProject project = (IProject) res;
					IJavaProject jpr = JavaCore.create(project);
					
					if(jpr != null) {
						DataStore dataStore = projectDataStoreMap.get(jpr);
						
						if(dataStore != null) {
							try {
								dataStore.stop(null);
								//projectDataStoreMap.remove(jpr);
							} catch (CoreException e) {
								Activator.log(IStatus.ERROR, "Error occurred when stopping data store", e);
							} catch (ClassNotFoundException e) {
								Activator.log(IStatus.ERROR, "Error occurred when stopping data store", e);
							} catch (SQLException e) {
								Activator.log(IStatus.ERROR, "Error occurred when stopping data store", e);
							}
						}
					}
				}
			}
			
//			StringBuilder type = new StringBuilder("");
//			if((event.getType() & IResourceChangeEvent.POST_BUILD) > 0)
//				type.append("POST_BUILD ");
//	
//			if((event.getType() & IResourceChangeEvent.POST_CHANGE) > 0) 
//				type.append("POST_CHANGE ");
//				
//			if((event.getType() & IResourceChangeEvent.PRE_BUILD) > 0)
//				type.append("PRE_BUILD ");
//				
//			if((event.getType() & IResourceChangeEvent.PRE_CLOSE) > 0)
//				type.append("PRE_CLOSE ");
//	
//			if((event.getType() & IResourceChangeEvent.PRE_REFRESH) > 0)
//				type.append("PRE_REFRESH ");
//	
//			if((event.getType() & IResourceChangeEvent.PRE_DELETE) > 0)
//				type.append("PRE_DELETE ");
//			
//			System.out.println(type + ": " + event);
		}
	};

	/**
	 * Constructs the factory and registers a resource change listener.
	 */
	private DataStoreFactory() {
		ResourcesPlugin.getWorkspace().addResourceChangeListener(projectListener,
			IResourceChangeEvent.PRE_CLOSE | IResourceChangeEvent.PRE_DELETE | IResourceChangeEvent.POST_CHANGE | IResourceChangeEvent.PRE_REFRESH);
	}
	
	/**
	 * Provides the only factory instance.
	 */
	public static DataStoreFactory getInstance() {
		if(INSTANCE == null)
			INSTANCE = new DataStoreFactory();
		
		return INSTANCE;
	}

	/**
	 * Retrieves or creates a data store associated with a project.
	 * 
	 * @param project
	 * @return corresponding data store.
	 */
	public IDataStore getForProject(IJavaProject project) {
		DataStore dataStore = projectDataStoreMap.get(project);
		
		if(dataStore == null) {
			dataStore = new DataStore(project);
			projectDataStoreMap.put(project, dataStore);
		}
		
		return dataStore;
	}
	
}
