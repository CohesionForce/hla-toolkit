/**
 * generated by Xtext 2.12.0
 */
package com.cohesionforce.hla.dsl;

import com.cohesionforce.hla.dsl.OmtStandaloneSetupGenerated;

/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
@SuppressWarnings("all")
public class OmtStandaloneSetup extends OmtStandaloneSetupGenerated {
  public static void doSetup() {
    new OmtStandaloneSetup().createInjectorAndDoEMFRegistration();
  }
}
