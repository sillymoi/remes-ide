/**
 * 
 */
package hr.fer.rasip.remes.simulator.core.datatypes;

import java.util.Observable;

/**
 * @author Marin Orlic <marin.orlic@fer.hr>
 *
 */
public abstract class BaseType extends Observable implements Type {

	/* (non-Javadoc)
	 * @see hr.fer.rasip.remes.simulator.core.datatypes.Type#add(hr.fer.rasip.remes.simulator.core.datatypes.Type)
	 */
	@Override
	public Type add(Type right) {
		throw new UnsupportedOperationException();
	}

	@Override
	public Type add(Number right) {
		throw new UnsupportedOperationException();	}

	/* (non-Javadoc)
	 * @see hr.fer.rasip.remes.simulator.core.datatypes.Type#and(hr.fer.rasip.remes.simulator.core.datatypes.Type)
	 */
	@Override
	public Type and(Type right) {
		throw new UnsupportedOperationException();
	}

	/* (non-Javadoc)
	 * @see hr.fer.rasip.remes.simulator.core.datatypes.Type#assign(hr.fer.rasip.remes.simulator.core.datatypes.Type)
	 */
	@Override
	public Type assign(Type right) {
		throw new UnsupportedOperationException();
	}

	@Override
	public Type assign(Number right) {
		throw new UnsupportedOperationException();
	}
	
	/* (non-Javadoc)
	 * @see hr.fer.rasip.remes.simulator.core.datatypes.Type#assignAdd(hr.fer.rasip.remes.simulator.core.datatypes.Type)
	 */
	@Override
	public Type assignAdd(Type right) {
		throw new UnsupportedOperationException();
	}

	@Override
	public Type assignAdd(Number right) {
		throw new UnsupportedOperationException();
	}

	/* (non-Javadoc)
	 * @see hr.fer.rasip.remes.simulator.core.datatypes.Type#assignDiv(hr.fer.rasip.remes.simulator.core.datatypes.Type)
	 */
	@Override
	public Type assignDiv(Type right) {
		throw new UnsupportedOperationException();
	}

	@Override
	public Type assignDiv(Number right) {
		throw new UnsupportedOperationException();
	}

	/* (non-Javadoc)
	 * @see hr.fer.rasip.remes.simulator.core.datatypes.Type#assignMod(hr.fer.rasip.remes.simulator.core.datatypes.Type)
	 */
	@Override
	public Type assignMod(Type right) {
		throw new UnsupportedOperationException();
	}

	@Override
	public Type assignMod(Number right) {
		throw new UnsupportedOperationException();
	}

	/* (non-Javadoc)
	 * @see hr.fer.rasip.remes.simulator.core.datatypes.Type#assignMul(hr.fer.rasip.remes.simulator.core.datatypes.Type)
	 */
	@Override
	public Type assignMul(Type right) {
		throw new UnsupportedOperationException();
	}

	@Override
	public Type assignMul(Number right) {
		throw new UnsupportedOperationException();
	}

	/* (non-Javadoc)
	 * @see hr.fer.rasip.remes.simulator.core.datatypes.Type#assignSub(hr.fer.rasip.remes.simulator.core.datatypes.Type)
	 */
	@Override
	public Type assignSub(Type right) {
		throw new UnsupportedOperationException();
	}

	@Override
	public Type assignSub(Number right) {
		throw new UnsupportedOperationException();
	}

	/* (non-Javadoc)
	 * @see hr.fer.rasip.remes.simulator.core.datatypes.Type#div(hr.fer.rasip.remes.simulator.core.datatypes.Type)
	 */
	@Override
	public Type div(Type right) {
		throw new UnsupportedOperationException();
	}

	@Override
	public Type div(Number right) {
		throw new UnsupportedOperationException();
	}

	/* (non-Javadoc)
	 * @see hr.fer.rasip.remes.simulator.core.datatypes.Type#eq(hr.fer.rasip.remes.simulator.core.datatypes.Type)
	 */
	@Override
	public Type eq(Type right) {
		throw new UnsupportedOperationException();
	}

	@Override
	public Type eq(Number right) {
		throw new UnsupportedOperationException();
	}

	/* (non-Javadoc)
	 * @see hr.fer.rasip.remes.simulator.core.datatypes.Type#ge(hr.fer.rasip.remes.simulator.core.datatypes.Type)
	 */
	@Override
	public Type ge(Type right) {
		throw new UnsupportedOperationException();
	}

	@Override
	public Type ge(Number right) {
		throw new UnsupportedOperationException();
	}
	
	/* (non-Javadoc)
	 * @see hr.fer.rasip.remes.simulator.core.datatypes.Type#gt(hr.fer.rasip.remes.simulator.core.datatypes.Type)
	 */
	@Override
	public Type gt(Type right) {
		throw new UnsupportedOperationException();
	}

	@Override
	public Type gt(Number right) {
		throw new UnsupportedOperationException();
	}
	
	/* (non-Javadoc)
	 * @see hr.fer.rasip.remes.simulator.core.datatypes.Type#le(hr.fer.rasip.remes.simulator.core.datatypes.Type)
	 */
	@Override
	public Type le(Type right) {
		throw new UnsupportedOperationException();
	}
	
	@Override
	public Type le(Number right) {
		throw new UnsupportedOperationException();
	}

	/* (non-Javadoc)
	 * @see hr.fer.rasip.remes.simulator.core.datatypes.Type#lt(hr.fer.rasip.remes.simulator.core.datatypes.Type)
	 */
	@Override
	public Type lt(Type right) {
		throw new UnsupportedOperationException();
	}
	
	@Override
	public Type lt(Number right) {
		throw new UnsupportedOperationException();
	}

	/* (non-Javadoc)
	 * @see hr.fer.rasip.remes.simulator.core.datatypes.Type#mod(hr.fer.rasip.remes.simulator.core.datatypes.Type)
	 */
	@Override
	public Type mod(Type right) {
		throw new UnsupportedOperationException();
	}
	
	@Override
	public Type mod(Number right) {
		throw new UnsupportedOperationException();
	}

	/* (non-Javadoc)
	 * @see hr.fer.rasip.remes.simulator.core.datatypes.Type#mul(hr.fer.rasip.remes.simulator.core.datatypes.Type)
	 */
	@Override
	public Type mul(Type right) {
		throw new UnsupportedOperationException();
	}

	@Override
	public Type mul(Number right) {
		throw new UnsupportedOperationException();
	}

	/* (non-Javadoc)
	 * @see hr.fer.rasip.remes.simulator.core.datatypes.Type#ne(hr.fer.rasip.remes.simulator.core.datatypes.Type)
	 */
	@Override
	public Type ne(Type right) {
		throw new UnsupportedOperationException();
	}

	@Override
	public Type ne(Number right) {
		throw new UnsupportedOperationException();
	}
	
	/* (non-Javadoc)
	 * @see hr.fer.rasip.remes.simulator.core.datatypes.Type#not()
	 */
	@Override
	public Type not() {
		throw new UnsupportedOperationException();
	}

	/* (non-Javadoc)
	 * @see hr.fer.rasip.remes.simulator.core.datatypes.Type#or(hr.fer.rasip.remes.simulator.core.datatypes.Type)
	 */
	@Override
	public Type or(Type right) {
		throw new UnsupportedOperationException();
	}

	/* (non-Javadoc)
	 * @see hr.fer.rasip.remes.simulator.core.datatypes.Type#sub(hr.fer.rasip.remes.simulator.core.datatypes.Type)
	 */
	@Override
	public Type sub(Type right) {
		throw new UnsupportedOperationException();
	}

	@Override
	public Type sub(Number right) {
		throw new UnsupportedOperationException();
	}

	/* (non-Javadoc)
	 * @see hr.fer.rasip.remes.simulator.core.datatypes.Type#rsub(hr.fer.rasip.remes.simulator.core.datatypes.Type)
	 */
	@Override
	public Type rsub(Type left) {
		throw new UnsupportedOperationException();
	}

	@Override
	public Type rsub(Number left) {
		throw new UnsupportedOperationException();
	}

	@Override
	public TYPE_CODE getType() {
		return TYPE_CODE.UNKNOWN;
	}

	@Override
	public Type neg() {
		throw new UnsupportedOperationException();
	}

	@Override
	public Type rdiv(Type right) {
		throw new UnsupportedOperationException();	}

	@Override
	public Type rdiv(Number right) {
		throw new UnsupportedOperationException();	}

	@Override
	public Type rmod(Type right) {
		throw new UnsupportedOperationException();	}

	@Override
	public Type rmod(Number right) {
		throw new UnsupportedOperationException();	}

}
