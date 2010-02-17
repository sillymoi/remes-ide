/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package hr.fer.rasip.remes.grammars.expressions.ast;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see hr.fer.rasip.remes.grammars.expressions.ast.AstFactory
 * @model kind="package"
 * @generated
 */
public interface AstPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ast";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.rasip.fer.hr/remes/1.1.0/expressions/ast.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "expressions.ast";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AstPackage eINSTANCE = hr.fer.rasip.remes.grammars.expressions.ast.impl.AstPackageImpl.init();

	/**
	 * The meta object id for the '{@link hr.fer.rasip.remes.grammars.expressions.ast.impl.ExpressionImpl <em>Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hr.fer.rasip.remes.grammars.expressions.ast.impl.ExpressionImpl
	 * @see hr.fer.rasip.remes.grammars.expressions.ast.impl.AstPackageImpl#getExpression()
	 * @generated
	 */
	int EXPRESSION = 4;

	/**
	 * The meta object id for the '{@link hr.fer.rasip.remes.grammars.expressions.ast.impl.VariableReferenceImpl <em>Variable Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hr.fer.rasip.remes.grammars.expressions.ast.impl.VariableReferenceImpl
	 * @see hr.fer.rasip.remes.grammars.expressions.ast.impl.AstPackageImpl#getVariableReference()
	 * @generated
	 */
	int VARIABLE_REFERENCE = 8;

	/**
	 * The meta object id for the '{@link hr.fer.rasip.remes.grammars.expressions.ast.impl.UnaryExpressionImpl <em>Unary Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hr.fer.rasip.remes.grammars.expressions.ast.impl.UnaryExpressionImpl
	 * @see hr.fer.rasip.remes.grammars.expressions.ast.impl.AstPackageImpl#getUnaryExpression()
	 * @generated
	 */
	int UNARY_EXPRESSION = 7;

	/**
	 * The meta object id for the '{@link hr.fer.rasip.remes.grammars.expressions.ast.impl.BinaryExpressionImpl <em>Binary Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hr.fer.rasip.remes.grammars.expressions.ast.impl.BinaryExpressionImpl
	 * @see hr.fer.rasip.remes.grammars.expressions.ast.impl.AstPackageImpl#getBinaryExpression()
	 * @generated
	 */
	int BINARY_EXPRESSION = 6;

	/**
	 * The meta object id for the '{@link hr.fer.rasip.remes.grammars.expressions.ast.impl.TernaryExpressionImpl <em>Ternary Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hr.fer.rasip.remes.grammars.expressions.ast.impl.TernaryExpressionImpl
	 * @see hr.fer.rasip.remes.grammars.expressions.ast.impl.AstPackageImpl#getTernaryExpression()
	 * @generated
	 */
	int TERNARY_EXPRESSION = 5;

	/**
	 * The meta object id for the '{@link hr.fer.rasip.remes.grammars.expressions.ast.impl.ConstantImpl <em>Constant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hr.fer.rasip.remes.grammars.expressions.ast.impl.ConstantImpl
	 * @see hr.fer.rasip.remes.grammars.expressions.ast.impl.AstPackageImpl#getConstant()
	 * @generated
	 */
	int CONSTANT = 9;

	/**
	 * The meta object id for the '{@link hr.fer.rasip.remes.grammars.expressions.ast.impl.LiteralImpl <em>Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hr.fer.rasip.remes.grammars.expressions.ast.impl.LiteralImpl
	 * @see hr.fer.rasip.remes.grammars.expressions.ast.impl.AstPackageImpl#getLiteral()
	 * @generated
	 */
	int LITERAL = 10;

	/**
	 * The meta object id for the '{@link hr.fer.rasip.remes.grammars.expressions.ast.impl.AbstractRootImpl <em>Abstract Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hr.fer.rasip.remes.grammars.expressions.ast.impl.AbstractRootImpl
	 * @see hr.fer.rasip.remes.grammars.expressions.ast.impl.AstPackageImpl#getAbstractRoot()
	 * @generated
	 */
	int ABSTRACT_ROOT = 0;

	/**
	 * The feature id for the '<em><b>Referenced Variables</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ROOT__REFERENCED_VARIABLES = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ROOT__TYPE = 1;

	/**
	 * The number of structural features of the '<em>Abstract Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ROOT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link hr.fer.rasip.remes.grammars.expressions.ast.impl.ActionRootImpl <em>Action Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hr.fer.rasip.remes.grammars.expressions.ast.impl.ActionRootImpl
	 * @see hr.fer.rasip.remes.grammars.expressions.ast.impl.AstPackageImpl#getActionRoot()
	 * @generated
	 */
	int ACTION_ROOT = 1;

	/**
	 * The feature id for the '<em><b>Referenced Variables</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_ROOT__REFERENCED_VARIABLES = ABSTRACT_ROOT__REFERENCED_VARIABLES;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_ROOT__TYPE = ABSTRACT_ROOT__TYPE;

	/**
	 * The feature id for the '<em><b>Expressions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_ROOT__EXPRESSIONS = ABSTRACT_ROOT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Action Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_ROOT_FEATURE_COUNT = ABSTRACT_ROOT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link hr.fer.rasip.remes.grammars.expressions.ast.impl.LogicalRootImpl <em>Logical Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hr.fer.rasip.remes.grammars.expressions.ast.impl.LogicalRootImpl
	 * @see hr.fer.rasip.remes.grammars.expressions.ast.impl.AstPackageImpl#getLogicalRoot()
	 * @generated
	 */
	int LOGICAL_ROOT = 2;

	/**
	 * The feature id for the '<em><b>Referenced Variables</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_ROOT__REFERENCED_VARIABLES = ABSTRACT_ROOT__REFERENCED_VARIABLES;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_ROOT__TYPE = ABSTRACT_ROOT__TYPE;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_ROOT__EXPRESSION = ABSTRACT_ROOT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Logical Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_ROOT_FEATURE_COUNT = ABSTRACT_ROOT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link hr.fer.rasip.remes.grammars.expressions.ast.impl.ResourceRootImpl <em>Resource Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hr.fer.rasip.remes.grammars.expressions.ast.impl.ResourceRootImpl
	 * @see hr.fer.rasip.remes.grammars.expressions.ast.impl.AstPackageImpl#getResourceRoot()
	 * @generated
	 */
	int RESOURCE_ROOT = 3;

	/**
	 * The feature id for the '<em><b>Referenced Variables</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ROOT__REFERENCED_VARIABLES = ABSTRACT_ROOT__REFERENCED_VARIABLES;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ROOT__TYPE = ABSTRACT_ROOT__TYPE;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ROOT__EXPRESSION = ABSTRACT_ROOT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Resource Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ROOT_FEATURE_COUNT = ABSTRACT_ROOT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__TEXT = 1;

	/**
	 * The number of structural features of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_FEATURE_COUNT = 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERNARY_EXPRESSION__TYPE = EXPRESSION__TYPE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERNARY_EXPRESSION__TEXT = EXPRESSION__TEXT;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERNARY_EXPRESSION__OPERATION = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Param1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERNARY_EXPRESSION__PARAM1 = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Param2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERNARY_EXPRESSION__PARAM2 = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Param3</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERNARY_EXPRESSION__PARAM3 = EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Ternary Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERNARY_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_EXPRESSION__TYPE = EXPRESSION__TYPE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_EXPRESSION__TEXT = EXPRESSION__TEXT;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_EXPRESSION__OPERATION = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Param1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_EXPRESSION__PARAM1 = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Param2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_EXPRESSION__PARAM2 = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Binary Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_EXPRESSION__TYPE = EXPRESSION__TYPE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_EXPRESSION__TEXT = EXPRESSION__TEXT;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_EXPRESSION__OPERATION = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Param1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_EXPRESSION__PARAM1 = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Unary Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_REFERENCE__TYPE = EXPRESSION__TYPE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_REFERENCE__TEXT = EXPRESSION__TEXT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_REFERENCE__NAME = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Array Index</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_REFERENCE__ARRAY_INDEX = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Resolved</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_REFERENCE__RESOLVED = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Variable Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_REFERENCE_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT__TYPE = EXPRESSION__TYPE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT__TEXT = EXPRESSION__TEXT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT__VALUE = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL__TYPE = EXPRESSION__TYPE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL__TEXT = EXPRESSION__TEXT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL__VALUE = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link hr.fer.rasip.remes.grammars.expressions.ast.AstVisitor <em>Visitor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hr.fer.rasip.remes.grammars.expressions.ast.AstVisitor
	 * @see hr.fer.rasip.remes.grammars.expressions.ast.impl.AstPackageImpl#getAstVisitor()
	 * @generated
	 */
	int AST_VISITOR = 11;

	/**
	 * The number of structural features of the '<em>Visitor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AST_VISITOR_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link hr.fer.rasip.remes.grammars.expressions.ast.BinaryOperation <em>Binary Operation</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hr.fer.rasip.remes.grammars.expressions.ast.BinaryOperation
	 * @see hr.fer.rasip.remes.grammars.expressions.ast.impl.AstPackageImpl#getBinaryOperation()
	 * @generated
	 */
	int BINARY_OPERATION = 13;

	/**
	 * The meta object id for the '{@link hr.fer.rasip.remes.grammars.expressions.ast.UnaryOperation <em>Unary Operation</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hr.fer.rasip.remes.grammars.expressions.ast.UnaryOperation
	 * @see hr.fer.rasip.remes.grammars.expressions.ast.impl.AstPackageImpl#getUnaryOperation()
	 * @generated
	 */
	int UNARY_OPERATION = 14;

	/**
	 * The meta object id for the '{@link hr.fer.rasip.remes.grammars.expressions.ast.ResolvedType <em>Resolved Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hr.fer.rasip.remes.grammars.expressions.ast.ResolvedType
	 * @see hr.fer.rasip.remes.grammars.expressions.ast.impl.AstPackageImpl#getResolvedType()
	 * @generated
	 */
	int RESOLVED_TYPE = 15;

	/**
	 * The meta object id for the '{@link hr.fer.rasip.remes.grammars.expressions.ast.TernaryOperation <em>Ternary Operation</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hr.fer.rasip.remes.grammars.expressions.ast.TernaryOperation
	 * @see hr.fer.rasip.remes.grammars.expressions.ast.impl.AstPackageImpl#getTernaryOperation()
	 * @generated
	 */
	int TERNARY_OPERATION = 12;


	/**
	 * Returns the meta object for class '{@link hr.fer.rasip.remes.grammars.expressions.ast.VariableReference <em>Variable Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable Reference</em>'.
	 * @see hr.fer.rasip.remes.grammars.expressions.ast.VariableReference
	 * @generated
	 */
	EClass getVariableReference();

	/**
	 * Returns the meta object for the attribute '{@link hr.fer.rasip.remes.grammars.expressions.ast.VariableReference#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see hr.fer.rasip.remes.grammars.expressions.ast.VariableReference#getName()
	 * @see #getVariableReference()
	 * @generated
	 */
	EAttribute getVariableReference_Name();

	/**
	 * Returns the meta object for the containment reference '{@link hr.fer.rasip.remes.grammars.expressions.ast.VariableReference#getArrayIndex <em>Array Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Array Index</em>'.
	 * @see hr.fer.rasip.remes.grammars.expressions.ast.VariableReference#getArrayIndex()
	 * @see #getVariableReference()
	 * @generated
	 */
	EReference getVariableReference_ArrayIndex();

	/**
	 * Returns the meta object for the reference '{@link hr.fer.rasip.remes.grammars.expressions.ast.VariableReference#getResolved <em>Resolved</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Resolved</em>'.
	 * @see hr.fer.rasip.remes.grammars.expressions.ast.VariableReference#getResolved()
	 * @see #getVariableReference()
	 * @generated
	 */
	EReference getVariableReference_Resolved();

	/**
	 * Returns the meta object for class '{@link hr.fer.rasip.remes.grammars.expressions.ast.UnaryExpression <em>Unary Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unary Expression</em>'.
	 * @see hr.fer.rasip.remes.grammars.expressions.ast.UnaryExpression
	 * @generated
	 */
	EClass getUnaryExpression();

	/**
	 * Returns the meta object for the attribute '{@link hr.fer.rasip.remes.grammars.expressions.ast.UnaryExpression#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation</em>'.
	 * @see hr.fer.rasip.remes.grammars.expressions.ast.UnaryExpression#getOperation()
	 * @see #getUnaryExpression()
	 * @generated
	 */
	EAttribute getUnaryExpression_Operation();

	/**
	 * Returns the meta object for the containment reference '{@link hr.fer.rasip.remes.grammars.expressions.ast.UnaryExpression#getParam1 <em>Param1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Param1</em>'.
	 * @see hr.fer.rasip.remes.grammars.expressions.ast.UnaryExpression#getParam1()
	 * @see #getUnaryExpression()
	 * @generated
	 */
	EReference getUnaryExpression_Param1();

	/**
	 * Returns the meta object for class '{@link hr.fer.rasip.remes.grammars.expressions.ast.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression</em>'.
	 * @see hr.fer.rasip.remes.grammars.expressions.ast.Expression
	 * @generated
	 */
	EClass getExpression();

	/**
	 * Returns the meta object for the attribute '{@link hr.fer.rasip.remes.grammars.expressions.ast.Expression#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see hr.fer.rasip.remes.grammars.expressions.ast.Expression#getType()
	 * @see #getExpression()
	 * @generated
	 */
	EAttribute getExpression_Type();

	/**
	 * Returns the meta object for the attribute '{@link hr.fer.rasip.remes.grammars.expressions.ast.Expression#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see hr.fer.rasip.remes.grammars.expressions.ast.Expression#getText()
	 * @see #getExpression()
	 * @generated
	 */
	EAttribute getExpression_Text();

	/**
	 * Returns the meta object for class '{@link hr.fer.rasip.remes.grammars.expressions.ast.BinaryExpression <em>Binary Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binary Expression</em>'.
	 * @see hr.fer.rasip.remes.grammars.expressions.ast.BinaryExpression
	 * @generated
	 */
	EClass getBinaryExpression();

	/**
	 * Returns the meta object for the attribute '{@link hr.fer.rasip.remes.grammars.expressions.ast.BinaryExpression#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation</em>'.
	 * @see hr.fer.rasip.remes.grammars.expressions.ast.BinaryExpression#getOperation()
	 * @see #getBinaryExpression()
	 * @generated
	 */
	EAttribute getBinaryExpression_Operation();

	/**
	 * Returns the meta object for the containment reference '{@link hr.fer.rasip.remes.grammars.expressions.ast.BinaryExpression#getParam1 <em>Param1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Param1</em>'.
	 * @see hr.fer.rasip.remes.grammars.expressions.ast.BinaryExpression#getParam1()
	 * @see #getBinaryExpression()
	 * @generated
	 */
	EReference getBinaryExpression_Param1();

	/**
	 * Returns the meta object for the containment reference '{@link hr.fer.rasip.remes.grammars.expressions.ast.BinaryExpression#getParam2 <em>Param2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Param2</em>'.
	 * @see hr.fer.rasip.remes.grammars.expressions.ast.BinaryExpression#getParam2()
	 * @see #getBinaryExpression()
	 * @generated
	 */
	EReference getBinaryExpression_Param2();

	/**
	 * Returns the meta object for class '{@link hr.fer.rasip.remes.grammars.expressions.ast.TernaryExpression <em>Ternary Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ternary Expression</em>'.
	 * @see hr.fer.rasip.remes.grammars.expressions.ast.TernaryExpression
	 * @generated
	 */
	EClass getTernaryExpression();

	/**
	 * Returns the meta object for the attribute '{@link hr.fer.rasip.remes.grammars.expressions.ast.TernaryExpression#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation</em>'.
	 * @see hr.fer.rasip.remes.grammars.expressions.ast.TernaryExpression#getOperation()
	 * @see #getTernaryExpression()
	 * @generated
	 */
	EAttribute getTernaryExpression_Operation();

	/**
	 * Returns the meta object for the containment reference '{@link hr.fer.rasip.remes.grammars.expressions.ast.TernaryExpression#getParam1 <em>Param1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Param1</em>'.
	 * @see hr.fer.rasip.remes.grammars.expressions.ast.TernaryExpression#getParam1()
	 * @see #getTernaryExpression()
	 * @generated
	 */
	EReference getTernaryExpression_Param1();

	/**
	 * Returns the meta object for the containment reference '{@link hr.fer.rasip.remes.grammars.expressions.ast.TernaryExpression#getParam2 <em>Param2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Param2</em>'.
	 * @see hr.fer.rasip.remes.grammars.expressions.ast.TernaryExpression#getParam2()
	 * @see #getTernaryExpression()
	 * @generated
	 */
	EReference getTernaryExpression_Param2();

	/**
	 * Returns the meta object for the containment reference '{@link hr.fer.rasip.remes.grammars.expressions.ast.TernaryExpression#getParam3 <em>Param3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Param3</em>'.
	 * @see hr.fer.rasip.remes.grammars.expressions.ast.TernaryExpression#getParam3()
	 * @see #getTernaryExpression()
	 * @generated
	 */
	EReference getTernaryExpression_Param3();

	/**
	 * Returns the meta object for class '{@link hr.fer.rasip.remes.grammars.expressions.ast.Constant <em>Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constant</em>'.
	 * @see hr.fer.rasip.remes.grammars.expressions.ast.Constant
	 * @generated
	 */
	EClass getConstant();

	/**
	 * Returns the meta object for the attribute '{@link hr.fer.rasip.remes.grammars.expressions.ast.Constant#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see hr.fer.rasip.remes.grammars.expressions.ast.Constant#getValue()
	 * @see #getConstant()
	 * @generated
	 */
	EAttribute getConstant_Value();

	/**
	 * Returns the meta object for class '{@link hr.fer.rasip.remes.grammars.expressions.ast.Literal <em>Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Literal</em>'.
	 * @see hr.fer.rasip.remes.grammars.expressions.ast.Literal
	 * @generated
	 */
	EClass getLiteral();

	/**
	 * Returns the meta object for the attribute '{@link hr.fer.rasip.remes.grammars.expressions.ast.Literal#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see hr.fer.rasip.remes.grammars.expressions.ast.Literal#getValue()
	 * @see #getLiteral()
	 * @generated
	 */
	EAttribute getLiteral_Value();

	/**
	 * Returns the meta object for class '{@link hr.fer.rasip.remes.grammars.expressions.ast.AstVisitor <em>Visitor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Visitor</em>'.
	 * @see hr.fer.rasip.remes.grammars.expressions.ast.AstVisitor
	 * @generated
	 */
	EClass getAstVisitor();

	/**
	 * Returns the meta object for class '{@link hr.fer.rasip.remes.grammars.expressions.ast.ActionRoot <em>Action Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action Root</em>'.
	 * @see hr.fer.rasip.remes.grammars.expressions.ast.ActionRoot
	 * @generated
	 */
	EClass getActionRoot();

	/**
	 * Returns the meta object for the containment reference list '{@link hr.fer.rasip.remes.grammars.expressions.ast.ActionRoot#getExpressions <em>Expressions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Expressions</em>'.
	 * @see hr.fer.rasip.remes.grammars.expressions.ast.ActionRoot#getExpressions()
	 * @see #getActionRoot()
	 * @generated
	 */
	EReference getActionRoot_Expressions();

	/**
	 * Returns the meta object for class '{@link hr.fer.rasip.remes.grammars.expressions.ast.LogicalRoot <em>Logical Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Logical Root</em>'.
	 * @see hr.fer.rasip.remes.grammars.expressions.ast.LogicalRoot
	 * @generated
	 */
	EClass getLogicalRoot();

	/**
	 * Returns the meta object for the containment reference '{@link hr.fer.rasip.remes.grammars.expressions.ast.LogicalRoot#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see hr.fer.rasip.remes.grammars.expressions.ast.LogicalRoot#getExpression()
	 * @see #getLogicalRoot()
	 * @generated
	 */
	EReference getLogicalRoot_Expression();

	/**
	 * Returns the meta object for class '{@link hr.fer.rasip.remes.grammars.expressions.ast.ResourceRoot <em>Resource Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Root</em>'.
	 * @see hr.fer.rasip.remes.grammars.expressions.ast.ResourceRoot
	 * @generated
	 */
	EClass getResourceRoot();

	/**
	 * Returns the meta object for the containment reference '{@link hr.fer.rasip.remes.grammars.expressions.ast.ResourceRoot#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see hr.fer.rasip.remes.grammars.expressions.ast.ResourceRoot#getExpression()
	 * @see #getResourceRoot()
	 * @generated
	 */
	EReference getResourceRoot_Expression();

	/**
	 * Returns the meta object for class '{@link hr.fer.rasip.remes.grammars.expressions.ast.AbstractRoot <em>Abstract Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Root</em>'.
	 * @see hr.fer.rasip.remes.grammars.expressions.ast.AbstractRoot
	 * @generated
	 */
	EClass getAbstractRoot();

	/**
	 * Returns the meta object for the reference list '{@link hr.fer.rasip.remes.grammars.expressions.ast.AbstractRoot#getReferencedVariables <em>Referenced Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Referenced Variables</em>'.
	 * @see hr.fer.rasip.remes.grammars.expressions.ast.AbstractRoot#getReferencedVariables()
	 * @see #getAbstractRoot()
	 * @generated
	 */
	EReference getAbstractRoot_ReferencedVariables();

	/**
	 * Returns the meta object for the attribute '{@link hr.fer.rasip.remes.grammars.expressions.ast.AbstractRoot#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see hr.fer.rasip.remes.grammars.expressions.ast.AbstractRoot#getType()
	 * @see #getAbstractRoot()
	 * @generated
	 */
	EAttribute getAbstractRoot_Type();

	/**
	 * Returns the meta object for enum '{@link hr.fer.rasip.remes.grammars.expressions.ast.BinaryOperation <em>Binary Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Binary Operation</em>'.
	 * @see hr.fer.rasip.remes.grammars.expressions.ast.BinaryOperation
	 * @generated
	 */
	EEnum getBinaryOperation();

	/**
	 * Returns the meta object for enum '{@link hr.fer.rasip.remes.grammars.expressions.ast.UnaryOperation <em>Unary Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Unary Operation</em>'.
	 * @see hr.fer.rasip.remes.grammars.expressions.ast.UnaryOperation
	 * @generated
	 */
	EEnum getUnaryOperation();

	/**
	 * Returns the meta object for enum '{@link hr.fer.rasip.remes.grammars.expressions.ast.ResolvedType <em>Resolved Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Resolved Type</em>'.
	 * @see hr.fer.rasip.remes.grammars.expressions.ast.ResolvedType
	 * @generated
	 */
	EEnum getResolvedType();

	/**
	 * Returns the meta object for enum '{@link hr.fer.rasip.remes.grammars.expressions.ast.TernaryOperation <em>Ternary Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Ternary Operation</em>'.
	 * @see hr.fer.rasip.remes.grammars.expressions.ast.TernaryOperation
	 * @generated
	 */
	EEnum getTernaryOperation();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AstFactory getAstFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link hr.fer.rasip.remes.grammars.expressions.ast.impl.VariableReferenceImpl <em>Variable Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hr.fer.rasip.remes.grammars.expressions.ast.impl.VariableReferenceImpl
		 * @see hr.fer.rasip.remes.grammars.expressions.ast.impl.AstPackageImpl#getVariableReference()
		 * @generated
		 */
		EClass VARIABLE_REFERENCE = eINSTANCE.getVariableReference();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE_REFERENCE__NAME = eINSTANCE.getVariableReference_Name();

		/**
		 * The meta object literal for the '<em><b>Array Index</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE_REFERENCE__ARRAY_INDEX = eINSTANCE.getVariableReference_ArrayIndex();

		/**
		 * The meta object literal for the '<em><b>Resolved</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE_REFERENCE__RESOLVED = eINSTANCE.getVariableReference_Resolved();

		/**
		 * The meta object literal for the '{@link hr.fer.rasip.remes.grammars.expressions.ast.impl.UnaryExpressionImpl <em>Unary Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hr.fer.rasip.remes.grammars.expressions.ast.impl.UnaryExpressionImpl
		 * @see hr.fer.rasip.remes.grammars.expressions.ast.impl.AstPackageImpl#getUnaryExpression()
		 * @generated
		 */
		EClass UNARY_EXPRESSION = eINSTANCE.getUnaryExpression();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNARY_EXPRESSION__OPERATION = eINSTANCE.getUnaryExpression_Operation();

		/**
		 * The meta object literal for the '<em><b>Param1</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNARY_EXPRESSION__PARAM1 = eINSTANCE.getUnaryExpression_Param1();

		/**
		 * The meta object literal for the '{@link hr.fer.rasip.remes.grammars.expressions.ast.impl.ExpressionImpl <em>Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hr.fer.rasip.remes.grammars.expressions.ast.impl.ExpressionImpl
		 * @see hr.fer.rasip.remes.grammars.expressions.ast.impl.AstPackageImpl#getExpression()
		 * @generated
		 */
		EClass EXPRESSION = eINSTANCE.getExpression();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPRESSION__TYPE = eINSTANCE.getExpression_Type();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPRESSION__TEXT = eINSTANCE.getExpression_Text();

		/**
		 * The meta object literal for the '{@link hr.fer.rasip.remes.grammars.expressions.ast.impl.BinaryExpressionImpl <em>Binary Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hr.fer.rasip.remes.grammars.expressions.ast.impl.BinaryExpressionImpl
		 * @see hr.fer.rasip.remes.grammars.expressions.ast.impl.AstPackageImpl#getBinaryExpression()
		 * @generated
		 */
		EClass BINARY_EXPRESSION = eINSTANCE.getBinaryExpression();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BINARY_EXPRESSION__OPERATION = eINSTANCE.getBinaryExpression_Operation();

		/**
		 * The meta object literal for the '<em><b>Param1</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINARY_EXPRESSION__PARAM1 = eINSTANCE.getBinaryExpression_Param1();

		/**
		 * The meta object literal for the '<em><b>Param2</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINARY_EXPRESSION__PARAM2 = eINSTANCE.getBinaryExpression_Param2();

		/**
		 * The meta object literal for the '{@link hr.fer.rasip.remes.grammars.expressions.ast.impl.TernaryExpressionImpl <em>Ternary Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hr.fer.rasip.remes.grammars.expressions.ast.impl.TernaryExpressionImpl
		 * @see hr.fer.rasip.remes.grammars.expressions.ast.impl.AstPackageImpl#getTernaryExpression()
		 * @generated
		 */
		EClass TERNARY_EXPRESSION = eINSTANCE.getTernaryExpression();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TERNARY_EXPRESSION__OPERATION = eINSTANCE.getTernaryExpression_Operation();

		/**
		 * The meta object literal for the '<em><b>Param1</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TERNARY_EXPRESSION__PARAM1 = eINSTANCE.getTernaryExpression_Param1();

		/**
		 * The meta object literal for the '<em><b>Param2</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TERNARY_EXPRESSION__PARAM2 = eINSTANCE.getTernaryExpression_Param2();

		/**
		 * The meta object literal for the '<em><b>Param3</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TERNARY_EXPRESSION__PARAM3 = eINSTANCE.getTernaryExpression_Param3();

		/**
		 * The meta object literal for the '{@link hr.fer.rasip.remes.grammars.expressions.ast.impl.ConstantImpl <em>Constant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hr.fer.rasip.remes.grammars.expressions.ast.impl.ConstantImpl
		 * @see hr.fer.rasip.remes.grammars.expressions.ast.impl.AstPackageImpl#getConstant()
		 * @generated
		 */
		EClass CONSTANT = eINSTANCE.getConstant();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTANT__VALUE = eINSTANCE.getConstant_Value();

		/**
		 * The meta object literal for the '{@link hr.fer.rasip.remes.grammars.expressions.ast.impl.LiteralImpl <em>Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hr.fer.rasip.remes.grammars.expressions.ast.impl.LiteralImpl
		 * @see hr.fer.rasip.remes.grammars.expressions.ast.impl.AstPackageImpl#getLiteral()
		 * @generated
		 */
		EClass LITERAL = eINSTANCE.getLiteral();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LITERAL__VALUE = eINSTANCE.getLiteral_Value();

		/**
		 * The meta object literal for the '{@link hr.fer.rasip.remes.grammars.expressions.ast.AstVisitor <em>Visitor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hr.fer.rasip.remes.grammars.expressions.ast.AstVisitor
		 * @see hr.fer.rasip.remes.grammars.expressions.ast.impl.AstPackageImpl#getAstVisitor()
		 * @generated
		 */
		EClass AST_VISITOR = eINSTANCE.getAstVisitor();

		/**
		 * The meta object literal for the '{@link hr.fer.rasip.remes.grammars.expressions.ast.impl.ActionRootImpl <em>Action Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hr.fer.rasip.remes.grammars.expressions.ast.impl.ActionRootImpl
		 * @see hr.fer.rasip.remes.grammars.expressions.ast.impl.AstPackageImpl#getActionRoot()
		 * @generated
		 */
		EClass ACTION_ROOT = eINSTANCE.getActionRoot();

		/**
		 * The meta object literal for the '<em><b>Expressions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION_ROOT__EXPRESSIONS = eINSTANCE.getActionRoot_Expressions();

		/**
		 * The meta object literal for the '{@link hr.fer.rasip.remes.grammars.expressions.ast.impl.LogicalRootImpl <em>Logical Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hr.fer.rasip.remes.grammars.expressions.ast.impl.LogicalRootImpl
		 * @see hr.fer.rasip.remes.grammars.expressions.ast.impl.AstPackageImpl#getLogicalRoot()
		 * @generated
		 */
		EClass LOGICAL_ROOT = eINSTANCE.getLogicalRoot();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOGICAL_ROOT__EXPRESSION = eINSTANCE.getLogicalRoot_Expression();

		/**
		 * The meta object literal for the '{@link hr.fer.rasip.remes.grammars.expressions.ast.impl.ResourceRootImpl <em>Resource Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hr.fer.rasip.remes.grammars.expressions.ast.impl.ResourceRootImpl
		 * @see hr.fer.rasip.remes.grammars.expressions.ast.impl.AstPackageImpl#getResourceRoot()
		 * @generated
		 */
		EClass RESOURCE_ROOT = eINSTANCE.getResourceRoot();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_ROOT__EXPRESSION = eINSTANCE.getResourceRoot_Expression();

		/**
		 * The meta object literal for the '{@link hr.fer.rasip.remes.grammars.expressions.ast.impl.AbstractRootImpl <em>Abstract Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hr.fer.rasip.remes.grammars.expressions.ast.impl.AbstractRootImpl
		 * @see hr.fer.rasip.remes.grammars.expressions.ast.impl.AstPackageImpl#getAbstractRoot()
		 * @generated
		 */
		EClass ABSTRACT_ROOT = eINSTANCE.getAbstractRoot();

		/**
		 * The meta object literal for the '<em><b>Referenced Variables</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_ROOT__REFERENCED_VARIABLES = eINSTANCE.getAbstractRoot_ReferencedVariables();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_ROOT__TYPE = eINSTANCE.getAbstractRoot_Type();

		/**
		 * The meta object literal for the '{@link hr.fer.rasip.remes.grammars.expressions.ast.BinaryOperation <em>Binary Operation</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hr.fer.rasip.remes.grammars.expressions.ast.BinaryOperation
		 * @see hr.fer.rasip.remes.grammars.expressions.ast.impl.AstPackageImpl#getBinaryOperation()
		 * @generated
		 */
		EEnum BINARY_OPERATION = eINSTANCE.getBinaryOperation();

		/**
		 * The meta object literal for the '{@link hr.fer.rasip.remes.grammars.expressions.ast.UnaryOperation <em>Unary Operation</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hr.fer.rasip.remes.grammars.expressions.ast.UnaryOperation
		 * @see hr.fer.rasip.remes.grammars.expressions.ast.impl.AstPackageImpl#getUnaryOperation()
		 * @generated
		 */
		EEnum UNARY_OPERATION = eINSTANCE.getUnaryOperation();

		/**
		 * The meta object literal for the '{@link hr.fer.rasip.remes.grammars.expressions.ast.ResolvedType <em>Resolved Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hr.fer.rasip.remes.grammars.expressions.ast.ResolvedType
		 * @see hr.fer.rasip.remes.grammars.expressions.ast.impl.AstPackageImpl#getResolvedType()
		 * @generated
		 */
		EEnum RESOLVED_TYPE = eINSTANCE.getResolvedType();

		/**
		 * The meta object literal for the '{@link hr.fer.rasip.remes.grammars.expressions.ast.TernaryOperation <em>Ternary Operation</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hr.fer.rasip.remes.grammars.expressions.ast.TernaryOperation
		 * @see hr.fer.rasip.remes.grammars.expressions.ast.impl.AstPackageImpl#getTernaryOperation()
		 * @generated
		 */
		EEnum TERNARY_OPERATION = eINSTANCE.getTernaryOperation();

	}

} //AstPackage
