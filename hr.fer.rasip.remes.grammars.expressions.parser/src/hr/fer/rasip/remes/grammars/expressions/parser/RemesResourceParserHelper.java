/**
 * 
 */
package hr.fer.rasip.remes.grammars.expressions.parser;

import hr.fer.rasip.remes.grammars.expressions.ast.ResourceRoot;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.Tree;

/**
 * Wrapper class to use parser.
 * 
 * @author Marin Orlic <marin.orlic@fer.hr>
 *
 */
public class RemesResourceParserHelper {
	
	RemesLexer lexer = null;
	RemesResourceParser parser = null;
	CommonTokenStream tokens = null;
	Tree tree = null;
	
	/**
	 * Constructor
	 */
	public RemesResourceParserHelper()
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
		parser = new RemesResourceParser(tokens);
		
		try {
			tree = (Tree) parser.resource_expression().getTree();
		} catch (RecognitionException e) {
			e.printStackTrace(); // TODO
			return false;
		}
		return (parser.getNumberOfSyntaxErrors() == 0);
	}
	
	/**
	 * Builds a action tree Root from the parser results.
	 * 
	 * @returns root of the tree created from parser AST
	 */
	public ResourceRoot getResourceRoot() {
		if(parser == null)
			return null;
		
		if(tree == null) {
			try {
				tree = (Tree) parser.resource_expression().getTree();
			} catch (RecognitionException e) {
				e.printStackTrace(); // TODO - rethrow exception
				return null;
			}
		}
		
		// Walk the tree
		TreeWalker walker = new TreeWalker(tree);
		return walker.getResourceExpression();
	}
}
