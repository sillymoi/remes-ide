/**
 * 
 */
package hr.fer.rasip.remes.datastore.framework;

/**
 * Defines a listener for data store events.
 * 
 * @author Marin Orlic <marin.orlic@fer.hr>
 * @see DataStoreEvent
 */
public interface IDataStoreEventListener {
	public void handleDataStoreEvent(DataStoreEvent event);
}
