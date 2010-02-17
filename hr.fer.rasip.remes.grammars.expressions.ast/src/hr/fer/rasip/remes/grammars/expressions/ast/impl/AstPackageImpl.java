/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package hr.fer.rasip.remes.grammars.expressions.ast.impl;

import hr.fer.rasip.remes.grammars.expressions.ast.AbstractRoot;
import hr.fer.rasip.remes.grammars.expressions.ast.ActionRoot;
import hr.fer.rasip.remes.grammars.expressions.ast.AstFactory;
import hr.fer.rasip.remes.grammars.expressions.ast.AstPackage;
import hr.fer.rasip.remes.grammars.expressions.ast.AstVisitor;
import hr.fer.rasip.remes.grammars.expressions.ast.BinaryExpression;
import hr.fer.rasip.remes.grammars.expressions.ast.BinaryOperation;
import hr.fer.rasip.remes.grammars.expressions.ast.Constant;
import hr.fer.rasip.remes.grammars.expressions.ast.Expression;
import hr.fer.rasip.remes.grammars.expressions.ast.Literal;
import hr.fer.rasip.remes.grammars.expressions.ast.LogicalRoot;
import hr.fer.rasip.remes.grammars.expressions.ast.ResolvedType;
import hr.fer.rasip.remes.grammars.expressions.ast.ResourceRoot;
import hr.fer.rasip.remes.grammars.expressions.ast.TernaryExpression;
import hr.fer.rasip.remes.grammars.expressions.ast.TernaryOperation;
import hr.fer.rasip.remes.grammars.expressions.ast.UnaryExpression;
import hr.fer.rasip.remes.grammars.expressions.ast.UnaryOperation;
import hr.fer.rasip.remes.grammars.expressions.ast.VariableReference;
import hr.fer.rasip.remes.grammars.expressions.type.TypePackage;
import hr.fer.rasip.remes.grammars.expressions.type.impl.TypePackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AstPackageImpl extends EPackageImpl implements AstPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unaryExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass binaryExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ternaryExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constantEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass literalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass astVisitorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionRootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass logicalRootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceRootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractRootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum binaryOperationEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum unaryOperationEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum resolvedTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum ternaryOperationEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see hr.fer.rasip.remes.grammars.expressions.ast.AstPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private AstPackageImpl() {
		super(eNS_URI, AstFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link AstPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static AstPackage init() {
		if (isInited) return (AstPackage)EPackage.Registry.INSTANCE.getEPackage(AstPackage.eNS_URI);

		// Obtain or create and register package
		AstPackageImpl theAstPackage = (AstPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof AstPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new AstPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		TypePackageImpl theTypePackage = (TypePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TypePackage.eNS_URI) instanceof TypePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TypePackage.eNS_URI) : TypePackage.eINSTANCE);

		// Create package meta-data objects
		theAstPackage.createPackageContents();
		theTypePackage.createPackageContents();

		// Initialize created meta-data
		theAstPackage.initializePackageContents();
		theTypePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theAstPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(AstPackage.eNS_URI, theAstPackage);
		return theAstPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVariableReference() {
		return variableReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVariableReference_Name() {
		return (EAttribute)variableReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVariableReference_ArrayIndex() {
		return (EReference)variableReferenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVariableReference_Resolved() {
		return (EReference)variableReferenceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnaryExpression() {
		return unaryExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnaryExpression_Operation() {
		return (EAttribute)unaryExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnaryExpression_Param1() {
		return (EReference)unaryExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpression() {
		return expressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExpression_Type() {
		return (EAttribute)expressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExpression_Text() {
		return (EAttribute)expressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBinaryExpression() {
		return binaryExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBinaryExpression_Operation() {
		return (EAttribute)binaryExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBinaryExpression_Param1() {
		return (EReference)binaryExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBinaryExpression_Param2() {
		return (EReference)binaryExpressionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTernaryExpression() {
		return ternaryExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTernaryExpression_Operation() {
		return (EAttribute)ternaryExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTernaryExpression_Param1() {
		return (EReference)ternaryExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTernaryExpression_Param2() {
		return (EReference)ternaryExpressionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTernaryExpression_Param3() {
		return (EReference)ternaryExpressionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConstant() {
		return constantEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConstant_Value() {
		return (EAttribute)constantEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLiteral() {
		return literalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiteral_Value() {
		return (EAttribute)literalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAstVisitor() {
		return astVisitorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActionRoot() {
		return actionRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActionRoot_Expressions() {
		return (EReference)actionRootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLogicalRoot() {
		return logicalRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLogicalRoot_Expression() {
		return (EReference)logicalRootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResourceRoot() {
		return resourceRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceRoot_Expression() {
		return (EReference)resourceRootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractRoot() {
		return abstractRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractRoot_ReferencedVariables() {
		return (EReference)abstractRootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractRoot_Type() {
		return (EAttribute)abstractRootEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getBinaryOperation() {
		return binaryOperationEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getUnaryOperation() {
		return unaryOperationEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getResolvedType() {
		return resolvedTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTernaryOperation() {
		return ternaryOperationEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AstFactory getAstFactory() {
		return (AstFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		abstractRootEClass = createEClass(ABSTRACT_ROOT);
		createEReference(abstractRootEClass, ABSTRACT_ROOT__REFERENCED_VARIABLES);
		createEAttribute(abstractRootEClass, ABSTRACT_ROOT__TYPE);

		actionRootEClass = createEClass(ACTION_ROOT);
		createEReference(actionRootEClass, ACTION_ROOT__EXPRESSIONS);

		logicalRootEClass = createEClass(LOGICAL_ROOT);
		createEReference(logicalRootEClass, LOGICAL_ROOT__EXPRESSION);

		resourceRootEClass = createEClass(RESOURCE_ROOT);
		createEReference(resourceRootEClass, RESOURCE_ROOT__EXPRESSION);

		expressionEClass = createEClass(EXPRESSION);
		createEAttribute(expressionEClass, EXPRESSION__TYPE);
		createEAttribute(expressionEClass, EXPRESSION__TEXT);

		ternaryExpressionEClass = createEClass(TERNARY_EXPRESSION);
		createEAttribute(ternaryExpressionEClass, TERNARY_EXPRESSION__OPERATION);
		createEReference(ternaryExpressionEClass, TERNARY_EXPRESSION__PARAM1);
		createEReference(ternaryExpressionEClass, TERNARY_EXPRESSION__PARAM2);
		createEReference(ternaryExpressionEClass, TERNARY_EXPRESSION__PARAM3);

		binaryExpressionEClass = createEClass(BINARY_EXPRESSION);
		createEAttribute(binaryExpressionEClass, BINARY_EXPRESSION__OPERATION);
		createEReference(binaryExpressionEClass, BINARY_EXPRESSION__PARAM1);
		createEReference(binaryExpressionEClass, BINARY_EXPRESSION__PARAM2);

		unaryExpressionEClass = createEClass(UNARY_EXPRESSION);
		createEAttribute(unaryExpressionEClass, UNARY_EXPRESSION__OPERATION);
		createEReference(unaryExpressionEClass, UNARY_EXPRESSION__PARAM1);

		variableReferenceEClass = createEClass(VARIABLE_REFERENCE);
		createEAttribute(variableReferenceEClass, VARIABLE_REFERENCE__NAME);
		createEReference(variableReferenceEClass, VARIABLE_REFERENCE__ARRAY_INDEX);
		createEReference(variableReferenceEClass, VARIABLE_REFERENCE__RESOLVED);

		constantEClass = createEClass(CONSTANT);
		createEAttribute(constantEClass, CONSTANT__VALUE);

		literalEClass = createEClass(LITERAL);
		createEAttribute(literalEClass, LITERAL__VALUE);

		astVisitorEClass = createEClass(AST_VISITOR);

		// Create enums
		ternaryOperationEEnum = createEEnum(TERNARY_OPERATION);
		binaryOperationEEnum = createEEnum(BINARY_OPERATION);
		unaryOperationEEnum = createEEnum(UNARY_OPERATION);
		resolvedTypeEEnum = createEEnum(RESOLVED_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		actionRootEClass.getESuperTypes().add(this.getAbstractRoot());
		logicalRootEClass.getESuperTypes().add(this.getAbstractRoot());
		resourceRootEClass.getESuperTypes().add(this.getAbstractRoot());
		ternaryExpressionEClass.getESuperTypes().add(this.getExpression());
		binaryExpressionEClass.getESuperTypes().add(this.getExpression());
		unaryExpressionEClass.getESuperTypes().add(this.getExpression());
		variableReferenceEClass.getESuperTypes().add(this.getExpression());
		constantEClass.getESuperTypes().add(this.getExpression());
		literalEClass.getESuperTypes().add(this.getExpression());

		// Initialize classes and features; add operations and parameters
		initEClass(abstractRootEClass, AbstractRoot.class, "AbstractRoot", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAbstractRoot_ReferencedVariables(), this.getVariableReference(), null, "referencedVariables", null, 0, -1, AbstractRoot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractRoot_Type(), this.getResolvedType(), "type", "unknown", 0, 1, AbstractRoot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(actionRootEClass, ActionRoot.class, "ActionRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActionRoot_Expressions(), this.getExpression(), null, "expressions", null, 1, -1, ActionRoot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(logicalRootEClass, LogicalRoot.class, "LogicalRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLogicalRoot_Expression(), this.getExpression(), null, "expression", null, 1, 1, LogicalRoot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resourceRootEClass, ResourceRoot.class, "ResourceRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getResourceRoot_Expression(), this.getExpression(), null, "expression", null, 1, 1, ResourceRoot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(expressionEClass, Expression.class, "Expression", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExpression_Type(), this.getResolvedType(), "type", "unknown", 0, 1, Expression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExpression_Text(), ecorePackage.getEString(), "text", null, 1, 1, Expression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		EOperation op = addEOperation(expressionEClass, null, "visit", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getAstVisitor(), "visitor", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(ternaryExpressionEClass, TernaryExpression.class, "TernaryExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTernaryExpression_Operation(), this.getTernaryOperation(), "operation", null, 1, 1, TernaryExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTernaryExpression_Param1(), this.getExpression(), null, "param1", null, 1, 1, TernaryExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTernaryExpression_Param2(), this.getExpression(), null, "param2", null, 1, 1, TernaryExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTernaryExpression_Param3(), this.getExpression(), null, "param3", null, 1, 1, TernaryExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(binaryExpressionEClass, BinaryExpression.class, "BinaryExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBinaryExpression_Operation(), this.getBinaryOperation(), "operation", null, 1, 1, BinaryExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBinaryExpression_Param1(), this.getExpression(), null, "param1", null, 1, 1, BinaryExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBinaryExpression_Param2(), this.getExpression(), null, "param2", null, 1, 1, BinaryExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(unaryExpressionEClass, UnaryExpression.class, "UnaryExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUnaryExpression_Operation(), this.getUnaryOperation(), "operation", null, 1, 1, UnaryExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUnaryExpression_Param1(), this.getExpression(), null, "param1", null, 1, 1, UnaryExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(variableReferenceEClass, VariableReference.class, "VariableReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVariableReference_Name(), ecorePackage.getEString(), "name", null, 1, 1, VariableReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVariableReference_ArrayIndex(), this.getExpression(), null, "arrayIndex", null, 0, 1, VariableReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVariableReference_Resolved(), ecorePackage.getEObject(), null, "resolved", null, 1, 1, VariableReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(constantEClass, Constant.class, "Constant", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConstant_Value(), ecorePackage.getEJavaObject(), "value", null, 1, 1, Constant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(literalEClass, Literal.class, "Literal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLiteral_Value(), ecorePackage.getEJavaObject(), "value", null, 0, 1, Literal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(astVisitorEClass, AstVisitor.class, "AstVisitor", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(astVisitorEClass, null, "visitTernaryExpression", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getTernaryExpression(), "node", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(astVisitorEClass, null, "visitBinaryExpression", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getBinaryExpression(), "node", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(astVisitorEClass, null, "visitUnaryExpression", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getUnaryExpression(), "node", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(astVisitorEClass, null, "visitVariableReference", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getVariableReference(), "node", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(astVisitorEClass, null, "visitConstant", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getConstant(), "node", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(astVisitorEClass, null, "visitLiteral", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getLiteral(), "node", 0, 1, IS_UNIQUE, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(ternaryOperationEEnum, TernaryOperation.class, "TernaryOperation");
		addEEnumLiteral(ternaryOperationEEnum, TernaryOperation.QUESTION);

		initEEnum(binaryOperationEEnum, BinaryOperation.class, "BinaryOperation");
		addEEnumLiteral(binaryOperationEEnum, BinaryOperation.ADD);
		addEEnumLiteral(binaryOperationEEnum, BinaryOperation.SUB);
		addEEnumLiteral(binaryOperationEEnum, BinaryOperation.MUL);
		addEEnumLiteral(binaryOperationEEnum, BinaryOperation.DIV);
		addEEnumLiteral(binaryOperationEEnum, BinaryOperation.MOD);
		addEEnumLiteral(binaryOperationEEnum, BinaryOperation.LT);
		addEEnumLiteral(binaryOperationEEnum, BinaryOperation.LE);
		addEEnumLiteral(binaryOperationEEnum, BinaryOperation.EQ);
		addEEnumLiteral(binaryOperationEEnum, BinaryOperation.GE);
		addEEnumLiteral(binaryOperationEEnum, BinaryOperation.GT);
		addEEnumLiteral(binaryOperationEEnum, BinaryOperation.NE);
		addEEnumLiteral(binaryOperationEEnum, BinaryOperation.AND);
		addEEnumLiteral(binaryOperationEEnum, BinaryOperation.OR);
		addEEnumLiteral(binaryOperationEEnum, BinaryOperation.ASSIGN);
		addEEnumLiteral(binaryOperationEEnum, BinaryOperation.ASSIGN_ADD);
		addEEnumLiteral(binaryOperationEEnum, BinaryOperation.ASSIGN_SUB);
		addEEnumLiteral(binaryOperationEEnum, BinaryOperation.ASSIGN_MUL);
		addEEnumLiteral(binaryOperationEEnum, BinaryOperation.ASSIGN_DIV);
		addEEnumLiteral(binaryOperationEEnum, BinaryOperation.ASSIGN_MOD);
		addEEnumLiteral(binaryOperationEEnum, BinaryOperation.DIFF);

		initEEnum(unaryOperationEEnum, UnaryOperation.class, "UnaryOperation");
		addEEnumLiteral(unaryOperationEEnum, UnaryOperation.NOT);
		addEEnumLiteral(unaryOperationEEnum, UnaryOperation.PLUS);
		addEEnumLiteral(unaryOperationEEnum, UnaryOperation.MINUS);

		initEEnum(resolvedTypeEEnum, ResolvedType.class, "ResolvedType");
		addEEnumLiteral(resolvedTypeEEnum, ResolvedType.INTEGER);
		addEEnumLiteral(resolvedTypeEEnum, ResolvedType.BOOLEAN);
		addEEnumLiteral(resolvedTypeEEnum, ResolvedType.NATURAL);
		addEEnumLiteral(resolvedTypeEEnum, ResolvedType.CLOCK);
		addEEnumLiteral(resolvedTypeEEnum, ResolvedType.FLOAT);
		addEEnumLiteral(resolvedTypeEEnum, ResolvedType.RESOURCE);
		addEEnumLiteral(resolvedTypeEEnum, ResolvedType.UNKNOWN);

		// Create resource
		createResource(eNS_URI);
	}

} //AstPackageImpl
