package se.mdh.progresside.remes.diagram.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ConfigureRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.notation.View;

import se.mdh.progresside.remes.CompositeEntryPoint;
import se.mdh.progresside.remes.CompositeExitPoint;
import se.mdh.progresside.remes.CompositeMode;
import se.mdh.progresside.remes.EntryPoint;
import se.mdh.progresside.remes.ExitPoint;
import se.mdh.progresside.remes.InitPoint;
import se.mdh.progresside.remes.RemesDiagram;
import se.mdh.progresside.remes.RemesFactory;
import se.mdh.progresside.remes.WritePoint;

/**
 * @generated
 */
public class CompositeModeCreateCommand extends EditElementCommand {

	/**
	 * @generated
	 */
	public CompositeModeCreateCommand(CreateElementRequest req) {
		super(req.getLabel(), null, req);
	}

	/**
	 * FIXME: replace with setElementToEdit()
	 * @generated
	 */
	protected EObject getElementToEdit() {
		EObject container = ((CreateElementRequest) getRequest())
				.getContainer();
		if (container instanceof View) {
			container = ((View) container).getElement();
		}
		return container;
	}

	/**
	 * @generated
	 */
	public boolean canExecute() {
		return true;

	}

	/**
	 * @generated NOT
	 */
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor,
			IAdaptable info) throws ExecutionException {
		CompositeMode mode = RemesFactory.eINSTANCE.createCompositeMode();

		InitPoint init = RemesFactory.eINSTANCE.createInitPoint();
		mode.setInitPoint(init);

		WritePoint write = RemesFactory.eINSTANCE.createWritePoint();
		mode.setWritePoint(write);

		EntryPoint entry = RemesFactory.eINSTANCE.createEntryPoint();
		mode.setEntryPoint(entry);

		ExitPoint exit = RemesFactory.eINSTANCE.createExitPoint();
		mode.setExitPoint(exit);

		CompositeEntryPoint centry = RemesFactory.eINSTANCE
				.createCompositeEntryPoint();
		mode.setCompositeEntryPoint(centry);

		CompositeExitPoint cexit = RemesFactory.eINSTANCE
				.createCompositeExitPoint();
		mode.setCompositeExitPoint(cexit);

		RemesDiagram owner = (RemesDiagram) getElementToEdit();
		owner.getModes().add(mode);

		doConfigure(mode, monitor, info);

		((CreateElementRequest) getRequest()).setNewElement(mode);
		return CommandResult.newOKCommandResult(mode);
	}

	/**
	 * @generated
	 */
	protected void doConfigure(CompositeMode newElement,
			IProgressMonitor monitor, IAdaptable info)
			throws ExecutionException {
		IElementType elementType = ((CreateElementRequest) getRequest())
				.getElementType();
		ConfigureRequest configureRequest = new ConfigureRequest(
				getEditingDomain(), newElement, elementType);
		configureRequest.setClientContext(((CreateElementRequest) getRequest())
				.getClientContext());
		configureRequest.addParameters(getRequest().getParameters());
		ICommand configureCommand = elementType
				.getEditCommand(configureRequest);
		if (configureCommand != null && configureCommand.canExecute()) {
			configureCommand.execute(monitor, info);
		}
	}

}
