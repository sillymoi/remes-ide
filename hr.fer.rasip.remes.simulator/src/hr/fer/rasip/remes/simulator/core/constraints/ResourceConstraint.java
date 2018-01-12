/**
 * 
 */
package hr.fer.rasip.remes.simulator.core.constraints;

/**
 * Interface for a resource constraint check. Contains a single check method and some useful constants.
 * @author Marin
 */
public abstract class ResourceConstraint {
	/** Define possible comparison operations */
	public enum Operation {
		Unknown("?"),
		LessThan("<"),
		LessOrEqual("<="),
		Equal("="),
		GreaterThan(">"),
		GreaterOrEqual(">=");
		
		private String text;

		Operation(String text) {
			this.text = text;
		}

		public String toString() {
			return this.text;
		}
	}
	
	/** Constraint bound */
	protected final String resource; 

	/** Constraint operation */
	protected final ResourceConstraint.Operation operation;
	
	/** Constraint bound */
	protected final int bound; 	
	
	/** Description */
	protected final String description;
	
	/** Constructor */
	public ResourceConstraint(String res, Operation op, int bound, String description) {
		this.resource = res;
		this.operation = op;
		this.bound = bound;
		this.description = description;
	}

	/**
	 * @return the resource
	 */
	public String getResource() {
		return resource;
	}

	/**
	 * @return the operation
	 */
	public ResourceConstraint.Operation getOperation() {
		return operation;
	}

	/**
	 * @return the bound
	 */
	public int getBound() {
		return bound;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
}
