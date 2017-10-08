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
 * A representation of the literals of the enumeration '<em><b>Sharing Enumerations</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.sisostds.schemas.ieee1516._2010._2010Package#getSharingEnumerations()
 * @model extendedMetaData="name='sharingEnumerations'"
 * @generated
 */
public final class SharingEnumerations extends AbstractEnumerator {
	/**
	 * The '<em><b>Publish</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Publish</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PUBLISH_LITERAL
	 * @model name="Publish"
	 * @generated
	 * @ordered
	 */
	public static final int PUBLISH = 0;

	/**
	 * The '<em><b>Subscribe</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Subscribe</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SUBSCRIBE_LITERAL
	 * @model name="Subscribe"
	 * @generated
	 * @ordered
	 */
	public static final int SUBSCRIBE = 1;

	/**
	 * The '<em><b>Publish Subscribe</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Publish Subscribe</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PUBLISH_SUBSCRIBE_LITERAL
	 * @model name="PublishSubscribe"
	 * @generated
	 * @ordered
	 */
	public static final int PUBLISH_SUBSCRIBE = 2;

	/**
	 * The '<em><b>Neither</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Neither</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NEITHER_LITERAL
	 * @model name="Neither"
	 * @generated
	 * @ordered
	 */
	public static final int NEITHER = 3;

	/**
	 * The '<em><b>Publish</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PUBLISH
	 * @generated
	 * @ordered
	 */
	public static final SharingEnumerations PUBLISH_LITERAL = new SharingEnumerations(PUBLISH, "Publish", "Publish");

	/**
	 * The '<em><b>Subscribe</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUBSCRIBE
	 * @generated
	 * @ordered
	 */
	public static final SharingEnumerations SUBSCRIBE_LITERAL = new SharingEnumerations(SUBSCRIBE, "Subscribe", "Subscribe");

	/**
	 * The '<em><b>Publish Subscribe</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PUBLISH_SUBSCRIBE
	 * @generated
	 * @ordered
	 */
	public static final SharingEnumerations PUBLISH_SUBSCRIBE_LITERAL = new SharingEnumerations(PUBLISH_SUBSCRIBE, "PublishSubscribe", "PublishSubscribe");

	/**
	 * The '<em><b>Neither</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NEITHER
	 * @generated
	 * @ordered
	 */
	public static final SharingEnumerations NEITHER_LITERAL = new SharingEnumerations(NEITHER, "Neither", "Neither");

	/**
	 * An array of all the '<em><b>Sharing Enumerations</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final SharingEnumerations[] VALUES_ARRAY =
		new SharingEnumerations[] {
			PUBLISH_LITERAL,
			SUBSCRIBE_LITERAL,
			PUBLISH_SUBSCRIBE_LITERAL,
			NEITHER_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Sharing Enumerations</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Sharing Enumerations</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SharingEnumerations get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SharingEnumerations result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Sharing Enumerations</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SharingEnumerations getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SharingEnumerations result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Sharing Enumerations</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SharingEnumerations get(int value) {
		switch (value) {
			case PUBLISH: return PUBLISH_LITERAL;
			case SUBSCRIBE: return SUBSCRIBE_LITERAL;
			case PUBLISH_SUBSCRIBE: return PUBLISH_SUBSCRIBE_LITERAL;
			case NEITHER: return NEITHER_LITERAL;
		}
		return null;
	}

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private SharingEnumerations(int value, String name, String literal) {
		super(value, name, literal);
	}

} //SharingEnumerations
