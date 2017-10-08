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

import org.sisostds.schemas.ieee1516._2010.ServiceUtilizationType;
import org.sisostds.schemas.ieee1516._2010._2010Factory;
import org.sisostds.schemas.ieee1516._2010._2010Package;

/**
 * This is the item provider adapter for a {@link org.sisostds.schemas.ieee1516._2010.ServiceUtilizationType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ServiceUtilizationTypeItemProvider 
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
	public ServiceUtilizationTypeItemProvider(AdapterFactory adapterFactory) {
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
				 getString("_UI_ServiceUtilizationType_idtag_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ServiceUtilizationType_idtag_feature", "_UI_ServiceUtilizationType_type"),
				 _2010Package.eINSTANCE.getServiceUtilizationType_Idtag(),
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
				 getString("_UI_ServiceUtilizationType_notes_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ServiceUtilizationType_notes_feature", "_UI_ServiceUtilizationType_type"),
				 _2010Package.eINSTANCE.getServiceUtilizationType_Notes(),
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
			childrenFeatures.add(_2010Package.eINSTANCE.getServiceUtilizationType_Connect());
			childrenFeatures.add(_2010Package.eINSTANCE.getServiceUtilizationType_Disconnect());
			childrenFeatures.add(_2010Package.eINSTANCE.getServiceUtilizationType_ConnectionLost());
			childrenFeatures.add(_2010Package.eINSTANCE.getServiceUtilizationType_CreateFederationExecution());
			childrenFeatures.add(_2010Package.eINSTANCE.getServiceUtilizationType_DestroyFederationExecution());
			childrenFeatures.add(_2010Package.eINSTANCE.getServiceUtilizationType_ListFederationExecutions());
			childrenFeatures.add(_2010Package.eINSTANCE.getServiceUtilizationType_ReportFederationExecutions());
			childrenFeatures.add(_2010Package.eINSTANCE.getServiceUtilizationType_JoinFederationExecution());
			childrenFeatures.add(_2010Package.eINSTANCE.getServiceUtilizationType_ResignFederationExecution());
			childrenFeatures.add(_2010Package.eINSTANCE.getServiceUtilizationType_RegisterFederationSynchronizationPoint());
			childrenFeatures.add(_2010Package.eINSTANCE.getServiceUtilizationType_ConfirmSynchronizationPointRegistration());
			childrenFeatures.add(_2010Package.eINSTANCE.getServiceUtilizationType_AnnounceSynchronizationPoint());
			childrenFeatures.add(_2010Package.eINSTANCE.getServiceUtilizationType_SynchronizationPointAchieved());
			childrenFeatures.add(_2010Package.eINSTANCE.getServiceUtilizationType_FederationSynchronized());
			childrenFeatures.add(_2010Package.eINSTANCE.getServiceUtilizationType_RequestFederationSave());
			childrenFeatures.add(_2010Package.eINSTANCE.getServiceUtilizationType_InitiateFederateSave());
			childrenFeatures.add(_2010Package.eINSTANCE.getServiceUtilizationType_FederateSaveBegun());
			childrenFeatures.add(_2010Package.eINSTANCE.getServiceUtilizationType_FederateSaveComplete());
			childrenFeatures.add(_2010Package.eINSTANCE.getServiceUtilizationType_FederationSaved());
			childrenFeatures.add(_2010Package.eINSTANCE.getServiceUtilizationType_AbortFederationSave());
			childrenFeatures.add(_2010Package.eINSTANCE.getServiceUtilizationType_QueryFederationSaveStatus());
			childrenFeatures.add(_2010Package.eINSTANCE.getServiceUtilizationType_FederationSaveStatusResponse());
			childrenFeatures.add(_2010Package.eINSTANCE.getServiceUtilizationType_RequestFederationRestore());
			childrenFeatures.add(_2010Package.eINSTANCE.getServiceUtilizationType_ConfirmFederationRestorationRequest());
			childrenFeatures.add(_2010Package.eINSTANCE.getServiceUtilizationType_FederationRestoreBegun());
			childrenFeatures.add(_2010Package.eINSTANCE.getServiceUtilizationType_InitiateFederateRestore());
			childrenFeatures.add(_2010Package.eINSTANCE.getServiceUtilizationType_FederateRestoreComplete());
			childrenFeatures.add(_2010Package.eINSTANCE.getServiceUtilizationType_FederationRestored());
			childrenFeatures.add(_2010Package.eINSTANCE.getServiceUtilizationType_AbortFederationRestore());
			childrenFeatures.add(_2010Package.eINSTANCE.getServiceUtilizationType_QueryFederationRestoreStatus());
			childrenFeatures.add(_2010Package.eINSTANCE.getServiceUtilizationType_FederationRestoreStatusResponse());
			childrenFeatures.add(_2010Package.eINSTANCE.getServiceUtilizationType_PublishObjectClassAttributes());
			childrenFeatures.add(_2010Package.eINSTANCE.getServiceUtilizationType_UnpublishObjectClassAttributes());
			childrenFeatures.add(_2010Package.eINSTANCE.getServiceUtilizationType_PublishInteractionClass());
			childrenFeatures.add(_2010Package.eINSTANCE.getServiceUtilizationType_UnpublishInteractionClass());
			childrenFeatures.add(_2010Package.eINSTANCE.getServiceUtilizationType_SubscribeObjectClassAttributes());
			childrenFeatures.add(_2010Package.eINSTANCE.getServiceUtilizationType_UnsubscribeObjectClassAttributes());
			childrenFeatures.add(_2010Package.eINSTANCE.getServiceUtilizationType_SubscribeInteractionClass());
			childrenFeatures.add(_2010Package.eINSTANCE.getServiceUtilizationType_UnsubscribeInteractionClass());
			childrenFeatures.add(_2010Package.eINSTANCE.getServiceUtilizationType_StartRegistrationForObjectClass());
			childrenFeatures.add(_2010Package.eINSTANCE.getServiceUtilizationType_StopRegistrationForObjectClass());
			childrenFeatures.add(_2010Package.eINSTANCE.getServiceUtilizationType_TurnInteractionsOn());
			childrenFeatures.add(_2010Package.eINSTANCE.getServiceUtilizationType_TurnInteractionsOff());
			childrenFeatures.add(_2010Package.eINSTANCE.getServiceUtilizationType_ReserveObjectInstanceName());
			childrenFeatures.add(_2010Package.eINSTANCE.getServiceUtilizationType_ObjectInstanceNameReserved());
			childrenFeatures.add(_2010Package.eINSTANCE.getServiceUtilizationType_ReleaseObjectInstanceName());
			childrenFeatures.add(_2010Package.eINSTANCE.getServiceUtilizationType_ReserveMultipleObjectInstanceNames());
			childrenFeatures.add(_2010Package.eINSTANCE.getServiceUtilizationType_MultipleObjectInstanceNamesReserved());
			childrenFeatures.add(_2010Package.eINSTANCE.getServiceUtilizationType_ReleaseMultipleObjectInstanceNames());
			childrenFeatures.add(_2010Package.eINSTANCE.getServiceUtilizationType_RegisterObjectInstance());
			childrenFeatures.add(_2010Package.eINSTANCE.getServiceUtilizationType_DiscoverObjectInstance());
			childrenFeatures.add(_2010Package.eINSTANCE.getServiceUtilizationType_UpdateAttributeValues());
			childrenFeatures.add(_2010Package.eINSTANCE.getServiceUtilizationType_ReflectAttributeValues());
			childrenFeatures.add(_2010Package.eINSTANCE.getServiceUtilizationType_SendInteraction());
			childrenFeatures.add(_2010Package.eINSTANCE.getServiceUtilizationType_ReceiveInteraction());
			childrenFeatures.add(_2010Package.eINSTANCE.getServiceUtilizationType_DeleteObjectInstance());
			childrenFeatures.add(_2010Package.eINSTANCE.getServiceUtilizationType_Removeobjectinstance());
			childrenFeatures.add(_2010Package.eINSTANCE.getServiceUtilizationType_LocalDeleteObjectInstance());
			childrenFeatures.add(_2010Package.eINSTANCE.getServiceUtilizationType_AttributesInScope());
			childrenFeatures.add(_2010Package.eINSTANCE.getServiceUtilizationType_AttributesOutOfScope());
			childrenFeatures.add(_2010Package.eINSTANCE.getServiceUtilizationType_RequestAttributeValueUpdate());
			childrenFeatures.add(_2010Package.eINSTANCE.getServiceUtilizationType_ProvideAttributeValueUpdate());
			childrenFeatures.add(_2010Package.eINSTANCE.getServiceUtilizationType_TurnUpdatesOnForObjectInstance());
			childrenFeatures.add(_2010Package.eINSTANCE.getServiceUtilizationType_TurnUpdatesOffForObjectInstance());
			childrenFeatures.add(_2010Package.eINSTANCE.getServiceUtilizationType_RequestAttributeTransportationTypeChange());
			childrenFeatures.add(_2010Package.eINSTANCE.getServiceUtilizationType_ConfirmAttributeTransportationTypeChange());
			childrenFeatures.add(_2010Package.eINSTANCE.getServiceUtilizationType_QueryAttributeTransportationType());
			childrenFeatures.add(_2010Package.eINSTANCE.getServiceUtilizationType_ReportAttributeTransportationType());
			childrenFeatures.add(_2010Package.eINSTANCE.getServiceUtilizationType_RequestInteractionTransportationTypeChange());
			childrenFeatures.add(_2010Package.eINSTANCE.getServiceUtilizationType_ConfirmInteractionTransportationTypeChange());
			childrenFeatures.add(_2010Package.eINSTANCE.getServiceUtilizationType_QueryInteractionTransportationType());
			childrenFeatures.add(_2010Package.eINSTANCE.getServiceUtilizationType_ReportInteractionTransportationType());
			childrenFeatures.add(_2010Package.eINSTANCE.getServiceUtilizationType_UnconditionalAttributeOwnershipDivestiture());
			childrenFeatures.add(_2010Package.eINSTANCE.getServiceUtilizationType_NegotiatedAttributeOwnershipDivestiture());
			childrenFeatures.add(_2010Package.eINSTANCE.getServiceUtilizationType_RequestAttributeOwnershipAssumption());
			childrenFeatures.add(_2010Package.eINSTANCE.getServiceUtilizationType_RequestDivestitureConfirmation());
			childrenFeatures.add(_2010Package.eINSTANCE.getServiceUtilizationType_ConfirmDivestiture());
			childrenFeatures.add(_2010Package.eINSTANCE.getServiceUtilizationType_AttributeOwnershipAcquisitionNotification());
			childrenFeatures.add(_2010Package.eINSTANCE.getServiceUtilizationType_AttributeOwnershipAcquisition());
			childrenFeatures.add(_2010Package.eINSTANCE.getServiceUtilizationType_AttributeOwnershipAcquisitionIfAvailable());
			childrenFeatures.add(_2010Package.eINSTANCE.getServiceUtilizationType_AttributeOwnershipUnavailable());
			childrenFeatures.add(_2010Package.eINSTANCE.getServiceUtilizationType_RequestAttributeOwnershipRelease());
			childrenFeatures.add(_2010Package.eINSTANCE.getServiceUtilizationType_AttributeOwnershipReleaseDenied());
			childrenFeatures.add(_2010Package.eINSTANCE.getServiceUtilizationType_AttributeOwnershipDivestitureIfWanted());
			childrenFeatures.add(_2010Package.eINSTANCE.getServiceUtilizationType_CancelNegotiatedAttributeOwnershipDivestiture());
			childrenFeatures.add(_2010Package.eINSTANCE.getServiceUtilizationType_CancelAttributeOwnershipAcquisition());
			childrenFeatures.add(_2010Package.eINSTANCE.getServiceUtilizationType_ConfirmAttributeOwnershipAcquisitionCancellation());
			childrenFeatures.add(_2010Package.eINSTANCE.getServiceUtilizationType_QueryAttributeOwnership());
			childrenFeatures.add(_2010Package.eINSTANCE.getServiceUtilizationType_InformAttributeOwnership());
			childrenFeatures.add(_2010Package.eINSTANCE.getServiceUtilizationType_IsAttributeOwnedByFederate());
			childrenFeatures.add(_2010Package.eINSTANCE.getServiceUtilizationType_EnableTimeRegulation());
			childrenFeatures.add(_2010Package.eINSTANCE.getServiceUtilizationType_TimeRegulationEnabled());
			childrenFeatures.add(_2010Package.eINSTANCE.getServiceUtilizationType_DisableTimeRegulation());
			childrenFeatures.add(_2010Package.eINSTANCE.getServiceUtilizationType_EnableTimeConstrained());
			childrenFeatures.add(_2010Package.eINSTANCE.getServiceUtilizationType_TimeConstrainedEnabled());
			childrenFeatures.add(_2010Package.eINSTANCE.getServiceUtilizationType_DisableTimeConstrained());
			childrenFeatures.add(_2010Package.eINSTANCE.getServiceUtilizationType_TimeAdvanceRequest());
			childrenFeatures.add(_2010Package.eINSTANCE.getServiceUtilizationType_TimeAdvanceRequestAvailable());
			childrenFeatures.add(_2010Package.eINSTANCE.getServiceUtilizationType_NextMessageRequest());
			childrenFeatures.add(_2010Package.eINSTANCE.getServiceUtilizationType_NextMessageRequestAvailable());
			childrenFeatures.add(_2010Package.eINSTANCE.getServiceUtilizationType_FlushQueueRequest());
			childrenFeatures.add(_2010Package.eINSTANCE.getServiceUtilizationType_TimeAdvanceGrant());
			childrenFeatures.add(_2010Package.eINSTANCE.getServiceUtilizationType_EnableAsynchronousDelivery());
			childrenFeatures.add(_2010Package.eINSTANCE.getServiceUtilizationType_DisableAsynchronousDelivery());
			childrenFeatures.add(_2010Package.eINSTANCE.getServiceUtilizationType_QueryGALT());
			childrenFeatures.add(_2010Package.eINSTANCE.getServiceUtilizationType_QueryLogicalTime());
			childrenFeatures.add(_2010Package.eINSTANCE.getServiceUtilizationType_QueryLITS());
			childrenFeatures.add(_2010Package.eINSTANCE.getServiceUtilizationType_ModifyLookahead());
			childrenFeatures.add(_2010Package.eINSTANCE.getServiceUtilizationType_QueryLookahead());
			childrenFeatures.add(_2010Package.eINSTANCE.getServiceUtilizationType_Retract());
			childrenFeatures.add(_2010Package.eINSTANCE.getServiceUtilizationType_RequestRetraction());
			childrenFeatures.add(_2010Package.eINSTANCE.getServiceUtilizationType_ChangeAttributeOrderType());
			childrenFeatures.add(_2010Package.eINSTANCE.getServiceUtilizationType_ChangeInteractionOrderType());
			childrenFeatures.add(_2010Package.eINSTANCE.getServiceUtilizationType_CreateRegion());
			childrenFeatures.add(_2010Package.eINSTANCE.getServiceUtilizationType_CommitRegionModifications());
			childrenFeatures.add(_2010Package.eINSTANCE.getServiceUtilizationType_DeleteRegion());
			childrenFeatures.add(_2010Package.eINSTANCE.getServiceUtilizationType_RegisterObjectInstanceWithRegions());
			childrenFeatures.add(_2010Package.eINSTANCE.getServiceUtilizationType_AssociateRegionsForUpdates());
			childrenFeatures.add(_2010Package.eINSTANCE.getServiceUtilizationType_UnassociateRegionsForUpdates());
			childrenFeatures.add(_2010Package.eINSTANCE.getServiceUtilizationType_SubscribeObjectClassAttributesWithRegions());
			childrenFeatures.add(_2010Package.eINSTANCE.getServiceUtilizationType_UnsubscribeObjectClassAttributesWithRegions());
			childrenFeatures.add(_2010Package.eINSTANCE.getServiceUtilizationType_SubscribeInteractionClassWithRegions());
			childrenFeatures.add(_2010Package.eINSTANCE.getServiceUtilizationType_UnsubscribeInteractionClassWithRegions());
			childrenFeatures.add(_2010Package.eINSTANCE.getServiceUtilizationType_SendInteractionWithRegions());
			childrenFeatures.add(_2010Package.eINSTANCE.getServiceUtilizationType_RequestAttributeValueUpdateWithRegions());
			childrenFeatures.add(_2010Package.eINSTANCE.getServiceUtilizationType_GetAutomaticResignDirective());
			childrenFeatures.add(_2010Package.eINSTANCE.getServiceUtilizationType_SetAutomaticResignDirective());
			childrenFeatures.add(_2010Package.eINSTANCE.getServiceUtilizationType_GetFederateHandle());
			childrenFeatures.add(_2010Package.eINSTANCE.getServiceUtilizationType_GetFederateName());
			childrenFeatures.add(_2010Package.eINSTANCE.getServiceUtilizationType_GetObjectClassHandle());
			childrenFeatures.add(_2010Package.eINSTANCE.getServiceUtilizationType_GetObjectClassName());
			childrenFeatures.add(_2010Package.eINSTANCE.getServiceUtilizationType_GetKnownObjectClassHandle());
			childrenFeatures.add(_2010Package.eINSTANCE.getServiceUtilizationType_GetObjectInstanceHandle());
			childrenFeatures.add(_2010Package.eINSTANCE.getServiceUtilizationType_GetObjectInstanceName());
			childrenFeatures.add(_2010Package.eINSTANCE.getServiceUtilizationType_GetAttributeHandle());
			childrenFeatures.add(_2010Package.eINSTANCE.getServiceUtilizationType_GetAttributeName());
			childrenFeatures.add(_2010Package.eINSTANCE.getServiceUtilizationType_GetUpdateRateValue());
			childrenFeatures.add(_2010Package.eINSTANCE.getServiceUtilizationType_GetUpdateRateValueForAttribute());
			childrenFeatures.add(_2010Package.eINSTANCE.getServiceUtilizationType_GetInteractionClassHandle());
			childrenFeatures.add(_2010Package.eINSTANCE.getServiceUtilizationType_GetInteractionClassName());
			childrenFeatures.add(_2010Package.eINSTANCE.getServiceUtilizationType_GetParameterHandle());
			childrenFeatures.add(_2010Package.eINSTANCE.getServiceUtilizationType_GetParameterName());
			childrenFeatures.add(_2010Package.eINSTANCE.getServiceUtilizationType_GetOrderType());
			childrenFeatures.add(_2010Package.eINSTANCE.getServiceUtilizationType_GetOrderName());
			childrenFeatures.add(_2010Package.eINSTANCE.getServiceUtilizationType_GetTransportationTypeHandle());
			childrenFeatures.add(_2010Package.eINSTANCE.getServiceUtilizationType_GetTransportationTypeName());
			childrenFeatures.add(_2010Package.eINSTANCE.getServiceUtilizationType_GetAvailableDimensionsForClassAttribute());
			childrenFeatures.add(_2010Package.eINSTANCE.getServiceUtilizationType_GetAvailableDimensionsForInteractionClass());
			childrenFeatures.add(_2010Package.eINSTANCE.getServiceUtilizationType_GetDimensionHandle());
			childrenFeatures.add(_2010Package.eINSTANCE.getServiceUtilizationType_GetDimensionName());
			childrenFeatures.add(_2010Package.eINSTANCE.getServiceUtilizationType_GetDimensionUpperBound());
			childrenFeatures.add(_2010Package.eINSTANCE.getServiceUtilizationType_GetDimensionHandleSet());
			childrenFeatures.add(_2010Package.eINSTANCE.getServiceUtilizationType_GetRangeBounds());
			childrenFeatures.add(_2010Package.eINSTANCE.getServiceUtilizationType_SetRangeBounds());
			childrenFeatures.add(_2010Package.eINSTANCE.getServiceUtilizationType_NormalizeFederateHandle());
			childrenFeatures.add(_2010Package.eINSTANCE.getServiceUtilizationType_NormalizeServiceGroup());
			childrenFeatures.add(_2010Package.eINSTANCE.getServiceUtilizationType_EnableObjectClassRelevanceAdvisorySwitch());
			childrenFeatures.add(_2010Package.eINSTANCE.getServiceUtilizationType_DisableObjectClassRelevanceAdvisorySwitch());
			childrenFeatures.add(_2010Package.eINSTANCE.getServiceUtilizationType_EnableAttributeRelevanceAdvisorySwitch());
			childrenFeatures.add(_2010Package.eINSTANCE.getServiceUtilizationType_DisableAttributeRelevanceAdvisorySwitch());
			childrenFeatures.add(_2010Package.eINSTANCE.getServiceUtilizationType_EnableAttributeScopeAdvisorySwitch());
			childrenFeatures.add(_2010Package.eINSTANCE.getServiceUtilizationType_DisableAttributeScopeAdvisorySwitch());
			childrenFeatures.add(_2010Package.eINSTANCE.getServiceUtilizationType_EnableInteractionRelevanceAdvisorySwitch());
			childrenFeatures.add(_2010Package.eINSTANCE.getServiceUtilizationType_DisableInteractionRelevanceAdvisorySwitch());
			childrenFeatures.add(_2010Package.eINSTANCE.getServiceUtilizationType_EvokeCallback());
			childrenFeatures.add(_2010Package.eINSTANCE.getServiceUtilizationType_EvokeMultipleCallbacks());
			childrenFeatures.add(_2010Package.eINSTANCE.getServiceUtilizationType_EnableCallbacks());
			childrenFeatures.add(_2010Package.eINSTANCE.getServiceUtilizationType_DisableCallbacks());
			childrenFeatures.add(_2010Package.eINSTANCE.getServiceUtilizationType_AnyAttribute());
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
	 * This returns ServiceUtilizationType.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ServiceUtilizationType"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText(Object object) {
		String label = ((ServiceUtilizationType)object).getIdtag();
		return label == null || label.length() == 0 ?
			getString("_UI_ServiceUtilizationType_type") :
			getString("_UI_ServiceUtilizationType_type") + " " + label;
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

		switch (notification.getFeatureID(ServiceUtilizationType.class)) {
			case _2010Package.SERVICE_UTILIZATION_TYPE__IDTAG:
			case _2010Package.SERVICE_UTILIZATION_TYPE__NOTES:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__CONNECT:
			case _2010Package.SERVICE_UTILIZATION_TYPE__DISCONNECT:
			case _2010Package.SERVICE_UTILIZATION_TYPE__CONNECTION_LOST:
			case _2010Package.SERVICE_UTILIZATION_TYPE__CREATE_FEDERATION_EXECUTION:
			case _2010Package.SERVICE_UTILIZATION_TYPE__DESTROY_FEDERATION_EXECUTION:
			case _2010Package.SERVICE_UTILIZATION_TYPE__LIST_FEDERATION_EXECUTIONS:
			case _2010Package.SERVICE_UTILIZATION_TYPE__REPORT_FEDERATION_EXECUTIONS:
			case _2010Package.SERVICE_UTILIZATION_TYPE__JOIN_FEDERATION_EXECUTION:
			case _2010Package.SERVICE_UTILIZATION_TYPE__RESIGN_FEDERATION_EXECUTION:
			case _2010Package.SERVICE_UTILIZATION_TYPE__REGISTER_FEDERATION_SYNCHRONIZATION_POINT:
			case _2010Package.SERVICE_UTILIZATION_TYPE__CONFIRM_SYNCHRONIZATION_POINT_REGISTRATION:
			case _2010Package.SERVICE_UTILIZATION_TYPE__ANNOUNCE_SYNCHRONIZATION_POINT:
			case _2010Package.SERVICE_UTILIZATION_TYPE__SYNCHRONIZATION_POINT_ACHIEVED:
			case _2010Package.SERVICE_UTILIZATION_TYPE__FEDERATION_SYNCHRONIZED:
			case _2010Package.SERVICE_UTILIZATION_TYPE__REQUEST_FEDERATION_SAVE:
			case _2010Package.SERVICE_UTILIZATION_TYPE__INITIATE_FEDERATE_SAVE:
			case _2010Package.SERVICE_UTILIZATION_TYPE__FEDERATE_SAVE_BEGUN:
			case _2010Package.SERVICE_UTILIZATION_TYPE__FEDERATE_SAVE_COMPLETE:
			case _2010Package.SERVICE_UTILIZATION_TYPE__FEDERATION_SAVED:
			case _2010Package.SERVICE_UTILIZATION_TYPE__ABORT_FEDERATION_SAVE:
			case _2010Package.SERVICE_UTILIZATION_TYPE__QUERY_FEDERATION_SAVE_STATUS:
			case _2010Package.SERVICE_UTILIZATION_TYPE__FEDERATION_SAVE_STATUS_RESPONSE:
			case _2010Package.SERVICE_UTILIZATION_TYPE__REQUEST_FEDERATION_RESTORE:
			case _2010Package.SERVICE_UTILIZATION_TYPE__CONFIRM_FEDERATION_RESTORATION_REQUEST:
			case _2010Package.SERVICE_UTILIZATION_TYPE__FEDERATION_RESTORE_BEGUN:
			case _2010Package.SERVICE_UTILIZATION_TYPE__INITIATE_FEDERATE_RESTORE:
			case _2010Package.SERVICE_UTILIZATION_TYPE__FEDERATE_RESTORE_COMPLETE:
			case _2010Package.SERVICE_UTILIZATION_TYPE__FEDERATION_RESTORED:
			case _2010Package.SERVICE_UTILIZATION_TYPE__ABORT_FEDERATION_RESTORE:
			case _2010Package.SERVICE_UTILIZATION_TYPE__QUERY_FEDERATION_RESTORE_STATUS:
			case _2010Package.SERVICE_UTILIZATION_TYPE__FEDERATION_RESTORE_STATUS_RESPONSE:
			case _2010Package.SERVICE_UTILIZATION_TYPE__PUBLISH_OBJECT_CLASS_ATTRIBUTES:
			case _2010Package.SERVICE_UTILIZATION_TYPE__UNPUBLISH_OBJECT_CLASS_ATTRIBUTES:
			case _2010Package.SERVICE_UTILIZATION_TYPE__PUBLISH_INTERACTION_CLASS:
			case _2010Package.SERVICE_UTILIZATION_TYPE__UNPUBLISH_INTERACTION_CLASS:
			case _2010Package.SERVICE_UTILIZATION_TYPE__SUBSCRIBE_OBJECT_CLASS_ATTRIBUTES:
			case _2010Package.SERVICE_UTILIZATION_TYPE__UNSUBSCRIBE_OBJECT_CLASS_ATTRIBUTES:
			case _2010Package.SERVICE_UTILIZATION_TYPE__SUBSCRIBE_INTERACTION_CLASS:
			case _2010Package.SERVICE_UTILIZATION_TYPE__UNSUBSCRIBE_INTERACTION_CLASS:
			case _2010Package.SERVICE_UTILIZATION_TYPE__START_REGISTRATION_FOR_OBJECT_CLASS:
			case _2010Package.SERVICE_UTILIZATION_TYPE__STOP_REGISTRATION_FOR_OBJECT_CLASS:
			case _2010Package.SERVICE_UTILIZATION_TYPE__TURN_INTERACTIONS_ON:
			case _2010Package.SERVICE_UTILIZATION_TYPE__TURN_INTERACTIONS_OFF:
			case _2010Package.SERVICE_UTILIZATION_TYPE__RESERVE_OBJECT_INSTANCE_NAME:
			case _2010Package.SERVICE_UTILIZATION_TYPE__OBJECT_INSTANCE_NAME_RESERVED:
			case _2010Package.SERVICE_UTILIZATION_TYPE__RELEASE_OBJECT_INSTANCE_NAME:
			case _2010Package.SERVICE_UTILIZATION_TYPE__RESERVE_MULTIPLE_OBJECT_INSTANCE_NAMES:
			case _2010Package.SERVICE_UTILIZATION_TYPE__MULTIPLE_OBJECT_INSTANCE_NAMES_RESERVED:
			case _2010Package.SERVICE_UTILIZATION_TYPE__RELEASE_MULTIPLE_OBJECT_INSTANCE_NAMES:
			case _2010Package.SERVICE_UTILIZATION_TYPE__REGISTER_OBJECT_INSTANCE:
			case _2010Package.SERVICE_UTILIZATION_TYPE__DISCOVER_OBJECT_INSTANCE:
			case _2010Package.SERVICE_UTILIZATION_TYPE__UPDATE_ATTRIBUTE_VALUES:
			case _2010Package.SERVICE_UTILIZATION_TYPE__REFLECT_ATTRIBUTE_VALUES:
			case _2010Package.SERVICE_UTILIZATION_TYPE__SEND_INTERACTION:
			case _2010Package.SERVICE_UTILIZATION_TYPE__RECEIVE_INTERACTION:
			case _2010Package.SERVICE_UTILIZATION_TYPE__DELETE_OBJECT_INSTANCE:
			case _2010Package.SERVICE_UTILIZATION_TYPE__REMOVEOBJECTINSTANCE:
			case _2010Package.SERVICE_UTILIZATION_TYPE__LOCAL_DELETE_OBJECT_INSTANCE:
			case _2010Package.SERVICE_UTILIZATION_TYPE__ATTRIBUTES_IN_SCOPE:
			case _2010Package.SERVICE_UTILIZATION_TYPE__ATTRIBUTES_OUT_OF_SCOPE:
			case _2010Package.SERVICE_UTILIZATION_TYPE__REQUEST_ATTRIBUTE_VALUE_UPDATE:
			case _2010Package.SERVICE_UTILIZATION_TYPE__PROVIDE_ATTRIBUTE_VALUE_UPDATE:
			case _2010Package.SERVICE_UTILIZATION_TYPE__TURN_UPDATES_ON_FOR_OBJECT_INSTANCE:
			case _2010Package.SERVICE_UTILIZATION_TYPE__TURN_UPDATES_OFF_FOR_OBJECT_INSTANCE:
			case _2010Package.SERVICE_UTILIZATION_TYPE__REQUEST_ATTRIBUTE_TRANSPORTATION_TYPE_CHANGE:
			case _2010Package.SERVICE_UTILIZATION_TYPE__CONFIRM_ATTRIBUTE_TRANSPORTATION_TYPE_CHANGE:
			case _2010Package.SERVICE_UTILIZATION_TYPE__QUERY_ATTRIBUTE_TRANSPORTATION_TYPE:
			case _2010Package.SERVICE_UTILIZATION_TYPE__REPORT_ATTRIBUTE_TRANSPORTATION_TYPE:
			case _2010Package.SERVICE_UTILIZATION_TYPE__REQUEST_INTERACTION_TRANSPORTATION_TYPE_CHANGE:
			case _2010Package.SERVICE_UTILIZATION_TYPE__CONFIRM_INTERACTION_TRANSPORTATION_TYPE_CHANGE:
			case _2010Package.SERVICE_UTILIZATION_TYPE__QUERY_INTERACTION_TRANSPORTATION_TYPE:
			case _2010Package.SERVICE_UTILIZATION_TYPE__REPORT_INTERACTION_TRANSPORTATION_TYPE:
			case _2010Package.SERVICE_UTILIZATION_TYPE__UNCONDITIONAL_ATTRIBUTE_OWNERSHIP_DIVESTITURE:
			case _2010Package.SERVICE_UTILIZATION_TYPE__NEGOTIATED_ATTRIBUTE_OWNERSHIP_DIVESTITURE:
			case _2010Package.SERVICE_UTILIZATION_TYPE__REQUEST_ATTRIBUTE_OWNERSHIP_ASSUMPTION:
			case _2010Package.SERVICE_UTILIZATION_TYPE__REQUEST_DIVESTITURE_CONFIRMATION:
			case _2010Package.SERVICE_UTILIZATION_TYPE__CONFIRM_DIVESTITURE:
			case _2010Package.SERVICE_UTILIZATION_TYPE__ATTRIBUTE_OWNERSHIP_ACQUISITION_NOTIFICATION:
			case _2010Package.SERVICE_UTILIZATION_TYPE__ATTRIBUTE_OWNERSHIP_ACQUISITION:
			case _2010Package.SERVICE_UTILIZATION_TYPE__ATTRIBUTE_OWNERSHIP_ACQUISITION_IF_AVAILABLE:
			case _2010Package.SERVICE_UTILIZATION_TYPE__ATTRIBUTE_OWNERSHIP_UNAVAILABLE:
			case _2010Package.SERVICE_UTILIZATION_TYPE__REQUEST_ATTRIBUTE_OWNERSHIP_RELEASE:
			case _2010Package.SERVICE_UTILIZATION_TYPE__ATTRIBUTE_OWNERSHIP_RELEASE_DENIED:
			case _2010Package.SERVICE_UTILIZATION_TYPE__ATTRIBUTE_OWNERSHIP_DIVESTITURE_IF_WANTED:
			case _2010Package.SERVICE_UTILIZATION_TYPE__CANCEL_NEGOTIATED_ATTRIBUTE_OWNERSHIP_DIVESTITURE:
			case _2010Package.SERVICE_UTILIZATION_TYPE__CANCEL_ATTRIBUTE_OWNERSHIP_ACQUISITION:
			case _2010Package.SERVICE_UTILIZATION_TYPE__CONFIRM_ATTRIBUTE_OWNERSHIP_ACQUISITION_CANCELLATION:
			case _2010Package.SERVICE_UTILIZATION_TYPE__QUERY_ATTRIBUTE_OWNERSHIP:
			case _2010Package.SERVICE_UTILIZATION_TYPE__INFORM_ATTRIBUTE_OWNERSHIP:
			case _2010Package.SERVICE_UTILIZATION_TYPE__IS_ATTRIBUTE_OWNED_BY_FEDERATE:
			case _2010Package.SERVICE_UTILIZATION_TYPE__ENABLE_TIME_REGULATION:
			case _2010Package.SERVICE_UTILIZATION_TYPE__TIME_REGULATION_ENABLED:
			case _2010Package.SERVICE_UTILIZATION_TYPE__DISABLE_TIME_REGULATION:
			case _2010Package.SERVICE_UTILIZATION_TYPE__ENABLE_TIME_CONSTRAINED:
			case _2010Package.SERVICE_UTILIZATION_TYPE__TIME_CONSTRAINED_ENABLED:
			case _2010Package.SERVICE_UTILIZATION_TYPE__DISABLE_TIME_CONSTRAINED:
			case _2010Package.SERVICE_UTILIZATION_TYPE__TIME_ADVANCE_REQUEST:
			case _2010Package.SERVICE_UTILIZATION_TYPE__TIME_ADVANCE_REQUEST_AVAILABLE:
			case _2010Package.SERVICE_UTILIZATION_TYPE__NEXT_MESSAGE_REQUEST:
			case _2010Package.SERVICE_UTILIZATION_TYPE__NEXT_MESSAGE_REQUEST_AVAILABLE:
			case _2010Package.SERVICE_UTILIZATION_TYPE__FLUSH_QUEUE_REQUEST:
			case _2010Package.SERVICE_UTILIZATION_TYPE__TIME_ADVANCE_GRANT:
			case _2010Package.SERVICE_UTILIZATION_TYPE__ENABLE_ASYNCHRONOUS_DELIVERY:
			case _2010Package.SERVICE_UTILIZATION_TYPE__DISABLE_ASYNCHRONOUS_DELIVERY:
			case _2010Package.SERVICE_UTILIZATION_TYPE__QUERY_GALT:
			case _2010Package.SERVICE_UTILIZATION_TYPE__QUERY_LOGICAL_TIME:
			case _2010Package.SERVICE_UTILIZATION_TYPE__QUERY_LITS:
			case _2010Package.SERVICE_UTILIZATION_TYPE__MODIFY_LOOKAHEAD:
			case _2010Package.SERVICE_UTILIZATION_TYPE__QUERY_LOOKAHEAD:
			case _2010Package.SERVICE_UTILIZATION_TYPE__RETRACT:
			case _2010Package.SERVICE_UTILIZATION_TYPE__REQUEST_RETRACTION:
			case _2010Package.SERVICE_UTILIZATION_TYPE__CHANGE_ATTRIBUTE_ORDER_TYPE:
			case _2010Package.SERVICE_UTILIZATION_TYPE__CHANGE_INTERACTION_ORDER_TYPE:
			case _2010Package.SERVICE_UTILIZATION_TYPE__CREATE_REGION:
			case _2010Package.SERVICE_UTILIZATION_TYPE__COMMIT_REGION_MODIFICATIONS:
			case _2010Package.SERVICE_UTILIZATION_TYPE__DELETE_REGION:
			case _2010Package.SERVICE_UTILIZATION_TYPE__REGISTER_OBJECT_INSTANCE_WITH_REGIONS:
			case _2010Package.SERVICE_UTILIZATION_TYPE__ASSOCIATE_REGIONS_FOR_UPDATES:
			case _2010Package.SERVICE_UTILIZATION_TYPE__UNASSOCIATE_REGIONS_FOR_UPDATES:
			case _2010Package.SERVICE_UTILIZATION_TYPE__SUBSCRIBE_OBJECT_CLASS_ATTRIBUTES_WITH_REGIONS:
			case _2010Package.SERVICE_UTILIZATION_TYPE__UNSUBSCRIBE_OBJECT_CLASS_ATTRIBUTES_WITH_REGIONS:
			case _2010Package.SERVICE_UTILIZATION_TYPE__SUBSCRIBE_INTERACTION_CLASS_WITH_REGIONS:
			case _2010Package.SERVICE_UTILIZATION_TYPE__UNSUBSCRIBE_INTERACTION_CLASS_WITH_REGIONS:
			case _2010Package.SERVICE_UTILIZATION_TYPE__SEND_INTERACTION_WITH_REGIONS:
			case _2010Package.SERVICE_UTILIZATION_TYPE__REQUEST_ATTRIBUTE_VALUE_UPDATE_WITH_REGIONS:
			case _2010Package.SERVICE_UTILIZATION_TYPE__GET_AUTOMATIC_RESIGN_DIRECTIVE:
			case _2010Package.SERVICE_UTILIZATION_TYPE__SET_AUTOMATIC_RESIGN_DIRECTIVE:
			case _2010Package.SERVICE_UTILIZATION_TYPE__GET_FEDERATE_HANDLE:
			case _2010Package.SERVICE_UTILIZATION_TYPE__GET_FEDERATE_NAME:
			case _2010Package.SERVICE_UTILIZATION_TYPE__GET_OBJECT_CLASS_HANDLE:
			case _2010Package.SERVICE_UTILIZATION_TYPE__GET_OBJECT_CLASS_NAME:
			case _2010Package.SERVICE_UTILIZATION_TYPE__GET_KNOWN_OBJECT_CLASS_HANDLE:
			case _2010Package.SERVICE_UTILIZATION_TYPE__GET_OBJECT_INSTANCE_HANDLE:
			case _2010Package.SERVICE_UTILIZATION_TYPE__GET_OBJECT_INSTANCE_NAME:
			case _2010Package.SERVICE_UTILIZATION_TYPE__GET_ATTRIBUTE_HANDLE:
			case _2010Package.SERVICE_UTILIZATION_TYPE__GET_ATTRIBUTE_NAME:
			case _2010Package.SERVICE_UTILIZATION_TYPE__GET_UPDATE_RATE_VALUE:
			case _2010Package.SERVICE_UTILIZATION_TYPE__GET_UPDATE_RATE_VALUE_FOR_ATTRIBUTE:
			case _2010Package.SERVICE_UTILIZATION_TYPE__GET_INTERACTION_CLASS_HANDLE:
			case _2010Package.SERVICE_UTILIZATION_TYPE__GET_INTERACTION_CLASS_NAME:
			case _2010Package.SERVICE_UTILIZATION_TYPE__GET_PARAMETER_HANDLE:
			case _2010Package.SERVICE_UTILIZATION_TYPE__GET_PARAMETER_NAME:
			case _2010Package.SERVICE_UTILIZATION_TYPE__GET_ORDER_TYPE:
			case _2010Package.SERVICE_UTILIZATION_TYPE__GET_ORDER_NAME:
			case _2010Package.SERVICE_UTILIZATION_TYPE__GET_TRANSPORTATION_TYPE_HANDLE:
			case _2010Package.SERVICE_UTILIZATION_TYPE__GET_TRANSPORTATION_TYPE_NAME:
			case _2010Package.SERVICE_UTILIZATION_TYPE__GET_AVAILABLE_DIMENSIONS_FOR_CLASS_ATTRIBUTE:
			case _2010Package.SERVICE_UTILIZATION_TYPE__GET_AVAILABLE_DIMENSIONS_FOR_INTERACTION_CLASS:
			case _2010Package.SERVICE_UTILIZATION_TYPE__GET_DIMENSION_HANDLE:
			case _2010Package.SERVICE_UTILIZATION_TYPE__GET_DIMENSION_NAME:
			case _2010Package.SERVICE_UTILIZATION_TYPE__GET_DIMENSION_UPPER_BOUND:
			case _2010Package.SERVICE_UTILIZATION_TYPE__GET_DIMENSION_HANDLE_SET:
			case _2010Package.SERVICE_UTILIZATION_TYPE__GET_RANGE_BOUNDS:
			case _2010Package.SERVICE_UTILIZATION_TYPE__SET_RANGE_BOUNDS:
			case _2010Package.SERVICE_UTILIZATION_TYPE__NORMALIZE_FEDERATE_HANDLE:
			case _2010Package.SERVICE_UTILIZATION_TYPE__NORMALIZE_SERVICE_GROUP:
			case _2010Package.SERVICE_UTILIZATION_TYPE__ENABLE_OBJECT_CLASS_RELEVANCE_ADVISORY_SWITCH:
			case _2010Package.SERVICE_UTILIZATION_TYPE__DISABLE_OBJECT_CLASS_RELEVANCE_ADVISORY_SWITCH:
			case _2010Package.SERVICE_UTILIZATION_TYPE__ENABLE_ATTRIBUTE_RELEVANCE_ADVISORY_SWITCH:
			case _2010Package.SERVICE_UTILIZATION_TYPE__DISABLE_ATTRIBUTE_RELEVANCE_ADVISORY_SWITCH:
			case _2010Package.SERVICE_UTILIZATION_TYPE__ENABLE_ATTRIBUTE_SCOPE_ADVISORY_SWITCH:
			case _2010Package.SERVICE_UTILIZATION_TYPE__DISABLE_ATTRIBUTE_SCOPE_ADVISORY_SWITCH:
			case _2010Package.SERVICE_UTILIZATION_TYPE__ENABLE_INTERACTION_RELEVANCE_ADVISORY_SWITCH:
			case _2010Package.SERVICE_UTILIZATION_TYPE__DISABLE_INTERACTION_RELEVANCE_ADVISORY_SWITCH:
			case _2010Package.SERVICE_UTILIZATION_TYPE__EVOKE_CALLBACK:
			case _2010Package.SERVICE_UTILIZATION_TYPE__EVOKE_MULTIPLE_CALLBACKS:
			case _2010Package.SERVICE_UTILIZATION_TYPE__ENABLE_CALLBACKS:
			case _2010Package.SERVICE_UTILIZATION_TYPE__DISABLE_CALLBACKS:
			case _2010Package.SERVICE_UTILIZATION_TYPE__ANY_ATTRIBUTE:
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
				(_2010Package.eINSTANCE.getServiceUtilizationType_Connect(),
				 _2010Factory.eINSTANCE.createConnectType()));

		newChildDescriptors.add
			(createChildParameter
				(_2010Package.eINSTANCE.getServiceUtilizationType_Disconnect(),
				 _2010Factory.eINSTANCE.createDisconnectType()));

		newChildDescriptors.add
			(createChildParameter
				(_2010Package.eINSTANCE.getServiceUtilizationType_ConnectionLost(),
				 _2010Factory.eINSTANCE.createConnectionLostType()));

		newChildDescriptors.add
			(createChildParameter
				(_2010Package.eINSTANCE.getServiceUtilizationType_CreateFederationExecution(),
				 _2010Factory.eINSTANCE.createCreateFederationExecutionType()));

		newChildDescriptors.add
			(createChildParameter
				(_2010Package.eINSTANCE.getServiceUtilizationType_DestroyFederationExecution(),
				 _2010Factory.eINSTANCE.createDestroyFederationExecutionType()));

		newChildDescriptors.add
			(createChildParameter
				(_2010Package.eINSTANCE.getServiceUtilizationType_ListFederationExecutions(),
				 _2010Factory.eINSTANCE.createListFederationExecutionsType()));

		newChildDescriptors.add
			(createChildParameter
				(_2010Package.eINSTANCE.getServiceUtilizationType_ReportFederationExecutions(),
				 _2010Factory.eINSTANCE.createReportFederationExecutionsType()));

		newChildDescriptors.add
			(createChildParameter
				(_2010Package.eINSTANCE.getServiceUtilizationType_JoinFederationExecution(),
				 _2010Factory.eINSTANCE.createJoinFederationExecutionType()));

		newChildDescriptors.add
			(createChildParameter
				(_2010Package.eINSTANCE.getServiceUtilizationType_ResignFederationExecution(),
				 _2010Factory.eINSTANCE.createResignFederationExecutionType()));

		newChildDescriptors.add
			(createChildParameter
				(_2010Package.eINSTANCE.getServiceUtilizationType_RegisterFederationSynchronizationPoint(),
				 _2010Factory.eINSTANCE.createRegisterFederationSynchronizationPointType()));

		newChildDescriptors.add
			(createChildParameter
				(_2010Package.eINSTANCE.getServiceUtilizationType_ConfirmSynchronizationPointRegistration(),
				 _2010Factory.eINSTANCE.createConfirmSynchronizationPointRegistrationType()));

		newChildDescriptors.add
			(createChildParameter
				(_2010Package.eINSTANCE.getServiceUtilizationType_AnnounceSynchronizationPoint(),
				 _2010Factory.eINSTANCE.createAnnounceSynchronizationPointType()));

		newChildDescriptors.add
			(createChildParameter
				(_2010Package.eINSTANCE.getServiceUtilizationType_SynchronizationPointAchieved(),
				 _2010Factory.eINSTANCE.createSynchronizationPointAchievedType()));

		newChildDescriptors.add
			(createChildParameter
				(_2010Package.eINSTANCE.getServiceUtilizationType_FederationSynchronized(),
				 _2010Factory.eINSTANCE.createFederationSynchronizedType()));

		newChildDescriptors.add
			(createChildParameter
				(_2010Package.eINSTANCE.getServiceUtilizationType_RequestFederationSave(),
				 _2010Factory.eINSTANCE.createRequestFederationSaveType()));

		newChildDescriptors.add
			(createChildParameter
				(_2010Package.eINSTANCE.getServiceUtilizationType_InitiateFederateSave(),
				 _2010Factory.eINSTANCE.createInitiateFederateSaveType()));

		newChildDescriptors.add
			(createChildParameter
				(_2010Package.eINSTANCE.getServiceUtilizationType_FederateSaveBegun(),
				 _2010Factory.eINSTANCE.createFederateSaveBegunType()));

		newChildDescriptors.add
			(createChildParameter
				(_2010Package.eINSTANCE.getServiceUtilizationType_FederateSaveComplete(),
				 _2010Factory.eINSTANCE.createFederateSaveCompleteType()));

		newChildDescriptors.add
			(createChildParameter
				(_2010Package.eINSTANCE.getServiceUtilizationType_FederationSaved(),
				 _2010Factory.eINSTANCE.createFederationSavedType()));

		newChildDescriptors.add
			(createChildParameter
				(_2010Package.eINSTANCE.getServiceUtilizationType_AbortFederationSave(),
				 _2010Factory.eINSTANCE.createAbortFederationSaveType()));

		newChildDescriptors.add
			(createChildParameter
				(_2010Package.eINSTANCE.getServiceUtilizationType_QueryFederationSaveStatus(),
				 _2010Factory.eINSTANCE.createQueryFederationSaveStatusType()));

		newChildDescriptors.add
			(createChildParameter
				(_2010Package.eINSTANCE.getServiceUtilizationType_FederationSaveStatusResponse(),
				 _2010Factory.eINSTANCE.createFederationSaveStatusResponseType()));

		newChildDescriptors.add
			(createChildParameter
				(_2010Package.eINSTANCE.getServiceUtilizationType_RequestFederationRestore(),
				 _2010Factory.eINSTANCE.createRequestFederationRestoreType()));

		newChildDescriptors.add
			(createChildParameter
				(_2010Package.eINSTANCE.getServiceUtilizationType_ConfirmFederationRestorationRequest(),
				 _2010Factory.eINSTANCE.createConfirmFederationRestorationRequestType()));

		newChildDescriptors.add
			(createChildParameter
				(_2010Package.eINSTANCE.getServiceUtilizationType_FederationRestoreBegun(),
				 _2010Factory.eINSTANCE.createFederationRestoreBegunType()));

		newChildDescriptors.add
			(createChildParameter
				(_2010Package.eINSTANCE.getServiceUtilizationType_InitiateFederateRestore(),
				 _2010Factory.eINSTANCE.createInitiateFederateRestoreType()));

		newChildDescriptors.add
			(createChildParameter
				(_2010Package.eINSTANCE.getServiceUtilizationType_FederateRestoreComplete(),
				 _2010Factory.eINSTANCE.createFederateRestoreCompleteType()));

		newChildDescriptors.add
			(createChildParameter
				(_2010Package.eINSTANCE.getServiceUtilizationType_FederationRestored(),
				 _2010Factory.eINSTANCE.createFederationRestoredType()));

		newChildDescriptors.add
			(createChildParameter
				(_2010Package.eINSTANCE.getServiceUtilizationType_AbortFederationRestore(),
				 _2010Factory.eINSTANCE.createAbortFederationRestoreType()));

		newChildDescriptors.add
			(createChildParameter
				(_2010Package.eINSTANCE.getServiceUtilizationType_QueryFederationRestoreStatus(),
				 _2010Factory.eINSTANCE.createQueryFederationRestoreStatusType()));

		newChildDescriptors.add
			(createChildParameter
				(_2010Package.eINSTANCE.getServiceUtilizationType_FederationRestoreStatusResponse(),
				 _2010Factory.eINSTANCE.createFederationRestoreStatusResponseType()));

		newChildDescriptors.add
			(createChildParameter
				(_2010Package.eINSTANCE.getServiceUtilizationType_PublishObjectClassAttributes(),
				 _2010Factory.eINSTANCE.createPublishObjectClassAttributesType()));

		newChildDescriptors.add
			(createChildParameter
				(_2010Package.eINSTANCE.getServiceUtilizationType_UnpublishObjectClassAttributes(),
				 _2010Factory.eINSTANCE.createUnpublishObjectClassAttributesType()));

		newChildDescriptors.add
			(createChildParameter
				(_2010Package.eINSTANCE.getServiceUtilizationType_PublishInteractionClass(),
				 _2010Factory.eINSTANCE.createPublishInteractionClassType()));

		newChildDescriptors.add
			(createChildParameter
				(_2010Package.eINSTANCE.getServiceUtilizationType_UnpublishInteractionClass(),
				 _2010Factory.eINSTANCE.createUnpublishInteractionClassType()));

		newChildDescriptors.add
			(createChildParameter
				(_2010Package.eINSTANCE.getServiceUtilizationType_SubscribeObjectClassAttributes(),
				 _2010Factory.eINSTANCE.createSubscribeObjectClassAttributesType()));

		newChildDescriptors.add
			(createChildParameter
				(_2010Package.eINSTANCE.getServiceUtilizationType_UnsubscribeObjectClassAttributes(),
				 _2010Factory.eINSTANCE.createUnsubscribeObjectClassAttributesType()));

		newChildDescriptors.add
			(createChildParameter
				(_2010Package.eINSTANCE.getServiceUtilizationType_SubscribeInteractionClass(),
				 _2010Factory.eINSTANCE.createSubscribeInteractionClassType()));

		newChildDescriptors.add
			(createChildParameter
				(_2010Package.eINSTANCE.getServiceUtilizationType_UnsubscribeInteractionClass(),
				 _2010Factory.eINSTANCE.createUnsubscribeInteractionClassType()));

		newChildDescriptors.add
			(createChildParameter
				(_2010Package.eINSTANCE.getServiceUtilizationType_StartRegistrationForObjectClass(),
				 _2010Factory.eINSTANCE.createStartRegistrationForObjectClassType()));

		newChildDescriptors.add
			(createChildParameter
				(_2010Package.eINSTANCE.getServiceUtilizationType_StopRegistrationForObjectClass(),
				 _2010Factory.eINSTANCE.createStopRegistrationForObjectClassType()));

		newChildDescriptors.add
			(createChildParameter
				(_2010Package.eINSTANCE.getServiceUtilizationType_TurnInteractionsOn(),
				 _2010Factory.eINSTANCE.createTurnInteractionsOnType()));

		newChildDescriptors.add
			(createChildParameter
				(_2010Package.eINSTANCE.getServiceUtilizationType_TurnInteractionsOff(),
				 _2010Factory.eINSTANCE.createTurnInteractionsOffType()));

		newChildDescriptors.add
			(createChildParameter
				(_2010Package.eINSTANCE.getServiceUtilizationType_ReserveObjectInstanceName(),
				 _2010Factory.eINSTANCE.createReserveObjectInstanceNameType()));

		newChildDescriptors.add
			(createChildParameter
				(_2010Package.eINSTANCE.getServiceUtilizationType_ObjectInstanceNameReserved(),
				 _2010Factory.eINSTANCE.createObjectInstanceNameReservedType()));

		newChildDescriptors.add
			(createChildParameter
				(_2010Package.eINSTANCE.getServiceUtilizationType_ReleaseObjectInstanceName(),
				 _2010Factory.eINSTANCE.createReleaseObjectInstanceNameType()));

		newChildDescriptors.add
			(createChildParameter
				(_2010Package.eINSTANCE.getServiceUtilizationType_ReserveMultipleObjectInstanceNames(),
				 _2010Factory.eINSTANCE.createReserveMultipleObjectInstanceNamesType()));

		newChildDescriptors.add
			(createChildParameter
				(_2010Package.eINSTANCE.getServiceUtilizationType_MultipleObjectInstanceNamesReserved(),
				 _2010Factory.eINSTANCE.createMultipleObjectInstanceNamesReservedType()));

		newChildDescriptors.add
			(createChildParameter
				(_2010Package.eINSTANCE.getServiceUtilizationType_ReleaseMultipleObjectInstanceNames(),
				 _2010Factory.eINSTANCE.createReleaseMultipleObjectInstanceNamesType()));

		newChildDescriptors.add
			(createChildParameter
				(_2010Package.eINSTANCE.getServiceUtilizationType_RegisterObjectInstance(),
				 _2010Factory.eINSTANCE.createRegisterObjectInstanceType()));

		newChildDescriptors.add
			(createChildParameter
				(_2010Package.eINSTANCE.getServiceUtilizationType_DiscoverObjectInstance(),
				 _2010Factory.eINSTANCE.createDiscoverObjectInstanceType()));

		newChildDescriptors.add
			(createChildParameter
				(_2010Package.eINSTANCE.getServiceUtilizationType_UpdateAttributeValues(),
				 _2010Factory.eINSTANCE.createUpdateAttributeValuesType()));

		newChildDescriptors.add
			(createChildParameter
				(_2010Package.eINSTANCE.getServiceUtilizationType_ReflectAttributeValues(),
				 _2010Factory.eINSTANCE.createReflectAttributeValuesType()));

		newChildDescriptors.add
			(createChildParameter
				(_2010Package.eINSTANCE.getServiceUtilizationType_SendInteraction(),
				 _2010Factory.eINSTANCE.createSendInteractionType()));

		newChildDescriptors.add
			(createChildParameter
				(_2010Package.eINSTANCE.getServiceUtilizationType_ReceiveInteraction(),
				 _2010Factory.eINSTANCE.createReceiveInteractionType()));

		newChildDescriptors.add
			(createChildParameter
				(_2010Package.eINSTANCE.getServiceUtilizationType_DeleteObjectInstance(),
				 _2010Factory.eINSTANCE.createDeleteObjectInstanceType()));

		newChildDescriptors.add
			(createChildParameter
				(_2010Package.eINSTANCE.getServiceUtilizationType_Removeobjectinstance(),
				 _2010Factory.eINSTANCE.createRemoveobjectinstanceType()));

		newChildDescriptors.add
			(createChildParameter
				(_2010Package.eINSTANCE.getServiceUtilizationType_LocalDeleteObjectInstance(),
				 _2010Factory.eINSTANCE.createLocalDeleteObjectInstanceType()));

		newChildDescriptors.add
			(createChildParameter
				(_2010Package.eINSTANCE.getServiceUtilizationType_AttributesInScope(),
				 _2010Factory.eINSTANCE.createAttributesInScopeType()));

		newChildDescriptors.add
			(createChildParameter
				(_2010Package.eINSTANCE.getServiceUtilizationType_AttributesOutOfScope(),
				 _2010Factory.eINSTANCE.createAttributesOutOfScopeType()));

		newChildDescriptors.add
			(createChildParameter
				(_2010Package.eINSTANCE.getServiceUtilizationType_RequestAttributeValueUpdate(),
				 _2010Factory.eINSTANCE.createRequestAttributeValueUpdateType()));

		newChildDescriptors.add
			(createChildParameter
				(_2010Package.eINSTANCE.getServiceUtilizationType_ProvideAttributeValueUpdate(),
				 _2010Factory.eINSTANCE.createProvideAttributeValueUpdateType()));

		newChildDescriptors.add
			(createChildParameter
				(_2010Package.eINSTANCE.getServiceUtilizationType_TurnUpdatesOnForObjectInstance(),
				 _2010Factory.eINSTANCE.createTurnUpdatesOnForObjectInstanceType()));

		newChildDescriptors.add
			(createChildParameter
				(_2010Package.eINSTANCE.getServiceUtilizationType_TurnUpdatesOffForObjectInstance(),
				 _2010Factory.eINSTANCE.createTurnUpdatesOffForObjectInstanceType()));

		newChildDescriptors.add
			(createChildParameter
				(_2010Package.eINSTANCE.getServiceUtilizationType_RequestAttributeTransportationTypeChange(),
				 _2010Factory.eINSTANCE.createRequestAttributeTransportationTypeChangeType()));

		newChildDescriptors.add
			(createChildParameter
				(_2010Package.eINSTANCE.getServiceUtilizationType_ConfirmAttributeTransportationTypeChange(),
				 _2010Factory.eINSTANCE.createConfirmAttributeTransportationTypeChangeType()));

		newChildDescriptors.add
			(createChildParameter
				(_2010Package.eINSTANCE.getServiceUtilizationType_QueryAttributeTransportationType(),
				 _2010Factory.eINSTANCE.createQueryAttributeTransportationTypeType()));

		newChildDescriptors.add
			(createChildParameter
				(_2010Package.eINSTANCE.getServiceUtilizationType_ReportAttributeTransportationType(),
				 _2010Factory.eINSTANCE.createReportAttributeTransportationTypeType()));

		newChildDescriptors.add
			(createChildParameter
				(_2010Package.eINSTANCE.getServiceUtilizationType_RequestInteractionTransportationTypeChange(),
				 _2010Factory.eINSTANCE.createRequestInteractionTransportationTypeChangeType()));

		newChildDescriptors.add
			(createChildParameter
				(_2010Package.eINSTANCE.getServiceUtilizationType_ConfirmInteractionTransportationTypeChange(),
				 _2010Factory.eINSTANCE.createConfirmInteractionTransportationTypeChangeType()));

		newChildDescriptors.add
			(createChildParameter
				(_2010Package.eINSTANCE.getServiceUtilizationType_QueryInteractionTransportationType(),
				 _2010Factory.eINSTANCE.createQueryInteractionTransportationTypeType()));

		newChildDescriptors.add
			(createChildParameter
				(_2010Package.eINSTANCE.getServiceUtilizationType_ReportInteractionTransportationType(),
				 _2010Factory.eINSTANCE.createReportInteractionTransportationTypeType()));

		newChildDescriptors.add
			(createChildParameter
				(_2010Package.eINSTANCE.getServiceUtilizationType_UnconditionalAttributeOwnershipDivestiture(),
				 _2010Factory.eINSTANCE.createUnconditionalAttributeOwnershipDivestitureType()));

		newChildDescriptors.add
			(createChildParameter
				(_2010Package.eINSTANCE.getServiceUtilizationType_NegotiatedAttributeOwnershipDivestiture(),
				 _2010Factory.eINSTANCE.createNegotiatedAttributeOwnershipDivestitureType()));

		newChildDescriptors.add
			(createChildParameter
				(_2010Package.eINSTANCE.getServiceUtilizationType_RequestAttributeOwnershipAssumption(),
				 _2010Factory.eINSTANCE.createRequestAttributeOwnershipAssumptionType()));

		newChildDescriptors.add
			(createChildParameter
				(_2010Package.eINSTANCE.getServiceUtilizationType_RequestDivestitureConfirmation(),
				 _2010Factory.eINSTANCE.createRequestDivestitureConfirmationType()));

		newChildDescriptors.add
			(createChildParameter
				(_2010Package.eINSTANCE.getServiceUtilizationType_ConfirmDivestiture(),
				 _2010Factory.eINSTANCE.createConfirmDivestitureType()));

		newChildDescriptors.add
			(createChildParameter
				(_2010Package.eINSTANCE.getServiceUtilizationType_AttributeOwnershipAcquisitionNotification(),
				 _2010Factory.eINSTANCE.createAttributeOwnershipAcquisitionNotificationType()));

		newChildDescriptors.add
			(createChildParameter
				(_2010Package.eINSTANCE.getServiceUtilizationType_AttributeOwnershipAcquisition(),
				 _2010Factory.eINSTANCE.createAttributeOwnershipAcquisitionType()));

		newChildDescriptors.add
			(createChildParameter
				(_2010Package.eINSTANCE.getServiceUtilizationType_AttributeOwnershipAcquisitionIfAvailable(),
				 _2010Factory.eINSTANCE.createAttributeOwnershipAcquisitionIfAvailableType()));

		newChildDescriptors.add
			(createChildParameter
				(_2010Package.eINSTANCE.getServiceUtilizationType_AttributeOwnershipUnavailable(),
				 _2010Factory.eINSTANCE.createAttributeOwnershipUnavailableType()));

		newChildDescriptors.add
			(createChildParameter
				(_2010Package.eINSTANCE.getServiceUtilizationType_RequestAttributeOwnershipRelease(),
				 _2010Factory.eINSTANCE.createRequestAttributeOwnershipReleaseType()));

		newChildDescriptors.add
			(createChildParameter
				(_2010Package.eINSTANCE.getServiceUtilizationType_AttributeOwnershipReleaseDenied(),
				 _2010Factory.eINSTANCE.createAttributeOwnershipReleaseDeniedType()));

		newChildDescriptors.add
			(createChildParameter
				(_2010Package.eINSTANCE.getServiceUtilizationType_AttributeOwnershipDivestitureIfWanted(),
				 _2010Factory.eINSTANCE.createAttributeOwnershipDivestitureIfWantedType()));

		newChildDescriptors.add
			(createChildParameter
				(_2010Package.eINSTANCE.getServiceUtilizationType_CancelNegotiatedAttributeOwnershipDivestiture(),
				 _2010Factory.eINSTANCE.createCancelNegotiatedAttributeOwnershipDivestitureType()));

		newChildDescriptors.add
			(createChildParameter
				(_2010Package.eINSTANCE.getServiceUtilizationType_CancelAttributeOwnershipAcquisition(),
				 _2010Factory.eINSTANCE.createCancelAttributeOwnershipAcquisitionType()));

		newChildDescriptors.add
			(createChildParameter
				(_2010Package.eINSTANCE.getServiceUtilizationType_ConfirmAttributeOwnershipAcquisitionCancellation(),
				 _2010Factory.eINSTANCE.createConfirmAttributeOwnershipAcquisitionCancellationType()));

		newChildDescriptors.add
			(createChildParameter
				(_2010Package.eINSTANCE.getServiceUtilizationType_QueryAttributeOwnership(),
				 _2010Factory.eINSTANCE.createQueryAttributeOwnershipType()));

		newChildDescriptors.add
			(createChildParameter
				(_2010Package.eINSTANCE.getServiceUtilizationType_InformAttributeOwnership(),
				 _2010Factory.eINSTANCE.createInformAttributeOwnershipType()));

		newChildDescriptors.add
			(createChildParameter
				(_2010Package.eINSTANCE.getServiceUtilizationType_IsAttributeOwnedByFederate(),
				 _2010Factory.eINSTANCE.createIsAttributeOwnedByFederateType()));

		newChildDescriptors.add
			(createChildParameter
				(_2010Package.eINSTANCE.getServiceUtilizationType_EnableTimeRegulation(),
				 _2010Factory.eINSTANCE.createEnableTimeRegulationType()));

		newChildDescriptors.add
			(createChildParameter
				(_2010Package.eINSTANCE.getServiceUtilizationType_TimeRegulationEnabled(),
				 _2010Factory.eINSTANCE.createTimeRegulationEnabledType()));

		newChildDescriptors.add
			(createChildParameter
				(_2010Package.eINSTANCE.getServiceUtilizationType_DisableTimeRegulation(),
				 _2010Factory.eINSTANCE.createDisableTimeRegulationType()));

		newChildDescriptors.add
			(createChildParameter
				(_2010Package.eINSTANCE.getServiceUtilizationType_EnableTimeConstrained(),
				 _2010Factory.eINSTANCE.createEnableTimeConstrainedType()));

		newChildDescriptors.add
			(createChildParameter
				(_2010Package.eINSTANCE.getServiceUtilizationType_TimeConstrainedEnabled(),
				 _2010Factory.eINSTANCE.createTimeConstrainedEnabledType()));

		newChildDescriptors.add
			(createChildParameter
				(_2010Package.eINSTANCE.getServiceUtilizationType_DisableTimeConstrained(),
				 _2010Factory.eINSTANCE.createDisableTimeConstrainedType()));

		newChildDescriptors.add
			(createChildParameter
				(_2010Package.eINSTANCE.getServiceUtilizationType_TimeAdvanceRequest(),
				 _2010Factory.eINSTANCE.createTimeAdvanceRequestType()));

		newChildDescriptors.add
			(createChildParameter
				(_2010Package.eINSTANCE.getServiceUtilizationType_TimeAdvanceRequestAvailable(),
				 _2010Factory.eINSTANCE.createTimeAdvanceRequestAvailableType()));

		newChildDescriptors.add
			(createChildParameter
				(_2010Package.eINSTANCE.getServiceUtilizationType_NextMessageRequest(),
				 _2010Factory.eINSTANCE.createNextMessageRequestType()));

		newChildDescriptors.add
			(createChildParameter
				(_2010Package.eINSTANCE.getServiceUtilizationType_NextMessageRequestAvailable(),
				 _2010Factory.eINSTANCE.createNextMessageRequestAvailableType()));

		newChildDescriptors.add
			(createChildParameter
				(_2010Package.eINSTANCE.getServiceUtilizationType_FlushQueueRequest(),
				 _2010Factory.eINSTANCE.createFlushQueueRequestType()));

		newChildDescriptors.add
			(createChildParameter
				(_2010Package.eINSTANCE.getServiceUtilizationType_TimeAdvanceGrant(),
				 _2010Factory.eINSTANCE.createTimeAdvanceGrantType()));

		newChildDescriptors.add
			(createChildParameter
				(_2010Package.eINSTANCE.getServiceUtilizationType_EnableAsynchronousDelivery(),
				 _2010Factory.eINSTANCE.createEnableAsynchronousDeliveryType()));

		newChildDescriptors.add
			(createChildParameter
				(_2010Package.eINSTANCE.getServiceUtilizationType_DisableAsynchronousDelivery(),
				 _2010Factory.eINSTANCE.createDisableAsynchronousDeliveryType()));

		newChildDescriptors.add
			(createChildParameter
				(_2010Package.eINSTANCE.getServiceUtilizationType_QueryGALT(),
				 _2010Factory.eINSTANCE.createQueryGALTType()));

		newChildDescriptors.add
			(createChildParameter
				(_2010Package.eINSTANCE.getServiceUtilizationType_QueryLogicalTime(),
				 _2010Factory.eINSTANCE.createQueryLogicalTimeType()));

		newChildDescriptors.add
			(createChildParameter
				(_2010Package.eINSTANCE.getServiceUtilizationType_QueryLITS(),
				 _2010Factory.eINSTANCE.createQueryLITSType()));

		newChildDescriptors.add
			(createChildParameter
				(_2010Package.eINSTANCE.getServiceUtilizationType_ModifyLookahead(),
				 _2010Factory.eINSTANCE.createModifyLookaheadType()));

		newChildDescriptors.add
			(createChildParameter
				(_2010Package.eINSTANCE.getServiceUtilizationType_QueryLookahead(),
				 _2010Factory.eINSTANCE.createQueryLookaheadType()));

		newChildDescriptors.add
			(createChildParameter
				(_2010Package.eINSTANCE.getServiceUtilizationType_Retract(),
				 _2010Factory.eINSTANCE.createRetractType()));

		newChildDescriptors.add
			(createChildParameter
				(_2010Package.eINSTANCE.getServiceUtilizationType_RequestRetraction(),
				 _2010Factory.eINSTANCE.createRequestRetractionType()));

		newChildDescriptors.add
			(createChildParameter
				(_2010Package.eINSTANCE.getServiceUtilizationType_ChangeAttributeOrderType(),
				 _2010Factory.eINSTANCE.createChangeAttributeOrderTypeType()));

		newChildDescriptors.add
			(createChildParameter
				(_2010Package.eINSTANCE.getServiceUtilizationType_ChangeInteractionOrderType(),
				 _2010Factory.eINSTANCE.createChangeInteractionOrderTypeType()));

		newChildDescriptors.add
			(createChildParameter
				(_2010Package.eINSTANCE.getServiceUtilizationType_CreateRegion(),
				 _2010Factory.eINSTANCE.createCreateRegionType()));

		newChildDescriptors.add
			(createChildParameter
				(_2010Package.eINSTANCE.getServiceUtilizationType_CommitRegionModifications(),
				 _2010Factory.eINSTANCE.createCommitRegionModificationsType()));

		newChildDescriptors.add
			(createChildParameter
				(_2010Package.eINSTANCE.getServiceUtilizationType_DeleteRegion(),
				 _2010Factory.eINSTANCE.createDeleteRegionType()));

		newChildDescriptors.add
			(createChildParameter
				(_2010Package.eINSTANCE.getServiceUtilizationType_RegisterObjectInstanceWithRegions(),
				 _2010Factory.eINSTANCE.createRegisterObjectInstanceWithRegionsType()));

		newChildDescriptors.add
			(createChildParameter
				(_2010Package.eINSTANCE.getServiceUtilizationType_AssociateRegionsForUpdates(),
				 _2010Factory.eINSTANCE.createAssociateRegionsForUpdatesType()));

		newChildDescriptors.add
			(createChildParameter
				(_2010Package.eINSTANCE.getServiceUtilizationType_UnassociateRegionsForUpdates(),
				 _2010Factory.eINSTANCE.createUnassociateRegionsForUpdatesType()));

		newChildDescriptors.add
			(createChildParameter
				(_2010Package.eINSTANCE.getServiceUtilizationType_SubscribeObjectClassAttributesWithRegions(),
				 _2010Factory.eINSTANCE.createSubscribeObjectClassAttributesWithRegionsType()));

		newChildDescriptors.add
			(createChildParameter
				(_2010Package.eINSTANCE.getServiceUtilizationType_UnsubscribeObjectClassAttributesWithRegions(),
				 _2010Factory.eINSTANCE.createUnsubscribeObjectClassAttributesWithRegionsType()));

		newChildDescriptors.add
			(createChildParameter
				(_2010Package.eINSTANCE.getServiceUtilizationType_SubscribeInteractionClassWithRegions(),
				 _2010Factory.eINSTANCE.createSubscribeInteractionClassWithRegionsType()));

		newChildDescriptors.add
			(createChildParameter
				(_2010Package.eINSTANCE.getServiceUtilizationType_UnsubscribeInteractionClassWithRegions(),
				 _2010Factory.eINSTANCE.createUnsubscribeInteractionClassWithRegionsType()));

		newChildDescriptors.add
			(createChildParameter
				(_2010Package.eINSTANCE.getServiceUtilizationType_SendInteractionWithRegions(),
				 _2010Factory.eINSTANCE.createSendInteractionWithRegionsType()));

		newChildDescriptors.add
			(createChildParameter
				(_2010Package.eINSTANCE.getServiceUtilizationType_RequestAttributeValueUpdateWithRegions(),
				 _2010Factory.eINSTANCE.createRequestAttributeValueUpdateWithRegionsType()));

		newChildDescriptors.add
			(createChildParameter
				(_2010Package.eINSTANCE.getServiceUtilizationType_GetAutomaticResignDirective(),
				 _2010Factory.eINSTANCE.createGetAutomaticResignDirectiveType()));

		newChildDescriptors.add
			(createChildParameter
				(_2010Package.eINSTANCE.getServiceUtilizationType_SetAutomaticResignDirective(),
				 _2010Factory.eINSTANCE.createSetAutomaticResignDirectiveType()));

		newChildDescriptors.add
			(createChildParameter
				(_2010Package.eINSTANCE.getServiceUtilizationType_GetFederateHandle(),
				 _2010Factory.eINSTANCE.createGetFederateHandleType()));

		newChildDescriptors.add
			(createChildParameter
				(_2010Package.eINSTANCE.getServiceUtilizationType_GetFederateName(),
				 _2010Factory.eINSTANCE.createGetFederateNameType()));

		newChildDescriptors.add
			(createChildParameter
				(_2010Package.eINSTANCE.getServiceUtilizationType_GetObjectClassHandle(),
				 _2010Factory.eINSTANCE.createGetObjectClassHandleType()));

		newChildDescriptors.add
			(createChildParameter
				(_2010Package.eINSTANCE.getServiceUtilizationType_GetObjectClassName(),
				 _2010Factory.eINSTANCE.createGetObjectClassNameType()));

		newChildDescriptors.add
			(createChildParameter
				(_2010Package.eINSTANCE.getServiceUtilizationType_GetKnownObjectClassHandle(),
				 _2010Factory.eINSTANCE.createGetKnownObjectClassHandleType()));

		newChildDescriptors.add
			(createChildParameter
				(_2010Package.eINSTANCE.getServiceUtilizationType_GetObjectInstanceHandle(),
				 _2010Factory.eINSTANCE.createGetObjectInstanceHandleType()));

		newChildDescriptors.add
			(createChildParameter
				(_2010Package.eINSTANCE.getServiceUtilizationType_GetObjectInstanceName(),
				 _2010Factory.eINSTANCE.createGetObjectInstanceNameType()));

		newChildDescriptors.add
			(createChildParameter
				(_2010Package.eINSTANCE.getServiceUtilizationType_GetAttributeHandle(),
				 _2010Factory.eINSTANCE.createGetAttributeHandleType()));

		newChildDescriptors.add
			(createChildParameter
				(_2010Package.eINSTANCE.getServiceUtilizationType_GetAttributeName(),
				 _2010Factory.eINSTANCE.createGetAttributeNameType()));

		newChildDescriptors.add
			(createChildParameter
				(_2010Package.eINSTANCE.getServiceUtilizationType_GetUpdateRateValue(),
				 _2010Factory.eINSTANCE.createGetUpdateRateValueType()));

		newChildDescriptors.add
			(createChildParameter
				(_2010Package.eINSTANCE.getServiceUtilizationType_GetUpdateRateValueForAttribute(),
				 _2010Factory.eINSTANCE.createGetUpdateRateValueForAttributeType()));

		newChildDescriptors.add
			(createChildParameter
				(_2010Package.eINSTANCE.getServiceUtilizationType_GetInteractionClassHandle(),
				 _2010Factory.eINSTANCE.createGetInteractionClassHandleType()));

		newChildDescriptors.add
			(createChildParameter
				(_2010Package.eINSTANCE.getServiceUtilizationType_GetInteractionClassName(),
				 _2010Factory.eINSTANCE.createGetInteractionClassNameType()));

		newChildDescriptors.add
			(createChildParameter
				(_2010Package.eINSTANCE.getServiceUtilizationType_GetParameterHandle(),
				 _2010Factory.eINSTANCE.createGetParameterHandleType()));

		newChildDescriptors.add
			(createChildParameter
				(_2010Package.eINSTANCE.getServiceUtilizationType_GetParameterName(),
				 _2010Factory.eINSTANCE.createGetParameterNameType()));

		newChildDescriptors.add
			(createChildParameter
				(_2010Package.eINSTANCE.getServiceUtilizationType_GetOrderType(),
				 _2010Factory.eINSTANCE.createGetOrderTypeType()));

		newChildDescriptors.add
			(createChildParameter
				(_2010Package.eINSTANCE.getServiceUtilizationType_GetOrderName(),
				 _2010Factory.eINSTANCE.createGetOrderNameType()));

		newChildDescriptors.add
			(createChildParameter
				(_2010Package.eINSTANCE.getServiceUtilizationType_GetTransportationTypeHandle(),
				 _2010Factory.eINSTANCE.createGetTransportationTypeHandleType()));

		newChildDescriptors.add
			(createChildParameter
				(_2010Package.eINSTANCE.getServiceUtilizationType_GetTransportationTypeName(),
				 _2010Factory.eINSTANCE.createGetTransportationTypeNameType()));

		newChildDescriptors.add
			(createChildParameter
				(_2010Package.eINSTANCE.getServiceUtilizationType_GetAvailableDimensionsForClassAttribute(),
				 _2010Factory.eINSTANCE.createGetAvailableDimensionsForClassAttributeType()));

		newChildDescriptors.add
			(createChildParameter
				(_2010Package.eINSTANCE.getServiceUtilizationType_GetAvailableDimensionsForInteractionClass(),
				 _2010Factory.eINSTANCE.createGetAvailableDimensionsForInteractionClassType()));

		newChildDescriptors.add
			(createChildParameter
				(_2010Package.eINSTANCE.getServiceUtilizationType_GetDimensionHandle(),
				 _2010Factory.eINSTANCE.createGetDimensionHandleType()));

		newChildDescriptors.add
			(createChildParameter
				(_2010Package.eINSTANCE.getServiceUtilizationType_GetDimensionName(),
				 _2010Factory.eINSTANCE.createGetDimensionNameType()));

		newChildDescriptors.add
			(createChildParameter
				(_2010Package.eINSTANCE.getServiceUtilizationType_GetDimensionUpperBound(),
				 _2010Factory.eINSTANCE.createGetDimensionUpperBoundType()));

		newChildDescriptors.add
			(createChildParameter
				(_2010Package.eINSTANCE.getServiceUtilizationType_GetDimensionHandleSet(),
				 _2010Factory.eINSTANCE.createGetDimensionHandleSetType()));

		newChildDescriptors.add
			(createChildParameter
				(_2010Package.eINSTANCE.getServiceUtilizationType_GetRangeBounds(),
				 _2010Factory.eINSTANCE.createGetRangeBoundsType()));

		newChildDescriptors.add
			(createChildParameter
				(_2010Package.eINSTANCE.getServiceUtilizationType_SetRangeBounds(),
				 _2010Factory.eINSTANCE.createSetRangeBoundsType()));

		newChildDescriptors.add
			(createChildParameter
				(_2010Package.eINSTANCE.getServiceUtilizationType_NormalizeFederateHandle(),
				 _2010Factory.eINSTANCE.createNormalizeFederateHandleType()));

		newChildDescriptors.add
			(createChildParameter
				(_2010Package.eINSTANCE.getServiceUtilizationType_NormalizeServiceGroup(),
				 _2010Factory.eINSTANCE.createNormalizeServiceGroupType()));

		newChildDescriptors.add
			(createChildParameter
				(_2010Package.eINSTANCE.getServiceUtilizationType_EnableObjectClassRelevanceAdvisorySwitch(),
				 _2010Factory.eINSTANCE.createEnableObjectClassRelevanceAdvisorySwitchType()));

		newChildDescriptors.add
			(createChildParameter
				(_2010Package.eINSTANCE.getServiceUtilizationType_DisableObjectClassRelevanceAdvisorySwitch(),
				 _2010Factory.eINSTANCE.createDisableObjectClassRelevanceAdvisorySwitchType()));

		newChildDescriptors.add
			(createChildParameter
				(_2010Package.eINSTANCE.getServiceUtilizationType_EnableAttributeRelevanceAdvisorySwitch(),
				 _2010Factory.eINSTANCE.createEnableAttributeRelevanceAdvisorySwitchType()));

		newChildDescriptors.add
			(createChildParameter
				(_2010Package.eINSTANCE.getServiceUtilizationType_DisableAttributeRelevanceAdvisorySwitch(),
				 _2010Factory.eINSTANCE.createDisableAttributeRelevanceAdvisorySwitchType()));

		newChildDescriptors.add
			(createChildParameter
				(_2010Package.eINSTANCE.getServiceUtilizationType_EnableAttributeScopeAdvisorySwitch(),
				 _2010Factory.eINSTANCE.createEnableAttributeScopeAdvisorySwitchType()));

		newChildDescriptors.add
			(createChildParameter
				(_2010Package.eINSTANCE.getServiceUtilizationType_DisableAttributeScopeAdvisorySwitch(),
				 _2010Factory.eINSTANCE.createDisableAttributeScopeAdvisorySwitchType()));

		newChildDescriptors.add
			(createChildParameter
				(_2010Package.eINSTANCE.getServiceUtilizationType_EnableInteractionRelevanceAdvisorySwitch(),
				 _2010Factory.eINSTANCE.createEnableInteractionRelevanceAdvisorySwitchType()));

		newChildDescriptors.add
			(createChildParameter
				(_2010Package.eINSTANCE.getServiceUtilizationType_DisableInteractionRelevanceAdvisorySwitch(),
				 _2010Factory.eINSTANCE.createDisableInteractionRelevanceAdvisorySwitchType()));

		newChildDescriptors.add
			(createChildParameter
				(_2010Package.eINSTANCE.getServiceUtilizationType_EvokeCallback(),
				 _2010Factory.eINSTANCE.createEvokeCallbackType()));

		newChildDescriptors.add
			(createChildParameter
				(_2010Package.eINSTANCE.getServiceUtilizationType_EvokeMultipleCallbacks(),
				 _2010Factory.eINSTANCE.createEvokeMultipleCallbacksType()));

		newChildDescriptors.add
			(createChildParameter
				(_2010Package.eINSTANCE.getServiceUtilizationType_EnableCallbacks(),
				 _2010Factory.eINSTANCE.createEnableCallbacksType()));

		newChildDescriptors.add
			(createChildParameter
				(_2010Package.eINSTANCE.getServiceUtilizationType_DisableCallbacks(),
				 _2010Factory.eINSTANCE.createDisableCallbacksType()));
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
