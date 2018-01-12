package hr.fer.rasip.remes.simulator.core.datatypes;

public class BooleanType extends BaseType
{	
	private Boolean value = null;
	
	/**
	 * Constructors
	 */
	public BooleanType(Boolean value) {
		this.value = value;
	}
		
	/**
	 * Returns the type
	 */
	@Override
	public TYPE_CODE getType() {
		return TYPE_CODE.BOOLEAN;
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
	public Boolean getValue() {
		return value;
	}

	/**
	 * @param value the value to set
	 */
	public void setValue(Object value) {
		if(value instanceof Boolean) {
			this.value = (Boolean) value;
		
			setChanged();
			notifyObservers(value);
		}
	}

	/**
	 * Creates a deep copy of this Type
	 */
	@Override
	public Type duplicate() {
		return new BooleanType(this.value.booleanValue());
	}
	
	/**
	 * Calculate logical NOT of current element.
 	 * @see hr.fer.rasip.remes.simulator.core.datatypes.BaseType#not()
	 */
	@Override
	public Type not() {
		return new BooleanType(!getValue());
	}
	
	/**
	 * Calculate logical AND between Boolean and Clock, other combinations are not allowed.
	 * Clock AND Boolean = (Boolean) ? Clock : false
 	 * @see hr.fer.rasip.remes.simulator.core.datatypes.BaseType#and(hr.fer.rasip.remes.simulator.core.datatypes.Type)
	 */
	@Override
	public Type and(Type right) {
		if(right.getType() == TYPE_CODE.BOOLEAN) {
			boolean res = getValue() && ((Boolean) right.getValue());
			return new BooleanType(new Boolean(res));
		}
		if(right.getType() == TYPE_CODE.CLOCK) {
			if(getValue())
				return right;
			else
				return new BooleanType(false);
		}
		
		return null;
	}

	/**
	 * Perform logical OR between Boolean and Clock, other combinations are not allowed.
	 * Clock OR Boolean = Clock
 	 * @see hr.fer.rasip.remes.simulator.core.datatypes.BaseType#or(hr.fer.rasip.remes.simulator.core.datatypes.Type)
	 */
	@Override
	public Type or(Type right) {
		if(right.getType() == TYPE_CODE.BOOLEAN) {
			boolean res = getValue() || ((Boolean) right.getValue());
			return new BooleanType(res);
		}
		if(right.getType() == TYPE_CODE.CLOCK)
			return right;
		
		throw new UnsupportedOperationException();
	}

	/**
	 * Compares the equality of two Booleans, other combinations are not allowed.
 	 * @see hr.fer.rasip.remes.simulator.core.datatypes.BaseType#eq(hr.fer.rasip.remes.simulator.core.datatypes.Type)
	 */
	@Override
	public Type eq(Type right) {
		if(right.getType() == TYPE_CODE.BOOLEAN) {
			boolean res = getValue().booleanValue() == ((Boolean) right.getValue()).booleanValue();
			return new BooleanType(res);
		}
		
		throw new UnsupportedOperationException();
	}

	/**
	 * Compares the inequality of two Booleans, other combinations are not allowed.
 	 * @see hr.fer.rasip.remes.simulator.core.datatypes.BaseType#ne(hr.fer.rasip.remes.simulator.core.datatypes.Type)
	 */
	@Override
	public Type ne(Type right) {
		if(right.getType() == TYPE_CODE.BOOLEAN) {
			boolean res = getValue() != ((Boolean) right.getValue());
			return new BooleanType(res);
		}

		throw new UnsupportedOperationException();
	}

	/**
	 * Assigns the value of right Boolean to this.
 	 * @see hr.fer.rasip.remes.simulator.core.datatypes.BaseType#assign(hr.fer.rasip.remes.simulator.core.datatypes.Type)
	 */
	@Override
	public Type assign(Type right) {
		if(right.getType() == TYPE_CODE.BOOLEAN) {
			this.setValue(right.getValue());
			return this;
		}
		
		throw new UnsupportedOperationException();
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
		return "BooleanType [" + value + "]";
	}
}
