/*
 * generated by Xtext 2.12.0
 */
package com.cohesionforce.hla.dsl.ui;

import com.cohesionforce.hla.dsl.fom.ui.internal.FomActivator;
import com.google.inject.Injector;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class FomExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return FomActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return FomActivator.getInstance().getInjector(FomActivator.COM_COHESIONFORCE_HLA_DSL_FOM);
	}
	
}
