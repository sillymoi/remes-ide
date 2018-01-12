/**
 * 
 */
package hr.fer.rasip.remes.simulator.ui.navigator.commands;

import java.util.Iterator;

import hr.fer.rasip.remes.simulator.traces.SimulatorRun;
import hr.fer.rasip.remes.simulator.ui.Activator;
import hr.fer.rasip.remes.simulator.ui.navigator.core.SimulatorDataStore;
import hr.fer.rasip.remes.simulator.ui.navigator.core.SimulatorDataStoreNavigatorItem;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.resources.WorkspaceJob;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.BasicMonitor;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredViewer;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.ui.navigator.CommonNavigator;

/**
 * @author Marin Orlic <marin.orlic@fer.hr>
 *
 */
public class DeleteTraceCommand extends AbstractHandler implements IHandler {

	/**
	 * Identifier for this command.
	 */
	public static final String COMMAND_ID = "org.eclipse.ui.edit.delete";
	
	
	/* (non-Javadoc)
	 * @see org.eclipse.core.commands.IHandler#execute(org.eclipse.core.commands.ExecutionEvent)
	 */
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		final SimulatorDataStoreNavigatorItem navi = CommandUtil.getNavigatorItemFromEvent(event);

		IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindow(event);
		IWorkbenchPage page = window.getActivePage();
		CommonNavigator nav = (CommonNavigator) page.findView(IPageLayout.ID_PROJECT_EXPLORER);
		final StructuredViewer viewer = (StructuredViewer) nav.getCommonViewer();
		
		if(navi != null && navi.getEObject() instanceof SimulatorRun) {
			
			WorkspaceJob job = new WorkspaceJob("Deleting traces from data store") {
				
				@Override
				public IStatus runInWorkspace(IProgressMonitor monitor) throws CoreException {

					monitor.beginTask("Deleting traces", 2); // 1 - delete, 1 - refresh

					try {
						// Open Hibernate session 
						final SimulatorDataStore sds = navi.getDataStore();

						sds.deleteTraces(new SimulatorRun[] { (SimulatorRun) navi.getEObject() }, new BasicMonitor.EclipseSubProgress(monitor, 1));
						
						Display.getDefault().asyncExec(new Runnable() {

							@Override
							public void run() {
								viewer.refresh(sds);
							}
						});
						
						monitor.worked(1);
												
					} catch (Exception e) {
						Activator.log(IStatus.ERROR, "Deleting traces from data store failed", e);
					} finally {
						monitor.done();
					}
					
					return Status.OK_STATUS;
				}
			};
			
			// Run async
			job.schedule();
		}
		
		return null;
	}
}
