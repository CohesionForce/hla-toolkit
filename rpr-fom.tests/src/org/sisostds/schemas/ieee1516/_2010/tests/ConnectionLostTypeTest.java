/**
 */
package org.sisostds.schemas.ieee1516._2010.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import org.sisostds.schemas.ieee1516._2010.ConnectionLostType;
import org.sisostds.schemas.ieee1516._2010._2010Factory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Connection Lost Type</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ConnectionLostTypeTest extends TestCase {

	/**
	 * The fixture for this Connection Lost Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnectionLostType fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ConnectionLostTypeTest.class);
	}

	/**
	 * Constructs a new Connection Lost Type test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectionLostTypeTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Connection Lost Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(ConnectionLostType fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Connection Lost Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private ConnectionLostType getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	protected void setUp() throws Exception {
		setFixture(_2010Factory.eINSTANCE.createConnectionLostType());
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

} //ConnectionLostTypeTest
