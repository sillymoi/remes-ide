/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package hr.fer.rasip.remes.grammars.expressions.ast.impl;

import hr.fer.rasip.remes.grammars.expressions.ast.AstPackage;
import hr.fer.rasip.remes.grammars.expressions.ast.BinaryExpression;
import hr.fer.rasip.remes.grammars.expressions.ast.BinaryOperation;
import hr.fer.rasip.remes.grammars.expressions.ast.Expression;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Binary Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hr.fer.rasip.remes.grammars.expressions.ast.impl.BinaryExpressionImpl#getType <em>Type</em>}</li>
 *   <li>{@link hr.fer.rasip.remes.grammars.expressions.ast.impl.BinaryExpressionImpl#getParam1 <em>Param1</em>}</li>
 *   <li>{@link hr.fer.rasip.remes.grammars.expressions.ast.impl.BinaryExpressionImpl#getParam2 <em>Param2</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BinaryExpressionImpl extends ExpressionImpl implements BinaryExpression {
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final BinaryOperation TYPE_EDEFAULT = BinaryOperation.ADD;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected BinaryOperation type = TYPE_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BinaryExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AstPackage.Literals.BINARY_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BinaryOperation getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(BinaryOperation newType) {
		BinaryOperation oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AstPackage.BINARY_EXPRESSION__TYPE, oldType, type));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AstPackage.BINARY_EXPRESSION__PARAM1, oldParam1, newParam1);
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
				msgs = ((InternalEObject)param1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AstPackage.BINARY_EXPRESSION__PARAM1, null, msgs);
			if (newParam1 != null)
				msgs = ((InternalEObject)newParam1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AstPackage.BINARY_EXPRESSION__PARAM1, null, msgs);
			msgs = basicSetParam1(newParam1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AstPackage.BINARY_EXPRESSION__PARAM1, newParam1, newParam1));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AstPackage.BINARY_EXPRESSION__PARAM2, oldParam2, newParam2);
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
				msgs = ((InternalEObject)param2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AstPackage.BINARY_EXPRESSION__PARAM2, null, msgs);
			if (newParam2 != null)
				msgs = ((InternalEObject)newParam2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AstPackage.BINARY_EXPRESSION__PARAM2, null, msgs);
			msgs = basicSetParam2(newParam2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AstPackage.BINARY_EXPRESSION__PARAM2, newParam2, newParam2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AstPackage.BINARY_EXPRESSION__PARAM1:
				return basicSetParam1(null, msgs);
			case AstPackage.BINARY_EXPRESSION__PARAM2:
				return basicSetParam2(null, msgs);
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
			case AstPackage.BINARY_EXPRESSION__TYPE:
				return getType();
			case AstPackage.BINARY_EXPRESSION__PARAM1:
				return getParam1();
			case AstPackage.BINARY_EXPRESSION__PARAM2:
				return getParam2();
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
			case AstPackage.BINARY_EXPRESSION__TYPE:
				setType((BinaryOperation)newValue);
				return;
			case AstPackage.BINARY_EXPRESSION__PARAM1:
				setParam1((Expression)newValue);
				return;
			case AstPackage.BINARY_EXPRESSION__PARAM2:
				setParam2((Expression)newValue);
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
			case AstPackage.BINARY_EXPRESSION__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case AstPackage.BINARY_EXPRESSION__PARAM1:
				setParam1((Expression)null);
				return;
			case AstPackage.BINARY_EXPRESSION__PARAM2:
				setParam2((Expression)null);
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
			case AstPackage.BINARY_EXPRESSION__TYPE:
				return type != TYPE_EDEFAULT;
			case AstPackage.BINARY_EXPRESSION__PARAM1:
				return param1 != null;
			case AstPackage.BINARY_EXPRESSION__PARAM2:
				return param2 != null;
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

} //BinaryExpressionImpl
