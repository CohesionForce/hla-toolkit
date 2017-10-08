/**
 * generated by Xtext 2.12.0
 */
package com.cohesionforce.hla.dsl.omt.impl;

import com.cohesionforce.hla.dsl.omt.NoteRef;
import com.cohesionforce.hla.dsl.omt.OmtPackage;
import com.cohesionforce.hla.dsl.omt.Units;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Units</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.cohesionforce.hla.dsl.omt.impl.UnitsImpl#getUnits <em>Units</em>}</li>
 *   <li>{@link com.cohesionforce.hla.dsl.omt.impl.UnitsImpl#getUnitsNote <em>Units Note</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UnitsImpl extends MinimalEObjectImpl.Container implements Units
{
  /**
   * The default value of the '{@link #getUnits() <em>Units</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUnits()
   * @generated
   * @ordered
   */
  protected static final String UNITS_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getUnits() <em>Units</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUnits()
   * @generated
   * @ordered
   */
  protected String units = UNITS_EDEFAULT;

  /**
   * The cached value of the '{@link #getUnitsNote() <em>Units Note</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUnitsNote()
   * @generated
   * @ordered
   */
  protected NoteRef unitsNote;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected UnitsImpl()
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
    return OmtPackage.Literals.UNITS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getUnits()
  {
    return units;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUnits(String newUnits)
  {
    String oldUnits = units;
    units = newUnits;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OmtPackage.UNITS__UNITS, oldUnits, units));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NoteRef getUnitsNote()
  {
    return unitsNote;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetUnitsNote(NoteRef newUnitsNote, NotificationChain msgs)
  {
    NoteRef oldUnitsNote = unitsNote;
    unitsNote = newUnitsNote;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OmtPackage.UNITS__UNITS_NOTE, oldUnitsNote, newUnitsNote);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUnitsNote(NoteRef newUnitsNote)
  {
    if (newUnitsNote != unitsNote)
    {
      NotificationChain msgs = null;
      if (unitsNote != null)
        msgs = ((InternalEObject)unitsNote).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OmtPackage.UNITS__UNITS_NOTE, null, msgs);
      if (newUnitsNote != null)
        msgs = ((InternalEObject)newUnitsNote).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OmtPackage.UNITS__UNITS_NOTE, null, msgs);
      msgs = basicSetUnitsNote(newUnitsNote, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OmtPackage.UNITS__UNITS_NOTE, newUnitsNote, newUnitsNote));
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
      case OmtPackage.UNITS__UNITS_NOTE:
        return basicSetUnitsNote(null, msgs);
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
      case OmtPackage.UNITS__UNITS:
        return getUnits();
      case OmtPackage.UNITS__UNITS_NOTE:
        return getUnitsNote();
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
      case OmtPackage.UNITS__UNITS:
        setUnits((String)newValue);
        return;
      case OmtPackage.UNITS__UNITS_NOTE:
        setUnitsNote((NoteRef)newValue);
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
      case OmtPackage.UNITS__UNITS:
        setUnits(UNITS_EDEFAULT);
        return;
      case OmtPackage.UNITS__UNITS_NOTE:
        setUnitsNote((NoteRef)null);
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
      case OmtPackage.UNITS__UNITS:
        return UNITS_EDEFAULT == null ? units != null : !UNITS_EDEFAULT.equals(units);
      case OmtPackage.UNITS__UNITS_NOTE:
        return unitsNote != null;
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
    result.append(" (units: ");
    result.append(units);
    result.append(')');
    return result.toString();
  }

} //UnitsImpl
