/**
 * 
 */
package hr.fer.rasip.remes.simulator.ui.navigator.commands;

import hr.fer.rasip.remes.simulator.traces.SimulatorRun;
import hr.fer.rasip.remes.simulator.ui.Activator;
import hr.fer.rasip.remes.simulator.ui.navigator.core.SimulatorDataStore;
import hr.fer.rasip.remes.simulator.ui.navigator.core.SimulatorDataStoreNavigatorItem;
import hr.fer.rasip.remes.simulator.ui.navigator.core.SimulatorTraceData;

import org.eclipse.core.commands.Command;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.NotEnabledException;
import org.eclipse.core.commands.NotHandledException;
import org.eclipse.core.commands.common.NotDefinedException;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Event;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.commands.ICommandService;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.ui.handlers.IHandlerService;

/**
 * @author Marin Orlic <marin.orlic@fer.hr>
 *
 */
public class CommandUtil {
	
	public static SimulatorDataStore getSimulatorDataStoreFromEvent(ExecutionEvent event) {
		ISelection selection = HandlerUtil.getCurrentSelection(event);
		if (selection != null && selection instanceof IStructuredSelection) {
			IStructuredSelection sel = (IStructuredSelection) selection;
			
			return (SimulatorDataStore) sel.getFirstElement();
		}
		return null;
	}
	
	public static SimulatorTraceData getSimulatorTraceDataFromEvent(ExecutionEvent event) {
		ISelection selection = HandlerUtil.getCurrentSelection(event);
		if (selection != null && selection instanceof IStructuredSelection) {
			IStructuredSelection sel = (IStructuredSelection) selection;
			
			return (SimulatorTraceData) sel.getFirstElement();
		}
		return null;
	}
	
	public static SimulatorRun getSimulatorRunFromEvent(ExecutionEvent event) {
		ISelection selection = HandlerUtil.getCurrentSelection(event);
		if (selection != null && selection instanceof IStructuredSelection) {
			IStructuredSelection sel = (IStructuredSelection) selection;
			
			return (SimulatorRun) sel.getFirstElement();
		}
		return null;
	}

	public static IResource getResourceFromEvent(ExecutionEvent event) {
		ISelection selection = HandlerUtil.getCurrentSelection(event);
		if (selection != null && selection instanceof IStructuredSelection) {
			IStructuredSelection sel = (IStructuredSelection) selection;
			
			return (IResource) sel.getFirstElement();
		}
		return null;
	}
		
	public static SimulatorDataStoreNavigatorItem getNavigatorItemFromEvent(ExecutionEvent event) {
		ISelection selection = HandlerUtil.getCurrentSelection(event);
		if (selection != null && selection instanceof IStructuredSelection) {
			IStructuredSelection sel = (IStructuredSelection) selection;
			
			return (SimulatorDataStoreNavigatorItem) sel.getFirstElement();
		}
		
		return null;
	}

	public static Object executeCommand(String commandId) throws ExecutionException {
		IHandlerService handlerService = (IHandlerService) PlatformUI.getWorkbench().getActiveWorkbenchWindow().getService(IHandlerService.class);
			
		Object result = null;
		try {
			result = handlerService.executeCommand(commandId, null);
		} catch (NotDefinedException e) {
			Activator.log(IStatus.WARNING, "Unable to execute command", e);
		} catch (NotEnabledException e) {
			Activator.log(IStatus.WARNING, "Unable to execute command", e);
		} catch (NotHandledException e) {
			Activator.log(IStatus.WARNING, "Unable to execute command", e);
		}
		
		return result;
	}
}
