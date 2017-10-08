/**
 * generated by Xtext 2.12.0
 */
package com.cohesionforce.hla.dsl.omt;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dimension Range</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.cohesionforce.hla.dsl.omt.DimensionRange#getMinimum <em>Minimum</em>}</li>
 *   <li>{@link com.cohesionforce.hla.dsl.omt.DimensionRange#getMaximum <em>Maximum</em>}</li>
 * </ul>
 *
 * @see com.cohesionforce.hla.dsl.omt.OmtPackage#getDimensionRange()
 * @model
 * @generated
 */
public interface DimensionRange extends DimensionDomain
{
  /**
   * Returns the value of the '<em><b>Minimum</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Minimum</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Minimum</em>' attribute.
   * @see #setMinimum(String)
   * @see com.cohesionforce.hla.dsl.omt.OmtPackage#getDimensionRange_Minimum()
   * @model
   * @generated
   */
  String getMinimum();

  /**
   * Sets the value of the '{@link com.cohesionforce.hla.dsl.omt.DimensionRange#getMinimum <em>Minimum</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Minimum</em>' attribute.
   * @see #getMinimum()
   * @generated
   */
  void setMinimum(String value);

  /**
   * Returns the value of the '<em><b>Maximum</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Maximum</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Maximum</em>' attribute.
   * @see #setMaximum(String)
   * @see com.cohesionforce.hla.dsl.omt.OmtPackage#getDimensionRange_Maximum()
   * @model
   * @generated
   */
  String getMaximum();

  /**
   * Sets the value of the '{@link com.cohesionforce.hla.dsl.omt.DimensionRange#getMaximum <em>Maximum</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Maximum</em>' attribute.
   * @see #getMaximum()
   * @generated
   */
  void setMaximum(String value);

} // DimensionRange
