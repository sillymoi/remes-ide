/**
 * 
 */
package hr.fer.rasip.remes.simulator.core.debug;

import hr.fer.rasip.remes.simulator.core.Mode;
import hr.fer.rasip.remes.simulator.core.Simulator;
import hr.fer.rasip.remes.simulator.core.TraceElement;
import hr.fer.rasip.remes.simulator.core.Transition;
import hr.fer.rasip.remes.simulator.core.Variable;
import hr.fer.rasip.remes.simulator.core.datatypes.Type;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/**
 * @author Marin Orlic <marin.orlic@fer.hr>
 *
 */
public class SimulatorDebugger {
	
	protected Simulator simulator;
	
//	protected static final String MSG_STARTED = "started";
//	protected static final String MSG_TERMINATED = "terminated";
//	
//	protected static final String REQ_TERMINATE = "terminate";
//	protected static final String RESP_SUCCESS = "ok";
//	
//	protected static final String REQ_THREADS = "threads";

	/**
	 * Port used to open a request socket, default is 7367
	 */
	protected int requestPort = 7367;
	
	/**
	 * Port used to open an event socket
	 */
	protected int eventPort = 7368;
	
	/**
	 * Socket used to receive debugger requests
	 */
	protected Socket requestSocket;
	
	/**
	 * Reader used to receive debugger requests
	 */
	protected BufferedReader requestReader;
	
	/**
	 * Writer used to reply to debugger requests
	 */
	protected PrintWriter responseWriter;
	
	/**
	 * Socket used to respond with debuggee events
	 */
	protected Socket eventSocket;
	
	/**
	 * Writer used to send debuggee events
	 */
	protected PrintWriter eventWriter;

	/**
	 * Flag that marks that we are currently stepping the execution one action at a time
	 */
	protected boolean stepping = false;
	
	/**
	 * Flag that marks that we are currently suspended and waiting for requests
	 */
	protected boolean suspended = false;
	
	/**
	 * Thread that receives debugger requests and places them in a queue.
	 */
	class DebuggerRequestThread implements Runnable {

		@Override
		public void run() {
			ISimulatorDebugRequest request = null;
			String eventSrc = "";
			while (eventSrc != null) {
				try {
					eventSrc = requestReader.readLine();
System.err.println("Got request: " + eventSrc);					
					request = SimulatorDebugRequest.parseRequest(eventSrc);
					if (request != null) {
						requestQueue.add(request);
						
						// Notify the main thread if necessary
						if(isStepping() || isSuspended()) {
							synchronized(SimulatorDebugger.this) {
								SimulatorDebugger.this.notify();
							}
						}
						
//						requestWriter.write(request.getResponse());
						responseWriter.flush();
						
//						System.err.println("Got request " + request.getKind() + " sending response " + request.getResponse());
					}
				} catch (IOException e) {
					simulator.report("Error reading debug request: " + e);
				}
			}
		}
		
	}
	
	protected Thread requestThread = null;
	
	public SimulatorDebugger(Simulator simulator) {
		this.simulator = simulator;
		
		connectToHost();
		
		this.requestThread = new Thread(new DebuggerRequestThread(), "Debugger Request Reader");
		this.requestThread.setDaemon(true);
		this.requestThread.start();
	}

	protected final Queue<ISimulatorDebugRequest> requestQueue = new ConcurrentLinkedQueue<ISimulatorDebugRequest>();

	private boolean waitingForResumeOrStep;
	
	private void connectToHost() {
		String request = this.simulator.consumeArgument("requestPort");
		String event = this.simulator.consumeArgument("eventPort");

		int req = requestPort;
		int evt = eventPort;

		if(request != null) {
			try {
				req = Integer.parseInt(request);
			} catch (NumberFormatException e) {
				this.simulator.report("Invalid format for request port number, using default " + req);
			}
		}
		
		if(event != null) {
			try {
				evt = Integer.parseInt(event);
			} catch (NumberFormatException e) {
				this.simulator.report("Invalid format for event port number, using default " + evt);
			}
		}
		
		this.requestPort = req;
		this.eventPort = evt;
		
		try {
			this.simulator.report("Opening debug connections on ports " + this.requestPort + ", " + this.eventPort);
			
			ServerSocket ss = new ServerSocket(this.requestPort);
			ss.setReuseAddress(true);
			
			this.requestSocket = ss.accept();
			ss.close();
			
			ss = new ServerSocket(this.eventPort);
			ss.setReuseAddress(true);
			
			this.eventSocket = ss.accept();
			ss.close();
			
			this.eventWriter = new PrintWriter(this.eventSocket.getOutputStream());
			this.requestReader = new BufferedReader(new InputStreamReader(this.requestSocket.getInputStream()));
			this.responseWriter = new PrintWriter(this.requestSocket.getOutputStream());

//			this.eventWriter = new PrintWriter(System.out);
//			this.requestReader = new BufferedReader(new InputStreamReader(System.in));
//			this.responseWriter = new PrintWriter(System.out);
						
			this.simulator.report("Debug connection accepted");
		} catch (IOException e) {
			this.simulator.report("Unable to open sockets: ");
			e.printStackTrace();

			System.exit(1);
			try {
				this.requestSocket.close();
				this.requestSocket = null;
				this.requestReader = null;
				
				this.eventSocket.close();
				this.eventSocket = null;
				this.eventWriter = null;
				
//				this.debugging = false;
			} catch(IOException ioe) {
			}
		}
	}

	public void handleRequests() {
System.out.println(".");
		
		if(isStepping()) {
			sendEvent(SimulatorEvent.SUSPENDED_STEP);
		}
		
		if(isSuspended() || isStepping()) {
			setWaitingForResumeOrStep(true); // reset the flag cleared by handleStepRequest()			
		}
		
		do {
			if((isStepping() || isSuspended()) && this.requestQueue.isEmpty()) {
				try { 
					synchronized(this) {
						wait(); // Wait until we receive a command
					}
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		
			ISimulatorDebugRequest req = this.requestQueue.poll();
			
			if(req != null) {
				System.err.println("Handling request: " + req);
				switch(req.getKind()) {
					case TERMINATE:
						handleTerminateRequest(req);
						break;
					case THREADS:
						handleThreadsRequest(req);
						break;
					case VARS:
						handleModeVariablesRequest(req);
						break;
					case STACK:
						handleStackRequest(req);
						break;
					case SUSPEND:
						handleSuspendRequest(req);
						break;
					case RESUME:
						handleResumeRequest(req);
						break;
					case STEP:
						handleStepRequest(req);
						break;
				}
			}
		} while (isWaitingForResumeOrStep());
		
		if(isStepping()) {
			sendEvent(SimulatorEvent.RESUMED_STEP);
		}
	}

	protected void handleTerminateRequest(ISimulatorDebugRequest req) {
		this.simulator.setRunning(false);
		setWaitingForResumeOrStep(false);
		writeResponse(req.getResponse());
	}

	protected void handleThreadsRequest(ISimulatorDebugRequest req) {
		Collection<Mode> tops = this.simulator.getTopModes();
		StringBuilder sb = new StringBuilder();
		
		for(Iterator<Mode> it = tops.iterator(); it.hasNext(); ) {
			Mode m = it.next();
			sb.append(m.getFullName());
			sb.append("|");
			sb.append(m.hashCode());
			sb.append("|");
			sb.append(m.getObjectId());
			
			if(it.hasNext())
				sb.append("#");
		}
		
		writeResponse(sb.toString());
	}

	protected void handleSuspendRequest(ISimulatorDebugRequest req) {
		setSuspended(true);
		setWaitingForResumeOrStep(false);
		writeResponse(req.getResponse());
		
		sendEvent(SimulatorEvent.SUSPENDED_CLIENT);
	}
	
	protected void handleStepRequest(ISimulatorDebugRequest req) {
		setStepping(true);
		setWaitingForResumeOrStep(false);
		writeResponse(req.getResponse());
	}

	protected void handleResumeRequest(ISimulatorDebugRequest req) {
		setSuspended(false);
		setStepping(false);
		setWaitingForResumeOrStep(false);
		writeResponse(req.getResponse());
		
		sendEvent(SimulatorEvent.RESUMED_CLIENT);
	}
	
	protected void handleModeVariablesRequest(ISimulatorDebugRequest req) {
		String modeName = req.getRequestData();
		Mode m = this.simulator.getMode(modeName);
		
		if(m != null) {
			StringBuilder sb = new StringBuilder();
			Collection<Variable<? extends Type>> vars = m.getVariables();

			encodeGlobalClock(sb);
			
			if(!vars.isEmpty()) {
				sb.append("#");
				for(Iterator<Variable<? extends Type>> it = vars.iterator(); it.hasNext(); ) {
					encodeVariable(sb, it.next());
					
					if(it.hasNext()) {
						sb.append("#");
					}
				}
			}

System.err.println("VARS RESP: " + sb.toString());
			
			this.writeResponse(sb.toString());
		} else {
			System.out.println("MODE NOT FOUND");
		}
	}

	protected void handleStackRequest(ISimulatorDebugRequest req) {
		String modeName = req.getRequestData();
		Mode root = this.simulator.getMode(modeName);
		Collection<TraceElement> actives = this.simulator.getState().getActiveElements();
		StringBuilder sb = new StringBuilder();
		
		for(Iterator<TraceElement> it = actives.iterator(); it.hasNext(); ) {
			TraceElement te = it.next();
			
			if(te.isMode()) {
				Mode m = (Mode) te;
				
				if(m.equals(root) || (m.getParent() != null && m.getParent().equals(root))) { // Ensure we're in the correct 'thread'
					sb.append(((Mode) te).getFullName()); // Mode name
					sb.append("|");
					sb.append(te.hashCode()); // Object hash code
					sb.append("|");
					sb.append(te.getObjectId()); // XMI object ID
					sb.append("|");
					sb.append(te.getSourceName()); // Object source code file name
					
					if(it.hasNext()) {
						sb.append("#");
					}
				}				
			} else if(te.isTransition()) {
				Transition t = (Transition) te;
				Mode m = t.getConnectFrom();
				
				if(m.equals(root) || (m.getParent() != null && m.getParent().equals(root))) { // Ensure we're in the correct 'thread'
					sb.append(t.getConnectFrom().getName()).append("->").append(t.getConnectTo().getName());
					sb.append("|");
					sb.append(te.hashCode());
					sb.append("|");
					sb.append(te.getObjectId());
					
					if(it.hasNext()) {
						sb.append("#");
					}
				}			
			}
		}
		
		if(sb.charAt(sb.length()-1) == '#') {
			sb.deleteCharAt(sb.length()-1);
		}
		writeResponse(sb.toString());
	}

	/**
	 * 
	 * @param sb
	 */
	private void encodeGlobalClock(StringBuilder sb) {
		sb.append("<clock>");
		sb.append(":");
		sb.append("CLOCK");
		sb.append(":");
		sb.append(0);
		sb.append(":");
		sb.append(this.simulator.getClockTicks());
	}

	/**
	 * @param sb
	 * @param var
	 */
	private StringBuilder encodeVariable(StringBuilder sb, Variable<? extends Type> var) {
		
		// Encode name, type and size 
		// TODO: encode private/public/readable/writable
		sb.append(var.getName());
		sb.append(":");
		sb.append(var.getType());
		sb.append(":");
		sb.append(var.getSize());
		sb.append(":");
		
		// Collect values
		if(var.isArray()) {
			for(int i = 0; i<var.getSize(); i++) {
				sb.append(var.valueAt(i));
				if(i<var.getSize()-1) {
					sb.append(",");
				}
			}
		} else {
			sb.append(var.value());
		}
System.out.println("Encoded var " + var + " to :" + sb.toString());		
		return sb;
	}
	
	public void writeResponse(String response) {
		this.responseWriter.println(response);
		this.responseWriter.flush();
System.err.println("RESPONSE: " + response);		
	}

	public void sendEvent(ISimulatorEvent payload) {
		this.eventWriter.println(payload.getMessage());
		this.eventWriter.flush();
System.err.println("EVENT: " + payload.getMessage());		
	}

	/**
	 * @return the stepping
	 */
	public boolean isStepping() {
		return stepping;
	}

	/**
	 * @param stepping the stepping to set
	 */
	public void setStepping(boolean stepping) {
		this.stepping = stepping;
	}

	/**
	 * @return the suspended
	 */
	public boolean isSuspended() {
		return suspended;
	}

	/**
	 * @param suspended the suspended to set
	 */
	public void setSuspended(boolean suspended) {
		this.suspended = suspended;
	}

	protected boolean isWaitingForResumeOrStep() {
		return this.waitingForResumeOrStep;
	}

	protected void setWaitingForResumeOrStep(boolean isWaiting) {
		this.waitingForResumeOrStep = isWaiting;
	}
}
