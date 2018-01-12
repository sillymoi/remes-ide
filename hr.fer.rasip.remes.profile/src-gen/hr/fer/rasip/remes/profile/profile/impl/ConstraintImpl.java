/**
 * <copyright>
 * </copyright>
 *

 */
package hr.fer.rasip.remes.profile.profile.impl;

import hr.fer.rasip.remes.profile.profile.Constraint;
import hr.fer.rasip.remes.profile.profile.ConstraintOperation;
import hr.fer.rasip.remes.profile.profile.ConstraintType;
import hr.fer.rasip.remes.profile.profile.ProfilePackage;
import hr.fer.rasip.remes.profile.profile.Resource;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hr.fer.rasip.remes.profile.profile.impl.ConstraintImpl#getType <em>Type</em>}</li>
 *   <li>{@link hr.fer.rasip.remes.profile.profile.impl.ConstraintImpl#getReferences <em>References</em>}</li>
 *   <li>{@link hr.fer.rasip.remes.profile.profile.impl.ConstraintImpl#isIsDerivation <em>Is Derivation</em>}</li>
 *   <li>{@link hr.fer.rasip.remes.profile.profile.impl.ConstraintImpl#getOperation <em>Operation</em>}</li>
 *   <li>{@link hr.fer.rasip.remes.profile.profile.impl.ConstraintImpl#getBound <em>Bound</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConstraintImpl extends MinimalEObjectImpl.Container implements Constraint
{
  /**
   * The default value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected static final ConstraintType TYPE_EDEFAULT = ConstraintType.MINIMUM;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected ConstraintType type = TYPE_EDEFAULT;

  /**
   * The cached value of the '{@link #getReferences() <em>References</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReferences()
   * @generated
   * @ordered
   */
  protected Resource references;

  /**
   * The default value of the '{@link #isIsDerivation() <em>Is Derivation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsDerivation()
   * @generated
   * @ordered
   */
  protected static final boolean IS_DERIVATION_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isIsDerivation() <em>Is Derivation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsDerivation()
   * @generated
   * @ordered
   */
  protected boolean isDerivation = IS_DERIVATION_EDEFAULT;

  /**
   * The default value of the '{@link #getOperation() <em>Operation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOperation()
   * @generated
   * @ordered
   */
  protected static final ConstraintOperation OPERATION_EDEFAULT = ConstraintOperation.LESS;

  /**
   * The cached value of the '{@link #getOperation() <em>Operation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOperation()
   * @generated
   * @ordered
   */
  protected ConstraintOperation operation = OPERATION_EDEFAULT;

  /**
   * The default value of the '{@link #getBound() <em>Bound</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBound()
   * @generated
   * @ordered
   */
  protected static final int BOUND_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getBound() <em>Bound</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBound()
   * @generated
   * @ordered
   */
  protected int bound = BOUND_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ConstraintImpl()
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
    return ProfilePackage.Literals.CONSTRAINT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConstraintType getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(ConstraintType newType)
  {
    ConstraintType oldType = type;
    type = newType == null ? TYPE_EDEFAULT : newType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProfilePackage.CONSTRAINT__TYPE, oldType, type));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Resource getReferences()
  {
    if (references != null && references.eIsProxy())
    {
      InternalEObject oldReferences = (InternalEObject)references;
      references = (Resource)eResolveProxy(oldReferences);
      if (references != oldReferences)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProfilePackage.CONSTRAINT__REFERENCES, oldReferences, references));
      }
    }
    return references;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Resource basicGetReferences()
  {
    return references;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setReferences(Resource newReferences)
  {
    Resource oldReferences = references;
    references = newReferences;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProfilePackage.CONSTRAINT__REFERENCES, oldReferences, references));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isIsDerivation()
  {
    return isDerivation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIsDerivation(boolean newIsDerivation)
  {
    boolean oldIsDerivation = isDerivation;
    isDerivation = newIsDerivation;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProfilePackage.CONSTRAINT__IS_DERIVATION, oldIsDerivation, isDerivation));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConstraintOperation getOperation()
  {
    return operation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOperation(ConstraintOperation newOperation)
  {
    ConstraintOperation oldOperation = operation;
    operation = newOperation == null ? OPERATION_EDEFAULT : newOperation;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProfilePackage.CONSTRAINT__OPERATION, oldOperation, operation));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getBound()
  {
    return bound;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBound(int newBound)
  {
    int oldBound = bound;
    bound = newBound;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProfilePackage.CONSTRAINT__BOUND, oldBound, bound));
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
      case ProfilePackage.CONSTRAINT__TYPE:
        return getType();
      case ProfilePackage.CONSTRAINT__REFERENCES:
        if (resolve) return getReferences();
        return basicGetReferences();
      case ProfilePackage.CONSTRAINT__IS_DERIVATION:
        return isIsDerivation();
      case ProfilePackage.CONSTRAINT__OPERATION:
        return getOperation();
      case ProfilePackage.CONSTRAINT__BOUND:
        return getBound();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case ProfilePackage.CONSTRAINT__TYPE:
        setType((ConstraintType)newValue);
        return;
      case ProfilePackage.CONSTRAINT__REFERENCES:
        setReferences((Resource)newValue);
        return;
      case ProfilePackage.CONSTRAINT__IS_DERIVATION:
        setIsDerivation((Boolean)newValue);
        return;
      case ProfilePackage.CONSTRAINT__OPERATION:
        setOperation((ConstraintOperation)newValue);
        return;
      case ProfilePackage.CONSTRAINT__BOUND:
        setBound((Integer)newValue);
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
      case ProfilePackage.CONSTRAINT__TYPE:
        setType(TYPE_EDEFAULT);
        return;
      case ProfilePackage.CONSTRAINT__REFERENCES:
        setReferences((Resource)null);
        return;
      case ProfilePackage.CONSTRAINT__IS_DERIVATION:
        setIsDerivation(IS_DERIVATION_EDEFAULT);
        return;
      case ProfilePackage.CONSTRAINT__OPERATION:
        setOperation(OPERATION_EDEFAULT);
        return;
      case ProfilePackage.CONSTRAINT__BOUND:
        setBound(BOUND_EDEFAULT);
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
      case ProfilePackage.CONSTRAINT__TYPE:
        return type != TYPE_EDEFAULT;
      case ProfilePackage.CONSTRAINT__REFERENCES:
        return references != null;
      case ProfilePackage.CONSTRAINT__IS_DERIVATION:
        return isDerivation != IS_DERIVATION_EDEFAULT;
      case ProfilePackage.CONSTRAINT__OPERATION:
        return operation != OPERATION_EDEFAULT;
      case ProfilePackage.CONSTRAINT__BOUND:
        return bound != BOUND_EDEFAULT;
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
    result.append(" (type: ");
    result.append(type);
    result.append(", isDerivation: ");
    result.append(isDerivation);
    result.append(", operation: ");
    result.append(operation);
    result.append(", bound: ");
    result.append(bound);
    result.append(')');
    return result.toString();
  }

} //ConstraintImpl
