/**
 */
package org.sisostds.schemas.ieee1516._2010.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import org.sisostds.schemas.ieee1516._2010.SendInteractionType;
import org.sisostds.schemas.ieee1516._2010._2010Factory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Send Interaction Type</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SendInteractionTypeTest extends TestCase {

	/**
	 * The fixture for this Send Interaction Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SendInteractionType fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SendInteractionTypeTest.class);
	}

	/**
	 * Constructs a new Send Interaction Type test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SendInteractionTypeTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Send Interaction Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(SendInteractionType fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Send Interaction Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private SendInteractionType getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	protected void setUp() throws Exception {
		setFixture(_2010Factory.eINSTANCE.createSendInteractionType());
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

} //SendInteractionTypeTest
