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
 * A representation of the literals of the enumeration '<em><b>Constraint Operation</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see hr.fer.rasip.remes.profile.profile.ProfilePackage#getConstraintOperation()
 * @model
 * @generated
 */
public enum ConstraintOperation implements Enumerator
{
  /**
   * The '<em><b>Less</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #LESS_VALUE
   * @generated
   * @ordered
   */
  LESS(0, "Less", "<"),

  /**
   * The '<em><b>Less Or Equal</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #LESS_OR_EQUAL_VALUE
   * @generated
   * @ordered
   */
  LESS_OR_EQUAL(1, "LessOrEqual", "<="),

  /**
   * The '<em><b>Equal</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #EQUAL_VALUE
   * @generated
   * @ordered
   */
  EQUAL(2, "Equal", "=="),

  /**
   * The '<em><b>Greater Or Equal</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #GREATER_OR_EQUAL_VALUE
   * @generated
   * @ordered
   */
  GREATER_OR_EQUAL(3, "GreaterOrEqual", ">="),

  /**
   * The '<em><b>Greater</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #GREATER_VALUE
   * @generated
   * @ordered
   */
  GREATER(4, "Greater", ">");

  /**
   * The '<em><b>Less</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Less</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #LESS
   * @model name="Less" literal="<"
   * @generated
   * @ordered
   */
  public static final int LESS_VALUE = 0;

  /**
   * The '<em><b>Less Or Equal</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Less Or Equal</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #LESS_OR_EQUAL
   * @model name="LessOrEqual" literal="<="
   * @generated
   * @ordered
   */
  public static final int LESS_OR_EQUAL_VALUE = 1;

  /**
   * The '<em><b>Equal</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Equal</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #EQUAL
   * @model name="Equal" literal="=="
   * @generated
   * @ordered
   */
  public static final int EQUAL_VALUE = 2;

  /**
   * The '<em><b>Greater Or Equal</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Greater Or Equal</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #GREATER_OR_EQUAL
   * @model name="GreaterOrEqual" literal=">="
   * @generated
   * @ordered
   */
  public static final int GREATER_OR_EQUAL_VALUE = 3;

  /**
   * The '<em><b>Greater</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Greater</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #GREATER
   * @model name="Greater" literal=">"
   * @generated
   * @ordered
   */
  public static final int GREATER_VALUE = 4;

  /**
   * An array of all the '<em><b>Constraint Operation</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final ConstraintOperation[] VALUES_ARRAY =
    new ConstraintOperation[]
    {
      LESS,
      LESS_OR_EQUAL,
      EQUAL,
      GREATER_OR_EQUAL,
      GREATER,
    };

  /**
   * A public read-only list of all the '<em><b>Constraint Operation</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<ConstraintOperation> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Constraint Operation</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static ConstraintOperation get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      ConstraintOperation result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Constraint Operation</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static ConstraintOperation getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      ConstraintOperation result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Constraint Operation</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static ConstraintOperation get(int value)
  {
    switch (value)
    {
      case LESS_VALUE: return LESS;
      case LESS_OR_EQUAL_VALUE: return LESS_OR_EQUAL;
      case EQUAL_VALUE: return EQUAL;
      case GREATER_OR_EQUAL_VALUE: return GREATER_OR_EQUAL;
      case GREATER_VALUE: return GREATER;
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
  private ConstraintOperation(int value, String name, String literal)
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
  
} //ConstraintOperation
