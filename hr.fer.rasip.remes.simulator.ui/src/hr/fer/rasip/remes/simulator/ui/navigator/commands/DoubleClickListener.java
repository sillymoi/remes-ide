package hr.fer.rasip.remes.simulator.ui.navigator.commands;

import hr.fer.rasip.remes.simulator.traces.SimulatorRun;
import hr.fer.rasip.remes.simulator.ui.Activator;
import hr.fer.rasip.remes.simulator.ui.navigator.core.SimulatorDataStoreNavigatorItem;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.IStructuredSelection;

/**
 * Implements a double-click listener that opens a SimulatorRun trace when it's double-clicked
 * in project explorer.
 * 
 * @author Marin Orlic <marin.orlic@fer.hr>
 */
public class DoubleClickListener implements IDoubleClickListener {

	public DoubleClickListener() {}
	
	@Override
	public void doubleClick(DoubleClickEvent event) {
		IStructuredSelection s = (IStructuredSelection) event.getSelection();
		Object obj = s.getFirstElement();
		
		if (obj instanceof SimulatorRun || obj instanceof SimulatorDataStoreNavigatorItem) {
			// Execute command to display traces
			try {
				CommandUtil.executeCommand(DisplayTraceCommand.COMMAND_ID);
			} catch (ExecutionException e) {
				Activator.log(IStatus.WARNING, "Unable to show traces", e);
			}
		}
	}
}
