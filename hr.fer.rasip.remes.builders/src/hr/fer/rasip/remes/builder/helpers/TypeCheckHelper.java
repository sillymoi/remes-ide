/**
 * 
 */
package hr.fer.rasip.remes.builder.helpers;

import hr.fer.rasip.remes.grammars.expressions.ast.AbstractRoot;
import hr.fer.rasip.remes.grammars.expressions.ast.ActionRoot;
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

import java.util.ArrayList;

import se.mdh.progresside.remes.Referable;
import se.mdh.progresside.remes.Resource;
import se.mdh.progresside.remes.Variable;

/**
 * @author Marin
 *
 */
public class TypeCheckHelper implements AstVisitor {

	// Stores all type errors found
	ArrayList<InvalidTypeErrorMark> errors = new ArrayList<InvalidTypeErrorMark>();
	
	/**
	 * @return the errors
	 */
	public ArrayList<InvalidTypeErrorMark> getErrors() {
		return errors;
	}

	public void checkType(AbstractRoot tree) {
		// Clear all errors
		errors.clear();
		
		// Check to see which class of expression we're dealing with
		if(tree instanceof LogicalRoot) {
			inferTypes(((LogicalRoot) tree).getExpression(), ResolvedType.BOOLEAN);
			tree.setType(((LogicalRoot) tree).getExpression().getType());
		}
		else if(tree instanceof ActionRoot) {
			ActionRoot action = (ActionRoot) tree;
			ResolvedType type = ResolvedType.UNKNOWN;
			for(Expression expr : action.getExpressions()) {
				inferTypes(expr, ResolvedType.RESOURCE);
				type = expr.getType();
			}
			action.setType(type);
		}
		else if(tree instanceof ResourceRoot) {
			inferTypes(((ResourceRoot) tree).getExpression(), ResolvedType.INTEGER);
			tree.setType(((ResourceRoot) tree).getExpression().getType());
		}
	}
	
	// Just forward to visitor
	private void inferTypes(Expression expr, ResolvedType expectingType) {
		expr.visit(this);
	}

	/* (non-Javadoc)
	 * @see hr.fer.rasip.remes.grammars.expressions.ast.AstVisitor#visitTernaryExpression(hr.fer.rasip.remes.grammars.expressions.ast.TernaryExpression)
	 */
	@Override
	public void visitTernaryExpression(TernaryExpression node) {
		// Go down the tree
		node.getParam1().visit(this);
		node.getParam2().visit(this);
		node.getParam3().visit(this);
		
		if(node.getParam1().getType() != ResolvedType.BOOLEAN) {
			errors.add(new InvalidTypeErrorMark("Expecting boolean expression as condition", node)); //$NON-NLS-1$
			return;	
		}
		
		ResolvedType caseThen = node.getParam2().getType();
		ResolvedType caseElse = node.getParam3().getType();
		ResolvedType resultType = inferType(node.getOperation(), caseThen, caseElse); 
		
		if(resultType != null)
			node.setType(resultType);
		else
			errors.add(new InvalidTypeErrorMark("Unable to infer type", node)); //$NON-NLS-1$
		
		return;
	}

	/* (non-Javadoc)
	 * @see hr.fer.rasip.remes.grammars.expressions.ast.AstVisitor#visitBinaryExpression(hr.fer.rasip.remes.grammars.expressions.ast.BinaryExpression)
	 */
	@Override
	public void visitBinaryExpression(BinaryExpression node) {
		// Go down the tree
		node.getParam1().visit(this);
		node.getParam2().visit(this);
		
		ResolvedType left = node.getParam1().getType();
		ResolvedType right = node.getParam2().getType();
		ResolvedType resultType = inferType(node.getOperation(), left, right); 
		
		if(resultType != null)
			node.setType(resultType);
		else
			errors.add(new InvalidTypeErrorMark("Unable to infer type", node)); //$NON-NLS-1$
		
		return;
	}

	/* (non-Javadoc)
	 * @see hr.fer.rasip.remes.grammars.expressions.ast.AstVisitor#visitUnaryExpression(hr.fer.rasip.remes.grammars.expressions.ast.UnaryExpression)
	 */
	@Override
	public void visitUnaryExpression(UnaryExpression node) {
		// Go down the tree
		node.getParam1().visit(this);
		
		ResolvedType left = node.getParam1().getType();
		ResolvedType resultType = inferType(node.getOperation(), left); 
		
		if(resultType != null)
			node.setType(resultType);
		else
			errors.add(new InvalidTypeErrorMark("Unable to infer type", node)); //$NON-NLS-1$
		
		return;
	}

	/* (non-Javadoc)
	 * @see hr.fer.rasip.remes.grammars.expressions.ast.AstVisitor#visitVariableReference(hr.fer.rasip.remes.grammars.expressions.ast.VariableReference)
	 */
	@Override
	public void visitVariableReference(VariableReference node) {
		// Go down the tree
		if(node.getArrayIndex() != null) {
			node.getArrayIndex().visit(this);
		}

		// Resolve the type of constant/variable/resource
		if(node.getResolved() != null) {
			Referable ref = (Referable) node.getResolved();
			ResolvedType resultType = null;
			
			if(ref instanceof Variable)
				resultType = TypeTable.getType(((Variable) ref).getType().getValue());
			else if(ref instanceof se.mdh.progresside.remes.Constant)
				resultType = TypeTable.getType(((se.mdh.progresside.remes.Constant) ref).getType().getValue());
			else if(ref instanceof Resource)
				resultType = ResolvedType.RESOURCE;
			
			if(resultType != null)
				node.setType(resultType);
			else
				errors.add(new InvalidTypeErrorMark("Unable to infer type", node)); //$NON-NLS-1$
		}
	}

	/* (non-Javadoc)
	 * @see hr.fer.rasip.remes.grammars.expressions.ast.AstVisitor#visitLiteral(hr.fer.rasip.remes.grammars.expressions.ast.Literal)
	 */
	@Override
	public void visitLiteral(Literal node) {
		// Literals are only 'true' and 'false'
		node.setType(ResolvedType.BOOLEAN);
		return;
	}

	/* (non-Javadoc)
	 * @see hr.fer.rasip.remes.grammars.expressions.ast.AstVisitor#visitConstant(hr.fer.rasip.remes.grammars.expressions.ast.Constant)
	 */
	@Override
	public void visitConstant(Constant node) {
		node.setType(ResolvedType.INTEGER); //TODO: float not supported yet
		return;
	}

	private ResolvedType inferType(TernaryOperation operation, ResolvedType caseThen, ResolvedType caseElse) {
		if(operation == TernaryOperation.QUESTION) 
			return inferAssignArithmeticOpType(caseThen, caseElse); // try with same semantics as arithmetics
		
		return null;
	}

	private ResolvedType inferType(BinaryOperation operation, ResolvedType left, ResolvedType right) {
		switch (operation) {
		// Logics
		case AND:
		case OR:
			return inferLogicalOpType(left, right);
			
		// Comparisons
		case LT:
		case LE:
		case EQ:
		case GT:
			return inferCompareOpType(left, right);

		// Equalities
		case NE:
		case GE:
			return inferEqualityOpType(left, right);
			
		// Arithmetics
		case ADD:
		case SUB:
		case MUL:
		case DIV:
		case MOD:
			return inferArithmeticOpType(left, right);
			
		// Assignments
		case ASSIGN:
			return inferAssignOpType(left, right);
			
		case ASSIGN_ADD:
		case ASSIGN_SUB:
		case ASSIGN_MUL:
		case ASSIGN_DIV:
		case ASSIGN_MOD:
			return inferAssignArithmeticOpType(left, right);
			
		// Derivation
		case DIFF:
			return inferDiffOpType(left, right);
		}
		return null;
	}

	private ResolvedType inferType(UnaryOperation operation, ResolvedType left) {
		switch (operation) {
		// Logics
		case MINUS:
		case PLUS:
			return left;
			
		case NOT:
			return ResolvedType.BOOLEAN;
		}
		return null;
	}

	private ResolvedType inferLogicalOpType(ResolvedType left, ResolvedType right) {
		if(left == right && left == ResolvedType.BOOLEAN)
			return ResolvedType.BOOLEAN;
		else
			return null; //TODO: invalid type
	}

	private ResolvedType inferEqualityOpType(ResolvedType left, ResolvedType right) {
		return TypeTable.getEqualityResultType(left, right);
	}

	private ResolvedType inferCompareOpType(ResolvedType left, ResolvedType right) {
		return TypeTable.getComparisonResultType(left, right);
	}
	
	private ResolvedType inferArithmeticOpType(ResolvedType left, ResolvedType right) {
		return TypeTable.getArithmeticResultType(left, right);
	}
	
	private ResolvedType inferAssignOpType(ResolvedType left, ResolvedType right) {
		return TypeTable.getAssignmentResultType(left, right);
	}

	private ResolvedType inferAssignArithmeticOpType(ResolvedType left, ResolvedType right) {
		return TypeTable.getAssignmentArithmeticResultType(left, right);
	}

	private ResolvedType inferDiffOpType(ResolvedType left, ResolvedType right) {
		//throw new UnsupportedOperationException(); //TODO:implement
		return null;
	}

}
