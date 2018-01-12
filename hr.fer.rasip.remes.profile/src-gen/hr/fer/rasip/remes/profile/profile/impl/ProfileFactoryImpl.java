/**
 * <copyright>
 * </copyright>
 *

 */
package hr.fer.rasip.remes.profile.profile.impl;

import hr.fer.rasip.remes.profile.profile.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ProfileFactoryImpl extends EFactoryImpl implements ProfileFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static ProfileFactory init()
  {
    try
    {
      ProfileFactory theProfileFactory = (ProfileFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.rasip.fer.hr/remes/1.2.0/profile/profile.ecore"); 
      if (theProfileFactory != null)
      {
        return theProfileFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new ProfileFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ProfileFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case ProfilePackage.PLATFORM_PROFILE: return createPlatformProfile();
      case ProfilePackage.RESOURCE: return createResource();
      case ProfilePackage.CONSTRAINT: return createConstraint();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case ProfilePackage.RESOURCE_TYPE:
        return createResourceTypeFromString(eDataType, initialValue);
      case ProfilePackage.CONSTRAINT_TYPE:
        return createConstraintTypeFromString(eDataType, initialValue);
      case ProfilePackage.CONSTRAINT_OPERATION:
        return createConstraintOperationFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case ProfilePackage.RESOURCE_TYPE:
        return convertResourceTypeToString(eDataType, instanceValue);
      case ProfilePackage.CONSTRAINT_TYPE:
        return convertConstraintTypeToString(eDataType, instanceValue);
      case ProfilePackage.CONSTRAINT_OPERATION:
        return convertConstraintOperationToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PlatformProfile createPlatformProfile()
  {
    PlatformProfileImpl platformProfile = new PlatformProfileImpl();
    return platformProfile;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Resource createResource()
  {
    ResourceImpl resource = new ResourceImpl();
    return resource;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Constraint createConstraint()
  {
    ConstraintImpl constraint = new ConstraintImpl();
    return constraint;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ResourceType createResourceTypeFromString(EDataType eDataType, String initialValue)
  {
    ResourceType result = ResourceType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertResourceTypeToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConstraintType createConstraintTypeFromString(EDataType eDataType, String initialValue)
  {
    ConstraintType result = ConstraintType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertConstraintTypeToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConstraintOperation createConstraintOperationFromString(EDataType eDataType, String initialValue)
  {
    ConstraintOperation result = ConstraintOperation.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertConstraintOperationToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ProfilePackage getProfilePackage()
  {
    return (ProfilePackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static ProfilePackage getPackage()
  {
    return ProfilePackage.eINSTANCE;
  }

} //ProfileFactoryImpl
