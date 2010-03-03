/**
 * 
 */
package hr.fer.rasip.remes.grammars.expressions.ast.impl;

import hr.fer.rasip.remes.grammars.expressions.ast.AstVisitor;
import hr.fer.rasip.remes.grammars.expressions.ast.BinaryExpression;
import hr.fer.rasip.remes.grammars.expressions.ast.Constant;
import hr.fer.rasip.remes.grammars.expressions.ast.Literal;
import hr.fer.rasip.remes.grammars.expressions.ast.TernaryExpression;
import hr.fer.rasip.remes.grammars.expressions.ast.UnaryExpression;
import hr.fer.rasip.remes.grammars.expressions.ast.VariableReference;

/**
 * @author Marin Orlic <marin.orlic@fer.hr>
 *
 */
public class PrettyPrintVisitor implements AstVisitor {

	private StringBuilder buffer = new StringBuilder();
	
	/**
	 * @return the result
	 */
	public String getResult() {
		return buffer.toString();
	}

	/**
	 * Construct visitor, use the parameter as the initial contents for StringBuilder.
	 * @param string used to initialize StringBuilder with. 
	 */
	public PrettyPrintVisitor(String string) {
		buffer.append(string);
	}
	
	/* (non-Javadoc)
	 * @see hr.fer.rasip.remes.grammars.expressions.ast.AstVisitor#visitBinaryExpression(hr.fer.rasip.remes.grammars.expressions.ast.BinaryExpression)
	 */
	@Override
	public void visitBinaryExpression(BinaryExpression node) {
		buffer.append("(");
		node.getParam1().visit(this);
		buffer.append(node.getText());
		node.getParam2().visit(this);
		buffer.append(")");
	}

	/* (non-Javadoc)
	 * @see hr.fer.rasip.remes.grammars.expressions.ast.AstVisitor#visitConstant(hr.fer.rasip.remes.grammars.expressions.ast.Constant)
	 */
	@Override
	public void visitConstant(Constant node) {
		buffer.append(node.getText());
	}

	/* (non-Javadoc)
	 * @see hr.fer.rasip.remes.grammars.expressions.ast.AstVisitor#visitLiteral(hr.fer.rasip.remes.grammars.expressions.ast.Literal)
	 */
	@Override
	public void visitLiteral(Literal node) {
		buffer.append(node.getText());
	}

	/* (non-Javadoc)
	 * @see hr.fer.rasip.remes.grammars.expressions.ast.AstVisitor#visitTernaryExpression(hr.fer.rasip.remes.grammars.expressions.ast.TernaryExpression)
	 */
	@Override
	public void visitTernaryExpression(TernaryExpression node) {
		buffer.append("((");
		node.getParam1().visit(this);
		buffer.append(") ");
		buffer.append(node.getText());
		node.getParam2().visit(this);
		buffer.append(" : ");
		node.getParam3().visit(this);
		buffer.append(")");
	}

	/* (non-Javadoc)
	 * @see hr.fer.rasip.remes.grammars.expressions.ast.AstVisitor#visitUnaryExpression(hr.fer.rasip.remes.grammars.expressions.ast.UnaryExpression)
	 */
	@Override
	public void visitUnaryExpression(UnaryExpression node) {
		buffer.append(node.getText());
		node.getParam1().visit(this);
	}

	/* (non-Javadoc)
	 * @see hr.fer.rasip.remes.grammars.expressions.ast.AstVisitor#visitVariableReference(hr.fer.rasip.remes.grammars.expressions.ast.VariableReference)
	 */
	@Override
	public void visitVariableReference(VariableReference node) {
		buffer.append(node.getName());
		
		if(node.getArrayIndex() != null) {
			buffer.append("[");
			node.getArrayIndex().visit(this);
			buffer.append("]");
		}
	}
}
