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
 * A representation of the literals of the enumeration '<em><b>Order Enumerations</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * 
 * <!-- end-model-doc -->
 * @see org.sisostds.schemas.ieee1516._2010._2010Package#getOrderEnumerations()
 * @model extendedMetaData="name='orderEnumerations'"
 * @generated
 */
public final class OrderEnumerations extends AbstractEnumerator {
	/**
	 * The '<em><b>Receive</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Receive</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RECEIVE_LITERAL
	 * @model name="Receive"
	 * @generated
	 * @ordered
	 */
	public static final int RECEIVE = 0;

	/**
	 * The '<em><b>Time Stamp</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Time Stamp</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TIME_STAMP_LITERAL
	 * @model name="TimeStamp"
	 * @generated
	 * @ordered
	 */
	public static final int TIME_STAMP = 1;

	/**
	 * The '<em><b>Receive</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RECEIVE
	 * @generated
	 * @ordered
	 */
	public static final OrderEnumerations RECEIVE_LITERAL = new OrderEnumerations(RECEIVE, "Receive", "Receive");

	/**
	 * The '<em><b>Time Stamp</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TIME_STAMP
	 * @generated
	 * @ordered
	 */
	public static final OrderEnumerations TIME_STAMP_LITERAL = new OrderEnumerations(TIME_STAMP, "TimeStamp", "TimeStamp");

	/**
	 * An array of all the '<em><b>Order Enumerations</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final OrderEnumerations[] VALUES_ARRAY =
		new OrderEnumerations[] {
			RECEIVE_LITERAL,
			TIME_STAMP_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Order Enumerations</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Order Enumerations</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static OrderEnumerations get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			OrderEnumerations result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Order Enumerations</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static OrderEnumerations getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			OrderEnumerations result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Order Enumerations</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static OrderEnumerations get(int value) {
		switch (value) {
			case RECEIVE: return RECEIVE_LITERAL;
			case TIME_STAMP: return TIME_STAMP_LITERAL;
		}
		return null;
	}

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private OrderEnumerations(int value, String name, String literal) {
		super(value, name, literal);
	}

} //OrderEnumerations
