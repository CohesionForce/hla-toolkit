/**
 */
package org.sisostds.schemas.ieee1516._2010.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.sisostds.schemas.ieee1516._2010.AbortFederationRestoreType;
import org.sisostds.schemas.ieee1516._2010.AbortFederationSaveType;
import org.sisostds.schemas.ieee1516._2010.AlternativeType;
import org.sisostds.schemas.ieee1516._2010.AnnounceSynchronizationPointType;
import org.sisostds.schemas.ieee1516._2010.ApplicationDomainType;
import org.sisostds.schemas.ieee1516._2010.ArrayDataType;
import org.sisostds.schemas.ieee1516._2010.ArrayDataType1;
import org.sisostds.schemas.ieee1516._2010.ArrayDataTypesType;
import org.sisostds.schemas.ieee1516._2010.ArrayDataTypesType1;
import org.sisostds.schemas.ieee1516._2010.ArrayDatatypeEncodingType;
import org.sisostds.schemas.ieee1516._2010.AssociateRegionsForUpdatesType;
import org.sisostds.schemas.ieee1516._2010.AttributeOwnershipAcquisitionIfAvailableType;
import org.sisostds.schemas.ieee1516._2010.AttributeOwnershipAcquisitionNotificationType;
import org.sisostds.schemas.ieee1516._2010.AttributeOwnershipAcquisitionType;
import org.sisostds.schemas.ieee1516._2010.AttributeOwnershipDivestitureIfWantedType;
import org.sisostds.schemas.ieee1516._2010.AttributeOwnershipReleaseDeniedType;
import org.sisostds.schemas.ieee1516._2010.AttributeOwnershipUnavailableType;
import org.sisostds.schemas.ieee1516._2010.AttributeType;
import org.sisostds.schemas.ieee1516._2010.AttributeType1;
import org.sisostds.schemas.ieee1516._2010.AttributesInScopeType;
import org.sisostds.schemas.ieee1516._2010.AttributesOutOfScopeType;
import org.sisostds.schemas.ieee1516._2010.BasicDataRepresentationsType;
import org.sisostds.schemas.ieee1516._2010.BasicDataType;
import org.sisostds.schemas.ieee1516._2010.BasicDataType1;
import org.sisostds.schemas.ieee1516._2010.CancelAttributeOwnershipAcquisitionType;
import org.sisostds.schemas.ieee1516._2010.CancelNegotiatedAttributeOwnershipDivestitureType;
import org.sisostds.schemas.ieee1516._2010.CapabilityType;
import org.sisostds.schemas.ieee1516._2010.CardinalityType;
import org.sisostds.schemas.ieee1516._2010.ChangeAttributeOrderTypeType;
import org.sisostds.schemas.ieee1516._2010.ChangeInteractionOrderTypeType;
import org.sisostds.schemas.ieee1516._2010.CommitRegionModificationsType;
import org.sisostds.schemas.ieee1516._2010.ConfirmAttributeOwnershipAcquisitionCancellationType;
import org.sisostds.schemas.ieee1516._2010.ConfirmAttributeTransportationTypeChangeType;
import org.sisostds.schemas.ieee1516._2010.ConfirmDivestitureType;
import org.sisostds.schemas.ieee1516._2010.ConfirmFederationRestorationRequestType;
import org.sisostds.schemas.ieee1516._2010.ConfirmInteractionTransportationTypeChangeType;
import org.sisostds.schemas.ieee1516._2010.ConfirmSynchronizationPointRegistrationType;
import org.sisostds.schemas.ieee1516._2010.ConnectType;
import org.sisostds.schemas.ieee1516._2010.ConnectionLostType;
import org.sisostds.schemas.ieee1516._2010.CreateFederationExecutionType;
import org.sisostds.schemas.ieee1516._2010.CreateRegionType;
import org.sisostds.schemas.ieee1516._2010.DataTypesType;
import org.sisostds.schemas.ieee1516._2010.DeleteObjectInstanceType;
import org.sisostds.schemas.ieee1516._2010.DeleteRegionType;
import org.sisostds.schemas.ieee1516._2010.DestroyFederationExecutionType;
import org.sisostds.schemas.ieee1516._2010.DimensionType;
import org.sisostds.schemas.ieee1516._2010.DimensionType1;
import org.sisostds.schemas.ieee1516._2010.DimensionsType;
import org.sisostds.schemas.ieee1516._2010.DimensionsType1;
import org.sisostds.schemas.ieee1516._2010.DimensionsType2;
import org.sisostds.schemas.ieee1516._2010.DisableAsynchronousDeliveryType;
import org.sisostds.schemas.ieee1516._2010.DisableAttributeRelevanceAdvisorySwitchType;
import org.sisostds.schemas.ieee1516._2010.DisableAttributeScopeAdvisorySwitchType;
import org.sisostds.schemas.ieee1516._2010.DisableCallbacksType;
import org.sisostds.schemas.ieee1516._2010.DisableInteractionRelevanceAdvisorySwitchType;
import org.sisostds.schemas.ieee1516._2010.DisableObjectClassRelevanceAdvisorySwitchType;
import org.sisostds.schemas.ieee1516._2010.DisableTimeConstrainedType;
import org.sisostds.schemas.ieee1516._2010.DisableTimeRegulationType;
import org.sisostds.schemas.ieee1516._2010.DisconnectType;
import org.sisostds.schemas.ieee1516._2010.DiscoverObjectInstanceType;
import org.sisostds.schemas.ieee1516._2010.DocumentRoot;
import org.sisostds.schemas.ieee1516._2010.EnableAsynchronousDeliveryType;
import org.sisostds.schemas.ieee1516._2010.EnableAttributeRelevanceAdvisorySwitchType;
import org.sisostds.schemas.ieee1516._2010.EnableAttributeScopeAdvisorySwitchType;
import org.sisostds.schemas.ieee1516._2010.EnableCallbacksType;
import org.sisostds.schemas.ieee1516._2010.EnableInteractionRelevanceAdvisorySwitchType;
import org.sisostds.schemas.ieee1516._2010.EnableObjectClassRelevanceAdvisorySwitchType;
import org.sisostds.schemas.ieee1516._2010.EnableTimeConstrainedType;
import org.sisostds.schemas.ieee1516._2010.EnableTimeRegulationType;
import org.sisostds.schemas.ieee1516._2010.EndianType;
import org.sisostds.schemas.ieee1516._2010.EnumeratedDataType;
import org.sisostds.schemas.ieee1516._2010.EnumeratedDataType1;
import org.sisostds.schemas.ieee1516._2010.EnumeratedDataTypesType;
import org.sisostds.schemas.ieee1516._2010.EnumeratorType;
import org.sisostds.schemas.ieee1516._2010.EvokeCallbackType;
import org.sisostds.schemas.ieee1516._2010.EvokeMultipleCallbacksType;
import org.sisostds.schemas.ieee1516._2010.FederateRestoreCompleteType;
import org.sisostds.schemas.ieee1516._2010.FederateSaveBegunType;
import org.sisostds.schemas.ieee1516._2010.FederateSaveCompleteType;
import org.sisostds.schemas.ieee1516._2010.FederationRestoreBegunType;
import org.sisostds.schemas.ieee1516._2010.FederationRestoreStatusResponseType;
import org.sisostds.schemas.ieee1516._2010.FederationRestoredType;
import org.sisostds.schemas.ieee1516._2010.FederationSaveStatusResponseType;
import org.sisostds.schemas.ieee1516._2010.FederationSavedType;
import org.sisostds.schemas.ieee1516._2010.FederationSynchronizedType;
import org.sisostds.schemas.ieee1516._2010.FieldType;
import org.sisostds.schemas.ieee1516._2010.FixedRecordDataType;
import org.sisostds.schemas.ieee1516._2010.FixedRecordDataType1;
import org.sisostds.schemas.ieee1516._2010.FixedRecordDataTypesType;
import org.sisostds.schemas.ieee1516._2010.FixedRecordEncodingType;
import org.sisostds.schemas.ieee1516._2010.FlushQueueRequestType;
import org.sisostds.schemas.ieee1516._2010.GetAttributeHandleType;
import org.sisostds.schemas.ieee1516._2010.GetAttributeNameType;
import org.sisostds.schemas.ieee1516._2010.GetAutomaticResignDirectiveType;
import org.sisostds.schemas.ieee1516._2010.GetAvailableDimensionsForClassAttributeType;
import org.sisostds.schemas.ieee1516._2010.GetAvailableDimensionsForInteractionClassType;
import org.sisostds.schemas.ieee1516._2010.GetDimensionHandleSetType;
import org.sisostds.schemas.ieee1516._2010.GetDimensionHandleType;
import org.sisostds.schemas.ieee1516._2010.GetDimensionNameType;
import org.sisostds.schemas.ieee1516._2010.GetDimensionUpperBoundType;
import org.sisostds.schemas.ieee1516._2010.GetFederateHandleType;
import org.sisostds.schemas.ieee1516._2010.GetFederateNameType;
import org.sisostds.schemas.ieee1516._2010.GetInteractionClassHandleType;
import org.sisostds.schemas.ieee1516._2010.GetInteractionClassNameType;
import org.sisostds.schemas.ieee1516._2010.GetKnownObjectClassHandleType;
import org.sisostds.schemas.ieee1516._2010.GetObjectClassHandleType;
import org.sisostds.schemas.ieee1516._2010.GetObjectClassNameType;
import org.sisostds.schemas.ieee1516._2010.GetObjectInstanceHandleType;
import org.sisostds.schemas.ieee1516._2010.GetObjectInstanceNameType;
import org.sisostds.schemas.ieee1516._2010.GetOrderNameType;
import org.sisostds.schemas.ieee1516._2010.GetOrderTypeType;
import org.sisostds.schemas.ieee1516._2010.GetParameterHandleType;
import org.sisostds.schemas.ieee1516._2010.GetParameterNameType;
import org.sisostds.schemas.ieee1516._2010.GetRangeBoundsType;
import org.sisostds.schemas.ieee1516._2010.GetTransportationTypeHandleType;
import org.sisostds.schemas.ieee1516._2010.GetTransportationTypeNameType;
import org.sisostds.schemas.ieee1516._2010.GetUpdateRateValueForAttributeType;
import org.sisostds.schemas.ieee1516._2010.GetUpdateRateValueType;
import org.sisostds.schemas.ieee1516._2010.GlyphType;
import org.sisostds.schemas.ieee1516._2010.GlyphType1;
import org.sisostds.schemas.ieee1516._2010.IdReferenceType;
import org.sisostds.schemas.ieee1516._2010.IdentificationType;
import org.sisostds.schemas.ieee1516._2010.IdentifierType;
import org.sisostds.schemas.ieee1516._2010.InformAttributeOwnershipType;
import org.sisostds.schemas.ieee1516._2010.InitiateFederateRestoreType;
import org.sisostds.schemas.ieee1516._2010.InitiateFederateSaveType;
import org.sisostds.schemas.ieee1516._2010.InteractionClassType;
import org.sisostds.schemas.ieee1516._2010.InteractionClassType1;
import org.sisostds.schemas.ieee1516._2010.InteractionsType;
import org.sisostds.schemas.ieee1516._2010.IsAttributeOwnedByFederateType;
import org.sisostds.schemas.ieee1516._2010.JoinFederationExecutionType;
import org.sisostds.schemas.ieee1516._2010.KeywordType;
import org.sisostds.schemas.ieee1516._2010.ListFederationExecutionsType;
import org.sisostds.schemas.ieee1516._2010.LocalDeleteObjectInstanceType;
import org.sisostds.schemas.ieee1516._2010.LookaheadType;
import org.sisostds.schemas.ieee1516._2010.ModelIdentificationType;
import org.sisostds.schemas.ieee1516._2010.ModelType;
import org.sisostds.schemas.ieee1516._2010.ModificationDateType;
import org.sisostds.schemas.ieee1516._2010.ModifyLookaheadType;
import org.sisostds.schemas.ieee1516._2010.MultipleObjectInstanceNamesReservedType;
import org.sisostds.schemas.ieee1516._2010.NegotiatedAttributeOwnershipDivestitureType;
import org.sisostds.schemas.ieee1516._2010.NextMessageRequestAvailableType;
import org.sisostds.schemas.ieee1516._2010.NextMessageRequestType;
import org.sisostds.schemas.ieee1516._2010.NonEmptyString1;
import org.sisostds.schemas.ieee1516._2010.NormalizeFederateHandleType;
import org.sisostds.schemas.ieee1516._2010.NormalizeServiceGroupType;
import org.sisostds.schemas.ieee1516._2010.NoteType;
import org.sisostds.schemas.ieee1516._2010.NotesType;
import org.sisostds.schemas.ieee1516._2010.ObjectClassType;
import org.sisostds.schemas.ieee1516._2010.ObjectClassType1;
import org.sisostds.schemas.ieee1516._2010.ObjectInstanceNameReservedType;
import org.sisostds.schemas.ieee1516._2010.ObjectModelType;
import org.sisostds.schemas.ieee1516._2010.ObjectsType;
import org.sisostds.schemas.ieee1516._2010.OrderType;
import org.sisostds.schemas.ieee1516._2010.OwnershipType;
import org.sisostds.schemas.ieee1516._2010.ParameterType;
import org.sisostds.schemas.ieee1516._2010.ParameterType1;
import org.sisostds.schemas.ieee1516._2010.PocType;
import org.sisostds.schemas.ieee1516._2010.PocType1;
import org.sisostds.schemas.ieee1516._2010.PocTypeType;
import org.sisostds.schemas.ieee1516._2010.ProvideAttributeValueUpdateType;
import org.sisostds.schemas.ieee1516._2010.PublishInteractionClassType;
import org.sisostds.schemas.ieee1516._2010.PublishObjectClassAttributesType;
import org.sisostds.schemas.ieee1516._2010.QueryAttributeOwnershipType;
import org.sisostds.schemas.ieee1516._2010.QueryAttributeTransportationTypeType;
import org.sisostds.schemas.ieee1516._2010.QueryFederationRestoreStatusType;
import org.sisostds.schemas.ieee1516._2010.QueryFederationSaveStatusType;
import org.sisostds.schemas.ieee1516._2010.QueryGALTType;
import org.sisostds.schemas.ieee1516._2010.QueryInteractionTransportationTypeType;
import org.sisostds.schemas.ieee1516._2010.QueryLITSType;
import org.sisostds.schemas.ieee1516._2010.QueryLogicalTimeType;
import org.sisostds.schemas.ieee1516._2010.QueryLookaheadType;
import org.sisostds.schemas.ieee1516._2010.RateType;
import org.sisostds.schemas.ieee1516._2010.ReceiveInteractionType;
import org.sisostds.schemas.ieee1516._2010.ReferenceType;
import org.sisostds.schemas.ieee1516._2010.ReflectAttributeValuesType;
import org.sisostds.schemas.ieee1516._2010.RegisterFederationSynchronizationPointType;
import org.sisostds.schemas.ieee1516._2010.RegisterObjectInstanceType;
import org.sisostds.schemas.ieee1516._2010.RegisterObjectInstanceWithRegionsType;
import org.sisostds.schemas.ieee1516._2010.ReleaseMultipleObjectInstanceNamesType;
import org.sisostds.schemas.ieee1516._2010.ReleaseObjectInstanceNameType;
import org.sisostds.schemas.ieee1516._2010.ReliableType;
import org.sisostds.schemas.ieee1516._2010.RemoveobjectinstanceType;
import org.sisostds.schemas.ieee1516._2010.ReportAttributeTransportationTypeType;
import org.sisostds.schemas.ieee1516._2010.ReportFederationExecutionsType;
import org.sisostds.schemas.ieee1516._2010.ReportInteractionTransportationTypeType;
import org.sisostds.schemas.ieee1516._2010.RequestAttributeOwnershipAssumptionType;
import org.sisostds.schemas.ieee1516._2010.RequestAttributeOwnershipReleaseType;
import org.sisostds.schemas.ieee1516._2010.RequestAttributeTransportationTypeChangeType;
import org.sisostds.schemas.ieee1516._2010.RequestAttributeValueUpdateType;
import org.sisostds.schemas.ieee1516._2010.RequestAttributeValueUpdateWithRegionsType;
import org.sisostds.schemas.ieee1516._2010.RequestDivestitureConfirmationType;
import org.sisostds.schemas.ieee1516._2010.RequestFederationRestoreType;
import org.sisostds.schemas.ieee1516._2010.RequestFederationSaveType;
import org.sisostds.schemas.ieee1516._2010.RequestInteractionTransportationTypeChangeType;
import org.sisostds.schemas.ieee1516._2010.RequestRetractionType;
import org.sisostds.schemas.ieee1516._2010.ReserveMultipleObjectInstanceNamesType;
import org.sisostds.schemas.ieee1516._2010.ReserveObjectInstanceNameType;
import org.sisostds.schemas.ieee1516._2010.ResignFederationExecutionType;
import org.sisostds.schemas.ieee1516._2010.ResignSwitchType;
import org.sisostds.schemas.ieee1516._2010.RetractType;
import org.sisostds.schemas.ieee1516._2010.SecurityClassificationType;
import org.sisostds.schemas.ieee1516._2010.SendInteractionType;
import org.sisostds.schemas.ieee1516._2010.SendInteractionWithRegionsType;
import org.sisostds.schemas.ieee1516._2010.ServiceUtilizationType;
import org.sisostds.schemas.ieee1516._2010.SetAutomaticResignDirectiveType;
import org.sisostds.schemas.ieee1516._2010.SetRangeBoundsType;
import org.sisostds.schemas.ieee1516._2010.SharingType;
import org.sisostds.schemas.ieee1516._2010.SimpleDataType;
import org.sisostds.schemas.ieee1516._2010.SimpleDataType1;
import org.sisostds.schemas.ieee1516._2010.SimpleDataTypesType;
import org.sisostds.schemas.ieee1516._2010.Size;
import org.sisostds.schemas.ieee1516._2010.StartRegistrationForObjectClassType;
import org.sisostds.schemas.ieee1516._2010.StopRegistrationForObjectClassType;
import org.sisostds.schemas.ieee1516._2010.SubscribeInteractionClassType;
import org.sisostds.schemas.ieee1516._2010.SubscribeInteractionClassWithRegionsType;
import org.sisostds.schemas.ieee1516._2010.SubscribeObjectClassAttributesType;
import org.sisostds.schemas.ieee1516._2010.SubscribeObjectClassAttributesWithRegionsType;
import org.sisostds.schemas.ieee1516._2010.SwitchType;
import org.sisostds.schemas.ieee1516._2010.SwitchesType;
import org.sisostds.schemas.ieee1516._2010.SynchronizationPointAchievedType;
import org.sisostds.schemas.ieee1516._2010.SynchronizationPointType;
import org.sisostds.schemas.ieee1516._2010.SynchronizationPointType1;
import org.sisostds.schemas.ieee1516._2010.SynchronizationsType;
import org.sisostds.schemas.ieee1516._2010.TagType;
import org.sisostds.schemas.ieee1516._2010.TagsType;
import org.sisostds.schemas.ieee1516._2010.TimeAdvanceGrantType;
import org.sisostds.schemas.ieee1516._2010.TimeAdvanceRequestAvailableType;
import org.sisostds.schemas.ieee1516._2010.TimeAdvanceRequestType;
import org.sisostds.schemas.ieee1516._2010.TimeConstrainedEnabledType;
import org.sisostds.schemas.ieee1516._2010.TimeRegulationEnabledType;
import org.sisostds.schemas.ieee1516._2010.TimeStampType;
import org.sisostds.schemas.ieee1516._2010.TimeType;
import org.sisostds.schemas.ieee1516._2010.TransportationType;
import org.sisostds.schemas.ieee1516._2010.TransportationType1;
import org.sisostds.schemas.ieee1516._2010.TransportationsType;
import org.sisostds.schemas.ieee1516._2010.TurnInteractionsOffType;
import org.sisostds.schemas.ieee1516._2010.TurnInteractionsOnType;
import org.sisostds.schemas.ieee1516._2010.TurnUpdatesOffForObjectInstanceType;
import org.sisostds.schemas.ieee1516._2010.TurnUpdatesOnForObjectInstanceType;
import org.sisostds.schemas.ieee1516._2010.TypeType;
import org.sisostds.schemas.ieee1516._2010.UnassociateRegionsForUpdatesType;
import org.sisostds.schemas.ieee1516._2010.UnconditionalAttributeOwnershipDivestitureType;
import org.sisostds.schemas.ieee1516._2010.UnpublishInteractionClassType;
import org.sisostds.schemas.ieee1516._2010.UnpublishObjectClassAttributesType;
import org.sisostds.schemas.ieee1516._2010.UnsubscribeInteractionClassType;
import org.sisostds.schemas.ieee1516._2010.UnsubscribeInteractionClassWithRegionsType;
import org.sisostds.schemas.ieee1516._2010.UnsubscribeObjectClassAttributesType;
import org.sisostds.schemas.ieee1516._2010.UnsubscribeObjectClassAttributesWithRegionsType;
import org.sisostds.schemas.ieee1516._2010.UpdateAttributeValuesType;
import org.sisostds.schemas.ieee1516._2010.UpdateRateType;
import org.sisostds.schemas.ieee1516._2010.UpdateRatesType;
import org.sisostds.schemas.ieee1516._2010.UpdateType;
import org.sisostds.schemas.ieee1516._2010.UpperBoundType;
import org.sisostds.schemas.ieee1516._2010.ValueType;
import org.sisostds.schemas.ieee1516._2010.VariantRecordDataType;
import org.sisostds.schemas.ieee1516._2010.VariantRecordDataType1;
import org.sisostds.schemas.ieee1516._2010.VariantRecordDataTypesType;
import org.sisostds.schemas.ieee1516._2010.VariantRecordEncodingType;
import org.sisostds.schemas.ieee1516._2010._2010Package;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.sisostds.schemas.ieee1516._2010._2010Package
 * @generated
 */
public class _2010AdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static _2010Package modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public _2010AdapterFactory() {
		if (modelPackage == null) {
			modelPackage = _2010Package.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected _2010Switch modelSwitch =
		new _2010Switch() {
			public Object caseAbortFederationRestoreType(AbortFederationRestoreType object) {
				return createAbortFederationRestoreTypeAdapter();
			}
			public Object caseAbortFederationSaveType(AbortFederationSaveType object) {
				return createAbortFederationSaveTypeAdapter();
			}
			public Object caseAlternativeType(AlternativeType object) {
				return createAlternativeTypeAdapter();
			}
			public Object caseAnnounceSynchronizationPointType(AnnounceSynchronizationPointType object) {
				return createAnnounceSynchronizationPointTypeAdapter();
			}
			public Object caseApplicationDomainType(ApplicationDomainType object) {
				return createApplicationDomainTypeAdapter();
			}
			public Object caseArrayDataType(ArrayDataType object) {
				return createArrayDataTypeAdapter();
			}
			public Object caseArrayDataType1(ArrayDataType1 object) {
				return createArrayDataType1Adapter();
			}
			public Object caseArrayDatatypeEncodingType(ArrayDatatypeEncodingType object) {
				return createArrayDatatypeEncodingTypeAdapter();
			}
			public Object caseArrayDataTypesType(ArrayDataTypesType object) {
				return createArrayDataTypesTypeAdapter();
			}
			public Object caseArrayDataTypesType1(ArrayDataTypesType1 object) {
				return createArrayDataTypesType1Adapter();
			}
			public Object caseAssociateRegionsForUpdatesType(AssociateRegionsForUpdatesType object) {
				return createAssociateRegionsForUpdatesTypeAdapter();
			}
			public Object caseAttributeOwnershipAcquisitionIfAvailableType(AttributeOwnershipAcquisitionIfAvailableType object) {
				return createAttributeOwnershipAcquisitionIfAvailableTypeAdapter();
			}
			public Object caseAttributeOwnershipAcquisitionNotificationType(AttributeOwnershipAcquisitionNotificationType object) {
				return createAttributeOwnershipAcquisitionNotificationTypeAdapter();
			}
			public Object caseAttributeOwnershipAcquisitionType(AttributeOwnershipAcquisitionType object) {
				return createAttributeOwnershipAcquisitionTypeAdapter();
			}
			public Object caseAttributeOwnershipDivestitureIfWantedType(AttributeOwnershipDivestitureIfWantedType object) {
				return createAttributeOwnershipDivestitureIfWantedTypeAdapter();
			}
			public Object caseAttributeOwnershipReleaseDeniedType(AttributeOwnershipReleaseDeniedType object) {
				return createAttributeOwnershipReleaseDeniedTypeAdapter();
			}
			public Object caseAttributeOwnershipUnavailableType(AttributeOwnershipUnavailableType object) {
				return createAttributeOwnershipUnavailableTypeAdapter();
			}
			public Object caseAttributesInScopeType(AttributesInScopeType object) {
				return createAttributesInScopeTypeAdapter();
			}
			public Object caseAttributesOutOfScopeType(AttributesOutOfScopeType object) {
				return createAttributesOutOfScopeTypeAdapter();
			}
			public Object caseAttributeType(AttributeType object) {
				return createAttributeTypeAdapter();
			}
			public Object caseAttributeType1(AttributeType1 object) {
				return createAttributeType1Adapter();
			}
			public Object caseBasicDataRepresentationsType(BasicDataRepresentationsType object) {
				return createBasicDataRepresentationsTypeAdapter();
			}
			public Object caseBasicDataType(BasicDataType object) {
				return createBasicDataTypeAdapter();
			}
			public Object caseBasicDataType1(BasicDataType1 object) {
				return createBasicDataType1Adapter();
			}
			public Object caseCancelAttributeOwnershipAcquisitionType(CancelAttributeOwnershipAcquisitionType object) {
				return createCancelAttributeOwnershipAcquisitionTypeAdapter();
			}
			public Object caseCancelNegotiatedAttributeOwnershipDivestitureType(CancelNegotiatedAttributeOwnershipDivestitureType object) {
				return createCancelNegotiatedAttributeOwnershipDivestitureTypeAdapter();
			}
			public Object caseCapabilityType(CapabilityType object) {
				return createCapabilityTypeAdapter();
			}
			public Object caseCardinalityType(CardinalityType object) {
				return createCardinalityTypeAdapter();
			}
			public Object caseChangeAttributeOrderTypeType(ChangeAttributeOrderTypeType object) {
				return createChangeAttributeOrderTypeTypeAdapter();
			}
			public Object caseChangeInteractionOrderTypeType(ChangeInteractionOrderTypeType object) {
				return createChangeInteractionOrderTypeTypeAdapter();
			}
			public Object caseCommitRegionModificationsType(CommitRegionModificationsType object) {
				return createCommitRegionModificationsTypeAdapter();
			}
			public Object caseConfirmAttributeOwnershipAcquisitionCancellationType(ConfirmAttributeOwnershipAcquisitionCancellationType object) {
				return createConfirmAttributeOwnershipAcquisitionCancellationTypeAdapter();
			}
			public Object caseConfirmAttributeTransportationTypeChangeType(ConfirmAttributeTransportationTypeChangeType object) {
				return createConfirmAttributeTransportationTypeChangeTypeAdapter();
			}
			public Object caseConfirmDivestitureType(ConfirmDivestitureType object) {
				return createConfirmDivestitureTypeAdapter();
			}
			public Object caseConfirmFederationRestorationRequestType(ConfirmFederationRestorationRequestType object) {
				return createConfirmFederationRestorationRequestTypeAdapter();
			}
			public Object caseConfirmInteractionTransportationTypeChangeType(ConfirmInteractionTransportationTypeChangeType object) {
				return createConfirmInteractionTransportationTypeChangeTypeAdapter();
			}
			public Object caseConfirmSynchronizationPointRegistrationType(ConfirmSynchronizationPointRegistrationType object) {
				return createConfirmSynchronizationPointRegistrationTypeAdapter();
			}
			public Object caseConnectionLostType(ConnectionLostType object) {
				return createConnectionLostTypeAdapter();
			}
			public Object caseConnectType(ConnectType object) {
				return createConnectTypeAdapter();
			}
			public Object caseCreateFederationExecutionType(CreateFederationExecutionType object) {
				return createCreateFederationExecutionTypeAdapter();
			}
			public Object caseCreateRegionType(CreateRegionType object) {
				return createCreateRegionTypeAdapter();
			}
			public Object caseDataTypesType(DataTypesType object) {
				return createDataTypesTypeAdapter();
			}
			public Object caseDeleteObjectInstanceType(DeleteObjectInstanceType object) {
				return createDeleteObjectInstanceTypeAdapter();
			}
			public Object caseDeleteRegionType(DeleteRegionType object) {
				return createDeleteRegionTypeAdapter();
			}
			public Object caseDestroyFederationExecutionType(DestroyFederationExecutionType object) {
				return createDestroyFederationExecutionTypeAdapter();
			}
			public Object caseDimensionsType(DimensionsType object) {
				return createDimensionsTypeAdapter();
			}
			public Object caseDimensionsType1(DimensionsType1 object) {
				return createDimensionsType1Adapter();
			}
			public Object caseDimensionsType2(DimensionsType2 object) {
				return createDimensionsType2Adapter();
			}
			public Object caseDimensionType(DimensionType object) {
				return createDimensionTypeAdapter();
			}
			public Object caseDimensionType1(DimensionType1 object) {
				return createDimensionType1Adapter();
			}
			public Object caseDisableAsynchronousDeliveryType(DisableAsynchronousDeliveryType object) {
				return createDisableAsynchronousDeliveryTypeAdapter();
			}
			public Object caseDisableAttributeRelevanceAdvisorySwitchType(DisableAttributeRelevanceAdvisorySwitchType object) {
				return createDisableAttributeRelevanceAdvisorySwitchTypeAdapter();
			}
			public Object caseDisableAttributeScopeAdvisorySwitchType(DisableAttributeScopeAdvisorySwitchType object) {
				return createDisableAttributeScopeAdvisorySwitchTypeAdapter();
			}
			public Object caseDisableCallbacksType(DisableCallbacksType object) {
				return createDisableCallbacksTypeAdapter();
			}
			public Object caseDisableInteractionRelevanceAdvisorySwitchType(DisableInteractionRelevanceAdvisorySwitchType object) {
				return createDisableInteractionRelevanceAdvisorySwitchTypeAdapter();
			}
			public Object caseDisableObjectClassRelevanceAdvisorySwitchType(DisableObjectClassRelevanceAdvisorySwitchType object) {
				return createDisableObjectClassRelevanceAdvisorySwitchTypeAdapter();
			}
			public Object caseDisableTimeConstrainedType(DisableTimeConstrainedType object) {
				return createDisableTimeConstrainedTypeAdapter();
			}
			public Object caseDisableTimeRegulationType(DisableTimeRegulationType object) {
				return createDisableTimeRegulationTypeAdapter();
			}
			public Object caseDisconnectType(DisconnectType object) {
				return createDisconnectTypeAdapter();
			}
			public Object caseDiscoverObjectInstanceType(DiscoverObjectInstanceType object) {
				return createDiscoverObjectInstanceTypeAdapter();
			}
			public Object caseDocumentRoot(DocumentRoot object) {
				return createDocumentRootAdapter();
			}
			public Object caseEnableAsynchronousDeliveryType(EnableAsynchronousDeliveryType object) {
				return createEnableAsynchronousDeliveryTypeAdapter();
			}
			public Object caseEnableAttributeRelevanceAdvisorySwitchType(EnableAttributeRelevanceAdvisorySwitchType object) {
				return createEnableAttributeRelevanceAdvisorySwitchTypeAdapter();
			}
			public Object caseEnableAttributeScopeAdvisorySwitchType(EnableAttributeScopeAdvisorySwitchType object) {
				return createEnableAttributeScopeAdvisorySwitchTypeAdapter();
			}
			public Object caseEnableCallbacksType(EnableCallbacksType object) {
				return createEnableCallbacksTypeAdapter();
			}
			public Object caseEnableInteractionRelevanceAdvisorySwitchType(EnableInteractionRelevanceAdvisorySwitchType object) {
				return createEnableInteractionRelevanceAdvisorySwitchTypeAdapter();
			}
			public Object caseEnableObjectClassRelevanceAdvisorySwitchType(EnableObjectClassRelevanceAdvisorySwitchType object) {
				return createEnableObjectClassRelevanceAdvisorySwitchTypeAdapter();
			}
			public Object caseEnableTimeConstrainedType(EnableTimeConstrainedType object) {
				return createEnableTimeConstrainedTypeAdapter();
			}
			public Object caseEnableTimeRegulationType(EnableTimeRegulationType object) {
				return createEnableTimeRegulationTypeAdapter();
			}
			public Object caseEndianType(EndianType object) {
				return createEndianTypeAdapter();
			}
			public Object caseEnumeratedDataType(EnumeratedDataType object) {
				return createEnumeratedDataTypeAdapter();
			}
			public Object caseEnumeratedDataType1(EnumeratedDataType1 object) {
				return createEnumeratedDataType1Adapter();
			}
			public Object caseEnumeratedDataTypesType(EnumeratedDataTypesType object) {
				return createEnumeratedDataTypesTypeAdapter();
			}
			public Object caseEnumeratorType(EnumeratorType object) {
				return createEnumeratorTypeAdapter();
			}
			public Object caseEvokeCallbackType(EvokeCallbackType object) {
				return createEvokeCallbackTypeAdapter();
			}
			public Object caseEvokeMultipleCallbacksType(EvokeMultipleCallbacksType object) {
				return createEvokeMultipleCallbacksTypeAdapter();
			}
			public Object caseFederateRestoreCompleteType(FederateRestoreCompleteType object) {
				return createFederateRestoreCompleteTypeAdapter();
			}
			public Object caseFederateSaveBegunType(FederateSaveBegunType object) {
				return createFederateSaveBegunTypeAdapter();
			}
			public Object caseFederateSaveCompleteType(FederateSaveCompleteType object) {
				return createFederateSaveCompleteTypeAdapter();
			}
			public Object caseFederationRestoreBegunType(FederationRestoreBegunType object) {
				return createFederationRestoreBegunTypeAdapter();
			}
			public Object caseFederationRestoredType(FederationRestoredType object) {
				return createFederationRestoredTypeAdapter();
			}
			public Object caseFederationRestoreStatusResponseType(FederationRestoreStatusResponseType object) {
				return createFederationRestoreStatusResponseTypeAdapter();
			}
			public Object caseFederationSavedType(FederationSavedType object) {
				return createFederationSavedTypeAdapter();
			}
			public Object caseFederationSaveStatusResponseType(FederationSaveStatusResponseType object) {
				return createFederationSaveStatusResponseTypeAdapter();
			}
			public Object caseFederationSynchronizedType(FederationSynchronizedType object) {
				return createFederationSynchronizedTypeAdapter();
			}
			public Object caseFieldType(FieldType object) {
				return createFieldTypeAdapter();
			}
			public Object caseFixedRecordDataType(FixedRecordDataType object) {
				return createFixedRecordDataTypeAdapter();
			}
			public Object caseFixedRecordDataType1(FixedRecordDataType1 object) {
				return createFixedRecordDataType1Adapter();
			}
			public Object caseFixedRecordDataTypesType(FixedRecordDataTypesType object) {
				return createFixedRecordDataTypesTypeAdapter();
			}
			public Object caseFixedRecordEncodingType(FixedRecordEncodingType object) {
				return createFixedRecordEncodingTypeAdapter();
			}
			public Object caseFlushQueueRequestType(FlushQueueRequestType object) {
				return createFlushQueueRequestTypeAdapter();
			}
			public Object caseGetAttributeHandleType(GetAttributeHandleType object) {
				return createGetAttributeHandleTypeAdapter();
			}
			public Object caseGetAttributeNameType(GetAttributeNameType object) {
				return createGetAttributeNameTypeAdapter();
			}
			public Object caseGetAutomaticResignDirectiveType(GetAutomaticResignDirectiveType object) {
				return createGetAutomaticResignDirectiveTypeAdapter();
			}
			public Object caseGetAvailableDimensionsForClassAttributeType(GetAvailableDimensionsForClassAttributeType object) {
				return createGetAvailableDimensionsForClassAttributeTypeAdapter();
			}
			public Object caseGetAvailableDimensionsForInteractionClassType(GetAvailableDimensionsForInteractionClassType object) {
				return createGetAvailableDimensionsForInteractionClassTypeAdapter();
			}
			public Object caseGetDimensionHandleSetType(GetDimensionHandleSetType object) {
				return createGetDimensionHandleSetTypeAdapter();
			}
			public Object caseGetDimensionHandleType(GetDimensionHandleType object) {
				return createGetDimensionHandleTypeAdapter();
			}
			public Object caseGetDimensionNameType(GetDimensionNameType object) {
				return createGetDimensionNameTypeAdapter();
			}
			public Object caseGetDimensionUpperBoundType(GetDimensionUpperBoundType object) {
				return createGetDimensionUpperBoundTypeAdapter();
			}
			public Object caseGetFederateHandleType(GetFederateHandleType object) {
				return createGetFederateHandleTypeAdapter();
			}
			public Object caseGetFederateNameType(GetFederateNameType object) {
				return createGetFederateNameTypeAdapter();
			}
			public Object caseGetInteractionClassHandleType(GetInteractionClassHandleType object) {
				return createGetInteractionClassHandleTypeAdapter();
			}
			public Object caseGetInteractionClassNameType(GetInteractionClassNameType object) {
				return createGetInteractionClassNameTypeAdapter();
			}
			public Object caseGetKnownObjectClassHandleType(GetKnownObjectClassHandleType object) {
				return createGetKnownObjectClassHandleTypeAdapter();
			}
			public Object caseGetObjectClassHandleType(GetObjectClassHandleType object) {
				return createGetObjectClassHandleTypeAdapter();
			}
			public Object caseGetObjectClassNameType(GetObjectClassNameType object) {
				return createGetObjectClassNameTypeAdapter();
			}
			public Object caseGetObjectInstanceHandleType(GetObjectInstanceHandleType object) {
				return createGetObjectInstanceHandleTypeAdapter();
			}
			public Object caseGetObjectInstanceNameType(GetObjectInstanceNameType object) {
				return createGetObjectInstanceNameTypeAdapter();
			}
			public Object caseGetOrderNameType(GetOrderNameType object) {
				return createGetOrderNameTypeAdapter();
			}
			public Object caseGetOrderTypeType(GetOrderTypeType object) {
				return createGetOrderTypeTypeAdapter();
			}
			public Object caseGetParameterHandleType(GetParameterHandleType object) {
				return createGetParameterHandleTypeAdapter();
			}
			public Object caseGetParameterNameType(GetParameterNameType object) {
				return createGetParameterNameTypeAdapter();
			}
			public Object caseGetRangeBoundsType(GetRangeBoundsType object) {
				return createGetRangeBoundsTypeAdapter();
			}
			public Object caseGetTransportationTypeHandleType(GetTransportationTypeHandleType object) {
				return createGetTransportationTypeHandleTypeAdapter();
			}
			public Object caseGetTransportationTypeNameType(GetTransportationTypeNameType object) {
				return createGetTransportationTypeNameTypeAdapter();
			}
			public Object caseGetUpdateRateValueForAttributeType(GetUpdateRateValueForAttributeType object) {
				return createGetUpdateRateValueForAttributeTypeAdapter();
			}
			public Object caseGetUpdateRateValueType(GetUpdateRateValueType object) {
				return createGetUpdateRateValueTypeAdapter();
			}
			public Object caseGlyphType(GlyphType object) {
				return createGlyphTypeAdapter();
			}
			public Object caseGlyphType1(GlyphType1 object) {
				return createGlyphType1Adapter();
			}
			public Object caseIdentificationType(IdentificationType object) {
				return createIdentificationTypeAdapter();
			}
			public Object caseIdentifierType(IdentifierType object) {
				return createIdentifierTypeAdapter();
			}
			public Object caseIdReferenceType(IdReferenceType object) {
				return createIdReferenceTypeAdapter();
			}
			public Object caseInformAttributeOwnershipType(InformAttributeOwnershipType object) {
				return createInformAttributeOwnershipTypeAdapter();
			}
			public Object caseInitiateFederateRestoreType(InitiateFederateRestoreType object) {
				return createInitiateFederateRestoreTypeAdapter();
			}
			public Object caseInitiateFederateSaveType(InitiateFederateSaveType object) {
				return createInitiateFederateSaveTypeAdapter();
			}
			public Object caseInteractionClassType(InteractionClassType object) {
				return createInteractionClassTypeAdapter();
			}
			public Object caseInteractionClassType1(InteractionClassType1 object) {
				return createInteractionClassType1Adapter();
			}
			public Object caseInteractionsType(InteractionsType object) {
				return createInteractionsTypeAdapter();
			}
			public Object caseIsAttributeOwnedByFederateType(IsAttributeOwnedByFederateType object) {
				return createIsAttributeOwnedByFederateTypeAdapter();
			}
			public Object caseJoinFederationExecutionType(JoinFederationExecutionType object) {
				return createJoinFederationExecutionTypeAdapter();
			}
			public Object caseKeywordType(KeywordType object) {
				return createKeywordTypeAdapter();
			}
			public Object caseListFederationExecutionsType(ListFederationExecutionsType object) {
				return createListFederationExecutionsTypeAdapter();
			}
			public Object caseLocalDeleteObjectInstanceType(LocalDeleteObjectInstanceType object) {
				return createLocalDeleteObjectInstanceTypeAdapter();
			}
			public Object caseLookaheadType(LookaheadType object) {
				return createLookaheadTypeAdapter();
			}
			public Object caseModelIdentificationType(ModelIdentificationType object) {
				return createModelIdentificationTypeAdapter();
			}
			public Object caseModelType(ModelType object) {
				return createModelTypeAdapter();
			}
			public Object caseModificationDateType(ModificationDateType object) {
				return createModificationDateTypeAdapter();
			}
			public Object caseModifyLookaheadType(ModifyLookaheadType object) {
				return createModifyLookaheadTypeAdapter();
			}
			public Object caseMultipleObjectInstanceNamesReservedType(MultipleObjectInstanceNamesReservedType object) {
				return createMultipleObjectInstanceNamesReservedTypeAdapter();
			}
			public Object caseNegotiatedAttributeOwnershipDivestitureType(NegotiatedAttributeOwnershipDivestitureType object) {
				return createNegotiatedAttributeOwnershipDivestitureTypeAdapter();
			}
			public Object caseNextMessageRequestAvailableType(NextMessageRequestAvailableType object) {
				return createNextMessageRequestAvailableTypeAdapter();
			}
			public Object caseNextMessageRequestType(NextMessageRequestType object) {
				return createNextMessageRequestTypeAdapter();
			}
			public Object caseNonEmptyString1(NonEmptyString1 object) {
				return createNonEmptyString1Adapter();
			}
			public Object caseNormalizeFederateHandleType(NormalizeFederateHandleType object) {
				return createNormalizeFederateHandleTypeAdapter();
			}
			public Object caseNormalizeServiceGroupType(NormalizeServiceGroupType object) {
				return createNormalizeServiceGroupTypeAdapter();
			}
			public Object caseNotesType(NotesType object) {
				return createNotesTypeAdapter();
			}
			public Object caseNoteType(NoteType object) {
				return createNoteTypeAdapter();
			}
			public Object caseObjectClassType(ObjectClassType object) {
				return createObjectClassTypeAdapter();
			}
			public Object caseObjectClassType1(ObjectClassType1 object) {
				return createObjectClassType1Adapter();
			}
			public Object caseObjectInstanceNameReservedType(ObjectInstanceNameReservedType object) {
				return createObjectInstanceNameReservedTypeAdapter();
			}
			public Object caseObjectModelType(ObjectModelType object) {
				return createObjectModelTypeAdapter();
			}
			public Object caseObjectsType(ObjectsType object) {
				return createObjectsTypeAdapter();
			}
			public Object caseOrderType(OrderType object) {
				return createOrderTypeAdapter();
			}
			public Object caseOwnershipType(OwnershipType object) {
				return createOwnershipTypeAdapter();
			}
			public Object caseParameterType(ParameterType object) {
				return createParameterTypeAdapter();
			}
			public Object caseParameterType1(ParameterType1 object) {
				return createParameterType1Adapter();
			}
			public Object casePocType(PocType object) {
				return createPocTypeAdapter();
			}
			public Object casePocType1(PocType1 object) {
				return createPocType1Adapter();
			}
			public Object casePocTypeType(PocTypeType object) {
				return createPocTypeTypeAdapter();
			}
			public Object caseProvideAttributeValueUpdateType(ProvideAttributeValueUpdateType object) {
				return createProvideAttributeValueUpdateTypeAdapter();
			}
			public Object casePublishInteractionClassType(PublishInteractionClassType object) {
				return createPublishInteractionClassTypeAdapter();
			}
			public Object casePublishObjectClassAttributesType(PublishObjectClassAttributesType object) {
				return createPublishObjectClassAttributesTypeAdapter();
			}
			public Object caseQueryAttributeOwnershipType(QueryAttributeOwnershipType object) {
				return createQueryAttributeOwnershipTypeAdapter();
			}
			public Object caseQueryAttributeTransportationTypeType(QueryAttributeTransportationTypeType object) {
				return createQueryAttributeTransportationTypeTypeAdapter();
			}
			public Object caseQueryFederationRestoreStatusType(QueryFederationRestoreStatusType object) {
				return createQueryFederationRestoreStatusTypeAdapter();
			}
			public Object caseQueryFederationSaveStatusType(QueryFederationSaveStatusType object) {
				return createQueryFederationSaveStatusTypeAdapter();
			}
			public Object caseQueryGALTType(QueryGALTType object) {
				return createQueryGALTTypeAdapter();
			}
			public Object caseQueryInteractionTransportationTypeType(QueryInteractionTransportationTypeType object) {
				return createQueryInteractionTransportationTypeTypeAdapter();
			}
			public Object caseQueryLITSType(QueryLITSType object) {
				return createQueryLITSTypeAdapter();
			}
			public Object caseQueryLogicalTimeType(QueryLogicalTimeType object) {
				return createQueryLogicalTimeTypeAdapter();
			}
			public Object caseQueryLookaheadType(QueryLookaheadType object) {
				return createQueryLookaheadTypeAdapter();
			}
			public Object caseRateType(RateType object) {
				return createRateTypeAdapter();
			}
			public Object caseReceiveInteractionType(ReceiveInteractionType object) {
				return createReceiveInteractionTypeAdapter();
			}
			public Object caseReferenceType(ReferenceType object) {
				return createReferenceTypeAdapter();
			}
			public Object caseReflectAttributeValuesType(ReflectAttributeValuesType object) {
				return createReflectAttributeValuesTypeAdapter();
			}
			public Object caseRegisterFederationSynchronizationPointType(RegisterFederationSynchronizationPointType object) {
				return createRegisterFederationSynchronizationPointTypeAdapter();
			}
			public Object caseRegisterObjectInstanceType(RegisterObjectInstanceType object) {
				return createRegisterObjectInstanceTypeAdapter();
			}
			public Object caseRegisterObjectInstanceWithRegionsType(RegisterObjectInstanceWithRegionsType object) {
				return createRegisterObjectInstanceWithRegionsTypeAdapter();
			}
			public Object caseReleaseMultipleObjectInstanceNamesType(ReleaseMultipleObjectInstanceNamesType object) {
				return createReleaseMultipleObjectInstanceNamesTypeAdapter();
			}
			public Object caseReleaseObjectInstanceNameType(ReleaseObjectInstanceNameType object) {
				return createReleaseObjectInstanceNameTypeAdapter();
			}
			public Object caseReliableType(ReliableType object) {
				return createReliableTypeAdapter();
			}
			public Object caseRemoveobjectinstanceType(RemoveobjectinstanceType object) {
				return createRemoveobjectinstanceTypeAdapter();
			}
			public Object caseReportAttributeTransportationTypeType(ReportAttributeTransportationTypeType object) {
				return createReportAttributeTransportationTypeTypeAdapter();
			}
			public Object caseReportFederationExecutionsType(ReportFederationExecutionsType object) {
				return createReportFederationExecutionsTypeAdapter();
			}
			public Object caseReportInteractionTransportationTypeType(ReportInteractionTransportationTypeType object) {
				return createReportInteractionTransportationTypeTypeAdapter();
			}
			public Object caseRequestAttributeOwnershipAssumptionType(RequestAttributeOwnershipAssumptionType object) {
				return createRequestAttributeOwnershipAssumptionTypeAdapter();
			}
			public Object caseRequestAttributeOwnershipReleaseType(RequestAttributeOwnershipReleaseType object) {
				return createRequestAttributeOwnershipReleaseTypeAdapter();
			}
			public Object caseRequestAttributeTransportationTypeChangeType(RequestAttributeTransportationTypeChangeType object) {
				return createRequestAttributeTransportationTypeChangeTypeAdapter();
			}
			public Object caseRequestAttributeValueUpdateType(RequestAttributeValueUpdateType object) {
				return createRequestAttributeValueUpdateTypeAdapter();
			}
			public Object caseRequestAttributeValueUpdateWithRegionsType(RequestAttributeValueUpdateWithRegionsType object) {
				return createRequestAttributeValueUpdateWithRegionsTypeAdapter();
			}
			public Object caseRequestDivestitureConfirmationType(RequestDivestitureConfirmationType object) {
				return createRequestDivestitureConfirmationTypeAdapter();
			}
			public Object caseRequestFederationRestoreType(RequestFederationRestoreType object) {
				return createRequestFederationRestoreTypeAdapter();
			}
			public Object caseRequestFederationSaveType(RequestFederationSaveType object) {
				return createRequestFederationSaveTypeAdapter();
			}
			public Object caseRequestInteractionTransportationTypeChangeType(RequestInteractionTransportationTypeChangeType object) {
				return createRequestInteractionTransportationTypeChangeTypeAdapter();
			}
			public Object caseRequestRetractionType(RequestRetractionType object) {
				return createRequestRetractionTypeAdapter();
			}
			public Object caseReserveMultipleObjectInstanceNamesType(ReserveMultipleObjectInstanceNamesType object) {
				return createReserveMultipleObjectInstanceNamesTypeAdapter();
			}
			public Object caseReserveObjectInstanceNameType(ReserveObjectInstanceNameType object) {
				return createReserveObjectInstanceNameTypeAdapter();
			}
			public Object caseResignFederationExecutionType(ResignFederationExecutionType object) {
				return createResignFederationExecutionTypeAdapter();
			}
			public Object caseResignSwitchType(ResignSwitchType object) {
				return createResignSwitchTypeAdapter();
			}
			public Object caseRetractType(RetractType object) {
				return createRetractTypeAdapter();
			}
			public Object caseSecurityClassificationType(SecurityClassificationType object) {
				return createSecurityClassificationTypeAdapter();
			}
			public Object caseSendInteractionType(SendInteractionType object) {
				return createSendInteractionTypeAdapter();
			}
			public Object caseSendInteractionWithRegionsType(SendInteractionWithRegionsType object) {
				return createSendInteractionWithRegionsTypeAdapter();
			}
			public Object caseServiceUtilizationType(ServiceUtilizationType object) {
				return createServiceUtilizationTypeAdapter();
			}
			public Object caseSetAutomaticResignDirectiveType(SetAutomaticResignDirectiveType object) {
				return createSetAutomaticResignDirectiveTypeAdapter();
			}
			public Object caseSetRangeBoundsType(SetRangeBoundsType object) {
				return createSetRangeBoundsTypeAdapter();
			}
			public Object caseSharingType(SharingType object) {
				return createSharingTypeAdapter();
			}
			public Object caseSimpleDataType(SimpleDataType object) {
				return createSimpleDataTypeAdapter();
			}
			public Object caseSimpleDataType1(SimpleDataType1 object) {
				return createSimpleDataType1Adapter();
			}
			public Object caseSimpleDataTypesType(SimpleDataTypesType object) {
				return createSimpleDataTypesTypeAdapter();
			}
			public Object caseSize(Size object) {
				return createSizeAdapter();
			}
			public Object caseStartRegistrationForObjectClassType(StartRegistrationForObjectClassType object) {
				return createStartRegistrationForObjectClassTypeAdapter();
			}
			public Object caseStopRegistrationForObjectClassType(StopRegistrationForObjectClassType object) {
				return createStopRegistrationForObjectClassTypeAdapter();
			}
			public Object caseString(org.sisostds.schemas.ieee1516._2010.String object) {
				return createStringAdapter();
			}
			public Object caseSubscribeInteractionClassType(SubscribeInteractionClassType object) {
				return createSubscribeInteractionClassTypeAdapter();
			}
			public Object caseSubscribeInteractionClassWithRegionsType(SubscribeInteractionClassWithRegionsType object) {
				return createSubscribeInteractionClassWithRegionsTypeAdapter();
			}
			public Object caseSubscribeObjectClassAttributesType(SubscribeObjectClassAttributesType object) {
				return createSubscribeObjectClassAttributesTypeAdapter();
			}
			public Object caseSubscribeObjectClassAttributesWithRegionsType(SubscribeObjectClassAttributesWithRegionsType object) {
				return createSubscribeObjectClassAttributesWithRegionsTypeAdapter();
			}
			public Object caseSwitchesType(SwitchesType object) {
				return createSwitchesTypeAdapter();
			}
			public Object caseSwitchType(SwitchType object) {
				return createSwitchTypeAdapter();
			}
			public Object caseSynchronizationPointAchievedType(SynchronizationPointAchievedType object) {
				return createSynchronizationPointAchievedTypeAdapter();
			}
			public Object caseSynchronizationPointType(SynchronizationPointType object) {
				return createSynchronizationPointTypeAdapter();
			}
			public Object caseSynchronizationPointType1(SynchronizationPointType1 object) {
				return createSynchronizationPointType1Adapter();
			}
			public Object caseSynchronizationsType(SynchronizationsType object) {
				return createSynchronizationsTypeAdapter();
			}
			public Object caseTagsType(TagsType object) {
				return createTagsTypeAdapter();
			}
			public Object caseTagType(TagType object) {
				return createTagTypeAdapter();
			}
			public Object caseTimeAdvanceGrantType(TimeAdvanceGrantType object) {
				return createTimeAdvanceGrantTypeAdapter();
			}
			public Object caseTimeAdvanceRequestAvailableType(TimeAdvanceRequestAvailableType object) {
				return createTimeAdvanceRequestAvailableTypeAdapter();
			}
			public Object caseTimeAdvanceRequestType(TimeAdvanceRequestType object) {
				return createTimeAdvanceRequestTypeAdapter();
			}
			public Object caseTimeConstrainedEnabledType(TimeConstrainedEnabledType object) {
				return createTimeConstrainedEnabledTypeAdapter();
			}
			public Object caseTimeRegulationEnabledType(TimeRegulationEnabledType object) {
				return createTimeRegulationEnabledTypeAdapter();
			}
			public Object caseTimeStampType(TimeStampType object) {
				return createTimeStampTypeAdapter();
			}
			public Object caseTimeType(TimeType object) {
				return createTimeTypeAdapter();
			}
			public Object caseTransportationsType(TransportationsType object) {
				return createTransportationsTypeAdapter();
			}
			public Object caseTransportationType(TransportationType object) {
				return createTransportationTypeAdapter();
			}
			public Object caseTransportationType1(TransportationType1 object) {
				return createTransportationType1Adapter();
			}
			public Object caseTurnInteractionsOffType(TurnInteractionsOffType object) {
				return createTurnInteractionsOffTypeAdapter();
			}
			public Object caseTurnInteractionsOnType(TurnInteractionsOnType object) {
				return createTurnInteractionsOnTypeAdapter();
			}
			public Object caseTurnUpdatesOffForObjectInstanceType(TurnUpdatesOffForObjectInstanceType object) {
				return createTurnUpdatesOffForObjectInstanceTypeAdapter();
			}
			public Object caseTurnUpdatesOnForObjectInstanceType(TurnUpdatesOnForObjectInstanceType object) {
				return createTurnUpdatesOnForObjectInstanceTypeAdapter();
			}
			public Object caseTypeType(TypeType object) {
				return createTypeTypeAdapter();
			}
			public Object caseUnassociateRegionsForUpdatesType(UnassociateRegionsForUpdatesType object) {
				return createUnassociateRegionsForUpdatesTypeAdapter();
			}
			public Object caseUnconditionalAttributeOwnershipDivestitureType(UnconditionalAttributeOwnershipDivestitureType object) {
				return createUnconditionalAttributeOwnershipDivestitureTypeAdapter();
			}
			public Object caseUnpublishInteractionClassType(UnpublishInteractionClassType object) {
				return createUnpublishInteractionClassTypeAdapter();
			}
			public Object caseUnpublishObjectClassAttributesType(UnpublishObjectClassAttributesType object) {
				return createUnpublishObjectClassAttributesTypeAdapter();
			}
			public Object caseUnsubscribeInteractionClassType(UnsubscribeInteractionClassType object) {
				return createUnsubscribeInteractionClassTypeAdapter();
			}
			public Object caseUnsubscribeInteractionClassWithRegionsType(UnsubscribeInteractionClassWithRegionsType object) {
				return createUnsubscribeInteractionClassWithRegionsTypeAdapter();
			}
			public Object caseUnsubscribeObjectClassAttributesType(UnsubscribeObjectClassAttributesType object) {
				return createUnsubscribeObjectClassAttributesTypeAdapter();
			}
			public Object caseUnsubscribeObjectClassAttributesWithRegionsType(UnsubscribeObjectClassAttributesWithRegionsType object) {
				return createUnsubscribeObjectClassAttributesWithRegionsTypeAdapter();
			}
			public Object caseUpdateAttributeValuesType(UpdateAttributeValuesType object) {
				return createUpdateAttributeValuesTypeAdapter();
			}
			public Object caseUpdateRatesType(UpdateRatesType object) {
				return createUpdateRatesTypeAdapter();
			}
			public Object caseUpdateRateType(UpdateRateType object) {
				return createUpdateRateTypeAdapter();
			}
			public Object caseUpdateType(UpdateType object) {
				return createUpdateTypeAdapter();
			}
			public Object caseUpperBoundType(UpperBoundType object) {
				return createUpperBoundTypeAdapter();
			}
			public Object caseValueType(ValueType object) {
				return createValueTypeAdapter();
			}
			public Object caseVariantRecordDataType(VariantRecordDataType object) {
				return createVariantRecordDataTypeAdapter();
			}
			public Object caseVariantRecordDataType1(VariantRecordDataType1 object) {
				return createVariantRecordDataType1Adapter();
			}
			public Object caseVariantRecordDataTypesType(VariantRecordDataTypesType object) {
				return createVariantRecordDataTypesTypeAdapter();
			}
			public Object caseVariantRecordEncodingType(VariantRecordEncodingType object) {
				return createVariantRecordEncodingTypeAdapter();
			}
			public Object defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	public Adapter createAdapter(Notifier target) {
		return (Adapter)modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.sisostds.schemas.ieee1516._2010.AbortFederationRestoreType <em>Abort Federation Restore Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sisostds.schemas.ieee1516._2010.AbortFederationRestoreType
	 * @generated
	 */
	public Adapter createAbortFederationRestoreTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sisostds.schemas.ieee1516._2010.AbortFederationSaveType <em>Abort Federation Save Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sisostds.schemas.ieee1516._2010.AbortFederationSaveType
	 * @generated
	 */
	public Adapter createAbortFederationSaveTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sisostds.schemas.ieee1516._2010.AlternativeType <em>Alternative Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sisostds.schemas.ieee1516._2010.AlternativeType
	 * @generated
	 */
	public Adapter createAlternativeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sisostds.schemas.ieee1516._2010.AnnounceSynchronizationPointType <em>Announce Synchronization Point Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sisostds.schemas.ieee1516._2010.AnnounceSynchronizationPointType
	 * @generated
	 */
	public Adapter createAnnounceSynchronizationPointTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sisostds.schemas.ieee1516._2010.ApplicationDomainType <em>Application Domain Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sisostds.schemas.ieee1516._2010.ApplicationDomainType
	 * @generated
	 */
	public Adapter createApplicationDomainTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sisostds.schemas.ieee1516._2010.ArrayDataType <em>Array Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sisostds.schemas.ieee1516._2010.ArrayDataType
	 * @generated
	 */
	public Adapter createArrayDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sisostds.schemas.ieee1516._2010.ArrayDataType1 <em>Array Data Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sisostds.schemas.ieee1516._2010.ArrayDataType1
	 * @generated
	 */
	public Adapter createArrayDataType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sisostds.schemas.ieee1516._2010.ArrayDatatypeEncodingType <em>Array Datatype Encoding Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sisostds.schemas.ieee1516._2010.ArrayDatatypeEncodingType
	 * @generated
	 */
	public Adapter createArrayDatatypeEncodingTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sisostds.schemas.ieee1516._2010.ArrayDataTypesType <em>Array Data Types Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sisostds.schemas.ieee1516._2010.ArrayDataTypesType
	 * @generated
	 */
	public Adapter createArrayDataTypesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sisostds.schemas.ieee1516._2010.ArrayDataTypesType1 <em>Array Data Types Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sisostds.schemas.ieee1516._2010.ArrayDataTypesType1
	 * @generated
	 */
	public Adapter createArrayDataTypesType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sisostds.schemas.ieee1516._2010.AssociateRegionsForUpdatesType <em>Associate Regions For Updates Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sisostds.schemas.ieee1516._2010.AssociateRegionsForUpdatesType
	 * @generated
	 */
	public Adapter createAssociateRegionsForUpdatesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sisostds.schemas.ieee1516._2010.AttributeOwnershipAcquisitionIfAvailableType <em>Attribute Ownership Acquisition If Available Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sisostds.schemas.ieee1516._2010.AttributeOwnershipAcquisitionIfAvailableType
	 * @generated
	 */
	public Adapter createAttributeOwnershipAcquisitionIfAvailableTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sisostds.schemas.ieee1516._2010.AttributeOwnershipAcquisitionNotificationType <em>Attribute Ownership Acquisition Notification Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sisostds.schemas.ieee1516._2010.AttributeOwnershipAcquisitionNotificationType
	 * @generated
	 */
	public Adapter createAttributeOwnershipAcquisitionNotificationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sisostds.schemas.ieee1516._2010.AttributeOwnershipAcquisitionType <em>Attribute Ownership Acquisition Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sisostds.schemas.ieee1516._2010.AttributeOwnershipAcquisitionType
	 * @generated
	 */
	public Adapter createAttributeOwnershipAcquisitionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sisostds.schemas.ieee1516._2010.AttributeOwnershipDivestitureIfWantedType <em>Attribute Ownership Divestiture If Wanted Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sisostds.schemas.ieee1516._2010.AttributeOwnershipDivestitureIfWantedType
	 * @generated
	 */
	public Adapter createAttributeOwnershipDivestitureIfWantedTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sisostds.schemas.ieee1516._2010.AttributeOwnershipReleaseDeniedType <em>Attribute Ownership Release Denied Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sisostds.schemas.ieee1516._2010.AttributeOwnershipReleaseDeniedType
	 * @generated
	 */
	public Adapter createAttributeOwnershipReleaseDeniedTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sisostds.schemas.ieee1516._2010.AttributeOwnershipUnavailableType <em>Attribute Ownership Unavailable Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sisostds.schemas.ieee1516._2010.AttributeOwnershipUnavailableType
	 * @generated
	 */
	public Adapter createAttributeOwnershipUnavailableTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sisostds.schemas.ieee1516._2010.AttributesInScopeType <em>Attributes In Scope Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sisostds.schemas.ieee1516._2010.AttributesInScopeType
	 * @generated
	 */
	public Adapter createAttributesInScopeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sisostds.schemas.ieee1516._2010.AttributesOutOfScopeType <em>Attributes Out Of Scope Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sisostds.schemas.ieee1516._2010.AttributesOutOfScopeType
	 * @generated
	 */
	public Adapter createAttributesOutOfScopeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sisostds.schemas.ieee1516._2010.AttributeType <em>Attribute Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sisostds.schemas.ieee1516._2010.AttributeType
	 * @generated
	 */
	public Adapter createAttributeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sisostds.schemas.ieee1516._2010.AttributeType1 <em>Attribute Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sisostds.schemas.ieee1516._2010.AttributeType1
	 * @generated
	 */
	public Adapter createAttributeType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sisostds.schemas.ieee1516._2010.BasicDataRepresentationsType <em>Basic Data Representations Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sisostds.schemas.ieee1516._2010.BasicDataRepresentationsType
	 * @generated
	 */
	public Adapter createBasicDataRepresentationsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sisostds.schemas.ieee1516._2010.BasicDataType <em>Basic Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sisostds.schemas.ieee1516._2010.BasicDataType
	 * @generated
	 */
	public Adapter createBasicDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sisostds.schemas.ieee1516._2010.BasicDataType1 <em>Basic Data Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sisostds.schemas.ieee1516._2010.BasicDataType1
	 * @generated
	 */
	public Adapter createBasicDataType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sisostds.schemas.ieee1516._2010.CancelAttributeOwnershipAcquisitionType <em>Cancel Attribute Ownership Acquisition Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sisostds.schemas.ieee1516._2010.CancelAttributeOwnershipAcquisitionType
	 * @generated
	 */
	public Adapter createCancelAttributeOwnershipAcquisitionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sisostds.schemas.ieee1516._2010.CancelNegotiatedAttributeOwnershipDivestitureType <em>Cancel Negotiated Attribute Ownership Divestiture Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sisostds.schemas.ieee1516._2010.CancelNegotiatedAttributeOwnershipDivestitureType
	 * @generated
	 */
	public Adapter createCancelNegotiatedAttributeOwnershipDivestitureTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sisostds.schemas.ieee1516._2010.CapabilityType <em>Capability Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sisostds.schemas.ieee1516._2010.CapabilityType
	 * @generated
	 */
	public Adapter createCapabilityTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sisostds.schemas.ieee1516._2010.CardinalityType <em>Cardinality Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sisostds.schemas.ieee1516._2010.CardinalityType
	 * @generated
	 */
	public Adapter createCardinalityTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sisostds.schemas.ieee1516._2010.ChangeAttributeOrderTypeType <em>Change Attribute Order Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sisostds.schemas.ieee1516._2010.ChangeAttributeOrderTypeType
	 * @generated
	 */
	public Adapter createChangeAttributeOrderTypeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sisostds.schemas.ieee1516._2010.ChangeInteractionOrderTypeType <em>Change Interaction Order Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sisostds.schemas.ieee1516._2010.ChangeInteractionOrderTypeType
	 * @generated
	 */
	public Adapter createChangeInteractionOrderTypeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sisostds.schemas.ieee1516._2010.CommitRegionModificationsType <em>Commit Region Modifications Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sisostds.schemas.ieee1516._2010.CommitRegionModificationsType
	 * @generated
	 */
	public Adapter createCommitRegionModificationsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sisostds.schemas.ieee1516._2010.ConfirmAttributeOwnershipAcquisitionCancellationType <em>Confirm Attribute Ownership Acquisition Cancellation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sisostds.schemas.ieee1516._2010.ConfirmAttributeOwnershipAcquisitionCancellationType
	 * @generated
	 */
	public Adapter createConfirmAttributeOwnershipAcquisitionCancellationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sisostds.schemas.ieee1516._2010.ConfirmAttributeTransportationTypeChangeType <em>Confirm Attribute Transportation Type Change Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sisostds.schemas.ieee1516._2010.ConfirmAttributeTransportationTypeChangeType
	 * @generated
	 */
	public Adapter createConfirmAttributeTransportationTypeChangeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sisostds.schemas.ieee1516._2010.ConfirmDivestitureType <em>Confirm Divestiture Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sisostds.schemas.ieee1516._2010.ConfirmDivestitureType
	 * @generated
	 */
	public Adapter createConfirmDivestitureTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sisostds.schemas.ieee1516._2010.ConfirmFederationRestorationRequestType <em>Confirm Federation Restoration Request Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sisostds.schemas.ieee1516._2010.ConfirmFederationRestorationRequestType
	 * @generated
	 */
	public Adapter createConfirmFederationRestorationRequestTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sisostds.schemas.ieee1516._2010.ConfirmInteractionTransportationTypeChangeType <em>Confirm Interaction Transportation Type Change Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sisostds.schemas.ieee1516._2010.ConfirmInteractionTransportationTypeChangeType
	 * @generated
	 */
	public Adapter createConfirmInteractionTransportationTypeChangeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sisostds.schemas.ieee1516._2010.ConfirmSynchronizationPointRegistrationType <em>Confirm Synchronization Point Registration Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sisostds.schemas.ieee1516._2010.ConfirmSynchronizationPointRegistrationType
	 * @generated
	 */
	public Adapter createConfirmSynchronizationPointRegistrationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sisostds.schemas.ieee1516._2010.ConnectionLostType <em>Connection Lost Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sisostds.schemas.ieee1516._2010.ConnectionLostType
	 * @generated
	 */
	public Adapter createConnectionLostTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sisostds.schemas.ieee1516._2010.ConnectType <em>Connect Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sisostds.schemas.ieee1516._2010.ConnectType
	 * @generated
	 */
	public Adapter createConnectTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sisostds.schemas.ieee1516._2010.CreateFederationExecutionType <em>Create Federation Execution Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sisostds.schemas.ieee1516._2010.CreateFederationExecutionType
	 * @generated
	 */
	public Adapter createCreateFederationExecutionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sisostds.schemas.ieee1516._2010.CreateRegionType <em>Create Region Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sisostds.schemas.ieee1516._2010.CreateRegionType
	 * @generated
	 */
	public Adapter createCreateRegionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sisostds.schemas.ieee1516._2010.DataTypesType <em>Data Types Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sisostds.schemas.ieee1516._2010.DataTypesType
	 * @generated
	 */
	public Adapter createDataTypesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sisostds.schemas.ieee1516._2010.DeleteObjectInstanceType <em>Delete Object Instance Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sisostds.schemas.ieee1516._2010.DeleteObjectInstanceType
	 * @generated
	 */
	public Adapter createDeleteObjectInstanceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sisostds.schemas.ieee1516._2010.DeleteRegionType <em>Delete Region Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sisostds.schemas.ieee1516._2010.DeleteRegionType
	 * @generated
	 */
	public Adapter createDeleteRegionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sisostds.schemas.ieee1516._2010.DestroyFederationExecutionType <em>Destroy Federation Execution Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sisostds.schemas.ieee1516._2010.DestroyFederationExecutionType
	 * @generated
	 */
	public Adapter createDestroyFederationExecutionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sisostds.schemas.ieee1516._2010.DimensionsType <em>Dimensions Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sisostds.schemas.ieee1516._2010.DimensionsType
	 * @generated
	 */
	public Adapter createDimensionsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sisostds.schemas.ieee1516._2010.DimensionsType1 <em>Dimensions Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sisostds.schemas.ieee1516._2010.DimensionsType1
	 * @generated
	 */
	public Adapter createDimensionsType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sisostds.schemas.ieee1516._2010.DimensionsType2 <em>Dimensions Type2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sisostds.schemas.ieee1516._2010.DimensionsType2
	 * @generated
	 */
	public Adapter createDimensionsType2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sisostds.schemas.ieee1516._2010.DimensionType <em>Dimension Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sisostds.schemas.ieee1516._2010.DimensionType
	 * @generated
	 */
	public Adapter createDimensionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sisostds.schemas.ieee1516._2010.DimensionType1 <em>Dimension Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sisostds.schemas.ieee1516._2010.DimensionType1
	 * @generated
	 */
	public Adapter createDimensionType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sisostds.schemas.ieee1516._2010.DisableAsynchronousDeliveryType <em>Disable Asynchronous Delivery Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sisostds.schemas.ieee1516._2010.DisableAsynchronousDeliveryType
	 * @generated
	 */
	public Adapter createDisableAsynchronousDeliveryTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sisostds.schemas.ieee1516._2010.DisableAttributeRelevanceAdvisorySwitchType <em>Disable Attribute Relevance Advisory Switch Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sisostds.schemas.ieee1516._2010.DisableAttributeRelevanceAdvisorySwitchType
	 * @generated
	 */
	public Adapter createDisableAttributeRelevanceAdvisorySwitchTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sisostds.schemas.ieee1516._2010.DisableAttributeScopeAdvisorySwitchType <em>Disable Attribute Scope Advisory Switch Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sisostds.schemas.ieee1516._2010.DisableAttributeScopeAdvisorySwitchType
	 * @generated
	 */
	public Adapter createDisableAttributeScopeAdvisorySwitchTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sisostds.schemas.ieee1516._2010.DisableCallbacksType <em>Disable Callbacks Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sisostds.schemas.ieee1516._2010.DisableCallbacksType
	 * @generated
	 */
	public Adapter createDisableCallbacksTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sisostds.schemas.ieee1516._2010.DisableInteractionRelevanceAdvisorySwitchType <em>Disable Interaction Relevance Advisory Switch Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sisostds.schemas.ieee1516._2010.DisableInteractionRelevanceAdvisorySwitchType
	 * @generated
	 */
	public Adapter createDisableInteractionRelevanceAdvisorySwitchTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sisostds.schemas.ieee1516._2010.DisableObjectClassRelevanceAdvisorySwitchType <em>Disable Object Class Relevance Advisory Switch Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sisostds.schemas.ieee1516._2010.DisableObjectClassRelevanceAdvisorySwitchType
	 * @generated
	 */
	public Adapter createDisableObjectClassRelevanceAdvisorySwitchTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sisostds.schemas.ieee1516._2010.DisableTimeConstrainedType <em>Disable Time Constrained Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sisostds.schemas.ieee1516._2010.DisableTimeConstrainedType
	 * @generated
	 */
	public Adapter createDisableTimeConstrainedTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sisostds.schemas.ieee1516._2010.DisableTimeRegulationType <em>Disable Time Regulation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sisostds.schemas.ieee1516._2010.DisableTimeRegulationType
	 * @generated
	 */
	public Adapter createDisableTimeRegulationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sisostds.schemas.ieee1516._2010.DisconnectType <em>Disconnect Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sisostds.schemas.ieee1516._2010.DisconnectType
	 * @generated
	 */
	public Adapter createDisconnectTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sisostds.schemas.ieee1516._2010.DiscoverObjectInstanceType <em>Discover Object Instance Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sisostds.schemas.ieee1516._2010.DiscoverObjectInstanceType
	 * @generated
	 */
	public Adapter createDiscoverObjectInstanceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sisostds.schemas.ieee1516._2010.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sisostds.schemas.ieee1516._2010.DocumentRoot
	 * @generated
	 */
	public Adapter createDocumentRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sisostds.schemas.ieee1516._2010.EnableAsynchronousDeliveryType <em>Enable Asynchronous Delivery Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sisostds.schemas.ieee1516._2010.EnableAsynchronousDeliveryType
	 * @generated
	 */
	public Adapter createEnableAsynchronousDeliveryTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sisostds.schemas.ieee1516._2010.EnableAttributeRelevanceAdvisorySwitchType <em>Enable Attribute Relevance Advisory Switch Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sisostds.schemas.ieee1516._2010.EnableAttributeRelevanceAdvisorySwitchType
	 * @generated
	 */
	public Adapter createEnableAttributeRelevanceAdvisorySwitchTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sisostds.schemas.ieee1516._2010.EnableAttributeScopeAdvisorySwitchType <em>Enable Attribute Scope Advisory Switch Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sisostds.schemas.ieee1516._2010.EnableAttributeScopeAdvisorySwitchType
	 * @generated
	 */
	public Adapter createEnableAttributeScopeAdvisorySwitchTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sisostds.schemas.ieee1516._2010.EnableCallbacksType <em>Enable Callbacks Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sisostds.schemas.ieee1516._2010.EnableCallbacksType
	 * @generated
	 */
	public Adapter createEnableCallbacksTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sisostds.schemas.ieee1516._2010.EnableInteractionRelevanceAdvisorySwitchType <em>Enable Interaction Relevance Advisory Switch Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sisostds.schemas.ieee1516._2010.EnableInteractionRelevanceAdvisorySwitchType
	 * @generated
	 */
	public Adapter createEnableInteractionRelevanceAdvisorySwitchTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sisostds.schemas.ieee1516._2010.EnableObjectClassRelevanceAdvisorySwitchType <em>Enable Object Class Relevance Advisory Switch Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sisostds.schemas.ieee1516._2010.EnableObjectClassRelevanceAdvisorySwitchType
	 * @generated
	 */
	public Adapter createEnableObjectClassRelevanceAdvisorySwitchTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sisostds.schemas.ieee1516._2010.EnableTimeConstrainedType <em>Enable Time Constrained Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sisostds.schemas.ieee1516._2010.EnableTimeConstrainedType
	 * @generated
	 */
	public Adapter createEnableTimeConstrainedTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sisostds.schemas.ieee1516._2010.EnableTimeRegulationType <em>Enable Time Regulation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sisostds.schemas.ieee1516._2010.EnableTimeRegulationType
	 * @generated
	 */
	public Adapter createEnableTimeRegulationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sisostds.schemas.ieee1516._2010.EndianType <em>Endian Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sisostds.schemas.ieee1516._2010.EndianType
	 * @generated
	 */
	public Adapter createEndianTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sisostds.schemas.ieee1516._2010.EnumeratedDataType <em>Enumerated Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sisostds.schemas.ieee1516._2010.EnumeratedDataType
	 * @generated
	 */
	public Adapter createEnumeratedDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sisostds.schemas.ieee1516._2010.EnumeratedDataType1 <em>Enumerated Data Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sisostds.schemas.ieee1516._2010.EnumeratedDataType1
	 * @generated
	 */
	public Adapter createEnumeratedDataType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sisostds.schemas.ieee1516._2010.EnumeratedDataTypesType <em>Enumerated Data Types Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sisostds.schemas.ieee1516._2010.EnumeratedDataTypesType
	 * @generated
	 */
	public Adapter createEnumeratedDataTypesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sisostds.schemas.ieee1516._2010.EnumeratorType <em>Enumerator Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sisostds.schemas.ieee1516._2010.EnumeratorType
	 * @generated
	 */
	public Adapter createEnumeratorTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sisostds.schemas.ieee1516._2010.EvokeCallbackType <em>Evoke Callback Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sisostds.schemas.ieee1516._2010.EvokeCallbackType
	 * @generated
	 */
	public Adapter createEvokeCallbackTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sisostds.schemas.ieee1516._2010.EvokeMultipleCallbacksType <em>Evoke Multiple Callbacks Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sisostds.schemas.ieee1516._2010.EvokeMultipleCallbacksType
	 * @generated
	 */
	public Adapter createEvokeMultipleCallbacksTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sisostds.schemas.ieee1516._2010.FederateRestoreCompleteType <em>Federate Restore Complete Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sisostds.schemas.ieee1516._2010.FederateRestoreCompleteType
	 * @generated
	 */
	public Adapter createFederateRestoreCompleteTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sisostds.schemas.ieee1516._2010.FederateSaveBegunType <em>Federate Save Begun Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sisostds.schemas.ieee1516._2010.FederateSaveBegunType
	 * @generated
	 */
	public Adapter createFederateSaveBegunTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sisostds.schemas.ieee1516._2010.FederateSaveCompleteType <em>Federate Save Complete Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sisostds.schemas.ieee1516._2010.FederateSaveCompleteType
	 * @generated
	 */
	public Adapter createFederateSaveCompleteTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sisostds.schemas.ieee1516._2010.FederationRestoreBegunType <em>Federation Restore Begun Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sisostds.schemas.ieee1516._2010.FederationRestoreBegunType
	 * @generated
	 */
	public Adapter createFederationRestoreBegunTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sisostds.schemas.ieee1516._2010.FederationRestoredType <em>Federation Restored Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sisostds.schemas.ieee1516._2010.FederationRestoredType
	 * @generated
	 */
	public Adapter createFederationRestoredTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sisostds.schemas.ieee1516._2010.FederationRestoreStatusResponseType <em>Federation Restore Status Response Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sisostds.schemas.ieee1516._2010.FederationRestoreStatusResponseType
	 * @generated
	 */
	public Adapter createFederationRestoreStatusResponseTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sisostds.schemas.ieee1516._2010.FederationSavedType <em>Federation Saved Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sisostds.schemas.ieee1516._2010.FederationSavedType
	 * @generated
	 */
	public Adapter createFederationSavedTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sisostds.schemas.ieee1516._2010.FederationSaveStatusResponseType <em>Federation Save Status Response Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sisostds.schemas.ieee1516._2010.FederationSaveStatusResponseType
	 * @generated
	 */
	public Adapter createFederationSaveStatusResponseTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sisostds.schemas.ieee1516._2010.FederationSynchronizedType <em>Federation Synchronized Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sisostds.schemas.ieee1516._2010.FederationSynchronizedType
	 * @generated
	 */
	public Adapter createFederationSynchronizedTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sisostds.schemas.ieee1516._2010.FieldType <em>Field Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sisostds.schemas.ieee1516._2010.FieldType
	 * @generated
	 */
	public Adapter createFieldTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sisostds.schemas.ieee1516._2010.FixedRecordDataType <em>Fixed Record Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sisostds.schemas.ieee1516._2010.FixedRecordDataType
	 * @generated
	 */
	public Adapter createFixedRecordDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sisostds.schemas.ieee1516._2010.FixedRecordDataType1 <em>Fixed Record Data Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sisostds.schemas.ieee1516._2010.FixedRecordDataType1
	 * @generated
	 */
	public Adapter createFixedRecordDataType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sisostds.schemas.ieee1516._2010.FixedRecordDataTypesType <em>Fixed Record Data Types Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sisostds.schemas.ieee1516._2010.FixedRecordDataTypesType
	 * @generated
	 */
	public Adapter createFixedRecordDataTypesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sisostds.schemas.ieee1516._2010.FixedRecordEncodingType <em>Fixed Record Encoding Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sisostds.schemas.ieee1516._2010.FixedRecordEncodingType
	 * @generated
	 */
	public Adapter createFixedRecordEncodingTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sisostds.schemas.ieee1516._2010.FlushQueueRequestType <em>Flush Queue Request Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sisostds.schemas.ieee1516._2010.FlushQueueRequestType
	 * @generated
	 */
	public Adapter createFlushQueueRequestTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sisostds.schemas.ieee1516._2010.GetAttributeHandleType <em>Get Attribute Handle Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sisostds.schemas.ieee1516._2010.GetAttributeHandleType
	 * @generated
	 */
	public Adapter createGetAttributeHandleTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sisostds.schemas.ieee1516._2010.GetAttributeNameType <em>Get Attribute Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sisostds.schemas.ieee1516._2010.GetAttributeNameType
	 * @generated
	 */
	public Adapter createGetAttributeNameTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sisostds.schemas.ieee1516._2010.GetAutomaticResignDirectiveType <em>Get Automatic Resign Directive Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sisostds.schemas.ieee1516._2010.GetAutomaticResignDirectiveType
	 * @generated
	 */
	public Adapter createGetAutomaticResignDirectiveTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sisostds.schemas.ieee1516._2010.GetAvailableDimensionsForClassAttributeType <em>Get Available Dimensions For Class Attribute Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sisostds.schemas.ieee1516._2010.GetAvailableDimensionsForClassAttributeType
	 * @generated
	 */
	public Adapter createGetAvailableDimensionsForClassAttributeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sisostds.schemas.ieee1516._2010.GetAvailableDimensionsForInteractionClassType <em>Get Available Dimensions For Interaction Class Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sisostds.schemas.ieee1516._2010.GetAvailableDimensionsForInteractionClassType
	 * @generated
	 */
	public Adapter createGetAvailableDimensionsForInteractionClassTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sisostds.schemas.ieee1516._2010.GetDimensionHandleSetType <em>Get Dimension Handle Set Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sisostds.schemas.ieee1516._2010.GetDimensionHandleSetType
	 * @generated
	 */
	public Adapter createGetDimensionHandleSetTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sisostds.schemas.ieee1516._2010.GetDimensionHandleType <em>Get Dimension Handle Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sisostds.schemas.ieee1516._2010.GetDimensionHandleType
	 * @generated
	 */
	public Adapter createGetDimensionHandleTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sisostds.schemas.ieee1516._2010.GetDimensionNameType <em>Get Dimension Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sisostds.schemas.ieee1516._2010.GetDimensionNameType
	 * @generated
	 */
	public Adapter createGetDimensionNameTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sisostds.schemas.ieee1516._2010.GetDimensionUpperBoundType <em>Get Dimension Upper Bound Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sisostds.schemas.ieee1516._2010.GetDimensionUpperBoundType
	 * @generated
	 */
	public Adapter createGetDimensionUpperBoundTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sisostds.schemas.ieee1516._2010.GetFederateHandleType <em>Get Federate Handle Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sisostds.schemas.ieee1516._2010.GetFederateHandleType
	 * @generated
	 */
	public Adapter createGetFederateHandleTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sisostds.schemas.ieee1516._2010.GetFederateNameType <em>Get Federate Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sisostds.schemas.ieee1516._2010.GetFederateNameType
	 * @generated
	 */
	public Adapter createGetFederateNameTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sisostds.schemas.ieee1516._2010.GetInteractionClassHandleType <em>Get Interaction Class Handle Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sisostds.schemas.ieee1516._2010.GetInteractionClassHandleType
	 * @generated
	 */
	public Adapter createGetInteractionClassHandleTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sisostds.schemas.ieee1516._2010.GetInteractionClassNameType <em>Get Interaction Class Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sisostds.schemas.ieee1516._2010.GetInteractionClassNameType
	 * @generated
	 */
	public Adapter createGetInteractionClassNameTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sisostds.schemas.ieee1516._2010.GetKnownObjectClassHandleType <em>Get Known Object Class Handle Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sisostds.schemas.ieee1516._2010.GetKnownObjectClassHandleType
	 * @generated
	 */
	public Adapter createGetKnownObjectClassHandleTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sisostds.schemas.ieee1516._2010.GetObjectClassHandleType <em>Get Object Class Handle Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sisostds.schemas.ieee1516._2010.GetObjectClassHandleType
	 * @generated
	 */
	public Adapter createGetObjectClassHandleTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sisostds.schemas.ieee1516._2010.GetObjectClassNameType <em>Get Object Class Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sisostds.schemas.ieee1516._2010.GetObjectClassNameType
	 * @generated
	 */
	public Adapter createGetObjectClassNameTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sisostds.schemas.ieee1516._2010.GetObjectInstanceHandleType <em>Get Object Instance Handle Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sisostds.schemas.ieee1516._2010.GetObjectInstanceHandleType
	 * @generated
	 */
	public Adapter createGetObjectInstanceHandleTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sisostds.schemas.ieee1516._2010.GetObjectInstanceNameType <em>Get Object Instance Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sisostds.schemas.ieee1516._2010.GetObjectInstanceNameType
	 * @generated
	 */
	public Adapter createGetObjectInstanceNameTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sisostds.schemas.ieee1516._2010.GetOrderNameType <em>Get Order Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sisostds.schemas.ieee1516._2010.GetOrderNameType
	 * @generated
	 */
	public Adapter createGetOrderNameTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sisostds.schemas.ieee1516._2010.GetOrderTypeType <em>Get Order Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sisostds.schemas.ieee1516._2010.GetOrderTypeType
	 * @generated
	 */
	public Adapter createGetOrderTypeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sisostds.schemas.ieee1516._2010.GetParameterHandleType <em>Get Parameter Handle Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sisostds.schemas.ieee1516._2010.GetParameterHandleType
	 * @generated
	 */
	public Adapter createGetParameterHandleTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sisostds.schemas.ieee1516._2010.GetParameterNameType <em>Get Parameter Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sisostds.schemas.ieee1516._2010.GetParameterNameType
	 * @generated
	 */
	public Adapter createGetParameterNameTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sisostds.schemas.ieee1516._2010.GetRangeBoundsType <em>Get Range Bounds Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sisostds.schemas.ieee1516._2010.GetRangeBoundsType
	 * @generated
	 */
	public Adapter createGetRangeBoundsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sisostds.schemas.ieee1516._2010.GetTransportationTypeHandleType <em>Get Transportation Type Handle Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sisostds.schemas.ieee1516._2010.GetTransportationTypeHandleType
	 * @generated
	 */
	public Adapter createGetTransportationTypeHandleTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sisostds.schemas.ieee1516._2010.GetTransportationTypeNameType <em>Get Transportation Type Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sisostds.schemas.ieee1516._2010.GetTransportationTypeNameType
	 * @generated
	 */
	public Adapter createGetTransportationTypeNameTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sisostds.schemas.ieee1516._2010.GetUpdateRateValueForAttributeType <em>Get Update Rate Value For Attribute Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sisostds.schemas.ieee1516._2010.GetUpdateRateValueForAttributeType
	 * @generated
	 */
	public Adapter createGetUpdateRateValueForAttributeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sisostds.schemas.ieee1516._2010.GetUpdateRateValueType <em>Get Update Rate Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sisostds.schemas.ieee1516._2010.GetUpdateRateValueType
	 * @generated
	 */
	public Adapter createGetUpdateRateValueTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sisostds.schemas.ieee1516._2010.GlyphType <em>Glyph Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sisostds.schemas.ieee1516._2010.GlyphType
	 * @generated
	 */
	public Adapter createGlyphTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sisostds.schemas.ieee1516._2010.GlyphType1 <em>Glyph Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sisostds.schemas.ieee1516._2010.GlyphType1
	 * @generated
	 */
	public Adapter createGlyphType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sisostds.schemas.ieee1516._2010.IdentificationType <em>Identification Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sisostds.schemas.ieee1516._2010.IdentificationType
	 * @generated
	 */
	public Adapter createIdentificationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sisostds.schemas.ieee1516._2010.IdentifierType <em>Identifier Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sisostds.schemas.ieee1516._2010.IdentifierType
	 * @generated
	 */
	public Adapter createIdentifierTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sisostds.schemas.ieee1516._2010.IdReferenceType <em>Id Reference Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sisostds.schemas.ieee1516._2010.IdReferenceType
	 * @generated
	 */
	public Adapter createIdReferenceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sisostds.schemas.ieee1516._2010.InformAttributeOwnershipType <em>Inform Attribute Ownership Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sisostds.schemas.ieee1516._2010.InformAttributeOwnershipType
	 * @generated
	 */
	public Adapter createInformAttributeOwnershipTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sisostds.schemas.ieee1516._2010.InitiateFederateRestoreType <em>Initiate Federate Restore Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sisostds.schemas.ieee1516._2010.InitiateFederateRestoreType
	 * @generated
	 */
	public Adapter createInitiateFederateRestoreTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sisostds.schemas.ieee1516._2010.InitiateFederateSaveType <em>Initiate Federate Save Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sisostds.schemas.ieee1516._2010.InitiateFederateSaveType
	 * @generated
	 */
	public Adapter createInitiateFederateSaveTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sisostds.schemas.ieee1516._2010.InteractionClassType <em>Interaction Class Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sisostds.schemas.ieee1516._2010.InteractionClassType
	 * @generated
	 */
	public Adapter createInteractionClassTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sisostds.schemas.ieee1516._2010.InteractionClassType1 <em>Interaction Class Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sisostds.schemas.ieee1516._2010.InteractionClassType1
	 * @generated
	 */
	public Adapter createInteractionClassType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sisostds.schemas.ieee1516._2010.InteractionsType <em>Interactions Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sisostds.schemas.ieee1516._2010.InteractionsType
	 * @generated
	 */
	public Adapter createInteractionsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sisostds.schemas.ieee1516._2010.IsAttributeOwnedByFederateType <em>Is Attribute Owned By Federate Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sisostds.schemas.ieee1516._2010.IsAttributeOwnedByFederateType
	 * @generated
	 */
	public Adapter createIsAttributeOwnedByFederateTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sisostds.schemas.ieee1516._2010.JoinFederationExecutionType <em>Join Federation Execution Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sisostds.schemas.ieee1516._2010.JoinFederationExecutionType
	 * @generated
	 */
	public Adapter createJoinFederationExecutionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sisostds.schemas.ieee1516._2010.KeywordType <em>Keyword Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sisostds.schemas.ieee1516._2010.KeywordType
	 * @generated
	 */
	public Adapter createKeywordTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sisostds.schemas.ieee1516._2010.ListFederationExecutionsType <em>List Federation Executions Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sisostds.schemas.ieee1516._2010.ListFederationExecutionsType
	 * @generated
	 */
	public Adapter createListFederationExecutionsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sisostds.schemas.ieee1516._2010.LocalDeleteObjectInstanceType <em>Local Delete Object Instance Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sisostds.schemas.ieee1516._2010.LocalDeleteObjectInstanceType
	 * @generated
	 */
	public Adapter createLocalDeleteObjectInstanceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sisostds.schemas.ieee1516._2010.LookaheadType <em>Lookahead Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sisostds.schemas.ieee1516._2010.LookaheadType
	 * @generated
	 */
	public Adapter createLookaheadTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sisostds.schemas.ieee1516._2010.ModelIdentificationType <em>Model Identification Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sisostds.schemas.ieee1516._2010.ModelIdentificationType
	 * @generated
	 */
	public Adapter createModelIdentificationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sisostds.schemas.ieee1516._2010.ModelType <em>Model Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sisostds.schemas.ieee1516._2010.ModelType
	 * @generated
	 */
	public Adapter createModelTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sisostds.schemas.ieee1516._2010.ModificationDateType <em>Modification Date Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sisostds.schemas.ieee1516._2010.ModificationDateType
	 * @generated
	 */
	public Adapter createModificationDateTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sisostds.schemas.ieee1516._2010.ModifyLookaheadType <em>Modify Lookahead Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sisostds.schemas.ieee1516._2010.ModifyLookaheadType
	 * @generated
	 */
	public Adapter createModifyLookaheadTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sisostds.schemas.ieee1516._2010.MultipleObjectInstanceNamesReservedType <em>Multiple Object Instance Names Reserved Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sisostds.schemas.ieee1516._2010.MultipleObjectInstanceNamesReservedType
	 * @generated
	 */
	public Adapter createMultipleObjectInstanceNamesReservedTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sisostds.schemas.ieee1516._2010.NegotiatedAttributeOwnershipDivestitureType <em>Negotiated Attribute Ownership Divestiture Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sisostds.schemas.ieee1516._2010.NegotiatedAttributeOwnershipDivestitureType
	 * @generated
	 */
	public Adapter createNegotiatedAttributeOwnershipDivestitureTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sisostds.schemas.ieee1516._2010.NextMessageRequestAvailableType <em>Next Message Request Available Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sisostds.schemas.ieee1516._2010.NextMessageRequestAvailableType
	 * @generated
	 */
	public Adapter createNextMessageRequestAvailableTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sisostds.schemas.ieee1516._2010.NextMessageRequestType <em>Next Message Request Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sisostds.schemas.ieee1516._2010.NextMessageRequestType
	 * @generated
	 */
	public Adapter createNextMessageRequestTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sisostds.schemas.ieee1516._2010.NonEmptyString1 <em>Non Empty String1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sisostds.schemas.ieee1516._2010.NonEmptyString1
	 * @generated
	 */
	public Adapter createNonEmptyString1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sisostds.schemas.ieee1516._2010.NormalizeFederateHandleType <em>Normalize Federate Handle Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sisostds.schemas.ieee1516._2010.NormalizeFederateHandleType
	 * @generated
	 */
	public Adapter createNormalizeFederateHandleTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sisostds.schemas.ieee1516._2010.NormalizeServiceGroupType <em>Normalize Service Group Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sisostds.schemas.ieee1516._2010.NormalizeServiceGroupType
	 * @generated
	 */
	public Adapter createNormalizeServiceGroupTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sisostds.schemas.ieee1516._2010.NotesType <em>Notes Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sisostds.schemas.ieee1516._2010.NotesType
	 * @generated
	 */
	public Adapter createNotesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sisostds.schemas.ieee1516._2010.NoteType <em>Note Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sisostds.schemas.ieee1516._2010.NoteType
	 * @generated
	 */
	public Adapter createNoteTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sisostds.schemas.ieee1516._2010.ObjectClassType <em>Object Class Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sisostds.schemas.ieee1516._2010.ObjectClassType
	 * @generated
	 */
	public Adapter createObjectClassTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sisostds.schemas.ieee1516._2010.ObjectClassType1 <em>Object Class Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sisostds.schemas.ieee1516._2010.ObjectClassType1
	 * @generated
	 */
	public Adapter createObjectClassType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sisostds.schemas.ieee1516._2010.ObjectInstanceNameReservedType <em>Object Instance Name Reserved Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sisostds.schemas.ieee1516._2010.ObjectInstanceNameReservedType
	 * @generated
	 */
	public Adapter createObjectInstanceNameReservedTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sisostds.schemas.ieee1516._2010.ObjectModelType <em>Object Model Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sisostds.schemas.ieee1516._2010.ObjectModelType
	 * @generated
	 */
	public Adapter createObjectModelTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sisostds.schemas.ieee1516._2010.ObjectsType <em>Objects Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sisostds.schemas.ieee1516._2010.ObjectsType
	 * @generated
	 */
	public Adapter createObjectsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sisostds.schemas.ieee1516._2010.OrderType <em>Order Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sisostds.schemas.ieee1516._2010.OrderType
	 * @generated
	 */
	public Adapter createOrderTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sisostds.schemas.ieee1516._2010.OwnershipType <em>Ownership Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sisostds.schemas.ieee1516._2010.OwnershipType
	 * @generated
	 */
	public Adapter createOwnershipTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sisostds.schemas.ieee1516._2010.ParameterType <em>Parameter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sisostds.schemas.ieee1516._2010.ParameterType
	 * @generated
	 */
	public Adapter createParameterTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sisostds.schemas.ieee1516._2010.ParameterType1 <em>Parameter Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sisostds.schemas.ieee1516._2010.ParameterType1
	 * @generated
	 */
	public Adapter createParameterType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sisostds.schemas.ieee1516._2010.PocType <em>Poc Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sisostds.schemas.ieee1516._2010.PocType
	 * @generated
	 */
	public Adapter createPocTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sisostds.schemas.ieee1516._2010.PocType1 <em>Poc Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sisostds.schemas.ieee1516._2010.PocType1
	 * @generated
	 */
	public Adapter createPocType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sisostds.schemas.ieee1516._2010.PocTypeType <em>Poc Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sisostds.schemas.ieee1516._2010.PocTypeType
	 * @generated
	 */
	public Adapter createPocTypeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sisostds.schemas.ieee1516._2010.ProvideAttributeValueUpdateType <em>Provide Attribute Value Update Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sisostds.schemas.ieee1516._2010.ProvideAttributeValueUpdateType
	 * @generated
	 */
	public Adapter createProvideAttributeValueUpdateTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sisostds.schemas.ieee1516._2010.PublishInteractionClassType <em>Publish Interaction Class Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sisostds.schemas.ieee1516._2010.PublishInteractionClassType
	 * @generated
	 */
	public Adapter createPublishInteractionClassTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sisostds.schemas.ieee1516._2010.PublishObjectClassAttributesType <em>Publish Object Class Attributes Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sisostds.schemas.ieee1516._2010.PublishObjectClassAttributesType
	 * @generated
	 */
	public Adapter createPublishObjectClassAttributesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sisostds.schemas.ieee1516._2010.QueryAttributeOwnershipType <em>Query Attribute Ownership Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sisostds.schemas.ieee1516._2010.QueryAttributeOwnershipType
	 * @generated
	 */
	public Adapter createQueryAttributeOwnershipTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sisostds.schemas.ieee1516._2010.QueryAttributeTransportationTypeType <em>Query Attribute Transportation Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sisostds.schemas.ieee1516._2010.QueryAttributeTransportationTypeType
	 * @generated
	 */
	public Adapter createQueryAttributeTransportationTypeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sisostds.schemas.ieee1516._2010.QueryFederationRestoreStatusType <em>Query Federation Restore Status Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sisostds.schemas.ieee1516._2010.QueryFederationRestoreStatusType
	 * @generated
	 */
	public Adapter createQueryFederationRestoreStatusTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sisostds.schemas.ieee1516._2010.QueryFederationSaveStatusType <em>Query Federation Save Status Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sisostds.schemas.ieee1516._2010.QueryFederationSaveStatusType
	 * @generated
	 */
	public Adapter createQueryFederationSaveStatusTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sisostds.schemas.ieee1516._2010.QueryGALTType <em>Query GALT Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sisostds.schemas.ieee1516._2010.QueryGALTType
	 * @generated
	 */
	public Adapter createQueryGALTTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sisostds.schemas.ieee1516._2010.QueryInteractionTransportationTypeType <em>Query Interaction Transportation Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sisostds.schemas.ieee1516._2010.QueryInteractionTransportationTypeType
	 * @generated
	 */
	public Adapter createQueryInteractionTransportationTypeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sisostds.schemas.ieee1516._2010.QueryLITSType <em>Query LITS Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sisostds.schemas.ieee1516._2010.QueryLITSType
	 * @generated
	 */
	public Adapter createQueryLITSTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sisostds.schemas.ieee1516._2010.QueryLogicalTimeType <em>Query Logical Time Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sisostds.schemas.ieee1516._2010.QueryLogicalTimeType
	 * @generated
	 */
	public Adapter createQueryLogicalTimeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sisostds.schemas.ieee1516._2010.QueryLookaheadType <em>Query Lookahead Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sisostds.schemas.ieee1516._2010.QueryLookaheadType
	 * @generated
	 */
	public Adapter createQueryLookaheadTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sisostds.schemas.ieee1516._2010.RateType <em>Rate Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sisostds.schemas.ieee1516._2010.RateType
	 * @generated
	 */
	public Adapter createRateTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sisostds.schemas.ieee1516._2010.ReceiveInteractionType <em>Receive Interaction Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sisostds.schemas.ieee1516._2010.ReceiveInteractionType
	 * @generated
	 */
	public Adapter createReceiveInteractionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sisostds.schemas.ieee1516._2010.ReferenceType <em>Reference Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sisostds.schemas.ieee1516._2010.ReferenceType
	 * @generated
	 */
	public Adapter createReferenceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sisostds.schemas.ieee1516._2010.ReflectAttributeValuesType <em>Reflect Attribute Values Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sisostds.schemas.ieee1516._2010.ReflectAttributeValuesType
	 * @generated
	 */
	public Adapter createReflectAttributeValuesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sisostds.schemas.ieee1516._2010.RegisterFederationSynchronizationPointType <em>Register Federation Synchronization Point Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sisostds.schemas.ieee1516._2010.RegisterFederationSynchronizationPointType
	 * @generated
	 */
	public Adapter createRegisterFederationSynchronizationPointTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sisostds.schemas.ieee1516._2010.RegisterObjectInstanceType <em>Register Object Instance Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sisostds.schemas.ieee1516._2010.RegisterObjectInstanceType
	 * @generated
	 */
	public Adapter createRegisterObjectInstanceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sisostds.schemas.ieee1516._2010.RegisterObjectInstanceWithRegionsType <em>Register Object Instance With Regions Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sisostds.schemas.ieee1516._2010.RegisterObjectInstanceWithRegionsType
	 * @generated
	 */
	public Adapter createRegisterObjectInstanceWithRegionsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sisostds.schemas.ieee1516._2010.ReleaseMultipleObjectInstanceNamesType <em>Release Multiple Object Instance Names Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sisostds.schemas.ieee1516._2010.ReleaseMultipleObjectInstanceNamesType
	 * @generated
	 */
	public Adapter createReleaseMultipleObjectInstanceNamesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sisostds.schemas.ieee1516._2010.ReleaseObjectInstanceNameType <em>Release Object Instance Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sisostds.schemas.ieee1516._2010.ReleaseObjectInstanceNameType
	 * @generated
	 */
	public Adapter createReleaseObjectInstanceNameTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sisostds.schemas.ieee1516._2010.ReliableType <em>Reliable Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sisostds.schemas.ieee1516._2010.ReliableType
	 * @generated
	 */
	public Adapter createReliableTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sisostds.schemas.ieee1516._2010.RemoveobjectinstanceType <em>Removeobjectinstance Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sisostds.schemas.ieee1516._2010.RemoveobjectinstanceType
	 * @generated
	 */
	public Adapter createRemoveobjectinstanceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sisostds.schemas.ieee1516._2010.ReportAttributeTransportationTypeType <em>Report Attribute Transportation Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sisostds.schemas.ieee1516._2010.ReportAttributeTransportationTypeType
	 * @generated
	 */
	public Adapter createReportAttributeTransportationTypeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sisostds.schemas.ieee1516._2010.ReportFederationExecutionsType <em>Report Federation Executions Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sisostds.schemas.ieee1516._2010.ReportFederationExecutionsType
	 * @generated
	 */
	public Adapter createReportFederationExecutionsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sisostds.schemas.ieee1516._2010.ReportInteractionTransportationTypeType <em>Report Interaction Transportation Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sisostds.schemas.ieee1516._2010.ReportInteractionTransportationTypeType
	 * @generated
	 */
	public Adapter createReportInteractionTransportationTypeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sisostds.schemas.ieee1516._2010.RequestAttributeOwnershipAssumptionType <em>Request Attribute Ownership Assumption Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sisostds.schemas.ieee1516._2010.RequestAttributeOwnershipAssumptionType
	 * @generated
	 */
	public Adapter createRequestAttributeOwnershipAssumptionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sisostds.schemas.ieee1516._2010.RequestAttributeOwnershipReleaseType <em>Request Attribute Ownership Release Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sisostds.schemas.ieee1516._2010.RequestAttributeOwnershipReleaseType
	 * @generated
	 */
	public Adapter createRequestAttributeOwnershipReleaseTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sisostds.schemas.ieee1516._2010.RequestAttributeTransportationTypeChangeType <em>Request Attribute Transportation Type Change Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sisostds.schemas.ieee1516._2010.RequestAttributeTransportationTypeChangeType
	 * @generated
	 */
	public Adapter createRequestAttributeTransportationTypeChangeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sisostds.schemas.ieee1516._2010.RequestAttributeValueUpdateType <em>Request Attribute Value Update Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sisostds.schemas.ieee1516._2010.RequestAttributeValueUpdateType
	 * @generated
	 */
	public Adapter createRequestAttributeValueUpdateTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sisostds.schemas.ieee1516._2010.RequestAttributeValueUpdateWithRegionsType <em>Request Attribute Value Update With Regions Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sisostds.schemas.ieee1516._2010.RequestAttributeValueUpdateWithRegionsType
	 * @generated
	 */
	public Adapter createRequestAttributeValueUpdateWithRegionsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sisostds.schemas.ieee1516._2010.RequestDivestitureConfirmationType <em>Request Divestiture Confirmation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sisostds.schemas.ieee1516._2010.RequestDivestitureConfirmationType
	 * @generated
	 */
	public Adapter createRequestDivestitureConfirmationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sisostds.schemas.ieee1516._2010.RequestFederationRestoreType <em>Request Federation Restore Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sisostds.schemas.ieee1516._2010.RequestFederationRestoreType
	 * @generated
	 */
	public Adapter createRequestFederationRestoreTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sisostds.schemas.ieee1516._2010.RequestFederationSaveType <em>Request Federation Save Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sisostds.schemas.ieee1516._2010.RequestFederationSaveType
	 * @generated
	 */
	public Adapter createRequestFederationSaveTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sisostds.schemas.ieee1516._2010.RequestInteractionTransportationTypeChangeType <em>Request Interaction Transportation Type Change Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sisostds.schemas.ieee1516._2010.RequestInteractionTransportationTypeChangeType
	 * @generated
	 */
	public Adapter createRequestInteractionTransportationTypeChangeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sisostds.schemas.ieee1516._2010.RequestRetractionType <em>Request Retraction Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sisostds.schemas.ieee1516._2010.RequestRetractionType
	 * @generated
	 */
	public Adapter createRequestRetractionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sisostds.schemas.ieee1516._2010.ReserveMultipleObjectInstanceNamesType <em>Reserve Multiple Object Instance Names Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sisostds.schemas.ieee1516._2010.ReserveMultipleObjectInstanceNamesType
	 * @generated
	 */
	public Adapter createReserveMultipleObjectInstanceNamesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sisostds.schemas.ieee1516._2010.ReserveObjectInstanceNameType <em>Reserve Object Instance Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sisostds.schemas.ieee1516._2010.ReserveObjectInstanceNameType
	 * @generated
	 */
	public Adapter createReserveObjectInstanceNameTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sisostds.schemas.ieee1516._2010.ResignFederationExecutionType <em>Resign Federation Execution Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sisostds.schemas.ieee1516._2010.ResignFederationExecutionType
	 * @generated
	 */
	public Adapter createResignFederationExecutionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sisostds.schemas.ieee1516._2010.ResignSwitchType <em>Resign Switch Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sisostds.schemas.ieee1516._2010.ResignSwitchType
	 * @generated
	 */
	public Adapter createResignSwitchTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sisostds.schemas.ieee1516._2010.RetractType <em>Retract Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sisostds.schemas.ieee1516._2010.RetractType
	 * @generated
	 */
	public Adapter createRetractTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sisostds.schemas.ieee1516._2010.SecurityClassificationType <em>Security Classification Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sisostds.schemas.ieee1516._2010.SecurityClassificationType
	 * @generated
	 */
	public Adapter createSecurityClassificationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sisostds.schemas.ieee1516._2010.SendInteractionType <em>Send Interaction Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sisostds.schemas.ieee1516._2010.SendInteractionType
	 * @generated
	 */
	public Adapter createSendInteractionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sisostds.schemas.ieee1516._2010.SendInteractionWithRegionsType <em>Send Interaction With Regions Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sisostds.schemas.ieee1516._2010.SendInteractionWithRegionsType
	 * @generated
	 */
	public Adapter createSendInteractionWithRegionsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sisostds.schemas.ieee1516._2010.ServiceUtilizationType <em>Service Utilization Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sisostds.schemas.ieee1516._2010.ServiceUtilizationType
	 * @generated
	 */
	public Adapter createServiceUtilizationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sisostds.schemas.ieee1516._2010.SetAutomaticResignDirectiveType <em>Set Automatic Resign Directive Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sisostds.schemas.ieee1516._2010.SetAutomaticResignDirectiveType
	 * @generated
	 */
	public Adapter createSetAutomaticResignDirectiveTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sisostds.schemas.ieee1516._2010.SetRangeBoundsType <em>Set Range Bounds Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sisostds.schemas.ieee1516._2010.SetRangeBoundsType
	 * @generated
	 */
	public Adapter createSetRangeBoundsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sisostds.schemas.ieee1516._2010.SharingType <em>Sharing Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sisostds.schemas.ieee1516._2010.SharingType
	 * @generated
	 */
	public Adapter createSharingTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sisostds.schemas.ieee1516._2010.SimpleDataType <em>Simple Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sisostds.schemas.ieee1516._2010.SimpleDataType
	 * @generated
	 */
	public Adapter createSimpleDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sisostds.schemas.ieee1516._2010.SimpleDataType1 <em>Simple Data Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sisostds.schemas.ieee1516._2010.SimpleDataType1
	 * @generated
	 */
	public Adapter createSimpleDataType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sisostds.schemas.ieee1516._2010.SimpleDataTypesType <em>Simple Data Types Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sisostds.schemas.ieee1516._2010.SimpleDataTypesType
	 * @generated
	 */
	public Adapter createSimpleDataTypesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sisostds.schemas.ieee1516._2010.Size <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sisostds.schemas.ieee1516._2010.Size
	 * @generated
	 */
	public Adapter createSizeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sisostds.schemas.ieee1516._2010.StartRegistrationForObjectClassType <em>Start Registration For Object Class Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sisostds.schemas.ieee1516._2010.StartRegistrationForObjectClassType
	 * @generated
	 */
	public Adapter createStartRegistrationForObjectClassTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sisostds.schemas.ieee1516._2010.StopRegistrationForObjectClassType <em>Stop Registration For Object Class Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sisostds.schemas.ieee1516._2010.StopRegistrationForObjectClassType
	 * @generated
	 */
	public Adapter createStopRegistrationForObjectClassTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sisostds.schemas.ieee1516._2010.String <em>String</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sisostds.schemas.ieee1516._2010.String
	 * @generated
	 */
	public Adapter createStringAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sisostds.schemas.ieee1516._2010.SubscribeInteractionClassType <em>Subscribe Interaction Class Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sisostds.schemas.ieee1516._2010.SubscribeInteractionClassType
	 * @generated
	 */
	public Adapter createSubscribeInteractionClassTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sisostds.schemas.ieee1516._2010.SubscribeInteractionClassWithRegionsType <em>Subscribe Interaction Class With Regions Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sisostds.schemas.ieee1516._2010.SubscribeInteractionClassWithRegionsType
	 * @generated
	 */
	public Adapter createSubscribeInteractionClassWithRegionsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sisostds.schemas.ieee1516._2010.SubscribeObjectClassAttributesType <em>Subscribe Object Class Attributes Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sisostds.schemas.ieee1516._2010.SubscribeObjectClassAttributesType
	 * @generated
	 */
	public Adapter createSubscribeObjectClassAttributesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sisostds.schemas.ieee1516._2010.SubscribeObjectClassAttributesWithRegionsType <em>Subscribe Object Class Attributes With Regions Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sisostds.schemas.ieee1516._2010.SubscribeObjectClassAttributesWithRegionsType
	 * @generated
	 */
	public Adapter createSubscribeObjectClassAttributesWithRegionsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sisostds.schemas.ieee1516._2010.SwitchesType <em>Switches Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sisostds.schemas.ieee1516._2010.SwitchesType
	 * @generated
	 */
	public Adapter createSwitchesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sisostds.schemas.ieee1516._2010.SwitchType <em>Switch Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sisostds.schemas.ieee1516._2010.SwitchType
	 * @generated
	 */
	public Adapter createSwitchTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sisostds.schemas.ieee1516._2010.SynchronizationPointAchievedType <em>Synchronization Point Achieved Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sisostds.schemas.ieee1516._2010.SynchronizationPointAchievedType
	 * @generated
	 */
	public Adapter createSynchronizationPointAchievedTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sisostds.schemas.ieee1516._2010.SynchronizationPointType <em>Synchronization Point Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sisostds.schemas.ieee1516._2010.SynchronizationPointType
	 * @generated
	 */
	public Adapter createSynchronizationPointTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sisostds.schemas.ieee1516._2010.SynchronizationPointType1 <em>Synchronization Point Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sisostds.schemas.ieee1516._2010.SynchronizationPointType1
	 * @generated
	 */
	public Adapter createSynchronizationPointType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sisostds.schemas.ieee1516._2010.SynchronizationsType <em>Synchronizations Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sisostds.schemas.ieee1516._2010.SynchronizationsType
	 * @generated
	 */
	public Adapter createSynchronizationsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sisostds.schemas.ieee1516._2010.TagsType <em>Tags Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sisostds.schemas.ieee1516._2010.TagsType
	 * @generated
	 */
	public Adapter createTagsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sisostds.schemas.ieee1516._2010.TagType <em>Tag Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sisostds.schemas.ieee1516._2010.TagType
	 * @generated
	 */
	public Adapter createTagTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sisostds.schemas.ieee1516._2010.TimeAdvanceGrantType <em>Time Advance Grant Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sisostds.schemas.ieee1516._2010.TimeAdvanceGrantType
	 * @generated
	 */
	public Adapter createTimeAdvanceGrantTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sisostds.schemas.ieee1516._2010.TimeAdvanceRequestAvailableType <em>Time Advance Request Available Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sisostds.schemas.ieee1516._2010.TimeAdvanceRequestAvailableType
	 * @generated
	 */
	public Adapter createTimeAdvanceRequestAvailableTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sisostds.schemas.ieee1516._2010.TimeAdvanceRequestType <em>Time Advance Request Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sisostds.schemas.ieee1516._2010.TimeAdvanceRequestType
	 * @generated
	 */
	public Adapter createTimeAdvanceRequestTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sisostds.schemas.ieee1516._2010.TimeConstrainedEnabledType <em>Time Constrained Enabled Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sisostds.schemas.ieee1516._2010.TimeConstrainedEnabledType
	 * @generated
	 */
	public Adapter createTimeConstrainedEnabledTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sisostds.schemas.ieee1516._2010.TimeRegulationEnabledType <em>Time Regulation Enabled Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sisostds.schemas.ieee1516._2010.TimeRegulationEnabledType
	 * @generated
	 */
	public Adapter createTimeRegulationEnabledTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sisostds.schemas.ieee1516._2010.TimeStampType <em>Time Stamp Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sisostds.schemas.ieee1516._2010.TimeStampType
	 * @generated
	 */
	public Adapter createTimeStampTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sisostds.schemas.ieee1516._2010.TimeType <em>Time Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sisostds.schemas.ieee1516._2010.TimeType
	 * @generated
	 */
	public Adapter createTimeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sisostds.schemas.ieee1516._2010.TransportationsType <em>Transportations Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sisostds.schemas.ieee1516._2010.TransportationsType
	 * @generated
	 */
	public Adapter createTransportationsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sisostds.schemas.ieee1516._2010.TransportationType <em>Transportation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sisostds.schemas.ieee1516._2010.TransportationType
	 * @generated
	 */
	public Adapter createTransportationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sisostds.schemas.ieee1516._2010.TransportationType1 <em>Transportation Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sisostds.schemas.ieee1516._2010.TransportationType1
	 * @generated
	 */
	public Adapter createTransportationType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sisostds.schemas.ieee1516._2010.TurnInteractionsOffType <em>Turn Interactions Off Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sisostds.schemas.ieee1516._2010.TurnInteractionsOffType
	 * @generated
	 */
	public Adapter createTurnInteractionsOffTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sisostds.schemas.ieee1516._2010.TurnInteractionsOnType <em>Turn Interactions On Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sisostds.schemas.ieee1516._2010.TurnInteractionsOnType
	 * @generated
	 */
	public Adapter createTurnInteractionsOnTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sisostds.schemas.ieee1516._2010.TurnUpdatesOffForObjectInstanceType <em>Turn Updates Off For Object Instance Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sisostds.schemas.ieee1516._2010.TurnUpdatesOffForObjectInstanceType
	 * @generated
	 */
	public Adapter createTurnUpdatesOffForObjectInstanceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sisostds.schemas.ieee1516._2010.TurnUpdatesOnForObjectInstanceType <em>Turn Updates On For Object Instance Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sisostds.schemas.ieee1516._2010.TurnUpdatesOnForObjectInstanceType
	 * @generated
	 */
	public Adapter createTurnUpdatesOnForObjectInstanceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sisostds.schemas.ieee1516._2010.TypeType <em>Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sisostds.schemas.ieee1516._2010.TypeType
	 * @generated
	 */
	public Adapter createTypeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sisostds.schemas.ieee1516._2010.UnassociateRegionsForUpdatesType <em>Unassociate Regions For Updates Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sisostds.schemas.ieee1516._2010.UnassociateRegionsForUpdatesType
	 * @generated
	 */
	public Adapter createUnassociateRegionsForUpdatesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sisostds.schemas.ieee1516._2010.UnconditionalAttributeOwnershipDivestitureType <em>Unconditional Attribute Ownership Divestiture Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sisostds.schemas.ieee1516._2010.UnconditionalAttributeOwnershipDivestitureType
	 * @generated
	 */
	public Adapter createUnconditionalAttributeOwnershipDivestitureTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sisostds.schemas.ieee1516._2010.UnpublishInteractionClassType <em>Unpublish Interaction Class Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sisostds.schemas.ieee1516._2010.UnpublishInteractionClassType
	 * @generated
	 */
	public Adapter createUnpublishInteractionClassTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sisostds.schemas.ieee1516._2010.UnpublishObjectClassAttributesType <em>Unpublish Object Class Attributes Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sisostds.schemas.ieee1516._2010.UnpublishObjectClassAttributesType
	 * @generated
	 */
	public Adapter createUnpublishObjectClassAttributesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sisostds.schemas.ieee1516._2010.UnsubscribeInteractionClassType <em>Unsubscribe Interaction Class Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sisostds.schemas.ieee1516._2010.UnsubscribeInteractionClassType
	 * @generated
	 */
	public Adapter createUnsubscribeInteractionClassTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sisostds.schemas.ieee1516._2010.UnsubscribeInteractionClassWithRegionsType <em>Unsubscribe Interaction Class With Regions Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sisostds.schemas.ieee1516._2010.UnsubscribeInteractionClassWithRegionsType
	 * @generated
	 */
	public Adapter createUnsubscribeInteractionClassWithRegionsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sisostds.schemas.ieee1516._2010.UnsubscribeObjectClassAttributesType <em>Unsubscribe Object Class Attributes Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sisostds.schemas.ieee1516._2010.UnsubscribeObjectClassAttributesType
	 * @generated
	 */
	public Adapter createUnsubscribeObjectClassAttributesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sisostds.schemas.ieee1516._2010.UnsubscribeObjectClassAttributesWithRegionsType <em>Unsubscribe Object Class Attributes With Regions Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sisostds.schemas.ieee1516._2010.UnsubscribeObjectClassAttributesWithRegionsType
	 * @generated
	 */
	public Adapter createUnsubscribeObjectClassAttributesWithRegionsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sisostds.schemas.ieee1516._2010.UpdateAttributeValuesType <em>Update Attribute Values Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sisostds.schemas.ieee1516._2010.UpdateAttributeValuesType
	 * @generated
	 */
	public Adapter createUpdateAttributeValuesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sisostds.schemas.ieee1516._2010.UpdateRatesType <em>Update Rates Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sisostds.schemas.ieee1516._2010.UpdateRatesType
	 * @generated
	 */
	public Adapter createUpdateRatesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sisostds.schemas.ieee1516._2010.UpdateRateType <em>Update Rate Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sisostds.schemas.ieee1516._2010.UpdateRateType
	 * @generated
	 */
	public Adapter createUpdateRateTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sisostds.schemas.ieee1516._2010.UpdateType <em>Update Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sisostds.schemas.ieee1516._2010.UpdateType
	 * @generated
	 */
	public Adapter createUpdateTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sisostds.schemas.ieee1516._2010.UpperBoundType <em>Upper Bound Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sisostds.schemas.ieee1516._2010.UpperBoundType
	 * @generated
	 */
	public Adapter createUpperBoundTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sisostds.schemas.ieee1516._2010.ValueType <em>Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sisostds.schemas.ieee1516._2010.ValueType
	 * @generated
	 */
	public Adapter createValueTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sisostds.schemas.ieee1516._2010.VariantRecordDataType <em>Variant Record Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sisostds.schemas.ieee1516._2010.VariantRecordDataType
	 * @generated
	 */
	public Adapter createVariantRecordDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sisostds.schemas.ieee1516._2010.VariantRecordDataType1 <em>Variant Record Data Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sisostds.schemas.ieee1516._2010.VariantRecordDataType1
	 * @generated
	 */
	public Adapter createVariantRecordDataType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sisostds.schemas.ieee1516._2010.VariantRecordDataTypesType <em>Variant Record Data Types Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sisostds.schemas.ieee1516._2010.VariantRecordDataTypesType
	 * @generated
	 */
	public Adapter createVariantRecordDataTypesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sisostds.schemas.ieee1516._2010.VariantRecordEncodingType <em>Variant Record Encoding Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sisostds.schemas.ieee1516._2010.VariantRecordEncodingType
	 * @generated
	 */
	public Adapter createVariantRecordEncodingTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //_2010AdapterFactory
