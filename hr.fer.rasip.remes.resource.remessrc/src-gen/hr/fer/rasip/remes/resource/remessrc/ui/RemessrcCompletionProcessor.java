/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package hr.fer.rasip.remes.resource.remessrc.ui;

public class RemessrcCompletionProcessor implements org.eclipse.jface.text.contentassist.IContentAssistProcessor {
	
	private hr.fer.rasip.remes.resource.remessrc.ui.RemessrcEditor editor;
	
	public RemessrcCompletionProcessor(hr.fer.rasip.remes.resource.remessrc.ui.RemessrcEditor editor) {
		this.editor = editor;
	}
	
	public org.eclipse.jface.text.contentassist.ICompletionProposal[] computeCompletionProposals(org.eclipse.jface.text.ITextViewer viewer, int offset) {
		
		org.eclipse.emf.ecore.resource.Resource resource = editor.getResource();
		hr.fer.rasip.remes.resource.remessrc.IRemessrcTextResource textResource = (hr.fer.rasip.remes.resource.remessrc.IRemessrcTextResource) resource;
		String content = viewer.getDocument().get();
		hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcCodeCompletionHelper helper = new hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcCodeCompletionHelper();
		hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcCompletionProposal[] proposals = helper.computeCompletionProposals(textResource, content, offset);
		
		org.eclipse.jface.text.contentassist.ICompletionProposal[] result = new org.eclipse.jface.text.contentassist.ICompletionProposal[proposals.length];
		int i = 0;
		for (hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcCompletionProposal proposal : proposals) {
			String proposalString = proposal.getInsertString();
			String prefix = proposal.getPrefix();
			org.eclipse.jface.text.contentassist.IContextInformation info = new org.eclipse.jface.text.contentassist.ContextInformation(proposalString, proposalString);
			int begin = offset - prefix.length();
			result[i++] = new org.eclipse.jface.text.contentassist.CompletionProposal(proposalString, begin, prefix.length(), proposalString.length(), null, proposalString, info, proposalString);
		}
		return result;
	}
	
	public org.eclipse.jface.text.contentassist.IContextInformation[] computeContextInformation(org.eclipse.jface.text.ITextViewer viewer, int offset) {
		return null;
	}
	
	public char[] getCompletionProposalAutoActivationCharacters() {
		return null;
	}
	
	public char[] getContextInformationAutoActivationCharacters() {
		return null;
	}
	
	public org.eclipse.jface.text.contentassist.IContextInformationValidator getContextInformationValidator() {
		return null;
	}
	
	public String getErrorMessage() {
		return null;
	}
}
