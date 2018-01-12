/**
 * 
 */
package hr.fer.rasip.remes.simulator.ui.navigator.core.providers;

import hr.fer.rasip.remes.simulator.traces.SimulatorRun;
import hr.fer.rasip.remes.simulator.ui.Activator;
import hr.fer.rasip.remes.simulator.ui.navigator.core.ISimulatorDataStoreEventListener;
import hr.fer.rasip.remes.simulator.ui.navigator.core.SimulatorDataStore;
import hr.fer.rasip.remes.simulator.ui.navigator.core.SimulatorDataStoreEvent;
import hr.fer.rasip.remes.simulator.ui.navigator.core.SimulatorDataStoreNavigatorItem;
import hr.fer.rasip.remes.simulator.ui.navigator.core.SimulatorTraceData;
import hr.fer.rasip.remes.simulator.ui.navigator.decorator.SimulatorDataStoreRunningDecorator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.resources.WorkspaceJob;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.BasicMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jface.viewers.StructuredViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonContentProvider;

/**
 * @author Marin Orlic <marin.orlic@fer.hr>
 *
 */
public class SimulatorDataStoreContentProvider implements ICommonContentProvider, IResourceChangeListener {

	private static final Object[] EMPTY_ARRAY = new Object[0];

	private Viewer viewer = null;
	
	private HashMap<IJavaProject, SimulatorDataStore> projectDataStoreMap = new HashMap<IJavaProject, SimulatorDataStore>();
	
	private ISimulatorDataStoreEventListener listener = new ISimulatorDataStoreEventListener() {
		
		@Override
		public void handleDataStoreEvent(SimulatorDataStoreEvent event) {
			// Refresh the project (runs in UI thread)
			SimulatorDataStoreContentProvider.this.refreshViewer((SimulatorDataStore) event.getSource()); // refresh viewer
			SimulatorDataStoreRunningDecorator.updateDecorators((SimulatorDataStore) event.getSource()); // refresh decorator
			System.out.println("Content - Refresh on SDS event");
		}

	};
	
	AdapterFactoryContentProvider adapterFactoryContentProvier 
						= new AdapterFactoryContentProvider(Activator.getDefault().getItemProvidersAdapterFactory());
	
	/**
	 * Constructor registers a resource change listener.
	 */
	public SimulatorDataStoreContentProvider() {
		ResourcesPlugin.getWorkspace().addResourceChangeListener(this, IResourceChangeEvent.POST_CHANGE);	
	}
	
	/**
	 * Returns the children of the selected element
	 * @see org.eclipse.jface.viewers.ITreeContentProvider#getChildren(java.lang.Object)
	 */
	@Override
	public Object[] getChildren(Object parentElement) {
		if (parentElement instanceof IProject) {
			IProject project = (IProject) parentElement;
			
			if(!project.isOpen()) {
				return EMPTY_ARRAY;
			}
			
			IJavaProject jpr = JavaCore.create((IProject) parentElement);
			if(jpr == null) {
				return EMPTY_ARRAY;
			}
			SimulatorDataStore dataStore = getDataStoreForProject(jpr);
			
			System.out.println("Content - Project");
			return new SimulatorDataStore[]{ dataStore };
		}
		if (parentElement instanceof SimulatorDataStore) {
			System.out.println("Content - Store");
			
			final SimulatorDataStore dataStore = (SimulatorDataStore) parentElement;
			
			if(dataStore.isDataStoreServerRunning()) {
				dataStore.loadTracesFromDataStore(null);
			} else {
				WorkspaceJob job = new WorkspaceJob("Starting data store") {
					
					@Override
					public IStatus runInWorkspace(IProgressMonitor monitor) throws CoreException {
						if(monitor == null)
							monitor = new NullProgressMonitor();
						
						// 10 = load, 1 = refresh
						monitor.beginTask("Loading traces from data store", 11);
						
						try {
							dataStore.loadTracesFromDataStore(new BasicMonitor.EclipseSubProgress(monitor, 10));
							
							// Refresh the project (runs in UI thread)
							SimulatorDataStoreContentProvider.this.refreshViewer(dataStore); // refresh viewer
							SimulatorDataStoreRunningDecorator.updateDecorators(dataStore); // refresh decorator
							
							System.out.println("Content - Refresh on load in job");
						} catch(Exception e) {
							e.printStackTrace();
						}
						
						monitor.worked(1);
						monitor.done();
						
						return Status.OK_STATUS;
					}
				};
				
				job.schedule();
			}
			
			return wrapEObjects(dataStore.getTraces(), dataStore, dataStore);
		} else if (parentElement instanceof SimulatorTraceData) {
			System.out.println("Content - Trace");
		    return EMPTY_ARRAY;
		} else if (parentElement instanceof SimulatorRun) {
			System.out.println("Content - Run");
			return EMPTY_ARRAY;
		} else if (parentElement instanceof SimulatorDataStoreNavigatorItem) {
			System.out.println("Content - NavItem");
			//return EMPTY_ARRAY;
			SimulatorDataStoreNavigatorItem navi = (SimulatorDataStoreNavigatorItem) parentElement;
			return wrapEObjects(
					adapterFactoryContentProvier
							.getChildren(((SimulatorDataStoreNavigatorItem) parentElement)
									.getEObject()), parentElement, navi.getDataStore());			
		}
		return EMPTY_ARRAY;
	}

	private SimulatorDataStore getDataStoreForProject(IJavaProject project) {
		SimulatorDataStore dataStore = this.projectDataStoreMap.get(project);
		
		if(dataStore == null) {
			dataStore = createDataStore(project);
			this.projectDataStoreMap.put(project, dataStore);
			dataStore.addDataStoreEventListener(listener);
		}

		return dataStore;
	}

	/**
	 * Init code for empty model
	 */
	private SimulatorDataStore createDataStore(IJavaProject project) {
		SimulatorDataStore dataStore = new SimulatorDataStore(project);
		
		return dataStore;
	}

	/**
	 * Returns the parent of the selected element
	 * @see org.eclipse.jface.viewers.ITreeContentProvider#getParent(java.lang.Object)
	 */
	@Override
	public Object getParent(Object element) {
		if (element instanceof SimulatorTraceData) {
			return ((SimulatorTraceData) element).getDataStore();
		} 
		if (element instanceof SimulatorDataStoreNavigatorItem) {
			return ((SimulatorDataStoreNavigatorItem) element).getParent();
		}
		return null;
	}

	/**
	 * Checks if the current element has children
	 * @see org.eclipse.jface.viewers.ITreeContentProvider#hasChildren(java.lang.Object)
	 */
	@Override
	public boolean hasChildren(Object element) {
		System.out.println("Has children - " + element.toString());
		return (element instanceof SimulatorDataStore);
	}

	/**
	 * Returns the elements to be displayed in the viewer
	 * @see org.eclipse.jface.viewers.IStructuredContentProvider#getElements(java.lang.Object)
	 */
	@Override
	public Object[] getElements(Object inputElement) {
		System.out.println("getElements - " + inputElement.toString());
		return getChildren(inputElement);
	}

	/**
	 * Disposes the data store
	 * @see org.eclipse.jface.viewers.IContentProvider#dispose()
	 */
	@Override
	public void dispose() {
		for(SimulatorDataStore ds : this.projectDataStoreMap.values()) {
			ds.dispose(null);
		}
		ResourcesPlugin.getWorkspace().removeResourceChangeListener(this);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.jface.viewers.IContentProvider#inputChanged(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
	 */
	@Override
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		this.viewer = viewer;
	}

	/**
	 * Resource change listener for project, triggers a viewer refresh for the data store when a project change occurs.
	 */
	@Override
	public void resourceChanged(IResourceChangeEvent event) {
		// Check to see if our projects are affected
		IResourceDelta delta = event.getDelta();
		boolean shouldRefresh = false;
		if(delta != null) {
			for(IJavaProject jpr : this.projectDataStoreMap.keySet()) {
				IProject proj = jpr.getProject();
				
				if(delta.findMember(proj.getFullPath()) != null) {
					shouldRefresh = true;
					break;
				}
			}
			if(shouldRefresh) {
				if(this.viewer instanceof StructuredViewer) { // Can make this a bit more optimized?
					for(final SimulatorDataStore store : this.projectDataStoreMap.values()) {
						Display.getDefault().asyncExec(new Runnable() {

							@Override
							public void run() {
								((StructuredViewer) SimulatorDataStoreContentProvider.this.viewer).refresh(store, true);
							}
						});
					}
				} else {
					this.viewer.refresh();
				}
			}
		}
	}

	@Override
	public void init(ICommonContentExtensionSite aConfig) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void restoreState(IMemento aMemento) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void saveState(IMemento aMemento) {
		// TODO Auto-generated method stub
		
	}
	
	/**
	 * Refreshes the viewer using Display.asyncExec()
	 * @param store
	 */
	private void refreshViewer(final SimulatorDataStore store) {
		if(this.viewer instanceof StructuredViewer) {
			Display.getDefault().asyncExec(new Runnable() {

				@Override
				public void run() {
					((StructuredViewer) SimulatorDataStoreContentProvider.this.viewer).refresh(store, true);
				}
			});
		} else {
			this.viewer.refresh();
		}
		System.out.println("Content - refreshVwr() called");
	}
	
	/**
	 * Wraps EMF EObjects to SimulatorDataStoreNavigatorItems
	 */
	public Object[] wrapEObjects(Object[] objects, Object parentElement, SimulatorDataStore ds) {
		Collection<SimulatorDataStoreNavigatorItem> result = new ArrayList<SimulatorDataStoreNavigatorItem>();
		for (int i = 0; i < objects.length; i++) {
			if (objects[i] instanceof EObject) {
				result.add(new SimulatorDataStoreNavigatorItem(
						(EObject) objects[i], parentElement,
						adapterFactoryContentProvier, ds));
			}
		}
		return result.toArray();
	}
}
