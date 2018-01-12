/**
 * 
 */
package hr.fer.rasip.remes.simulator.core;

/**
 * @author Marin Orlic <marin.orlic@fer.hr>
 *
 */
public abstract class SystemTransition extends Transition {
	
	/**
	 * @param from
	 * @param to
	 */
	public SystemTransition(Mode from, Mode to) {
		super(from, to);
	}

	/**
	 * This transition will be treated as high-priority system transition, an executed immediately.
	 * @return
	 */
	public boolean isSystemTransition() {
		return true;
	}

}
