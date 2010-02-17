/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package hr.fer.rasip.remes.grammars.expressions.type.impl;

import hr.fer.rasip.remes.grammars.expressions.type.ClockType;
import hr.fer.rasip.remes.grammars.expressions.type.TypePackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Clock Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ClockTypeImpl extends BaseTypeImpl implements ClockType {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClockTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypePackage.Literals.CLOCK_TYPE;
	}

	/* (non-Javadoc)
	 * @see hr.fer.rasip.remes.grammars.expressions.type.impl.BaseTypeImpl#getPrimitiveTypeIndex()
	 */
	@Override
	public int getPrimitiveTypeIndex() {
		return 3; // PrimitiveTypes.CLOCK.getValue();
	}

} //ClockTypeImpl
