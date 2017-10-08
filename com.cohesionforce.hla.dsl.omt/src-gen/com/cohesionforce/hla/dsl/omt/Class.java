/**
 * generated by Xtext 2.12.0
 */
package com.cohesionforce.hla.dsl.omt;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.cohesionforce.hla.dsl.omt.Class#getId <em>Id</em>}</li>
 *   <li>{@link com.cohesionforce.hla.dsl.omt.Class#getName <em>Name</em>}</li>
 *   <li>{@link com.cohesionforce.hla.dsl.omt.Class#getNote <em>Note</em>}</li>
 *   <li>{@link com.cohesionforce.hla.dsl.omt.Class#getIsMOMClass <em>Is MOM Class</em>}</li>
 *   <li>{@link com.cohesionforce.hla.dsl.omt.Class#getDescription <em>Description</em>}</li>
 *   <li>{@link com.cohesionforce.hla.dsl.omt.Class#getComponents <em>Components</em>}</li>
 * </ul>
 *
 * @see com.cohesionforce.hla.dsl.omt.OmtPackage#getClass_()
 * @model
 * @generated
 */
public interface Class extends OMTComponent
{
  /**
   * Returns the value of the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Id</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Id</em>' attribute.
   * @see #setId(int)
   * @see com.cohesionforce.hla.dsl.omt.OmtPackage#getClass_Id()
   * @model
   * @generated
   */
  int getId();

  /**
   * Sets the value of the '{@link com.cohesionforce.hla.dsl.omt.Class#getId <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Id</em>' attribute.
   * @see #getId()
   * @generated
   */
  void setId(int value);

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
   * @see com.cohesionforce.hla.dsl.omt.OmtPackage#getClass_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link com.cohesionforce.hla.dsl.omt.Class#getName <em>Name</em>}' attribute.
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
   * @see com.cohesionforce.hla.dsl.omt.OmtPackage#getClass_Note()
   * @model containment="true"
   * @generated
   */
  NoteRef getNote();

  /**
   * Sets the value of the '{@link com.cohesionforce.hla.dsl.omt.Class#getNote <em>Note</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Note</em>' containment reference.
   * @see #getNote()
   * @generated
   */
  void setNote(NoteRef value);

  /**
   * Returns the value of the '<em><b>Is MOM Class</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Is MOM Class</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Is MOM Class</em>' attribute.
   * @see #setIsMOMClass(String)
   * @see com.cohesionforce.hla.dsl.omt.OmtPackage#getClass_IsMOMClass()
   * @model
   * @generated
   */
  String getIsMOMClass();

  /**
   * Sets the value of the '{@link com.cohesionforce.hla.dsl.omt.Class#getIsMOMClass <em>Is MOM Class</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Is MOM Class</em>' attribute.
   * @see #getIsMOMClass()
   * @generated
   */
  void setIsMOMClass(String value);

  /**
   * Returns the value of the '<em><b>Description</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Description</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Description</em>' containment reference.
   * @see #setDescription(Description)
   * @see com.cohesionforce.hla.dsl.omt.OmtPackage#getClass_Description()
   * @model containment="true"
   * @generated
   */
  Description getDescription();

  /**
   * Sets the value of the '{@link com.cohesionforce.hla.dsl.omt.Class#getDescription <em>Description</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Description</em>' containment reference.
   * @see #getDescription()
   * @generated
   */
  void setDescription(Description value);

  /**
   * Returns the value of the '<em><b>Components</b></em>' containment reference list.
   * The list contents are of type {@link com.cohesionforce.hla.dsl.omt.ClassComponent}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Components</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Components</em>' containment reference list.
   * @see com.cohesionforce.hla.dsl.omt.OmtPackage#getClass_Components()
   * @model containment="true"
   * @generated
   */
  EList<ClassComponent> getComponents();

} // Class
