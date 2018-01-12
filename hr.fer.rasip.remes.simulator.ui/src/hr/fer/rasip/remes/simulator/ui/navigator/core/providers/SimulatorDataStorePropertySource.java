/**
 * 
 */
package hr.fer.rasip.remes.simulator.ui.navigator.core.providers;

import hr.fer.rasip.remes.simulator.ui.Activator;
import hr.fer.rasip.remes.simulator.ui.navigator.commands.CommandUtil;
import hr.fer.rasip.remes.simulator.ui.navigator.commands.StartDataStoreServerCommand;
import hr.fer.rasip.remes.simulator.ui.navigator.commands.StopDataStoreServerCommand;
import hr.fer.rasip.remes.simulator.ui.navigator.core.SimulatorDataStore;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.ui.views.properties.ComboBoxPropertyDescriptor;
import org.eclipse.ui.views.properties.IPropertyDescriptor;
import org.eclipse.ui.views.properties.IPropertySource;
import org.eclipse.ui.views.properties.PropertyDescriptor;

/**
 * @author Marin Orlic <marin.orlic@fer.hr>
 *
 */
public class SimulatorDataStorePropertySource implements IPropertySource {
	
	public static final String PROP_NAME = "name"; //$NON-NLS-1$
	public static final String PROP_NUM_TRACES = "numTraces"; //$NON-NLS-1$
	public static final String PROP_SERVER_RUNNING = "serverRunning"; //$NON-NLS-1$
	public static final String PROP_SERVER_URI = "serverURI"; //$NON-NLS-1$
	public static final String PROP_MAPPING_XML = "mappingXML"; //$NON-NLS-1$
	
	public static final String VAL_SERVER_STOPPED = "stopped";
	public static final String VAL_SERVER_RUNNING = "running";
	
	private static final String[] serverStates = new String[]{VAL_SERVER_STOPPED, VAL_SERVER_RUNNING};
	
	private final SimulatorDataStore dataStore;
	
	public SimulatorDataStorePropertySource(SimulatorDataStore ds) {
		this.dataStore = ds;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.views.properties.IPropertySource#getEditableValue()
	 */
	@Override
	public Object getEditableValue() {
		return this;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.views.properties.IPropertySource#getPropertyDescriptors()
	 */
	@Override
	public IPropertyDescriptor[] getPropertyDescriptors() {
		return new IPropertyDescriptor[] {
			new PropertyDescriptor(PROP_NAME, "Name"),
			new PropertyDescriptor(PROP_NUM_TRACES, "Number of traces"),
			new PropertyDescriptor(PROP_SERVER_RUNNING, "Data store server state"),
			new PropertyDescriptor(PROP_SERVER_URI, "Server connection URL"),
			new PropertyDescriptor(PROP_MAPPING_XML, "Mapping XML")
//			new ComboBoxPropertyDescriptor(PROP_SERVER_RUNNING, "Data store server state", serverStates)
		};
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.views.properties.IPropertySource#getPropertyValue(java.lang.Object)
	 */
	@Override
	public Object getPropertyValue(Object id) {
		if (PROP_NAME.equals(id)) 
			return dataStore.getName();
		else if (PROP_NUM_TRACES.equals(id)) 
			return dataStore.getTraceCount();
		else if (PROP_SERVER_RUNNING.equals(id))
//			return dataStore.isDataStoreServerRunning() ? 1 : 0; // Index into serverRunning array
			return dataStore.isDataStoreServerRunning() ? VAL_SERVER_RUNNING : VAL_SERVER_STOPPED;
		else if (PROP_SERVER_URI.equals(id))
			return dataStore.getConnectionURL();
		else if (PROP_MAPPING_XML.equals(id))
			return dataStore.getMappingXML();
		
		return null;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.views.properties.IPropertySource#isPropertySet(java.lang.Object)
	 */
	@Override
	public boolean isPropertySet(Object id) {
		return false;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.views.properties.IPropertySource#resetPropertyValue(java.lang.Object)
	 */
	@Override
	public void resetPropertyValue(Object id) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.views.properties.IPropertySource#setPropertyValue(java.lang.Object, java.lang.Object)
	 */
	@Override
	public void setPropertyValue(Object id, Object value) {
		if (PROP_NAME.equals(id)) dataStore.setName((String) value);
		else if (PROP_SERVER_RUNNING.equals(id)) {
			if (value.equals(1)) {
				try {
					CommandUtil.executeCommand(StartDataStoreServerCommand.COMMAND_ID);
				} catch (ExecutionException e) {
					Activator.log(IStatus.WARNING, "Unable to start data store server", e);
				}
			} else {
				try {
					CommandUtil.executeCommand(StopDataStoreServerCommand.COMMAND_ID);
				} catch (ExecutionException e) {
					Activator.log(IStatus.WARNING, "Unable to stop data store server", e);
				}
			}
		}
	}
}
