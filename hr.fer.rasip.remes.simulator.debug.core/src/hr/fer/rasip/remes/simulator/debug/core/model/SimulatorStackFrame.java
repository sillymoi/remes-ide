/**
 * 
 */
package hr.fer.rasip.remes.simulator.debug.core.model;

import org.eclipse.debug.core.DebugException;
import org.eclipse.debug.core.model.IRegisterGroup;
import org.eclipse.debug.core.model.IStackFrame;
import org.eclipse.debug.core.model.IThread;
import org.eclipse.debug.core.model.IVariable;

/**
 * @author Marin Orlic <marin.orlic@fer.hr>
 *
 */
public class SimulatorStackFrame extends SimulatorDebugElement implements IStackFrame {

	private SimulatorThread thread;
	private String id;
	private IVariable[] vars = null;
	private String name = "Active behavior mode";
	private String fullName = "";
	private boolean topFrame = false;
	private String fileName = "";
	
	public SimulatorStackFrame(SimulatorThread thread, String data, boolean isTopFrame) {
		super(thread.getSimulatorDebugTarget());
		
		this.thread = thread;
	
		init(data);	
		
		this.fullName = this.name;
		this.topFrame = isTopFrame;
	}

	private void init(String data) {
		String[] strings = data.split("\\|");

		this.name = strings[0]; // Name
//		this.id = strings[1]; // Hash code
		this.id = strings[2]; // Use XMI ID
		this.fileName = strings[3]; // Source file name
	}

	/**
	 * Returns the name of the source file this stack frame is associated with.
	 * 
	 * @return source file name
	 */
	public String getSourceName() {
		System.out.println("GET SOURCE NAME");
		return this.fileName;
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.debug.core.model.IStackFrame#getCharEnd()
	 */
	@Override
	public int getCharEnd() throws DebugException {
		return -1;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.debug.core.model.IStackFrame#getCharStart()
	 */
	@Override
	public int getCharStart() throws DebugException {
		return -1;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.debug.core.model.IStackFrame#getLineNumber()
	 */
	@Override
	public int getLineNumber() throws DebugException {
		// TODO Auto-generated method stub
		System.out.println("GET LINE #");
		return 6;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.debug.core.model.IStackFrame#getName()
	 */
	@Override
	public String getName() throws DebugException {
		return this.name;
	}

	protected String getFullName() {
		return this.fullName;
	}
	
	public boolean isTopFrame() {
		return this.topFrame;
	}
	
	public void setTopFrame(boolean isTopFrame) {
		this.topFrame = isTopFrame;
	}
	
	public String getIdentifier() {
		return this.id;
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.debug.core.model.IStackFrame#getRegisterGroups()
	 */
	@Override
	public IRegisterGroup[] getRegisterGroups() throws DebugException {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.debug.core.model.IStackFrame#getThread()
	 */
	@Override
	public IThread getThread() {
		return this.thread;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.debug.core.model.IStackFrame#getVariables()
	 */
	@Override
	public IVariable[] getVariables() throws DebugException {
		if(vars == null) {
			synchronized(this) {
				SimulatorDebugRequestVars varsData = (SimulatorDebugRequestVars) sendRequest(new SimulatorDebugRequestVars(getFullName()));
				
				String[] strings = varsData.getVars();
				if(strings != null) {
					IVariable[] vars;
				
					if(strings[0].equals("-")) {
						vars = new IVariable[0];
					} else {
						vars = new IVariable[strings.length];
					
						for(int i=0; i<vars.length; i++) {
							String encVar = strings[i];
							vars[i] = new SimulatorVariable(this, encVar, i);	
						}
					}
					
					this.vars = vars;
				} else {
					this.vars = new IVariable[0];
				}
			}
		}
		return this.vars;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.debug.core.model.IStackFrame#hasRegisterGroups()
	 */
	@Override
	public boolean hasRegisterGroups() throws DebugException {
		return false;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.debug.core.model.IStackFrame#hasVariables()
	 */
	@Override
	public boolean hasVariables() throws DebugException {
		// TODO Auto-generated method stub
		return isSuspended() && getVariables() != null;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.debug.core.model.IStep#canStepInto()
	 */
	@Override
	public boolean canStepInto() {
		// TODO Auto-generated method stub
		return getThread().canStepInto();
	}

	/* (non-Javadoc)
	 * @see org.eclipse.debug.core.model.IStep#canStepOver()
	 */
	@Override
	public boolean canStepOver() {
		// TODO Auto-generated method stub
		return getThread().canStepOver();
	}

	/* (non-Javadoc)
	 * @see org.eclipse.debug.core.model.IStep#canStepReturn()
	 */
	@Override
	public boolean canStepReturn() {
		// TODO Auto-generated method stub
		return getThread().canStepReturn();
	}

	/* (non-Javadoc)
	 * @see org.eclipse.debug.core.model.IStep#isStepping()
	 */
	@Override
	public boolean isStepping() {
		// TODO Auto-generated method stub
		return getThread().isStepping();
	}

	/* (non-Javadoc)
	 * @see org.eclipse.debug.core.model.IStep#stepInto()
	 */
	@Override
	public void stepInto() throws DebugException {
		// TODO Auto-generated method stub
		getThread().stepInto();
	}

	/* (non-Javadoc)
	 * @see org.eclipse.debug.core.model.IStep#stepOver()
	 */
	@Override
	public void stepOver() throws DebugException {
		// TODO Auto-generated method stub
		getThread().stepOver();
	}

	/* (non-Javadoc)
	 * @see org.eclipse.debug.core.model.IStep#stepReturn()
	 */
	@Override
	public void stepReturn() throws DebugException {
		// TODO Auto-generated method stub
		getThread().stepReturn();
	}

	/* (non-Javadoc)
	 * @see org.eclipse.debug.core.model.ISuspendResume#canResume()
	 */
	@Override
	public boolean canResume() {
		// TODO Auto-generated method stub
		return getThread().canResume();
	}

	/* (non-Javadoc)
	 * @see org.eclipse.debug.core.model.ISuspendResume#canSuspend()
	 */
	@Override
	public boolean canSuspend() {
		// TODO Auto-generated method stub
		return getThread().canSuspend();
	}

	/* (non-Javadoc)
	 * @see org.eclipse.debug.core.model.ISuspendResume#isSuspended()
	 */
	@Override
	public boolean isSuspended() {
		// TODO Auto-generated method stub
		return getThread().isSuspended();
	}

	/* (non-Javadoc)
	 * @see org.eclipse.debug.core.model.ISuspendResume#resume()
	 */
	@Override
	public void resume() throws DebugException {
		// TODO Auto-generated method stub
		getThread().resume();
	}

	/* (non-Javadoc)
	 * @see org.eclipse.debug.core.model.ISuspendResume#suspend()
	 */
	@Override
	public void suspend() throws DebugException {
		// TODO Auto-generated method stub
		getThread().suspend();
	}

	/* (non-Javadoc)
	 * @see org.eclipse.debug.core.model.ITerminate#canTerminate()
	 */
	@Override
	public boolean canTerminate() {
		// TODO Auto-generated method stub
		return getThread().canTerminate();
	}

	/* (non-Javadoc)
	 * @see org.eclipse.debug.core.model.ITerminate#isTerminated()
	 */
	@Override
	public boolean isTerminated() {
		// TODO Auto-generated method stub
		return getThread().isTerminated();
	}

	/* (non-Javadoc)
	 * @see org.eclipse.debug.core.model.ITerminate#terminate()
	 */
	@Override
	public void terminate() throws DebugException {
		// TODO Auto-generated method stub
		getThread().terminate();
	}

}
