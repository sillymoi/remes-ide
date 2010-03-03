/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package hr.fer.rasip.remes.resource.remessrc.mopp;

public abstract class RemessrcANTLRParserBase extends org.antlr.runtime3_2_0.Parser implements hr.fer.rasip.remes.resource.remessrc.IRemessrcTextParser {
	
	public RemessrcANTLRParserBase(org.antlr.runtime3_2_0.TokenStream input) {
		super(input);
	}
	
	public RemessrcANTLRParserBase(org.antlr.runtime3_2_0.TokenStream input, org.antlr.runtime3_2_0.RecognizerSharedState state) {
		super(input, state);
	}
	
}
