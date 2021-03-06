/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package hr.fer.rasip.remes.resource.remessrc.ui;

// Class used to initialize default preference values.
public class RemessrcPreferenceInitializer extends org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer {
	
	private final static hr.fer.rasip.remes.resource.remessrc.ui.RemessrcAntlrTokenHelper tokenHelper = new hr.fer.rasip.remes.resource.remessrc.ui.RemessrcAntlrTokenHelper();
	
	public void initializeDefaultPreferences() {
		
		initializeDefaultSyntaxHighlighting();
		initializeDefaultBrackets();
		
		org.eclipse.jface.preference.IPreferenceStore store = hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcPlugin.getDefault().getPreferenceStore();
		//Set default value for matching brackets
		store.setDefault(hr.fer.rasip.remes.resource.remessrc.ui.RemessrcPreferenceConstants.EDITOR_MATCHING_BRACKETS_COLOR, "192,192,192");
		store.setDefault(hr.fer.rasip.remes.resource.remessrc.ui.RemessrcPreferenceConstants.EDITOR_MATCHING_BRACKETS_CHECKBOX, true);
		
		//Set default value for occurrences
		store.setDefault(hr.fer.rasip.remes.resource.remessrc.ui.RemessrcPreferenceConstants.EDITOR_OCCURRENCE_CHECKBOX, true);
		store.setDefault(hr.fer.rasip.remes.resource.remessrc.ui.RemessrcPreferenceConstants.EDITOR_DEFINITION_COLOR, "240,216,168");
		store.setDefault(hr.fer.rasip.remes.resource.remessrc.ui.RemessrcPreferenceConstants.EDITOR_PROXY_COLOR, "212,212,212");
		
		//store.setDefault(AbstractDecoratedTextEditorPreferenceConstants.EDITOR_OVERVIEW_RULER, true);
	}
	
	private void initializeDefaultBrackets() {
		org.eclipse.jface.preference.IPreferenceStore store = hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcPlugin.getDefault().getPreferenceStore();
		initializeDefaultBrackets(store, new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcMetaInformation());
	}
	
	public void initializeDefaultSyntaxHighlighting() {
		org.eclipse.jface.preference.IPreferenceStore store = hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcPlugin.getDefault().getPreferenceStore();
		initializeDefaultSyntaxHighlighting(store, new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcMetaInformation());
	}
	
	private void initializeDefaultBrackets(org.eclipse.jface.preference.IPreferenceStore store, hr.fer.rasip.remes.resource.remessrc.IRemessrcMetaInformation metaInformation) {
		String languageId = metaInformation.getSyntaxName();
		// set default brackets for ITextResource bracket set
		hr.fer.rasip.remes.resource.remessrc.ui.RemessrcBracketSet bracketSet = new hr.fer.rasip.remes.resource.remessrc.ui.RemessrcBracketSet(null, languageId);
		final java.util.Collection<hr.fer.rasip.remes.resource.remessrc.IRemessrcBracketPair> bracketPairs = metaInformation.getBracketPairs();
		if (bracketPairs != null) {
			for (hr.fer.rasip.remes.resource.remessrc.IRemessrcBracketPair bracketPair : bracketPairs) {
				bracketSet.addBracketPair(bracketPair.getOpeningBracket(), bracketPair.getClosingBracket(), bracketPair.isClosingEnabledInside());
			}
		}
		store.setDefault(languageId + hr.fer.rasip.remes.resource.remessrc.ui.RemessrcPreferenceConstants.EDITOR_BRACKETS_SUFFIX, bracketSet.getBracketString());
	}
	
	private void initializeDefaultSyntaxHighlighting(org.eclipse.jface.preference.IPreferenceStore store, hr.fer.rasip.remes.resource.remessrc.IRemessrcMetaInformation metaInformation) {
		String languageId = metaInformation.getSyntaxName();
		String[] tokenNames = metaInformation.getTokenNames();
		if (tokenNames == null) {
			return;
		}
		for (int i = 0; i < tokenNames.length; i++) {
			if (!tokenHelper.canBeUsedForSyntaxColoring(i)) {
				continue;
			}
			
			String tokenName = tokenHelper.getTokenName(tokenNames, i);
			if (tokenName == null) {
				continue;
			}
			hr.fer.rasip.remes.resource.remessrc.IRemessrcTokenStyle style = metaInformation.getDefaultTokenStyle(tokenName);
			if (style != null) {
				String color = getColorString(style.getColorAsRGB());
				setProperties(store, languageId, tokenName, color, style.isBold(), true, style.isItalic(), style.isStrikethrough(), style.isUnderline());
			} else {
				setProperties(store, languageId, tokenName, "0,0,0", false, false, false, false, false);
			}
		}
	}
	
	private void setProperties(org.eclipse.jface.preference.IPreferenceStore store, String languageID, String tokenName, String color, boolean bold, boolean enable, boolean italic, boolean strikethrough, boolean underline) {
		store.setDefault(hr.fer.rasip.remes.resource.remessrc.ui.RemessrcSyntaxColoringHelper.getPreferenceKey(languageID, tokenName, hr.fer.rasip.remes.resource.remessrc.ui.RemessrcSyntaxColoringHelper.StyleProperty.BOLD), bold);
		store.setDefault(hr.fer.rasip.remes.resource.remessrc.ui.RemessrcSyntaxColoringHelper.getPreferenceKey(languageID, tokenName, hr.fer.rasip.remes.resource.remessrc.ui.RemessrcSyntaxColoringHelper.StyleProperty.COLOR), color);
		store.setDefault(hr.fer.rasip.remes.resource.remessrc.ui.RemessrcSyntaxColoringHelper.getPreferenceKey(languageID, tokenName, hr.fer.rasip.remes.resource.remessrc.ui.RemessrcSyntaxColoringHelper.StyleProperty.ENABLE), enable);
		store.setDefault(hr.fer.rasip.remes.resource.remessrc.ui.RemessrcSyntaxColoringHelper.getPreferenceKey(languageID, tokenName, hr.fer.rasip.remes.resource.remessrc.ui.RemessrcSyntaxColoringHelper.StyleProperty.ITALIC), italic);
		store.setDefault(hr.fer.rasip.remes.resource.remessrc.ui.RemessrcSyntaxColoringHelper.getPreferenceKey(languageID, tokenName, hr.fer.rasip.remes.resource.remessrc.ui.RemessrcSyntaxColoringHelper.StyleProperty.STRIKETHROUGH), strikethrough);
		store.setDefault(hr.fer.rasip.remes.resource.remessrc.ui.RemessrcSyntaxColoringHelper.getPreferenceKey(languageID, tokenName, hr.fer.rasip.remes.resource.remessrc.ui.RemessrcSyntaxColoringHelper.StyleProperty.UNDERLINE), underline);
	}
	
	private String getColorString(int[] colorAsRGB) {
		if (colorAsRGB == null) {
			return "0,0,0";
		}
		if (colorAsRGB.length != 3) {
			return "0,0,0";
		}
		return colorAsRGB[0] + "," +colorAsRGB[1] + ","+ colorAsRGB[2];
	}
}
