/**
 * generated by Xtext 2.12.0
 */
package com.cohesionforce.hla.dsl.omt;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>HLAOMT DIF v1 3</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.cohesionforce.hla.dsl.omt.HLAOMT_DIF_v1_3#getName <em>Name</em>}</li>
 *   <li>{@link com.cohesionforce.hla.dsl.omt.HLAOMT_DIF_v1_3#getVersion <em>Version</em>}</li>
 *   <li>{@link com.cohesionforce.hla.dsl.omt.HLAOMT_DIF_v1_3#getType <em>Type</em>}</li>
 *   <li>{@link com.cohesionforce.hla.dsl.omt.HLAOMT_DIF_v1_3#getObjectModels <em>Object Models</em>}</li>
 * </ul>
 *
 * @see com.cohesionforce.hla.dsl.omt.OmtPackage#getHLAOMT_DIF_v1_3()
 * @model
 * @generated
 */
public interface HLAOMT_DIF_v1_3 extends EObject
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
   * @see com.cohesionforce.hla.dsl.omt.OmtPackage#getHLAOMT_DIF_v1_3_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link com.cohesionforce.hla.dsl.omt.HLAOMT_DIF_v1_3#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Version</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Version</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Version</em>' attribute.
   * @see #setVersion(String)
   * @see com.cohesionforce.hla.dsl.omt.OmtPackage#getHLAOMT_DIF_v1_3_Version()
   * @model
   * @generated
   */
  String getVersion();

  /**
   * Sets the value of the '{@link com.cohesionforce.hla.dsl.omt.HLAOMT_DIF_v1_3#getVersion <em>Version</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Version</em>' attribute.
   * @see #getVersion()
   * @generated
   */
  void setVersion(String value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see #setType(String)
   * @see com.cohesionforce.hla.dsl.omt.OmtPackage#getHLAOMT_DIF_v1_3_Type()
   * @model
   * @generated
   */
  String getType();

  /**
   * Sets the value of the '{@link com.cohesionforce.hla.dsl.omt.HLAOMT_DIF_v1_3#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see #getType()
   * @generated
   */
  void setType(String value);

  /**
   * Returns the value of the '<em><b>Object Models</b></em>' containment reference list.
   * The list contents are of type {@link com.cohesionforce.hla.dsl.omt.ObjectModel}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Object Models</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Object Models</em>' containment reference list.
   * @see com.cohesionforce.hla.dsl.omt.OmtPackage#getHLAOMT_DIF_v1_3_ObjectModels()
   * @model containment="true"
   * @generated
   */
  EList<ObjectModel> getObjectModels();

} // HLAOMT_DIF_v1_3
