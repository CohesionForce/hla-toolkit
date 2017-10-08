/**
 */
package org.sisostds.schemas.ieee1516._2010.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.sisostds.schemas.ieee1516._2010.ObjectModelType;
import org.sisostds.schemas.ieee1516._2010._2010Factory;
import org.sisostds.schemas.ieee1516._2010._2010Package;

/**
 * This is the item provider adapter for a {@link org.sisostds.schemas.ieee1516._2010.ObjectModelType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ObjectModelTypeItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectModelTypeItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addIdtagPropertyDescriptor(object);
			addNotes1PropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Idtag feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIdtagPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ObjectModelType_idtag_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ObjectModelType_idtag_feature", "_UI_ObjectModelType_type"),
				 _2010Package.eINSTANCE.getObjectModelType_Idtag(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Notes1 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNotes1PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ObjectModelType_notes1_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ObjectModelType_notes1_feature", "_UI_ObjectModelType_type"),
				 _2010Package.eINSTANCE.getObjectModelType_Notes1(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Collection getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(_2010Package.eINSTANCE.getObjectModelType_ModelIdentification());
			childrenFeatures.add(_2010Package.eINSTANCE.getObjectModelType_ServiceUtilization());
			childrenFeatures.add(_2010Package.eINSTANCE.getObjectModelType_Objects());
			childrenFeatures.add(_2010Package.eINSTANCE.getObjectModelType_Interactions());
			childrenFeatures.add(_2010Package.eINSTANCE.getObjectModelType_Dimensions());
			childrenFeatures.add(_2010Package.eINSTANCE.getObjectModelType_Time());
			childrenFeatures.add(_2010Package.eINSTANCE.getObjectModelType_Tags());
			childrenFeatures.add(_2010Package.eINSTANCE.getObjectModelType_Synchronizations());
			childrenFeatures.add(_2010Package.eINSTANCE.getObjectModelType_Transportations());
			childrenFeatures.add(_2010Package.eINSTANCE.getObjectModelType_Switches());
			childrenFeatures.add(_2010Package.eINSTANCE.getObjectModelType_UpdateRates());
			childrenFeatures.add(_2010Package.eINSTANCE.getObjectModelType_DataTypes());
			childrenFeatures.add(_2010Package.eINSTANCE.getObjectModelType_Notes());
			childrenFeatures.add(_2010Package.eINSTANCE.getObjectModelType_Any());
			childrenFeatures.add(_2010Package.eINSTANCE.getObjectModelType_AnyAttribute());
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns ObjectModelType.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ObjectModelType"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText(Object object) {
		String label = ((ObjectModelType)object).getIdtag();
		return label == null || label.length() == 0 ?
			getString("_UI_ObjectModelType_type") :
			getString("_UI_ObjectModelType_type") + " " + label;
	}
	

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(ObjectModelType.class)) {
			case _2010Package.OBJECT_MODEL_TYPE__IDTAG:
			case _2010Package.OBJECT_MODEL_TYPE__NOTES1:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case _2010Package.OBJECT_MODEL_TYPE__MODEL_IDENTIFICATION:
			case _2010Package.OBJECT_MODEL_TYPE__SERVICE_UTILIZATION:
			case _2010Package.OBJECT_MODEL_TYPE__OBJECTS:
			case _2010Package.OBJECT_MODEL_TYPE__INTERACTIONS:
			case _2010Package.OBJECT_MODEL_TYPE__DIMENSIONS:
			case _2010Package.OBJECT_MODEL_TYPE__TIME:
			case _2010Package.OBJECT_MODEL_TYPE__TAGS:
			case _2010Package.OBJECT_MODEL_TYPE__SYNCHRONIZATIONS:
			case _2010Package.OBJECT_MODEL_TYPE__TRANSPORTATIONS:
			case _2010Package.OBJECT_MODEL_TYPE__SWITCHES:
			case _2010Package.OBJECT_MODEL_TYPE__UPDATE_RATES:
			case _2010Package.OBJECT_MODEL_TYPE__DATA_TYPES:
			case _2010Package.OBJECT_MODEL_TYPE__NOTES:
			case _2010Package.OBJECT_MODEL_TYPE__ANY:
			case _2010Package.OBJECT_MODEL_TYPE__ANY_ATTRIBUTE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void collectNewChildDescriptors(Collection newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(_2010Package.eINSTANCE.getObjectModelType_ModelIdentification(),
				 _2010Factory.eINSTANCE.createModelIdentificationType()));

		newChildDescriptors.add
			(createChildParameter
				(_2010Package.eINSTANCE.getObjectModelType_ServiceUtilization(),
				 _2010Factory.eINSTANCE.createServiceUtilizationType()));

		newChildDescriptors.add
			(createChildParameter
				(_2010Package.eINSTANCE.getObjectModelType_Objects(),
				 _2010Factory.eINSTANCE.createObjectsType()));

		newChildDescriptors.add
			(createChildParameter
				(_2010Package.eINSTANCE.getObjectModelType_Interactions(),
				 _2010Factory.eINSTANCE.createInteractionsType()));

		newChildDescriptors.add
			(createChildParameter
				(_2010Package.eINSTANCE.getObjectModelType_Dimensions(),
				 _2010Factory.eINSTANCE.createDimensionsType1()));

		newChildDescriptors.add
			(createChildParameter
				(_2010Package.eINSTANCE.getObjectModelType_Time(),
				 _2010Factory.eINSTANCE.createTimeType()));

		newChildDescriptors.add
			(createChildParameter
				(_2010Package.eINSTANCE.getObjectModelType_Tags(),
				 _2010Factory.eINSTANCE.createTagsType()));

		newChildDescriptors.add
			(createChildParameter
				(_2010Package.eINSTANCE.getObjectModelType_Synchronizations(),
				 _2010Factory.eINSTANCE.createSynchronizationsType()));

		newChildDescriptors.add
			(createChildParameter
				(_2010Package.eINSTANCE.getObjectModelType_Transportations(),
				 _2010Factory.eINSTANCE.createTransportationsType()));

		newChildDescriptors.add
			(createChildParameter
				(_2010Package.eINSTANCE.getObjectModelType_Switches(),
				 _2010Factory.eINSTANCE.createSwitchesType()));

		newChildDescriptors.add
			(createChildParameter
				(_2010Package.eINSTANCE.getObjectModelType_UpdateRates(),
				 _2010Factory.eINSTANCE.createUpdateRatesType()));

		newChildDescriptors.add
			(createChildParameter
				(_2010Package.eINSTANCE.getObjectModelType_DataTypes(),
				 _2010Factory.eINSTANCE.createDataTypesType()));

		newChildDescriptors.add
			(createChildParameter
				(_2010Package.eINSTANCE.getObjectModelType_Notes(),
				 _2010Factory.eINSTANCE.createNotesType()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceLocator getResourceLocator() {
		return IEEE1516DIF2010EditPlugin.INSTANCE;
	}

}
