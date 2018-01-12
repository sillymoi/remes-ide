
package hr.fer.rasip.remes.profile;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class ProfileStandaloneSetup extends ProfileStandaloneSetupGenerated{

	public static void doSetup() {
		new ProfileStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

