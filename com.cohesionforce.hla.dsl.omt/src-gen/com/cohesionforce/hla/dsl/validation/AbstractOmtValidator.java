/*
 * generated by Xtext 2.12.0
 */
package com.cohesionforce.hla.dsl.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.validation.AbstractDeclarativeValidator;

public abstract class AbstractOmtValidator extends AbstractDeclarativeValidator {
	
	@Override
	protected List<EPackage> getEPackages() {
		List<EPackage> result = new ArrayList<EPackage>();
		result.add(com.cohesionforce.hla.dsl.omt.OmtPackage.eINSTANCE);
		return result;
	}
	
}
