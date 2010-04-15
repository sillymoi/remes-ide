package hr.fer.rasip.uppaallite.diagram.navigator;

import hr.fer.rasip.uppaallite.diagram.part.UppaalliteVisualIDRegistry;

import org.eclipse.jface.viewers.ViewerSorter;

/**
 * @generated
 */
public class UppaalliteNavigatorSorter extends ViewerSorter {

	/**
	 * @generated
	 */
	private static final int GROUP_CATEGORY = 4003;

	/**
	 * @generated
	 */
	public int category(Object element) {
		if (element instanceof UppaalliteNavigatorItem) {
			UppaalliteNavigatorItem item = (UppaalliteNavigatorItem) element;
			return UppaalliteVisualIDRegistry.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
