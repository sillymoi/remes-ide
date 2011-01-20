/**
 * 
 */
package hr.fer.rasip.remes.simulator.debug.core.model;

import org.eclipse.debug.core.DebugEvent;
import org.eclipse.debug.core.DebugException;
import org.eclipse.debug.core.model.IBreakpoint;
import org.eclipse.debug.core.model.IStackFrame;
import org.eclipse.debug.core.model.IThread;
import org.eclipse.debug.core.model.IVariable;

/**
 * @author Marin Orlic <marin.orlic@fer.hr>
 *
 */
public class SimulatorThread extends SimulatorDebugElement implements IThread, ISimulatorEventListener {

	private boolean stepping = false;
	private boolean suspended = false;
	private String name = "(unnamed)";
	private String id = "";
	
	private IStackFrame[] frames = null;
	
	public SimulatorThread(SimulatorDebugTarget target, String data) {
		super(target);
	
		// Parse the data
		init(data);
		
		// Register as event listener to receive simulator events
		getSimulatorDebugTarget().addEventListener(this);
	}

	private void init(String data) {
		String[] strings = data.split("\\|");

		this.name = strings[0]; // Name
//		this.id = strings[1]; // Hash code
		this.id = strings[2]; // Use XMI ID
		
		
//		fFileName = (new Path(fileName)).lastSegment();
//		String pc = strings[1];
//		fPC = Integer.parseInt(pc) + 1;
//		fName = strings[2];
//		int numVars = strings.length - 3;
//		IVariable[] vars = new IVariable[numVars];
//		for (int i = 0; i < numVars; i++) {
//			vars[i] = new PDAVariable(this, strings[i + 3]);
//		}
//		fThread.setVariables(this, vars);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.debug.core.model.IThread#getBreakpoints()
	 */
	@Override
	public IBreakpoint[] getBreakpoints() {
		// TODO Auto-generated method stub
		return new IBreakpoint[0];
	}

	/* (non-Javadoc)
	 * @see org.eclipse.debug.core.model.IThread#getName()
	 */
	@Override
	public String getName() throws DebugException {
		return this.name;
	}

	protected String getIdentifier() {
		return this.id;
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.debug.core.model.IThread#getPriority()
	 */
	@Override
	public int getPriority() throws DebugException {
		// TODO Auto-generated method stub
		return 0;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.debug.core.model.IThread#getStackFrames()
	 */
	@Override
	public IStackFrame[] getStackFrames() throws DebugException {
System.out.println("getStackFrames: " + getName());
		if(isSuspended()) {
			SimulatorDebugRequestFrames framesData = (SimulatorDebugRequestFrames) sendRequest(new SimulatorDebugRequestFrames(this.getName()));		
			String[] strings = framesData.getFrames();
			
			if(strings != null) {
				IStackFrame[] frames = new IStackFrame[strings.length];
				for(int i=0; i<strings.length; i++) {
					String data = strings[i];
					frames[frames.length - i - 1] = new SimulatorStackFrame(this, data, frames.length == i+1);
				}
					
				return frames;
			}
		}
		return new IStackFrame[0];
	}

	/* (non-Javadoc)
	 * @see org.eclipse.debug.core.model.IThread#getTopStackFrame()
	 */
	@Override
	public IStackFrame getTopStackFrame() throws DebugException {
System.out.println("getTopStackFrame: " + getName());
		IStackFrame[] frames = getStackFrames();
		if (frames.length > 0) {
			return frames[0];
		}
		return null;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.debug.core.model.IThread#hasStackFrames()
	 */
	@Override
	public boolean hasStackFrames() throws DebugException {
		return isSuspended();
	}

	/* (non-Javadoc)
	 * @see org.eclipse.debug.core.model.ISuspendResume#canResume()
	 */
	@Override
	public boolean canResume() {
		return isSuspended();
	}

	/* (non-Javadoc)
	 * @see org.eclipse.debug.core.model.ISuspendResume#canSuspend()
	 */
	@Override
	public boolean canSuspend() {
		return !isSuspended();
	}

	/* (non-Javadoc)
	 * @see org.eclipse.debug.core.model.ISuspendResume#isSuspended()
	 */
	@Override
	public boolean isSuspended() {
		return this.suspended && !isTerminated();
	}

	protected void setSuspended(boolean susp) {
		this.suspended = susp;
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.debug.core.model.ISuspendResume#resume()
	 */
	@Override
	public void resume() throws DebugException {
		sendRequest(new SimulatorDebugRequestResume());
	}

	/* (non-Javadoc)
	 * @see org.eclipse.debug.core.model.ISuspendResume#suspend()
	 */
	@Override
	public void suspend() throws DebugException {
		sendRequest(new SimulatorDebugRequestSuspend());
	}

	/* (non-Javadoc)
	 * @see org.eclipse.debug.core.model.IStep#canStepInto()
	 */
	@Override
	public boolean canStepInto() {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.debug.core.model.IStep#canStepOver()
	 */
	@Override
	public boolean canStepOver() {
		return isSuspended();
	}

	/* (non-Javadoc)
	 * @see org.eclipse.debug.core.model.IStep#canStepReturn()
	 */
	@Override
	public boolean canStepReturn() {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.debug.core.model.IStep#isStepping()
	 */
	@Override
	public boolean isStepping() {
		return this.stepping;
	}

	protected void setStepping(boolean s) {
		this.stepping = s;
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.debug.core.model.IStep#stepInto()
	 */
	@Override
	public void stepInto() throws DebugException {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see org.eclipse.debug.core.model.IStep#stepOver()
	 */
	@Override
	public void stepOver() throws DebugException {
		sendRequest(new SimulatorDebugRequestStep());
	}

	/* (non-Javadoc)
	 * @see org.eclipse.debug.core.model.IStep#stepReturn()
	 */
	@Override
	public void stepReturn() throws DebugException {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see org.eclipse.debug.core.model.ITerminate#canTerminate()
	 */
	@Override
	public boolean canTerminate() {
		return !isTerminated();
	}

	/* (non-Javadoc)
	 * @see org.eclipse.debug.core.model.ITerminate#isTerminated()
	 */
	@Override
	public boolean isTerminated() {
		return getDebugTarget().isTerminated();
	}

	/* (non-Javadoc)
	 * @see org.eclipse.debug.core.model.ITerminate#terminate()
	 */
	@Override
	public void terminate() throws DebugException {
		getDebugTarget().terminate();
	}

	@Override
	public void handleEvent(SimulatorDebugEvent event) {
		// clear previous state
//		fBreakpoint = null;
		setStepping(false);
		
		// handle events
//		if (event.startsWith("resumed")) {
//			setSuspended(false);
//			if (event.endsWith("step")) {
//				setStepping(true);
//				resumed(DebugEvent.STEP_OVER);
//			} else if (event.endsWith("client")) {
//				resumed(DebugEvent.CLIENT_REQUEST);
//			}
//			else if (event.endsWith("drop")) {
//				resumed(DebugEvent.STEP_RETURN);
//			}
//		} else if (event.startsWith("suspended")) {
//			setSuspended(true);
//			if (event.endsWith("client")) {
//				suspended(DebugEvent.CLIENT_REQUEST);
//			} else if (event.endsWith("step")) {
//				suspended(DebugEvent.STEP_END);
//			} else if (event.startsWith("suspended event") && getError() != null) {
//				exceptionHit();
//			} 
//			else if (event.endsWith("drop")) {
//				suspended(DebugEvent.STEP_END);
//			}
//		} else 
			if (event.getKind() == SimulatorDebugEvent.STARTED) {
				fireCreationEvent();
			} else if (event.getKind() == SimulatorDebugEvent.TERMINATED) {
				terminated();
			} else if (event.getKind() == SimulatorDebugEvent.SUSPENDED) {
				if(event.getDetail() == SimulatorDebugEvent.DETAIL_CLIENT) {
					suspended(DebugEvent.CLIENT_REQUEST);
				} else if(event.getDetail() == SimulatorDebugEvent.DETAIL_STEP) {
					suspended(DebugEvent.STEP_END);
				}
			} else if (event.getKind() == SimulatorDebugEvent.RESUMED) {
				if (event.getDetail() == SimulatorDebugEvent.DETAIL_STEP) {
					setStepping(true);
					resumed(DebugEvent.STEP_OVER);
				} else if(event.getDetail() == SimulatorDebugEvent.DETAIL_CLIENT){  
					resumed(DebugEvent.CLIENT_REQUEST);
				}
			}
//		} else {
//			setError(event);
//		}
	}

	/**
	 * Called when this thread terminates.
	 */
	private synchronized void terminated() {

//		IBreakpointManager breakpointManager = getBreakpointManager();
//        breakpointManager.removeBreakpointListener(this);
//		breakpointManager.removeBreakpointManagerListener(this);
		
		fireTerminateEvent();
		
		// Unregister as event listener to stop receiving simulator events
		getSimulatorDebugTarget().removeEventListener(this);
	}
	
	/**
	 * Notification the target has resumed for the given reason.
	 * 
	 * @param detail reason for the resume
	 */
	private void resumed(int detail) {
//			synchronized (fVariables) {
//				fVariables.clear();
//			}
		setSuspended(false);
		fireResumeEvent(detail);
	}

	/**
	 * Notification the target has suspended for the given reason
	 * 
	 * @param detail reason for the suspend
	 */
	private void suspended(int detail) {
		setSuspended(true);
		fireSuspendEvent(detail);
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "SimulatorThread [id=" + id + ", name=" + name + "]";
	}
	
}
