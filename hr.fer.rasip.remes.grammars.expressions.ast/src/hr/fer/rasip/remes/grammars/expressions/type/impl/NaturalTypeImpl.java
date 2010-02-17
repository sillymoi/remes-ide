/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package hr.fer.rasip.remes.grammars.expressions.type.impl;

import hr.fer.rasip.remes.grammars.expressions.type.NaturalType;
import hr.fer.rasip.remes.grammars.expressions.type.TypePackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Natural Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class NaturalTypeImpl extends BaseTypeImpl implements NaturalType {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NaturalTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypePackage.Literals.NATURAL_TYPE;
	}

	/* (non-Javadoc)
	 * @see hr.fer.rasip.remes.grammars.expressions.type.impl.BaseTypeImpl#getPrimitiveTypeIndex()
	 */
	@Override
	public int getPrimitiveTypeIndex() {
		return 2; // PrimitiveTypes.NATURAL.getValue();	
	}
	
} //NaturalTypeImpl
