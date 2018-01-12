/**
 * 
 */
package hr.fer.rasip.remes.simulator.core.datatypes;

import com.domainlanguage.intervals.Interval;

/**
 * @author Marin Orlic <marin.orlic@fer.hr>
 *
 */
public class ResourceType extends BaseType 
{
	private Interval value = null; // Default value
	
	/**
	 * Constructors
	 */
	public ResourceType(Integer value) {
		this.value = Interval.closed(value, value);
		
		setChanged();
		notifyObservers(value);
	}
	
	public ResourceType(int value) {
		Integer limit = new Integer(value);
		this.value = Interval.closed(limit, limit);
		
		setChanged();
		notifyObservers(value);
	}

	public ResourceType(Interval value) {
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
		return TYPE_CODE.RESOURCE;
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
		if(value instanceof Integer) {
			this.value = Interval.closed((Integer) value, (Integer) value);
			
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
		return new ResourceType(Interval.duplicate(this.value));
	}
	
	/**
	 * Assigns the value of Integer or Natural to this Resource.
 	 * @see hr.fer.rasip.remes.simulator.core.datatypes.BaseType#assign(hr.fer.rasip.remes.simulator.core.datatypes.Type)
	 */
	@Override
	public Type assign(Type right) {
		if(right.getType() == TYPE_CODE.INTEGER || right.getType() == TYPE_CODE.NATURAL) {
			this.setValue(Interval.single((Integer) right.getValue()));
			return this;
		}
		throw new UnsupportedOperationException();
	}
	
	/**
	 * Assigns the value of Number (integer value) to this Resource.
 	 * @see hr.fer.rasip.remes.simulator.core.datatypes.BaseType#assign(Number)
	 */
	@Override
	public Type assign(Number right) {
		this.setValue(Interval.single(right.intValue()));
		return this;
	}
	
	/**
	 * Assigns the sum of values of this Resource and Integer or Natural.
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
	 * Assigns the sum of values of this Resource and Number (integer value is taken).
 	 * @see hr.fer.rasip.remes.simulator.core.datatypes.BaseType#assignAdd(hr.fer.rasip.remes.simulator.core.datatypes.Type)
	 */
	@Override
	public Type assignAdd(Number right) {
		this.setValue(this.getValue().offset(right.intValue(), true));
		return this;
	}
	
	/**
	 * Offsets this Resource by a given Interval.
 	 * @see hr.fer.rasip.remes.simulator.core.datatypes.BaseType#assignAdd(hr.fer.rasip.remes.simulator.core.datatypes.Type)
 	 * @see com.domainlanguage.intervals.Interval#offset(Interval, boolean)
	 */
	public Type offset(Interval shift) {
		this.setValue(this.getValue().offset(shift, true));
		return this;
	}

	/**
	 * Assigns the difference of values of this Resource and Integer, Natural.
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
	 * Assigns the difference of values of this Resource and Integer.
 	 * @see hr.fer.rasip.remes.simulator.core.datatypes.BaseType#assignSub(Number)
	 */
	@Override
	public Type assignSub(Number right) {
		this.setValue(this.getValue().offset(right.intValue(), false));
		return this;
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
		return "ResourceType [" + value + "]";
	}	
}
