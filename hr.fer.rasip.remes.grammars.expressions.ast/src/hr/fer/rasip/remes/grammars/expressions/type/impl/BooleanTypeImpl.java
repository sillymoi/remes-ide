/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package hr.fer.rasip.remes.grammars.expressions.type.impl;

import hr.fer.rasip.remes.grammars.expressions.type.BooleanType;
import hr.fer.rasip.remes.grammars.expressions.type.TypePackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Boolean Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class BooleanTypeImpl extends BaseTypeImpl implements BooleanType {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BooleanTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypePackage.Literals.BOOLEAN_TYPE;
	}

	/* (non-Javadoc)
	 * @see hr.fer.rasip.remes.grammars.expressions.type.impl.BaseTypeImpl#getPrimitiveTypeIndex()
	 */
	@Override
	public int getPrimitiveTypeIndex() {
		return 1; // PrimitiveTypes.BOOLEAN.getValue();
	}

} //BooleanTypeImpl
