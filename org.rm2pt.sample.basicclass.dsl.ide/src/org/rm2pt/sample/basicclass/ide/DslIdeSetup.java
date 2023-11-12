/*
 * generated by Xtext 2.25.0
 */
package org.rm2pt.sample.basicclass.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.eclipse.xtext.util.Modules2;
import org.rm2pt.sample.basicclass.DslRuntimeModule;
import org.rm2pt.sample.basicclass.DslStandaloneSetup;

/**
 * Initialization support for running Xtext languages as language servers.
 */
public class DslIdeSetup extends DslStandaloneSetup {

	@Override
	public Injector createInjector() {
		return Guice.createInjector(Modules2.mixin(new DslRuntimeModule(), new DslIdeModule()));
	}
	
}