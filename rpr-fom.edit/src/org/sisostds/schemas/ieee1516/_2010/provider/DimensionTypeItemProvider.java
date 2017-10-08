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

import org.sisostds.schemas.ieee1516._2010.DimensionType;
import org.sisostds.schemas.ieee1516._2010._2010Factory;
import org.sisostds.schemas.ieee1516._2010._2010Package;

/**
 * This is the item provider adapter for a {@link org.sisostds.schemas.ieee1516._2010.DimensionType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DimensionTypeItemProvider 
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
	public DimensionTypeItemProvider(AdapterFactory adapterFactory) {
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
				 getString("_UI_DimensionType_idtag_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DimensionType_idtag_feature", "_UI_DimensionType_type"),
				 _2010Package.eINSTANCE.getDimensionType_Idtag(),
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
				 getString("_UI_DimensionType_notes_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DimensionType_notes_feature", "_UI_DimensionType_type"),
				 _2010Package.eINSTANCE.getDimensionType_Notes(),
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
			childrenFeatures.add(_2010Package.eINSTANCE.getDimensionType_Name());
			childrenFeatures.add(_2010Package.eINSTANCE.getDimensionType_DataType());
			childrenFeatures.add(_2010Package.eINSTANCE.getDimensionType_UpperBound());
			childrenFeatures.add(_2010Package.eINSTANCE.getDimensionType_Normalization());
			childrenFeatures.add(_2010Package.eINSTANCE.getDimensionType_Value());
			childrenFeatures.add(_2010Package.eINSTANCE.getDimensionType_Any());
			childrenFeatures.add(_2010Package.eINSTANCE.getDimensionType_AnyAttribute());
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
	 * This returns DimensionType.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/DimensionType"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText(Object object) {
		String label = ((DimensionType)object).getIdtag();
		return label == null || label.length() == 0 ?
			getString("_UI_DimensionType_type") :
			getString("_UI_DimensionType_type") + " " + label;
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

		switch (notification.getFeatureID(DimensionType.class)) {
			case _2010Package.DIMENSION_TYPE__IDTAG:
			case _2010Package.DIMENSION_TYPE__NOTES:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case _2010Package.DIMENSION_TYPE__NAME:
			case _2010Package.DIMENSION_TYPE__DATA_TYPE:
			case _2010Package.DIMENSION_TYPE__UPPER_BOUND:
			case _2010Package.DIMENSION_TYPE__NORMALIZATION:
			case _2010Package.DIMENSION_TYPE__VALUE:
			case _2010Package.DIMENSION_TYPE__ANY:
			case _2010Package.DIMENSION_TYPE__ANY_ATTRIBUTE:
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
				(_2010Package.eINSTANCE.getDimensionType_Name(),
				 _2010Factory.eINSTANCE.createIdentifierType()));

		newChildDescriptors.add
			(createChildParameter
				(_2010Package.eINSTANCE.getDimensionType_DataType(),
				 _2010Factory.eINSTANCE.createReferenceType()));

		newChildDescriptors.add
			(createChildParameter
				(_2010Package.eINSTANCE.getDimensionType_UpperBound(),
				 _2010Factory.eINSTANCE.createUpperBoundType()));

		newChildDescriptors.add
			(createChildParameter
				(_2010Package.eINSTANCE.getDimensionType_Normalization(),
				 _2010Factory.eINSTANCE.createNonEmptyString1()));

		newChildDescriptors.add
			(createChildParameter
				(_2010Package.eINSTANCE.getDimensionType_Value(),
				 _2010Factory.eINSTANCE.createValueType()));
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
