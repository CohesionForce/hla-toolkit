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
 * A representation of the literals of the enumeration '<em><b>Endian Enumerations</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.sisostds.schemas.ieee1516._2010._2010Package#getEndianEnumerations()
 * @model extendedMetaData="name='endianEnumerations'"
 * @generated
 */
public final class EndianEnumerations extends AbstractEnumerator {
	/**
	 * The '<em><b>Big</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Big</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BIG_LITERAL
	 * @model name="Big"
	 * @generated
	 * @ordered
	 */
	public static final int BIG = 0;

	/**
	 * The '<em><b>Little</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Little</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LITTLE_LITERAL
	 * @model name="Little"
	 * @generated
	 * @ordered
	 */
	public static final int LITTLE = 1;

	/**
	 * The '<em><b>Big</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BIG
	 * @generated
	 * @ordered
	 */
	public static final EndianEnumerations BIG_LITERAL = new EndianEnumerations(BIG, "Big", "Big");

	/**
	 * The '<em><b>Little</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LITTLE
	 * @generated
	 * @ordered
	 */
	public static final EndianEnumerations LITTLE_LITERAL = new EndianEnumerations(LITTLE, "Little", "Little");

	/**
	 * An array of all the '<em><b>Endian Enumerations</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final EndianEnumerations[] VALUES_ARRAY =
		new EndianEnumerations[] {
			BIG_LITERAL,
			LITTLE_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Endian Enumerations</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Endian Enumerations</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EndianEnumerations get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EndianEnumerations result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Endian Enumerations</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EndianEnumerations getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EndianEnumerations result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Endian Enumerations</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EndianEnumerations get(int value) {
		switch (value) {
			case BIG: return BIG_LITERAL;
			case LITTLE: return LITTLE_LITERAL;
		}
		return null;
	}

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EndianEnumerations(int value, String name, String literal) {
		super(value, name, literal);
	}

} //EndianEnumerations
