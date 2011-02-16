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

	private static final String REMES_FILE_EXTENSION = ".remes";
	private static final String REMES_DIAGRAM_FILE_EXTENSION = ".remes_diagram";

	/**
	 * Returns the source file name obtained from the SimulatorStackFrame
	 * 
	 * @see org.eclipse.debug.core.sourcelookup.ISourceLookupParticipant#getSourceName(java.lang.Object)
	 */
	@Override
	public String getSourceName(Object object) throws CoreException {
		if (object instanceof SimulatorStackFrame) {
			System.out.println("SSLP: getSourceName");
			
			String sourceName = ((SimulatorStackFrame)object).getSourceName();
			if(sourceName.endsWith(REMES_FILE_EXTENSION)) {
				String fileName = sourceName.substring(0, sourceName.length() - REMES_FILE_EXTENSION.length());
				return fileName + REMES_DIAGRAM_FILE_EXTENSION;
			} else {
				return sourceName;
			}
		}
		return null;
	}
}
