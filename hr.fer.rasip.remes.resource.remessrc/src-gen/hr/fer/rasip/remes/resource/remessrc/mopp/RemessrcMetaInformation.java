/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package hr.fer.rasip.remes.resource.remessrc.mopp;

public class RemessrcMetaInformation implements hr.fer.rasip.remes.resource.remessrc.IRemessrcMetaInformation {
	
	public java.lang.String getSyntaxName() {
		return "remessrc";
	}
	
	public java.lang.String getURI() {
		return "http://www.mdh.se/progresside/remes/1.2.0/remes.ecore";
	}
	
	public hr.fer.rasip.remes.resource.remessrc.IRemessrcTextScanner createLexer() {
		return new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcAntlrScanner(new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcLexer());
	}
	
	public hr.fer.rasip.remes.resource.remessrc.IRemessrcTextParser createParser(java.io.InputStream inputStream, java.lang.String encoding) {
		return new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcParser().createInstance(inputStream, encoding);
	}
	
	public hr.fer.rasip.remes.resource.remessrc.IRemessrcTextPrinter createPrinter(java.io.OutputStream outputStream, hr.fer.rasip.remes.resource.remessrc.IRemessrcTextResource resource) {
		return new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcPrinter(outputStream, resource);
	}
	
	public org.eclipse.emf.ecore.EClass[] getClassesWithSyntax() {
		return new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcSyntaxCoverageInformationProvider().getClassesWithSyntax();
	}
	
	public org.eclipse.emf.ecore.EClass[] getStartSymbols() {
		return new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcSyntaxCoverageInformationProvider().getStartSymbols();
	}
	
	public hr.fer.rasip.remes.resource.remessrc.IRemessrcReferenceResolverSwitch getReferenceResolverSwitch() {
		return new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcReferenceResolverSwitch();
	}
	
	public hr.fer.rasip.remes.resource.remessrc.IRemessrcTokenResolverFactory getTokenResolverFactory() {
		return new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcTokenResolverFactory();
	}
	
	public java.lang.String getPathToCSDefinition() {
		return "hr.fer.rasip.remes.resource.remessrc/grammar/remes.cs";
	}
	
	public java.lang.String[] getTokenNames() {
		return new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcParser(null).getTokenNames();
	}
	
	public hr.fer.rasip.remes.resource.remessrc.IRemessrcTokenStyle getDefaultTokenStyle(java.lang.String tokenName) {
		return new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcTokenStyleInformationProvider().getDefaultTokenStyle(tokenName);
	}
	
	public java.util.Collection<hr.fer.rasip.remes.resource.remessrc.IRemessrcBracketPair> getBracketPairs() {
		return new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcBracketInformationProvider().getBracketPairs();
	}
	
	public org.eclipse.emf.ecore.EClass[] getFoldableClasses() {
		return new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcFoldingInformationProvider().getFoldableClasses();
	}
	
	public hr.fer.rasip.remes.resource.remessrc.IRemessrcHoverTextProvider getHoverTextProvider() {
		return new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcHoverTextProvider();
	}
	
	public hr.fer.rasip.remes.resource.remessrc.ui.RemessrcColorManager createColorManager() {
		return new hr.fer.rasip.remes.resource.remessrc.ui.RemessrcColorManager();
	}
	
	public hr.fer.rasip.remes.resource.remessrc.ui.RemessrcTokenScanner createTokenScanner(hr.fer.rasip.remes.resource.remessrc.ui.RemessrcColorManager colorManager) {
		return new hr.fer.rasip.remes.resource.remessrc.ui.RemessrcTokenScanner(colorManager);
	}
	
	public org.eclipse.emf.ecore.resource.Resource.Factory createResourceFactory() {
		return new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcResourceFactory();
	}
	
	public hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcNewFileContentProvider getNewFileContentProvider() {
		return new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcNewFileContentProvider();
	}
	
	public hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcCodeCompletionHelper createCodeCompletionHelper() {
		return new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcCodeCompletionHelper();
	}
	
}
