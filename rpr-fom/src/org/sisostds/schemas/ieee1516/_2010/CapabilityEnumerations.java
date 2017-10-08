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
 * A representation of the literals of the enumeration '<em><b>Capability Enumerations</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.sisostds.schemas.ieee1516._2010._2010Package#getCapabilityEnumerations()
 * @model extendedMetaData="name='capabilityEnumerations'"
 * @generated
 */
public final class CapabilityEnumerations extends AbstractEnumerator {
	/**
	 * The '<em><b>Register</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Register</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #REGISTER_LITERAL
	 * @model name="Register"
	 * @generated
	 * @ordered
	 */
	public static final int REGISTER = 0;

	/**
	 * The '<em><b>Achieve</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Achieve</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ACHIEVE_LITERAL
	 * @model name="Achieve"
	 * @generated
	 * @ordered
	 */
	public static final int ACHIEVE = 1;

	/**
	 * The '<em><b>Register Achieve</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Register Achieve</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #REGISTER_ACHIEVE_LITERAL
	 * @model name="RegisterAchieve"
	 * @generated
	 * @ordered
	 */
	public static final int REGISTER_ACHIEVE = 2;

	/**
	 * The '<em><b>No Synch</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>No Synch</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NO_SYNCH_LITERAL
	 * @model name="NoSynch"
	 * @generated
	 * @ordered
	 */
	public static final int NO_SYNCH = 3;

	/**
	 * The '<em><b>NA</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NA</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NA_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NA = 4;

	/**
	 * The '<em><b>Register</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REGISTER
	 * @generated
	 * @ordered
	 */
	public static final CapabilityEnumerations REGISTER_LITERAL = new CapabilityEnumerations(REGISTER, "Register", "Register");

	/**
	 * The '<em><b>Achieve</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACHIEVE
	 * @generated
	 * @ordered
	 */
	public static final CapabilityEnumerations ACHIEVE_LITERAL = new CapabilityEnumerations(ACHIEVE, "Achieve", "Achieve");

	/**
	 * The '<em><b>Register Achieve</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REGISTER_ACHIEVE
	 * @generated
	 * @ordered
	 */
	public static final CapabilityEnumerations REGISTER_ACHIEVE_LITERAL = new CapabilityEnumerations(REGISTER_ACHIEVE, "RegisterAchieve", "RegisterAchieve");

	/**
	 * The '<em><b>No Synch</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NO_SYNCH
	 * @generated
	 * @ordered
	 */
	public static final CapabilityEnumerations NO_SYNCH_LITERAL = new CapabilityEnumerations(NO_SYNCH, "NoSynch", "NoSynch");

	/**
	 * The '<em><b>NA</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NA
	 * @generated
	 * @ordered
	 */
	public static final CapabilityEnumerations NA_LITERAL = new CapabilityEnumerations(NA, "NA", "NA");

	/**
	 * An array of all the '<em><b>Capability Enumerations</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final CapabilityEnumerations[] VALUES_ARRAY =
		new CapabilityEnumerations[] {
			REGISTER_LITERAL,
			ACHIEVE_LITERAL,
			REGISTER_ACHIEVE_LITERAL,
			NO_SYNCH_LITERAL,
			NA_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Capability Enumerations</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Capability Enumerations</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CapabilityEnumerations get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CapabilityEnumerations result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Capability Enumerations</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CapabilityEnumerations getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CapabilityEnumerations result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Capability Enumerations</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CapabilityEnumerations get(int value) {
		switch (value) {
			case REGISTER: return REGISTER_LITERAL;
			case ACHIEVE: return ACHIEVE_LITERAL;
			case REGISTER_ACHIEVE: return REGISTER_ACHIEVE_LITERAL;
			case NO_SYNCH: return NO_SYNCH_LITERAL;
			case NA: return NA_LITERAL;
		}
		return null;
	}

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private CapabilityEnumerations(int value, String name, String literal) {
		super(value, name, literal);
	}

} //CapabilityEnumerations
