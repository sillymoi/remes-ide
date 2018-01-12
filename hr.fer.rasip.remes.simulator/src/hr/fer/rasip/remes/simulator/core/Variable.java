/**
 * 
 */
package hr.fer.rasip.remes.simulator.core;

import hr.fer.rasip.remes.simulator.core.datatypes.DataTypeFactory;
import hr.fer.rasip.remes.simulator.core.datatypes.Type;

import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Observable;
import java.util.Observer;

/**
 * Creates a Variable with base type T
 * @author Marin Orlic <marin.orlic@fer.hr>
 *
 */
public class Variable<T extends Type> extends Observable implements Observer
{
	private T value = null;
	private ArrayList<T> values = null;
	private int vectorSize = 0;
	
	private boolean readable;
	private boolean writable;
	
	private String name = null;
	private Type.TYPE_CODE type = null;
	private Mode scope = null;
	
		
	public Variable(String name, Type.TYPE_CODE type, Mode scope, boolean r, boolean w, int size) {
		super();
		this.name = name;
		this.type = type;
		this.scope = scope;
		this.readable = r;
		this.writable = w;
		this.vectorSize = size;
		
		if(size != 0)
			this.values = new ArrayList<T>(size);
		
		initValues();
	}
	
	@SuppressWarnings("unchecked")
	private void initValues() {
		if(vectorSize == 0) {
			this.value = (T) DataTypeFactory.create(this.type);
			
			this.value.addObserver(this);
			setChanged();
			notifyObservers(value);
		}
		else
			for(int i=0; i<vectorSize; i++) {
				T data = (T) DataTypeFactory.create(this.type);
				this.values.add(data);
				
//				data.addObserver(this);
//				setChanged();
//				notifyObservers(data);
			}
	}

	public boolean isArray() {
		return vectorSize != 0;
	}
	
	/**
	 * Returns the size of this variable.
	 * If variable is a scalar, 0 is returned, otherwise the array.length is returned.
	 * 
	 * @return size of this variable - array.length or 0 if variable is scalar
	 */
	public int getSize() {
		return vectorSize;
	}
	
	public T value() {
		if(vectorSize == 0)
			return value;
		
//HACK		throw new UnsupportedOperationException();
		return valueAt(0);
	}
	
	public T valueAt(int index) {
		if(index >= 0 && index < vectorSize)
			return values.get(index);
		
		throw new ArrayIndexOutOfBoundsException(index);
	}
	
	public void setValue(Type val) {
		if(val.getType() != this.value().getType())
			throw new UnsupportedOperationException();
		
		if(vectorSize == 0) {
			this.value = (T) val;

			this.value.addObserver(this);
			setChanged();
			notifyObservers(val);
		}
		else
			throw new UnsupportedOperationException();
	}
	
	public void setValueAt(int index, T val) {
		if(index >= 0 && index < vectorSize) {
			values.set(index, val);
//			setChanged();
//			notifyObservers(val);
		}
		else
			throw new ArrayIndexOutOfBoundsException(index);
	}
	
	/**
	 * @return the readable
	 */
	public boolean isReadable() {
		return readable;
	}

	/**
	 * @return the writable flag
	 */
	public boolean isWritable() {
		return writable;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Returns the variable's full name (including mode name)
	 * @return the full name 
	 */
	public String getFullName() {
		if(scope != null)
			return scope.getFullName() + "." + getName();
		else
			return getName();
	}
	
	/**
	 * Returns the variable's type.
	 * @return the type
	 */
	public Type.TYPE_CODE getType() {
		return type;
	}
/*	
	@Override
	public void setValue(Object value) {
		if(value instanceof Type)
			setValue((Type) value);
		
		throw new UnsupportedOperationException();
	}
*/
	/**
	 * This variable is transferable if it's atomic (not an array) 
	 * and its underlying type is transferable.
	 * @see Type#isTransferrable()
	 */
/*	
	public boolean isTransferrable() {
		if(vectorSize == 0)
			return value().isTransferrable();
		
		return false;
	}
*/
	/**
	 * Returns the underlying type's value.
	 * @see Type#getValue()
	 * @throws UnsupportedOperationException if variable holds an array
	 */
/*	@Override
	public Object getValue() {
		if(vectorSize == 0)
			return value();
			
		throw new UnsupportedOperationException();
	}
*/
	/**
	 * Variable duplication is not allowed.
	 * @throws UnsupportedOperationException always
	 */
//	@Override
//	public Type duplicate() {
//		throw new UnsupportedOperationException();
//	}

	/**
	 * If variable is not an array, operations are forwarded to underlying type.
	 * @see Type#add(Type)
 	 * @throws UnsupportedOperationException if variable holds an array
	 */
//	@Override
//	public Type add(Type right) {
//		if(vectorSize == 0)
//			return value().add(right);
//			
//		throw new UnsupportedOperationException();
//	}

	/**
	 * If variable is not an array, operations are forwarded to underlying type.
	 * @see Type#add(Number)
	 * @throws UnsupportedOperationException if variable holds an array
	 */
//	@Override
//	public Type add(Number right) {
//		if(vectorSize == 0)
//			return value().add(right);
//			
//		throw new UnsupportedOperationException();
//	}

	/**
	 * If variable is not an array, operations are forwarded to underlying type.
	 * @see Type#and(Type)
	 * @throws UnsupportedOperationException if variable holds an array
	 */
//	@Override
//	public Type and(Type right) {
//		if(vectorSize == 0)
//			return value().and(right);
//			
//		throw new UnsupportedOperationException();
//	}

	/**
	 * If variable is not an array, operations are forwarded to underlying type.
	 * @see Type#assign(Type)
 	 * @throws UnsupportedOperationException if variable holds an array
	 */
//	@Override
//	public Type assign(Type right) {
//		if(vectorSize == 0)
//			return value().assign(right);
//			
//		throw new UnsupportedOperationException();
//	}

	/**
	 * If variable is not an array, operations are forwarded to underlying type.
	 * @see Type#assign(Number)
 	 * @throws UnsupportedOperationException if variable holds an array
	 */
//	@Override
//	public Type assign(Number right) {
//		if(vectorSize == 0)
//			return value().assign(right);
//			
//		throw new UnsupportedOperationException();
//	}

	/**
	 * If variable is not an array, operations are forwarded to underlying type.
	 * @see Type#assignAdd(Type)
 	 * @throws UnsupportedOperationException if variable holds an array
	 */
//	@Override
//	public Type assignAdd(Type right) {
//		if(vectorSize == 0)
//			return value().assignAdd(right);
//			
//		throw new UnsupportedOperationException();
//	}

	/**
	 * If variable is not an array, operations are forwarded to underlying type.
	 * @see Type#assignAdd(Number)
 	 * @throws UnsupportedOperationException if variable holds an array
	 */
//	@Override
//	public Type assignAdd(Number right) {
//		if(vectorSize == 0)
//			return value().assignAdd(right);
//			
//		throw new UnsupportedOperationException();	}

	/**
	 * If variable is not an array, operations are forwarded to underlying type.
	 * @see Type#assignDiv(Type)
 	 * @throws UnsupportedOperationException if variable holds an array
	 */
//	@Override
//	public Type assignDiv(Type right) {
//		if(vectorSize == 0)
//			return value().assignDiv(right);
//			
//		throw new UnsupportedOperationException();
//	}

	/**
	 * If variable is not an array, operations are forwarded to underlying type.
	 * @see Type#assignDiv(Number)
 	 * @throws UnsupportedOperationException if variable holds an array
	 */
//	@Override
//	public Type assignDiv(Number right) {
//		if(vectorSize == 0)
//			return value().assignDiv(right);
//			
//		throw new UnsupportedOperationException();	}

	/**
	 * If variable is not an array, operations are forwarded to underlying type.
	 * @see Type#assignMod(Type)
 	 * @throws UnsupportedOperationException if variable holds an array
	 */
//	@Override
//	public Type assignMod(Type right) {
//		if(vectorSize == 0)
//			return value().assignMod(right);
//			
//		throw new UnsupportedOperationException();
//	}

	/**
	 * If variable is not an array, operations are forwarded to underlying type.
	 * @see Type#assignMod(Number)
 	 * @throws UnsupportedOperationException if variable holds an array
	 */
//	@Override
//	public Type assignMod(Number right) {
//		if(vectorSize == 0)
//			return value().assignMod(right);
//			
//		throw new UnsupportedOperationException();
//	}

	/**
	 * If variable is not an array, operations are forwarded to underlying type.
	 * @see Type#assignMul(Type)
 	 * @throws UnsupportedOperationException if variable holds an array
	 */
//	@Override
//	public Type assignMul(Type right) {
//		if(vectorSize == 0)
//			return value().assignMul(right);
//			
//		throw new UnsupportedOperationException();
//	}

	/**
	 * If variable is not an array, operations are forwarded to underlying type.
	 * @see Type#assignMul(Number)
 	 * @throws UnsupportedOperationException if variable holds an array
	 */
//	@Override
//	public Type assignMul(Number right) {
//		if(vectorSize == 0)
//			return value().assignMul(right);
//			
//		throw new UnsupportedOperationException();
//	}

	/**
	 * If variable is not an array, operations are forwarded to underlying type.
	 * @see Type#assignSub(Type)
 	 * @throws UnsupportedOperationException if variable holds an array
	 */
//	@Override
//	public Type assignSub(Type right) {
//		if(vectorSize == 0)
//			return value().assignSub(right);
//			
//		throw new UnsupportedOperationException();
//	}

	/**
	 * If variable is not an array, operations are forwarded to underlying type.
	 * @see Type#assignSub(Number)
 	 * @throws UnsupportedOperationException if variable holds an array
	 */
//	@Override
//	public Type assignSub(Number right) {
//		if(vectorSize == 0)
//			return value().assignSub(right);
//			
//		throw new UnsupportedOperationException();
//	}

	/**
	 * If variable is not an array, operations are forwarded to underlying type.
	 * @see Type#div(Type)
 	 * @throws UnsupportedOperationException if variable holds an array
	 */
//	@Override
//	public Type div(Type right) {
//		if(vectorSize == 0)
//			return value().div(right);
//			
//		throw new UnsupportedOperationException();	}

	/**
	 * If variable is not an array, operations are forwarded to underlying type.
	 * @see Type#div(Number)
 	 * @throws UnsupportedOperationException if variable holds an array
	 */
//	@Override
//	public Type div(Number right) {
//		if(vectorSize == 0)
//			return value().div(right);
//			
//		throw new UnsupportedOperationException();
//	}

	/**
	 * If variable is not an array, operations are forwarded to underlying type.
	 * @see Type#eq(Type)
 	 * @throws UnsupportedOperationException if variable holds an array
	 */
//	@Override
//	public Type eq(Type right) {
//		if(vectorSize == 0)
//			return value().eq(right);
//			
//		throw new UnsupportedOperationException();
//	}

	/**
	 * If variable is not an array, operations are forwarded to underlying type.
	 * @see Type#eq(Number)
 	 * @throws UnsupportedOperationException if variable holds an array
	 */
//	@Override
//	public Type eq(Number right) {
//		if(vectorSize == 0)
//			return value().eq(right);
//			
//		throw new UnsupportedOperationException();
//	}

	/**
	 * If variable is not an array, operations are forwarded to underlying type.
	 * @see Type#ge(Type)
 	 * @throws UnsupportedOperationException if variable holds an array
	 */
//	@Override
//	public Type ge(Type right) {
//		if(vectorSize == 0)
//			return value().ge(right);
//			
//		throw new UnsupportedOperationException();
//	}

	/**
	 * If variable is not an array, operations are forwarded to underlying type.
	 * @see Type#ge(Number)
 	 * @throws UnsupportedOperationException if variable holds an array
	 */
//	@Override
//	public Type ge(Number right) {
//		if(vectorSize == 0)
//			return value().ge(right);
//			
//		throw new UnsupportedOperationException();
//	}

	/**
	 * If variable is not an array, operations are forwarded to underlying type.
	 * @see Type#gt(Type)
 	 * @throws UnsupportedOperationException if variable holds an array
	 */
//	@Override
//	public Type gt(Type right) {
//		if(vectorSize == 0)
//			return value().gt(right);
//			
//		throw new UnsupportedOperationException();
//	}

	/**
	 * If variable is not an array, operations are forwarded to underlying type.
	 * @see Type#gt(Number)
 	 * @throws UnsupportedOperationException if variable holds an array
	 */
//	@Override
//	public Type gt(Number right) {
//		if(vectorSize == 0)
//			return value().gt(right);
//			
//		throw new UnsupportedOperationException();
//	}
	
	/**
	 * If variable is not an array, operations are forwarded to underlying type.
	 * @see Type#le(Type)
 	 * @throws UnsupportedOperationException if variable holds an array
	 */
//	@Override
//	public Type le(Type right) {
//		if(vectorSize == 0)
//			return value().le(right);
//			
//		throw new UnsupportedOperationException();
//	}

	/**
	 * If variable is not an array, operations are forwarded to underlying type.
	 * @see Type#le(Number)
 	 * @throws UnsupportedOperationException if variable holds an array
	 */
//	@Override
//	public Type le(Number right) {
//		if(vectorSize == 0)
//			return value().le(right);
//			
//		throw new UnsupportedOperationException();
//	}

	/**
	 * If variable is not an array, operations are forwarded to underlying type.
	 * @see Type#lt(Type)
 	 * @throws UnsupportedOperationException if variable holds an array
	 */
//	@Override
//	public Type lt(Type right) {
//		if(vectorSize == 0)
//			return value().lt(right);
//			
//		throw new UnsupportedOperationException();
//	}

	/**
	 * If variable is not an array, operations are forwarded to underlying type.
	 * @see Type#lt(Number)
 	 * @throws UnsupportedOperationException if variable holds an array
	 */
//	@Override
//	public Type lt(Number right) {
//		if(vectorSize == 0)
//			return value().lt(right);
//			
//		throw new UnsupportedOperationException();
//	}

	/**
	 * If variable is not an array, operations are forwarded to underlying type.
	 * @see Type#mod(Type)
 	 * @throws UnsupportedOperationException if variable holds an array
	 */
//	@Override
//	public Type mod(Type right) {
//		if(vectorSize == 0)
//			return value().mod(right);
//			
//		throw new UnsupportedOperationException();
//	}

	/**
	 * If variable is not an array, operations are forwarded to underlying type.
	 * @see Type#mod(Number)
 	 * @throws UnsupportedOperationException if variable holds an array
	 */
//	@Override
//	public Type mod(Number right) {
//		if(vectorSize == 0)
//			return value().mod(right);
//			
//		throw new UnsupportedOperationException();
//	}

	/**
	 * If variable is not an array, operations are forwarded to underlying type.
	 * @see Type#mul(Type)
 	 * @throws UnsupportedOperationException if variable holds an array
	 */
//	@Override
//	public Type mul(Type right) {
//		if(vectorSize == 0)
//			return value().mul(right);
//			
//		throw new UnsupportedOperationException();
//	}

	/**
	 * If variable is not an array, operations are forwarded to underlying type.
	 * @see Type#mul(Number)
 	 * @throws UnsupportedOperationException if variable holds an array
	 */
//	@Override
//	public Type mul(Number right) {
//		if(vectorSize == 0)
//			return value().mul(right);
//			
//		throw new UnsupportedOperationException();
//	}

	/**
	 * If variable is not an array, operations are forwarded to underlying type.
	 * @see Type#ne(Type)
 	 * @throws UnsupportedOperationException if variable holds an array
	 */
//	@Override
//	public Type ne(Type right) {
//		if(vectorSize == 0)
//			return value().ne(right);
//			
//		throw new UnsupportedOperationException();
//	}

	/**
	 * If variable is not an array, operations are forwarded to underlying type.
	 * @see Type#ne(Number)
 	 * @throws UnsupportedOperationException if variable holds an array
	 */
//	@Override
//	public Type ne(Number right) {
//		if(vectorSize == 0)
//			return value().ne(right);
//			
//		throw new UnsupportedOperationException();
//	}

	/**
	 * If variable is not an array, operations are forwarded to underlying type.
	 * @see Type#not()
 	 * @throws UnsupportedOperationException if variable holds an array
	 */
//	@Override
//	public Type not() {
//		if(vectorSize == 0)
//			return value().not();
//			
//		throw new UnsupportedOperationException();
//	}

	/**
	 * If variable is not an array, operations are forwarded to underlying type.
	 * @see Type#or(Type)
 	 * @throws UnsupportedOperationException if variable holds an array
	 */
//	@Override
//	public Type or(Type right) {
//		if(vectorSize == 0)
//			return value().or(right);
//			
//		throw new UnsupportedOperationException();
//	}

	/**
	 * If variable is not an array, operations are forwarded to underlying type.
	 * @see Type#rsub(Type)
 	 * @throws UnsupportedOperationException if variable holds an array
	 */
//	@Override
//	public Type rsub(Type left) {
//		if(vectorSize == 0)
//			return value().rsub(left);
//			
//		throw new UnsupportedOperationException();
//	}

	/**
	 * If variable is not an array, operations are forwarded to underlying type.
	 * @see Type#rsub(Number)
 	 * @throws UnsupportedOperationException if variable holds an array
	 */
//	@Override
//	public Type rsub(Number left) {
//		if(vectorSize == 0)
//			return value().rsub(left);
//			
//		throw new UnsupportedOperationException();
//	}

	/**
	 * If variable is not an array, operations are forwarded to underlying type.
	 * @see Type#sub(Type)
 	 * @throws UnsupportedOperationException if variable holds an array
	 */
//	@Override
//	public Type sub(Type right) {
//		if(vectorSize == 0)
//			return value().sub(right);
//			
//		throw new UnsupportedOperationException();
//	}

	/**
	 * If variable is not an array, operations are forwarded to underlying type.
	 * @see Type#sub(Number)
 	 * @throws UnsupportedOperationException if variable holds an array
	 */
//	@Override
//	public Type sub(Number right) {
//		if(vectorSize == 0)
//			return value().sub(right);
//			
//		throw new UnsupportedOperationException();
//	}

	/**
	 * Get the underlying class for a type, or null if the type is a variable
	 * type.
	 * 
	 * @param type
	 *            the type
	 * @return the underlying class
	 */
	@Deprecated
	private static Class<?> getClass(java.lang.reflect.Type type) {
		if (type instanceof Class) {
			return (Class) type;
		} else if (type instanceof ParameterizedType) {
			return getClass(((ParameterizedType) type).getRawType());
		} else if (type instanceof GenericArrayType) {
			java.lang.reflect.Type componentType = ((GenericArrayType) type)
					.getGenericComponentType();
			Class<?> componentClass = getClass(componentType);
			if (componentClass != null) {
				return Array.newInstance(componentClass, 0).getClass();
			} else {
				return null;
			}
		} else {
			return null;
		}
	}

	/**
	   * Get the actual type arguments a child class has used to extend a generic base class.
	   *
	   * @param baseClass the base class
	   * @param childClass the child class
	   * @return a list of the raw classes for the actual type arguments.
	   */
	  @Deprecated
	  private static <T> List<Class<?>> getTypeArguments(
	    Class<T> baseClass, Class<? extends T> childClass) {
	    Map<java.lang.reflect.Type, java.lang.reflect.Type> resolvedTypes = new HashMap<java.lang.reflect.Type, java.lang.reflect.Type>();
	    java.lang.reflect.Type type = childClass;
	    // start walking up the inheritance hierarchy until we hit baseClass
	    while (! getClass(type).equals(baseClass)) {
	      if (type instanceof Class) {
	        // there is no useful information for us in raw types, so just keep going.
	        type = ((Class) type).getGenericSuperclass();
	      }
	      else {
	        ParameterizedType parameterizedType = (ParameterizedType) type;
	        Class<?> rawType = (Class) parameterizedType.getRawType();
	
	        java.lang.reflect.Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
	        TypeVariable<?>[] typeParameters = rawType.getTypeParameters();
	        for (int i = 0; i < actualTypeArguments.length; i++) {
	          resolvedTypes.put(typeParameters[i], actualTypeArguments[i]);
	        }
	
	        if (!rawType.equals(baseClass)) {
	          type = rawType.getGenericSuperclass();
	        }
	      }
	    }
	
	    // finally, for each actual type argument provided to baseClass, determine (if possible)
	    // the raw class for that type argument.
	    java.lang.reflect.Type[] actualTypeArguments;
	    if (type instanceof Class) {
	      actualTypeArguments = ((Class) type).getTypeParameters();
	    }
	    else {
	      actualTypeArguments = ((ParameterizedType) type).getActualTypeArguments();
	    }
	    List<Class<?>> typeArgumentsAsClasses = new ArrayList<Class<?>>();
	    // resolve types by chasing down type variables.
	    for (java.lang.reflect.Type baseType: actualTypeArguments) {
	      while (resolvedTypes.containsKey(baseType)) {
	        baseType = resolvedTypes.get(baseType);
	      }
	      typeArgumentsAsClasses.add(getClass(baseType));
	    }
	    return typeArgumentsAsClasses;
	  }

	/**
	 * Returns a string representation of this Variable.
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Variable [");
		if (name != null) {
			builder.append("name=");
			builder.append(name);
			builder.append(", ");
		}
		if (values != null) {
			builder.append("values=");
			builder.append(values);
			builder.append(", ");
		}
		if (value != null) {
			builder.append("value=");
			builder.append(value);
			builder.append(", ");
		}
		builder.append("readable=");
		builder.append(readable);
		builder.append(", writeable=");
		builder.append(writable);
		builder.append(", vectorSize=");
		builder.append(vectorSize);
		builder.append("]");
		return builder.toString();
	}

	/**
	 * Called when this variable's value changes.
	 */
	@Override
	public void update(Observable source, Object param) {
		if(source instanceof Type) {
			setChanged();
			notifyObservers(source);
		}
	}
}
