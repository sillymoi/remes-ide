/**
 * 
 */
package hr.fer.rasip.remes.simulator.ui.views.providers;

import java.util.ArrayList;
import java.util.Collection;

import hr.fer.rasip.remes.simulator.ui.Activator;
import hr.fer.rasip.remes.simulator.ui.views.TraceDisplayView;
import hr.fer.rasip.remes.simulator.ui.navigator.core.SimulatorDataStore;
import hr.fer.rasip.remes.simulator.ui.navigator.core.SimulatorDataStoreNavigatorItem;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;

/**
 * @author Marin Orlic <marin.orlic@fer.hr>
 * 
 */
public class SimulatorTracesAdapterFactoryContentProvider extends
		AdapterFactoryContentProvider {

	private static final Object[] EMPTY_ARRAY = new Object[0];
	private SimulatorDataStore ds = null;
	
	public SimulatorTracesAdapterFactoryContentProvider(SimulatorDataStore ds) {
		super(Activator.getDefault().getItemProvidersAdapterFactory());
		this.ds = ds;
	}

	public SimulatorTracesAdapterFactoryContentProvider(
			SimulatorDataStore ds, AdapterFactory adapterFactory) {
		super(adapterFactory);
		this.ds = ds;
	}

	public boolean hasChildren(Object object) {
		if(object instanceof TraceDisplayView.TreeParent)
			return true;

		return super.hasChildren(object);
	}

	public Object[] getChildren(Object object) {
		if(object instanceof TraceDisplayView.TreeParent)
			return ((TraceDisplayView.TreeParent) object).getChildren();
		
		Object[] result = wrapEObjects(super.getChildren(object), object);
		return result;
	}

	public Object getParent(Object object) {
		if(object instanceof TraceDisplayView.TreeParent)
			return null;
		
		Object result = super.getParent(((SimulatorDataStoreNavigatorItem) object).getEObject());
		return result;
	}

	public Object[] getElements(Object object) {
		if(object instanceof TraceDisplayView.TreeParent)
			return ((TraceDisplayView.TreeParent) object).getChildren();
		
		if(object instanceof SimulatorDataStoreNavigatorItem) {
			Object[] result = wrapEObjects(super.getElements(((SimulatorDataStoreNavigatorItem) object).getEObject()), object);
			return result;
		}
		
		return EMPTY_ARRAY;
	}

	/**
	 * Wraps EMF EObjects to SimulatorDataStoreNavigatorItems
	 */
	public Object[] wrapEObjects(Object[] objects, Object parentElement) {
		Collection<SimulatorDataStoreNavigatorItem> result = new ArrayList<SimulatorDataStoreNavigatorItem>();
		for (int i = 0; i < objects.length; i++) {
			if (objects[i] instanceof EObject) {
				result.add(new SimulatorDataStoreNavigatorItem(
						(EObject) objects[i], parentElement,
						this, ds));
			}
		}
		return result.toArray();
	}
}
