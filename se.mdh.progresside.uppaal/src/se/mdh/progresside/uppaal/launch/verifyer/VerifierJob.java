package se.mdh.progresside.uppaal.launch.verifyer;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Vector;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.console.MessageConsole;
import org.eclipse.ui.console.MessageConsoleStream;

import se.mdh.progresside.uppaal.Activator;

import com.uppaal.engine.Engine;
import com.uppaal.engine.QueryFeedback;
import com.uppaal.model.system.Transition;
import com.uppaal.model.system.UppaalSystem;

public class VerifierJob extends Job {

	private static final Map<Character, String> RESULT_CODES = new HashMap<Character, String>();
	static {
		RESULT_CODES.put('T', "Property is satisfied");
		RESULT_CODES.put('F', "Property is not satisfied");
		RESULT_CODES.put('M', "Property is maybe satisfied");
		RESULT_CODES.put('E', "Error occured");
	}

	private final Engine engine;
	private final UppaalSystem system;
	private final String options;
	private final List<Query> queries;

	public VerifierJob(Engine engine, UppaalSystem system, String options,
			List<Query> queries) {
		super("Uppaal Verifier");
		this.engine = engine;
		this.system = system;
		this.options = options;
		this.queries = queries;
	}

	@Override
	protected IStatus run(IProgressMonitor monitor) {

		final MessageConsoleStream messageStream = revealUppaalConsole()
				.newMessageStream();

		QueryFeedback feedback = new QueryFeedbackImplementation(messageStream);
		try {
			messageStream.println(engine.getVersion());
		} catch (Exception e) {
			return Activator.getDefault().createErrorStatus(e.getMessage(), e);
		}
		monitor.beginTask("Verifying Uppaal Model", queries.size());

		if (queries.isEmpty()) {
			messageStream.println("No queries specified");
		} else {
			for (Query q : queries) {
				if (!monitor.isCanceled()) {

					if (q.getQuery().isEmpty()) {
						continue;
					}

					messageStream.println(q.getQuery());

					try {
						char result = engine.query(system, options, q
								.getQuery(), feedback);
						messageStream.println(RESULT_CODES.get(result));
					} catch (Exception e) {
						messageStream.println("Error: " + e.getMessage());
						return Activator.getDefault().createErrorStatus(
								e.getMessage(), e);
					}
					monitor.worked(1);
				} else
					return new Status(IStatus.CANCEL,
							Activator.getDefault().PLUGIN_ID,
							"Verification canceled");
			}
		}
		try {
			messageStream.flush();
			messageStream.close();
		} catch (IOException e) {
			Activator.getDefault().logError(e.getMessage(), e);
		}

		return Activator.getDefault().createOkStatus("Verification finished");
	}

	private MessageConsole revealUppaalConsole() {

		final MessageConsole[] console = new MessageConsole[1];

		// force show console in UI thread
		Display.getDefault().syncExec(new Runnable() {

			@Override
			public void run() {
				console[0] = Activator.getDefault().revealUppaalConsole();
			}
		});

		return console[0];
	}

	private final class QueryFeedbackImplementation implements QueryFeedback {
		private final MessageConsoleStream messageStream;

		private QueryFeedbackImplementation(MessageConsoleStream messageStream) {
			this.messageStream = messageStream;
		}

		public void setLength(int length) {
			messageStream.println("Trace length: " + length);
		}

		public void setCurrent(int length) {
			messageStream.println("Received " + length + " transitions");
		}

		public void setTrace(char result, Vector<Transition> trace, int cycle) {
			messageStream.println("Received a trace");
		}
	}
}
