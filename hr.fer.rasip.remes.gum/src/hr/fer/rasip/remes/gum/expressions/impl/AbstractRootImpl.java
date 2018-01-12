/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package hr.fer.rasip.remes.gum.expressions.impl;

import hr.fer.rasip.remes.gum.expressions.AbstractRoot;
import hr.fer.rasip.remes.gum.expressions.ExpressionsPackage;
import hr.fer.rasip.remes.gum.expressions.VariableReference;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hr.fer.rasip.remes.gum.expressions.impl.AbstractRootImpl#getReferencedVariables <em>Referenced Variables</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class AbstractRootImpl extends EObjectImpl implements AbstractRoot {
	/**
	 * The cached value of the '{@link #getReferencedVariables() <em>Referenced Variables</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencedVariables()
	 * @generated
	 * @ordered
	 */
	protected EList<VariableReference> referencedVariables;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractRootImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExpressionsPackage.Literals.ABSTRACT_ROOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VariableReference> getReferencedVariables() {
		if (referencedVariables == null) {
			referencedVariables = new EObjectResolvingEList<VariableReference>(VariableReference.class, this, ExpressionsPackage.ABSTRACT_ROOT__REFERENCED_VARIABLES);
		}
		return referencedVariables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ExpressionsPackage.ABSTRACT_ROOT__REFERENCED_VARIABLES:
				return getReferencedVariables();
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
			case ExpressionsPackage.ABSTRACT_ROOT__REFERENCED_VARIABLES:
				getReferencedVariables().clear();
				getReferencedVariables().addAll((Collection<? extends VariableReference>)newValue);
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
			case ExpressionsPackage.ABSTRACT_ROOT__REFERENCED_VARIABLES:
				getReferencedVariables().clear();
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
			case ExpressionsPackage.ABSTRACT_ROOT__REFERENCED_VARIABLES:
				return referencedVariables != null && !referencedVariables.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AbstractRootImpl
