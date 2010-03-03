/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package hr.fer.rasip.remes.resource.remessrc.mopp;

// java.lang.Exception class to represent invalid content types for parser instances.
//
// @see hr.fer.rasip.remes.resource.remessrc.IRemessrcOptions.RESOURCE_CONTENT_TYPE
public class RemessrcUnexpectedContentTypeException extends org.antlr.runtime3_2_0.RecognitionException{
	
	private static final long serialVersionUID = 4791359811519433999L;
	
	private Object contentType = null;
	
	public  RemessrcUnexpectedContentTypeException(Object contentType) {
		this.contentType = contentType;
	}
	
	public Object getContentType() {
		return contentType;
	}
}
