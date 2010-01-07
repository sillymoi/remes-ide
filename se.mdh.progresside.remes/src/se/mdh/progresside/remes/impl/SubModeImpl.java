/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package se.mdh.progresside.remes.impl;

import hr.fer.rasip.remes.grammars.logical.tree.LogicalRoot;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import se.mdh.progresside.remes.CompositeMode;
import se.mdh.progresside.remes.RemesPackage;
import se.mdh.progresside.remes.Resource;
import se.mdh.progresside.remes.SubMode;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sub Mode</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link se.mdh.progresside.remes.impl.SubModeImpl#getInvariant <em>Invariant</em>}</li>
 *   <li>{@link se.mdh.progresside.remes.impl.SubModeImpl#isIsUrgent <em>Is Urgent</em>}</li>
 *   <li>{@link se.mdh.progresside.remes.impl.SubModeImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link se.mdh.progresside.remes.impl.SubModeImpl#getResources <em>Resources</em>}</li>
 *   <li>{@link se.mdh.progresside.remes.impl.SubModeImpl#getParsedInvariant <em>Parsed Invariant</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SubModeImpl extends ModeImpl implements SubMode {
	/**
	 * The default value of the '{@link #getInvariant() <em>Invariant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvariant()
	 * @generated
	 * @ordered
	 */
	protected static final String INVARIANT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInvariant() <em>Invariant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvariant()
	 * @generated
	 * @ordered
	 */
	protected String invariant = INVARIANT_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsUrgent() <em>Is Urgent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsUrgent()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_URGENT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsUrgent() <em>Is Urgent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsUrgent()
	 * @generated
	 * @ordered
	 */
	protected boolean isUrgent = IS_URGENT_EDEFAULT;

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
	 * The cached value of the '{@link #getParsedInvariant() <em>Parsed Invariant</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParsedInvariant()
	 * @generated
	 * @ordered
	 */
	protected LogicalRoot parsedInvariant;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubModeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RemesPackage.Literals.SUB_MODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInvariant() {
		return invariant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInvariant(String newInvariant) {
		String oldInvariant = invariant;
		invariant = newInvariant;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RemesPackage.SUB_MODE__INVARIANT, oldInvariant, invariant));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsUrgent() {
		return isUrgent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsUrgent(boolean newIsUrgent) {
		boolean oldIsUrgent = isUrgent;
		isUrgent = newIsUrgent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RemesPackage.SUB_MODE__IS_URGENT, oldIsUrgent, isUrgent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeMode getParent() {
		if (eContainerFeatureID() != RemesPackage.SUB_MODE__PARENT) return null;
		return (CompositeMode)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(CompositeMode newParent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParent, RemesPackage.SUB_MODE__PARENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(CompositeMode newParent) {
		if (newParent != eInternalContainer() || (eContainerFeatureID() != RemesPackage.SUB_MODE__PARENT && newParent != null)) {
			if (EcoreUtil.isAncestor(this, newParent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, RemesPackage.COMPOSITE_MODE__SUB_MODES, CompositeMode.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RemesPackage.SUB_MODE__PARENT, newParent, newParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Resource> getResources() {
		if (resources == null) {
			resources = new EObjectContainmentWithInverseEList<Resource>(Resource.class, this, RemesPackage.SUB_MODE__RESOURCES, RemesPackage.RESOURCE__SCOPE);
		}
		return resources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicalRoot getParsedInvariant() {
		return parsedInvariant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParsedInvariant(LogicalRoot newParsedInvariant, NotificationChain msgs) {
		LogicalRoot oldParsedInvariant = parsedInvariant;
		parsedInvariant = newParsedInvariant;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RemesPackage.SUB_MODE__PARSED_INVARIANT, oldParsedInvariant, newParsedInvariant);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParsedInvariant(LogicalRoot newParsedInvariant) {
		if (newParsedInvariant != parsedInvariant) {
			NotificationChain msgs = null;
			if (parsedInvariant != null)
				msgs = ((InternalEObject)parsedInvariant).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RemesPackage.SUB_MODE__PARSED_INVARIANT, null, msgs);
			if (newParsedInvariant != null)
				msgs = ((InternalEObject)newParsedInvariant).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RemesPackage.SUB_MODE__PARSED_INVARIANT, null, msgs);
			msgs = basicSetParsedInvariant(newParsedInvariant, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RemesPackage.SUB_MODE__PARSED_INVARIANT, newParsedInvariant, newParsedInvariant));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RemesPackage.SUB_MODE__PARENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParent((CompositeMode)otherEnd, msgs);
			case RemesPackage.SUB_MODE__RESOURCES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getResources()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RemesPackage.SUB_MODE__PARENT:
				return basicSetParent(null, msgs);
			case RemesPackage.SUB_MODE__RESOURCES:
				return ((InternalEList<?>)getResources()).basicRemove(otherEnd, msgs);
			case RemesPackage.SUB_MODE__PARSED_INVARIANT:
				return basicSetParsedInvariant(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case RemesPackage.SUB_MODE__PARENT:
				return eInternalContainer().eInverseRemove(this, RemesPackage.COMPOSITE_MODE__SUB_MODES, CompositeMode.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RemesPackage.SUB_MODE__INVARIANT:
				return getInvariant();
			case RemesPackage.SUB_MODE__IS_URGENT:
				return isIsUrgent();
			case RemesPackage.SUB_MODE__PARENT:
				return getParent();
			case RemesPackage.SUB_MODE__RESOURCES:
				return getResources();
			case RemesPackage.SUB_MODE__PARSED_INVARIANT:
				return getParsedInvariant();
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
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case RemesPackage.SUB_MODE__INVARIANT:
				setInvariant((String)newValue);
				return;
			case RemesPackage.SUB_MODE__IS_URGENT:
				setIsUrgent((Boolean)newValue);
				return;
			case RemesPackage.SUB_MODE__PARENT:
				setParent((CompositeMode)newValue);
				return;
			case RemesPackage.SUB_MODE__RESOURCES:
				getResources().clear();
				getResources().addAll((Collection<? extends Resource>)newValue);
				return;
			case RemesPackage.SUB_MODE__PARSED_INVARIANT:
				setParsedInvariant((LogicalRoot)newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case RemesPackage.SUB_MODE__INVARIANT:
				setInvariant(INVARIANT_EDEFAULT);
				return;
			case RemesPackage.SUB_MODE__IS_URGENT:
				setIsUrgent(IS_URGENT_EDEFAULT);
				return;
			case RemesPackage.SUB_MODE__PARENT:
				setParent((CompositeMode)null);
				return;
			case RemesPackage.SUB_MODE__RESOURCES:
				getResources().clear();
				return;
			case RemesPackage.SUB_MODE__PARSED_INVARIANT:
				setParsedInvariant((LogicalRoot)null);
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case RemesPackage.SUB_MODE__INVARIANT:
				return INVARIANT_EDEFAULT == null ? invariant != null : !INVARIANT_EDEFAULT.equals(invariant);
			case RemesPackage.SUB_MODE__IS_URGENT:
				return isUrgent != IS_URGENT_EDEFAULT;
			case RemesPackage.SUB_MODE__PARENT:
				return getParent() != null;
			case RemesPackage.SUB_MODE__RESOURCES:
				return resources != null && !resources.isEmpty();
			case RemesPackage.SUB_MODE__PARSED_INVARIANT:
				return parsedInvariant != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (invariant: ");
		result.append(invariant);
		result.append(", isUrgent: ");
		result.append(isUrgent);
		result.append(')');
		return result.toString();
	}

} //SubModeImpl
