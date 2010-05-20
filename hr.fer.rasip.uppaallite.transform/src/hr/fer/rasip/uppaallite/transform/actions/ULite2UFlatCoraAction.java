package hr.fer.rasip.uppaallite.transform.actions;

import hr.fer.rasip.uppaallite.transform.ui.NewUflatCoraFileFromUliteCreationWizard;

import java.util.Iterator;

import org.eclipse.core.resources.IFile;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;

public class ULite2UFlatCoraAction  implements IObjectActionDelegate {
	
	private IWorkbenchPart targetPart;

	private ISelection currentSelection;

	/**
	 * Constructor for ULite2UFlatCoraAction.
	 */
	public ULite2UFlatCoraAction() {
		super();
	}

	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		this.targetPart = targetPart;
	}

	public void run(IAction action) {
		// Getting files from selection
		IStructuredSelection iss = (IStructuredSelection)currentSelection;
		for (Iterator<?> iterator = iss.iterator(); iterator.hasNext();) {
			try {
				Wizard wizard = new NewUflatCoraFileFromUliteCreationWizard((IFile)iterator.next());
				WizardDialog dialog = new WizardDialog(getShell(), wizard);
				dialog.create();
				dialog.getShell().setSize(Math.max(500, dialog.getShell().getSize().x),
						500);
				dialog.open();
			} catch (Exception e) {
				e.printStackTrace();
				throw new RuntimeException(e);
			}
		}
	}

	private Shell getShell() {
		return targetPart.getSite().getShell();
	}

	public void selectionChanged(IAction action, ISelection selection) {
		this.currentSelection = selection;
	}
}