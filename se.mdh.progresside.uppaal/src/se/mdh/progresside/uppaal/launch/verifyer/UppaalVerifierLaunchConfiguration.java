package se.mdh.progresside.uppaal.launch.verifyer;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.debug.core.ILaunchConfiguration;

import se.mdh.progresside.uppaal.Activator;
import se.mdh.progresside.uppaal.launch.simulator.UppaalSimulatorLaunchConfiguration;

import com.uppaal.engine.Engine;
import com.uppaal.model.system.UppaalSystem;

public class UppaalVerifierLaunchConfiguration extends
		UppaalSimulatorLaunchConfiguration {

	public static final String ENGINE_OPTIONS_ATTR_NAME = "uppaal.engine.options";

	public static final String SELECTED_QUERIES_ATTR_NAME = "uppaal.selected.queries";

	public static final String QUERY_PATH_ATTR_NAME = "uppaal.query.path";

	public static final String ID = "se.mdh.progresside.uppaal.launch.verifier";

	@Override
	protected void doLaunch(ILaunchConfiguration configuration, Engine engine,
			UppaalSystem system) {

		try {

			String options = configuration.getAttribute(
					ENGINE_OPTIONS_ATTR_NAME, "");
			List<Query> queries = getQueries(configuration);

			VerifierJob job = new VerifierJob(engine, system, options, queries);
			job.schedule();

		} catch (CoreException e) {
			Activator.getDefault().logError(e.getMessage(), e);
		}
	}

	private List<Query> getQueries(ILaunchConfiguration configuration)
			throws CoreException {
		List<Query> result = new ArrayList<Query>();

		String queryPath = configuration.getAttribute(
				UppaalVerifierLaunchConfiguration.QUERY_PATH_ATTR_NAME, "");
		List<Query> queries;
		try {
			queries = QueryParser.loadQueries(new File(queryPath));
		} catch (Exception e) {
			throw new CoreException(Activator.getDefault().createErrorStatus(
					"Failed to read queries", e));
		}
		String selectedQueriesAttribute = configuration.getAttribute(
				UppaalVerifierLaunchConfiguration.SELECTED_QUERIES_ATTR_NAME,
				"");

		if (!selectedQueriesAttribute.isEmpty()) {
			String[] indices = selectedQueriesAttribute
					.split(UppaalVerifierLaunchConfigurationQueryTab.SELECTED_QUERIES_DELIMITER);
			for (int i = 0; i < indices.length; i++) {
				String q = indices[i];
				int index = Integer.parseInt(q);
				if (index < queries.size()) {
					Query query = queries.get(index);
					if (query != null) {
						result.add(query);
					}
				}
			}
		}

		return result;
	}

}
