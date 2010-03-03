/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package hr.fer.rasip.remes.resource.remessrc.mopp;

public class RemessrcBracketInformationProvider {
	
	public class BracketPair implements hr.fer.rasip.remes.resource.remessrc.IRemessrcBracketPair {
		
		private String opening;
		private String closing;
		private boolean closingEnabledInside;
		
		public BracketPair(String opening, String closing, boolean closingEnabledInside) {
			super();
			this.opening = opening;
			this.closing = closing;
			this.closingEnabledInside = closingEnabledInside;
		}
		
		public String getOpeningBracket() {
			return opening;
		}
		
		public String getClosingBracket() {
			return closing;
		}
		
		public boolean isClosingEnabledInside() {
			return closingEnabledInside;
		}
	}
	
	public java.util.Collection<hr.fer.rasip.remes.resource.remessrc.IRemessrcBracketPair> getBracketPairs() {
		java.util.Collection<hr.fer.rasip.remes.resource.remessrc.IRemessrcBracketPair> result = new java.util.ArrayList<hr.fer.rasip.remes.resource.remessrc.IRemessrcBracketPair>();
		result.add(new BracketPair("{", "}", true));
		result.add(new BracketPair("[", "]", true));
		result.add(new BracketPair("(", ")", false));
		return result;
	}
	
}
