/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package hr.fer.rasip.remes.grammars.expressions.ast.impl;

import hr.fer.rasip.remes.grammars.expressions.ast.AstPackage;
import hr.fer.rasip.remes.grammars.expressions.ast.Expression;
import hr.fer.rasip.remes.grammars.expressions.ast.TernaryExpression;
import hr.fer.rasip.remes.grammars.expressions.ast.TernaryOperation;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ternary Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hr.fer.rasip.remes.grammars.expressions.ast.impl.TernaryExpressionImpl#getType <em>Type</em>}</li>
 *   <li>{@link hr.fer.rasip.remes.grammars.expressions.ast.impl.TernaryExpressionImpl#getParam1 <em>Param1</em>}</li>
 *   <li>{@link hr.fer.rasip.remes.grammars.expressions.ast.impl.TernaryExpressionImpl#getParam2 <em>Param2</em>}</li>
 *   <li>{@link hr.fer.rasip.remes.grammars.expressions.ast.impl.TernaryExpressionImpl#getParam3 <em>Param3</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TernaryExpressionImpl extends ExpressionImpl implements TernaryExpression {
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final TernaryOperation TYPE_EDEFAULT = TernaryOperation.QUESTION;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected TernaryOperation type = TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getParam1() <em>Param1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParam1()
	 * @generated
	 * @ordered
	 */
	protected Expression param1;

	/**
	 * The cached value of the '{@link #getParam2() <em>Param2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParam2()
	 * @generated
	 * @ordered
	 */
	protected Expression param2;

	/**
	 * The cached value of the '{@link #getParam3() <em>Param3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParam3()
	 * @generated
	 * @ordered
	 */
	protected Expression param3;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TernaryExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AstPackage.Literals.TERNARY_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TernaryOperation getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(TernaryOperation newType) {
		TernaryOperation oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AstPackage.TERNARY_EXPRESSION__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getParam1() {
		return param1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParam1(Expression newParam1, NotificationChain msgs) {
		Expression oldParam1 = param1;
		param1 = newParam1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AstPackage.TERNARY_EXPRESSION__PARAM1, oldParam1, newParam1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParam1(Expression newParam1) {
		if (newParam1 != param1) {
			NotificationChain msgs = null;
			if (param1 != null)
				msgs = ((InternalEObject)param1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AstPackage.TERNARY_EXPRESSION__PARAM1, null, msgs);
			if (newParam1 != null)
				msgs = ((InternalEObject)newParam1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AstPackage.TERNARY_EXPRESSION__PARAM1, null, msgs);
			msgs = basicSetParam1(newParam1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AstPackage.TERNARY_EXPRESSION__PARAM1, newParam1, newParam1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getParam2() {
		return param2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParam2(Expression newParam2, NotificationChain msgs) {
		Expression oldParam2 = param2;
		param2 = newParam2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AstPackage.TERNARY_EXPRESSION__PARAM2, oldParam2, newParam2);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParam2(Expression newParam2) {
		if (newParam2 != param2) {
			NotificationChain msgs = null;
			if (param2 != null)
				msgs = ((InternalEObject)param2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AstPackage.TERNARY_EXPRESSION__PARAM2, null, msgs);
			if (newParam2 != null)
				msgs = ((InternalEObject)newParam2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AstPackage.TERNARY_EXPRESSION__PARAM2, null, msgs);
			msgs = basicSetParam2(newParam2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AstPackage.TERNARY_EXPRESSION__PARAM2, newParam2, newParam2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getParam3() {
		return param3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParam3(Expression newParam3, NotificationChain msgs) {
		Expression oldParam3 = param3;
		param3 = newParam3;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AstPackage.TERNARY_EXPRESSION__PARAM3, oldParam3, newParam3);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParam3(Expression newParam3) {
		if (newParam3 != param3) {
			NotificationChain msgs = null;
			if (param3 != null)
				msgs = ((InternalEObject)param3).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AstPackage.TERNARY_EXPRESSION__PARAM3, null, msgs);
			if (newParam3 != null)
				msgs = ((InternalEObject)newParam3).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AstPackage.TERNARY_EXPRESSION__PARAM3, null, msgs);
			msgs = basicSetParam3(newParam3, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AstPackage.TERNARY_EXPRESSION__PARAM3, newParam3, newParam3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AstPackage.TERNARY_EXPRESSION__PARAM1:
				return basicSetParam1(null, msgs);
			case AstPackage.TERNARY_EXPRESSION__PARAM2:
				return basicSetParam2(null, msgs);
			case AstPackage.TERNARY_EXPRESSION__PARAM3:
				return basicSetParam3(null, msgs);
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
			case AstPackage.TERNARY_EXPRESSION__TYPE:
				return getType();
			case AstPackage.TERNARY_EXPRESSION__PARAM1:
				return getParam1();
			case AstPackage.TERNARY_EXPRESSION__PARAM2:
				return getParam2();
			case AstPackage.TERNARY_EXPRESSION__PARAM3:
				return getParam3();
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
			case AstPackage.TERNARY_EXPRESSION__TYPE:
				setType((TernaryOperation)newValue);
				return;
			case AstPackage.TERNARY_EXPRESSION__PARAM1:
				setParam1((Expression)newValue);
				return;
			case AstPackage.TERNARY_EXPRESSION__PARAM2:
				setParam2((Expression)newValue);
				return;
			case AstPackage.TERNARY_EXPRESSION__PARAM3:
				setParam3((Expression)newValue);
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
			case AstPackage.TERNARY_EXPRESSION__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case AstPackage.TERNARY_EXPRESSION__PARAM1:
				setParam1((Expression)null);
				return;
			case AstPackage.TERNARY_EXPRESSION__PARAM2:
				setParam2((Expression)null);
				return;
			case AstPackage.TERNARY_EXPRESSION__PARAM3:
				setParam3((Expression)null);
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
			case AstPackage.TERNARY_EXPRESSION__TYPE:
				return type != TYPE_EDEFAULT;
			case AstPackage.TERNARY_EXPRESSION__PARAM1:
				return param1 != null;
			case AstPackage.TERNARY_EXPRESSION__PARAM2:
				return param2 != null;
			case AstPackage.TERNARY_EXPRESSION__PARAM3:
				return param3 != null;
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
		result.append(" (type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //TernaryExpressionImpl
