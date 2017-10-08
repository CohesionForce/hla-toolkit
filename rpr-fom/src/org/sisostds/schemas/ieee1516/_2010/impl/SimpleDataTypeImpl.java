/**
 */
package org.sisostds.schemas.ieee1516._2010.impl;

import java.lang.String;

import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.sisostds.schemas.ieee1516._2010.IdentifierType;
import org.sisostds.schemas.ieee1516._2010.NonEmptyString1;
import org.sisostds.schemas.ieee1516._2010.ReferenceType;
import org.sisostds.schemas.ieee1516._2010.SimpleDataType;
import org.sisostds.schemas.ieee1516._2010._2010Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Simple Data Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.sisostds.schemas.ieee1516._2010.impl.SimpleDataTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.sisostds.schemas.ieee1516._2010.impl.SimpleDataTypeImpl#getRepresentation <em>Representation</em>}</li>
 *   <li>{@link org.sisostds.schemas.ieee1516._2010.impl.SimpleDataTypeImpl#getUnits <em>Units</em>}</li>
 *   <li>{@link org.sisostds.schemas.ieee1516._2010.impl.SimpleDataTypeImpl#getResolution <em>Resolution</em>}</li>
 *   <li>{@link org.sisostds.schemas.ieee1516._2010.impl.SimpleDataTypeImpl#getAccuracy <em>Accuracy</em>}</li>
 *   <li>{@link org.sisostds.schemas.ieee1516._2010.impl.SimpleDataTypeImpl#getSemantics <em>Semantics</em>}</li>
 *   <li>{@link org.sisostds.schemas.ieee1516._2010.impl.SimpleDataTypeImpl#getAny <em>Any</em>}</li>
 *   <li>{@link org.sisostds.schemas.ieee1516._2010.impl.SimpleDataTypeImpl#getIdtag <em>Idtag</em>}</li>
 *   <li>{@link org.sisostds.schemas.ieee1516._2010.impl.SimpleDataTypeImpl#getNotes <em>Notes</em>}</li>
 *   <li>{@link org.sisostds.schemas.ieee1516._2010.impl.SimpleDataTypeImpl#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SimpleDataTypeImpl extends MinimalEObjectImpl.Container implements SimpleDataType {
	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected IdentifierType name;

	/**
	 * The cached value of the '{@link #getRepresentation() <em>Representation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepresentation()
	 * @generated
	 * @ordered
	 */
	protected ReferenceType representation;

	/**
	 * The cached value of the '{@link #getUnits() <em>Units</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnits()
	 * @generated
	 * @ordered
	 */
	protected NonEmptyString1 units;

	/**
	 * The cached value of the '{@link #getResolution() <em>Resolution</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResolution()
	 * @generated
	 * @ordered
	 */
	protected NonEmptyString1 resolution;

	/**
	 * The cached value of the '{@link #getAccuracy() <em>Accuracy</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccuracy()
	 * @generated
	 * @ordered
	 */
	protected NonEmptyString1 accuracy;

	/**
	 * The cached value of the '{@link #getSemantics() <em>Semantics</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemantics()
	 * @generated
	 * @ordered
	 */
	protected org.sisostds.schemas.ieee1516._2010.String semantics;

	/**
	 * The cached value of the '{@link #getAny() <em>Any</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAny()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap any;

	/**
	 * The default value of the '{@link #getIdtag() <em>Idtag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdtag()
	 * @generated
	 * @ordered
	 */
	protected static final String IDTAG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIdtag() <em>Idtag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdtag()
	 * @generated
	 * @ordered
	 */
	protected String idtag = IDTAG_EDEFAULT;

	/**
	 * The default value of the '{@link #getNotes() <em>Notes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotes()
	 * @generated
	 * @ordered
	 */
	protected static final List NOTES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNotes() <em>Notes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotes()
	 * @generated
	 * @ordered
	 */
	protected List notes = NOTES_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAnyAttribute() <em>Any Attribute</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnyAttribute()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap anyAttribute;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SimpleDataTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return _2010Package.eINSTANCE.getSimpleDataType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IdentifierType getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetName(IdentifierType newName, NotificationChain msgs) {
		IdentifierType oldName = name;
		name = newName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2010Package.SIMPLE_DATA_TYPE__NAME, oldName, newName);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(IdentifierType newName) {
		if (newName != name) {
			NotificationChain msgs = null;
			if (name != null)
				msgs = ((InternalEObject)name).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2010Package.SIMPLE_DATA_TYPE__NAME, null, msgs);
			if (newName != null)
				msgs = ((InternalEObject)newName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2010Package.SIMPLE_DATA_TYPE__NAME, null, msgs);
			msgs = basicSetName(newName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2010Package.SIMPLE_DATA_TYPE__NAME, newName, newName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferenceType getRepresentation() {
		return representation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRepresentation(ReferenceType newRepresentation, NotificationChain msgs) {
		ReferenceType oldRepresentation = representation;
		representation = newRepresentation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2010Package.SIMPLE_DATA_TYPE__REPRESENTATION, oldRepresentation, newRepresentation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRepresentation(ReferenceType newRepresentation) {
		if (newRepresentation != representation) {
			NotificationChain msgs = null;
			if (representation != null)
				msgs = ((InternalEObject)representation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2010Package.SIMPLE_DATA_TYPE__REPRESENTATION, null, msgs);
			if (newRepresentation != null)
				msgs = ((InternalEObject)newRepresentation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2010Package.SIMPLE_DATA_TYPE__REPRESENTATION, null, msgs);
			msgs = basicSetRepresentation(newRepresentation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2010Package.SIMPLE_DATA_TYPE__REPRESENTATION, newRepresentation, newRepresentation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NonEmptyString1 getUnits() {
		return units;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUnits(NonEmptyString1 newUnits, NotificationChain msgs) {
		NonEmptyString1 oldUnits = units;
		units = newUnits;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2010Package.SIMPLE_DATA_TYPE__UNITS, oldUnits, newUnits);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnits(NonEmptyString1 newUnits) {
		if (newUnits != units) {
			NotificationChain msgs = null;
			if (units != null)
				msgs = ((InternalEObject)units).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2010Package.SIMPLE_DATA_TYPE__UNITS, null, msgs);
			if (newUnits != null)
				msgs = ((InternalEObject)newUnits).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2010Package.SIMPLE_DATA_TYPE__UNITS, null, msgs);
			msgs = basicSetUnits(newUnits, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2010Package.SIMPLE_DATA_TYPE__UNITS, newUnits, newUnits));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NonEmptyString1 getResolution() {
		return resolution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResolution(NonEmptyString1 newResolution, NotificationChain msgs) {
		NonEmptyString1 oldResolution = resolution;
		resolution = newResolution;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2010Package.SIMPLE_DATA_TYPE__RESOLUTION, oldResolution, newResolution);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResolution(NonEmptyString1 newResolution) {
		if (newResolution != resolution) {
			NotificationChain msgs = null;
			if (resolution != null)
				msgs = ((InternalEObject)resolution).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2010Package.SIMPLE_DATA_TYPE__RESOLUTION, null, msgs);
			if (newResolution != null)
				msgs = ((InternalEObject)newResolution).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2010Package.SIMPLE_DATA_TYPE__RESOLUTION, null, msgs);
			msgs = basicSetResolution(newResolution, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2010Package.SIMPLE_DATA_TYPE__RESOLUTION, newResolution, newResolution));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NonEmptyString1 getAccuracy() {
		return accuracy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAccuracy(NonEmptyString1 newAccuracy, NotificationChain msgs) {
		NonEmptyString1 oldAccuracy = accuracy;
		accuracy = newAccuracy;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2010Package.SIMPLE_DATA_TYPE__ACCURACY, oldAccuracy, newAccuracy);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccuracy(NonEmptyString1 newAccuracy) {
		if (newAccuracy != accuracy) {
			NotificationChain msgs = null;
			if (accuracy != null)
				msgs = ((InternalEObject)accuracy).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2010Package.SIMPLE_DATA_TYPE__ACCURACY, null, msgs);
			if (newAccuracy != null)
				msgs = ((InternalEObject)newAccuracy).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2010Package.SIMPLE_DATA_TYPE__ACCURACY, null, msgs);
			msgs = basicSetAccuracy(newAccuracy, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2010Package.SIMPLE_DATA_TYPE__ACCURACY, newAccuracy, newAccuracy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.sisostds.schemas.ieee1516._2010.String getSemantics() {
		return semantics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSemantics(org.sisostds.schemas.ieee1516._2010.String newSemantics, NotificationChain msgs) {
		org.sisostds.schemas.ieee1516._2010.String oldSemantics = semantics;
		semantics = newSemantics;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2010Package.SIMPLE_DATA_TYPE__SEMANTICS, oldSemantics, newSemantics);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSemantics(org.sisostds.schemas.ieee1516._2010.String newSemantics) {
		if (newSemantics != semantics) {
			NotificationChain msgs = null;
			if (semantics != null)
				msgs = ((InternalEObject)semantics).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2010Package.SIMPLE_DATA_TYPE__SEMANTICS, null, msgs);
			if (newSemantics != null)
				msgs = ((InternalEObject)newSemantics).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2010Package.SIMPLE_DATA_TYPE__SEMANTICS, null, msgs);
			msgs = basicSetSemantics(newSemantics, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2010Package.SIMPLE_DATA_TYPE__SEMANTICS, newSemantics, newSemantics));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAny() {
		if (any == null) {
			any = new BasicFeatureMap(this, _2010Package.SIMPLE_DATA_TYPE__ANY);
		}
		return any;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIdtag() {
		return idtag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdtag(String newIdtag) {
		String oldIdtag = idtag;
		idtag = newIdtag;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2010Package.SIMPLE_DATA_TYPE__IDTAG, oldIdtag, idtag));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getNotes() {
		return notes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNotes(List newNotes) {
		List oldNotes = notes;
		notes = newNotes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2010Package.SIMPLE_DATA_TYPE__NOTES, oldNotes, notes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAnyAttribute() {
		if (anyAttribute == null) {
			anyAttribute = new BasicFeatureMap(this, _2010Package.SIMPLE_DATA_TYPE__ANY_ATTRIBUTE);
		}
		return anyAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _2010Package.SIMPLE_DATA_TYPE__NAME:
				return basicSetName(null, msgs);
			case _2010Package.SIMPLE_DATA_TYPE__REPRESENTATION:
				return basicSetRepresentation(null, msgs);
			case _2010Package.SIMPLE_DATA_TYPE__UNITS:
				return basicSetUnits(null, msgs);
			case _2010Package.SIMPLE_DATA_TYPE__RESOLUTION:
				return basicSetResolution(null, msgs);
			case _2010Package.SIMPLE_DATA_TYPE__ACCURACY:
				return basicSetAccuracy(null, msgs);
			case _2010Package.SIMPLE_DATA_TYPE__SEMANTICS:
				return basicSetSemantics(null, msgs);
			case _2010Package.SIMPLE_DATA_TYPE__ANY:
				return ((InternalEList)getAny()).basicRemove(otherEnd, msgs);
			case _2010Package.SIMPLE_DATA_TYPE__ANY_ATTRIBUTE:
				return ((InternalEList)getAnyAttribute()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case _2010Package.SIMPLE_DATA_TYPE__NAME:
				return getName();
			case _2010Package.SIMPLE_DATA_TYPE__REPRESENTATION:
				return getRepresentation();
			case _2010Package.SIMPLE_DATA_TYPE__UNITS:
				return getUnits();
			case _2010Package.SIMPLE_DATA_TYPE__RESOLUTION:
				return getResolution();
			case _2010Package.SIMPLE_DATA_TYPE__ACCURACY:
				return getAccuracy();
			case _2010Package.SIMPLE_DATA_TYPE__SEMANTICS:
				return getSemantics();
			case _2010Package.SIMPLE_DATA_TYPE__ANY:
				if (coreType) return getAny();
				return ((FeatureMap.Internal)getAny()).getWrapper();
			case _2010Package.SIMPLE_DATA_TYPE__IDTAG:
				return getIdtag();
			case _2010Package.SIMPLE_DATA_TYPE__NOTES:
				return getNotes();
			case _2010Package.SIMPLE_DATA_TYPE__ANY_ATTRIBUTE:
				if (coreType) return getAnyAttribute();
				return ((FeatureMap.Internal)getAnyAttribute()).getWrapper();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case _2010Package.SIMPLE_DATA_TYPE__NAME:
				setName((IdentifierType)newValue);
				return;
			case _2010Package.SIMPLE_DATA_TYPE__REPRESENTATION:
				setRepresentation((ReferenceType)newValue);
				return;
			case _2010Package.SIMPLE_DATA_TYPE__UNITS:
				setUnits((NonEmptyString1)newValue);
				return;
			case _2010Package.SIMPLE_DATA_TYPE__RESOLUTION:
				setResolution((NonEmptyString1)newValue);
				return;
			case _2010Package.SIMPLE_DATA_TYPE__ACCURACY:
				setAccuracy((NonEmptyString1)newValue);
				return;
			case _2010Package.SIMPLE_DATA_TYPE__SEMANTICS:
				setSemantics((org.sisostds.schemas.ieee1516._2010.String)newValue);
				return;
			case _2010Package.SIMPLE_DATA_TYPE__ANY:
				((FeatureMap.Internal)getAny()).set(newValue);
				return;
			case _2010Package.SIMPLE_DATA_TYPE__IDTAG:
				setIdtag((String)newValue);
				return;
			case _2010Package.SIMPLE_DATA_TYPE__NOTES:
				setNotes((List)newValue);
				return;
			case _2010Package.SIMPLE_DATA_TYPE__ANY_ATTRIBUTE:
				((FeatureMap.Internal)getAnyAttribute()).set(newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(int featureID) {
		switch (featureID) {
			case _2010Package.SIMPLE_DATA_TYPE__NAME:
				setName((IdentifierType)null);
				return;
			case _2010Package.SIMPLE_DATA_TYPE__REPRESENTATION:
				setRepresentation((ReferenceType)null);
				return;
			case _2010Package.SIMPLE_DATA_TYPE__UNITS:
				setUnits((NonEmptyString1)null);
				return;
			case _2010Package.SIMPLE_DATA_TYPE__RESOLUTION:
				setResolution((NonEmptyString1)null);
				return;
			case _2010Package.SIMPLE_DATA_TYPE__ACCURACY:
				setAccuracy((NonEmptyString1)null);
				return;
			case _2010Package.SIMPLE_DATA_TYPE__SEMANTICS:
				setSemantics((org.sisostds.schemas.ieee1516._2010.String)null);
				return;
			case _2010Package.SIMPLE_DATA_TYPE__ANY:
				getAny().clear();
				return;
			case _2010Package.SIMPLE_DATA_TYPE__IDTAG:
				setIdtag(IDTAG_EDEFAULT);
				return;
			case _2010Package.SIMPLE_DATA_TYPE__NOTES:
				setNotes(NOTES_EDEFAULT);
				return;
			case _2010Package.SIMPLE_DATA_TYPE__ANY_ATTRIBUTE:
				getAnyAttribute().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case _2010Package.SIMPLE_DATA_TYPE__NAME:
				return name != null;
			case _2010Package.SIMPLE_DATA_TYPE__REPRESENTATION:
				return representation != null;
			case _2010Package.SIMPLE_DATA_TYPE__UNITS:
				return units != null;
			case _2010Package.SIMPLE_DATA_TYPE__RESOLUTION:
				return resolution != null;
			case _2010Package.SIMPLE_DATA_TYPE__ACCURACY:
				return accuracy != null;
			case _2010Package.SIMPLE_DATA_TYPE__SEMANTICS:
				return semantics != null;
			case _2010Package.SIMPLE_DATA_TYPE__ANY:
				return any != null && !any.isEmpty();
			case _2010Package.SIMPLE_DATA_TYPE__IDTAG:
				return IDTAG_EDEFAULT == null ? idtag != null : !IDTAG_EDEFAULT.equals(idtag);
			case _2010Package.SIMPLE_DATA_TYPE__NOTES:
				return NOTES_EDEFAULT == null ? notes != null : !NOTES_EDEFAULT.equals(notes);
			case _2010Package.SIMPLE_DATA_TYPE__ANY_ATTRIBUTE:
				return anyAttribute != null && !anyAttribute.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (any: ");
		result.append(any);
		result.append(", idtag: ");
		result.append(idtag);
		result.append(", notes: ");
		result.append(notes);
		result.append(", anyAttribute: ");
		result.append(anyAttribute);
		result.append(')');
		return result.toString();
	}

} //SimpleDataTypeImpl
