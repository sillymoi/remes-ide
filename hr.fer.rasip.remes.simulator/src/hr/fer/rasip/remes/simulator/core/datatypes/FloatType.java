/**
 * 
 */
package hr.fer.rasip.remes.simulator.core.datatypes;

/**
 * @author Marin Orlic <marin.orlic@fer.hr>
 *
 */
public class FloatType extends BaseType
{
	private Float value = null;
	
	/**
	 * Constructor
	 */
	public FloatType(Float value) {
		this.value = value;
		
		setChanged();
		notifyObservers(value);
	}
	
	/**
	 * Returns the type
	 */
	@Override
	public TYPE_CODE getType() {
		return TYPE_CODE.FLOAT;
	}
	
	/**
	 * This data type is transferable to other modes.
	 */
	@Override
	public boolean isTransferrable() {
		return true;
	}
	
	/**
	 * @return the value
	 */
	public Float getValue() {
		return value;
	}

	/**
	 * @param value the value to set
	 */
	public void setValue(Object value) {
		if(value instanceof Float) {
			this.value = (Float) value;
			
			setChanged();
			notifyObservers(value);
		}
	}

	/**
	 * Creates a deep copy of this Type
	 */
	@Override
	public Type duplicate() {
		return new FloatType(this.value.floatValue());
	}

	/**
	 * Returns a negative value of this Float.
	 * @see hr.fer.rasip.remes.simulator.core.datatypes.BaseType#neg()
	 */
	@Override
	public Type neg() {
		return new FloatType( - this.value.floatValue());
	}	
	
	/**
	 * Adds this Float with Integer, Natural or Float.
	 * @see hr.fer.rasip.remes.simulator.core.datatypes.BaseType#add(hr.fer.rasip.remes.simulator.core.datatypes.Type)
	 * @see hr.fer.rasip.remes.simulator.core.datatypes.ClockType#add(hr.fer.rasip.remes.simulator.core.datatypes.Type)
	 */
	@Override
	public Type add(Type right) {
		if(right.getType() == TYPE_CODE.INTEGER || right.getType() == TYPE_CODE.NATURAL || right.getType() == TYPE_CODE.FLOAT) {
			float res = getValue().floatValue() + ((Number) right.getValue()).floatValue();
			return new FloatType(res);
		}
		throw new UnsupportedOperationException();
	}

	/**
	 * Adds this Float with a Number.
	 * @see hr.fer.rasip.remes.simulator.core.datatypes.BaseType#add(Number)
	 */
	@Override
	public Type add(Number right) {
		float res = getValue().floatValue() + right.floatValue();
		return new FloatType(res);
	}
	
	/**
	 * Subtracts from this Float a Integer, Natural or Float.
	 * @see hr.fer.rasip.remes.simulator.core.datatypes.BaseType#sub(hr.fer.rasip.remes.simulator.core.datatypes.Type)
	 * @see hr.fer.rasip.remes.simulator.core.datatypes.ClockType#rsub(hr.fer.rasip.remes.simulator.core.datatypes.Type)
	 */
	@Override
	public Type sub(Type right) {
		if(right.getType() == TYPE_CODE.INTEGER || right.getType() == TYPE_CODE.NATURAL || right.getType() == TYPE_CODE.FLOAT) {
			float res = getValue().floatValue() - ((Number) right.getValue()).floatValue();
			return new FloatType(res);
		}
		throw new UnsupportedOperationException();
	}

	/**
	 * Subtracts from this Float a Number.
	 * @see hr.fer.rasip.remes.simulator.core.datatypes.BaseType#sub(Number)
	 */
	@Override
	public Type sub(Number right) {
		float res = getValue().floatValue() - right.floatValue();
		return new FloatType(res);
	}
	
	/**
	 * Subtracts from Integer, Natural or Float this Float.
	 * @see hr.fer.rasip.remes.simulator.core.datatypes.BaseType#rsub(hr.fer.rasip.remes.simulator.core.datatypes.Type)
	 */
	@Override
	public Type rsub(Type left) {
		if(left.getType() == TYPE_CODE.INTEGER || left.getType() == TYPE_CODE.NATURAL || left.getType() == TYPE_CODE.FLOAT) {
			float res = ((Number) left.getValue()).floatValue() - getValue().floatValue();
			return new FloatType(res);
		}
		throw new UnsupportedOperationException();
	}

	/**
	 * Subtracts this Float from a Number.
	 * @see hr.fer.rasip.remes.simulator.core.datatypes.BaseType#rsub(Number)
	 */
	@Override
	public Type rsub(Number left) {
		float res = left.floatValue() - getValue().floatValue();
		return new FloatType(res);
	}
	
	/** 
	 * Multiplies this Float with a Integer, Natural or Float.
	 * @see hr.fer.rasip.remes.simulator.core.datatypes.BaseType#mul(hr.fer.rasip.remes.simulator.core.datatypes.Type)
	 */
	@Override
	public Type mul(Type right) {
		if(right.getType() == TYPE_CODE.INTEGER || right.getType() == TYPE_CODE.NATURAL || right.getType() == TYPE_CODE.FLOAT) {
			float res = getValue().floatValue() * ((Number) right.getValue()).floatValue();
			return new FloatType(res);
		}
		throw new UnsupportedOperationException();
	}

	/** 
	 * Multiplies this Float with a Number.
	 * @see hr.fer.rasip.remes.simulator.core.datatypes.BaseType#mul(Number)
	 */
	@Override
	public Type mul(Number right) {
		float res = getValue().floatValue() * right.floatValue();
		return new FloatType(res);
	}
	
	/** 
	 * Divides this Float with a Integer, Natural, Float.
	 * @see hr.fer.rasip.remes.simulator.core.datatypes.BaseType#div(hr.fer.rasip.remes.simulator.core.datatypes.Type)
	 */
	@Override
	public Type div(Type right) {
		if(right.getType() == TYPE_CODE.INTEGER || right.getType() == TYPE_CODE.NATURAL || right.getType() == TYPE_CODE.FLOAT) {
			float res = getValue().floatValue() / ((Number) right.getValue()).floatValue();
			return new FloatType(res);
		}
		throw new UnsupportedOperationException();
	}

	/** 
	 * Divides this Float with a Number.
	 * @see hr.fer.rasip.remes.simulator.core.datatypes.BaseType#div(Number)
	 */
	@Override
	public Type div(Number right) {
		float res = getValue().floatValue() / right.floatValue();
		return new FloatType(res);
	}
	
	/** 
	 * Divides a Integer, Natural, Float with this Float.
	 * @see hr.fer.rasip.remes.simulator.core.datatypes.BaseType#rdiv(hr.fer.rasip.remes.simulator.core.datatypes.Type)
	 */
	@Override
	public Type rdiv(Type left) {
		if(left.getType() == TYPE_CODE.INTEGER || left.getType() == TYPE_CODE.NATURAL || left.getType() == TYPE_CODE.FLOAT) {
			float res = ((Number) left.getValue()).floatValue() / getValue().floatValue();
			return new FloatType(res);
		}
		throw new UnsupportedOperationException();
	}

	/** 
	 * Divides a Number with this Float.
	 * @see hr.fer.rasip.remes.simulator.core.datatypes.BaseType#rdiv(Number)
	 */
	@Override
	public Type rdiv(Number left) {
		float res = left.floatValue() / getValue().floatValue();
		return new FloatType(res);
	}
	
	/** 
	 * Calculates the modulo of this Float and a Integer, Natural, Float.
	 * @see hr.fer.rasip.remes.simulator.core.datatypes.BaseType#mod(hr.fer.rasip.remes.simulator.core.datatypes.Type)
	 */
	@Override
	public Type mod(Type right) {
		if(right.getType() == TYPE_CODE.INTEGER || right.getType() == TYPE_CODE.NATURAL || right.getType() == TYPE_CODE.FLOAT) {
			float res = getValue().floatValue() % ((Number) right.getValue()).floatValue();
			return new FloatType(res);
		}
		throw new UnsupportedOperationException();
	}

	/** 
	 * Calculates the modulo of this Float and a Number.
	 * @see hr.fer.rasip.remes.simulator.core.datatypes.BaseType#mod(Number)
	 */
	@Override
	public Type mod(Number right) {
		float res = getValue().floatValue() % right.floatValue();
		return new FloatType(res);
	}
	
	/** 
	 * Calculates the modulo of a Integer, Natural, Float and this Float. 
	 * @see hr.fer.rasip.remes.simulator.core.datatypes.BaseType#rmod(hr.fer.rasip.remes.simulator.core.datatypes.Type)
	 */
	@Override
	public Type rmod(Type left) {
		if(left.getType() == TYPE_CODE.INTEGER || left.getType() == TYPE_CODE.NATURAL || left.getType() == TYPE_CODE.FLOAT) {
			float res = ((Number) left.getValue()).floatValue() % getValue().floatValue();
			return new FloatType(res);
		}
		throw new UnsupportedOperationException();
	}

	/** 
	 * Calculates the modulo of a Number and this Float.
	 * @see hr.fer.rasip.remes.simulator.core.datatypes.BaseType#rmod(Number)
	 */
	@Override
	public Type rmod(Number left) {
		float res = left.floatValue() % getValue().floatValue();
		return new FloatType(res);
	}
	
	/**
	 * Assigns the value of Integer, Natural or Float to this Float.
 	 * @see hr.fer.rasip.remes.simulator.core.datatypes.BaseType#assign(hr.fer.rasip.remes.simulator.core.datatypes.Type)
	 */
	@Override
	public Type assign(Type right) {
		if(right.getType() == TYPE_CODE.INTEGER || right.getType() == TYPE_CODE.NATURAL || right.getType() == TYPE_CODE.FLOAT) {
			this.setValue(new Float(((Number) right.getValue()).floatValue()));
			return this;
		}
		throw new UnsupportedOperationException();
	}
	
	/**
	 * Assigns the value of a Number to this Float.
 	 * @see hr.fer.rasip.remes.simulator.core.datatypes.BaseType#assign(Number)
	 */
	@Override
	public Type assign(Number right) {
		this.setValue(new Float(right.floatValue()));
		return this;
	}
	
	/**
	 * Assigns the sum of values of this Float and Integer, Natural or Float.
 	 * @see hr.fer.rasip.remes.simulator.core.datatypes.BaseType#assignAdd(hr.fer.rasip.remes.simulator.core.datatypes.Type)
	 */
	@Override
	public Type assignAdd(Type right) {
		if(right.getType() == TYPE_CODE.INTEGER || right.getType() == TYPE_CODE.NATURAL || right.getType() == TYPE_CODE.FLOAT) {
			float res = getValue().floatValue() + ((Number) right.getValue()).floatValue();
			this.setValue(new Float(res));
			return this;
		}
		throw new UnsupportedOperationException();
	}

	/**
	 * Assigns the sum of values of this Float and a Number.
 	 * @see hr.fer.rasip.remes.simulator.core.datatypes.BaseType#assignAdd(Number)
	 */
	@Override
	public Type assignAdd(Number right) {
		float res = getValue().floatValue() + right.floatValue();
		this.setValue(new Float(res));
		return this;
	}
	
	/**
	 * Assigns the difference of values of this Float and Integer, Natural or Float.
 	 * @see hr.fer.rasip.remes.simulator.core.datatypes.BaseType#assignSub(hr.fer.rasip.remes.simulator.core.datatypes.Type)
	 */
	@Override
	public Type assignSub(Type right) {
		if(right.getType() == TYPE_CODE.INTEGER || right.getType() == TYPE_CODE.NATURAL || right.getType() == TYPE_CODE.FLOAT) {
			float res = getValue().floatValue() - ((Number) right.getValue()).floatValue();
			this.setValue(new Float(res));
			return this;
		}
		throw new UnsupportedOperationException();
	}

	/**
	 * Assigns the difference of values of this Float and a Number.
 	 * @see hr.fer.rasip.remes.simulator.core.datatypes.BaseType#assignSub(Number)
	 */
	@Override
	public Type assignSub(Number right) {
		float res = getValue().floatValue() - right.floatValue();
		this.setValue(new Float(res));
		return this;
	}
	
	/**
	 * Assigns the multiplication of values of this Float and Integer, Natural or Float.
 	 * @see hr.fer.rasip.remes.simulator.core.datatypes.BaseType#assignMul(hr.fer.rasip.remes.simulator.core.datatypes.Type)
	 */
	@Override
	public Type assignMul(Type right) {
		if(right.getType() == TYPE_CODE.INTEGER || right.getType() == TYPE_CODE.NATURAL || right.getType() == TYPE_CODE.FLOAT) {
			float res = getValue().floatValue() * ((Number) right.getValue()).floatValue();
			this.setValue(new Float(res));
			return this;
		}
		throw new UnsupportedOperationException();
	}

	/**
	 * Assigns the multiplication of values of this Float and a Number.
 	 * @see hr.fer.rasip.remes.simulator.core.datatypes.BaseType#assignMul(Number)
	 */
	@Override
	public Type assignMul(Number right) {
		float res = getValue().floatValue() * right.floatValue();
		this.setValue(new Float(res));
		return this;
	}
	
	/**
	 * Assigns the division of values of this Float and Integer, Natural or Float.
 	 * @see hr.fer.rasip.remes.simulator.core.datatypes.BaseType#assignDiv(hr.fer.rasip.remes.simulator.core.datatypes.Type)
	 */
	@Override
	public Type assignDiv(Type right) {
		if(right.getType() == TYPE_CODE.INTEGER || right.getType() == TYPE_CODE.NATURAL || right.getType() == TYPE_CODE.FLOAT) {
			float res = getValue().floatValue() / ((Number) right.getValue()).floatValue();
			this.setValue(new Float(res));
			return this;
		}
		throw new UnsupportedOperationException();
	}

	/**
	 * Assigns the division of values of this Float and a Number.
 	 * @see hr.fer.rasip.remes.simulator.core.datatypes.BaseType#assignDiv(Number)
	 */
	@Override
	public Type assignDiv(Number right) {
		float res = getValue().floatValue() / right.floatValue();
		this.setValue(new Float(res));
		return this;
	}

	/**
	 * Assigns the modulo of values of this Float and Integer, Natural or Float.
 	 * @see hr.fer.rasip.remes.simulator.core.datatypes.BaseType#assignMod(hr.fer.rasip.remes.simulator.core.datatypes.Type)
	 */
	@Override
	public Type assignMod(Type right) {
		if(right.getType() == TYPE_CODE.INTEGER || right.getType() == TYPE_CODE.NATURAL || right.getType() == TYPE_CODE.FLOAT) {
			float res = getValue().intValue() % ((Number) right.getValue()).floatValue();
			this.setValue(new Float(res));
			return this;
		}
		throw new UnsupportedOperationException();
	}

	/**
	 * Assigns the modulo of values of this Float and a Number.
 	 * @see hr.fer.rasip.remes.simulator.core.datatypes.BaseType#assignMod(Number)
	 */
	@Override
	public Type assignMod(Number right) {
		float res = getValue().intValue() % right.floatValue();
		this.setValue(new Float(res));
		return this;
	}

	
	/**
	 * Checks the equality of values of this Float and Integer, Natural or Float.
 	 * @see hr.fer.rasip.remes.simulator.core.datatypes.BaseType#eq(hr.fer.rasip.remes.simulator.core.datatypes.Type)
	 */
	@Override
	public Type eq(Type right) {
		if(right.getType() == TYPE_CODE.INTEGER || right.getType() == TYPE_CODE.NATURAL || right.getType() == TYPE_CODE.FLOAT) {
			boolean res = (getValue().floatValue() == ((Number) right.getValue()).floatValue());
			return new BooleanType(res);
		}
		throw new UnsupportedOperationException();
	}

	/**
	 * Checks the equality of values of this Float and a Number.
 	 * @see hr.fer.rasip.remes.simulator.core.datatypes.BaseType#eq(Number)
	 */
	@Override
	public Type eq(Number right) {
		boolean res = (getValue().floatValue() == right.floatValue());
		return new BooleanType(res);
	}

	/**
	 * Checks the inequality of values of this Float and Integer, Natural or Float.
 	 * @see hr.fer.rasip.remes.simulator.core.datatypes.BaseType#ne(hr.fer.rasip.remes.simulator.core.datatypes.Type)
	 */
	@Override
	public Type ne(Type right) {
		if(right.getType() == TYPE_CODE.INTEGER || right.getType() == TYPE_CODE.NATURAL || right.getType() == TYPE_CODE.FLOAT) {
			boolean res = (getValue().floatValue() != ((Number) right.getValue()).floatValue());
			return new BooleanType(res);
		}
		throw new UnsupportedOperationException();
	}

	/**
	 * Checks the inequality of values of this Float and a Number.
 	 * @see hr.fer.rasip.remes.simulator.core.datatypes.BaseType#ne(Number)
	 */
	@Override
	public Type ne(Number right) {
		boolean res = (getValue().floatValue() != right.floatValue());
		return new BooleanType(res);
	}
	
	/**
	 * Checks if this Float is greater or equal than a Integer, Natural or Float.
 	 * @see hr.fer.rasip.remes.simulator.core.datatypes.BaseType#ge(hr.fer.rasip.remes.simulator.core.datatypes.Type)
	 */
	@Override
	public Type ge(Type right) {
		if(right.getType() == TYPE_CODE.INTEGER || right.getType() == TYPE_CODE.NATURAL || right.getType() == TYPE_CODE.FLOAT) {
			boolean res = (getValue().floatValue() >= ((Number) right.getValue()).floatValue());
			return new BooleanType(res);
		}
		throw new UnsupportedOperationException();
	}

	/**
	 * Checks if this Float is greater or equal than a Number.
 	 * @see hr.fer.rasip.remes.simulator.core.datatypes.BaseType#ge(Number)
	 */
	@Override
	public Type ge(Number right) {
		boolean res = (getValue().floatValue() >= right.floatValue());
		return new BooleanType(res);
	}
	
	/**
	 * Checks if this Float is strictly greater than a Integer, Natural or Float.
 	 * @see hr.fer.rasip.remes.simulator.core.datatypes.BaseType#gt(hr.fer.rasip.remes.simulator.core.datatypes.Type)
	 */
	@Override
	public Type gt(Type right) {
		if(right.getType() == TYPE_CODE.INTEGER || right.getType() == TYPE_CODE.NATURAL || right.getType() == TYPE_CODE.FLOAT) {
			boolean res = (getValue().floatValue() > ((Number) right.getValue()).floatValue());
			return new BooleanType(res);
		}
		throw new UnsupportedOperationException();
	}

	/**
	 * Checks if this Float is strictly greater than a Number.
 	 * @see hr.fer.rasip.remes.simulator.core.datatypes.BaseType#gt(Number)
	 */
	@Override
	public Type gt(Number right) {
		boolean res = (getValue().floatValue() > right.floatValue());
		return new BooleanType(res);
	}
	
	/**
	 * Checks if this Float is less or equal than a Integer, Natural or Float.
 	 * @see hr.fer.rasip.remes.simulator.core.datatypes.BaseType#le(hr.fer.rasip.remes.simulator.core.datatypes.Type)
	 */
	@Override
	public Type le(Type right) {
		if(right.getType() == TYPE_CODE.INTEGER || right.getType() == TYPE_CODE.NATURAL || right.getType() == TYPE_CODE.FLOAT) {
			boolean res = (getValue().floatValue() <= ((Number) right.getValue()).floatValue());
			return new BooleanType(res);
		}
		throw new UnsupportedOperationException();
	}

	/**
	 * Checks if this Float is less or equal than a Number.
 	 * @see hr.fer.rasip.remes.simulator.core.datatypes.BaseType#le(Number)
	 */
	@Override
	public Type le(Number right) {
		boolean res = (getValue().floatValue() <= right.floatValue());
		return new BooleanType(res);
	}
	
	/**
	 * Checks if this Float is strictly less than a Integer, Natural or Float.
 	 * @see hr.fer.rasip.remes.simulator.core.datatypes.BaseType#lt(hr.fer.rasip.remes.simulator.core.datatypes.Type)
	 */
	@Override
	public Type lt(Type right) {
		if(right.getType() == TYPE_CODE.INTEGER || right.getType() == TYPE_CODE.NATURAL || right.getType() == TYPE_CODE.FLOAT) {
			boolean res = (getValue().floatValue() < ((Number) right.getValue()).floatValue());
			return new BooleanType(res);
		}
		throw new UnsupportedOperationException();
	}	

	/**
	 * Checks if this Float is strictly less than a Number.
 	 * @see hr.fer.rasip.remes.simulator.core.datatypes.BaseType#lt(Number)
	 */
	@Override
	public Type lt(Number right) {
		boolean res = (getValue().floatValue() < right.floatValue());
		return new BooleanType(res);
	}

	@Override
	public Type align(Type value) {
		throw new UnsupportedOperationException();
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "FloatType [" + value + "]";
	}
}
