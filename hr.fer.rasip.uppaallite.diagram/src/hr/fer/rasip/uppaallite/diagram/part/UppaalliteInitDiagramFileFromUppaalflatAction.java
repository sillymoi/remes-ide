package hr.fer.rasip.uppaallite.diagram.part;

import hr.fer.rasip.uppaallite.diagram.edit.parts.UppaalDiagramEditPart;
import hr.fer.rasip.uppaallite.transform.UppaalConverter;

import java.util.Iterator;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gmf.runtime.emf.core.GMFEditingDomainFactory;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.osgi.util.NLS;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;

public class UppaalliteInitDiagramFileFromUppaalflatAction implements IObjectActionDelegate {
	
	private IWorkbenchPart targetPart;

	private ISelection currentSelection;

	/**
	 * Constructor for Action1.
	 */
	public UppaalliteInitDiagramFileFromUppaalflatAction() {
		super();
	}

	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		this.targetPart = targetPart;
	}
	

	private Shell getShell() {
		return targetPart.getSite().getShell();
	}

	public void run(IAction action) {
		// Getting files from selection
		IStructuredSelection iss = (IStructuredSelection)currentSelection;
		for (Iterator<?> iterator = iss.iterator(); iterator.hasNext();) {
			try {
				IFile uppaalliteFile = UppaalConverter.transformFlatToLite((IFile)iterator.next());
				initDiagram(uppaalliteFile);
			} catch (Exception e) {
				e.printStackTrace();
				throw new RuntimeException(e);
			}
		}
	}

	
	
	public void initDiagram(IFile file) {
		URI domainModelURI = URI.createPlatformResourceURI(file.getFullPath().toString(), true);
		TransactionalEditingDomain editingDomain = GMFEditingDomainFactory.INSTANCE
				.createEditingDomain();
		ResourceSet resourceSet = new ResourceSetImpl();
		EObject diagramRoot = null;
		try {
			Resource resource = resourceSet.getResource(domainModelURI, true);
			diagramRoot = (EObject) resource.getContents().get(0);
		} catch (WrappedException ex) {
			ex.printStackTrace();
		}
		if (diagramRoot == null) {
			MessageDialog.openError(getShell(),
					Messages.InitDiagramFile_ResourceErrorDialogTitle,
					Messages.InitDiagramFile_ResourceErrorDialogMessage);
			return;
		}
		Wizard wizard = new UppaalliteNewDiagramFileWizard(domainModelURI,
				diagramRoot, editingDomain);
		wizard.setWindowTitle(NLS.bind(Messages.InitDiagramFile_WizardTitle,
				UppaalDiagramEditPart.MODEL_ID));
		UppaalliteDiagramEditorUtil.runWizard(getShell(), wizard,
				"InitDiagramFile"); //$NON-NLS-1$
	}
	
	

	public void selectionChanged(IAction action, ISelection selection) {
		this.currentSelection = selection;
	}
}
