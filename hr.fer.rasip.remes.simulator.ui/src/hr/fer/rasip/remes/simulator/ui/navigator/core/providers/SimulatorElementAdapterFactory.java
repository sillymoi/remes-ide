/**
 * 
 */
package hr.fer.rasip.remes.simulator.ui.navigator.core.providers;

import hr.fer.rasip.remes.simulator.traces.SimulatorRun;
import hr.fer.rasip.remes.simulator.ui.Activator;
import hr.fer.rasip.remes.simulator.ui.navigator.core.SimulatorDataStore;

import org.eclipse.core.runtime.IAdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.ui.views.properties.IPropertySource;

/**
 * @author Marin Orlic <marin.orlic@fer.hr>
 *
 */
public class SimulatorElementAdapterFactory implements IAdapterFactory {

	private static Class[] ADAPTERS = new Class[] { IPropertySource.class };
	private AdapterFactoryContentProvider contentProvider; 

	public SimulatorElementAdapterFactory() {
		this.contentProvider = new AdapterFactoryContentProvider(Activator.getDefault().getItemProvidersAdapterFactory());
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.core.runtime.IAdapterFactory#getAdapter(java.lang.Object, java.lang.Class)
	 */
	@Override
	public Object getAdapter(Object adaptableObject, Class adapterType) {
		if (IPropertySource.class.equals(adapterType)) {
			if (adaptableObject instanceof SimulatorDataStore) {
				  return new SimulatorDataStorePropertySource((SimulatorDataStore)adaptableObject);
			}
			if (adaptableObject instanceof SimulatorRun) {
				return contentProvider.getPropertySource(adaptableObject); // This one is also handled by SimulatorDataStoreNavigatorItem
			}
		}
		return null;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.core.runtime.IAdapterFactory#getAdapterList()
	 */
	@Override
	public Class[] getAdapterList() {
		return ADAPTERS;
	}

}
