/**
 * 
 */
package hr.fer.rasip.remes.simulator.core.datatypes;

import java.util.Observer;

/**
 * @author Marin Orlic <marin.orlic@fer.hr>
 *
 */
public interface Type {
	/**
	 * Determines the type code.
	 */
	public enum TYPE_CODE {
		BOOLEAN,
		INTEGER,
		NATURAL,
		CLOCK,
		RESOURCE,
		FLOAT,
		UNKNOWN
	}
	
	public TYPE_CODE getType();
	public boolean isTransferrable();
	
	// These methods are forwarded from the interface Observer
	public void addObserver(Observer obs);
	public void deleteObserver(Observer obs);
	public void deleteObservers();
	public int countObservers();
	
	public Object getValue();
	public void setValue(Object value);
	public Type duplicate();
	
	public Type not();
	public Type neg();
	public Type and(Type right);
	public Type or(Type right);
	public Type add(Type right);
	public Type add(Number right);
	public Type sub(Type right);
	public Type sub(Number right);
	public Type rsub(Type left);
	public Type rsub(Number left);
	public Type mul(Type right);
	public Type mul(Number right);
	public Type div(Type right);
	public Type div(Number right);
	public Type rdiv(Type left);
	public Type rdiv(Number left);
	public Type mod(Type right);
	public Type mod(Number right);
	public Type rmod(Type left);
	public Type rmod(Number left);
	public Type lt(Type right);
	public Type lt(Number right);
	public Type le(Type right);
	public Type le(Number right);
	public Type eq(Type right);
	public Type eq(Number right);
	public Type ge(Type right);
	public Type ge(Number right);
	public Type gt(Type right);
	public Type gt(Number right);
	public Type ne(Type right);
	public Type ne(Number right);
	public Type assign(Type right);
	public Type assign(Number right);
	public Type assignAdd(Type right);
	public Type assignAdd(Number right);
	public Type assignSub(Type right);
	public Type assignSub(Number right);
	public Type assignMul(Type right);
	public Type assignMul(Number right);
	public Type assignDiv(Type right);
	public Type assignDiv(Number right);
	public Type assignMod(Type right);
	public Type assignMod(Number right);
	public Type align(Type value);
}