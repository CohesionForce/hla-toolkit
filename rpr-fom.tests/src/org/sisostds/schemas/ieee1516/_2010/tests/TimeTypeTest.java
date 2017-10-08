/**
 */
package org.sisostds.schemas.ieee1516._2010.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import org.sisostds.schemas.ieee1516._2010.TimeType;
import org.sisostds.schemas.ieee1516._2010._2010Factory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Time Type</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TimeTypeTest extends TestCase {

	/**
	 * The fixture for this Time Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimeType fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TimeTypeTest.class);
	}

	/**
	 * Constructs a new Time Type test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeTypeTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Time Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(TimeType fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Time Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private TimeType getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	protected void setUp() throws Exception {
		setFixture(_2010Factory.eINSTANCE.createTimeType());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //TimeTypeTest
