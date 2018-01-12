/**
 * <copyright>
 * </copyright>
 *

 */
package hr.fer.rasip.remes.profile.profile.impl;

import hr.fer.rasip.remes.profile.profile.Constraint;
import hr.fer.rasip.remes.profile.profile.PlatformProfile;
import hr.fer.rasip.remes.profile.profile.ProfilePackage;
import hr.fer.rasip.remes.profile.profile.Resource;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Platform Profile</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hr.fer.rasip.remes.profile.profile.impl.PlatformProfileImpl#getName <em>Name</em>}</li>
 *   <li>{@link hr.fer.rasip.remes.profile.profile.impl.PlatformProfileImpl#getResources <em>Resources</em>}</li>
 *   <li>{@link hr.fer.rasip.remes.profile.profile.impl.PlatformProfileImpl#getConstraints <em>Constraints</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PlatformProfileImpl extends MinimalEObjectImpl.Container implements PlatformProfile
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getResources() <em>Resources</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getResources()
   * @generated
   * @ordered
   */
  protected EList<Resource> resources;

  /**
   * The cached value of the '{@link #getConstraints() <em>Constraints</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConstraints()
   * @generated
   * @ordered
   */
  protected EList<Constraint> constraints;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PlatformProfileImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return ProfilePackage.Literals.PLATFORM_PROFILE;
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
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProfilePackage.PLATFORM_PROFILE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Resource> getResources()
  {
    if (resources == null)
    {
      resources = new EObjectContainmentEList<Resource>(Resource.class, this, ProfilePackage.PLATFORM_PROFILE__RESOURCES);
    }
    return resources;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Constraint> getConstraints()
  {
    if (constraints == null)
    {
      constraints = new EObjectContainmentEList<Constraint>(Constraint.class, this, ProfilePackage.PLATFORM_PROFILE__CONSTRAINTS);
    }
    return constraints;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case ProfilePackage.PLATFORM_PROFILE__RESOURCES:
        return ((InternalEList<?>)getResources()).basicRemove(otherEnd, msgs);
      case ProfilePackage.PLATFORM_PROFILE__CONSTRAINTS:
        return ((InternalEList<?>)getConstraints()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case ProfilePackage.PLATFORM_PROFILE__NAME:
        return getName();
      case ProfilePackage.PLATFORM_PROFILE__RESOURCES:
        return getResources();
      case ProfilePackage.PLATFORM_PROFILE__CONSTRAINTS:
        return getConstraints();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case ProfilePackage.PLATFORM_PROFILE__NAME:
        setName((String)newValue);
        return;
      case ProfilePackage.PLATFORM_PROFILE__RESOURCES:
        getResources().clear();
        getResources().addAll((Collection<? extends Resource>)newValue);
        return;
      case ProfilePackage.PLATFORM_PROFILE__CONSTRAINTS:
        getConstraints().clear();
        getConstraints().addAll((Collection<? extends Constraint>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case ProfilePackage.PLATFORM_PROFILE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case ProfilePackage.PLATFORM_PROFILE__RESOURCES:
        getResources().clear();
        return;
      case ProfilePackage.PLATFORM_PROFILE__CONSTRAINTS:
        getConstraints().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case ProfilePackage.PLATFORM_PROFILE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case ProfilePackage.PLATFORM_PROFILE__RESOURCES:
        return resources != null && !resources.isEmpty();
      case ProfilePackage.PLATFORM_PROFILE__CONSTRAINTS:
        return constraints != null && !constraints.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //PlatformProfileImpl
