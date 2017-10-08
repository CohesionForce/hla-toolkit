/**
 */
package org.sisostds.schemas.ieee1516._2010.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import org.sisostds.schemas.ieee1516._2010.DisconnectType;
import org.sisostds.schemas.ieee1516._2010._2010Factory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Disconnect Type</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DisconnectTypeTest extends TestCase {

	/**
	 * The fixture for this Disconnect Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DisconnectType fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DisconnectTypeTest.class);
	}

	/**
	 * Constructs a new Disconnect Type test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DisconnectTypeTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Disconnect Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(DisconnectType fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Disconnect Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private DisconnectType getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	protected void setUp() throws Exception {
		setFixture(_2010Factory.eINSTANCE.createDisconnectType());
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

} //DisconnectTypeTest
