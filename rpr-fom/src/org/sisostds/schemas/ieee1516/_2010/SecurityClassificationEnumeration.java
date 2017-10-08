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
 * A representation of the literals of the enumeration '<em><b>Security Classification Enumeration</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.sisostds.schemas.ieee1516._2010._2010Package#getSecurityClassificationEnumeration()
 * @model extendedMetaData="name='SecurityClassificationEnumeration'"
 * @generated
 */
public final class SecurityClassificationEnumeration extends AbstractEnumerator {
	/**
	 * The '<em><b>Unclassified</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Unclassified</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UNCLASSIFIED_LITERAL
	 * @model name="Unclassified"
	 * @generated
	 * @ordered
	 */
	public static final int UNCLASSIFIED = 0;

	/**
	 * The '<em><b>Confidential</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Confidential</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONFIDENTIAL_LITERAL
	 * @model name="Confidential"
	 * @generated
	 * @ordered
	 */
	public static final int CONFIDENTIAL = 1;

	/**
	 * The '<em><b>Secret</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Secret</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SECRET_LITERAL
	 * @model name="Secret"
	 * @generated
	 * @ordered
	 */
	public static final int SECRET = 2;

	/**
	 * The '<em><b>Top Secret</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Top Secret</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TOP_SECRET_LITERAL
	 * @model name="TopSecret" literal="Top Secret"
	 * @generated
	 * @ordered
	 */
	public static final int TOP_SECRET = 3;

	/**
	 * The '<em><b>Unclassified</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNCLASSIFIED
	 * @generated
	 * @ordered
	 */
	public static final SecurityClassificationEnumeration UNCLASSIFIED_LITERAL = new SecurityClassificationEnumeration(UNCLASSIFIED, "Unclassified", "Unclassified");

	/**
	 * The '<em><b>Confidential</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONFIDENTIAL
	 * @generated
	 * @ordered
	 */
	public static final SecurityClassificationEnumeration CONFIDENTIAL_LITERAL = new SecurityClassificationEnumeration(CONFIDENTIAL, "Confidential", "Confidential");

	/**
	 * The '<em><b>Secret</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SECRET
	 * @generated
	 * @ordered
	 */
	public static final SecurityClassificationEnumeration SECRET_LITERAL = new SecurityClassificationEnumeration(SECRET, "Secret", "Secret");

	/**
	 * The '<em><b>Top Secret</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TOP_SECRET
	 * @generated
	 * @ordered
	 */
	public static final SecurityClassificationEnumeration TOP_SECRET_LITERAL = new SecurityClassificationEnumeration(TOP_SECRET, "TopSecret", "Top Secret");

	/**
	 * An array of all the '<em><b>Security Classification Enumeration</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final SecurityClassificationEnumeration[] VALUES_ARRAY =
		new SecurityClassificationEnumeration[] {
			UNCLASSIFIED_LITERAL,
			CONFIDENTIAL_LITERAL,
			SECRET_LITERAL,
			TOP_SECRET_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Security Classification Enumeration</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Security Classification Enumeration</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SecurityClassificationEnumeration get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SecurityClassificationEnumeration result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Security Classification Enumeration</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SecurityClassificationEnumeration getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SecurityClassificationEnumeration result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Security Classification Enumeration</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SecurityClassificationEnumeration get(int value) {
		switch (value) {
			case UNCLASSIFIED: return UNCLASSIFIED_LITERAL;
			case CONFIDENTIAL: return CONFIDENTIAL_LITERAL;
			case SECRET: return SECRET_LITERAL;
			case TOP_SECRET: return TOP_SECRET_LITERAL;
		}
		return null;
	}

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private SecurityClassificationEnumeration(int value, String name, String literal) {
		super(value, name, literal);
	}

} //SecurityClassificationEnumeration
