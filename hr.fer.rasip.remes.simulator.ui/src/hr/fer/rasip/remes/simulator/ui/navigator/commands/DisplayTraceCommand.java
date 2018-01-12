/**
 * 
 */
package hr.fer.rasip.remes.simulator.ui.navigator.commands;

import hr.fer.rasip.remes.simulator.traces.SimulatorRun;
import hr.fer.rasip.remes.simulator.ui.Activator;
import hr.fer.rasip.remes.simulator.ui.views.TraceDisplayView;
import hr.fer.rasip.remes.simulator.ui.navigator.core.SimulatorDataStoreNavigatorItem;
import hr.fer.rasip.remes.simulator.ui.navigator.core.SimulatorTraceData;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.handlers.HandlerUtil;

/**
 * Opens a selected simulator trace in a SampleView.
 * A command for common navigator, activated on SimulatorDataStore objects.
 * 
 * @author Marin Orlic <marin.orlic@fer.hr>
 *
 */
public class DisplayTraceCommand extends AbstractHandler implements IHandler {

	/**
	 * Identifier for this command.
	 */
	public static final String COMMAND_ID = "hr.fer.rasip.remes.simulator.ui.displayTraceCommand";
	
	/**
	 * @see org.eclipse.core.commands.IHandler#execute(org.eclipse.core.commands.ExecutionEvent)
	 */
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindow(event);
		IWorkbenchPage page = window.getActivePage();

		try {
			ISelection selection = HandlerUtil.getCurrentSelection(event);
			if (selection != null && selection instanceof IStructuredSelection) {
				IStructuredSelection sel = (IStructuredSelection) selection;
				
				if(sel.getFirstElement() instanceof SimulatorRun) {
					SimulatorRun trace = (SimulatorRun) sel.getFirstElement();
					TraceDisplayView view = (TraceDisplayView) page.showView(TraceDisplayView.ID, Integer.toString(trace.getId()), IWorkbenchPage.VIEW_ACTIVATE);
//					view.initialize(trace);
				} else if (sel.getFirstElement() instanceof SimulatorDataStoreNavigatorItem) {
					SimulatorDataStoreNavigatorItem navi = (SimulatorDataStoreNavigatorItem) sel.getFirstElement();
					EObject obj = navi.getEObject();
					
					if(obj instanceof SimulatorRun) {
						SimulatorRun trace = (SimulatorRun) obj;
						TraceDisplayView view = (TraceDisplayView) page.showView(TraceDisplayView.ID, Integer.toString(trace.getId()), IWorkbenchPage.VIEW_ACTIVATE);
						view.initialize(navi.getDataStore(), trace.getId());
					}
				}
				
			}
		} catch (PartInitException e) {
			Activator.log(IStatus.ERROR, "Unable to display trace in a view",e);
		}

		return null;
	}

}
