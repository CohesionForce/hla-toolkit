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
 * A representation of the literals of the enumeration '<em><b>Update Enumerations</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.sisostds.schemas.ieee1516._2010._2010Package#getUpdateEnumerations()
 * @model extendedMetaData="name='updateEnumerations'"
 * @generated
 */
public final class UpdateEnumerations extends AbstractEnumerator {
	/**
	 * The '<em><b>Static</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Static</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #STATIC_LITERAL
	 * @model name="Static"
	 * @generated
	 * @ordered
	 */
	public static final int STATIC = 0;

	/**
	 * The '<em><b>Periodic</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Periodic</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PERIODIC_LITERAL
	 * @model name="Periodic"
	 * @generated
	 * @ordered
	 */
	public static final int PERIODIC = 1;

	/**
	 * The '<em><b>Conditional</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Conditional</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONDITIONAL_LITERAL
	 * @model name="Conditional"
	 * @generated
	 * @ordered
	 */
	public static final int CONDITIONAL = 2;

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
	public static final int NA = 3;

	/**
	 * The '<em><b>Static</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STATIC
	 * @generated
	 * @ordered
	 */
	public static final UpdateEnumerations STATIC_LITERAL = new UpdateEnumerations(STATIC, "Static", "Static");

	/**
	 * The '<em><b>Periodic</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PERIODIC
	 * @generated
	 * @ordered
	 */
	public static final UpdateEnumerations PERIODIC_LITERAL = new UpdateEnumerations(PERIODIC, "Periodic", "Periodic");

	/**
	 * The '<em><b>Conditional</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONDITIONAL
	 * @generated
	 * @ordered
	 */
	public static final UpdateEnumerations CONDITIONAL_LITERAL = new UpdateEnumerations(CONDITIONAL, "Conditional", "Conditional");

	/**
	 * The '<em><b>NA</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NA
	 * @generated
	 * @ordered
	 */
	public static final UpdateEnumerations NA_LITERAL = new UpdateEnumerations(NA, "NA", "NA");

	/**
	 * An array of all the '<em><b>Update Enumerations</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final UpdateEnumerations[] VALUES_ARRAY =
		new UpdateEnumerations[] {
			STATIC_LITERAL,
			PERIODIC_LITERAL,
			CONDITIONAL_LITERAL,
			NA_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Update Enumerations</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Update Enumerations</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static UpdateEnumerations get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			UpdateEnumerations result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Update Enumerations</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static UpdateEnumerations getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			UpdateEnumerations result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Update Enumerations</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static UpdateEnumerations get(int value) {
		switch (value) {
			case STATIC: return STATIC_LITERAL;
			case PERIODIC: return PERIODIC_LITERAL;
			case CONDITIONAL: return CONDITIONAL_LITERAL;
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
	private UpdateEnumerations(int value, String name, String literal) {
		super(value, name, literal);
	}

} //UpdateEnumerations
