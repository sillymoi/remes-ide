/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package hr.fer.rasip.remes.resource.remessrc.ui;

public class RemessrcSyntaxColoringHelper {
	
	public static enum StyleProperty {
		
		BOLD("bold"),
		ITALIC("italic"),
		ENABLE("enable"),
		UNDERLINE("underline"),
		STRIKETHROUGH("strikethrough"),
		COLOR("color");
		
		private String suffix;
		
		private StyleProperty(String suffix) {
			this.suffix = suffix;
		}
		
		public String getSuffix() {
			return suffix;
		}
	}
	
	public static String getPreferenceKey(String languageID, String tokenName, StyleProperty styleProperty) {
		return languageID + "$" + tokenName + "$" + styleProperty.getSuffix();
	}
}
