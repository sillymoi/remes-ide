/**
 * 
 */
package hr.fer.rasip.remes.simulator.core.datatypes;

import hr.fer.rasip.remes.simulator.core.datatypes.Type.TYPE_CODE;

/**
 * @author Marin Orlic <marin.orlic@fer.hr>
 *
 */
public class DataTypeFactory {
	private static Type getDefaultValueForType(TYPE_CODE type) {
		switch(type) {
			// Default for BOOLEAN is set to false to mimic C
			case BOOLEAN:
				return (Type) new BooleanType(false);
			case INTEGER:
				return (Type) new IntegerType(0);
			case NATURAL:
				return (Type) new NaturalType(0);
			case CLOCK:
				return (Type) new ClockType(0);
			case RESOURCE:
				return (Type) new ResourceType(0);
			case FLOAT:
				return (Type) new FloatType(0f);
			default:
				return null;
		}
	}
/*	
	private static Type getDefaultValueForType(Class<?> clazz) {
		if(clazz == IntegerType.class)
			return (Type) new IntegerType(0);
		else if(clazz == NaturalType.class)
			return (Type) new NaturalType(0);
		else if(clazz == ClockType.class)
			return (Type) new ClockType(0);
		else if(clazz == ResourceType.class)
			return (Type) new ResourceType(0);
		else if(clazz == FloatType.class)
			return (Type) new FloatType(0f);
			return null;
	}
*/	
	public static Type create(TYPE_CODE kind) {
		return getDefaultValueForType(kind);
	}
}
