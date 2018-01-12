/**
 * 
 */
package se.mdh.progresside.uppaal.views;

import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.PlatformUI;

import com.uppaal.model.system.Transition;

class TransitionsLabelProvider extends LabelProvider implements
		ITableLabelProvider {
	
	@Override
	public String getText(Object element) {
		Transition t = (Transition) element;
		// for some reason the edge description contains new line?!
		return t.getEdgeDescription().replaceAll("\n", "");
	}
	
	public String getColumnText(Object obj, int index) {
		return getText(obj);
	}

	public Image getColumnImage(Object obj, int index) {
		return getImage(obj);
	}

	public Image getImage(Object obj) {
		Transition t = (Transition) obj;
		if (t.getTarget() == null) {
			return PlatformUI.getWorkbench().getSharedImages().getImage(
					ISharedImages.IMG_TOOL_FORWARD_DISABLED);
		}
		return PlatformUI.getWorkbench().getSharedImages().getImage(
				ISharedImages.IMG_TOOL_FORWARD);
	}
}