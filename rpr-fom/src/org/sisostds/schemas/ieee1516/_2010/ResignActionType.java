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
 * A representation of the literals of the enumeration '<em><b>Resign Action Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.sisostds.schemas.ieee1516._2010._2010Package#getResignActionType()
 * @model extendedMetaData="name='resignActionType'"
 * @generated
 */
public final class ResignActionType extends AbstractEnumerator {
	/**
	 * The '<em><b>Unconditionally Divest Attributes</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Unconditionally Divest Attributes</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UNCONDITIONALLY_DIVEST_ATTRIBUTES_LITERAL
	 * @model name="UnconditionallyDivestAttributes"
	 * @generated
	 * @ordered
	 */
	public static final int UNCONDITIONALLY_DIVEST_ATTRIBUTES = 0;

	/**
	 * The '<em><b>Delete Objects</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Delete Objects</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DELETE_OBJECTS_LITERAL
	 * @model name="DeleteObjects"
	 * @generated
	 * @ordered
	 */
	public static final int DELETE_OBJECTS = 1;

	/**
	 * The '<em><b>Cancel Pending Ownership Acquisitions</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Cancel Pending Ownership Acquisitions</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CANCEL_PENDING_OWNERSHIP_ACQUISITIONS_LITERAL
	 * @model name="CancelPendingOwnershipAcquisitions"
	 * @generated
	 * @ordered
	 */
	public static final int CANCEL_PENDING_OWNERSHIP_ACQUISITIONS = 2;

	/**
	 * The '<em><b>Delete Objects Then Divest</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Delete Objects Then Divest</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DELETE_OBJECTS_THEN_DIVEST_LITERAL
	 * @model name="DeleteObjectsThenDivest"
	 * @generated
	 * @ordered
	 */
	public static final int DELETE_OBJECTS_THEN_DIVEST = 3;

	/**
	 * The '<em><b>Cancel Then Delete Then Divest</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Cancel Then Delete Then Divest</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CANCEL_THEN_DELETE_THEN_DIVEST_LITERAL
	 * @model name="CancelThenDeleteThenDivest"
	 * @generated
	 * @ordered
	 */
	public static final int CANCEL_THEN_DELETE_THEN_DIVEST = 4;

	/**
	 * The '<em><b>No Action</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>No Action</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NO_ACTION_LITERAL
	 * @model name="NoAction"
	 * @generated
	 * @ordered
	 */
	public static final int NO_ACTION = 5;

	/**
	 * The '<em><b>Unconditionally Divest Attributes</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNCONDITIONALLY_DIVEST_ATTRIBUTES
	 * @generated
	 * @ordered
	 */
	public static final ResignActionType UNCONDITIONALLY_DIVEST_ATTRIBUTES_LITERAL = new ResignActionType(UNCONDITIONALLY_DIVEST_ATTRIBUTES, "UnconditionallyDivestAttributes", "UnconditionallyDivestAttributes");

	/**
	 * The '<em><b>Delete Objects</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DELETE_OBJECTS
	 * @generated
	 * @ordered
	 */
	public static final ResignActionType DELETE_OBJECTS_LITERAL = new ResignActionType(DELETE_OBJECTS, "DeleteObjects", "DeleteObjects");

	/**
	 * The '<em><b>Cancel Pending Ownership Acquisitions</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CANCEL_PENDING_OWNERSHIP_ACQUISITIONS
	 * @generated
	 * @ordered
	 */
	public static final ResignActionType CANCEL_PENDING_OWNERSHIP_ACQUISITIONS_LITERAL = new ResignActionType(CANCEL_PENDING_OWNERSHIP_ACQUISITIONS, "CancelPendingOwnershipAcquisitions", "CancelPendingOwnershipAcquisitions");

	/**
	 * The '<em><b>Delete Objects Then Divest</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DELETE_OBJECTS_THEN_DIVEST
	 * @generated
	 * @ordered
	 */
	public static final ResignActionType DELETE_OBJECTS_THEN_DIVEST_LITERAL = new ResignActionType(DELETE_OBJECTS_THEN_DIVEST, "DeleteObjectsThenDivest", "DeleteObjectsThenDivest");

	/**
	 * The '<em><b>Cancel Then Delete Then Divest</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CANCEL_THEN_DELETE_THEN_DIVEST
	 * @generated
	 * @ordered
	 */
	public static final ResignActionType CANCEL_THEN_DELETE_THEN_DIVEST_LITERAL = new ResignActionType(CANCEL_THEN_DELETE_THEN_DIVEST, "CancelThenDeleteThenDivest", "CancelThenDeleteThenDivest");

	/**
	 * The '<em><b>No Action</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NO_ACTION
	 * @generated
	 * @ordered
	 */
	public static final ResignActionType NO_ACTION_LITERAL = new ResignActionType(NO_ACTION, "NoAction", "NoAction");

	/**
	 * An array of all the '<em><b>Resign Action Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ResignActionType[] VALUES_ARRAY =
		new ResignActionType[] {
			UNCONDITIONALLY_DIVEST_ATTRIBUTES_LITERAL,
			DELETE_OBJECTS_LITERAL,
			CANCEL_PENDING_OWNERSHIP_ACQUISITIONS_LITERAL,
			DELETE_OBJECTS_THEN_DIVEST_LITERAL,
			CANCEL_THEN_DELETE_THEN_DIVEST_LITERAL,
			NO_ACTION_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Resign Action Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Resign Action Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ResignActionType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ResignActionType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Resign Action Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ResignActionType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ResignActionType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Resign Action Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ResignActionType get(int value) {
		switch (value) {
			case UNCONDITIONALLY_DIVEST_ATTRIBUTES: return UNCONDITIONALLY_DIVEST_ATTRIBUTES_LITERAL;
			case DELETE_OBJECTS: return DELETE_OBJECTS_LITERAL;
			case CANCEL_PENDING_OWNERSHIP_ACQUISITIONS: return CANCEL_PENDING_OWNERSHIP_ACQUISITIONS_LITERAL;
			case DELETE_OBJECTS_THEN_DIVEST: return DELETE_OBJECTS_THEN_DIVEST_LITERAL;
			case CANCEL_THEN_DELETE_THEN_DIVEST: return CANCEL_THEN_DELETE_THEN_DIVEST_LITERAL;
			case NO_ACTION: return NO_ACTION_LITERAL;
		}
		return null;
	}

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private ResignActionType(int value, String name, String literal) {
		super(value, name, literal);
	}

} //ResignActionType
