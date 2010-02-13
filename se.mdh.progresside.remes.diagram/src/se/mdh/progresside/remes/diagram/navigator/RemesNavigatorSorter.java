package se.mdh.progresside.remes.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;

import se.mdh.progresside.remes.diagram.part.RemesVisualIDRegistry;

/**
 * @generated
 */
public class RemesNavigatorSorter extends ViewerSorter {

	/**
	 * @generated
	 */
	private static final int GROUP_CATEGORY = 7008;

	/**
	 * @generated
	 */
	public int category(Object element) {
		if (element instanceof RemesNavigatorItem) {
			RemesNavigatorItem item = (RemesNavigatorItem) element;
			return RemesVisualIDRegistry.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
