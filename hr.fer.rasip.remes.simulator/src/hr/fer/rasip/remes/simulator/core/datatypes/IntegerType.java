package hr.fer.rasip.remes.simulator.core.datatypes;

public class IntegerType extends BaseType
{
	private Integer value = null;
	
	/**
	 * Constructor
	 */
	public IntegerType(Integer value) {
		this.value = value;
		
		setChanged();
		notifyObservers(value);
	}
	
	public IntegerType(int value) {
		this.value = new Integer(value);
		
		setChanged();
		notifyObservers(value);
	}
	
	/**
	 * Returns the type
	 */
	@Override
	public TYPE_CODE getType() {
		return TYPE_CODE.INTEGER;
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
	public Integer getValue() {
		return value;
	}

	/**
	 * @param value the value to set
	 */
	public void setValue(Object value) {
		if(value instanceof Integer) {
			this.value = (Integer) value;
		
			setChanged();
			notifyObservers(value);
		}
	}
	
	/**
	 * Creates a deep copy of this Type
	 */
	@Override
	public Type duplicate() {
		return new IntegerType(this.value.intValue());
	}
	
	/**
	 * Returns a negative value of this Integer.
	 * @see hr.fer.rasip.remes.simulator.core.datatypes.BaseType#neg()
	 */
	@Override
	public Type neg() {
		return new IntegerType( - this.value.intValue());
	}	
	
	/**
	 * Adds this Integer with Integer, Natural, Clock or Float.
	 * @see hr.fer.rasip.remes.simulator.core.datatypes.BaseType#add(hr.fer.rasip.remes.simulator.core.datatypes.Type)
	 * @see hr.fer.rasip.remes.simulator.core.datatypes.ClockType#add(hr.fer.rasip.remes.simulator.core.datatypes.Type)
	 */
	@Override
	public Type add(Type right) {
		if(right.getType() == TYPE_CODE.INTEGER || right.getType() == TYPE_CODE.NATURAL || right.getType() == TYPE_CODE.FLOAT) {
			int res = getValue().intValue() + ((Number) right.getValue()).intValue();
			return new IntegerType(res);
		}
		if(right.getType() == TYPE_CODE.CLOCK) {
			return right.add(this);
		}
		throw new UnsupportedOperationException();
	}

	/**
	 * Adds this Integer with a Number.
	 * @see hr.fer.rasip.remes.simulator.core.datatypes.BaseType#add(Number)
	 */
	@Override
	public Type add(Number right) {
		int res = getValue().intValue() + right.intValue();
		return new IntegerType(res);
	}

	
	/**
	 * Subtracts from this Integer a Integer, Natural, Clock or Float.
	 * @see hr.fer.rasip.remes.simulator.core.datatypes.BaseType#sub(hr.fer.rasip.remes.simulator.core.datatypes.Type)
	 * @see hr.fer.rasip.remes.simulator.core.datatypes.ClockType#rsub(hr.fer.rasip.remes.simulator.core.datatypes.Type)
	 */
	@Override
	public Type sub(Type right) {
		if(right.getType() == TYPE_CODE.INTEGER || right.getType() == TYPE_CODE.NATURAL || right.getType() == TYPE_CODE.FLOAT) {
			int res = (int)(getValue().intValue() - ((Number) right.getValue()).floatValue());
			return new IntegerType(res);
		}
		if(right.getType() == TYPE_CODE.CLOCK) {
			return right.rsub(this);
		}
		throw new UnsupportedOperationException();
	}

	/**
	 * Subtracts from this Integer a Number.
	 * @see hr.fer.rasip.remes.simulator.core.datatypes.BaseType#sub(Number)
	 */
	@Override
	public Type sub(Number right) {
		int res = (int)(getValue().intValue() - right.floatValue());
		return new IntegerType(res);
	}
	
	/**
	 * Subtracts from Integer, Natural or Float this Integer.
	 * @see hr.fer.rasip.remes.simulator.core.datatypes.BaseType#rsub(hr.fer.rasip.remes.simulator.core.datatypes.Type)
	 */
	@Override
	public Type rsub(Type left) {
		if(left.getType() == TYPE_CODE.INTEGER || left.getType() == TYPE_CODE.NATURAL || left.getType() == TYPE_CODE.FLOAT) {
			int res = (int) (((Number) left.getValue()).floatValue() - getValue().intValue());
			return new IntegerType(res);
		}
		throw new UnsupportedOperationException();
	}

	/**
	 * Subtracts this Integer from a Number.
	 * @see hr.fer.rasip.remes.simulator.core.datatypes.BaseType#rsub(Number)
	 */
	@Override
	public Type rsub(Number left) {
		int res = (int) (left.floatValue() - getValue().intValue());
		return new IntegerType(res);
	}
	
	/** 
	 * Multiplies this Integer with a Integer, Natural, Clock or Float.
	 * @see hr.fer.rasip.remes.simulator.core.datatypes.BaseType#mul(hr.fer.rasip.remes.simulator.core.datatypes.Type)
	 * @see hr.fer.rasip.remes.simulator.core.datatypes.ClockType#mul(hr.fer.rasip.remes.simulator.core.datatypes.Type)
	 */
	@Override
	public Type mul(Type right) {
		if(right.getType() == TYPE_CODE.INTEGER || right.getType() == TYPE_CODE.NATURAL || right.getType() == TYPE_CODE.FLOAT) {
			int res = (int)(getValue().intValue() * ((Number) right.getValue()).floatValue());
			return new IntegerType(res);
		}
		if(right.getType() == TYPE_CODE.CLOCK) {
			return right.mul(this);
		}
		throw new UnsupportedOperationException();
	}

	/** 
	 * Multiplies this Integer with a Number.
	 * @see hr.fer.rasip.remes.simulator.core.datatypes.BaseType#mul(Number)
	 */
	@Override
	public Type mul(Number right) {
		int res = (int)(getValue().intValue() * right.floatValue());
		return new IntegerType(res);
	}
	
	/** 
	 * Divides this Integer with a Integer, Natural, Float.
	 * @see hr.fer.rasip.remes.simulator.core.datatypes.BaseType#div(hr.fer.rasip.remes.simulator.core.datatypes.Type)
	 */
	@Override
	public Type div(Type right) {
		if(right.getType() == TYPE_CODE.INTEGER || right.getType() == TYPE_CODE.NATURAL || right.getType() == TYPE_CODE.FLOAT) {
			int res = (int)(getValue().intValue() / ((Number) right.getValue()).floatValue());
			return new IntegerType(res);
		}
		throw new UnsupportedOperationException();
	}
	
	/** 
	 * Divides this Integer with a Number.
	 * @see hr.fer.rasip.remes.simulator.core.datatypes.BaseType#div(Number)
	 */
	@Override
	public Type div(Number right) {
		int res = (int)(getValue().intValue() / right.floatValue());
		return new IntegerType(res);
	}

	/** 
	 * Divides a Integer, Natural, Float with this Integer.
	 * @see hr.fer.rasip.remes.simulator.core.datatypes.BaseType#rdiv(hr.fer.rasip.remes.simulator.core.datatypes.Type)
	 */
	@Override
	public Type rdiv(Type left) {
		if(left.getType() == TYPE_CODE.INTEGER || left.getType() == TYPE_CODE.NATURAL || left.getType() == TYPE_CODE.FLOAT) {
			int res = (int)(((Number) left.getValue()).floatValue() / getValue().intValue());
			return new IntegerType(res);
		}
		throw new UnsupportedOperationException();
	}

	/** 
	 * Divides a Number with this Integer.
	 * @see hr.fer.rasip.remes.simulator.core.datatypes.BaseType#rdiv(Number)
	 */
	@Override
	public Type rdiv(Number left) {
		int res = (int) (left.floatValue() / getValue().intValue());
		return new IntegerType(res);
	}
	
	/** 
	 * Calculates the modulo of this Integer and a Integer, Natural, Float.
	 * @see hr.fer.rasip.remes.simulator.core.datatypes.BaseType#mod(hr.fer.rasip.remes.simulator.core.datatypes.Type)
	 */
	@Override
	public Type mod(Type right) {
		if(right.getType() == TYPE_CODE.INTEGER || right.getType() == TYPE_CODE.NATURAL || right.getType() == TYPE_CODE.FLOAT) {
			int res = (int)(getValue().intValue() % ((Number) right.getValue()).floatValue());
			return new IntegerType(res);
		}
		throw new UnsupportedOperationException();
	}

	/** 
	 * Calculates the modulo of this Integer and a Number.
	 * @see hr.fer.rasip.remes.simulator.core.datatypes.BaseType#mod(Number)
	 */
	@Override
	public Type mod(Number right) {
		int res = (int)(getValue().intValue() % right.floatValue());
		return new IntegerType(res);
	}
	
	/** 
	 * Calculates the modulo of a Integer, Natural, Float and this Integer. 
	 * @see hr.fer.rasip.remes.simulator.core.datatypes.BaseType#rmod(hr.fer.rasip.remes.simulator.core.datatypes.Type)
	 */
	@Override
	public Type rmod(Type left) {
		if(left.getType() == TYPE_CODE.INTEGER || left.getType() == TYPE_CODE.NATURAL || left.getType() == TYPE_CODE.FLOAT) {
			int res = (int)(((Number) left.getValue()).floatValue() % getValue().intValue());
			return new IntegerType(res);
		}
		throw new UnsupportedOperationException();
	}

	/** 
	 * Calculates the modulo of a Number and this Integer.
	 * @see hr.fer.rasip.remes.simulator.core.datatypes.BaseType#rmod(Number)
	 */
	@Override
	public Type rmod(Number left) {
		int res = (int)(left.floatValue() % getValue().intValue());
		return new IntegerType(res);
	}
	
	/**
	 * Assigns the value of Integer, Natural or Float to this Integer.
 	 * @see hr.fer.rasip.remes.simulator.core.datatypes.BaseType#assign(hr.fer.rasip.remes.simulator.core.datatypes.Type)
	 */
	@Override
	public Type assign(Type right) {
		if(right.getType() == TYPE_CODE.INTEGER || right.getType() == TYPE_CODE.NATURAL || right.getType() == TYPE_CODE.FLOAT) {
			this.setValue(new Integer(((Number) right.getValue()).intValue()));
			return this;
		}
		throw new UnsupportedOperationException();
	}

	/**
	 * Assigns the value of a Number to this Integer.
 	 * @see hr.fer.rasip.remes.simulator.core.datatypes.BaseType#assign(Number)
	 */
	@Override
	public Type assign(Number right) {
		this.setValue(right.intValue());
		return this;
	}

	
	/**
	 * Assigns the sum of values of this Integer and Integer, Natural or Float.
 	 * @see hr.fer.rasip.remes.simulator.core.datatypes.BaseType#assignAdd(hr.fer.rasip.remes.simulator.core.datatypes.Type)
	 */
	@Override
	public Type assignAdd(Type right) {
		if(right.getType() == TYPE_CODE.INTEGER || right.getType() == TYPE_CODE.NATURAL || right.getType() == TYPE_CODE.FLOAT) {
			int res = getValue().intValue() + ((Number) right.getValue()).intValue();
			this.setValue(new Integer(res));
			return this;
		}
		throw new UnsupportedOperationException();
	}

	/**
	 * Assigns the sum of values of this Integer and a Number.
 	 * @see hr.fer.rasip.remes.simulator.core.datatypes.BaseType#assignAdd(Number)
	 */
	@Override
	public Type assignAdd(Number right) {
		int res = getValue().intValue() + right.intValue();
		this.setValue(new Integer(res));
		return this;
	}
	
	/**
	 * Assigns the difference of values of this Integer and Integer, Natural or Float.
 	 * @see hr.fer.rasip.remes.simulator.core.datatypes.BaseType#assignSub(hr.fer.rasip.remes.simulator.core.datatypes.Type)
	 */
	@Override
	public Type assignSub(Type right) {
		if(right.getType() == TYPE_CODE.INTEGER || right.getType() == TYPE_CODE.NATURAL || right.getType() == TYPE_CODE.FLOAT) {
			int res = (int)(getValue().intValue() - ((Number) right.getValue()).floatValue());
			this.setValue(new Integer(res));
			return this;
		}
		throw new UnsupportedOperationException();
	}

	/**
	 * Assigns the difference of values of this Integer and a Number.
 	 * @see hr.fer.rasip.remes.simulator.core.datatypes.BaseType#assignSub(Number)
	 */
	@Override
	public Type assignSub(Number right) {
			int res = (int)(getValue().intValue() - right.floatValue());
			this.setValue(new Integer(res));
			return this;
	}
	
	/**
	 * Assigns the multiplication of values of this Integer and Integer, Natural or Float.
 	 * @see hr.fer.rasip.remes.simulator.core.datatypes.BaseType#assignMul(hr.fer.rasip.remes.simulator.core.datatypes.Type)
	 */
	@Override
	public Type assignMul(Type right) {
		if(right.getType() == TYPE_CODE.INTEGER || right.getType() == TYPE_CODE.NATURAL || right.getType() == TYPE_CODE.FLOAT) {
			int res = (int)(getValue().intValue() * ((Number) right.getValue()).floatValue());
			this.setValue(new Integer(res));
			return this;
		}
		throw new UnsupportedOperationException();
	}

	/**
	 * Assigns the multiplication of values of this Integer and a Number.
 	 * @see hr.fer.rasip.remes.simulator.core.datatypes.BaseType#assignMul(Number)
	 */
	@Override
	public Type assignMul(Number right) {
		int res = (int)(getValue().intValue() * right.floatValue());
		this.setValue(new Integer(res));
		return this;
	}
	
	/**
	 * Assigns the division of values of this Integer and Integer, Natural or Float.
 	 * @see hr.fer.rasip.remes.simulator.core.datatypes.BaseType#assignDiv(hr.fer.rasip.remes.simulator.core.datatypes.Type)
	 */
	@Override
	public Type assignDiv(Type right) {
		if(right.getType() == TYPE_CODE.INTEGER || right.getType() == TYPE_CODE.NATURAL || right.getType() == TYPE_CODE.FLOAT) {
			int res = (int)(getValue().intValue() / ((Number) right.getValue()).floatValue());
			this.setValue(new Integer(res));
			return this;
		}
		throw new UnsupportedOperationException();
	}

	/**
	 * Assigns the division of values of this Integer and a Number.
 	 * @see hr.fer.rasip.remes.simulator.core.datatypes.BaseType#assignDiv(Number)
	 */
	@Override
	public Type assignDiv(Number right) {
		int res = (int)(getValue().intValue() / right.floatValue());
		this.setValue(new Integer(res));
		return this;
	}
	
	/**
	 * Assigns the modulo of values of this Integer and Integer, Natural or Float.
 	 * @see hr.fer.rasip.remes.simulator.core.datatypes.BaseType#assignMod(hr.fer.rasip.remes.simulator.core.datatypes.Type)
	 */
	@Override
	public Type assignMod(Type right) {
		if(right.getType() == TYPE_CODE.INTEGER || right.getType() == TYPE_CODE.NATURAL || right.getType() == TYPE_CODE.FLOAT) {
			int res = (int)(getValue().intValue() % ((Number) right.getValue()).floatValue());
			this.setValue(new Integer(res));
			return this;
		}
		throw new UnsupportedOperationException();
	}

	/**
	 * Assigns the modulo of values of this Integer and a Number.
 	 * @see hr.fer.rasip.remes.simulator.core.datatypes.BaseType#assignMod(Number)
	 */
	@Override
	public Type assignMod(Number right) {
		int res = (int)(getValue().intValue() % right.floatValue());
		this.setValue(new Integer(res));
		return this;
	}
	
	/**
	 * Checks the equality of values of this Integer and Integer, Natural, Clock or Float.
 	 * @see hr.fer.rasip.remes.simulator.core.datatypes.BaseType#eq(hr.fer.rasip.remes.simulator.core.datatypes.Type)
 	 * @see hr.fer.rasip.remes.simulator.core.datatypes.ClockType#eq(hr.fer.rasip.remes.simulator.core.datatypes.Type)
	 */
	@Override
	public Type eq(Type right) {
		if(right.getType() == TYPE_CODE.INTEGER || right.getType() == TYPE_CODE.NATURAL || right.getType() == TYPE_CODE.FLOAT) {
			boolean res = (getValue().floatValue() == ((Number) right.getValue()).floatValue());
			return new BooleanType(res);
		}
		if(right.getType() == TYPE_CODE.CLOCK) {
			return right.eq(this);
		}
		throw new UnsupportedOperationException();
	}

	/**
	 * Checks the equality of values of this Integer and a Number.
 	 * @see hr.fer.rasip.remes.simulator.core.datatypes.BaseType#eq(Number)
	 */
	@Override
	public Type eq(Number right) {
		boolean res = (getValue().floatValue() == right.floatValue());
		return new BooleanType(res);
	}
	
	/**
	 * Checks the inequality of values of this Integer and Integer, Natural, Clock or Float.
 	 * @see hr.fer.rasip.remes.simulator.core.datatypes.BaseType#ne(hr.fer.rasip.remes.simulator.core.datatypes.Type)
 	 * @see hr.fer.rasip.remes.simulator.core.datatypes.ClockType#eq(hr.fer.rasip.remes.simulator.core.datatypes.Type)
	 */
	@Override
	public Type ne(Type right) {
		if(right.getType() == TYPE_CODE.INTEGER || right.getType() == TYPE_CODE.NATURAL || right.getType() == TYPE_CODE.FLOAT) {
			boolean res = (getValue().floatValue() != ((Number) right.getValue()).floatValue());
			return new BooleanType(res);
		}
		if(right.getType() == TYPE_CODE.CLOCK) {
			return right.ne(this);
		}
		throw new UnsupportedOperationException();
	}

	/**
	 * Checks the inequality of values of this Integer and a Number.
 	 * @see hr.fer.rasip.remes.simulator.core.datatypes.BaseType#ne(Number)
	 */
	@Override
	public Type ne(Number right) {
		boolean res = (getValue().floatValue() != right.floatValue());
		return new BooleanType(res);
	}

	/**
	 * Checks if this Integer is greater or equal than a Integer, Natural or Float.
 	 * @see hr.fer.rasip.remes.simulator.core.datatypes.BaseType#ge(hr.fer.rasip.remes.simulator.core.datatypes.Type)
	 */
	@Override
	public Type ge(Type right) {
		if(right.getType() == TYPE_CODE.INTEGER || right.getType() == TYPE_CODE.NATURAL || right.getType() == TYPE_CODE.FLOAT) {
			boolean res = (getValue().floatValue() >= ((Number) right.getValue()).floatValue());
			return new BooleanType(res);
		}
		if(right.getType() == TYPE_CODE.CLOCK) {
			return right.le(this);
		}
		throw new UnsupportedOperationException();
	}

	/**
	 * Checks if this Integer is greater or equal than a Number.
 	 * @see hr.fer.rasip.remes.simulator.core.datatypes.BaseType#ge(Number)
	 */
	@Override
	public Type ge(Number right) {
		boolean res = (getValue().floatValue() >= right.floatValue());
		return new BooleanType(res);
	}

	/**
	 * Checks if this Integer is strictly greater than a Integer, Natural or Float.
 	 * @see hr.fer.rasip.remes.simulator.core.datatypes.BaseType#gt(hr.fer.rasip.remes.simulator.core.datatypes.Type)
	 */
	@Override
	public Type gt(Type right) {
		if(right.getType() == TYPE_CODE.INTEGER || right.getType() == TYPE_CODE.NATURAL || right.getType() == TYPE_CODE.FLOAT) {
			boolean res = (getValue().floatValue() > ((Number) right.getValue()).floatValue());
			return new BooleanType(res);
		}
		if(right.getType() == TYPE_CODE.CLOCK) {
			return right.lt(this);
		}
		throw new UnsupportedOperationException();
	}

	/**
	 * Checks if this Integer is strictly greater than a Number.
 	 * @see hr.fer.rasip.remes.simulator.core.datatypes.BaseType#gt(Number)
	 */
	@Override
	public Type gt(Number right) {
		boolean res = (getValue().floatValue() > right.floatValue());
		return new BooleanType(res);
	}
	
	/**
	 * Checks if this Integer is less or equal than a Integer, Natural or Float.
 	 * @see hr.fer.rasip.remes.simulator.core.datatypes.BaseType#le(hr.fer.rasip.remes.simulator.core.datatypes.Type)
	 */
	@Override
	public Type le(Type right) {
		if(right.getType() == TYPE_CODE.INTEGER || right.getType() == TYPE_CODE.NATURAL || right.getType() == TYPE_CODE.FLOAT) {
			boolean res = (getValue().floatValue() <= ((Number) right.getValue()).floatValue());
			return new BooleanType(res);
		}
		if(right.getType() == TYPE_CODE.CLOCK) {
			return right.ge(this);
		}
		throw new UnsupportedOperationException();
	}

	/**
	 * Checks if this Integer is less or equal than a Number.
 	 * @see hr.fer.rasip.remes.simulator.core.datatypes.BaseType#le(Number)
	 */
	@Override
	public Type le(Number right) {
		boolean res = (getValue().floatValue() <= right.floatValue());
		return new BooleanType(res);
	}
	
	/**
	 * Checks if this Integer is strictly less than a Integer, Natural or Float.
 	 * @see hr.fer.rasip.remes.simulator.core.datatypes.BaseType#lt(hr.fer.rasip.remes.simulator.core.datatypes.Type)
	 */
	@Override
	public Type lt(Type right) {
		if(right.getType() == TYPE_CODE.INTEGER || right.getType() == TYPE_CODE.NATURAL || right.getType() == TYPE_CODE.FLOAT) {
			boolean res = (getValue().floatValue() < ((Number) right.getValue()).floatValue());
			return new BooleanType(res);
		}
		if(right.getType() == TYPE_CODE.CLOCK) {
			return right.gt(this);
		}
		throw new UnsupportedOperationException();
	}	
	
	/**
	 * Checks if this Integer is strictly less than a Number.
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
		return "IntegerType [" + value + "]";
	}	
}
