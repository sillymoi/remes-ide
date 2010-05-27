package hr.fer.rasip.remes.launcher.actions;

import java.util.Iterator;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IActionDelegate;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;


public class Remes2JavaAction implements IObjectActionDelegate {
	
	public static final String XFORM_BUNDLE_NAME = "hr.fer.rasip.simulator.remes2java"; //$NON-NLS-1$

	private ISelection currentSelection;
		
	public Remes2JavaAction() {
		super();
	}
	
	@Override
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		
	}

	/**
	 * @see IActionDelegate#selectionChanged(IAction, ISelection)
	 */
	public void selectionChanged(IAction action, ISelection selection) {
		this.currentSelection = selection;
		
		action.setEnabled(Platform.getBundle(XFORM_BUNDLE_NAME) != null);
	}

	public void run(IAction action) {
		// Check if we have M2T available
		if(Platform.getBundle(XFORM_BUNDLE_NAME) == null) 
			return;
		// Getting files from selection
		if(this.currentSelection instanceof IStructuredSelection) {
			IStructuredSelection iss = (IStructuredSelection) currentSelection;
			for (Iterator<?> iterator = iss.iterator(); iterator.hasNext();) {
				Object element = iterator.next();
				if (element instanceof IFile) {
						IFile file = (IFile) element;
						Job job = new Remes2JavaJob("Generating simulator classes for " + file.getName(), file); 
						job.schedule();
				}
			}
		}
	}

}