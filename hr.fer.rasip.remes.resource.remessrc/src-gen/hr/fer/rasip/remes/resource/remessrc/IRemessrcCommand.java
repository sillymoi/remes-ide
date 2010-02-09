/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package hr.fer.rasip.remes.resource.remessrc;

// A simple interface for commands that can be executed
// and that return information about the success of their
// execution.
public interface IRemessrcCommand<ContextType> {
	
	public boolean execute(ContextType context);
}
