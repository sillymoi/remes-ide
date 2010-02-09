/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package hr.fer.rasip.remes.resource.remessrc.mopp;

public class RemessrcParseResult implements hr.fer.rasip.remes.resource.remessrc.IRemessrcParseResult {
	
	private org.eclipse.emf.ecore.EObject root;
	private java.util.Collection<hr.fer.rasip.remes.resource.remessrc.IRemessrcCommand<hr.fer.rasip.remes.resource.remessrc.IRemessrcTextResource>> commands = new java.util.ArrayList<hr.fer.rasip.remes.resource.remessrc.IRemessrcCommand<hr.fer.rasip.remes.resource.remessrc.IRemessrcTextResource>>();
	
	public RemessrcParseResult() {
		super();
	}
	
	public void setRoot(org.eclipse.emf.ecore.EObject root) {
		this.root = root;
	}
	
	public org.eclipse.emf.ecore.EObject getRoot() {
		return root;
	}
	
	public java.util.Collection<hr.fer.rasip.remes.resource.remessrc.IRemessrcCommand<hr.fer.rasip.remes.resource.remessrc.IRemessrcTextResource>> getPostParseCommands() {
		return commands;
	}
	
}
