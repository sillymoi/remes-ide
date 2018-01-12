package hr.fer.rasip.remes.simulator.core.datatypes;

import com.domainlanguage.intervals.Interval;

public class ClockType extends BaseType
{	
	private Interval value = null; // Default value
	
	/**
	 * Constructor
	 */
	public ClockType(Integer value) {
		this.value = Interval.closed(value, value);
		
		setChanged();
		notifyObservers(value);
	}
	
	public ClockType(int value) {
		Integer limit = new Integer(value);
		this.value = Interval.closed(limit, limit);
		
		setChanged();
		notifyObservers(value);
	}

	public ClockType(Interval value) {
		if(value != null) {
			this.value = value;
			
			setChanged();
			notifyObservers(value);
		}
	}
	
	/**
	 * Returns the type
	 */
	@Override
	public TYPE_CODE getType() {
		return TYPE_CODE.CLOCK;
	}

	/**
	 * This data type is not transferable to other modes.
	 */
	@Override
	public boolean isTransferrable() {
		return false;
	}
	
	/**
	 * @return the value
	 */
	public Interval getValue() {
		return value;
	}

	/**
	 * @param value the value to set
	 */
	public void setValue(Object value) {
		if(value instanceof Number) {
			this.value = Interval.closed(((Number) value).intValue(), ((Number) value).intValue());
			
			setChanged();
			notifyObservers(value);
		} else if(value instanceof Interval) {
			this.value = (Interval) value;
			
			setChanged();
			notifyObservers(value);
		}
	}
	
	/**
	 * Creates a deep copy of this Type
	 */
	@Override
	public Type duplicate() {
		return new ClockType(Interval.duplicate(this.value));
	}
	
	/**
	 * Calculate logical AND between Boolean and Clock or Clock and Clock, other combinations are not allowed.
	 * Clock AND Boolean = (Boolean) ? Clock : false
	 * Clock AND Clock = intersect(Clocks)
 	 * @see hr.fer.rasip.remes.simulator.core.datatypes.BaseType#and(hr.fer.rasip.remes.simulator.core.datatypes.Type)
 	 * @see hr.fer.rasip.remes.simulator.core.datatypes.BooleanType#and(hr.fer.rasip.remes.simulator.core.datatypes.Type)
	 */
	@Override
	public Type and(Type right) {
		if(right.getType() == TYPE_CODE.BOOLEAN) {
			if((Boolean)right.getValue())
				return this;
			else
				return new BooleanType(false);
		}
		if(right.getType() == TYPE_CODE.CLOCK) {
			return new ClockType(getValue().intersect(((ClockType) right).getValue()));
		}
		
		throw new UnsupportedOperationException();
	}
	
	/**
	 * Adds this Clock with Integer, Natural.
	 * @see hr.fer.rasip.remes.simulator.core.datatypes.BaseType#add(hr.fer.rasip.remes.simulator.core.datatypes.Type)
	 */
	@Override
	public Type add(Type right) {
		if(right.getType() == TYPE_CODE.INTEGER || right.getType() == TYPE_CODE.NATURAL) {
			return new ClockType(getValue().offset((Integer) right.getValue(), true));
		}
/*		if(right instanceof ClockType) {
			return right.add(this);
		}
*/		throw new UnsupportedOperationException();
	}

	/**
	 * Adds this Clock with Number (integer value is taken).
	 * @see hr.fer.rasip.remes.simulator.core.datatypes.BaseType#add(Number)
	 */
	@Override
	public Type add(Number right) {
		return new ClockType(getValue().offset(right.intValue(), true));
	}

	/**
	 * Subtracts from this Clock a Integer, Natural, Clock or Float.
	 * @see hr.fer.rasip.remes.simulator.core.datatypes.BaseType#sub(hr.fer.rasip.remes.simulator.core.datatypes.Type)
	 */
	@Override
	public Type sub(Type right) {
		if(right.getType() == TYPE_CODE.INTEGER || right.getType() == TYPE_CODE.NATURAL) {
			return new ClockType(getValue().offset((Integer) right.getValue(), false));
		}
		if(right.getType() == TYPE_CODE.CLOCK) {
			return new ClockType(getValue().offset(((ClockType) right).getValue(), false));
		}
		throw new UnsupportedOperationException();
	}

	/**
	 * Subtracts from this Clock an Number (integer value is taken).
	 * @see hr.fer.rasip.remes.simulator.core.datatypes.BaseType#sub(Number)
	 */
	@Override
	public Type sub(Number right) {
		return new ClockType(getValue().offset(right.intValue(), false));
	}

	/**
	 * Reverse subtracts from this Clock a Integer, Natural, Clock or Float.
	 * @see hr.fer.rasip.remes.simulator.core.datatypes.BaseType#rsub(hr.fer.rasip.remes.simulator.core.datatypes.Type)
	 */
	@Override
	public Type rsub(Type left) {
		if(left.getType() == TYPE_CODE.INTEGER || left.getType() == TYPE_CODE.NATURAL) {
			return new ClockType(getValue().offset(-((Integer) left.getValue()), true));
		}
		if(left.getType() == TYPE_CODE.CLOCK) {
			return new ClockType(((ClockType) left).getValue().offset(this.getValue(), true));
		}
		throw new UnsupportedOperationException();
	}

	/**
	 * Reverse subtracts from this Clock an Number (integer value is taken).
	 * @see hr.fer.rasip.remes.simulator.core.datatypes.BaseType#rsub(Number)
	 */
	@Override
	public Type rsub(Number left) {
		return new ClockType(getValue().offset(-(left.intValue()), true));
	}

	/**
	 * Assigns the value of Integer or Natural to this Clock.
 	 * @see hr.fer.rasip.remes.simulator.core.datatypes.BaseType#assign(hr.fer.rasip.remes.simulator.core.datatypes.Type)
	 */
	@Override
	public Type assign(Type right) {
		if(right.getType() == TYPE_CODE.INTEGER || right.getType() == TYPE_CODE.NATURAL) {
			this.setValue(Interval.single((Integer) right.getValue()));
			return this;
		}
		if(right.getType() == TYPE_CODE.CLOCK) {
			this.setValue(Interval.duplicate(((ClockType) right).getValue()));
			return this;
		}
		throw new UnsupportedOperationException();
	}
	
	/**
	 * Assigns the value of Number (converted to integer) to this Clock.
 	 * @see hr.fer.rasip.remes.simulator.core.datatypes.BaseType#assign(Number)
	 */
	@Override
	public Type assign(Number right) {
		this.setValue(Interval.single(right.intValue()));
		return this;
	}
	
	/**
	 * Assigns the sum of values of this Clock and Integer or Natural.
 	 * @see hr.fer.rasip.remes.simulator.core.datatypes.BaseType#assignAdd(hr.fer.rasip.remes.simulator.core.datatypes.Type)
	 */
	@Override
	public Type assignAdd(Type right) {
		if(right.getType() == TYPE_CODE.INTEGER || right.getType() == TYPE_CODE.NATURAL) {
			this.setValue(this.getValue().offset(((Integer) right.getValue()), true));
			return this;
		}
		throw new UnsupportedOperationException();
	}

	/**
	 * Assigns the sum of values of this Clock and Number (integer value is taken).
 	 * @see hr.fer.rasip.remes.simulator.core.datatypes.BaseType#assignAdd(hr.fer.rasip.remes.simulator.core.datatypes.Type)
	 */
	@Override
	public Type assignAdd(Number right) {
		this.setValue(this.getValue().offset(right.intValue(), true));
		return this;
	}
	
	/**
	 * Offsets this Clock by a given Interval.
 	 * @see hr.fer.rasip.remes.simulator.core.datatypes.BaseType#assignAdd(hr.fer.rasip.remes.simulator.core.datatypes.Type)
 	 * @see com.domainlanguage.intervals.Interval#offset(Interval, boolean)
	 */
	public Type offset(Interval shift) {
		this.setValue(this.getValue().offset(shift, true));
		return this;
	}

	/**
	 * Assigns the difference of values of this Clock and Integer, Natural.
 	 * @see hr.fer.rasip.remes.simulator.core.datatypes.BaseType#assignSub(hr.fer.rasip.remes.simulator.core.datatypes.Type)
	 */
	@Override
	public Type assignSub(Type right) {
		if(right.getType() == TYPE_CODE.INTEGER || right.getType() == TYPE_CODE.NATURAL) {
			this.setValue(this.getValue().offset(((Integer) right.getValue()), false));
			return this;
		}
		if(right.getType() == TYPE_CODE.CLOCK) {
			this.setValue(this.getValue().offset(((ClockType) right).getValue(), false));
			return this;
		}
		throw new UnsupportedOperationException();
	}

	/**
	 * Assigns the difference of values of this Clock and Number (integer value is taken).
 	 * @see hr.fer.rasip.remes.simulator.core.datatypes.BaseType#assignSub(Number)
	 */
	@Override
	public Type assignSub(Number right) {
		this.setValue(this.getValue().offset(right.intValue(), false));
		return this;
	}


	/**
	 * Checks the equality of values of this Clock and Integer, Natural or Clock.
 	 * @see hr.fer.rasip.remes.simulator.core.datatypes.BaseType#eq(hr.fer.rasip.remes.simulator.core.datatypes.Type)
	 */
	@Override
	public Type eq(Type right) {
		if(right.getType() == TYPE_CODE.INTEGER || right.getType() == TYPE_CODE.NATURAL) {
			Interval other = Interval.single((Integer) right.getValue()); 
			return new ClockType(other); //getValue().intersect(other));
		}
		if(right.getType() == TYPE_CODE.CLOCK) {
			return new BooleanType(getValue().equals(((ClockType) right).getValue()));
		}
		throw new UnsupportedOperationException();
	}

	/**
	 * Checks the equality of values of this Clock and Number (integer value is taken).
 	 * @see hr.fer.rasip.remes.simulator.core.datatypes.BaseType#eq(Number)
	 */
	@Override
	public Type eq(Number right) {
		Interval other = Interval.single(right.intValue());
		Interval result = timeSuccessor().intersect(other);
		if(result.isEmpty())
			return new BooleanType(false);
		else
			return new ClockType(result);
	}
	
	/**
	 * Returns a Clock that will be greater or equal than a Integer, Natural.
 	 * @see hr.fer.rasip.remes.simulator.core.datatypes.BaseType#ge(hr.fer.rasip.remes.simulator.core.datatypes.Type)
	 */
	@Override
	public Type ge(Type right) {
		if(right.getType() == TYPE_CODE.INTEGER || right.getType() == TYPE_CODE.NATURAL) {
			Interval other = Interval.over((Integer) right.getValue(), true, null, false);
			Interval succ = timeSuccessor();
			return new ClockType(succ.intersect(other));
		}
		if(right.getType() == TYPE_CODE.CLOCK) {
			return right.le(this);
		}
		throw new UnsupportedOperationException();
	}

	/**
	 * Returns a Clock that will be greater or equal than an Number (integer value is taken).
 	 * @see hr.fer.rasip.remes.simulator.core.datatypes.BaseType#ge(Number)
	 */
	@Override
	public Type ge(Number right) {
		Interval other = Interval.over(right.intValue(), true, null, false); 
		Interval succ = timeSuccessor();
		return new ClockType(succ.intersect(other));
	}
	
	/**
	 * Returns a Clock that will be strictly greater than a Integer, Natural.
 	 * @see hr.fer.rasip.remes.simulator.core.datatypes.BaseType#gt(hr.fer.rasip.remes.simulator.core.datatypes.Type)
	 */
	@Override
	public Type gt(Type right) {
		if(right.getType() == TYPE_CODE.INTEGER || right.getType() == TYPE_CODE.NATURAL) {
			Interval other = Interval.open((Integer) right.getValue(), null); 
			Interval succ = timeSuccessor();
			return new ClockType(succ.intersect(other));
		}
		if(right.getType() == TYPE_CODE.CLOCK) {
			return right.lt(this);
		}
		throw new UnsupportedOperationException();
	}

	/**
	 * Returns a Clock that will be strictly greater than a Number (integer value is taken).
 	 * @see hr.fer.rasip.remes.simulator.core.datatypes.BaseType#gt(Number)
	 */
	@Override
	public Type gt(Number right) {
		Interval other = Interval.open(right.intValue(), null);
		Interval succ = timeSuccessor();
		return new ClockType(succ.intersect(other));
	}
	
	/**
	 * Returns a Clock that will be less or equal than a Integer, Natural.
 	 * @see hr.fer.rasip.remes.simulator.core.datatypes.BaseType#le(hr.fer.rasip.remes.simulator.core.datatypes.Type)
	 */
	@Override
	public Type le(Type right) {
		if(right.getType() == TYPE_CODE.INTEGER || right.getType() == TYPE_CODE.NATURAL) {
			Interval other = Interval.over(null, false, (Integer) right.getValue(), true); 
			Interval succ = timeSuccessor();
			return new ClockType(succ.intersect(other));
		}
		if(right.getType() == TYPE_CODE.CLOCK) {
			return right.ge(this);
		}
		throw new UnsupportedOperationException();
	}
	
	/**
	 * Returns a Clock that will be less or equal than a Number (integer value is taken).
 	 * @see hr.fer.rasip.remes.simulator.core.datatypes.BaseType#le(hr.fer.rasip.remes.simulator.core.datatypes.Type)
	 */
	@Override
	public Type le(Number right) {
		Interval other = Interval.over(null, false, right.intValue(), true); 
		Interval succ = timeSuccessor();
		return new ClockType(succ.intersect(other));
	}
	
	/**
	 * Returns a Clock that will be strictly less than a Integer, Natural.
 	 * @see hr.fer.rasip.remes.simulator.core.datatypes.BaseType#lt(hr.fer.rasip.remes.simulator.core.datatypes.Type)
	 */
	@Override
	public Type lt(Type right) {
		if(right.getType() == TYPE_CODE.INTEGER || right.getType() == TYPE_CODE.NATURAL) {
			Interval other = Interval.open(null, (Integer) right.getValue()); 
			Interval succ = timeSuccessor();
			return new ClockType(succ.intersect(other));
		}
		if(right.getType() == TYPE_CODE.CLOCK) {
			return right.gt(this);
		}
		throw new UnsupportedOperationException();
	}
	
	/**
	 * Returns a Clock that will be strictly less than a Number (integer value is taken).
 	 * @see hr.fer.rasip.remes.simulator.core.datatypes.BaseType#lt(hr.fer.rasip.remes.simulator.core.datatypes.Type)
	 */
	@Override
	public Type lt(Number right) {
		Interval other = Interval.open(null, right.intValue()); 
		Interval succ = timeSuccessor();
		return new ClockType(succ.intersect(other));
	}
	
	/**
	 * Performs a time successor interval of this ClockType
	 * by removing the upper bound on associated interval.
	 */
	protected Interval timeSuccessor() {
		Interval current = this.getValue();
		Interval result = Interval.over(current.lowerLimit(), current.hasLowerLimit(), null, false);
		return result;
	}

	@Override
	public Type align(Type right) {
		if(right.getType() == TYPE_CODE.CLOCK) {
			Interval current = this.getValue();
			Interval other = (Interval) right.getValue();
			return new ClockType(current.relate(other));
		}
		throw new UnsupportedOperationException();
	}
	
	/**
	 * Returns a string representation of this object
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ClockType [" + value + "]";
	}
}
