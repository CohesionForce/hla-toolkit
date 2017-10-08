/**
 * generated by Xtext 2.12.0
 */
package com.cohesionforce.hla.dsl.omt.impl;

import com.cohesionforce.hla.dsl.omt.Enumeration;
import com.cohesionforce.hla.dsl.omt.NoteRef;
import com.cohesionforce.hla.dsl.omt.OmtPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Enumeration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.cohesionforce.hla.dsl.omt.impl.EnumerationImpl#getLiteral <em>Literal</em>}</li>
 *   <li>{@link com.cohesionforce.hla.dsl.omt.impl.EnumerationImpl#getEnumeratorNote <em>Enumerator Note</em>}</li>
 *   <li>{@link com.cohesionforce.hla.dsl.omt.impl.EnumerationImpl#getValue <em>Value</em>}</li>
 *   <li>{@link com.cohesionforce.hla.dsl.omt.impl.EnumerationImpl#getRepresentationNote <em>Representation Note</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EnumerationImpl extends MinimalEObjectImpl.Container implements Enumeration
{
  /**
   * The default value of the '{@link #getLiteral() <em>Literal</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLiteral()
   * @generated
   * @ordered
   */
  protected static final String LITERAL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getLiteral() <em>Literal</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLiteral()
   * @generated
   * @ordered
   */
  protected String literal = LITERAL_EDEFAULT;

  /**
   * The cached value of the '{@link #getEnumeratorNote() <em>Enumerator Note</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEnumeratorNote()
   * @generated
   * @ordered
   */
  protected NoteRef enumeratorNote;

  /**
   * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected static final int VALUE_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected int value = VALUE_EDEFAULT;

  /**
   * The cached value of the '{@link #getRepresentationNote() <em>Representation Note</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRepresentationNote()
   * @generated
   * @ordered
   */
  protected NoteRef representationNote;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EnumerationImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return OmtPackage.Literals.ENUMERATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLiteral()
  {
    return literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLiteral(String newLiteral)
  {
    String oldLiteral = literal;
    literal = newLiteral;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OmtPackage.ENUMERATION__LITERAL, oldLiteral, literal));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NoteRef getEnumeratorNote()
  {
    return enumeratorNote;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetEnumeratorNote(NoteRef newEnumeratorNote, NotificationChain msgs)
  {
    NoteRef oldEnumeratorNote = enumeratorNote;
    enumeratorNote = newEnumeratorNote;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OmtPackage.ENUMERATION__ENUMERATOR_NOTE, oldEnumeratorNote, newEnumeratorNote);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEnumeratorNote(NoteRef newEnumeratorNote)
  {
    if (newEnumeratorNote != enumeratorNote)
    {
      NotificationChain msgs = null;
      if (enumeratorNote != null)
        msgs = ((InternalEObject)enumeratorNote).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OmtPackage.ENUMERATION__ENUMERATOR_NOTE, null, msgs);
      if (newEnumeratorNote != null)
        msgs = ((InternalEObject)newEnumeratorNote).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OmtPackage.ENUMERATION__ENUMERATOR_NOTE, null, msgs);
      msgs = basicSetEnumeratorNote(newEnumeratorNote, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OmtPackage.ENUMERATION__ENUMERATOR_NOTE, newEnumeratorNote, newEnumeratorNote));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValue(int newValue)
  {
    int oldValue = value;
    value = newValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OmtPackage.ENUMERATION__VALUE, oldValue, value));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NoteRef getRepresentationNote()
  {
    return representationNote;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRepresentationNote(NoteRef newRepresentationNote, NotificationChain msgs)
  {
    NoteRef oldRepresentationNote = representationNote;
    representationNote = newRepresentationNote;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OmtPackage.ENUMERATION__REPRESENTATION_NOTE, oldRepresentationNote, newRepresentationNote);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRepresentationNote(NoteRef newRepresentationNote)
  {
    if (newRepresentationNote != representationNote)
    {
      NotificationChain msgs = null;
      if (representationNote != null)
        msgs = ((InternalEObject)representationNote).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OmtPackage.ENUMERATION__REPRESENTATION_NOTE, null, msgs);
      if (newRepresentationNote != null)
        msgs = ((InternalEObject)newRepresentationNote).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OmtPackage.ENUMERATION__REPRESENTATION_NOTE, null, msgs);
      msgs = basicSetRepresentationNote(newRepresentationNote, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OmtPackage.ENUMERATION__REPRESENTATION_NOTE, newRepresentationNote, newRepresentationNote));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case OmtPackage.ENUMERATION__ENUMERATOR_NOTE:
        return basicSetEnumeratorNote(null, msgs);
      case OmtPackage.ENUMERATION__REPRESENTATION_NOTE:
        return basicSetRepresentationNote(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case OmtPackage.ENUMERATION__LITERAL:
        return getLiteral();
      case OmtPackage.ENUMERATION__ENUMERATOR_NOTE:
        return getEnumeratorNote();
      case OmtPackage.ENUMERATION__VALUE:
        return getValue();
      case OmtPackage.ENUMERATION__REPRESENTATION_NOTE:
        return getRepresentationNote();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case OmtPackage.ENUMERATION__LITERAL:
        setLiteral((String)newValue);
        return;
      case OmtPackage.ENUMERATION__ENUMERATOR_NOTE:
        setEnumeratorNote((NoteRef)newValue);
        return;
      case OmtPackage.ENUMERATION__VALUE:
        setValue((Integer)newValue);
        return;
      case OmtPackage.ENUMERATION__REPRESENTATION_NOTE:
        setRepresentationNote((NoteRef)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case OmtPackage.ENUMERATION__LITERAL:
        setLiteral(LITERAL_EDEFAULT);
        return;
      case OmtPackage.ENUMERATION__ENUMERATOR_NOTE:
        setEnumeratorNote((NoteRef)null);
        return;
      case OmtPackage.ENUMERATION__VALUE:
        setValue(VALUE_EDEFAULT);
        return;
      case OmtPackage.ENUMERATION__REPRESENTATION_NOTE:
        setRepresentationNote((NoteRef)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case OmtPackage.ENUMERATION__LITERAL:
        return LITERAL_EDEFAULT == null ? literal != null : !LITERAL_EDEFAULT.equals(literal);
      case OmtPackage.ENUMERATION__ENUMERATOR_NOTE:
        return enumeratorNote != null;
      case OmtPackage.ENUMERATION__VALUE:
        return value != VALUE_EDEFAULT;
      case OmtPackage.ENUMERATION__REPRESENTATION_NOTE:
        return representationNote != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (literal: ");
    result.append(literal);
    result.append(", value: ");
    result.append(value);
    result.append(')');
    return result.toString();
  }

} //EnumerationImpl
