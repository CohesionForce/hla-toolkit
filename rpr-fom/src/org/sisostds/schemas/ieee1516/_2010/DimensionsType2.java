/**
 */
package org.sisostds.schemas.ieee1516._2010;

import java.lang.String;

import java.util.List;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dimensions Type2</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.sisostds.schemas.ieee1516._2010.DimensionsType2#getDimension <em>Dimension</em>}</li>
 *   <li>{@link org.sisostds.schemas.ieee1516._2010.DimensionsType2#getAny <em>Any</em>}</li>
 *   <li>{@link org.sisostds.schemas.ieee1516._2010.DimensionsType2#getIdtag <em>Idtag</em>}</li>
 *   <li>{@link org.sisostds.schemas.ieee1516._2010.DimensionsType2#getNotes <em>Notes</em>}</li>
 *   <li>{@link org.sisostds.schemas.ieee1516._2010.DimensionsType2#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 *
 * @see org.sisostds.schemas.ieee1516._2010._2010Package#getDimensionsType2()
 * @model extendedMetaData="name='dimensions_._type' kind='elementOnly'"
 * @generated
 */
public interface DimensionsType2 extends EObject {
	/**
	 * Returns the value of the '<em><b>Dimension</b></em>' containment reference list.
	 * The list contents are of type {@link org.sisostds.schemas.ieee1516._2010.ReferenceType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * identifies a dimension associated with this attribute
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dimension</em>' containment reference list.
	 * @see org.sisostds.schemas.ieee1516._2010._2010Package#getDimensionsType2_Dimension()
	 * @model type="org.sisostds.schemas.ieee1516._2010.ReferenceType" containment="true"
	 *        extendedMetaData="kind='element' name='dimension' namespace='##targetNamespace'"
	 * @generated
	 */
	EList getDimension();

	/**
	 * Returns the value of the '<em><b>Any</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Any</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Any</em>' attribute list.
	 * @see org.sisostds.schemas.ieee1516._2010._2010Package#getDimensionsType2_Any()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="false"
	 *        extendedMetaData="kind='elementWildcard' wildcards='##other' name=':1' processing='strict'"
	 * @generated
	 */
	FeatureMap getAny();

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
	 * @see org.sisostds.schemas.ieee1516._2010._2010Package#getDimensionsType2_Idtag()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
	 *        extendedMetaData="kind='attribute' name='idtag'"
	 * @generated
	 */
	String getIdtag();

	/**
	 * Sets the value of the '{@link org.sisostds.schemas.ieee1516._2010.DimensionsType2#getIdtag <em>Idtag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Idtag</em>' attribute.
	 * @see #getIdtag()
	 * @generated
	 */
	void setIdtag(String value);

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
	 * @see org.sisostds.schemas.ieee1516._2010._2010Package#getDimensionsType2_Notes()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.IDREFS" many="false"
	 *        extendedMetaData="kind='attribute' name='notes'"
	 * @generated
	 */
	List getNotes();

	/**
	 * Sets the value of the '{@link org.sisostds.schemas.ieee1516._2010.DimensionsType2#getNotes <em>Notes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Notes</em>' attribute.
	 * @see #getNotes()
	 * @generated
	 */
	void setNotes(List value);

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
	 * @see org.sisostds.schemas.ieee1516._2010._2010Package#getDimensionsType2_AnyAttribute()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='attributeWildcard' wildcards='##other' name=':4' processing='strict'"
	 * @generated
	 */
	FeatureMap getAnyAttribute();

} // DimensionsType2
