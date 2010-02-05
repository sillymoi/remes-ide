/**
 * 
 */
package hr.fer.rasip.remes.grammars.expressions.parser;

import hr.fer.rasip.remes.grammars.expressions.ast.LogicalRoot;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.Tree;

/**
 * Wrapper class to use parser.
 * 
 * @author Marin
 *
 */
public class RemesLogicalParserHelper {
	
	RemesLexer lexer = null;
	RemesLogicalParser parser = null;
	CommonTokenStream tokens = null;
	Tree tree = null;
//	TreeWalker walker = null;
//	LogicalRoot logicalRoot = null;
	
	/**
	 * Constructor
	 */
	public RemesLogicalParserHelper()
	{
				
	}
	
	/**
	 * Parses a string to check for errors.
	 * 
	 * @return true if string conforms to syntax
	 */
	public boolean parseString(String text) {
		if(text == null) // Assume empty text is syntax-correct
			return true;
		
		// Run lexer
		lexer = new RemesLexer(new ANTLRStringStream(text));
		tokens = new CommonTokenStream(lexer);
		
		// Run parser
		parser = new RemesLogicalParser(tokens);
		
		try {
			tree = (Tree) parser.invariant_expression().getTree();
		} catch (RecognitionException e) {
			e.printStackTrace(); // TODO
			return false;
		}
		return (parser.getNumberOfSyntaxErrors() == 0);
	}
	
	/**
	 * Builds a logical tree Root from the parser results.
	 * 
	 * @returns root of the tree created from parser AST
	 */
	public LogicalRoot getLogicalRoot() {
		if(parser == null)
			return null;
		
		if(tree == null) {
			try {
				tree = (Tree) parser.invariant_expression().getTree();
			} catch (RecognitionException e) {
				e.printStackTrace(); // TODO - rethrow exception
				return null;
			}
		}
		
		// Walk the tree
		TreeWalker walker = new TreeWalker(tree);
		return walker.getLogicalExpression();
	}
}
