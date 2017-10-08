/**
 * generated by Xtext 2.12.0
 */
package com.cohesionforce.hla.dsl.omt;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.cohesionforce.hla.dsl.omt.Attribute#getName <em>Name</em>}</li>
 *   <li>{@link com.cohesionforce.hla.dsl.omt.Attribute#getNameNote <em>Name Note</em>}</li>
 *   <li>{@link com.cohesionforce.hla.dsl.omt.Attribute#getDataType <em>Data Type</em>}</li>
 *   <li>{@link com.cohesionforce.hla.dsl.omt.Attribute#getCardinality <em>Cardinality</em>}</li>
 *   <li>{@link com.cohesionforce.hla.dsl.omt.Attribute#getUnits <em>Units</em>}</li>
 *   <li>{@link com.cohesionforce.hla.dsl.omt.Attribute#getResolution <em>Resolution</em>}</li>
 *   <li>{@link com.cohesionforce.hla.dsl.omt.Attribute#getAccuracy <em>Accuracy</em>}</li>
 *   <li>{@link com.cohesionforce.hla.dsl.omt.Attribute#getAccuracyCondition <em>Accuracy Condition</em>}</li>
 *   <li>{@link com.cohesionforce.hla.dsl.omt.Attribute#getUpdateType <em>Update Type</em>}</li>
 *   <li>{@link com.cohesionforce.hla.dsl.omt.Attribute#getUpdateTypeNote <em>Update Type Note</em>}</li>
 *   <li>{@link com.cohesionforce.hla.dsl.omt.Attribute#getUpdateCondition <em>Update Condition</em>}</li>
 *   <li>{@link com.cohesionforce.hla.dsl.omt.Attribute#getUpdateConditionNote <em>Update Condition Note</em>}</li>
 *   <li>{@link com.cohesionforce.hla.dsl.omt.Attribute#getTransferAccept <em>Transfer Accept</em>}</li>
 *   <li>{@link com.cohesionforce.hla.dsl.omt.Attribute#getTransferAcceptNote <em>Transfer Accept Note</em>}</li>
 *   <li>{@link com.cohesionforce.hla.dsl.omt.Attribute#getUpdateReflect <em>Update Reflect</em>}</li>
 *   <li>{@link com.cohesionforce.hla.dsl.omt.Attribute#getUpdateReflectNote <em>Update Reflect Note</em>}</li>
 *   <li>{@link com.cohesionforce.hla.dsl.omt.Attribute#getDescription <em>Description</em>}</li>
 *   <li>{@link com.cohesionforce.hla.dsl.omt.Attribute#getRoutingSpace <em>Routing Space</em>}</li>
 * </ul>
 *
 * @see com.cohesionforce.hla.dsl.omt.OmtPackage#getAttribute()
 * @model
 * @generated
 */
public interface Attribute extends ClassComponent
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
   * @see com.cohesionforce.hla.dsl.omt.OmtPackage#getAttribute_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link com.cohesionforce.hla.dsl.omt.Attribute#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Name Note</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name Note</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name Note</em>' containment reference.
   * @see #setNameNote(NoteRef)
   * @see com.cohesionforce.hla.dsl.omt.OmtPackage#getAttribute_NameNote()
   * @model containment="true"
   * @generated
   */
  NoteRef getNameNote();

  /**
   * Sets the value of the '{@link com.cohesionforce.hla.dsl.omt.Attribute#getNameNote <em>Name Note</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name Note</em>' containment reference.
   * @see #getNameNote()
   * @generated
   */
  void setNameNote(NoteRef value);

  /**
   * Returns the value of the '<em><b>Data Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Data Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Data Type</em>' containment reference.
   * @see #setDataType(DataType)
   * @see com.cohesionforce.hla.dsl.omt.OmtPackage#getAttribute_DataType()
   * @model containment="true"
   * @generated
   */
  DataType getDataType();

  /**
   * Sets the value of the '{@link com.cohesionforce.hla.dsl.omt.Attribute#getDataType <em>Data Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Data Type</em>' containment reference.
   * @see #getDataType()
   * @generated
   */
  void setDataType(DataType value);

  /**
   * Returns the value of the '<em><b>Cardinality</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Cardinality</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cardinality</em>' containment reference.
   * @see #setCardinality(Cardinality)
   * @see com.cohesionforce.hla.dsl.omt.OmtPackage#getAttribute_Cardinality()
   * @model containment="true"
   * @generated
   */
  Cardinality getCardinality();

  /**
   * Sets the value of the '{@link com.cohesionforce.hla.dsl.omt.Attribute#getCardinality <em>Cardinality</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Cardinality</em>' containment reference.
   * @see #getCardinality()
   * @generated
   */
  void setCardinality(Cardinality value);

  /**
   * Returns the value of the '<em><b>Units</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Units</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Units</em>' containment reference.
   * @see #setUnits(Units)
   * @see com.cohesionforce.hla.dsl.omt.OmtPackage#getAttribute_Units()
   * @model containment="true"
   * @generated
   */
  Units getUnits();

  /**
   * Sets the value of the '{@link com.cohesionforce.hla.dsl.omt.Attribute#getUnits <em>Units</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Units</em>' containment reference.
   * @see #getUnits()
   * @generated
   */
  void setUnits(Units value);

  /**
   * Returns the value of the '<em><b>Resolution</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Resolution</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Resolution</em>' containment reference.
   * @see #setResolution(Resolution)
   * @see com.cohesionforce.hla.dsl.omt.OmtPackage#getAttribute_Resolution()
   * @model containment="true"
   * @generated
   */
  Resolution getResolution();

  /**
   * Sets the value of the '{@link com.cohesionforce.hla.dsl.omt.Attribute#getResolution <em>Resolution</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Resolution</em>' containment reference.
   * @see #getResolution()
   * @generated
   */
  void setResolution(Resolution value);

  /**
   * Returns the value of the '<em><b>Accuracy</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Accuracy</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Accuracy</em>' containment reference.
   * @see #setAccuracy(Accuracy)
   * @see com.cohesionforce.hla.dsl.omt.OmtPackage#getAttribute_Accuracy()
   * @model containment="true"
   * @generated
   */
  Accuracy getAccuracy();

  /**
   * Sets the value of the '{@link com.cohesionforce.hla.dsl.omt.Attribute#getAccuracy <em>Accuracy</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Accuracy</em>' containment reference.
   * @see #getAccuracy()
   * @generated
   */
  void setAccuracy(Accuracy value);

  /**
   * Returns the value of the '<em><b>Accuracy Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Accuracy Condition</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Accuracy Condition</em>' containment reference.
   * @see #setAccuracyCondition(AccuracyCondition)
   * @see com.cohesionforce.hla.dsl.omt.OmtPackage#getAttribute_AccuracyCondition()
   * @model containment="true"
   * @generated
   */
  AccuracyCondition getAccuracyCondition();

  /**
   * Sets the value of the '{@link com.cohesionforce.hla.dsl.omt.Attribute#getAccuracyCondition <em>Accuracy Condition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Accuracy Condition</em>' containment reference.
   * @see #getAccuracyCondition()
   * @generated
   */
  void setAccuracyCondition(AccuracyCondition value);

  /**
   * Returns the value of the '<em><b>Update Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Update Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Update Type</em>' attribute.
   * @see #setUpdateType(String)
   * @see com.cohesionforce.hla.dsl.omt.OmtPackage#getAttribute_UpdateType()
   * @model
   * @generated
   */
  String getUpdateType();

  /**
   * Sets the value of the '{@link com.cohesionforce.hla.dsl.omt.Attribute#getUpdateType <em>Update Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Update Type</em>' attribute.
   * @see #getUpdateType()
   * @generated
   */
  void setUpdateType(String value);

  /**
   * Returns the value of the '<em><b>Update Type Note</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Update Type Note</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Update Type Note</em>' containment reference.
   * @see #setUpdateTypeNote(NoteRef)
   * @see com.cohesionforce.hla.dsl.omt.OmtPackage#getAttribute_UpdateTypeNote()
   * @model containment="true"
   * @generated
   */
  NoteRef getUpdateTypeNote();

  /**
   * Sets the value of the '{@link com.cohesionforce.hla.dsl.omt.Attribute#getUpdateTypeNote <em>Update Type Note</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Update Type Note</em>' containment reference.
   * @see #getUpdateTypeNote()
   * @generated
   */
  void setUpdateTypeNote(NoteRef value);

  /**
   * Returns the value of the '<em><b>Update Condition</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Update Condition</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Update Condition</em>' attribute.
   * @see #setUpdateCondition(String)
   * @see com.cohesionforce.hla.dsl.omt.OmtPackage#getAttribute_UpdateCondition()
   * @model
   * @generated
   */
  String getUpdateCondition();

  /**
   * Sets the value of the '{@link com.cohesionforce.hla.dsl.omt.Attribute#getUpdateCondition <em>Update Condition</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Update Condition</em>' attribute.
   * @see #getUpdateCondition()
   * @generated
   */
  void setUpdateCondition(String value);

  /**
   * Returns the value of the '<em><b>Update Condition Note</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Update Condition Note</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Update Condition Note</em>' containment reference.
   * @see #setUpdateConditionNote(NoteRef)
   * @see com.cohesionforce.hla.dsl.omt.OmtPackage#getAttribute_UpdateConditionNote()
   * @model containment="true"
   * @generated
   */
  NoteRef getUpdateConditionNote();

  /**
   * Sets the value of the '{@link com.cohesionforce.hla.dsl.omt.Attribute#getUpdateConditionNote <em>Update Condition Note</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Update Condition Note</em>' containment reference.
   * @see #getUpdateConditionNote()
   * @generated
   */
  void setUpdateConditionNote(NoteRef value);

  /**
   * Returns the value of the '<em><b>Transfer Accept</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Transfer Accept</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Transfer Accept</em>' attribute.
   * @see #setTransferAccept(String)
   * @see com.cohesionforce.hla.dsl.omt.OmtPackage#getAttribute_TransferAccept()
   * @model
   * @generated
   */
  String getTransferAccept();

  /**
   * Sets the value of the '{@link com.cohesionforce.hla.dsl.omt.Attribute#getTransferAccept <em>Transfer Accept</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Transfer Accept</em>' attribute.
   * @see #getTransferAccept()
   * @generated
   */
  void setTransferAccept(String value);

  /**
   * Returns the value of the '<em><b>Transfer Accept Note</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Transfer Accept Note</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Transfer Accept Note</em>' containment reference.
   * @see #setTransferAcceptNote(NoteRef)
   * @see com.cohesionforce.hla.dsl.omt.OmtPackage#getAttribute_TransferAcceptNote()
   * @model containment="true"
   * @generated
   */
  NoteRef getTransferAcceptNote();

  /**
   * Sets the value of the '{@link com.cohesionforce.hla.dsl.omt.Attribute#getTransferAcceptNote <em>Transfer Accept Note</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Transfer Accept Note</em>' containment reference.
   * @see #getTransferAcceptNote()
   * @generated
   */
  void setTransferAcceptNote(NoteRef value);

  /**
   * Returns the value of the '<em><b>Update Reflect</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Update Reflect</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Update Reflect</em>' attribute.
   * @see #setUpdateReflect(String)
   * @see com.cohesionforce.hla.dsl.omt.OmtPackage#getAttribute_UpdateReflect()
   * @model
   * @generated
   */
  String getUpdateReflect();

  /**
   * Sets the value of the '{@link com.cohesionforce.hla.dsl.omt.Attribute#getUpdateReflect <em>Update Reflect</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Update Reflect</em>' attribute.
   * @see #getUpdateReflect()
   * @generated
   */
  void setUpdateReflect(String value);

  /**
   * Returns the value of the '<em><b>Update Reflect Note</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Update Reflect Note</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Update Reflect Note</em>' containment reference.
   * @see #setUpdateReflectNote(NoteRef)
   * @see com.cohesionforce.hla.dsl.omt.OmtPackage#getAttribute_UpdateReflectNote()
   * @model containment="true"
   * @generated
   */
  NoteRef getUpdateReflectNote();

  /**
   * Sets the value of the '{@link com.cohesionforce.hla.dsl.omt.Attribute#getUpdateReflectNote <em>Update Reflect Note</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Update Reflect Note</em>' containment reference.
   * @see #getUpdateReflectNote()
   * @generated
   */
  void setUpdateReflectNote(NoteRef value);

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
   * @see com.cohesionforce.hla.dsl.omt.OmtPackage#getAttribute_Description()
   * @model containment="true"
   * @generated
   */
  Description getDescription();

  /**
   * Sets the value of the '{@link com.cohesionforce.hla.dsl.omt.Attribute#getDescription <em>Description</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Description</em>' containment reference.
   * @see #getDescription()
   * @generated
   */
  void setDescription(Description value);

  /**
   * Returns the value of the '<em><b>Routing Space</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Routing Space</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Routing Space</em>' attribute.
   * @see #setRoutingSpace(String)
   * @see com.cohesionforce.hla.dsl.omt.OmtPackage#getAttribute_RoutingSpace()
   * @model
   * @generated
   */
  String getRoutingSpace();

  /**
   * Sets the value of the '{@link com.cohesionforce.hla.dsl.omt.Attribute#getRoutingSpace <em>Routing Space</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Routing Space</em>' attribute.
   * @see #getRoutingSpace()
   * @generated
   */
  void setRoutingSpace(String value);

} // Attribute
