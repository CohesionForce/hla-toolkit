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
 * A representation of the literals of the enumeration '<em><b>OM Type Enumerations</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.sisostds.schemas.ieee1516._2010._2010Package#getOMTypeEnumerations()
 * @model extendedMetaData="name='OMTypeEnumerations'"
 * @generated
 */
public final class OMTypeEnumerations extends AbstractEnumerator {
	/**
	 * The '<em><b>FOM</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>FOM</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FOM_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FOM = 0;

	/**
	 * The '<em><b>SOM</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SOM</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SOM_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SOM = 1;

	/**
	 * The '<em><b>FOM</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FOM
	 * @generated
	 * @ordered
	 */
	public static final OMTypeEnumerations FOM_LITERAL = new OMTypeEnumerations(FOM, "FOM", "FOM");

	/**
	 * The '<em><b>SOM</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SOM
	 * @generated
	 * @ordered
	 */
	public static final OMTypeEnumerations SOM_LITERAL = new OMTypeEnumerations(SOM, "SOM", "SOM");

	/**
	 * An array of all the '<em><b>OM Type Enumerations</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final OMTypeEnumerations[] VALUES_ARRAY =
		new OMTypeEnumerations[] {
			FOM_LITERAL,
			SOM_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>OM Type Enumerations</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>OM Type Enumerations</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static OMTypeEnumerations get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			OMTypeEnumerations result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>OM Type Enumerations</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static OMTypeEnumerations getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			OMTypeEnumerations result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>OM Type Enumerations</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static OMTypeEnumerations get(int value) {
		switch (value) {
			case FOM: return FOM_LITERAL;
			case SOM: return SOM_LITERAL;
		}
		return null;
	}

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private OMTypeEnumerations(int value, String name, String literal) {
		super(value, name, literal);
	}

} //OMTypeEnumerations
