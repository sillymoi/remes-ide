/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package hr.fer.rasip.remes.resource.remessrc.mopp;

public class RemessrcProblem implements hr.fer.rasip.remes.resource.remessrc.IRemessrcProblem {
	
	private java.lang.String message;
	private hr.fer.rasip.remes.resource.remessrc.RemessrcEProblemType type;
	
	public RemessrcProblem(java.lang.String message, hr.fer.rasip.remes.resource.remessrc.RemessrcEProblemType type) {
		super();
		this.message = message;
		this.type = type;
	}
	
	public hr.fer.rasip.remes.resource.remessrc.RemessrcEProblemType getType() {
		return type;
	}
	
	public java.lang.String getMessage() {
		return message;
	}
	
}
