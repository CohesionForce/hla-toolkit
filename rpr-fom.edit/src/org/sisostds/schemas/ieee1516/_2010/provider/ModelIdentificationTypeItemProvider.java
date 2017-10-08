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

import org.sisostds.schemas.ieee1516._2010.ModelIdentificationType;
import org.sisostds.schemas.ieee1516._2010._2010Factory;
import org.sisostds.schemas.ieee1516._2010._2010Package;

/**
 * This is the item provider adapter for a {@link org.sisostds.schemas.ieee1516._2010.ModelIdentificationType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ModelIdentificationTypeItemProvider 
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
	public ModelIdentificationTypeItemProvider(AdapterFactory adapterFactory) {
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
				 getString("_UI_ModelIdentificationType_idtag_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ModelIdentificationType_idtag_feature", "_UI_ModelIdentificationType_type"),
				 _2010Package.eINSTANCE.getModelIdentificationType_Idtag(),
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
				 getString("_UI_ModelIdentificationType_notes_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ModelIdentificationType_notes_feature", "_UI_ModelIdentificationType_type"),
				 _2010Package.eINSTANCE.getModelIdentificationType_Notes(),
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
			childrenFeatures.add(_2010Package.eINSTANCE.getModelIdentificationType_Name());
			childrenFeatures.add(_2010Package.eINSTANCE.getModelIdentificationType_Type());
			childrenFeatures.add(_2010Package.eINSTANCE.getModelIdentificationType_Version());
			childrenFeatures.add(_2010Package.eINSTANCE.getModelIdentificationType_ModificationDate());
			childrenFeatures.add(_2010Package.eINSTANCE.getModelIdentificationType_SecurityClassification());
			childrenFeatures.add(_2010Package.eINSTANCE.getModelIdentificationType_ReleaseRestriction());
			childrenFeatures.add(_2010Package.eINSTANCE.getModelIdentificationType_Purpose());
			childrenFeatures.add(_2010Package.eINSTANCE.getModelIdentificationType_ApplicationDomain());
			childrenFeatures.add(_2010Package.eINSTANCE.getModelIdentificationType_Description());
			childrenFeatures.add(_2010Package.eINSTANCE.getModelIdentificationType_UseLimitation());
			childrenFeatures.add(_2010Package.eINSTANCE.getModelIdentificationType_UseHistory());
			childrenFeatures.add(_2010Package.eINSTANCE.getModelIdentificationType_Keyword());
			childrenFeatures.add(_2010Package.eINSTANCE.getModelIdentificationType_Poc());
			childrenFeatures.add(_2010Package.eINSTANCE.getModelIdentificationType_Reference());
			childrenFeatures.add(_2010Package.eINSTANCE.getModelIdentificationType_Other());
			childrenFeatures.add(_2010Package.eINSTANCE.getModelIdentificationType_Glyph());
			childrenFeatures.add(_2010Package.eINSTANCE.getModelIdentificationType_Any());
			childrenFeatures.add(_2010Package.eINSTANCE.getModelIdentificationType_AnyAttribute());
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
	 * This returns ModelIdentificationType.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ModelIdentificationType"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText(Object object) {
		String label = ((ModelIdentificationType)object).getIdtag();
		return label == null || label.length() == 0 ?
			getString("_UI_ModelIdentificationType_type") :
			getString("_UI_ModelIdentificationType_type") + " " + label;
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

		switch (notification.getFeatureID(ModelIdentificationType.class)) {
			case _2010Package.MODEL_IDENTIFICATION_TYPE__IDTAG:
			case _2010Package.MODEL_IDENTIFICATION_TYPE__NOTES:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case _2010Package.MODEL_IDENTIFICATION_TYPE__NAME:
			case _2010Package.MODEL_IDENTIFICATION_TYPE__TYPE:
			case _2010Package.MODEL_IDENTIFICATION_TYPE__VERSION:
			case _2010Package.MODEL_IDENTIFICATION_TYPE__MODIFICATION_DATE:
			case _2010Package.MODEL_IDENTIFICATION_TYPE__SECURITY_CLASSIFICATION:
			case _2010Package.MODEL_IDENTIFICATION_TYPE__RELEASE_RESTRICTION:
			case _2010Package.MODEL_IDENTIFICATION_TYPE__PURPOSE:
			case _2010Package.MODEL_IDENTIFICATION_TYPE__APPLICATION_DOMAIN:
			case _2010Package.MODEL_IDENTIFICATION_TYPE__DESCRIPTION:
			case _2010Package.MODEL_IDENTIFICATION_TYPE__USE_LIMITATION:
			case _2010Package.MODEL_IDENTIFICATION_TYPE__USE_HISTORY:
			case _2010Package.MODEL_IDENTIFICATION_TYPE__KEYWORD:
			case _2010Package.MODEL_IDENTIFICATION_TYPE__POC:
			case _2010Package.MODEL_IDENTIFICATION_TYPE__REFERENCE:
			case _2010Package.MODEL_IDENTIFICATION_TYPE__OTHER:
			case _2010Package.MODEL_IDENTIFICATION_TYPE__GLYPH:
			case _2010Package.MODEL_IDENTIFICATION_TYPE__ANY:
			case _2010Package.MODEL_IDENTIFICATION_TYPE__ANY_ATTRIBUTE:
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
				(_2010Package.eINSTANCE.getModelIdentificationType_Name(),
				 _2010Factory.eINSTANCE.createNonEmptyString1()));

		newChildDescriptors.add
			(createChildParameter
				(_2010Package.eINSTANCE.getModelIdentificationType_Type(),
				 _2010Factory.eINSTANCE.createModelType()));

		newChildDescriptors.add
			(createChildParameter
				(_2010Package.eINSTANCE.getModelIdentificationType_Version(),
				 _2010Factory.eINSTANCE.createNonEmptyString1()));

		newChildDescriptors.add
			(createChildParameter
				(_2010Package.eINSTANCE.getModelIdentificationType_ModificationDate(),
				 _2010Factory.eINSTANCE.createModificationDateType()));

		newChildDescriptors.add
			(createChildParameter
				(_2010Package.eINSTANCE.getModelIdentificationType_SecurityClassification(),
				 _2010Factory.eINSTANCE.createSecurityClassificationType()));

		newChildDescriptors.add
			(createChildParameter
				(_2010Package.eINSTANCE.getModelIdentificationType_ReleaseRestriction(),
				 _2010Factory.eINSTANCE.createString()));

		newChildDescriptors.add
			(createChildParameter
				(_2010Package.eINSTANCE.getModelIdentificationType_Purpose(),
				 _2010Factory.eINSTANCE.createString()));

		newChildDescriptors.add
			(createChildParameter
				(_2010Package.eINSTANCE.getModelIdentificationType_ApplicationDomain(),
				 _2010Factory.eINSTANCE.createApplicationDomainType()));

		newChildDescriptors.add
			(createChildParameter
				(_2010Package.eINSTANCE.getModelIdentificationType_Description(),
				 _2010Factory.eINSTANCE.createNonEmptyString1()));

		newChildDescriptors.add
			(createChildParameter
				(_2010Package.eINSTANCE.getModelIdentificationType_UseLimitation(),
				 _2010Factory.eINSTANCE.createString()));

		newChildDescriptors.add
			(createChildParameter
				(_2010Package.eINSTANCE.getModelIdentificationType_UseHistory(),
				 _2010Factory.eINSTANCE.createString()));

		newChildDescriptors.add
			(createChildParameter
				(_2010Package.eINSTANCE.getModelIdentificationType_Keyword(),
				 _2010Factory.eINSTANCE.createKeywordType()));

		newChildDescriptors.add
			(createChildParameter
				(_2010Package.eINSTANCE.getModelIdentificationType_Poc(),
				 _2010Factory.eINSTANCE.createPocType1()));

		newChildDescriptors.add
			(createChildParameter
				(_2010Package.eINSTANCE.getModelIdentificationType_Reference(),
				 _2010Factory.eINSTANCE.createIdReferenceType()));

		newChildDescriptors.add
			(createChildParameter
				(_2010Package.eINSTANCE.getModelIdentificationType_Other(),
				 _2010Factory.eINSTANCE.createString()));

		newChildDescriptors.add
			(createChildParameter
				(_2010Package.eINSTANCE.getModelIdentificationType_Glyph(),
				 _2010Factory.eINSTANCE.createGlyphType1()));
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
			childFeature == _2010Package.eINSTANCE.getModelIdentificationType_Name() ||
			childFeature == _2010Package.eINSTANCE.getModelIdentificationType_Version() ||
			childFeature == _2010Package.eINSTANCE.getModelIdentificationType_Description() ||
			childFeature == _2010Package.eINSTANCE.getModelIdentificationType_ReleaseRestriction() ||
			childFeature == _2010Package.eINSTANCE.getModelIdentificationType_Purpose() ||
			childFeature == _2010Package.eINSTANCE.getModelIdentificationType_UseLimitation() ||
			childFeature == _2010Package.eINSTANCE.getModelIdentificationType_UseHistory() ||
			childFeature == _2010Package.eINSTANCE.getModelIdentificationType_Other();

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
