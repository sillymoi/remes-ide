/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package se.mdh.progresside.remes.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import se.mdh.progresside.attributes.impl.AttributableImpl;

import se.mdh.progresside.remes.Mode;
import se.mdh.progresside.remes.RemesDiagram;
import se.mdh.progresside.remes.RemesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Diagram</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link se.mdh.progresside.remes.impl.RemesDiagramImpl#getModes <em>Modes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RemesDiagramImpl extends AttributableImpl implements RemesDiagram {
	/**
	 * The cached value of the '{@link #getModes() <em>Modes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModes()
	 * @generated
	 * @ordered
	 */
	protected EList<Mode> modes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RemesDiagramImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RemesPackage.Literals.REMES_DIAGRAM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Mode> getModes() {
		if (modes == null) {
			modes = new EObjectContainmentEList<Mode>(Mode.class, this, RemesPackage.REMES_DIAGRAM__MODES);
		}
		return modes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RemesPackage.REMES_DIAGRAM__MODES:
				return ((InternalEList<?>)getModes()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RemesPackage.REMES_DIAGRAM__MODES:
				return getModes();
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
			case RemesPackage.REMES_DIAGRAM__MODES:
				getModes().clear();
				getModes().addAll((Collection<? extends Mode>)newValue);
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
			case RemesPackage.REMES_DIAGRAM__MODES:
				getModes().clear();
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
			case RemesPackage.REMES_DIAGRAM__MODES:
				return modes != null && !modes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RemesDiagramImpl
