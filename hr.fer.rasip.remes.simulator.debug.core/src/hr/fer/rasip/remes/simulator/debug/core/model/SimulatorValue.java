/**
 * 
 */
package hr.fer.rasip.remes.simulator.debug.core.model;

import org.eclipse.debug.core.DebugException;
import org.eclipse.debug.core.model.IValue;
import org.eclipse.debug.core.model.IVariable;

/**
 * Value of a simulator variable.
 * 
 * @author Marin Orlic <marin.orlic@fer.hr>
 */
public class SimulatorValue extends SimulatorDebugElement implements IValue {

	private String value;
	private String typeName;
	private SimulatorVariable parentVar = null;
	private IVariable[] vars = null;
	
	public SimulatorValue(SimulatorVariable var, String data) {
		super(var.getSimulatorDebugTarget());
		this.parentVar = var;
		try {
			this.typeName = var.getReferenceTypeName(); // We do not support structures
		} catch (DebugException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		parseData(data);
	}
		
	private void parseData(String data) {
		this.value = data;
		if(data.contains(",")) {
			String values[] = data.split(",");

			this.vars = new IVariable[values.length];
			for(int i=0; i<values.length; i++) {
				this.vars[i] = new SimulatorVariable(this.parentVar, values[i], i);
			}
		} else {
			this.vars = null;
		} 
	}

	/* (non-Javadoc)
	 * @see org.eclipse.debug.core.model.IValue#getReferenceTypeName()
	 */
	public String getReferenceTypeName() throws DebugException {
//		try {
//			Integer.parseInt(fValue);
//		} catch (NumberFormatException e) {
//			return "text";
//		}
//		return "integer";
		return this.typeName;
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.debug.core.model.IValue#getValueString()
	 */
	public String getValueString() throws DebugException {
		return this.value;
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.debug.core.model.IValue#isAllocated()
	 */
	public boolean isAllocated() throws DebugException {
		return true;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.debug.core.model.IValue#getVariables()
	 */
	public IVariable[] getVariables() throws DebugException {
		return this.vars;
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.debug.core.model.IValue#hasVariables()
	 */
	public boolean hasVariables() throws DebugException {
		return this.vars != null;
	}
	/*
	 *  (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
    public boolean equals(Object obj) {
        return obj instanceof SimulatorValue && ((SimulatorValue)obj).value.equals(this.value);
    }
    /*
     *  (non-Javadoc)
     * @see java.lang.Object#hashCode()
     */
    public int hashCode() {
        return this.value.hashCode();
    }
}
