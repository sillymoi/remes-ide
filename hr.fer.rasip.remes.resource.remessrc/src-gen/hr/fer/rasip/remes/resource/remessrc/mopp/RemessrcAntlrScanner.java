/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package hr.fer.rasip.remes.resource.remessrc.mopp;

public class RemessrcAntlrScanner implements hr.fer.rasip.remes.resource.remessrc.IRemessrcTextScanner {
	
	private org.antlr.runtime.Lexer antlrLexer;
	
	public RemessrcAntlrScanner(org.antlr.runtime.Lexer antlrLexer) {
		this.antlrLexer = antlrLexer;
	}
	
	public hr.fer.rasip.remes.resource.remessrc.IRemessrcTextToken getNextToken() {
		if (antlrLexer.getCharStream() == null) {
			return null;
		}
		final org.antlr.runtime.Token current = antlrLexer.nextToken();
		hr.fer.rasip.remes.resource.remessrc.IRemessrcTextToken result = new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcTextToken(current);
		return result;
	}
	
	public void setText(java.lang.String text) {
		antlrLexer.setCharStream(new org.antlr.runtime.ANTLRStringStream(text));
	}
	
}
