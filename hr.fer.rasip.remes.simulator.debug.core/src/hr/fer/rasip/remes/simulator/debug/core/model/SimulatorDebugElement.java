/**
 * 
 */
package hr.fer.rasip.remes.simulator.debug.core.model;

import hr.fer.rasip.remes.simulator.debug.core.Activator;

import org.eclipse.debug.core.DebugException;
import org.eclipse.debug.core.model.DebugElement;
import org.eclipse.debug.core.model.IDebugTarget;

/**
 * @author Marin Orlic <marin.orlic@fer.hr>
 *
 */
public class SimulatorDebugElement extends DebugElement {

	/**
	 * Constructs a new debug element in the given target.
	 * 
	 * @param target debug target
	 */
	public SimulatorDebugElement(IDebugTarget target) {
		super(target);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.debug.core.model.IDebugElement#getModelIdentifier()
	 */
	@Override
	public String getModelIdentifier() {
		return Activator.ID_SIMULATOR_DEBUG_MODEL;
	}

	/**
	 * Returns the debug target as a simulator debug target.
	 * 
	 * @return simulator debug target
	 */
	protected SimulatorDebugTarget getSimulatorDebugTarget() {
	    return (SimulatorDebugTarget) getDebugTarget();
	}
	
	/**
	 * Sends a request to the simulator, waits for and returns the reply.
	 * <p>
	 * Interpreter commands and replies are as follows:
	 * <ul>
	 * <li><code>clear N</code> - clear the breakpoint on line <code>N</code>;
	 * 		reply is <code>ok</code></li>
	 * <li><code>data</code> - return the contents of the data stack; reply is the data
	 * 		from oldest to newest as a single string <code>"value|value|value|...|value|"</code></li>
	 * <li><code>drop</code> - pops the top stack frame off the call stack setting the 
	 * 		instruction pointer to the calling statement in the calling frame</li>
	 * <li><code>eventstop E B</code> - optionally stop the interpreter when an error event
	 * 		<code>E</code> is encountered; <code>B</code> specifies stop (<code>1</code>) or
	 * 		continue (<code>0</code>). The possible events are <code>unimpinstr</code> and
	 * 		<code>nosuchlabel</code>. Reply is <code>ok</code>. When an event is encountered,
	 * 		the interpreter sends the error event (for example <code>unimlpemented instruction foo</code>)
	 * 		and corresponding suspend event (for example <code>suspended event unimpinstr</code>).</li>
	 * <li><code>exit</code> - end the interpreter; reply is <code>ok</code></li>
	 * <li><code>popdata</code> - pop the top value off the data stack; reply is the value</li>
	 * <li><code>pushdata V</code> - push the value <code>V</code> onto the data stack; reply is
	 * 		<code>ok</code></li>
	 * <li><code>resume</code> - resume execution of the program; reply is <code>ok</code></li>
	 * <li><code>set N</code> - set a line breakpoint on line <code>N</code> (lines are indexed
	 * 		from 0); reply is <code>ok</code></li>
	 * <li><code>setdata N V</code> - set the contents of data stack element <code>N</code> to
	 * 		value <code>V</code> (the data stack is indexed from 0, 0 being the oldest); reply
	 * 		is <code>ok</code></li>
	 * <li><code>setvar N M V</code> - set the contents of variable <code>M</code> from the control
	 * 		stack <code>N</code> to value <code>V</code> (the control stack is indexed from 0,
	 * 		0 being the oldest); reply is <code>ok</code></li>
	 * <li><code>stack</code> - return the contents of the control stack (program counters, function and
	 * 		variable names); reply is control stack from oldest to newest as a single string
	 * 		<code>frame#frame#frame...#frame</code> where each frame is a string
	 * 		<code>"filename|pc|function name|variable name|variable name|...|variable name"</code></li>
	 * <li><code>step</code> - single step forward; reply is <code>ok</code></li>
	 * <li><code>stepreturn</code> - single step forward until the next <code>return</code> op code;
	 * 		stop before executing the <code>return</code> ; reply is <code>ok</code></li>
	 * <li><code>suspend</code> - suspend execution of the program and listen for debug commands;
	 * 		reply is <code>ok</code></li>
	 * <li><code>watch F::V M</code> - set a watchpoint on variable <code>V</code> in function
	 * 		<code>F</code> to magic value <code>M</code>; the magic value is a bit flag corresponding
	 * 		to read access (1), write access (2), or both (3); the magic value 0 clears the watchpoint;
	 * 		reply is <code>ok</code></li>
	 * <li><code>var N M</code> - return the contents of variable <code>M</code> in the control
	 * 		stack frame <code>N</code> (stack frames are indexed from 0, 0 being the oldest);
	 * 		reply is variable value</li>
	 * </ul>
	 * </p>
	 * 
	 * @param request command
	 * @return true if the response was recognized
	 * @throws DebugException if the request fails
	 */	
	public SimulatorDebugRequest sendRequest(SimulatorDebugRequest request) throws DebugException {
		return getSimulatorDebugTarget().sendRequest(request);
	}
}
