/**
 */
package org.sisostds.schemas.ieee1516._2010;

import java.lang.String;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.AbstractEnumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Application Domain Enumerations</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.sisostds.schemas.ieee1516._2010._2010Package#getApplicationDomainEnumerations()
 * @model extendedMetaData="name='ApplicationDomainEnumerations'"
 * @generated
 */
public final class ApplicationDomainEnumerations extends AbstractEnumerator {
	/**
	 * The '<em><b>Analysis</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Analysis</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ANALYSIS_LITERAL
	 * @model name="Analysis"
	 * @generated
	 * @ordered
	 */
	public static final int ANALYSIS = 0;

	/**
	 * The '<em><b>Training</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Training</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TRAINING_LITERAL
	 * @model name="Training"
	 * @generated
	 * @ordered
	 */
	public static final int TRAINING = 1;

	/**
	 * The '<em><b>Test And Evaluation</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Test And Evaluation</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TEST_AND_EVALUATION_LITERAL
	 * @model name="TestAndEvaluation" literal="Test and Evaluation"
	 * @generated
	 * @ordered
	 */
	public static final int TEST_AND_EVALUATION = 2;

	/**
	 * The '<em><b>Engineering</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Engineering</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ENGINEERING_LITERAL
	 * @model name="Engineering"
	 * @generated
	 * @ordered
	 */
	public static final int ENGINEERING = 3;

	/**
	 * The '<em><b>Acquisition</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Acquisition</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ACQUISITION_LITERAL
	 * @model name="Acquisition"
	 * @generated
	 * @ordered
	 */
	public static final int ACQUISITION = 4;

	/**
	 * The '<em><b>Analysis</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ANALYSIS
	 * @generated
	 * @ordered
	 */
	public static final ApplicationDomainEnumerations ANALYSIS_LITERAL = new ApplicationDomainEnumerations(ANALYSIS, "Analysis", "Analysis");

	/**
	 * The '<em><b>Training</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRAINING
	 * @generated
	 * @ordered
	 */
	public static final ApplicationDomainEnumerations TRAINING_LITERAL = new ApplicationDomainEnumerations(TRAINING, "Training", "Training");

	/**
	 * The '<em><b>Test And Evaluation</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TEST_AND_EVALUATION
	 * @generated
	 * @ordered
	 */
	public static final ApplicationDomainEnumerations TEST_AND_EVALUATION_LITERAL = new ApplicationDomainEnumerations(TEST_AND_EVALUATION, "TestAndEvaluation", "Test and Evaluation");

	/**
	 * The '<em><b>Engineering</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENGINEERING
	 * @generated
	 * @ordered
	 */
	public static final ApplicationDomainEnumerations ENGINEERING_LITERAL = new ApplicationDomainEnumerations(ENGINEERING, "Engineering", "Engineering");

	/**
	 * The '<em><b>Acquisition</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACQUISITION
	 * @generated
	 * @ordered
	 */
	public static final ApplicationDomainEnumerations ACQUISITION_LITERAL = new ApplicationDomainEnumerations(ACQUISITION, "Acquisition", "Acquisition");

	/**
	 * An array of all the '<em><b>Application Domain Enumerations</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ApplicationDomainEnumerations[] VALUES_ARRAY =
		new ApplicationDomainEnumerations[] {
			ANALYSIS_LITERAL,
			TRAINING_LITERAL,
			TEST_AND_EVALUATION_LITERAL,
			ENGINEERING_LITERAL,
			ACQUISITION_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Application Domain Enumerations</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Application Domain Enumerations</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ApplicationDomainEnumerations get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ApplicationDomainEnumerations result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Application Domain Enumerations</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ApplicationDomainEnumerations getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ApplicationDomainEnumerations result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Application Domain Enumerations</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ApplicationDomainEnumerations get(int value) {
		switch (value) {
			case ANALYSIS: return ANALYSIS_LITERAL;
			case TRAINING: return TRAINING_LITERAL;
			case TEST_AND_EVALUATION: return TEST_AND_EVALUATION_LITERAL;
			case ENGINEERING: return ENGINEERING_LITERAL;
			case ACQUISITION: return ACQUISITION_LITERAL;
		}
		return null;
	}

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private ApplicationDomainEnumerations(int value, String name, String literal) {
		super(value, name, literal);
	}

} //ApplicationDomainEnumerations
