/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package hr.fer.rasip.remes.resource.remessrc.mopp;

public abstract class RemessrcANTLRParserBase extends org.antlr.runtime.Parser implements hr.fer.rasip.remes.resource.remessrc.IRemessrcTextParser {
	
	public RemessrcANTLRParserBase(org.antlr.runtime.TokenStream input) {
		super(input);
	}
	
	public RemessrcANTLRParserBase(org.antlr.runtime.TokenStream input, org.antlr.runtime.RecognizerSharedState state) {
		super(input, state);
	}
	
}
