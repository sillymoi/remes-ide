/**
 * 
 */
package se.mdh.progresside.uppaal.views;

import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.PlatformUI;

class TraceLabelProvider extends LabelProvider implements ITableLabelProvider {

	@Override
	public String getText(Object element) {
		TraceElement traceElement = (TraceElement) element;
		return traceElement.getState().traceFormat();
	}

	public String getColumnText(Object obj, int index) {
		return getText(obj);
	}

	public Image getColumnImage(Object obj, int index) {
		return getImage(obj);
	}

	public Image getImage(Object obj) {
		return PlatformUI.getWorkbench().getSharedImages().getImage(
				ISharedImages.IMG_OBJ_ELEMENT);
	}
}