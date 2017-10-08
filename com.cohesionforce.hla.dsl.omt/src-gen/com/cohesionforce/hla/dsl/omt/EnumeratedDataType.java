/**
 * generated by Xtext 2.12.0
 */
package com.cohesionforce.hla.dsl.omt;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enumerated Data Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.cohesionforce.hla.dsl.omt.EnumeratedDataType#getName <em>Name</em>}</li>
 *   <li>{@link com.cohesionforce.hla.dsl.omt.EnumeratedDataType#getNote <em>Note</em>}</li>
 *   <li>{@link com.cohesionforce.hla.dsl.omt.EnumeratedDataType#getIsMOMEnumeratedDataType <em>Is MOM Enumerated Data Type</em>}</li>
 *   <li>{@link com.cohesionforce.hla.dsl.omt.EnumeratedDataType#getLiterals <em>Literals</em>}</li>
 * </ul>
 *
 * @see com.cohesionforce.hla.dsl.omt.OmtPackage#getEnumeratedDataType()
 * @model
 * @generated
 */
public interface EnumeratedDataType extends OMTComponent, TypeReference
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see com.cohesionforce.hla.dsl.omt.OmtPackage#getEnumeratedDataType_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link com.cohesionforce.hla.dsl.omt.EnumeratedDataType#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Note</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Note</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Note</em>' containment reference.
   * @see #setNote(NoteRef)
   * @see com.cohesionforce.hla.dsl.omt.OmtPackage#getEnumeratedDataType_Note()
   * @model containment="true"
   * @generated
   */
  NoteRef getNote();

  /**
   * Sets the value of the '{@link com.cohesionforce.hla.dsl.omt.EnumeratedDataType#getNote <em>Note</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Note</em>' containment reference.
   * @see #getNote()
   * @generated
   */
  void setNote(NoteRef value);

  /**
   * Returns the value of the '<em><b>Is MOM Enumerated Data Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Is MOM Enumerated Data Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Is MOM Enumerated Data Type</em>' attribute.
   * @see #setIsMOMEnumeratedDataType(String)
   * @see com.cohesionforce.hla.dsl.omt.OmtPackage#getEnumeratedDataType_IsMOMEnumeratedDataType()
   * @model
   * @generated
   */
  String getIsMOMEnumeratedDataType();

  /**
   * Sets the value of the '{@link com.cohesionforce.hla.dsl.omt.EnumeratedDataType#getIsMOMEnumeratedDataType <em>Is MOM Enumerated Data Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Is MOM Enumerated Data Type</em>' attribute.
   * @see #getIsMOMEnumeratedDataType()
   * @generated
   */
  void setIsMOMEnumeratedDataType(String value);

  /**
   * Returns the value of the '<em><b>Literals</b></em>' containment reference list.
   * The list contents are of type {@link com.cohesionforce.hla.dsl.omt.Enumeration}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Literals</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Literals</em>' containment reference list.
   * @see com.cohesionforce.hla.dsl.omt.OmtPackage#getEnumeratedDataType_Literals()
   * @model containment="true"
   * @generated
   */
  EList<Enumeration> getLiterals();

} // EnumeratedDataType
