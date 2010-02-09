/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package hr.fer.rasip.remes.resource.remessrc.ui;

// This custom implementation of a TreeViewer expands the tree
// automatically up to a specified depth.
public class RemessrcOutlinePageTreeViewer extends org.eclipse.jface.viewers.TreeViewer {
	
	boolean suppressNotifications = false;
	
	public RemessrcOutlinePageTreeViewer(org.eclipse.swt.widgets.Composite parent, int style) {
		super(parent, style);
	}
	
	public void setSelection(org.eclipse.jface.viewers.ISelection selection, boolean reveal) {
		if (selection instanceof hr.fer.rasip.remes.resource.remessrc.ui.RemessrcEObjectSelection) {
			suppressNotifications = true;
			super.setSelection(selection, reveal);
			suppressNotifications = false;
		}
	}
	
	protected void handleInvalidSelection(org.eclipse.jface.viewers.ISelection selection, org.eclipse.jface.viewers.ISelection newSelection) {
		//this may not fire a selection changed event to avoid cyclic events between editor and outline
	}
	
	public void refresh(Object element, boolean updateLabels) {
		super.refresh(element, updateLabels);
		expandToLevel(getAutoExpandLevel());
	}
	
	public void refresh(Object element) {
		super.refresh(element);
		expandToLevel(getAutoExpandLevel());
	}
	
	public void refresh() {
		super.refresh();
		expandToLevel(getAutoExpandLevel());
	}
	
	public void refresh(boolean updateLabels) {
		super.refresh(updateLabels);
		expandToLevel(getAutoExpandLevel());
	}
	protected void fireSelectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent event) {
		if (suppressNotifications == true) return;
		super.fireSelectionChanged(event);
	}
	
}
