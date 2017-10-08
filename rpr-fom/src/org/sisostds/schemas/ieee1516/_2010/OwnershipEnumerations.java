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
 * A representation of the literals of the enumeration '<em><b>Ownership Enumerations</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * 
 * <!-- end-model-doc -->
 * @see org.sisostds.schemas.ieee1516._2010._2010Package#getOwnershipEnumerations()
 * @model extendedMetaData="name='ownershipEnumerations'"
 * @generated
 */
public final class OwnershipEnumerations extends AbstractEnumerator {
	/**
	 * The '<em><b>Divest</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Divest</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DIVEST_LITERAL
	 * @model name="Divest"
	 * @generated
	 * @ordered
	 */
	public static final int DIVEST = 0;

	/**
	 * The '<em><b>Acquire</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Acquire</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ACQUIRE_LITERAL
	 * @model name="Acquire"
	 * @generated
	 * @ordered
	 */
	public static final int ACQUIRE = 1;

	/**
	 * The '<em><b>Divest Acquire</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Divest Acquire</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DIVEST_ACQUIRE_LITERAL
	 * @model name="DivestAcquire"
	 * @generated
	 * @ordered
	 */
	public static final int DIVEST_ACQUIRE = 2;

	/**
	 * The '<em><b>No Transfer</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>No Transfer</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NO_TRANSFER_LITERAL
	 * @model name="NoTransfer"
	 * @generated
	 * @ordered
	 */
	public static final int NO_TRANSFER = 3;

	/**
	 * The '<em><b>Divest</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DIVEST
	 * @generated
	 * @ordered
	 */
	public static final OwnershipEnumerations DIVEST_LITERAL = new OwnershipEnumerations(DIVEST, "Divest", "Divest");

	/**
	 * The '<em><b>Acquire</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACQUIRE
	 * @generated
	 * @ordered
	 */
	public static final OwnershipEnumerations ACQUIRE_LITERAL = new OwnershipEnumerations(ACQUIRE, "Acquire", "Acquire");

	/**
	 * The '<em><b>Divest Acquire</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DIVEST_ACQUIRE
	 * @generated
	 * @ordered
	 */
	public static final OwnershipEnumerations DIVEST_ACQUIRE_LITERAL = new OwnershipEnumerations(DIVEST_ACQUIRE, "DivestAcquire", "DivestAcquire");

	/**
	 * The '<em><b>No Transfer</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NO_TRANSFER
	 * @generated
	 * @ordered
	 */
	public static final OwnershipEnumerations NO_TRANSFER_LITERAL = new OwnershipEnumerations(NO_TRANSFER, "NoTransfer", "NoTransfer");

	/**
	 * An array of all the '<em><b>Ownership Enumerations</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final OwnershipEnumerations[] VALUES_ARRAY =
		new OwnershipEnumerations[] {
			DIVEST_LITERAL,
			ACQUIRE_LITERAL,
			DIVEST_ACQUIRE_LITERAL,
			NO_TRANSFER_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Ownership Enumerations</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Ownership Enumerations</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static OwnershipEnumerations get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			OwnershipEnumerations result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Ownership Enumerations</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static OwnershipEnumerations getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			OwnershipEnumerations result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Ownership Enumerations</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static OwnershipEnumerations get(int value) {
		switch (value) {
			case DIVEST: return DIVEST_LITERAL;
			case ACQUIRE: return ACQUIRE_LITERAL;
			case DIVEST_ACQUIRE: return DIVEST_ACQUIRE_LITERAL;
			case NO_TRANSFER: return NO_TRANSFER_LITERAL;
		}
		return null;
	}

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private OwnershipEnumerations(int value, String name, String literal) {
		super(value, name, literal);
	}

} //OwnershipEnumerations
