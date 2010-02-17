/**
 * 
 */
package hr.fer.rasip.remes.grammars.expressions.parser;

import hr.fer.rasip.remes.grammars.expressions.ast.AbstractRoot;
import hr.fer.rasip.remes.grammars.expressions.ast.ActionRoot;
import hr.fer.rasip.remes.grammars.expressions.ast.AstFactory;
import hr.fer.rasip.remes.grammars.expressions.ast.BinaryExpression;
import hr.fer.rasip.remes.grammars.expressions.ast.BinaryOperation;
import hr.fer.rasip.remes.grammars.expressions.ast.Constant;
import hr.fer.rasip.remes.grammars.expressions.ast.Expression;
import hr.fer.rasip.remes.grammars.expressions.ast.Literal;
import hr.fer.rasip.remes.grammars.expressions.ast.LogicalRoot;
import hr.fer.rasip.remes.grammars.expressions.ast.ResourceRoot;
import hr.fer.rasip.remes.grammars.expressions.ast.TernaryExpression;
import hr.fer.rasip.remes.grammars.expressions.ast.UnaryExpression;
import hr.fer.rasip.remes.grammars.expressions.ast.UnaryOperation;
import hr.fer.rasip.remes.grammars.expressions.ast.VariableReference;

import org.antlr.runtime.tree.Tree;

/**
 * @author Marin
 * 
 */
public class TreeWalker {

	// The tree
	private Tree tree = null;

	// The factory
	private AstFactory factory = null;

	// Expression root
	private AbstractRoot root = null;
	
	/**
	 * The constructor
	 */
	public TreeWalker(Tree tree) {
		this.tree = tree;
		this.factory = AstFactory.eINSTANCE;
	}

	/**
	 * Return logical expression tree from ANTLR tree.
	 * 
	 * @see hr.fer.rasip.remes.grammars.expressions.ast.AstPackage#getExpression()
	 * @return root of parsed expression
	 */
	public LogicalRoot getLogicalExpression() {
		// Check if root is initialized
		if(root == null) {
			// Create root
			root = factory.createLogicalRoot();
			
			// In case of nil tree root, check if children exist
			if(tree.isNil())
			{
				if(tree.getChildCount() != 0)
					((LogicalRoot) root).setExpression(walker(tree.getChild(0)));
				else
					root = null;
			}
			else if(tree.getType() == RemesLogicalParser.EOF)
			{
				root = null;	
			}
			else
				((LogicalRoot) root).setExpression(walker(tree));
		}
		
		return (LogicalRoot) root;
	}
	
	/**
	 * Return expression tree from ANTLR tree.
	 * 
	 * @see hr.fer.rasip.remes.grammars.expressions.ast.AstPackage#getExpression()
	 * @return root of parsed expression
	 */
	public ActionRoot getActionExpression() {
		// Check if root is initialized
		if(root == null) {
			// Create root
			root = factory.createActionRoot();
			
			// In case of nil tree root, check if children exist
			if(tree.isNil()) {
				if(tree.getChildCount() != 0) {
					for(int i=0; i<tree.getChildCount(); i++) {
						((ActionRoot) root).getExpressions().add(walker(tree.getChild(i)));
					}
				}
				else
					root = null;
			}
			else if(tree.getType() == RemesLexer.EOF) {
				root = null;
			}
			else
				((ActionRoot) root).getExpressions().add(walker(tree));
		}
		
		return (ActionRoot) root;
	}

	/**
	 * Return resource declaration expression tree from ANTLR tree.
	 * 
	 * @see hr.fer.rasip.remes.grammars.expressions.ast.AstPackage#getExpression()
	 * @return root of parsed expression
	 */
	public ResourceRoot getResourceExpression() {
		// Check if root is initialized
		if(root == null) {
			// Create root
			root = factory.createResourceRoot();
			
			// In case of nil tree root, check if children exist
			if(tree.isNil())
			{
				if(tree.getChildCount() != 0)
					((ResourceRoot) root).setExpression(walker(tree.getChild(0)));
				else
					root = null;
			}
			else if(tree.getType() == RemesResourceParser.EOF)
			{
				root = null;	
			}
			else
				((ResourceRoot) root).setExpression(walker(tree));
		}
		
		return (ResourceRoot) root;
	}
	
	/**
	 * Walks the tree recursively, returning Expressions on the way.
	 * 
	 * @param tree
	 *            with original ANTLR AST tree
	 * @return
	 *            expression
	 */
	private Expression walker(Tree tree) {
		Expression expr = null;

		// Found a leaf, return
		if (tree == null)
			return null;

		// Check for tokens
		switch (tree.getType()) {
			case RemesLexer.EOF:
				expr = null;
			break;
			
			case RemesLexer.QUESTION:
				expr = handleTernaryExpression(tree);
			break;

			case RemesLexer.AMPAMP:
			case RemesLexer.LIT_AND:
			case RemesLexer.BARBAR:
			case RemesLexer.LIT_OR:
			case RemesLexer.LT:
			case RemesLexer.LE:
			case RemesLexer.EQ:
			case RemesLexer.NE:
			case RemesLexer.GE:
			case RemesLexer.GT:
			case RemesLexer.PLUS:
			case RemesLexer.MINUS:
			case RemesLexer.MUL:
			case RemesLexer.DIV:
			case RemesLexer.MOD:
			case RemesLexer.ASSIGN:
			case RemesLexer.PLUS_A:
			case RemesLexer.MINUS_A:
			case RemesLexer.MUL_A:
			case RemesLexer.DIV_A:
			case RemesLexer.MOD_A:
			case RemesLexer.TICK:
				expr = handleBinaryExpression(tree, resolveBinaryOperator(tree.getType()));
				break;
	
			case RemesActionParser.UNARY_PLUS: // Skip
				expr = walker(tree.getChild(0));
				break;
	
			case RemesActionParser.UNARY_MINUS: 
				expr = handleUnaryExpression(tree, UnaryOperation.MINUS);
				break;
	
			case RemesLexer.EXCL:
			case RemesLexer.LIT_NOT:
				expr = handleUnaryExpression(tree, UnaryOperation.NOT);
				break;
	
			case RemesLexer.TRUE:
			case RemesLexer.FALSE:
				expr = handleLiteral(tree);
				break;
	
			case RemesLexer.NAT:
				expr = handleConstant(tree);
				break;
	
			case RemesLexer.ID:
				expr = handleVariableReference(tree);
				break;
	
			case RemesLexer.LBRACKET:
				expr = handleArrayIndex(tree);
				break;
	
			default: // Fall through
				expr = walker(tree.getChild(0));
				break;
		}

		// Remember original text
		if(expr != null)
			expr.setText(tree.getText());
		
		return expr;
	}

	/**
	 * Handle array index tokens.
	 * 
	 * @param tree
	 * @return
	 */
	private Expression handleArrayIndex(Tree tree) {
		Expression expr = walker(tree.getChild(0));
		if (expr instanceof VariableReference)
			((VariableReference) expr).setArrayIndex(walker(tree.getChild(1)));
		return expr;
	}	
	
	/**
	 * Handle variable reference. Maintains {@link LogicalRoot#getReferencedVariables()} list.
	 * 
	 * @param tree AST tree token
	 * @return expression
	 */
	private VariableReference handleVariableReference(Tree tree) {
		VariableReference expr = factory.createVariableReference();
		expr.setName(tree.getText());
		root.getReferencedVariables().add(expr);
		return expr;
	}

	/**
	 * Handle constant tokens.
	 * 
	 * @param tree AST tree token
	 * @return expression
	 */
	private Constant handleConstant(Tree tree) {
		Constant expr = factory.createConstant();
		expr.setText(tree.getText());
		
		switch(tree.getType()) {
		case RemesLexer.NAT:
		//case RemesLexer.INT:
			try {
				Integer value = Integer.valueOf(tree.getText());
				expr.setValue(value);
			} catch(NumberFormatException nfe) {
			}
			break;
		case RemesLexer.FLOAT:
			try {
				Float value = Float.valueOf(tree.getText());
				expr.setValue(value);
			} catch(NumberFormatException nfe) {
			}
			break;
		}
	
		return expr;
	}

	/**
	 * Handle literal tokens.
	 * Sets value to {@link Boolean#TRUE} or {@link Boolean#FALSE}, depending on input token.
	 * 
	 * @param tree AST tree token
	 * @return expression
	 */
	private Literal handleLiteral(Tree tree) {
		Literal expr = factory.createLiteral();
		expr.setText(tree.getText());
		
		switch(tree.getType()) {
			case RemesLexer.TRUE:
				expr.setValue(Boolean.TRUE);
				break;
			case RemesLexer.FALSE:
				expr.setValue(Boolean.FALSE);
				break;
		}
		
		return expr;
	}

	/**
	 * Handle unary expression tokens.
	 * 
	 * @param tree AST tree token
	 * @return expresion
	 */
	private UnaryExpression handleUnaryExpression(Tree tree, UnaryOperation unOp) {
		UnaryExpression expr = factory.createUnaryExpression();
		expr.setOperation(unOp);
		expr.setParam1(walker(tree.getChild(0)));
		return expr;
	}

	/**
	 * Handle ternary expression token.
	 * 
	 * @param tree AST tree token
	 * @return expression
	 */
	private TernaryExpression handleTernaryExpression(Tree tree) {
		TernaryExpression expr = factory.createTernaryExpression();
		expr.setParam1(walker(tree.getChild(0)));
		expr.setParam2(walker(tree.getChild(1)));
		expr.setParam3(walker(tree.getChild(2)));
		return expr;
	}

	/**
	 * Handles binary expression tokens.
	 * 
	 * @param tree AST tree token
	 * @param binOp determines the binary operation type
	 * @return expression
	 */
	private BinaryExpression handleBinaryExpression(Tree tree, BinaryOperation binOp) {
		BinaryExpression expr = factory.createBinaryExpression();
		expr.setOperation(binOp);
		expr.setParam1(walker(tree.getChild(0)));
		expr.setParam2(walker(tree.getChild(1)));
		return expr;
	}

	/**
	 * Resolve binary operator from tree token type.
	 * Note: this relies on all parsers sharing the same lexical definition (tokens)
	 * @param type AST tree token type
	 * @return resolved binaryOp
	 */
	private BinaryOperation resolveBinaryOperator(int type) {
		switch (type) {
			// Logics
			case RemesLexer.AMPAMP:
			case RemesLexer.LIT_AND:
				return BinaryOperation.AND;
			case RemesLexer.BARBAR:
			case RemesLexer.LIT_OR:
				return BinaryOperation.OR;
			// Comparisons
			case RemesLexer.LT:
				return BinaryOperation.LT;
			case RemesLexer.LE:
				return BinaryOperation.LE;
			case RemesLexer.EQ:
				return BinaryOperation.EQ;
			case RemesLexer.NE:
				return BinaryOperation.NE;
			case RemesLexer.GE:
				return BinaryOperation.GE;
			case RemesLexer.GT:
				return BinaryOperation.GT;
			// Arithmetics
			case RemesLexer.PLUS:
				return BinaryOperation.ADD;
			case RemesLexer.MINUS:
				return BinaryOperation.SUB;
			case RemesLexer.MUL:
				return BinaryOperation.MUL;
			case RemesLexer.DIV:
				return BinaryOperation.DIV;
			case RemesLexer.MOD:
				return BinaryOperation.MOD;
			// Assignments
			case RemesLexer.ASSIGN:
				return BinaryOperation.ASSIGN;
			case RemesLexer.PLUS_A:
				return BinaryOperation.ASSIGN_ADD;
			case RemesLexer.MINUS_A:
				return BinaryOperation.ASSIGN_SUB;
			case RemesLexer.MUL_A:
				return BinaryOperation.ASSIGN_MUL;
			case RemesLexer.DIV_A:
				return BinaryOperation.ASSIGN_DIV;
			case RemesLexer.MOD_A:				
				return BinaryOperation.ASSIGN_MOD;
			// Derivation
			case RemesLexer.TICK:				
				return BinaryOperation.DIFF;

		}
		//FIXME-Add exceptions
		System.out.println("!!! UNKNOWN BIN OP !!!");
		return null;
	}
}
