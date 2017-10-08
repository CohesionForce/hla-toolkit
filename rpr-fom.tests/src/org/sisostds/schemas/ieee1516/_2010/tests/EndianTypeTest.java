/**
 */
package org.sisostds.schemas.ieee1516._2010.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import org.sisostds.schemas.ieee1516._2010.EndianType;
import org.sisostds.schemas.ieee1516._2010._2010Factory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Endian Type</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class EndianTypeTest extends TestCase {

	/**
	 * The fixture for this Endian Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EndianType fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(EndianTypeTest.class);
	}

	/**
	 * Constructs a new Endian Type test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EndianTypeTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Endian Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(EndianType fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Endian Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EndianType getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	protected void setUp() throws Exception {
		setFixture(_2010Factory.eINSTANCE.createEndianType());
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

} //EndianTypeTest
