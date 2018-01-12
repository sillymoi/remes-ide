package hr.fer.rasip.remes.simulator.ui.navigator.core;

import org.eclipse.core.runtime.IAdapterFactory;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.PlatformObject;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.ui.views.properties.IPropertySource;
import org.eclipse.ui.views.properties.IPropertySourceProvider;

/**
 * Navigator item, adapted from GMF-generated class.
 */
public class SimulatorDataStoreNavigatorItem extends PlatformObject {

	/**
	 * Registers adapters
	 */
	static {
		final Class[] supportedTypes = new Class[] { EObject.class,
				IPropertySource.class };
		
		Platform.getAdapterManager().registerAdapters(
				new IAdapterFactory() {

					public Object getAdapter(Object adaptableObject, Class adapterType) {
						if (adaptableObject instanceof SimulatorDataStoreNavigatorItem) {
							SimulatorDataStoreNavigatorItem domainNavigatorItem = (SimulatorDataStoreNavigatorItem) adaptableObject;
							EObject eObject = domainNavigatorItem.getEObject();
							if (adapterType == EObject.class) {
								return eObject;
							}
							if (adapterType == IPropertySource.class) {
								return domainNavigatorItem.getPropertySourceProvider().getPropertySource(eObject);
							}
						}

						return null;
					}

					public Class[] getAdapterList() {
						return supportedTypes;
					}
				},
				SimulatorDataStoreNavigatorItem.class);
	}

	private Object myParent;

	private SimulatorDataStore myDataStore;

	private EObject myEObject;

	private IPropertySourceProvider myPropertySourceProvider;

	/**
	 * Constructs this item
	 */
	public SimulatorDataStoreNavigatorItem(EObject eObject, Object parent, IPropertySourceProvider propertySourceProvider, SimulatorDataStore ds) {
		myParent = parent;
		myEObject = eObject;
		myPropertySourceProvider = propertySourceProvider;
		myDataStore = ds;
	}

	/**
	 * @return the parent of this object
	 */
	public Object getParent() {
		return myParent;
	}

	/**
	 * @return the EObject
	 */
	public EObject getEObject() {
		return myEObject;
	}

	/**
	 * @return the property source provider
	 */
	public IPropertySourceProvider getPropertySourceProvider() {
		return myPropertySourceProvider;
	}
	
	/**
	 * @return the data store
	 */
	public SimulatorDataStore getDataStore() {
		return myDataStore;
	}

	public boolean equals(Object obj) {
		if (obj instanceof SimulatorDataStoreNavigatorItem) {
			return EcoreUtil
					.getURI(getEObject())
					.equals(EcoreUtil.getURI(((SimulatorDataStoreNavigatorItem) obj)
											.getEObject()));
		}
		return super.equals(obj);
	}

	public int hashCode() {
		return EcoreUtil.getURI(getEObject()).hashCode();
	}

}
