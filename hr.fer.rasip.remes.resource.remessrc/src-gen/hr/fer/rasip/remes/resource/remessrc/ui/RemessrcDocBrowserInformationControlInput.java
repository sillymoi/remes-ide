/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package hr.fer.rasip.remes.resource.remessrc.ui;

// Provides input for the <code>TextHover</code>. The most is copied from
// <code>org.eclipse.jdt.internal.ui.text.java.hover.JavadocBrowserInformationControlInput</code>
public class RemessrcDocBrowserInformationControlInput {
	
	private final RemessrcDocBrowserInformationControlInput fPrevious;
	private RemessrcDocBrowserInformationControlInput fNext;
	private final org.eclipse.emf.ecore.EObject element;
	private final String htmlContent;
	private final String tokenText;
	private final org.eclipse.emf.ecore.resource.Resource resource;
	
	// Creates a new browser information control input.
	//
	// @param previous
	//            previous input, or <code>null</code> if none available
	// @param element
	//            the element, or <code>null</code> if none available
	// @param htmlContent
	//            HTML contents, must not be null
	// @param leadingImageWidth
	//            the indent required for the element image
	///
	public RemessrcDocBrowserInformationControlInput(RemessrcDocBrowserInformationControlInput previous, org.eclipse.emf.ecore.EObject element, org.eclipse.emf.ecore.resource.Resource resource, String htmlContent, String tokenText) {
		fPrevious= previous;
		if (previous != null) {
			previous.fNext= this;
		}
		//super(previous);
		assert htmlContent != null;
		this.element = element;
		this.htmlContent = htmlContent;
		this.tokenText = tokenText;
		this.resource = resource;
	}
	
	// The previous input or <code>null</code> if this
	// is the first.
	//
	// @return the previous input or <code>null</code>
	public RemessrcDocBrowserInformationControlInput getPrevious() {
		return fPrevious;
	}
	
	// The next input or <code>null</code> if this
	// is the last.
	//
	// @return the next input or <code>null</code>
	public RemessrcDocBrowserInformationControlInput getNext() {
		return fNext;
	}
	
	// @return the resource
	public org.eclipse.emf.ecore.resource.Resource getResource() {
		return resource;
	}
	
	public String getHtml() {
		return htmlContent;
	}
	
	public String toString() {
		return getHtml();
	}
	
	//
	// @return the token text, it is needed for a hyperlink where the caret has
	//         to jump to
	public String getTokenText() {
		return tokenText;
	}
	
	public java.lang.Object getInputElement() {
		return element == null ? (java.lang.Object) htmlContent : element;
	}
	
	public String getInputName() {
		return element == null ? "" : element.toString(); 	}
	
	public int getLeadingImageWidth() {
		return 0;
	}
}
