/**
 * 
 */
package hr.fer.rasip.remes.simulator.ui.navigator.core.providers;

import hr.fer.rasip.remes.simulator.traces.SimulatorRun;
import hr.fer.rasip.remes.simulator.ui.Activator;
import hr.fer.rasip.remes.simulator.ui.navigator.core.SimulatorDataStore;
import hr.fer.rasip.remes.simulator.ui.navigator.core.SimulatorDataStoreNavigatorItem;
import hr.fer.rasip.remes.simulator.ui.navigator.core.SimulatorTraceData;

import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.navigator.IDescriptionProvider;

/**
 * @author Marin Orlic <marin.orlic@fer.hr>
 * 
 */
public class SimulatorDataStoreLabelProvider extends LabelProvider implements
		ILabelProvider, IDescriptionProvider {

	private AdapterFactoryLabelProvider adapterFactoryLabelProvider 
				= new AdapterFactoryLabelProvider(Activator.getDefault()
						.getItemProvidersAdapterFactory());
	
	public SimulatorDataStoreLabelProvider() {
		
	}
	
	public String getText(Object element) {
		if (element instanceof SimulatorDataStore) {
			SimulatorDataStore dataStore = (SimulatorDataStore) element;
			return (dataStore.getName() 
					+ " ["
					+ dataStore.getTraceCount()
					+ "]");
		} else if (element instanceof SimulatorTraceData) {
			return ((SimulatorTraceData) element).getName();
		} else if (element instanceof SimulatorRun) {
			SimulatorRun run = (SimulatorRun) element;
			return adapterFactoryLabelProvider.getText(run);
		} else if (element instanceof SimulatorDataStoreNavigatorItem) {
			SimulatorDataStoreNavigatorItem navi = (SimulatorDataStoreNavigatorItem) element;
			return adapterFactoryLabelProvider.getText(navi.getEObject());
		}
		return null;
	}

	public String getDescription(Object element) {
		String text = getText(element);
		return "This is a description of " + text;
	}

	public Image getImage(Object element) {
		if (element instanceof SimulatorDataStore) {
			return PlatformUI.getWorkbench().getSharedImages()
					.getImage(ISharedImages.IMG_OBJ_FOLDER);
		} else if (element instanceof SimulatorTraceData) {
			return PlatformUI.getWorkbench().getSharedImages()
					.getImage(ISharedImages.IMG_OBJ_FILE);
		} else if (element instanceof SimulatorRun) {
			return adapterFactoryLabelProvider.getImage((SimulatorRun) element);			
//			return PlatformUI.getWorkbench().getSharedImages()
//					.getImage(ISharedImages.IMG_OBJ_ELEMENT);
		} else if (element instanceof SimulatorDataStoreNavigatorItem) {
			return adapterFactoryLabelProvider.getImage(((SimulatorDataStoreNavigatorItem) element).getEObject());
		}
		return null;
	}
	
	public void addListener(ILabelProviderListener listener) {
		adapterFactoryLabelProvider.addListener(listener);
	}

	public void dispose() {
		adapterFactoryLabelProvider.dispose();
	}

	public boolean isLabelProperty(Object element, String property) {
		return adapterFactoryLabelProvider.isLabelProperty(element, property);
	}

	public void removeListener(ILabelProviderListener listener) {
		adapterFactoryLabelProvider.removeListener(listener);
	}
}
