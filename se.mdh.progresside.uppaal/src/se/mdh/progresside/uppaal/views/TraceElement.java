package se.mdh.progresside.uppaal.views;

import com.uppaal.model.system.SystemState;
import com.uppaal.model.system.Transition;

public class TraceElement {
	private SystemState state;
	private Transition transition;
	private Trace parent;

	public TraceElement(SystemState state, Transition transition) {
		this.state = state;
		this.transition = transition;
	}

	public void setState(SystemState state) {
		this.state = state;
	}

	public SystemState getState() {
		return state;
	}

	public void setTransition(Transition transition) {
		this.transition = transition;
	}

	public Transition getTransition() {
		return transition;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((state == null) ? 0 : state.hashCode());
		result = prime * result
				+ ((transition == null) ? 0 : transition.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TraceElement other = (TraceElement) obj;
		if (state == null) {
			if (other.state != null)
				return false;
		} else if (!state.equals(other.state))
			return false;
		if (transition == null) {
			if (other.transition != null)
				return false;
		} else if (!transition.equals(other.transition))
			return false;
		return true;
	}

	void setParent(Trace parent) {
		this.parent = parent;
	}

	public int getNumberOfProcesses() {
		return parent.getUppaalSystem().getNoOfProcesses();
	}

	public boolean involvesProcess(int i) {
		// if initial state (transition == null), then process is involved
		return transition == null ? true : transition.involvesProcess(i);
	}
}
