/**
 * 
 */
package se.mdh.progresside.uppaal.views;

import java.util.Vector;

import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.Viewer;

import se.mdh.progresside.uppaal.Activator;

import com.uppaal.engine.Engine;
import com.uppaal.model.system.SystemState;
import com.uppaal.model.system.Transition;
import com.uppaal.model.system.UppaalSystem;

class TransitionsContentProvider implements IStructuredContentProvider {

	private Engine engine;

	private UppaalSystem system;

	public void inputChanged(Viewer v, Object oldInput, Object newInput) {
	}

	public void dispose() {
	}

	public Object[] getElements(Object parent) {
		SystemState state = (SystemState) parent;
		Object[] result = null;

		if (state != null) {
			try {
				Vector<Transition> transitions = engine.getTransitions(
						system, state);
				result = transitions.toArray();
			} catch (Exception e) {
				Activator.getDefault().logError("Failed to obtain transitions",
						e);
			}
		}
		return result;
	}

	public void setSystem(UppaalSystem system) {
		this.system = system;
	}

	public UppaalSystem getSystem() {
		return system;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public Engine getEngine() {
		return engine;
	}
}