/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package hr.fer.rasip.remes.grammars.expressions.type.impl;

import hr.fer.rasip.remes.grammars.expressions.type.FloatType;
import hr.fer.rasip.remes.grammars.expressions.type.TypePackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Float Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class FloatTypeImpl extends BaseTypeImpl implements FloatType {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FloatTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypePackage.Literals.FLOAT_TYPE;
	}

	/* (non-Javadoc)
	 * @see hr.fer.rasip.remes.grammars.expressions.type.impl.BaseTypeImpl#getPrimitiveTypeIndex()
	 */
	@Override
	public int getPrimitiveTypeIndex() {
		return 4; // PrimitiveTypes.FLOAT.getValue();	
	}

} //FloatTypeImpl
