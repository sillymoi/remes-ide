/**
 * 
 */
package hr.fer.rasip.remes.simulator.core;

/**
 * @author Marin Orlic <marin.orlic@fer.hr>
 *
 */
public class Behaviour {
	private String name = null;
	
	public Behaviour(String name) {
		this.name = name;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	public String getFullName() {
		return this.name;
	}
}
