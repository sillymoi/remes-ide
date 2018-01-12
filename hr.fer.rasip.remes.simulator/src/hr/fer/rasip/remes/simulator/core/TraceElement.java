/**
 * 
 */
package hr.fer.rasip.remes.simulator.core;

/**
 * @author Marin Orlic <marin.orlic@fer.hr>
 *
 */
public interface TraceElement
{
	public boolean isMode();
	public boolean isTransition();
	public String getObjectId();
	public String getSourceName(); // For debugging purposes
}
