package hr.fer.rasip.remes.simulator.core.datatypes;

public class NaturalType extends IntegerType
{
	private Integer value = null;
	
	/**
	 * Constructor
	 */
	public NaturalType(Integer value) {
		super(value);
		this.setValue(value);
	}
	
	/**
	 * Returns the type
	 */
	@Override
	public TYPE_CODE getType() {
		return TYPE_CODE.NATURAL;
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
			if((Integer) value < 0)
				this.setValue(0);
			else
				this.setValue((Integer) value);
			}
	}
	
	/**
	 * Adds this Natural with Integer, Natural, Clock or Float.
	 * @see hr.fer.rasip.remes.simulator.core.datatypes.IntegerType#add(hr.fer.rasip.remes.simulator.core.datatypes.Type)
	 * @see hr.fer.rasip.remes.simulator.core.datatypes.ClockType#add(hr.fer.rasip.remes.simulator.core.datatypes.Type)
	 */
	@Override
	public Type add(Type right) {
		if(right.getType() == TYPE_CODE.INTEGER || right.getType() == TYPE_CODE.NATURAL || right.getType() == TYPE_CODE.FLOAT) {
			int res = getValue().intValue() + ((Number) right.getValue()).intValue();
			return new NaturalType(res);
		}
		if(right.getType() == TYPE_CODE.CLOCK) {
			return right.add(this);
		}
		throw new UnsupportedOperationException();
	}

	/**
	 * Subtracts from this Natural a Integer, Natural, Clock or Float.
	 * @see hr.fer.rasip.remes.simulator.core.datatypes.IntegerType#sub(hr.fer.rasip.remes.simulator.core.datatypes.Type)
	 * @see hr.fer.rasip.remes.simulator.core.datatypes.ClockType#rsub(hr.fer.rasip.remes.simulator.core.datatypes.Type)
	 */
	@Override
	public Type sub(Type right) {
		if(right.getType() == TYPE_CODE.INTEGER || right.getType() == TYPE_CODE.NATURAL || right.getType() == TYPE_CODE.FLOAT) {
			int res = (int)(getValue().intValue() - ((Number) right.getValue()).floatValue());
			return new NaturalType(res);
		}
		if(right.getType() == TYPE_CODE.CLOCK) {
			return right.rsub(this);
		}
		throw new UnsupportedOperationException();
	}

	/** 
	 * Multiplies this Natural with a Integer, Natural, Clock or Float.
	 * @see hr.fer.rasip.remes.simulator.core.datatypes.IntegerType#mul(hr.fer.rasip.remes.simulator.core.datatypes.Type)
	 * @see hr.fer.rasip.remes.simulator.core.datatypes.ClockType#mul(hr.fer.rasip.remes.simulator.core.datatypes.Type)
	 */
	@Override
	public Type mul(Type right) {
		if(right.getType() == TYPE_CODE.INTEGER || right.getType() == TYPE_CODE.NATURAL || right.getType() == TYPE_CODE.FLOAT) {
			int res = (int)(getValue().intValue() * ((Number) right.getValue()).floatValue());
			return new NaturalType(res);
		}
		if(right.getType() == TYPE_CODE.CLOCK) {
			return right.mul(this);
		}
		throw new UnsupportedOperationException();
	}

	/** 
	 * Divides this Natural with a Integer, Natural, Float.
	 * @see hr.fer.rasip.remes.simulator.core.datatypes.IntegerType#div(hr.fer.rasip.remes.simulator.core.datatypes.Type)
	 */
	@Override
	public Type div(Type right) {
		if(right.getType() == TYPE_CODE.INTEGER || right.getType() == TYPE_CODE.NATURAL || right.getType() == TYPE_CODE.FLOAT) {
			int res = (int)(getValue().intValue() / ((Number) right.getValue()).floatValue());
			return new NaturalType(res);
		}
		throw new UnsupportedOperationException();
	}

	/** 
	 * Calculates the modulo of this Natural and a Integer, Natural, Float.
	 * @see hr.fer.rasip.remes.simulator.core.datatypes.IntegerType#mod(hr.fer.rasip.remes.simulator.core.datatypes.Type)
	 */
	@Override
	public Type mod(Type right) {
		if(right.getType() == TYPE_CODE.INTEGER || right.getType() == TYPE_CODE.NATURAL || right.getType() == TYPE_CODE.FLOAT) {
			int res = (int)(getValue().intValue() % ((Number) right.getValue()).floatValue());
			return new NaturalType(res);
		}
		throw new UnsupportedOperationException();
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "NaturalType [" + value + "]";
	}
}
