/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package hr.fer.rasip.remes.grammars.expressions.ast.impl;

import hr.fer.rasip.remes.grammars.expressions.ast.AstPackage;
import hr.fer.rasip.remes.grammars.expressions.ast.Expression;
import hr.fer.rasip.remes.grammars.expressions.ast.VariableReference;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Variable Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hr.fer.rasip.remes.grammars.expressions.ast.impl.VariableReferenceImpl#getName <em>Name</em>}</li>
 *   <li>{@link hr.fer.rasip.remes.grammars.expressions.ast.impl.VariableReferenceImpl#getArrayIndex <em>Array Index</em>}</li>
 *   <li>{@link hr.fer.rasip.remes.grammars.expressions.ast.impl.VariableReferenceImpl#getResolved <em>Resolved</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VariableReferenceImpl extends ExpressionImpl implements VariableReference {
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
	 * The cached value of the '{@link #getArrayIndex() <em>Array Index</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArrayIndex()
	 * @generated
	 * @ordered
	 */
	protected Expression arrayIndex;

	/**
	 * The cached value of the '{@link #getResolved() <em>Resolved</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResolved()
	 * @generated
	 * @ordered
	 */
	protected EObject resolved;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VariableReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AstPackage.Literals.VARIABLE_REFERENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AstPackage.VARIABLE_REFERENCE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getArrayIndex() {
		return arrayIndex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetArrayIndex(Expression newArrayIndex, NotificationChain msgs) {
		Expression oldArrayIndex = arrayIndex;
		arrayIndex = newArrayIndex;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AstPackage.VARIABLE_REFERENCE__ARRAY_INDEX, oldArrayIndex, newArrayIndex);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArrayIndex(Expression newArrayIndex) {
		if (newArrayIndex != arrayIndex) {
			NotificationChain msgs = null;
			if (arrayIndex != null)
				msgs = ((InternalEObject)arrayIndex).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AstPackage.VARIABLE_REFERENCE__ARRAY_INDEX, null, msgs);
			if (newArrayIndex != null)
				msgs = ((InternalEObject)newArrayIndex).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AstPackage.VARIABLE_REFERENCE__ARRAY_INDEX, null, msgs);
			msgs = basicSetArrayIndex(newArrayIndex, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AstPackage.VARIABLE_REFERENCE__ARRAY_INDEX, newArrayIndex, newArrayIndex));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getResolved() {
		if (resolved != null && resolved.eIsProxy()) {
			InternalEObject oldResolved = (InternalEObject)resolved;
			resolved = eResolveProxy(oldResolved);
			if (resolved != oldResolved) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AstPackage.VARIABLE_REFERENCE__RESOLVED, oldResolved, resolved));
			}
		}
		return resolved;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject basicGetResolved() {
		return resolved;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResolved(EObject newResolved) {
		EObject oldResolved = resolved;
		resolved = newResolved;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AstPackage.VARIABLE_REFERENCE__RESOLVED, oldResolved, resolved));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AstPackage.VARIABLE_REFERENCE__ARRAY_INDEX:
				return basicSetArrayIndex(null, msgs);
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
			case AstPackage.VARIABLE_REFERENCE__NAME:
				return getName();
			case AstPackage.VARIABLE_REFERENCE__ARRAY_INDEX:
				return getArrayIndex();
			case AstPackage.VARIABLE_REFERENCE__RESOLVED:
				if (resolve) return getResolved();
				return basicGetResolved();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AstPackage.VARIABLE_REFERENCE__NAME:
				setName((String)newValue);
				return;
			case AstPackage.VARIABLE_REFERENCE__ARRAY_INDEX:
				setArrayIndex((Expression)newValue);
				return;
			case AstPackage.VARIABLE_REFERENCE__RESOLVED:
				setResolved((EObject)newValue);
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
			case AstPackage.VARIABLE_REFERENCE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case AstPackage.VARIABLE_REFERENCE__ARRAY_INDEX:
				setArrayIndex((Expression)null);
				return;
			case AstPackage.VARIABLE_REFERENCE__RESOLVED:
				setResolved((EObject)null);
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
			case AstPackage.VARIABLE_REFERENCE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case AstPackage.VARIABLE_REFERENCE__ARRAY_INDEX:
				return arrayIndex != null;
			case AstPackage.VARIABLE_REFERENCE__RESOLVED:
				return resolved != null;
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //VariableReferenceImpl
