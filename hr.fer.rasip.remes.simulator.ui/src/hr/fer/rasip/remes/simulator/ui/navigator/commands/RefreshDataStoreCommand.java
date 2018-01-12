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
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredViewer;
import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.ui.navigator.CommonNavigator;

/**
 * Refresh command for common navigator, activated on SimulatorDataStore objects.
 * 
 * @author Marin Orlic <marin.orlic@fer.hr>
 *
 */
public class RefreshDataStoreCommand extends AbstractHandler implements IHandler {

	/**
	 * Identifier for this command.
	 */
	public static final String COMMAND_ID = "org.eclipse.ui.file.refresh";
	
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		
		IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindow(event);
		IWorkbenchPage page = window.getActivePage();
		CommonNavigator nav = (CommonNavigator) page.findView(IPageLayout.ID_PROJECT_EXPLORER);
		StructuredViewer viewer = (StructuredViewer) nav.getCommonViewer();
		
		ISelection selection = HandlerUtil.getCurrentSelection(event);
		if (selection != null && selection instanceof IStructuredSelection) {
			IStructuredSelection sel = (IStructuredSelection) selection;

			for (Iterator<SimulatorDataStore> it = sel.iterator(); it.hasNext();) {
				viewer.refresh(it.next());
			}
		}
	
		return null;
	}
}
