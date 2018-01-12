/**
 * 
 */
package se.mdh.progresside.uppaal.views;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.Viewer;

import com.uppaal.model.system.SystemState;
import com.uppaal.model.system.UppaalSystem;

class VariablesContentProvider implements IStructuredContentProvider {

	private UppaalSystem system;

	@Override
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
	}

	@Override
	public void dispose() {
	}

	@Override
	public Object[] getElements(Object inputElement) {
		
		List<String> result = new ArrayList<String>();

		SystemState state = (SystemState) inputElement;
		
		// first add variables
		int[] vars = state.getVariables();				
		for (int i = 0; i < vars.length; i++) {
			result.add(system.getVariableName(i) + " = " + vars[i]);
		}
		
		// then all constraints
		Vector<String> constraints = new Vector<String>();
		state.getPolyhedron().getAllConstraints(constraints);

		for (String contstraint : constraints) {
			result.add(contstraint);
		}
		return result.toArray();
	}

	public void setSystem(UppaalSystem system) {
		this.system = system;
	}

	public UppaalSystem getSystem() {
		return system;
	}
}