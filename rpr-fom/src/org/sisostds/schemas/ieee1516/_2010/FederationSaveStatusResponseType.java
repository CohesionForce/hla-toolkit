/**
 */
package org.sisostds.schemas.ieee1516._2010;

import java.lang.String;

import java.util.List;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Federation Save Status Response Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.sisostds.schemas.ieee1516._2010.FederationSaveStatusResponseType#getIdtag <em>Idtag</em>}</li>
 *   <li>{@link org.sisostds.schemas.ieee1516._2010.FederationSaveStatusResponseType#getIsCallback <em>Is Callback</em>}</li>
 *   <li>{@link org.sisostds.schemas.ieee1516._2010.FederationSaveStatusResponseType#isIsUsed <em>Is Used</em>}</li>
 *   <li>{@link org.sisostds.schemas.ieee1516._2010.FederationSaveStatusResponseType#getNotes <em>Notes</em>}</li>
 *   <li>{@link org.sisostds.schemas.ieee1516._2010.FederationSaveStatusResponseType#getSection <em>Section</em>}</li>
 *   <li>{@link org.sisostds.schemas.ieee1516._2010.FederationSaveStatusResponseType#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 *
 * @see org.sisostds.schemas.ieee1516._2010._2010Package#getFederationSaveStatusResponseType()
 * @model extendedMetaData="name='federationSaveStatusResponse_._type' kind='empty'"
 * @generated
 */
public interface FederationSaveStatusResponseType extends EObject {
	/**
	 * Returns the value of the '<em><b>Idtag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Idtag</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Idtag</em>' attribute.
	 * @see #setIdtag(String)
	 * @see org.sisostds.schemas.ieee1516._2010._2010Package#getFederationSaveStatusResponseType_Idtag()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
	 *        extendedMetaData="kind='attribute' name='idtag'"
	 * @generated
	 */
	String getIdtag();

	/**
	 * Sets the value of the '{@link org.sisostds.schemas.ieee1516._2010.FederationSaveStatusResponseType#getIdtag <em>Idtag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Idtag</em>' attribute.
	 * @see #getIdtag()
	 * @generated
	 */
	void setIdtag(String value);

	/**
	 * Returns the value of the '<em><b>Is Callback</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Callback</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Callback</em>' attribute.
	 * @see #isSetIsCallback()
	 * @see #unsetIsCallback()
	 * @see #setIsCallback(Object)
	 * @see org.sisostds.schemas.ieee1516._2010._2010Package#getFederationSaveStatusResponseType_IsCallback()
	 * @model default="true" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" required="true"
	 *        extendedMetaData="kind='attribute' name='isCallback'"
	 * @generated
	 */
	Object getIsCallback();

	/**
	 * Sets the value of the '{@link org.sisostds.schemas.ieee1516._2010.FederationSaveStatusResponseType#getIsCallback <em>Is Callback</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Callback</em>' attribute.
	 * @see #isSetIsCallback()
	 * @see #unsetIsCallback()
	 * @see #getIsCallback()
	 * @generated
	 */
	void setIsCallback(Object value);

	/**
	 * Unsets the value of the '{@link org.sisostds.schemas.ieee1516._2010.FederationSaveStatusResponseType#getIsCallback <em>Is Callback</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsCallback()
	 * @see #getIsCallback()
	 * @see #setIsCallback(Object)
	 * @generated
	 */
	void unsetIsCallback();

	/**
	 * Returns whether the value of the '{@link org.sisostds.schemas.ieee1516._2010.FederationSaveStatusResponseType#getIsCallback <em>Is Callback</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Is Callback</em>' attribute is set.
	 * @see #unsetIsCallback()
	 * @see #getIsCallback()
	 * @see #setIsCallback(Object)
	 * @generated
	 */
	boolean isSetIsCallback();

	/**
	 * Returns the value of the '<em><b>Is Used</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Used</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Used</em>' attribute.
	 * @see #isSetIsUsed()
	 * @see #unsetIsUsed()
	 * @see #setIsUsed(boolean)
	 * @see org.sisostds.schemas.ieee1516._2010._2010Package#getFederationSaveStatusResponseType_IsUsed()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='isUsed'"
	 * @generated
	 */
	boolean isIsUsed();

	/**
	 * Sets the value of the '{@link org.sisostds.schemas.ieee1516._2010.FederationSaveStatusResponseType#isIsUsed <em>Is Used</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Used</em>' attribute.
	 * @see #isSetIsUsed()
	 * @see #unsetIsUsed()
	 * @see #isIsUsed()
	 * @generated
	 */
	void setIsUsed(boolean value);

	/**
	 * Unsets the value of the '{@link org.sisostds.schemas.ieee1516._2010.FederationSaveStatusResponseType#isIsUsed <em>Is Used</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsUsed()
	 * @see #isIsUsed()
	 * @see #setIsUsed(boolean)
	 * @generated
	 */
	void unsetIsUsed();

	/**
	 * Returns whether the value of the '{@link org.sisostds.schemas.ieee1516._2010.FederationSaveStatusResponseType#isIsUsed <em>Is Used</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Is Used</em>' attribute is set.
	 * @see #unsetIsUsed()
	 * @see #isIsUsed()
	 * @see #setIsUsed(boolean)
	 * @generated
	 */
	boolean isSetIsUsed();

	/**
	 * Returns the value of the '<em><b>Notes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Notes</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Notes</em>' attribute.
	 * @see #setNotes(List)
	 * @see org.sisostds.schemas.ieee1516._2010._2010Package#getFederationSaveStatusResponseType_Notes()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.IDREFS" many="false"
	 *        extendedMetaData="kind='attribute' name='notes'"
	 * @generated
	 */
	List getNotes();

	/**
	 * Sets the value of the '{@link org.sisostds.schemas.ieee1516._2010.FederationSaveStatusResponseType#getNotes <em>Notes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Notes</em>' attribute.
	 * @see #getNotes()
	 * @generated
	 */
	void setNotes(List value);

	/**
	 * Returns the value of the '<em><b>Section</b></em>' attribute.
	 * The default value is <code>"4.23"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Section</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Section</em>' attribute.
	 * @see #isSetSection()
	 * @see #unsetSection()
	 * @see #setSection(Object)
	 * @see org.sisostds.schemas.ieee1516._2010._2010Package#getFederationSaveStatusResponseType_Section()
	 * @model default="4.23" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" required="true"
	 *        extendedMetaData="kind='attribute' name='section'"
	 * @generated
	 */
	Object getSection();

	/**
	 * Sets the value of the '{@link org.sisostds.schemas.ieee1516._2010.FederationSaveStatusResponseType#getSection <em>Section</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Section</em>' attribute.
	 * @see #isSetSection()
	 * @see #unsetSection()
	 * @see #getSection()
	 * @generated
	 */
	void setSection(Object value);

	/**
	 * Unsets the value of the '{@link org.sisostds.schemas.ieee1516._2010.FederationSaveStatusResponseType#getSection <em>Section</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSection()
	 * @see #getSection()
	 * @see #setSection(Object)
	 * @generated
	 */
	void unsetSection();

	/**
	 * Returns whether the value of the '{@link org.sisostds.schemas.ieee1516._2010.FederationSaveStatusResponseType#getSection <em>Section</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Section</em>' attribute is set.
	 * @see #unsetSection()
	 * @see #getSection()
	 * @see #setSection(Object)
	 * @generated
	 */
	boolean isSetSection();

	/**
	 * Returns the value of the '<em><b>Any Attribute</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Any Attribute</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Any Attribute</em>' attribute list.
	 * @see org.sisostds.schemas.ieee1516._2010._2010Package#getFederationSaveStatusResponseType_AnyAttribute()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='attributeWildcard' wildcards='##other' name=':5' processing='strict'"
	 * @generated
	 */
	FeatureMap getAnyAttribute();

} // FederationSaveStatusResponseType
