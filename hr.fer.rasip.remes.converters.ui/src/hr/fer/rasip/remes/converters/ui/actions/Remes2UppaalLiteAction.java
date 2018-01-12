package hr.fer.rasip.remes.converters.ui.actions;

import hr.fer.rasip.remes.converters.ui.wizards.NewUppaalliteFileFromRemesCreationWizard;

import java.util.Iterator;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IActionDelegate;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;

import se.mdh.progresside.components.core.IArchModel;
import se.mdh.progresside.components.core.IComponent;
import se.mdh.progresside.components.internal.core.ArchModel;

public class Remes2UppaalLiteAction implements IObjectActionDelegate {
	
	private IWorkbenchPart targetPart;

	private ISelection currentSelection;
	
	public Remes2UppaalLiteAction() {
		super();
	}
	
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		this.targetPart = targetPart;
	}

	/**
	 * @see IActionDelegate#selectionChanged(IAction, ISelection)
	 */
	public void selectionChanged(IAction action, ISelection selection) {
		this.currentSelection = selection;
	}

	public void run(IAction action) {		
		// Getting files from selection
		if(this.currentSelection instanceof IStructuredSelection) {
			IStructuredSelection iss = (IStructuredSelection) currentSelection;
			for (Iterator<?> iterator = iss.iterator(); iterator.hasNext();) {
				Object element = iterator.next();
				if (element instanceof IComponent) {
					IArchModel archModel = ArchModel.getForComponent((IComponent) element);
					
					Wizard wizard = new NewUppaalliteFileFromRemesCreationWizard(archModel);
					runWizard(wizard);
					try {
						archModel.getProject().refreshLocal(IProject.DEPTH_INFINITE, null);
					} catch (CoreException e) {
						e.printStackTrace();
					}
				}
			}
		}
	}
	
	private void runWizard(Wizard wizard){
		WizardDialog dialog = new WizardDialog(getShell(), wizard);
		dialog.create();
		dialog.getShell().setSize(Math.max(500, dialog.getShell().getSize().x),
				500);
		dialog.open();
	}


	private Shell getShell() {
		return targetPart.getSite().getShell();
	}
}