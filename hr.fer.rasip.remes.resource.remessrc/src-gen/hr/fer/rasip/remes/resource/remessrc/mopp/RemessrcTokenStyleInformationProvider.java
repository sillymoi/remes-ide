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
		if ("SL_COMMENT".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x3F, 0x7F, 0x5F}, false, true, false, false);
		}
		if ("T_GLOBAL".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("T_READABLE".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("T_WRITEABLE".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("T_URGENT".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("TYPE".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("ARRAY_SIZE".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x2A, 0x00, 0xFF}, false, false, false, false);
		}
		if ("IN_BRACES".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x2A, 0x00, 0xFF}, false, false, false, false);
		}
		if ("IN_PARENS".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x2A, 0x00, 0xFF}, false, false, false, false);
		}
		if ("RemesDiagram".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("CompositeMode".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("SubMode".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("Variable".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("ConditionalConnector".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("InitPoint".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("ExitPoint".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("Resource".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("Constant".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("Edge".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("InitEdge".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("CompositeEntryPoint".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("remes".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x80, 0x00, 0x55}, true, false, false, false);
		}
		if ("composite".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x80, 0x00, 0x55}, true, false, false, false);
		}
		if ("atomic".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x80, 0x00, 0x55}, true, false, false, false);
		}
		if ("invariant".equals(tokenName)) {
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
		return null;
	}
	
}
