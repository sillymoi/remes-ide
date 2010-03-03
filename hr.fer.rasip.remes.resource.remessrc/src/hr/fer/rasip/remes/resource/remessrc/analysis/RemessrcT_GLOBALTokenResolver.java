/**
 * @author Marin Orlic <marin.orlic@fer.hr>
 */
package hr.fer.rasip.remes.resource.remessrc.analysis;

import hr.fer.rasip.remes.resource.remessrc.BooleanAttributeResolver;

public class RemessrcT_GLOBALTokenResolver extends BooleanAttributeResolver {

	@Override
	public String getKeyword() {
		return "global";
	}
}
