/**
 */
package org.sisostds.schemas.ieee1516._2010.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.FeatureMapUtil;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.sisostds.schemas.ieee1516._2010.TagsType;
import org.sisostds.schemas.ieee1516._2010._2010Factory;
import org.sisostds.schemas.ieee1516._2010._2010Package;

/**
 * This is the item provider adapter for a {@link org.sisostds.schemas.ieee1516._2010.TagsType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TagsTypeItemProvider 
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
	public TagsTypeItemProvider(AdapterFactory adapterFactory) {
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
				 getString("_UI_TagsType_idtag_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TagsType_idtag_feature", "_UI_TagsType_type"),
				 _2010Package.eINSTANCE.getTagsType_Idtag(),
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
				 getString("_UI_TagsType_notes_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TagsType_notes_feature", "_UI_TagsType_type"),
				 _2010Package.eINSTANCE.getTagsType_Notes(),
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
			childrenFeatures.add(_2010Package.eINSTANCE.getTagsType_UpdateReflectTag());
			childrenFeatures.add(_2010Package.eINSTANCE.getTagsType_SendReceiveTag());
			childrenFeatures.add(_2010Package.eINSTANCE.getTagsType_DeleteRemoveTag());
			childrenFeatures.add(_2010Package.eINSTANCE.getTagsType_DivestitureRequestTag());
			childrenFeatures.add(_2010Package.eINSTANCE.getTagsType_DivestitureCompletionTag());
			childrenFeatures.add(_2010Package.eINSTANCE.getTagsType_AcquisitionRequestTag());
			childrenFeatures.add(_2010Package.eINSTANCE.getTagsType_RequestUpdateTag());
			childrenFeatures.add(_2010Package.eINSTANCE.getTagsType_Any());
			childrenFeatures.add(_2010Package.eINSTANCE.getTagsType_AnyAttribute());
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
	 * This returns TagsType.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/TagsType"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText(Object object) {
		String label = ((TagsType)object).getIdtag();
		return label == null || label.length() == 0 ?
			getString("_UI_TagsType_type") :
			getString("_UI_TagsType_type") + " " + label;
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

		switch (notification.getFeatureID(TagsType.class)) {
			case _2010Package.TAGS_TYPE__IDTAG:
			case _2010Package.TAGS_TYPE__NOTES:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case _2010Package.TAGS_TYPE__UPDATE_REFLECT_TAG:
			case _2010Package.TAGS_TYPE__SEND_RECEIVE_TAG:
			case _2010Package.TAGS_TYPE__DELETE_REMOVE_TAG:
			case _2010Package.TAGS_TYPE__DIVESTITURE_REQUEST_TAG:
			case _2010Package.TAGS_TYPE__DIVESTITURE_COMPLETION_TAG:
			case _2010Package.TAGS_TYPE__ACQUISITION_REQUEST_TAG:
			case _2010Package.TAGS_TYPE__REQUEST_UPDATE_TAG:
			case _2010Package.TAGS_TYPE__ANY:
			case _2010Package.TAGS_TYPE__ANY_ATTRIBUTE:
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
				(_2010Package.eINSTANCE.getTagsType_UpdateReflectTag(),
				 _2010Factory.eINSTANCE.createTagType()));

		newChildDescriptors.add
			(createChildParameter
				(_2010Package.eINSTANCE.getTagsType_SendReceiveTag(),
				 _2010Factory.eINSTANCE.createTagType()));

		newChildDescriptors.add
			(createChildParameter
				(_2010Package.eINSTANCE.getTagsType_DeleteRemoveTag(),
				 _2010Factory.eINSTANCE.createTagType()));

		newChildDescriptors.add
			(createChildParameter
				(_2010Package.eINSTANCE.getTagsType_DivestitureRequestTag(),
				 _2010Factory.eINSTANCE.createTagType()));

		newChildDescriptors.add
			(createChildParameter
				(_2010Package.eINSTANCE.getTagsType_DivestitureCompletionTag(),
				 _2010Factory.eINSTANCE.createTagType()));

		newChildDescriptors.add
			(createChildParameter
				(_2010Package.eINSTANCE.getTagsType_AcquisitionRequestTag(),
				 _2010Factory.eINSTANCE.createTagType()));

		newChildDescriptors.add
			(createChildParameter
				(_2010Package.eINSTANCE.getTagsType_RequestUpdateTag(),
				 _2010Factory.eINSTANCE.createTagType()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCreateChildText(Object owner, Object feature, Object child, Collection selection) {
		Object childFeature = feature;
		Object childObject = child;

		if (childFeature instanceof EStructuralFeature && FeatureMapUtil.isFeatureMap((EStructuralFeature)childFeature)) {
			FeatureMap.Entry entry = (FeatureMap.Entry)childObject;
			childFeature = entry.getEStructuralFeature();
			childObject = entry.getValue();
		}

		boolean qualify =
			childFeature == _2010Package.eINSTANCE.getTagsType_UpdateReflectTag() ||
			childFeature == _2010Package.eINSTANCE.getTagsType_SendReceiveTag() ||
			childFeature == _2010Package.eINSTANCE.getTagsType_DeleteRemoveTag() ||
			childFeature == _2010Package.eINSTANCE.getTagsType_DivestitureRequestTag() ||
			childFeature == _2010Package.eINSTANCE.getTagsType_DivestitureCompletionTag() ||
			childFeature == _2010Package.eINSTANCE.getTagsType_AcquisitionRequestTag() ||
			childFeature == _2010Package.eINSTANCE.getTagsType_RequestUpdateTag();

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
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
