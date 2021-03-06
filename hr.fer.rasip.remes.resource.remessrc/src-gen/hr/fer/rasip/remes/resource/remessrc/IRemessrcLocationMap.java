/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package hr.fer.rasip.remes.resource.remessrc;

// A LocationMap map EObjects to the position of their textual
// representations. For each org.eclipse.emf.ecore.EObject the map can contain information
// about the line, the column, the character position where the
// object begins and the character position where the object ends.
public interface IRemessrcLocationMap {
	
	// Used by parsers to set location information.
	public void setLine(org.eclipse.emf.ecore.EObject element, int line);
	
	// Used by parsers to set location information.
	public int getLine(org.eclipse.emf.ecore.EObject element);
	
	// Used by parsers to set location information.
	public void setColumn(org.eclipse.emf.ecore.EObject element, int column);
	
	// Used by parsers to set location information.
	public int getColumn(org.eclipse.emf.ecore.EObject element);
	
	// Used by parsers to set location information.
	public void setCharStart(org.eclipse.emf.ecore.EObject element, int charStart);
	
	// Used by parsers to set location information.
	public int getCharStart(org.eclipse.emf.ecore.EObject element);
	
	// Used by parsers to set location information.
	public void setCharEnd(org.eclipse.emf.ecore.EObject element, int charEnd);
	
	// Used by parsers to set location information.
	public int getCharEnd(org.eclipse.emf.ecore.EObject element);
	
	// Returns all EObjects that are located at the given
	// offset in the text document. The method can return
	// multiple elements, because containers include their
	// children in the textual representation.
	//
	// @param documentOffset
	// @return
	public java.util.List<org.eclipse.emf.ecore.EObject> getElementsAt(int documentOffset);
	
	// Returns all EObjects that are located between the given
	// offsets in the text document. The method can return
	// multiple elements.
	//
	// @param startOffset
	// @param endOffset
	// @return
	public java.util.List<org.eclipse.emf.ecore.EObject> getElementsBetween(int startOffset, int endOffset);
}
