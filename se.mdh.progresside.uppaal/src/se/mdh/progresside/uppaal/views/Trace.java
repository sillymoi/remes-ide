package se.mdh.progresside.uppaal.views;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.uppaal.model.system.UppaalSystem;

public class Trace {

	private final class DefaultTraceCropConfirmationCallback implements
			TraceCropConfirmationCallback {
		@Override
		public boolean confirm() {
			return true;
		}
	}

	interface TraceCropConfirmationCallback {
		boolean confirm();
	}

	interface TraceModifiedListener {
		void traceModified();
	}

	private TraceCropConfirmationCallback traceCropConfirmationCallback = new DefaultTraceCropConfirmationCallback();

	private int nextStateIndex = 0;

	private List<TraceElement> trace = new ArrayList<TraceElement>();

	private List<TraceModifiedListener> listeners = new ArrayList<TraceModifiedListener>();

	private final UppaalSystem uppaalSystem;

	public Trace(UppaalSystem uppaalSystem) {
		this.uppaalSystem = uppaalSystem;
	}

	public boolean addTraceElement(TraceElement element) {
		if (nextStateIndex < trace.size() - 1) {
			if (traceCropConfirmationCallback.confirm()) {
				int statesToRemove = trace.size() - nextStateIndex - 1;
				for (int i = 0; i < statesToRemove; i++) {
					// remove the last
					TraceElement elementToRemove = trace
							.remove(trace.size() - 1);
					elementToRemove.setParent(null);
				}
			} else {
				return false;
			}
		}
		nextStateIndex++;
		trace.add(element);
		element.setParent(this);
		
		notifyTraceModified();
		return true;
	}

	private void notifyTraceModified() {
		for (TraceModifiedListener listener : listeners) {
			listener.traceModified();
		}
	}

	public void addListener(TraceModifiedListener traceModifiedListener) {
		if (!listeners.contains(traceModifiedListener)) {
			listeners.add(traceModifiedListener);
		} else {
			throw new IllegalStateException("Listener already added");
		}
	}

	public void removeListener(TraceModifiedListener traceModifiedListener) {
		listeners.remove(traceModifiedListener);
	}

	public List<TraceElement> getTraceElements() {
		return Collections.unmodifiableList(trace);
	}

	public void setNextStateIndex(int nextStateIndex) {
		this.nextStateIndex = nextStateIndex;
	}

	public int getNextStateIndex() {
		return nextStateIndex;
	}

	public void setTraceCropConfirmationCallback(
			TraceCropConfirmationCallback traceCropConfirmationCallback) {
		if (traceCropConfirmationCallback == null) {
			this.traceCropConfirmationCallback = new DefaultTraceCropConfirmationCallback();
		} else {
			this.traceCropConfirmationCallback = traceCropConfirmationCallback;
		}
	}

	public UppaalSystem getUppaalSystem() {
		return uppaalSystem;
	}

}