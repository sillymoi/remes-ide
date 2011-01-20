/**
 * 
 */
package hr.fer.rasip.remes.simulator.debug.core.model;

import org.eclipse.debug.core.DebugEvent;
import org.eclipse.debug.core.DebugException;
import org.eclipse.debug.core.model.IValue;
import org.eclipse.debug.core.model.IVariable;

/**
 * A mode variable in a simulator.
 * 
 * @author Marin Orlic <marin.orlic@fer.hr>
 */
public class SimulatorVariable extends SimulatorDebugElement implements IVariable {
	
	private String name;
	private SimulatorStackFrame frame;
	private String typeName;
	private int id;
	private int size = 0;
	private IValue value;
	
	/**
	 * Constructs a variable contained in the given stack frame
	 * with the given name.
	 * 
	 * @param frame owning stack frame
	 * @param name variable name
	 */
	public SimulatorVariable(SimulatorStackFrame frame, String data, int id) {
		super(frame.getSimulatorDebugTarget());
		this.frame = frame;
		this.id = id;
		
		parseData(data);
	}
		
	public SimulatorVariable(SimulatorVariable parentVar, String data, int index) {
		super(parentVar.getDebugTarget());
		
		try {
			this.frame = parentVar.getStackFrame();
			this.id = index; // TODO: fixme
			this.name = "[" + index + "]";
			this.typeName = parentVar.getReferenceTypeName();
			this.value = new SimulatorValue(this, data);
		} catch (DebugException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	protected int getIdentifier() {
		return this.id;
	}
	
	private void parseData(String data) {
		String[] fields = data.split(":");
		
		// TODO add checking
		this.name = fields[0];
		this.typeName = fields[1];
		this.size = Integer.parseInt(fields[2]);
		this.value = new SimulatorValue(this, fields[3]);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.debug.core.model.IVariable#getValue()
	 */
	public IValue getValue() throws DebugException {
		return this.value;
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.debug.core.model.IVariable#getName()
	 */
	public String getName() throws DebugException {
		return this.name;
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.debug.core.model.IVariable#getReferenceTypeName()
	 */
	public String getReferenceTypeName() throws DebugException {
		return this.typeName;
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.debug.core.model.IVariable#hasValueChanged()
	 */
	public boolean hasValueChanged() throws DebugException {
		return false;
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.debug.core.model.IValueModification#setValue(java.lang.String)
	 */
	public void setValue(String expression) throws DebugException {
//		sendRequest("setvar " + getStackFrame().getIdentifier() + " " + getName() + " " + expression);
//		fireChangeEvent(DebugEvent.CONTENT);
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.debug.core.model.IValueModification#setValue(org.eclipse.debug.core.model.IValue)
	 */
	public void setValue(IValue value) throws DebugException {
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.debug.core.model.IValueModification#supportsValueModification()
	 */
	public boolean supportsValueModification() {
		return true;
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.debug.core.model.IValueModification#verifyValue(java.lang.String)
	 */
	public boolean verifyValue(String expression) throws DebugException {
		return true;
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.debug.core.model.IValueModification#verifyValue(org.eclipse.debug.core.model.IValue)
	 */
	public boolean verifyValue(IValue value) throws DebugException {
		return false;
	}
	
	/**
	 * Returns the stack frame owning this variable.
	 * 
	 * @return the stack frame owning this variable
	 */
	protected SimulatorStackFrame getStackFrame() {
		return this.frame;
	}
}


