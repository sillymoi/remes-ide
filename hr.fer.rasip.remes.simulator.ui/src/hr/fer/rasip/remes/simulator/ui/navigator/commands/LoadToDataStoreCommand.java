/**
 * 
 */
package hr.fer.rasip.remes.simulator.ui.navigator.commands;

import hr.fer.rasip.remes.datastore.framework.DataStoreFactory;
import hr.fer.rasip.remes.datastore.framework.IDataStore;
import hr.fer.rasip.remes.simulator.ui.Activator;

import java.io.IOException;
import java.util.Collections;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.WorkspaceJob;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.BasicMonitor;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.teneo.hibernate.SessionWrapper;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;

/**
 * @author Marin Orlic <marin.orlic@fer.hr>
 *
 */
public class LoadToDataStoreCommand extends AbstractHandler implements IHandler {

	/**
	 * Identifier for this command.
	 */
	public static final String COMMAND_ID = "hr.fer.rasip.remes.simulator.ui.loadToDataStoreCommand";
	
	/**
	 * Loads trace data from a IResource (file) to data store
	 * @see org.eclipse.core.commands.IHandler#execute(org.eclipse.core.commands.ExecutionEvent)
	 */
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		final IResource res = CommandUtil.getResourceFromEvent(event);
		final IProject proj = res.getProject();
		final IJavaProject jpr = JavaCore.create(proj);
		
		if(res != null && jpr != null) {
			
			WorkspaceJob job = new WorkspaceJob("Loading traces to data store") {
				
				@Override
				public IStatus runInWorkspace(IProgressMonitor monitor) throws CoreException {
					
					if(monitor == null)
						monitor = new NullProgressMonitor();
					
					/**
					 * 1 - load resource
					 * 1 - load EMF objects
					 * 2 - open session
					 * 2 - persist traces
					 */
					monitor.beginTask("Loading trace file to data store", 6);
					
					ResourceSet rs = new ResourceSetImpl();
					Resource model = rs.getResource(URI.createPlatformResourceURI(res.getFullPath().toString(), false), true);
					
					monitor.worked(1);
					
					try {
						model.load(Collections.EMPTY_MAP);
						EList<EObject> contents = model.getContents();
					
						monitor.worked(1);
						
						// Get data store for project - might cause the server to start
						IDataStore ds = DataStoreFactory.getInstance().getForProject(jpr);
						SessionWrapper sess = ds.getSession(new BasicMonitor.EclipseSubProgress(monitor, 2));
						
						try {
							// Load the traces
							sess.beginTransaction();
							
							for(EObject obj : contents) {
								sess.persist(obj);
							}
							monitor.worked(1);
							
							sess.commitTransaction();
						} catch(Exception e) {
							sess.rollbackTransaction();
							Activator.log(IStatus.ERROR, "Storing traces to data store failed", e);
						} finally {
							sess.close();
							monitor.worked(1);
						}
						
					} catch (IOException e) {
						Activator.log(IStatus.ERROR, "Unable to load trace file", e);
					} 
			
					monitor.done();
					return Status.OK_STATUS;
				}
			};
			
			// Run async
			job.schedule();
		}
		
		return null;
	}
}