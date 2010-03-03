/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package hr.fer.rasip.remes.resource.remessrc.ui;

// An adapter from the Eclipse <code>org.eclipse.jface.text.rules.ITokenScanner</code> interface
// to the generated lexer.
//
public class RemessrcTokenScanner implements org.eclipse.jface.text.rules.ITokenScanner {
	
	private hr.fer.rasip.remes.resource.remessrc.IRemessrcTextScanner lexer;
	private hr.fer.rasip.remes.resource.remessrc.IRemessrcTextToken currentToken;
	private int offset;
	private String languageId;
	private org.eclipse.jface.preference.IPreferenceStore store;
	private hr.fer.rasip.remes.resource.remessrc.ui.RemessrcColorManager colorManager;
	
	// @param colorManager A manager to obtain color objects
	public RemessrcTokenScanner(hr.fer.rasip.remes.resource.remessrc.ui.RemessrcColorManager colorManager) {
		this.lexer = new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcMetaInformation().createLexer();
		this.languageId = new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcMetaInformation().getSyntaxName();
		this.store = hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcPlugin.getDefault().getPreferenceStore();
		this.colorManager = colorManager;
	}
	
	public int getTokenLength() {
		return currentToken.getLength();
	}
	
	public int getTokenOffset() {
		return offset + currentToken.getOffset();
	}
	
	public org.eclipse.jface.text.rules.IToken nextToken() {
		currentToken = lexer.getNextToken();
		if (currentToken == null || !currentToken.canBeUsedForSyntaxHighlighting()) {
			return org.eclipse.jface.text.rules.Token.EOF;
		}
		org.eclipse.jface.text.TextAttribute ta = null;
		String tokenName = currentToken.getName();
		if (tokenName != null) {
			String enableKey = hr.fer.rasip.remes.resource.remessrc.ui.RemessrcSyntaxColoringHelper.getPreferenceKey(languageId, tokenName, hr.fer.rasip.remes.resource.remessrc.ui.RemessrcSyntaxColoringHelper.StyleProperty.ENABLE);
			if (store.getBoolean(enableKey)) {
				String colorKey = hr.fer.rasip.remes.resource.remessrc.ui.RemessrcSyntaxColoringHelper.getPreferenceKey(languageId, tokenName, hr.fer.rasip.remes.resource.remessrc.ui.RemessrcSyntaxColoringHelper.StyleProperty.COLOR);
				org.eclipse.swt.graphics.Color color = colorManager.getColor(org.eclipse.jface.preference.PreferenceConverter.getColor(store, colorKey));
				int style = org.eclipse.swt.SWT.NORMAL;
				if (store.getBoolean(hr.fer.rasip.remes.resource.remessrc.ui.RemessrcSyntaxColoringHelper.getPreferenceKey(languageId, tokenName, hr.fer.rasip.remes.resource.remessrc.ui.RemessrcSyntaxColoringHelper.StyleProperty.BOLD))) {
					style = style | org.eclipse.swt.SWT.BOLD;
				}
				if (store.getBoolean(hr.fer.rasip.remes.resource.remessrc.ui.RemessrcSyntaxColoringHelper.getPreferenceKey(languageId, tokenName, hr.fer.rasip.remes.resource.remessrc.ui.RemessrcSyntaxColoringHelper.StyleProperty.ITALIC))) {
					style = style | org.eclipse.swt.SWT.ITALIC;
				}
				if (store.getBoolean(hr.fer.rasip.remes.resource.remessrc.ui.RemessrcSyntaxColoringHelper.getPreferenceKey(languageId, tokenName, hr.fer.rasip.remes.resource.remessrc.ui.RemessrcSyntaxColoringHelper.StyleProperty.STRIKETHROUGH))) {
					style = style | org.eclipse.jface.text.TextAttribute.STRIKETHROUGH;
				}
				if (store.getBoolean(hr.fer.rasip.remes.resource.remessrc.ui.RemessrcSyntaxColoringHelper.getPreferenceKey(languageId, tokenName, hr.fer.rasip.remes.resource.remessrc.ui.RemessrcSyntaxColoringHelper.StyleProperty.UNDERLINE))) {
					style = style | org.eclipse.jface.text.TextAttribute.UNDERLINE;
				}
				ta = new org.eclipse.jface.text.TextAttribute(color, null, style);
			}
		}
		return new org.eclipse.jface.text.rules.Token(ta);
	}
	
	public void setRange(org.eclipse.jface.text.IDocument document, int offset, int length) {
		this.offset = offset;
		try {
			lexer.setText(document.get(offset, length));
		} catch (org.eclipse.jface.text.BadLocationException e) {
			//ignore this error. It might occur during editing when locations are outdated quickly.
		}
	}
	
	public String getTokenText() {
		return currentToken.getText();
	}
}
