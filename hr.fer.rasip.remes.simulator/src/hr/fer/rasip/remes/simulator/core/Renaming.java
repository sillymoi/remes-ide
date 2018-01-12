/**
 * 
 */
package hr.fer.rasip.remes.simulator.core;

import hr.fer.rasip.remes.simulator.core.datatypes.Type;
import hr.fer.rasip.remes.simulator.core.datatypes.Type.TYPE_CODE;

/**
 * @author Marin Orlic <marin.orlic@fer.hr>
 *
 */
public class Renaming {
	
	/** Private parts */
	protected String from = null;
	protected String to = null;
	private TYPE_CODE type = null;
	
	protected Mode source = null;
	protected Mode dest = null;
	
	/**
	 * Creates a variable renaming.
	 * @param from
	 * @param to
	 * @param type
	 */
	public Renaming(Mode source, Mode dest, String from, String to, TYPE_CODE type) {
		super();
		this.source = source;
		this.dest = dest;
		this.from = from;
		this.to = to;
		this.type = type;
	}
	
	/**
	 * Copies and renames the data between source output and destination input pots
	 */
	public void rename() {
		DataPot in = source.getOutputData(); // Renaming input
		DataPot out = dest.getInputData(); // Renaming output
		
		Type data = in.get(this.from);
		
		assert(data != null); // Check if data exists
		assert(data.getType() == this.type); // Check if data type is correct
		
		Type copy = data.duplicate();
		out.put(this.to, copy);
		
		System.out.println("RENAMING DATA: [" 
			+ source.getName() + "." + this.from 
			+ "=" + data +"] -> [" 
			+ dest.getName() + "." + this.to
			+ "=" + copy + "]"
		);
	}
}
