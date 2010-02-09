/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package hr.fer.rasip.remes.resource.remessrc;

// An interface used to access the result of parsing a
// document.
public interface IRemessrcParseResult {
	
	public org.eclipse.emf.ecore.EObject getRoot();
	
	public java.util.Collection<hr.fer.rasip.remes.resource.remessrc.IRemessrcCommand<hr.fer.rasip.remes.resource.remessrc.IRemessrcTextResource>> getPostParseCommands();
}
