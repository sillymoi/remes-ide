/*
 * generated by Xtext
 */
package hr.fer.rasip.remes.profile.ui;

import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

import com.google.inject.Injector;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class ProfileExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return hr.fer.rasip.remes.profile.ui.internal.ProfileActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return hr.fer.rasip.remes.profile.ui.internal.ProfileActivator.getInstance().getInjector("hr.fer.rasip.remes.profile.Profile");
	}
	
}
