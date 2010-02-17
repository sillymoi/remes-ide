/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package hr.fer.rasip.remes.grammars.expressions.type;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Base Type</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see hr.fer.rasip.remes.grammars.expressions.type.TypePackage#getBaseType()
 * @model abstract="true"
 * @generated
 */
public interface BaseType extends Type {
	public static final BooleanType BOOLEAN_TYPE = TypeFactory.eINSTANCE.createBooleanType();
	public static final NaturalType NATURAL_TYPE = TypeFactory.eINSTANCE.createNaturalType();
	public static final IntegerType INTEGER_TYPE = TypeFactory.eINSTANCE.createIntegerType();
	public static final ClockType CLOCK_TYPE = TypeFactory.eINSTANCE.createClockType();
	public static final FloatType FLOAT_TYPE = TypeFactory.eINSTANCE.createFloatType();
	public static final ResourceType RESOURCE_TYPE = TypeFactory.eINSTANCE.createResourceType();
	public static final AnyType ANY = TypeFactory.eINSTANCE.createAnyType();
	
} // BaseType
