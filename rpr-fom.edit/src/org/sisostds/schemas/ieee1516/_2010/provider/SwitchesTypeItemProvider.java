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

import org.sisostds.schemas.ieee1516._2010.SwitchesType;
import org.sisostds.schemas.ieee1516._2010._2010Factory;
import org.sisostds.schemas.ieee1516._2010._2010Package;

/**
 * This is the item provider adapter for a {@link org.sisostds.schemas.ieee1516._2010.SwitchesType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SwitchesTypeItemProvider 
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
	public SwitchesTypeItemProvider(AdapterFactory adapterFactory) {
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
				 getString("_UI_SwitchesType_idtag_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SwitchesType_idtag_feature", "_UI_SwitchesType_type"),
				 _2010Package.eINSTANCE.getSwitchesType_Idtag(),
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
				 getString("_UI_SwitchesType_notes_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SwitchesType_notes_feature", "_UI_SwitchesType_type"),
				 _2010Package.eINSTANCE.getSwitchesType_Notes(),
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
			childrenFeatures.add(_2010Package.eINSTANCE.getSwitchesType_AutoProvide());
			childrenFeatures.add(_2010Package.eINSTANCE.getSwitchesType_ConveyRegionDesignatorSets());
			childrenFeatures.add(_2010Package.eINSTANCE.getSwitchesType_ConveyProducingFederate());
			childrenFeatures.add(_2010Package.eINSTANCE.getSwitchesType_AttributeScopeAdvisory());
			childrenFeatures.add(_2010Package.eINSTANCE.getSwitchesType_AttributeRelevanceAdvisory());
			childrenFeatures.add(_2010Package.eINSTANCE.getSwitchesType_ObjectClassRelevanceAdvisory());
			childrenFeatures.add(_2010Package.eINSTANCE.getSwitchesType_InteractionRelevanceAdvisory());
			childrenFeatures.add(_2010Package.eINSTANCE.getSwitchesType_ServiceReporting());
			childrenFeatures.add(_2010Package.eINSTANCE.getSwitchesType_ExceptionReporting());
			childrenFeatures.add(_2010Package.eINSTANCE.getSwitchesType_DelaySubscriptionEvaluation());
			childrenFeatures.add(_2010Package.eINSTANCE.getSwitchesType_AutomaticResignAction());
			childrenFeatures.add(_2010Package.eINSTANCE.getSwitchesType_Any());
			childrenFeatures.add(_2010Package.eINSTANCE.getSwitchesType_AnyAttribute());
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
	 * This returns SwitchesType.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/SwitchesType"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText(Object object) {
		String label = ((SwitchesType)object).getIdtag();
		return label == null || label.length() == 0 ?
			getString("_UI_SwitchesType_type") :
			getString("_UI_SwitchesType_type") + " " + label;
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

		switch (notification.getFeatureID(SwitchesType.class)) {
			case _2010Package.SWITCHES_TYPE__IDTAG:
			case _2010Package.SWITCHES_TYPE__NOTES:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case _2010Package.SWITCHES_TYPE__AUTO_PROVIDE:
			case _2010Package.SWITCHES_TYPE__CONVEY_REGION_DESIGNATOR_SETS:
			case _2010Package.SWITCHES_TYPE__CONVEY_PRODUCING_FEDERATE:
			case _2010Package.SWITCHES_TYPE__ATTRIBUTE_SCOPE_ADVISORY:
			case _2010Package.SWITCHES_TYPE__ATTRIBUTE_RELEVANCE_ADVISORY:
			case _2010Package.SWITCHES_TYPE__OBJECT_CLASS_RELEVANCE_ADVISORY:
			case _2010Package.SWITCHES_TYPE__INTERACTION_RELEVANCE_ADVISORY:
			case _2010Package.SWITCHES_TYPE__SERVICE_REPORTING:
			case _2010Package.SWITCHES_TYPE__EXCEPTION_REPORTING:
			case _2010Package.SWITCHES_TYPE__DELAY_SUBSCRIPTION_EVALUATION:
			case _2010Package.SWITCHES_TYPE__AUTOMATIC_RESIGN_ACTION:
			case _2010Package.SWITCHES_TYPE__ANY:
			case _2010Package.SWITCHES_TYPE__ANY_ATTRIBUTE:
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
				(_2010Package.eINSTANCE.getSwitchesType_AutoProvide(),
				 _2010Factory.eINSTANCE.createSwitchType()));

		newChildDescriptors.add
			(createChildParameter
				(_2010Package.eINSTANCE.getSwitchesType_ConveyRegionDesignatorSets(),
				 _2010Factory.eINSTANCE.createSwitchType()));

		newChildDescriptors.add
			(createChildParameter
				(_2010Package.eINSTANCE.getSwitchesType_ConveyProducingFederate(),
				 _2010Factory.eINSTANCE.createSwitchType()));

		newChildDescriptors.add
			(createChildParameter
				(_2010Package.eINSTANCE.getSwitchesType_AttributeScopeAdvisory(),
				 _2010Factory.eINSTANCE.createSwitchType()));

		newChildDescriptors.add
			(createChildParameter
				(_2010Package.eINSTANCE.getSwitchesType_AttributeRelevanceAdvisory(),
				 _2010Factory.eINSTANCE.createSwitchType()));

		newChildDescriptors.add
			(createChildParameter
				(_2010Package.eINSTANCE.getSwitchesType_ObjectClassRelevanceAdvisory(),
				 _2010Factory.eINSTANCE.createSwitchType()));

		newChildDescriptors.add
			(createChildParameter
				(_2010Package.eINSTANCE.getSwitchesType_InteractionRelevanceAdvisory(),
				 _2010Factory.eINSTANCE.createSwitchType()));

		newChildDescriptors.add
			(createChildParameter
				(_2010Package.eINSTANCE.getSwitchesType_ServiceReporting(),
				 _2010Factory.eINSTANCE.createSwitchType()));

		newChildDescriptors.add
			(createChildParameter
				(_2010Package.eINSTANCE.getSwitchesType_ExceptionReporting(),
				 _2010Factory.eINSTANCE.createSwitchType()));

		newChildDescriptors.add
			(createChildParameter
				(_2010Package.eINSTANCE.getSwitchesType_DelaySubscriptionEvaluation(),
				 _2010Factory.eINSTANCE.createSwitchType()));

		newChildDescriptors.add
			(createChildParameter
				(_2010Package.eINSTANCE.getSwitchesType_AutomaticResignAction(),
				 _2010Factory.eINSTANCE.createResignSwitchType()));
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
			childFeature == _2010Package.eINSTANCE.getSwitchesType_AutoProvide() ||
			childFeature == _2010Package.eINSTANCE.getSwitchesType_ConveyRegionDesignatorSets() ||
			childFeature == _2010Package.eINSTANCE.getSwitchesType_ConveyProducingFederate() ||
			childFeature == _2010Package.eINSTANCE.getSwitchesType_AttributeScopeAdvisory() ||
			childFeature == _2010Package.eINSTANCE.getSwitchesType_AttributeRelevanceAdvisory() ||
			childFeature == _2010Package.eINSTANCE.getSwitchesType_ObjectClassRelevanceAdvisory() ||
			childFeature == _2010Package.eINSTANCE.getSwitchesType_InteractionRelevanceAdvisory() ||
			childFeature == _2010Package.eINSTANCE.getSwitchesType_ServiceReporting() ||
			childFeature == _2010Package.eINSTANCE.getSwitchesType_ExceptionReporting() ||
			childFeature == _2010Package.eINSTANCE.getSwitchesType_DelaySubscriptionEvaluation();

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
