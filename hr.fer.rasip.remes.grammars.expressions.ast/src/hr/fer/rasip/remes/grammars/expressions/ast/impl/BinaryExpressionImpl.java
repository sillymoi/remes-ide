/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package hr.fer.rasip.remes.grammars.expressions.ast.impl;

import hr.fer.rasip.remes.grammars.expressions.ast.AstPackage;
import hr.fer.rasip.remes.grammars.expressions.ast.AstVisitor;
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
 *   <li>{@link hr.fer.rasip.remes.grammars.expressions.ast.impl.BinaryExpressionImpl#getOperation <em>Operation</em>}</li>
 *   <li>{@link hr.fer.rasip.remes.grammars.expressions.ast.impl.BinaryExpressionImpl#getParam1 <em>Param1</em>}</li>
 *   <li>{@link hr.fer.rasip.remes.grammars.expressions.ast.impl.BinaryExpressionImpl#getParam2 <em>Param2</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BinaryExpressionImpl extends ExpressionImpl implements BinaryExpression {
	/**
	 * The default value of the '{@link #getOperation() <em>Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperation()
	 * @generated
	 * @ordered
	 */
	protected static final BinaryOperation OPERATION_EDEFAULT = BinaryOperation.ADD;

	/**
	 * The cached value of the '{@link #getOperation() <em>Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperation()
	 * @generated
	 * @ordered
	 */
	protected BinaryOperation operation = OPERATION_EDEFAULT;

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
	public BinaryOperation getOperation() {
		return operation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperation(BinaryOperation newOperation) {
		BinaryOperation oldOperation = operation;
		operation = newOperation == null ? OPERATION_EDEFAULT : newOperation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AstPackage.BINARY_EXPRESSION__OPERATION, oldOperation, operation));
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
			case AstPackage.BINARY_EXPRESSION__OPERATION:
				return getOperation();
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
			case AstPackage.BINARY_EXPRESSION__OPERATION:
				setOperation((BinaryOperation)newValue);
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
			case AstPackage.BINARY_EXPRESSION__OPERATION:
				setOperation(OPERATION_EDEFAULT);
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
			case AstPackage.BINARY_EXPRESSION__OPERATION:
				return operation != OPERATION_EDEFAULT;
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
		result.append(" (operation: ");
		result.append(operation);
		result.append(')');
		return result.toString();
	}

	/**
	 * Implements visitor pattern
	 * @see hr.fer.rasip.remes.grammars.expressions.ast.impl.ExpressionImpl#visit(hr.fer.rasip.remes.grammars.expressions.ast.AstVisitor)
	 */
	@Override
	public void visit(AstVisitor visitor) {
		visitor.visitBinaryExpression(this);
	}

	
} //BinaryExpressionImpl
