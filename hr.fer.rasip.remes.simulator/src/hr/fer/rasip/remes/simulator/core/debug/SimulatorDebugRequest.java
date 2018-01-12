/**
 * 
 */
package hr.fer.rasip.remes.simulator.core.debug;


/**
 * @author Marin Orlic <marin.orlic@fer.hr>
 *
 */
public class SimulatorDebugRequest implements ISimulatorDebugRequest {
	
//	public static final int UNSPECIFIED = 0;
//	public static final int TERMINATE = 2;
	
	private static final String REQ_TERMINATE = "terminate";
	private static final String REQ_THREADS = "threads";
	private static final String REQ_VARS = "vars";
	private static final String REQ_STACK = "stack";
	private static final String REQ_SUSPEND = "suspend";
	private static final String REQ_RESUME = "resume";
	private static final String REQ_STEP = "step";
	
	private static final String RESP_OK = "ok";

	private KIND kind = KIND.UNSPECIFIED;
	
	private String requestData = "";
	
	public SimulatorDebugRequest() {
		this(KIND.UNSPECIFIED);
	}
	
	public SimulatorDebugRequest(KIND kind) {
		super();
		setKind(kind);
	}

	/**
	 * @return the fKind
	 */
	public KIND getKind() {
		return kind;
	}

	/**
	 * @param kind the Kind to set
	 */
	public void setKind(KIND kind) {
		this.kind = kind;
	}

	@Override
	public String getResponse() {
		return RESP_OK;
	}
	
	@Override
	public String getRequestData() {
		return this.requestData ;
	}
	
	protected void setRequestData(String requestData) {
		this.requestData = requestData;
	}
	
	/**
	 * Parses the event string received from the simulator and creates a corresponding event.
	 * @param source event source
	 * @param message event message
	 * @return initialized event object
	 */
	protected static SimulatorDebugRequest parseRequest(String message) {
		SimulatorDebugRequest req = new SimulatorDebugRequest();
		
		if(message.startsWith(REQ_TERMINATE)) {
			req.setKind(KIND.TERMINATE);
		} else if(message.startsWith(REQ_THREADS)) {
			req.setKind(KIND.THREADS);
		} else if(message.startsWith(REQ_SUSPEND)) {
			req.setKind(KIND.SUSPEND);
		} else if(message.startsWith(REQ_RESUME)) {
			req.setKind(KIND.RESUME);
		} else if(message.startsWith(REQ_STEP)) {
			req.setKind(KIND.STEP);
		} else if(message.startsWith(REQ_VARS)) {
			req.setKind(KIND.VARS);
			String params[] = message.split(" ");

			req.setRequestData(params[1]); // TODO check values
		} else if(message.startsWith(REQ_STACK)) {
			req.setKind(KIND.STACK);
			String params[] = message.split(" ");
	
			req.setRequestData(params[1]); // TODO check values
		}

			
		return req;	
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "SimulatorDebugRequest [" + kind + "]";
	}
	
}
