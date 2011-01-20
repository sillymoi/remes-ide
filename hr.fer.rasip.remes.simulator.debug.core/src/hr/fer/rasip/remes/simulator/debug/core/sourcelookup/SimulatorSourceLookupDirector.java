/**
 * 
 */
package hr.fer.rasip.remes.simulator.debug.core.sourcelookup;

import org.eclipse.debug.core.sourcelookup.AbstractSourceLookupDirector;
import org.eclipse.debug.core.sourcelookup.ISourceLookupParticipant;
import org.eclipse.jdt.launching.sourcelookup.containers.JavaSourceLookupParticipant;

/**
 * Simulator source lookup director - only one participant is registered.
 * 
 * @author Marin Orlic <marin.orlic@fer.hr>
 */
public class SimulatorSourceLookupDirector extends AbstractSourceLookupDirector {

	@Override
	public void initializeParticipants() {
		System.out.println("SSLD: initParticipants");
		addParticipants(new ISourceLookupParticipant[] { new JavaSourceLookupParticipant(), new SimulatorSourceLookupParticipant() });
	}
	
// THIS IS FROM JavaSourceLookupDirector
//	private static Set fFilteredTypes;
//	
//	static {
//		fFilteredTypes = new HashSet();
//		fFilteredTypes.add(ProjectSourceContainer.TYPE_ID);
//		fFilteredTypes.add(WorkspaceSourceContainer.TYPE_ID);
//		// can't reference UI constant
//		fFilteredTypes.add("org.eclipse.debug.ui.containerType.workingSet"); //$NON-NLS-1$
//	}
//	
//	/* (non-Javadoc)
//	 * @see org.eclipse.debug.internal.core.sourcelookup.ISourceLookupDirector#initializeParticipants()
//	 */
//	public void initializeParticipants() {
//		addParticipants(new ISourceLookupParticipant[] {new JavaSourceLookupParticipant()});
//	}
//	/* (non-Javadoc)
//	 * @see org.eclipse.debug.internal.core.sourcelookup.ISourceLookupDirector#supportsSourceContainerType(org.eclipse.debug.internal.core.sourcelookup.ISourceContainerType)
//	 */
//	public boolean supportsSourceContainerType(ISourceContainerType type) {
//		return !fFilteredTypes.contains(type.getId());
//	}
}
