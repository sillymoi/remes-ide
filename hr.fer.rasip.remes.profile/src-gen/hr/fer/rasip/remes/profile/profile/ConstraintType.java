/**
 * <copyright>
 * </copyright>
 *

 */
package hr.fer.rasip.remes.profile.profile;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Constraint Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see hr.fer.rasip.remes.profile.profile.ProfilePackage#getConstraintType()
 * @model
 * @generated
 */
public enum ConstraintType implements Enumerator
{
  /**
   * The '<em><b>Minimum</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #MINIMUM_VALUE
   * @generated
   * @ordered
   */
  MINIMUM(0, "Minimum", "min"),

  /**
   * The '<em><b>Maximum</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #MAXIMUM_VALUE
   * @generated
   * @ordered
   */
  MAXIMUM(1, "Maximum", "max"),

  /**
   * The '<em><b>Average</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #AVERAGE_VALUE
   * @generated
   * @ordered
   */
  AVERAGE(2, "Average", "avg");

  /**
   * The '<em><b>Minimum</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Minimum</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #MINIMUM
   * @model name="Minimum" literal="min"
   * @generated
   * @ordered
   */
  public static final int MINIMUM_VALUE = 0;

  /**
   * The '<em><b>Maximum</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Maximum</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #MAXIMUM
   * @model name="Maximum" literal="max"
   * @generated
   * @ordered
   */
  public static final int MAXIMUM_VALUE = 1;

  /**
   * The '<em><b>Average</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Average</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #AVERAGE
   * @model name="Average" literal="avg"
   * @generated
   * @ordered
   */
  public static final int AVERAGE_VALUE = 2;

  /**
   * An array of all the '<em><b>Constraint Type</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final ConstraintType[] VALUES_ARRAY =
    new ConstraintType[]
    {
      MINIMUM,
      MAXIMUM,
      AVERAGE,
    };

  /**
   * A public read-only list of all the '<em><b>Constraint Type</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<ConstraintType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Constraint Type</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static ConstraintType get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      ConstraintType result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Constraint Type</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static ConstraintType getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      ConstraintType result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Constraint Type</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static ConstraintType get(int value)
  {
    switch (value)
    {
      case MINIMUM_VALUE: return MINIMUM;
      case MAXIMUM_VALUE: return MAXIMUM;
      case AVERAGE_VALUE: return AVERAGE;
    }
    return null;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final int value;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String name;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String literal;

  /**
   * Only this class can construct instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private ConstraintType(int value, String name, String literal)
  {
    this.value = value;
    this.name = name;
    this.literal = literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLiteral()
  {
    return literal;
  }

  /**
   * Returns the literal value of the enumerator, which is its string representation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    return literal;
  }
  
} //ConstraintType
