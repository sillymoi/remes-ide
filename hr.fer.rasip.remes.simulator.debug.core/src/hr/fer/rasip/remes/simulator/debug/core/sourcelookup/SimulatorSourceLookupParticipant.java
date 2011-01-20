/**
 * 
 */
package hr.fer.rasip.remes.simulator.debug.core.sourcelookup;

import hr.fer.rasip.remes.simulator.debug.core.model.SimulatorStackFrame;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.debug.core.sourcelookup.AbstractSourceLookupParticipant;

/**
 * @author Marin Orlic <marin.orlic@fer.hr>
 *
 */
public class SimulatorSourceLookupParticipant extends AbstractSourceLookupParticipant {

	/**
	 * Returns the source file name obtained from the SimulatorStackFrame
	 * 
	 * @see org.eclipse.debug.core.sourcelookup.ISourceLookupParticipant#getSourceName(java.lang.Object)
	 */
	@Override
	public String getSourceName(Object object) throws CoreException {
		if (object instanceof SimulatorStackFrame) {
			System.out.println("SSLP: getSourceName");
			return ((SimulatorStackFrame)object).getSourceName();
		}
		return null;
	}

}
