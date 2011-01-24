/**
 * 
 */
package hr.fer.rasip.remes.simulator.debug.core.model;

import hr.fer.rasip.remes.simulator.debug.core.Activator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IMarkerDelta;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.ListenerList;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.debug.core.DebugEvent;
import org.eclipse.debug.core.DebugException;
import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.model.IBreakpoint;
import org.eclipse.debug.core.model.IDebugTarget;
import org.eclipse.debug.core.model.IMemoryBlock;
import org.eclipse.debug.core.model.IProcess;
import org.eclipse.debug.core.model.IThread;

/**
 * @author Marin Orlic <marin.orlic@fer.hr>
 *
 */
public class SimulatorDebugTarget extends SimulatorDebugElement implements IDebugTarget, ISimulatorEventListener {

	// associated system process (VM)
	private IProcess process;
	
	// containing launch object
	private ILaunch launch;
	
	// sockets & readers communicating with simulator
	private Socket requestSocket;
	private PrintWriter requestWriter;
	private BufferedReader requestReader;
	private Socket eventSocket;
	private BufferedReader eventReader;
	
	// terminated state
	private boolean terminated = false;
	
	// suspended state
	private boolean suspended = false;
	
	// threads
	private IThread[] threads = null;
//	private SimulatorThread fThread;
	
	// event dispatch job
	private EventDispatchJob eventDispatch;
	
	// event listeners
	private ListenerList eventListeners = new ListenerList();
	
	/**
	 * Listens to events from the Simulator VM and fires corresponding 
	 * debug events.
	 */
	class EventDispatchJob extends Job {
		
		public EventDispatchJob() {
			super("Simulator Event Dispatch");
			setSystem(true);
		}

		/**
		 * Event dispatch job, reads input from the simulator socket, creates a
		 * corresponding event and dispatches it.
		 * 
		 * @see org.eclipse.core.runtime.jobs.Job#run(org.eclipse.core.runtime.IProgressMonitor)
		 */
		protected IStatus run(IProgressMonitor monitor) {
			SimulatorDebugEvent event = null;
			String eventSrc = "";
			while (!isTerminated() && eventSrc != null) {
				try {
					eventSrc = eventReader.readLine();
					event = SimulatorDebugEvent.createEvent(SimulatorDebugTarget.this, eventSrc);
System.out.println("ECLIPSE EVT: " + eventSrc + ": " + event);
					if (event != null) {
						Object[] listeners = eventListeners.getListeners();
						for (int i = 0; i < listeners.length; i++) {
							((ISimulatorEventListener)listeners[i]).handleEvent(event);	
						}
					}
				} catch (IOException e) {
					terminated();
				}
			}
			return Status.OK_STATUS;
		}
		
	}
	
	/**
	 * Registers the given event listener. The listener will be notified of
	 * events in the program being interpreted. Has no effect if the listener
	 * is already registered.
	 *  
	 * @param listener event listener
	 */
	public void addEventListener(ISimulatorEventListener listener) {
		eventListeners.add(listener);
	}
	
	/**
	 * De-registers the given event listener. Has no effect if the listener is
	 * not currently registered.
	 *  
	 * @param listener event listener
	 */
	public void removeEventListener(ISimulatorEventListener listener) {
		eventListeners.remove(listener);
	}
	
	/**
	 * Constructs this debug target. Opens the sockets used to commnunicate with
	 * the simulator and starts the event notification job.
	 * 
	 * @param launch launch object related to this target
	 * @throws CoreException if unable to connect to host
	 */
	public SimulatorDebugTarget(ILaunch launch, String simulatorHost, int requestPort, int eventPort) throws CoreException {
		super(null);
		
		this.launch = launch;
		this.process = launch.getProcesses()[0]; // There should be just one process for JVM
		this.threads = null;
		
		// Connect with the simulator
		try {
			// Give some time for JVM to launch
			try {
				Thread.sleep(250);
			} catch(InterruptedException e) {
			}
			this.requestSocket = new Socket(simulatorHost, requestPort);
			this.requestWriter = new PrintWriter(this.requestSocket.getOutputStream());
			this.requestReader = new BufferedReader(new InputStreamReader(this.requestSocket.getInputStream()));
			
			this.eventSocket = new Socket(simulatorHost, eventPort);
			this.eventReader = new BufferedReader(new InputStreamReader(this.eventSocket.getInputStream()));
		} catch (UnknownHostException e) {
			requestFailed("Unable to connect to simulator VM", e);
		} catch (IOException e) {
			requestFailed("Unable to connect to simulator VM", e);
		} 
		
		// Handle incoming events
		addEventListener(this);
		this.eventDispatch = new EventDispatchJob();
		this.eventDispatch.schedule();
	}
	
	/**
	 * {@inheritDoc}
	 * @see org.eclipse.debug.core.model.IDebugTarget#getName()
	 */
	@Override
	public String getName() throws DebugException {
		return "REMES Simulator";
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.debug.core.model.DebugElement#getLaunch()
	 */
	@Override
	public ILaunch getLaunch() {
		return this.launch;
	}
	
	/**
	 * {@inheritDoc}
	 * @see org.eclipse.debug.core.model.IDebugTarget#getProcess()
	 */
	@Override
	public IProcess getProcess() {
		return this.process;
	}
	
	/**
	 * {@inheritDoc}
	 * @see hr.fer.rasip.remes.simulator.debug.core.model.SimulatorDebugElement#getDebugTarget()
	 */
	@Override
	public IDebugTarget getDebugTarget() {
		return this;
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.debug.core.model.IDebugTarget#getThreads()
	 */
	@Override
	public IThread[] getThreads() throws DebugException {
		if(this.threads == null) { // Threads do not change
			SimulatorDebugRequestThreads req = (SimulatorDebugRequestThreads) sendRequest(new SimulatorDebugRequestThreads());
			String[] threadData = req.getThreads();
			if (threadData != null) {
				IThread[] threads = new IThread[threadData.length];
				for (int i = 0; i < threadData.length; i++) {
					String data = threadData[i];
					
					threads[i] = new SimulatorThread(this, data);
				}
				this.threads = threads;
			}
		}
		return this.threads;
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.debug.core.model.IDebugTarget#hasThreads()
	 */
	@Override
	public boolean hasThreads() throws DebugException {
		return true; // There's always at least one thread
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.debug.core.model.IDebugTarget#supportsBreakpoint(org.eclipse.debug.core.model.IBreakpoint)
	 */
	@Override
	public boolean supportsBreakpoint(IBreakpoint breakpoint) {
		if (!isTerminated() && breakpoint.getModelIdentifier().equals(getModelIdentifier())) {
			try {
				String program = getLaunch().getLaunchConfiguration().getAttribute("hr.fer.rasip.remes.launcher.RemesFileName"/*ISimulatorLaunchConstants.REMES_FILE_NAME_ATTR*/, (String) null);

				if (program != null) {
					IResource resource = null;
/*					if (breakpoint instanceof PDARunToLineBreakpoint) {
						PDARunToLineBreakpoint rtl = (PDARunToLineBreakpoint) breakpoint;
						resource = rtl.getSourceFile();
					} else*/ {
						IMarker marker = breakpoint.getMarker();
						if (marker != null) {
							resource = marker.getResource();
						}
					}
					if (resource != null) {
						IPath p = new Path(program);
						return resource.getFullPath().equals(p);
					}
				}
			} catch (CoreException e) {
				Activator.log(IStatus.ERROR, "Error validating breakpoints", e);
			}			
		}
		return false;
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.debug.core.model.ITerminate#canTerminate()
	 */
	@Override
	public boolean canTerminate() {
		return getProcess().canTerminate();
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.debug.core.model.ITerminate#isTerminated()
	 */
	@Override
	public boolean isTerminated() {
		return this.terminated || getProcess().isTerminated();
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.debug.core.model.ITerminate#terminate()
	 */
	@Override
	public void terminate() throws DebugException {
		sendRequest(new SimulatorDebugRequestTerminate());
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.debug.core.model.ISuspendResume#canResume()
	 */
	@Override
	public boolean canResume() {
		return !isTerminated() && isSuspended();
	}
	
	/**
	 * {@inheritDoc}
	 * @see org.eclipse.debug.core.model.ISuspendResume#canSuspend()
	 */
	@Override
	public boolean canSuspend() {
		return !isTerminated() && !isSuspended();
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.debug.core.model.ISuspendResume#isSuspended()
	 */
	@Override
	public boolean isSuspended() {
		return !isTerminated() && this.suspended;
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
	 * @see org.eclipse.debug.core.IBreakpointListener#breakpointAdded(org.eclipse.debug.core.model.IBreakpoint)
	 */
	@Override
	public void breakpointAdded(IBreakpoint breakpoint) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see org.eclipse.debug.core.IBreakpointListener#breakpointChanged(org.eclipse.debug.core.model.IBreakpoint, org.eclipse.core.resources.IMarkerDelta)
	 */
	@Override
	public void breakpointChanged(IBreakpoint breakpoint, IMarkerDelta delta) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see org.eclipse.debug.core.IBreakpointListener#breakpointRemoved(org.eclipse.debug.core.model.IBreakpoint, org.eclipse.core.resources.IMarkerDelta)
	 */
	@Override
	public void breakpointRemoved(IBreakpoint breakpoint, IMarkerDelta delta) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see org.eclipse.debug.core.model.IDisconnect#canDisconnect()
	 */
	@Override
	public boolean canDisconnect() {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.debug.core.model.IDisconnect#disconnect()
	 */
	@Override
	public void disconnect() throws DebugException {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see org.eclipse.debug.core.model.IDisconnect#isDisconnected()
	 */
	@Override
	public boolean isDisconnected() {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.debug.core.model.IMemoryBlockRetrieval#getMemoryBlock(long, long)
	 */
	@Override
	public IMemoryBlock getMemoryBlock(long startAddress, long length)
			throws DebugException {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.debug.core.model.IMemoryBlockRetrieval#supportsStorageRetrieval()
	 */
	@Override
	public boolean supportsStorageRetrieval() {
		// TODO Auto-generated method stub
		return false;
	}

	/**
	 * Notification we have connected to the VM and it has started.
	 * Resume the VM.
	 */
	private void started() {
		fireCreationEvent();
//		installDeferredBreakpoints();
		try {
			resume();
		} catch (DebugException e) {
		}
	}
	
	/**
	 * Called when this debug target terminates.
	 */
	private synchronized void terminated() {
		this.terminated = true;
		threads = new IThread[0];

//		IBreakpointManager breakpointManager = getBreakpointManager();
//        breakpointManager.removeBreakpointListener(this);
//		breakpointManager.removeBreakpointManagerListener(this);
		
		fireTerminateEvent();
		removeEventListener(this);
	}

	private void suspended(int detail) {
		setSuspended(true);
		fireSuspendEvent(detail);		
	}

	private void resumed(int detail) {
		setSuspended(false);
		fireResumeEvent(detail);		
	}
	
	/**
	 * Sends a request to the simulator.
	 * 
	 * @param request request message
	 */
	public synchronized SimulatorDebugRequest sendRequest(SimulatorDebugRequest request) throws DebugException {
		System.err.println("Sending debug request: " + request);
		synchronized (requestSocket) {
			requestWriter.println(request.getMessage());
			requestWriter.flush();
			try {
				// wait for reply
				String resp = requestReader.readLine();
System.err.println("Got response: " + resp);
				
				request.parseResponse(resp);
			} catch (IOException e) {
				requestFailed("Request failed: " + request, e);
			}
		}
		return request;
	}  
	
	@Override
	public void handleEvent(SimulatorDebugEvent event) {
		if (event.getKind() == SimulatorDebugEvent.STARTED) {
			started();
		} else if (event.getKind() == SimulatorDebugEvent.TERMINATED) {
			terminated();
		} else if (event.getKind() == SimulatorDebugEvent.SUSPENDED) {
			if(event.getDetail() == SimulatorDebugEvent.DETAIL_CLIENT) {
				suspended(DebugEvent.CLIENT_REQUEST);
			} else if(event.getDetail() == SimulatorDebugEvent.DETAIL_STEP) {
				suspended(DebugEvent.STEP_END);
			}
		} else if (event.getKind() == SimulatorDebugEvent.RESUMED) {
			if(event.getDetail() == SimulatorDebugEvent.DETAIL_CLIENT) {
				resumed(DebugEvent.CLIENT_REQUEST);
			} else if(event.getDetail() == SimulatorDebugEvent.DETAIL_STEP) {
				resumed(DebugEvent.STEP_OVER);
			}
		}
	}
}
