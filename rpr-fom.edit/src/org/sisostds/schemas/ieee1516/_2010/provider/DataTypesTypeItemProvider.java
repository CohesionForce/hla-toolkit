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

import org.sisostds.schemas.ieee1516._2010.DataTypesType;
import org.sisostds.schemas.ieee1516._2010._2010Factory;
import org.sisostds.schemas.ieee1516._2010._2010Package;

/**
 * This is the item provider adapter for a {@link org.sisostds.schemas.ieee1516._2010.DataTypesType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DataTypesTypeItemProvider 
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
	public DataTypesTypeItemProvider(AdapterFactory adapterFactory) {
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
			addNotesPropertyDescriptor(object);
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
				 getString("_UI_DataTypesType_idtag_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DataTypesType_idtag_feature", "_UI_DataTypesType_type"),
				 _2010Package.eINSTANCE.getDataTypesType_Idtag(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Notes feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNotesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DataTypesType_notes_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DataTypesType_notes_feature", "_UI_DataTypesType_type"),
				 _2010Package.eINSTANCE.getDataTypesType_Notes(),
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
			childrenFeatures.add(_2010Package.eINSTANCE.getDataTypesType_BasicDataRepresentations());
			childrenFeatures.add(_2010Package.eINSTANCE.getDataTypesType_SimpleDataTypes());
			childrenFeatures.add(_2010Package.eINSTANCE.getDataTypesType_EnumeratedDataTypes());
			childrenFeatures.add(_2010Package.eINSTANCE.getDataTypesType_ArrayDataTypes());
			childrenFeatures.add(_2010Package.eINSTANCE.getDataTypesType_FixedRecordDataTypes());
			childrenFeatures.add(_2010Package.eINSTANCE.getDataTypesType_VariantRecordDataTypes());
			childrenFeatures.add(_2010Package.eINSTANCE.getDataTypesType_Any());
			childrenFeatures.add(_2010Package.eINSTANCE.getDataTypesType_AnyAttribute());
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
	 * This returns DataTypesType.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/DataTypesType"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText(Object object) {
		String label = ((DataTypesType)object).getIdtag();
		return label == null || label.length() == 0 ?
			getString("_UI_DataTypesType_type") :
			getString("_UI_DataTypesType_type") + " " + label;
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

		switch (notification.getFeatureID(DataTypesType.class)) {
			case _2010Package.DATA_TYPES_TYPE__IDTAG:
			case _2010Package.DATA_TYPES_TYPE__NOTES:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case _2010Package.DATA_TYPES_TYPE__BASIC_DATA_REPRESENTATIONS:
			case _2010Package.DATA_TYPES_TYPE__SIMPLE_DATA_TYPES:
			case _2010Package.DATA_TYPES_TYPE__ENUMERATED_DATA_TYPES:
			case _2010Package.DATA_TYPES_TYPE__ARRAY_DATA_TYPES:
			case _2010Package.DATA_TYPES_TYPE__FIXED_RECORD_DATA_TYPES:
			case _2010Package.DATA_TYPES_TYPE__VARIANT_RECORD_DATA_TYPES:
			case _2010Package.DATA_TYPES_TYPE__ANY:
			case _2010Package.DATA_TYPES_TYPE__ANY_ATTRIBUTE:
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
				(_2010Package.eINSTANCE.getDataTypesType_BasicDataRepresentations(),
				 _2010Factory.eINSTANCE.createBasicDataRepresentationsType()));

		newChildDescriptors.add
			(createChildParameter
				(_2010Package.eINSTANCE.getDataTypesType_SimpleDataTypes(),
				 _2010Factory.eINSTANCE.createSimpleDataTypesType()));

		newChildDescriptors.add
			(createChildParameter
				(_2010Package.eINSTANCE.getDataTypesType_EnumeratedDataTypes(),
				 _2010Factory.eINSTANCE.createEnumeratedDataTypesType()));

		newChildDescriptors.add
			(createChildParameter
				(_2010Package.eINSTANCE.getDataTypesType_ArrayDataTypes(),
				 _2010Factory.eINSTANCE.createArrayDataTypesType1()));

		newChildDescriptors.add
			(createChildParameter
				(_2010Package.eINSTANCE.getDataTypesType_FixedRecordDataTypes(),
				 _2010Factory.eINSTANCE.createFixedRecordDataTypesType()));

		newChildDescriptors.add
			(createChildParameter
				(_2010Package.eINSTANCE.getDataTypesType_VariantRecordDataTypes(),
				 _2010Factory.eINSTANCE.createVariantRecordDataTypesType()));
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
