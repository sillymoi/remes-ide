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
 * A representation of the literals of the enumeration '<em><b>Resource Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see hr.fer.rasip.remes.profile.profile.ProfilePackage#getResourceType()
 * @model
 * @generated
 */
public enum ResourceType implements Enumerator
{
  /**
   * The '<em><b>Cpu</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #CPU_VALUE
   * @generated
   * @ordered
   */
  CPU(0, "cpu", "cpu"),

  /**
   * The '<em><b>Memory</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #MEMORY_VALUE
   * @generated
   * @ordered
   */
  MEMORY(1, "memory", "memory"),

  /**
   * The '<em><b>Bandwidth</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #BANDWIDTH_VALUE
   * @generated
   * @ordered
   */
  BANDWIDTH(2, "bandwidth", "bandwidth"),

  /**
   * The '<em><b>Power</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #POWER_VALUE
   * @generated
   * @ordered
   */
  POWER(3, "power", "power"),

  /**
   * The '<em><b>Port</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #PORT_VALUE
   * @generated
   * @ordered
   */
  PORT(4, "port", "port");

  /**
   * The '<em><b>Cpu</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Cpu</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #CPU
   * @model name="cpu"
   * @generated
   * @ordered
   */
  public static final int CPU_VALUE = 0;

  /**
   * The '<em><b>Memory</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Memory</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #MEMORY
   * @model name="memory"
   * @generated
   * @ordered
   */
  public static final int MEMORY_VALUE = 1;

  /**
   * The '<em><b>Bandwidth</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Bandwidth</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #BANDWIDTH
   * @model name="bandwidth"
   * @generated
   * @ordered
   */
  public static final int BANDWIDTH_VALUE = 2;

  /**
   * The '<em><b>Power</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Power</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #POWER
   * @model name="power"
   * @generated
   * @ordered
   */
  public static final int POWER_VALUE = 3;

  /**
   * The '<em><b>Port</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Port</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #PORT
   * @model name="port"
   * @generated
   * @ordered
   */
  public static final int PORT_VALUE = 4;

  /**
   * An array of all the '<em><b>Resource Type</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final ResourceType[] VALUES_ARRAY =
    new ResourceType[]
    {
      CPU,
      MEMORY,
      BANDWIDTH,
      POWER,
      PORT,
    };

  /**
   * A public read-only list of all the '<em><b>Resource Type</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<ResourceType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Resource Type</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static ResourceType get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      ResourceType result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Resource Type</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static ResourceType getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      ResourceType result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Resource Type</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static ResourceType get(int value)
  {
    switch (value)
    {
      case CPU_VALUE: return CPU;
      case MEMORY_VALUE: return MEMORY;
      case BANDWIDTH_VALUE: return BANDWIDTH;
      case POWER_VALUE: return POWER;
      case PORT_VALUE: return PORT;
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
  private ResourceType(int value, String name, String literal)
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
  
} //ResourceType
