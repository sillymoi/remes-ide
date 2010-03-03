/**
 * 
 */
package hr.fer.rasip.remes.builder.helpers;

import hr.fer.rasip.remes.grammars.expressions.ast.Expression;

/**
 * @author Marin Orlic <marin.orlic@fer.hr>
 * 
 */
public class InvalidTypeErrorMark {

	private String cause = null;
	private Expression location = null;

	/**
	 *  
	 */
	public InvalidTypeErrorMark() {

	}

	/**
	 * @param msg
	 *            Message explaining the error
	 */
	public InvalidTypeErrorMark(String msg) {
		this.setCause(msg);
	}

	/**
	 * @param loc
	 *            Location of the error
	 */
	public InvalidTypeErrorMark(Expression loc) {
		this.setLocation(loc);
	}

	/**
	 * @param msg
	 *            Message explaining the error
	 * @param loc
	 *            Location of the error
	 */
	public InvalidTypeErrorMark(String msg, Expression loc) {
		this.setCause(msg);
		this.setLocation(loc);
	}

	/**
	 * @param location the location to set
	 */
	public void setLocation(Expression location) {
		this.location = location;
	}

	/**
	 * @return the location
	 */
	public Expression getLocation() {
		return location;
	}

	/**
	 * @param cause the cause to set
	 */
	public void setCause(String cause) {
		this.cause = cause;
	}

	/**
	 * @return the cause
	 */
	public String getCause() {
		return cause;
	}

}
