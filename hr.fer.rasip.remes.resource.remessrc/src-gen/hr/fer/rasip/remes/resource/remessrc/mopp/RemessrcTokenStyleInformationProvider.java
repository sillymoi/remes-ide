/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package hr.fer.rasip.remes.resource.remessrc.mopp;

public class RemessrcTokenStyleInformationProvider {
	
	public class TokenStyleImpl implements hr.fer.rasip.remes.resource.remessrc.IRemessrcTokenStyle {
		
		private int[] color;
		private boolean bold;
		private boolean italic;
		private boolean strikethrough;
		private boolean underline;
		
		public TokenStyleImpl(int[] color, boolean bold, boolean italic, boolean striketrough, boolean underline) {
			super();
			this.color = color;
			this.bold = bold;
			this.italic = italic;
			this.strikethrough = striketrough;
			this.underline = underline;
		}
		
		public int[] getColorAsRGB() {
			return color;
		}
		
		public boolean isBold() {
			return bold;
		}
		
		public boolean isItalic() {
			return italic;
		}
		
		public boolean isStrikethrough() {
			return strikethrough;
		}
		
		public boolean isUnderline() {
			return underline;
		}
	}
	
	public hr.fer.rasip.remes.resource.remessrc.IRemessrcTokenStyle getDefaultTokenStyle(java.lang.String tokenName) {
		if ("RemesDiagram".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("modes".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("CompositeMode".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("entryPoint".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("exitPoint".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("name".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("initialization".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("variables".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("resources".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("constants".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("subModes".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("conditionalConnectors".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("initPoint".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("compositeEntryPoint".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("compositeExitPoint".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("SubMode".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("invariant".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("parent".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("parsedInvariant".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("ConditionalConnector".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("InitPoint".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("initEdge".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("container".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("EntryPoint".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("entryEdges".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("ExitPoint".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("exitEdges".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("CompositeEntryPoint".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("composite".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("CompositeExitPoint".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("Edge".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("actionGuard".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("actionBody".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("parsedActionGuard".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("connectFrom".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("connectTo".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("parsedActionBody".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("InitEdge".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("parsedInitialization".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("Variable".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("value".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("type".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("vectorSize".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("scope".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("Resource".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("expression".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("parsedExpression".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("Constant".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("ActionRoot".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("referencedVariables".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("expressions".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("LogicalRoot".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("ResourceRoot".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("TernaryExpression".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("param1".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("param2".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("param3".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("BinaryExpression".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("UnaryExpression".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("VariableReference".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("arrayIndex".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("resolved".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("text".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("Literal".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("remes".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x80, 0x00, 0x55}, true, false, false, false);
		}
		if ("atomic".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x80, 0x00, 0x55}, true, false, false, false);
		}
		if ("conditional".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x80, 0x00, 0x55}, true, false, false, false);
		}
		if ("init".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x80, 0x00, 0x55}, true, false, false, false);
		}
		if ("edges".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x80, 0x00, 0x55}, true, false, false, false);
		}
		if ("entry".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x80, 0x00, 0x55}, true, false, false, false);
		}
		if ("edge".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x80, 0x00, 0x55}, true, false, false, false);
		}
		if ("to".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x80, 0x00, 0x55}, true, false, false, false);
		}
		if ("var".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x80, 0x00, 0x55}, true, false, false, false);
		}
		if ("resource".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x80, 0x00, 0x55}, true, false, false, false);
		}
		if (":".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x80, 0x00, 0x55}, true, false, false, false);
		}
		if ("const".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x80, 0x00, 0x55}, true, false, false, false);
		}
		if ("QUOTED_34_34".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x2A, 0x00, 0xFF}, false, false, false, false);
		}
		return null;
	}
	
}
