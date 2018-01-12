/**
 * 
 */
package hr.fer.rasip.remes.simulator.ui.navigator.commands;

import hr.fer.rasip.remes.simulator.ui.navigator.core.SimulatorDataStore;

import java.util.Iterator;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.handlers.HandlerUtil;

/**
 * @author Marin Orlic <marin.orlic@fer.hr>
 *
 */
public class StartDataStoreServerCommand extends AbstractHandler implements IHandler {

	/**
	 * Identifier for this command.
	 */
	public static final String COMMAND_ID = "hr.fer.rasip.remes.simulator.ui.startServerCommand";
	
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		
		ISelection selection = HandlerUtil.getCurrentSelection(event);
		if (selection != null && selection instanceof IStructuredSelection) {
			IStructuredSelection sel = (IStructuredSelection) selection;

			for (Iterator<SimulatorDataStore> it = sel.iterator(); it.hasNext();) {
				final SimulatorDataStore store = it.next();
				
				Job job = new Job("Starting data store server for project " + store.getProject().getName()) {	

					@Override
					protected IStatus run(IProgressMonitor monitor) {
						store.startDataStoreServer(monitor);
						return Status.OK_STATUS;
					}
					
				};
				
				// Run async
				job.schedule();
			}
		}
		
		return null;
	}

}
