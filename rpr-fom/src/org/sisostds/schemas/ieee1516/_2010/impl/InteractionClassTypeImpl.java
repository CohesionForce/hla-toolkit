/**
 */
package org.sisostds.schemas.ieee1516._2010.impl;

import java.lang.String;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.sisostds.schemas.ieee1516._2010.DimensionsType;
import org.sisostds.schemas.ieee1516._2010.IdentifierType;
import org.sisostds.schemas.ieee1516._2010.InteractionClassType;
import org.sisostds.schemas.ieee1516._2010.InteractionClassType1;
import org.sisostds.schemas.ieee1516._2010.OrderType;
import org.sisostds.schemas.ieee1516._2010.ParameterType1;
import org.sisostds.schemas.ieee1516._2010.ReferenceType;
import org.sisostds.schemas.ieee1516._2010.SharingType;
import org.sisostds.schemas.ieee1516._2010._2010Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interaction Class Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.sisostds.schemas.ieee1516._2010.impl.InteractionClassTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.sisostds.schemas.ieee1516._2010.impl.InteractionClassTypeImpl#getSharing <em>Sharing</em>}</li>
 *   <li>{@link org.sisostds.schemas.ieee1516._2010.impl.InteractionClassTypeImpl#getDimensions <em>Dimensions</em>}</li>
 *   <li>{@link org.sisostds.schemas.ieee1516._2010.impl.InteractionClassTypeImpl#getTransportation <em>Transportation</em>}</li>
 *   <li>{@link org.sisostds.schemas.ieee1516._2010.impl.InteractionClassTypeImpl#getOrder <em>Order</em>}</li>
 *   <li>{@link org.sisostds.schemas.ieee1516._2010.impl.InteractionClassTypeImpl#getSemantics <em>Semantics</em>}</li>
 *   <li>{@link org.sisostds.schemas.ieee1516._2010.impl.InteractionClassTypeImpl#getParameter <em>Parameter</em>}</li>
 *   <li>{@link org.sisostds.schemas.ieee1516._2010.impl.InteractionClassTypeImpl#getInteractionClass <em>Interaction Class</em>}</li>
 *   <li>{@link org.sisostds.schemas.ieee1516._2010.impl.InteractionClassTypeImpl#getAny <em>Any</em>}</li>
 *   <li>{@link org.sisostds.schemas.ieee1516._2010.impl.InteractionClassTypeImpl#getIdtag <em>Idtag</em>}</li>
 *   <li>{@link org.sisostds.schemas.ieee1516._2010.impl.InteractionClassTypeImpl#getNotes <em>Notes</em>}</li>
 *   <li>{@link org.sisostds.schemas.ieee1516._2010.impl.InteractionClassTypeImpl#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InteractionClassTypeImpl extends MinimalEObjectImpl.Container implements InteractionClassType {
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
	 * The cached value of the '{@link #getSharing() <em>Sharing</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSharing()
	 * @generated
	 * @ordered
	 */
	protected SharingType sharing;

	/**
	 * The cached value of the '{@link #getDimensions() <em>Dimensions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDimensions()
	 * @generated
	 * @ordered
	 */
	protected DimensionsType dimensions;

	/**
	 * The cached value of the '{@link #getTransportation() <em>Transportation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransportation()
	 * @generated
	 * @ordered
	 */
	protected ReferenceType transportation;

	/**
	 * The cached value of the '{@link #getOrder() <em>Order</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrder()
	 * @generated
	 * @ordered
	 */
	protected OrderType order;

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
	 * The cached value of the '{@link #getParameter() <em>Parameter</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameter()
	 * @generated
	 * @ordered
	 */
	protected EList parameter;

	/**
	 * The cached value of the '{@link #getInteractionClass() <em>Interaction Class</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInteractionClass()
	 * @generated
	 * @ordered
	 */
	protected EList interactionClass;

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
	protected InteractionClassTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return _2010Package.eINSTANCE.getInteractionClassType();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2010Package.INTERACTION_CLASS_TYPE__NAME, oldName, newName);
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
				msgs = ((InternalEObject)name).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2010Package.INTERACTION_CLASS_TYPE__NAME, null, msgs);
			if (newName != null)
				msgs = ((InternalEObject)newName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2010Package.INTERACTION_CLASS_TYPE__NAME, null, msgs);
			msgs = basicSetName(newName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2010Package.INTERACTION_CLASS_TYPE__NAME, newName, newName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SharingType getSharing() {
		return sharing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSharing(SharingType newSharing, NotificationChain msgs) {
		SharingType oldSharing = sharing;
		sharing = newSharing;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2010Package.INTERACTION_CLASS_TYPE__SHARING, oldSharing, newSharing);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSharing(SharingType newSharing) {
		if (newSharing != sharing) {
			NotificationChain msgs = null;
			if (sharing != null)
				msgs = ((InternalEObject)sharing).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2010Package.INTERACTION_CLASS_TYPE__SHARING, null, msgs);
			if (newSharing != null)
				msgs = ((InternalEObject)newSharing).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2010Package.INTERACTION_CLASS_TYPE__SHARING, null, msgs);
			msgs = basicSetSharing(newSharing, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2010Package.INTERACTION_CLASS_TYPE__SHARING, newSharing, newSharing));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DimensionsType getDimensions() {
		return dimensions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDimensions(DimensionsType newDimensions, NotificationChain msgs) {
		DimensionsType oldDimensions = dimensions;
		dimensions = newDimensions;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2010Package.INTERACTION_CLASS_TYPE__DIMENSIONS, oldDimensions, newDimensions);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDimensions(DimensionsType newDimensions) {
		if (newDimensions != dimensions) {
			NotificationChain msgs = null;
			if (dimensions != null)
				msgs = ((InternalEObject)dimensions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2010Package.INTERACTION_CLASS_TYPE__DIMENSIONS, null, msgs);
			if (newDimensions != null)
				msgs = ((InternalEObject)newDimensions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2010Package.INTERACTION_CLASS_TYPE__DIMENSIONS, null, msgs);
			msgs = basicSetDimensions(newDimensions, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2010Package.INTERACTION_CLASS_TYPE__DIMENSIONS, newDimensions, newDimensions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferenceType getTransportation() {
		return transportation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTransportation(ReferenceType newTransportation, NotificationChain msgs) {
		ReferenceType oldTransportation = transportation;
		transportation = newTransportation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2010Package.INTERACTION_CLASS_TYPE__TRANSPORTATION, oldTransportation, newTransportation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransportation(ReferenceType newTransportation) {
		if (newTransportation != transportation) {
			NotificationChain msgs = null;
			if (transportation != null)
				msgs = ((InternalEObject)transportation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2010Package.INTERACTION_CLASS_TYPE__TRANSPORTATION, null, msgs);
			if (newTransportation != null)
				msgs = ((InternalEObject)newTransportation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2010Package.INTERACTION_CLASS_TYPE__TRANSPORTATION, null, msgs);
			msgs = basicSetTransportation(newTransportation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2010Package.INTERACTION_CLASS_TYPE__TRANSPORTATION, newTransportation, newTransportation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrderType getOrder() {
		return order;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOrder(OrderType newOrder, NotificationChain msgs) {
		OrderType oldOrder = order;
		order = newOrder;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2010Package.INTERACTION_CLASS_TYPE__ORDER, oldOrder, newOrder);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrder(OrderType newOrder) {
		if (newOrder != order) {
			NotificationChain msgs = null;
			if (order != null)
				msgs = ((InternalEObject)order).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2010Package.INTERACTION_CLASS_TYPE__ORDER, null, msgs);
			if (newOrder != null)
				msgs = ((InternalEObject)newOrder).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2010Package.INTERACTION_CLASS_TYPE__ORDER, null, msgs);
			msgs = basicSetOrder(newOrder, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2010Package.INTERACTION_CLASS_TYPE__ORDER, newOrder, newOrder));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2010Package.INTERACTION_CLASS_TYPE__SEMANTICS, oldSemantics, newSemantics);
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
				msgs = ((InternalEObject)semantics).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2010Package.INTERACTION_CLASS_TYPE__SEMANTICS, null, msgs);
			if (newSemantics != null)
				msgs = ((InternalEObject)newSemantics).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2010Package.INTERACTION_CLASS_TYPE__SEMANTICS, null, msgs);
			msgs = basicSetSemantics(newSemantics, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2010Package.INTERACTION_CLASS_TYPE__SEMANTICS, newSemantics, newSemantics));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getParameter() {
		if (parameter == null) {
			parameter = new EObjectContainmentEList(ParameterType1.class, this, _2010Package.INTERACTION_CLASS_TYPE__PARAMETER);
		}
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getInteractionClass() {
		if (interactionClass == null) {
			interactionClass = new EObjectContainmentEList(InteractionClassType1.class, this, _2010Package.INTERACTION_CLASS_TYPE__INTERACTION_CLASS);
		}
		return interactionClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAny() {
		if (any == null) {
			any = new BasicFeatureMap(this, _2010Package.INTERACTION_CLASS_TYPE__ANY);
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
			eNotify(new ENotificationImpl(this, Notification.SET, _2010Package.INTERACTION_CLASS_TYPE__IDTAG, oldIdtag, idtag));
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
			eNotify(new ENotificationImpl(this, Notification.SET, _2010Package.INTERACTION_CLASS_TYPE__NOTES, oldNotes, notes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAnyAttribute() {
		if (anyAttribute == null) {
			anyAttribute = new BasicFeatureMap(this, _2010Package.INTERACTION_CLASS_TYPE__ANY_ATTRIBUTE);
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
			case _2010Package.INTERACTION_CLASS_TYPE__NAME:
				return basicSetName(null, msgs);
			case _2010Package.INTERACTION_CLASS_TYPE__SHARING:
				return basicSetSharing(null, msgs);
			case _2010Package.INTERACTION_CLASS_TYPE__DIMENSIONS:
				return basicSetDimensions(null, msgs);
			case _2010Package.INTERACTION_CLASS_TYPE__TRANSPORTATION:
				return basicSetTransportation(null, msgs);
			case _2010Package.INTERACTION_CLASS_TYPE__ORDER:
				return basicSetOrder(null, msgs);
			case _2010Package.INTERACTION_CLASS_TYPE__SEMANTICS:
				return basicSetSemantics(null, msgs);
			case _2010Package.INTERACTION_CLASS_TYPE__PARAMETER:
				return ((InternalEList)getParameter()).basicRemove(otherEnd, msgs);
			case _2010Package.INTERACTION_CLASS_TYPE__INTERACTION_CLASS:
				return ((InternalEList)getInteractionClass()).basicRemove(otherEnd, msgs);
			case _2010Package.INTERACTION_CLASS_TYPE__ANY:
				return ((InternalEList)getAny()).basicRemove(otherEnd, msgs);
			case _2010Package.INTERACTION_CLASS_TYPE__ANY_ATTRIBUTE:
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
			case _2010Package.INTERACTION_CLASS_TYPE__NAME:
				return getName();
			case _2010Package.INTERACTION_CLASS_TYPE__SHARING:
				return getSharing();
			case _2010Package.INTERACTION_CLASS_TYPE__DIMENSIONS:
				return getDimensions();
			case _2010Package.INTERACTION_CLASS_TYPE__TRANSPORTATION:
				return getTransportation();
			case _2010Package.INTERACTION_CLASS_TYPE__ORDER:
				return getOrder();
			case _2010Package.INTERACTION_CLASS_TYPE__SEMANTICS:
				return getSemantics();
			case _2010Package.INTERACTION_CLASS_TYPE__PARAMETER:
				return getParameter();
			case _2010Package.INTERACTION_CLASS_TYPE__INTERACTION_CLASS:
				return getInteractionClass();
			case _2010Package.INTERACTION_CLASS_TYPE__ANY:
				if (coreType) return getAny();
				return ((FeatureMap.Internal)getAny()).getWrapper();
			case _2010Package.INTERACTION_CLASS_TYPE__IDTAG:
				return getIdtag();
			case _2010Package.INTERACTION_CLASS_TYPE__NOTES:
				return getNotes();
			case _2010Package.INTERACTION_CLASS_TYPE__ANY_ATTRIBUTE:
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
			case _2010Package.INTERACTION_CLASS_TYPE__NAME:
				setName((IdentifierType)newValue);
				return;
			case _2010Package.INTERACTION_CLASS_TYPE__SHARING:
				setSharing((SharingType)newValue);
				return;
			case _2010Package.INTERACTION_CLASS_TYPE__DIMENSIONS:
				setDimensions((DimensionsType)newValue);
				return;
			case _2010Package.INTERACTION_CLASS_TYPE__TRANSPORTATION:
				setTransportation((ReferenceType)newValue);
				return;
			case _2010Package.INTERACTION_CLASS_TYPE__ORDER:
				setOrder((OrderType)newValue);
				return;
			case _2010Package.INTERACTION_CLASS_TYPE__SEMANTICS:
				setSemantics((org.sisostds.schemas.ieee1516._2010.String)newValue);
				return;
			case _2010Package.INTERACTION_CLASS_TYPE__PARAMETER:
				getParameter().clear();
				getParameter().addAll((Collection)newValue);
				return;
			case _2010Package.INTERACTION_CLASS_TYPE__INTERACTION_CLASS:
				getInteractionClass().clear();
				getInteractionClass().addAll((Collection)newValue);
				return;
			case _2010Package.INTERACTION_CLASS_TYPE__ANY:
				((FeatureMap.Internal)getAny()).set(newValue);
				return;
			case _2010Package.INTERACTION_CLASS_TYPE__IDTAG:
				setIdtag((String)newValue);
				return;
			case _2010Package.INTERACTION_CLASS_TYPE__NOTES:
				setNotes((List)newValue);
				return;
			case _2010Package.INTERACTION_CLASS_TYPE__ANY_ATTRIBUTE:
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
			case _2010Package.INTERACTION_CLASS_TYPE__NAME:
				setName((IdentifierType)null);
				return;
			case _2010Package.INTERACTION_CLASS_TYPE__SHARING:
				setSharing((SharingType)null);
				return;
			case _2010Package.INTERACTION_CLASS_TYPE__DIMENSIONS:
				setDimensions((DimensionsType)null);
				return;
			case _2010Package.INTERACTION_CLASS_TYPE__TRANSPORTATION:
				setTransportation((ReferenceType)null);
				return;
			case _2010Package.INTERACTION_CLASS_TYPE__ORDER:
				setOrder((OrderType)null);
				return;
			case _2010Package.INTERACTION_CLASS_TYPE__SEMANTICS:
				setSemantics((org.sisostds.schemas.ieee1516._2010.String)null);
				return;
			case _2010Package.INTERACTION_CLASS_TYPE__PARAMETER:
				getParameter().clear();
				return;
			case _2010Package.INTERACTION_CLASS_TYPE__INTERACTION_CLASS:
				getInteractionClass().clear();
				return;
			case _2010Package.INTERACTION_CLASS_TYPE__ANY:
				getAny().clear();
				return;
			case _2010Package.INTERACTION_CLASS_TYPE__IDTAG:
				setIdtag(IDTAG_EDEFAULT);
				return;
			case _2010Package.INTERACTION_CLASS_TYPE__NOTES:
				setNotes(NOTES_EDEFAULT);
				return;
			case _2010Package.INTERACTION_CLASS_TYPE__ANY_ATTRIBUTE:
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
			case _2010Package.INTERACTION_CLASS_TYPE__NAME:
				return name != null;
			case _2010Package.INTERACTION_CLASS_TYPE__SHARING:
				return sharing != null;
			case _2010Package.INTERACTION_CLASS_TYPE__DIMENSIONS:
				return dimensions != null;
			case _2010Package.INTERACTION_CLASS_TYPE__TRANSPORTATION:
				return transportation != null;
			case _2010Package.INTERACTION_CLASS_TYPE__ORDER:
				return order != null;
			case _2010Package.INTERACTION_CLASS_TYPE__SEMANTICS:
				return semantics != null;
			case _2010Package.INTERACTION_CLASS_TYPE__PARAMETER:
				return parameter != null && !parameter.isEmpty();
			case _2010Package.INTERACTION_CLASS_TYPE__INTERACTION_CLASS:
				return interactionClass != null && !interactionClass.isEmpty();
			case _2010Package.INTERACTION_CLASS_TYPE__ANY:
				return any != null && !any.isEmpty();
			case _2010Package.INTERACTION_CLASS_TYPE__IDTAG:
				return IDTAG_EDEFAULT == null ? idtag != null : !IDTAG_EDEFAULT.equals(idtag);
			case _2010Package.INTERACTION_CLASS_TYPE__NOTES:
				return NOTES_EDEFAULT == null ? notes != null : !NOTES_EDEFAULT.equals(notes);
			case _2010Package.INTERACTION_CLASS_TYPE__ANY_ATTRIBUTE:
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

} //InteractionClassTypeImpl
