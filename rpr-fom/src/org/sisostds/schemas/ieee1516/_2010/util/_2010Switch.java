/**
 */
package org.sisostds.schemas.ieee1516._2010.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
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
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.sisostds.schemas.ieee1516._2010._2010Package
 * @generated
 */
public class _2010Switch {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static _2010Package modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public _2010Switch() {
		if (modelPackage == null) {
			modelPackage = _2010Package.eINSTANCE;
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	public Object doSwitch(EObject theEObject) {
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected Object doSwitch(EClass theEClass, EObject theEObject) {
		if (theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		}
		else {
			List eSuperTypes = theEClass.getESuperTypes();
			return
				eSuperTypes.isEmpty() ?
					defaultCase(theEObject) :
					doSwitch((EClass)eSuperTypes.get(0), theEObject);
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected Object doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case _2010Package.ABORT_FEDERATION_RESTORE_TYPE: {
				AbortFederationRestoreType abortFederationRestoreType = (AbortFederationRestoreType)theEObject;
				Object result = caseAbortFederationRestoreType(abortFederationRestoreType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2010Package.ABORT_FEDERATION_SAVE_TYPE: {
				AbortFederationSaveType abortFederationSaveType = (AbortFederationSaveType)theEObject;
				Object result = caseAbortFederationSaveType(abortFederationSaveType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2010Package.ALTERNATIVE_TYPE: {
				AlternativeType alternativeType = (AlternativeType)theEObject;
				Object result = caseAlternativeType(alternativeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2010Package.ANNOUNCE_SYNCHRONIZATION_POINT_TYPE: {
				AnnounceSynchronizationPointType announceSynchronizationPointType = (AnnounceSynchronizationPointType)theEObject;
				Object result = caseAnnounceSynchronizationPointType(announceSynchronizationPointType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2010Package.APPLICATION_DOMAIN_TYPE: {
				ApplicationDomainType applicationDomainType = (ApplicationDomainType)theEObject;
				Object result = caseApplicationDomainType(applicationDomainType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2010Package.ARRAY_DATA_TYPE: {
				ArrayDataType arrayDataType = (ArrayDataType)theEObject;
				Object result = caseArrayDataType(arrayDataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2010Package.ARRAY_DATA_TYPE1: {
				ArrayDataType1 arrayDataType1 = (ArrayDataType1)theEObject;
				Object result = caseArrayDataType1(arrayDataType1);
				if (result == null) result = caseArrayDataType(arrayDataType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2010Package.ARRAY_DATATYPE_ENCODING_TYPE: {
				ArrayDatatypeEncodingType arrayDatatypeEncodingType = (ArrayDatatypeEncodingType)theEObject;
				Object result = caseArrayDatatypeEncodingType(arrayDatatypeEncodingType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2010Package.ARRAY_DATA_TYPES_TYPE: {
				ArrayDataTypesType arrayDataTypesType = (ArrayDataTypesType)theEObject;
				Object result = caseArrayDataTypesType(arrayDataTypesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2010Package.ARRAY_DATA_TYPES_TYPE1: {
				ArrayDataTypesType1 arrayDataTypesType1 = (ArrayDataTypesType1)theEObject;
				Object result = caseArrayDataTypesType1(arrayDataTypesType1);
				if (result == null) result = caseArrayDataTypesType(arrayDataTypesType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2010Package.ASSOCIATE_REGIONS_FOR_UPDATES_TYPE: {
				AssociateRegionsForUpdatesType associateRegionsForUpdatesType = (AssociateRegionsForUpdatesType)theEObject;
				Object result = caseAssociateRegionsForUpdatesType(associateRegionsForUpdatesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2010Package.ATTRIBUTE_OWNERSHIP_ACQUISITION_IF_AVAILABLE_TYPE: {
				AttributeOwnershipAcquisitionIfAvailableType attributeOwnershipAcquisitionIfAvailableType = (AttributeOwnershipAcquisitionIfAvailableType)theEObject;
				Object result = caseAttributeOwnershipAcquisitionIfAvailableType(attributeOwnershipAcquisitionIfAvailableType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2010Package.ATTRIBUTE_OWNERSHIP_ACQUISITION_NOTIFICATION_TYPE: {
				AttributeOwnershipAcquisitionNotificationType attributeOwnershipAcquisitionNotificationType = (AttributeOwnershipAcquisitionNotificationType)theEObject;
				Object result = caseAttributeOwnershipAcquisitionNotificationType(attributeOwnershipAcquisitionNotificationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2010Package.ATTRIBUTE_OWNERSHIP_ACQUISITION_TYPE: {
				AttributeOwnershipAcquisitionType attributeOwnershipAcquisitionType = (AttributeOwnershipAcquisitionType)theEObject;
				Object result = caseAttributeOwnershipAcquisitionType(attributeOwnershipAcquisitionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2010Package.ATTRIBUTE_OWNERSHIP_DIVESTITURE_IF_WANTED_TYPE: {
				AttributeOwnershipDivestitureIfWantedType attributeOwnershipDivestitureIfWantedType = (AttributeOwnershipDivestitureIfWantedType)theEObject;
				Object result = caseAttributeOwnershipDivestitureIfWantedType(attributeOwnershipDivestitureIfWantedType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2010Package.ATTRIBUTE_OWNERSHIP_RELEASE_DENIED_TYPE: {
				AttributeOwnershipReleaseDeniedType attributeOwnershipReleaseDeniedType = (AttributeOwnershipReleaseDeniedType)theEObject;
				Object result = caseAttributeOwnershipReleaseDeniedType(attributeOwnershipReleaseDeniedType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2010Package.ATTRIBUTE_OWNERSHIP_UNAVAILABLE_TYPE: {
				AttributeOwnershipUnavailableType attributeOwnershipUnavailableType = (AttributeOwnershipUnavailableType)theEObject;
				Object result = caseAttributeOwnershipUnavailableType(attributeOwnershipUnavailableType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2010Package.ATTRIBUTES_IN_SCOPE_TYPE: {
				AttributesInScopeType attributesInScopeType = (AttributesInScopeType)theEObject;
				Object result = caseAttributesInScopeType(attributesInScopeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2010Package.ATTRIBUTES_OUT_OF_SCOPE_TYPE: {
				AttributesOutOfScopeType attributesOutOfScopeType = (AttributesOutOfScopeType)theEObject;
				Object result = caseAttributesOutOfScopeType(attributesOutOfScopeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2010Package.ATTRIBUTE_TYPE: {
				AttributeType attributeType = (AttributeType)theEObject;
				Object result = caseAttributeType(attributeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2010Package.ATTRIBUTE_TYPE1: {
				AttributeType1 attributeType1 = (AttributeType1)theEObject;
				Object result = caseAttributeType1(attributeType1);
				if (result == null) result = caseAttributeType(attributeType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2010Package.BASIC_DATA_REPRESENTATIONS_TYPE: {
				BasicDataRepresentationsType basicDataRepresentationsType = (BasicDataRepresentationsType)theEObject;
				Object result = caseBasicDataRepresentationsType(basicDataRepresentationsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2010Package.BASIC_DATA_TYPE: {
				BasicDataType basicDataType = (BasicDataType)theEObject;
				Object result = caseBasicDataType(basicDataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2010Package.BASIC_DATA_TYPE1: {
				BasicDataType1 basicDataType1 = (BasicDataType1)theEObject;
				Object result = caseBasicDataType1(basicDataType1);
				if (result == null) result = caseBasicDataType(basicDataType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2010Package.CANCEL_ATTRIBUTE_OWNERSHIP_ACQUISITION_TYPE: {
				CancelAttributeOwnershipAcquisitionType cancelAttributeOwnershipAcquisitionType = (CancelAttributeOwnershipAcquisitionType)theEObject;
				Object result = caseCancelAttributeOwnershipAcquisitionType(cancelAttributeOwnershipAcquisitionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2010Package.CANCEL_NEGOTIATED_ATTRIBUTE_OWNERSHIP_DIVESTITURE_TYPE: {
				CancelNegotiatedAttributeOwnershipDivestitureType cancelNegotiatedAttributeOwnershipDivestitureType = (CancelNegotiatedAttributeOwnershipDivestitureType)theEObject;
				Object result = caseCancelNegotiatedAttributeOwnershipDivestitureType(cancelNegotiatedAttributeOwnershipDivestitureType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2010Package.CAPABILITY_TYPE: {
				CapabilityType capabilityType = (CapabilityType)theEObject;
				Object result = caseCapabilityType(capabilityType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2010Package.CARDINALITY_TYPE: {
				CardinalityType cardinalityType = (CardinalityType)theEObject;
				Object result = caseCardinalityType(cardinalityType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2010Package.CHANGE_ATTRIBUTE_ORDER_TYPE_TYPE: {
				ChangeAttributeOrderTypeType changeAttributeOrderTypeType = (ChangeAttributeOrderTypeType)theEObject;
				Object result = caseChangeAttributeOrderTypeType(changeAttributeOrderTypeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2010Package.CHANGE_INTERACTION_ORDER_TYPE_TYPE: {
				ChangeInteractionOrderTypeType changeInteractionOrderTypeType = (ChangeInteractionOrderTypeType)theEObject;
				Object result = caseChangeInteractionOrderTypeType(changeInteractionOrderTypeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2010Package.COMMIT_REGION_MODIFICATIONS_TYPE: {
				CommitRegionModificationsType commitRegionModificationsType = (CommitRegionModificationsType)theEObject;
				Object result = caseCommitRegionModificationsType(commitRegionModificationsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2010Package.CONFIRM_ATTRIBUTE_OWNERSHIP_ACQUISITION_CANCELLATION_TYPE: {
				ConfirmAttributeOwnershipAcquisitionCancellationType confirmAttributeOwnershipAcquisitionCancellationType = (ConfirmAttributeOwnershipAcquisitionCancellationType)theEObject;
				Object result = caseConfirmAttributeOwnershipAcquisitionCancellationType(confirmAttributeOwnershipAcquisitionCancellationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2010Package.CONFIRM_ATTRIBUTE_TRANSPORTATION_TYPE_CHANGE_TYPE: {
				ConfirmAttributeTransportationTypeChangeType confirmAttributeTransportationTypeChangeType = (ConfirmAttributeTransportationTypeChangeType)theEObject;
				Object result = caseConfirmAttributeTransportationTypeChangeType(confirmAttributeTransportationTypeChangeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2010Package.CONFIRM_DIVESTITURE_TYPE: {
				ConfirmDivestitureType confirmDivestitureType = (ConfirmDivestitureType)theEObject;
				Object result = caseConfirmDivestitureType(confirmDivestitureType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2010Package.CONFIRM_FEDERATION_RESTORATION_REQUEST_TYPE: {
				ConfirmFederationRestorationRequestType confirmFederationRestorationRequestType = (ConfirmFederationRestorationRequestType)theEObject;
				Object result = caseConfirmFederationRestorationRequestType(confirmFederationRestorationRequestType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2010Package.CONFIRM_INTERACTION_TRANSPORTATION_TYPE_CHANGE_TYPE: {
				ConfirmInteractionTransportationTypeChangeType confirmInteractionTransportationTypeChangeType = (ConfirmInteractionTransportationTypeChangeType)theEObject;
				Object result = caseConfirmInteractionTransportationTypeChangeType(confirmInteractionTransportationTypeChangeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2010Package.CONFIRM_SYNCHRONIZATION_POINT_REGISTRATION_TYPE: {
				ConfirmSynchronizationPointRegistrationType confirmSynchronizationPointRegistrationType = (ConfirmSynchronizationPointRegistrationType)theEObject;
				Object result = caseConfirmSynchronizationPointRegistrationType(confirmSynchronizationPointRegistrationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2010Package.CONNECTION_LOST_TYPE: {
				ConnectionLostType connectionLostType = (ConnectionLostType)theEObject;
				Object result = caseConnectionLostType(connectionLostType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2010Package.CONNECT_TYPE: {
				ConnectType connectType = (ConnectType)theEObject;
				Object result = caseConnectType(connectType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2010Package.CREATE_FEDERATION_EXECUTION_TYPE: {
				CreateFederationExecutionType createFederationExecutionType = (CreateFederationExecutionType)theEObject;
				Object result = caseCreateFederationExecutionType(createFederationExecutionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2010Package.CREATE_REGION_TYPE: {
				CreateRegionType createRegionType = (CreateRegionType)theEObject;
				Object result = caseCreateRegionType(createRegionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2010Package.DATA_TYPES_TYPE: {
				DataTypesType dataTypesType = (DataTypesType)theEObject;
				Object result = caseDataTypesType(dataTypesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2010Package.DELETE_OBJECT_INSTANCE_TYPE: {
				DeleteObjectInstanceType deleteObjectInstanceType = (DeleteObjectInstanceType)theEObject;
				Object result = caseDeleteObjectInstanceType(deleteObjectInstanceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2010Package.DELETE_REGION_TYPE: {
				DeleteRegionType deleteRegionType = (DeleteRegionType)theEObject;
				Object result = caseDeleteRegionType(deleteRegionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2010Package.DESTROY_FEDERATION_EXECUTION_TYPE: {
				DestroyFederationExecutionType destroyFederationExecutionType = (DestroyFederationExecutionType)theEObject;
				Object result = caseDestroyFederationExecutionType(destroyFederationExecutionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2010Package.DIMENSIONS_TYPE: {
				DimensionsType dimensionsType = (DimensionsType)theEObject;
				Object result = caseDimensionsType(dimensionsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2010Package.DIMENSIONS_TYPE1: {
				DimensionsType1 dimensionsType1 = (DimensionsType1)theEObject;
				Object result = caseDimensionsType1(dimensionsType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2010Package.DIMENSIONS_TYPE2: {
				DimensionsType2 dimensionsType2 = (DimensionsType2)theEObject;
				Object result = caseDimensionsType2(dimensionsType2);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2010Package.DIMENSION_TYPE: {
				DimensionType dimensionType = (DimensionType)theEObject;
				Object result = caseDimensionType(dimensionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2010Package.DIMENSION_TYPE1: {
				DimensionType1 dimensionType1 = (DimensionType1)theEObject;
				Object result = caseDimensionType1(dimensionType1);
				if (result == null) result = caseDimensionType(dimensionType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2010Package.DISABLE_ASYNCHRONOUS_DELIVERY_TYPE: {
				DisableAsynchronousDeliveryType disableAsynchronousDeliveryType = (DisableAsynchronousDeliveryType)theEObject;
				Object result = caseDisableAsynchronousDeliveryType(disableAsynchronousDeliveryType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2010Package.DISABLE_ATTRIBUTE_RELEVANCE_ADVISORY_SWITCH_TYPE: {
				DisableAttributeRelevanceAdvisorySwitchType disableAttributeRelevanceAdvisorySwitchType = (DisableAttributeRelevanceAdvisorySwitchType)theEObject;
				Object result = caseDisableAttributeRelevanceAdvisorySwitchType(disableAttributeRelevanceAdvisorySwitchType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2010Package.DISABLE_ATTRIBUTE_SCOPE_ADVISORY_SWITCH_TYPE: {
				DisableAttributeScopeAdvisorySwitchType disableAttributeScopeAdvisorySwitchType = (DisableAttributeScopeAdvisorySwitchType)theEObject;
				Object result = caseDisableAttributeScopeAdvisorySwitchType(disableAttributeScopeAdvisorySwitchType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2010Package.DISABLE_CALLBACKS_TYPE: {
				DisableCallbacksType disableCallbacksType = (DisableCallbacksType)theEObject;
				Object result = caseDisableCallbacksType(disableCallbacksType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2010Package.DISABLE_INTERACTION_RELEVANCE_ADVISORY_SWITCH_TYPE: {
				DisableInteractionRelevanceAdvisorySwitchType disableInteractionRelevanceAdvisorySwitchType = (DisableInteractionRelevanceAdvisorySwitchType)theEObject;
				Object result = caseDisableInteractionRelevanceAdvisorySwitchType(disableInteractionRelevanceAdvisorySwitchType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2010Package.DISABLE_OBJECT_CLASS_RELEVANCE_ADVISORY_SWITCH_TYPE: {
				DisableObjectClassRelevanceAdvisorySwitchType disableObjectClassRelevanceAdvisorySwitchType = (DisableObjectClassRelevanceAdvisorySwitchType)theEObject;
				Object result = caseDisableObjectClassRelevanceAdvisorySwitchType(disableObjectClassRelevanceAdvisorySwitchType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2010Package.DISABLE_TIME_CONSTRAINED_TYPE: {
				DisableTimeConstrainedType disableTimeConstrainedType = (DisableTimeConstrainedType)theEObject;
				Object result = caseDisableTimeConstrainedType(disableTimeConstrainedType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2010Package.DISABLE_TIME_REGULATION_TYPE: {
				DisableTimeRegulationType disableTimeRegulationType = (DisableTimeRegulationType)theEObject;
				Object result = caseDisableTimeRegulationType(disableTimeRegulationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2010Package.DISCONNECT_TYPE: {
				DisconnectType disconnectType = (DisconnectType)theEObject;
				Object result = caseDisconnectType(disconnectType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2010Package.DISCOVER_OBJECT_INSTANCE_TYPE: {
				DiscoverObjectInstanceType discoverObjectInstanceType = (DiscoverObjectInstanceType)theEObject;
				Object result = caseDiscoverObjectInstanceType(discoverObjectInstanceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2010Package.DOCUMENT_ROOT: {
				DocumentRoot documentRoot = (DocumentRoot)theEObject;
				Object result = caseDocumentRoot(documentRoot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2010Package.ENABLE_ASYNCHRONOUS_DELIVERY_TYPE: {
				EnableAsynchronousDeliveryType enableAsynchronousDeliveryType = (EnableAsynchronousDeliveryType)theEObject;
				Object result = caseEnableAsynchronousDeliveryType(enableAsynchronousDeliveryType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2010Package.ENABLE_ATTRIBUTE_RELEVANCE_ADVISORY_SWITCH_TYPE: {
				EnableAttributeRelevanceAdvisorySwitchType enableAttributeRelevanceAdvisorySwitchType = (EnableAttributeRelevanceAdvisorySwitchType)theEObject;
				Object result = caseEnableAttributeRelevanceAdvisorySwitchType(enableAttributeRelevanceAdvisorySwitchType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2010Package.ENABLE_ATTRIBUTE_SCOPE_ADVISORY_SWITCH_TYPE: {
				EnableAttributeScopeAdvisorySwitchType enableAttributeScopeAdvisorySwitchType = (EnableAttributeScopeAdvisorySwitchType)theEObject;
				Object result = caseEnableAttributeScopeAdvisorySwitchType(enableAttributeScopeAdvisorySwitchType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2010Package.ENABLE_CALLBACKS_TYPE: {
				EnableCallbacksType enableCallbacksType = (EnableCallbacksType)theEObject;
				Object result = caseEnableCallbacksType(enableCallbacksType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2010Package.ENABLE_INTERACTION_RELEVANCE_ADVISORY_SWITCH_TYPE: {
				EnableInteractionRelevanceAdvisorySwitchType enableInteractionRelevanceAdvisorySwitchType = (EnableInteractionRelevanceAdvisorySwitchType)theEObject;
				Object result = caseEnableInteractionRelevanceAdvisorySwitchType(enableInteractionRelevanceAdvisorySwitchType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2010Package.ENABLE_OBJECT_CLASS_RELEVANCE_ADVISORY_SWITCH_TYPE: {
				EnableObjectClassRelevanceAdvisorySwitchType enableObjectClassRelevanceAdvisorySwitchType = (EnableObjectClassRelevanceAdvisorySwitchType)theEObject;
				Object result = caseEnableObjectClassRelevanceAdvisorySwitchType(enableObjectClassRelevanceAdvisorySwitchType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2010Package.ENABLE_TIME_CONSTRAINED_TYPE: {
				EnableTimeConstrainedType enableTimeConstrainedType = (EnableTimeConstrainedType)theEObject;
				Object result = caseEnableTimeConstrainedType(enableTimeConstrainedType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2010Package.ENABLE_TIME_REGULATION_TYPE: {
				EnableTimeRegulationType enableTimeRegulationType = (EnableTimeRegulationType)theEObject;
				Object result = caseEnableTimeRegulationType(enableTimeRegulationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2010Package.ENDIAN_TYPE: {
				EndianType endianType = (EndianType)theEObject;
				Object result = caseEndianType(endianType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2010Package.ENUMERATED_DATA_TYPE: {
				EnumeratedDataType enumeratedDataType = (EnumeratedDataType)theEObject;
				Object result = caseEnumeratedDataType(enumeratedDataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2010Package.ENUMERATED_DATA_TYPE1: {
				EnumeratedDataType1 enumeratedDataType1 = (EnumeratedDataType1)theEObject;
				Object result = caseEnumeratedDataType1(enumeratedDataType1);
				if (result == null) result = caseEnumeratedDataType(enumeratedDataType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2010Package.ENUMERATED_DATA_TYPES_TYPE: {
				EnumeratedDataTypesType enumeratedDataTypesType = (EnumeratedDataTypesType)theEObject;
				Object result = caseEnumeratedDataTypesType(enumeratedDataTypesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2010Package.ENUMERATOR_TYPE: {
				EnumeratorType enumeratorType = (EnumeratorType)theEObject;
				Object result = caseEnumeratorType(enumeratorType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2010Package.EVOKE_CALLBACK_TYPE: {
				EvokeCallbackType evokeCallbackType = (EvokeCallbackType)theEObject;
				Object result = caseEvokeCallbackType(evokeCallbackType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2010Package.EVOKE_MULTIPLE_CALLBACKS_TYPE: {
				EvokeMultipleCallbacksType evokeMultipleCallbacksType = (EvokeMultipleCallbacksType)theEObject;
				Object result = caseEvokeMultipleCallbacksType(evokeMultipleCallbacksType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2010Package.FEDERATE_RESTORE_COMPLETE_TYPE: {
				FederateRestoreCompleteType federateRestoreCompleteType = (FederateRestoreCompleteType)theEObject;
				Object result = caseFederateRestoreCompleteType(federateRestoreCompleteType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2010Package.FEDERATE_SAVE_BEGUN_TYPE: {
				FederateSaveBegunType federateSaveBegunType = (FederateSaveBegunType)theEObject;
				Object result = caseFederateSaveBegunType(federateSaveBegunType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2010Package.FEDERATE_SAVE_COMPLETE_TYPE: {
				FederateSaveCompleteType federateSaveCompleteType = (FederateSaveCompleteType)theEObject;
				Object result = caseFederateSaveCompleteType(federateSaveCompleteType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2010Package.FEDERATION_RESTORE_BEGUN_TYPE: {
				FederationRestoreBegunType federationRestoreBegunType = (FederationRestoreBegunType)theEObject;
				Object result = caseFederationRestoreBegunType(federationRestoreBegunType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2010Package.FEDERATION_RESTORED_TYPE: {
				FederationRestoredType federationRestoredType = (FederationRestoredType)theEObject;
				Object result = caseFederationRestoredType(federationRestoredType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2010Package.FEDERATION_RESTORE_STATUS_RESPONSE_TYPE: {
				FederationRestoreStatusResponseType federationRestoreStatusResponseType = (FederationRestoreStatusResponseType)theEObject;
				Object result = caseFederationRestoreStatusResponseType(federationRestoreStatusResponseType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2010Package.FEDERATION_SAVED_TYPE: {
				FederationSavedType federationSavedType = (FederationSavedType)theEObject;
				Object result = caseFederationSavedType(federationSavedType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2010Package.FEDERATION_SAVE_STATUS_RESPONSE_TYPE: {
				FederationSaveStatusResponseType federationSaveStatusResponseType = (FederationSaveStatusResponseType)theEObject;
				Object result = caseFederationSaveStatusResponseType(federationSaveStatusResponseType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2010Package.FEDERATION_SYNCHRONIZED_TYPE: {
				FederationSynchronizedType federationSynchronizedType = (FederationSynchronizedType)theEObject;
				Object result = caseFederationSynchronizedType(federationSynchronizedType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2010Package.FIELD_TYPE: {
				FieldType fieldType = (FieldType)theEObject;
				Object result = caseFieldType(fieldType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2010Package.FIXED_RECORD_DATA_TYPE: {
				FixedRecordDataType fixedRecordDataType = (FixedRecordDataType)theEObject;
				Object result = caseFixedRecordDataType(fixedRecordDataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2010Package.FIXED_RECORD_DATA_TYPE1: {
				FixedRecordDataType1 fixedRecordDataType1 = (FixedRecordDataType1)theEObject;
				Object result = caseFixedRecordDataType1(fixedRecordDataType1);
				if (result == null) result = caseFixedRecordDataType(fixedRecordDataType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2010Package.FIXED_RECORD_DATA_TYPES_TYPE: {
				FixedRecordDataTypesType fixedRecordDataTypesType = (FixedRecordDataTypesType)theEObject;
				Object result = caseFixedRecordDataTypesType(fixedRecordDataTypesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2010Package.FIXED_RECORD_ENCODING_TYPE: {
				FixedRecordEncodingType fixedRecordEncodingType = (FixedRecordEncodingType)theEObject;
				Object result = caseFixedRecordEncodingType(fixedRecordEncodingType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2010Package.FLUSH_QUEUE_REQUEST_TYPE: {
				FlushQueueRequestType flushQueueRequestType = (FlushQueueRequestType)theEObject;
				Object result = caseFlushQueueRequestType(flushQueueRequestType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2010Package.GET_ATTRIBUTE_HANDLE_TYPE: {
				GetAttributeHandleType getAttributeHandleType = (GetAttributeHandleType)theEObject;
				Object result = caseGetAttributeHandleType(getAttributeHandleType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2010Package.GET_ATTRIBUTE_NAME_TYPE: {
				GetAttributeNameType getAttributeNameType = (GetAttributeNameType)theEObject;
				Object result = caseGetAttributeNameType(getAttributeNameType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2010Package.GET_AUTOMATIC_RESIGN_DIRECTIVE_TYPE: {
				GetAutomaticResignDirectiveType getAutomaticResignDirectiveType = (GetAutomaticResignDirectiveType)theEObject;
				Object result = caseGetAutomaticResignDirectiveType(getAutomaticResignDirectiveType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2010Package.GET_AVAILABLE_DIMENSIONS_FOR_CLASS_ATTRIBUTE_TYPE: {
				GetAvailableDimensionsForClassAttributeType getAvailableDimensionsForClassAttributeType = (GetAvailableDimensionsForClassAttributeType)theEObject;
				Object result = caseGetAvailableDimensionsForClassAttributeType(getAvailableDimensionsForClassAttributeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2010Package.GET_AVAILABLE_DIMENSIONS_FOR_INTERACTION_CLASS_TYPE: {
				GetAvailableDimensionsForInteractionClassType getAvailableDimensionsForInteractionClassType = (GetAvailableDimensionsForInteractionClassType)theEObject;
				Object result = caseGetAvailableDimensionsForInteractionClassType(getAvailableDimensionsForInteractionClassType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2010Package.GET_DIMENSION_HANDLE_SET_TYPE: {
				GetDimensionHandleSetType getDimensionHandleSetType = (GetDimensionHandleSetType)theEObject;
				Object result = caseGetDimensionHandleSetType(getDimensionHandleSetType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2010Package.GET_DIMENSION_HANDLE_TYPE: {
				GetDimensionHandleType getDimensionHandleType = (GetDimensionHandleType)theEObject;
				Object result = caseGetDimensionHandleType(getDimensionHandleType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2010Package.GET_DIMENSION_NAME_TYPE: {
				GetDimensionNameType getDimensionNameType = (GetDimensionNameType)theEObject;
				Object result = caseGetDimensionNameType(getDimensionNameType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2010Package.GET_DIMENSION_UPPER_BOUND_TYPE: {
				GetDimensionUpperBoundType getDimensionUpperBoundType = (GetDimensionUpperBoundType)theEObject;
				Object result = caseGetDimensionUpperBoundType(getDimensionUpperBoundType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2010Package.GET_FEDERATE_HANDLE_TYPE: {
				GetFederateHandleType getFederateHandleType = (GetFederateHandleType)theEObject;
				Object result = caseGetFederateHandleType(getFederateHandleType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2010Package.GET_FEDERATE_NAME_TYPE: {
				GetFederateNameType getFederateNameType = (GetFederateNameType)theEObject;
				Object result = caseGetFederateNameType(getFederateNameType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2010Package.GET_INTERACTION_CLASS_HANDLE_TYPE: {
				GetInteractionClassHandleType getInteractionClassHandleType = (GetInteractionClassHandleType)theEObject;
				Object result = caseGetInteractionClassHandleType(getInteractionClassHandleType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2010Package.GET_INTERACTION_CLASS_NAME_TYPE: {
				GetInteractionClassNameType getInteractionClassNameType = (GetInteractionClassNameType)theEObject;
				Object result = caseGetInteractionClassNameType(getInteractionClassNameType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2010Package.GET_KNOWN_OBJECT_CLASS_HANDLE_TYPE: {
				GetKnownObjectClassHandleType getKnownObjectClassHandleType = (GetKnownObjectClassHandleType)theEObject;
				Object result = caseGetKnownObjectClassHandleType(getKnownObjectClassHandleType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2010Package.GET_OBJECT_CLASS_HANDLE_TYPE: {
				GetObjectClassHandleType getObjectClassHandleType = (GetObjectClassHandleType)theEObject;
				Object result = caseGetObjectClassHandleType(getObjectClassHandleType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2010Package.GET_OBJECT_CLASS_NAME_TYPE: {
				GetObjectClassNameType getObjectClassNameType = (GetObjectClassNameType)theEObject;
				Object result = caseGetObjectClassNameType(getObjectClassNameType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2010Package.GET_OBJECT_INSTANCE_HANDLE_TYPE: {
				GetObjectInstanceHandleType getObjectInstanceHandleType = (GetObjectInstanceHandleType)theEObject;
				Object result = caseGetObjectInstanceHandleType(getObjectInstanceHandleType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2010Package.GET_OBJECT_INSTANCE_NAME_TYPE: {
				GetObjectInstanceNameType getObjectInstanceNameType = (GetObjectInstanceNameType)theEObject;
				Object result = caseGetObjectInstanceNameType(getObjectInstanceNameType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2010Package.GET_ORDER_NAME_TYPE: {
				GetOrderNameType getOrderNameType = (GetOrderNameType)theEObject;
				Object result = caseGetOrderNameType(getOrderNameType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2010Package.GET_ORDER_TYPE_TYPE: {
				GetOrderTypeType getOrderTypeType = (GetOrderTypeType)theEObject;
				Object result = caseGetOrderTypeType(getOrderTypeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2010Package.GET_PARAMETER_HANDLE_TYPE: {
				GetParameterHandleType getParameterHandleType = (GetParameterHandleType)theEObject;
				Object result = caseGetParameterHandleType(getParameterHandleType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2010Package.GET_PARAMETER_NAME_TYPE: {
				GetParameterNameType getParameterNameType = (GetParameterNameType)theEObject;
				Object result = caseGetParameterNameType(getParameterNameType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2010Package.GET_RANGE_BOUNDS_TYPE: {
				GetRangeBoundsType getRangeBoundsType = (GetRangeBoundsType)theEObject;
				Object result = caseGetRangeBoundsType(getRangeBoundsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2010Package.GET_TRANSPORTATION_TYPE_HANDLE_TYPE: {
				GetTransportationTypeHandleType getTransportationTypeHandleType = (GetTransportationTypeHandleType)theEObject;
				Object result = caseGetTransportationTypeHandleType(getTransportationTypeHandleType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2010Package.GET_TRANSPORTATION_TYPE_NAME_TYPE: {
				GetTransportationTypeNameType getTransportationTypeNameType = (GetTransportationTypeNameType)theEObject;
				Object result = caseGetTransportationTypeNameType(getTransportationTypeNameType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2010Package.GET_UPDATE_RATE_VALUE_FOR_ATTRIBUTE_TYPE: {
				GetUpdateRateValueForAttributeType getUpdateRateValueForAttributeType = (GetUpdateRateValueForAttributeType)theEObject;
				Object result = caseGetUpdateRateValueForAttributeType(getUpdateRateValueForAttributeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2010Package.GET_UPDATE_RATE_VALUE_TYPE: {
				GetUpdateRateValueType getUpdateRateValueType = (GetUpdateRateValueType)theEObject;
				Object result = caseGetUpdateRateValueType(getUpdateRateValueType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2010Package.GLYPH_TYPE: {
				GlyphType glyphType = (GlyphType)theEObject;
				Object result = caseGlyphType(glyphType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2010Package.GLYPH_TYPE1: {
				GlyphType1 glyphType1 = (GlyphType1)theEObject;
				Object result = caseGlyphType1(glyphType1);
				if (result == null) result = caseGlyphType(glyphType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2010Package.IDENTIFICATION_TYPE: {
				IdentificationType identificationType = (IdentificationType)theEObject;
				Object result = caseIdentificationType(identificationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2010Package.IDENTIFIER_TYPE: {
				IdentifierType identifierType = (IdentifierType)theEObject;
				Object result = caseIdentifierType(identifierType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2010Package.ID_REFERENCE_TYPE: {
				IdReferenceType idReferenceType = (IdReferenceType)theEObject;
				Object result = caseIdReferenceType(idReferenceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2010Package.INFORM_ATTRIBUTE_OWNERSHIP_TYPE: {
				InformAttributeOwnershipType informAttributeOwnershipType = (InformAttributeOwnershipType)theEObject;
				Object result = caseInformAttributeOwnershipType(informAttributeOwnershipType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2010Package.INITIATE_FEDERATE_RESTORE_TYPE: {
				InitiateFederateRestoreType initiateFederateRestoreType = (InitiateFederateRestoreType)theEObject;
				Object result = caseInitiateFederateRestoreType(initiateFederateRestoreType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2010Package.INITIATE_FEDERATE_SAVE_TYPE: {
				InitiateFederateSaveType initiateFederateSaveType = (InitiateFederateSaveType)theEObject;
				Object result = caseInitiateFederateSaveType(initiateFederateSaveType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2010Package.INTERACTION_CLASS_TYPE: {
				InteractionClassType interactionClassType = (InteractionClassType)theEObject;
				Object result = caseInteractionClassType(interactionClassType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2010Package.INTERACTION_CLASS_TYPE1: {
				InteractionClassType1 interactionClassType1 = (InteractionClassType1)theEObject;
				Object result = caseInteractionClassType1(interactionClassType1);
				if (result == null) result = caseInteractionClassType(interactionClassType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2010Package.INTERACTIONS_TYPE: {
				InteractionsType interactionsType = (InteractionsType)theEObject;
				Object result = caseInteractionsType(interactionsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2010Package.IS_ATTRIBUTE_OWNED_BY_FEDERATE_TYPE: {
				IsAttributeOwnedByFederateType isAttributeOwnedByFederateType = (IsAttributeOwnedByFederateType)theEObject;
				Object result = caseIsAttributeOwnedByFederateType(isAttributeOwnedByFederateType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2010Package.JOIN_FEDERATION_EXECUTION_TYPE: {
				JoinFederationExecutionType joinFederationExecutionType = (JoinFederationExecutionType)theEObject;
				Object result = caseJoinFederationExecutionType(joinFederationExecutionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2010Package.KEYWORD_TYPE: {
				KeywordType keywordType = (KeywordType)theEObject;
				Object result = caseKeywordType(keywordType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2010Package.LIST_FEDERATION_EXECUTIONS_TYPE: {
				ListFederationExecutionsType listFederationExecutionsType = (ListFederationExecutionsType)theEObject;
				Object result = caseListFederationExecutionsType(listFederationExecutionsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2010Package.LOCAL_DELETE_OBJECT_INSTANCE_TYPE: {
				LocalDeleteObjectInstanceType localDeleteObjectInstanceType = (LocalDeleteObjectInstanceType)theEObject;
				Object result = caseLocalDeleteObjectInstanceType(localDeleteObjectInstanceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2010Package.LOOKAHEAD_TYPE: {
				LookaheadType lookaheadType = (LookaheadType)theEObject;
				Object result = caseLookaheadType(lookaheadType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2010Package.MODEL_IDENTIFICATION_TYPE: {
				ModelIdentificationType modelIdentificationType = (ModelIdentificationType)theEObject;
				Object result = caseModelIdentificationType(modelIdentificationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2010Package.MODEL_TYPE: {
				ModelType modelType = (ModelType)theEObject;
				Object result = caseModelType(modelType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2010Package.MODIFICATION_DATE_TYPE: {
				ModificationDateType modificationDateType = (ModificationDateType)theEObject;
				Object result = caseModificationDateType(modificationDateType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2010Package.MODIFY_LOOKAHEAD_TYPE: {
				ModifyLookaheadType modifyLookaheadType = (ModifyLookaheadType)theEObject;
				Object result = caseModifyLookaheadType(modifyLookaheadType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2010Package.MULTIPLE_OBJECT_INSTANCE_NAMES_RESERVED_TYPE: {
				MultipleObjectInstanceNamesReservedType multipleObjectInstanceNamesReservedType = (MultipleObjectInstanceNamesReservedType)theEObject;
				Object result = caseMultipleObjectInstanceNamesReservedType(multipleObjectInstanceNamesReservedType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2010Package.NEGOTIATED_ATTRIBUTE_OWNERSHIP_DIVESTITURE_TYPE: {
				NegotiatedAttributeOwnershipDivestitureType negotiatedAttributeOwnershipDivestitureType = (NegotiatedAttributeOwnershipDivestitureType)theEObject;
				Object result = caseNegotiatedAttributeOwnershipDivestitureType(negotiatedAttributeOwnershipDivestitureType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2010Package.NEXT_MESSAGE_REQUEST_AVAILABLE_TYPE: {
				NextMessageRequestAvailableType nextMessageRequestAvailableType = (NextMessageRequestAvailableType)theEObject;
				Object result = caseNextMessageRequestAvailableType(nextMessageRequestAvailableType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2010Package.NEXT_MESSAGE_REQUEST_TYPE: {
				NextMessageRequestType nextMessageRequestType = (NextMessageRequestType)theEObject;
				Object result = caseNextMessageRequestType(nextMessageRequestType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2010Package.NON_EMPTY_STRING1: {
				NonEmptyString1 nonEmptyString1 = (NonEmptyString1)theEObject;
				Object result = caseNonEmptyString1(nonEmptyString1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2010Package.NORMALIZE_FEDERATE_HANDLE_TYPE: {
				NormalizeFederateHandleType normalizeFederateHandleType = (NormalizeFederateHandleType)theEObject;
				Object result = caseNormalizeFederateHandleType(normalizeFederateHandleType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2010Package.NORMALIZE_SERVICE_GROUP_TYPE: {
				NormalizeServiceGroupType normalizeServiceGroupType = (NormalizeServiceGroupType)theEObject;
				Object result = caseNormalizeServiceGroupType(normalizeServiceGroupType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2010Package.NOTES_TYPE: {
				NotesType notesType = (NotesType)theEObject;
				Object result = caseNotesType(notesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2010Package.NOTE_TYPE: {
				NoteType noteType = (NoteType)theEObject;
				Object result = caseNoteType(noteType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2010Package.OBJECT_CLASS_TYPE: {
				ObjectClassType objectClassType = (ObjectClassType)theEObject;
				Object result = caseObjectClassType(objectClassType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2010Package.OBJECT_CLASS_TYPE1: {
				ObjectClassType1 objectClassType1 = (ObjectClassType1)theEObject;
				Object result = caseObjectClassType1(objectClassType1);
				if (result == null) result = caseObjectClassType(objectClassType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2010Package.OBJECT_INSTANCE_NAME_RESERVED_TYPE: {
				ObjectInstanceNameReservedType objectInstanceNameReservedType = (ObjectInstanceNameReservedType)theEObject;
				Object result = caseObjectInstanceNameReservedType(objectInstanceNameReservedType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2010Package.OBJECT_MODEL_TYPE: {
				ObjectModelType objectModelType = (ObjectModelType)theEObject;
				Object result = caseObjectModelType(objectModelType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2010Package.OBJECTS_TYPE: {
				ObjectsType objectsType = (ObjectsType)theEObject;
				Object result = caseObjectsType(objectsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2010Package.ORDER_TYPE: {
				OrderType orderType = (OrderType)theEObject;
				Object result = caseOrderType(orderType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2010Package.OWNERSHIP_TYPE: {
				OwnershipType ownershipType = (OwnershipType)theEObject;
				Object result = caseOwnershipType(ownershipType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2010Package.PARAMETER_TYPE: {
				ParameterType parameterType = (ParameterType)theEObject;
				Object result = caseParameterType(parameterType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2010Package.PARAMETER_TYPE1: {
				ParameterType1 parameterType1 = (ParameterType1)theEObject;
				Object result = caseParameterType1(parameterType1);
				if (result == null) result = caseParameterType(parameterType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2010Package.POC_TYPE: {
				PocType pocType = (PocType)theEObject;
				Object result = casePocType(pocType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2010Package.POC_TYPE1: {
				PocType1 pocType1 = (PocType1)theEObject;
				Object result = casePocType1(pocType1);
				if (result == null) result = casePocType(pocType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2010Package.POC_TYPE_TYPE: {
				PocTypeType pocTypeType = (PocTypeType)theEObject;
				Object result = casePocTypeType(pocTypeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2010Package.PROVIDE_ATTRIBUTE_VALUE_UPDATE_TYPE: {
				ProvideAttributeValueUpdateType provideAttributeValueUpdateType = (ProvideAttributeValueUpdateType)theEObject;
				Object result = caseProvideAttributeValueUpdateType(provideAttributeValueUpdateType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2010Package.PUBLISH_INTERACTION_CLASS_TYPE: {
				PublishInteractionClassType publishInteractionClassType = (PublishInteractionClassType)theEObject;
				Object result = casePublishInteractionClassType(publishInteractionClassType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2010Package.PUBLISH_OBJECT_CLASS_ATTRIBUTES_TYPE: {
				PublishObjectClassAttributesType publishObjectClassAttributesType = (PublishObjectClassAttributesType)theEObject;
				Object result = casePublishObjectClassAttributesType(publishObjectClassAttributesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2010Package.QUERY_ATTRIBUTE_OWNERSHIP_TYPE: {
				QueryAttributeOwnershipType queryAttributeOwnershipType = (QueryAttributeOwnershipType)theEObject;
				Object result = caseQueryAttributeOwnershipType(queryAttributeOwnershipType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2010Package.QUERY_ATTRIBUTE_TRANSPORTATION_TYPE_TYPE: {
				QueryAttributeTransportationTypeType queryAttributeTransportationTypeType = (QueryAttributeTransportationTypeType)theEObject;
				Object result = caseQueryAttributeTransportationTypeType(queryAttributeTransportationTypeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2010Package.QUERY_FEDERATION_RESTORE_STATUS_TYPE: {
				QueryFederationRestoreStatusType queryFederationRestoreStatusType = (QueryFederationRestoreStatusType)theEObject;
				Object result = caseQueryFederationRestoreStatusType(queryFederationRestoreStatusType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2010Package.QUERY_FEDERATION_SAVE_STATUS_TYPE: {
				QueryFederationSaveStatusType queryFederationSaveStatusType = (QueryFederationSaveStatusType)theEObject;
				Object result = caseQueryFederationSaveStatusType(queryFederationSaveStatusType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2010Package.QUERY_GALT_TYPE: {
				QueryGALTType queryGALTType = (QueryGALTType)theEObject;
				Object result = caseQueryGALTType(queryGALTType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2010Package.QUERY_INTERACTION_TRANSPORTATION_TYPE_TYPE: {
				QueryInteractionTransportationTypeType queryInteractionTransportationTypeType = (QueryInteractionTransportationTypeType)theEObject;
				Object result = caseQueryInteractionTransportationTypeType(queryInteractionTransportationTypeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2010Package.QUERY_LITS_TYPE: {
				QueryLITSType queryLITSType = (QueryLITSType)theEObject;
				Object result = caseQueryLITSType(queryLITSType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2010Package.QUERY_LOGICAL_TIME_TYPE: {
				QueryLogicalTimeType queryLogicalTimeType = (QueryLogicalTimeType)theEObject;
				Object result = caseQueryLogicalTimeType(queryLogicalTimeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2010Package.QUERY_LOOKAHEAD_TYPE: {
				QueryLookaheadType queryLookaheadType = (QueryLookaheadType)theEObject;
				Object result = caseQueryLookaheadType(queryLookaheadType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2010Package.RATE_TYPE: {
				RateType rateType = (RateType)theEObject;
				Object result = caseRateType(rateType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2010Package.RECEIVE_INTERACTION_TYPE: {
				ReceiveInteractionType receiveInteractionType = (ReceiveInteractionType)theEObject;
				Object result = caseReceiveInteractionType(receiveInteractionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2010Package.REFERENCE_TYPE: {
				ReferenceType referenceType = (ReferenceType)theEObject;
				Object result = caseReferenceType(referenceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2010Package.REFLECT_ATTRIBUTE_VALUES_TYPE: {
				ReflectAttributeValuesType reflectAttributeValuesType = (ReflectAttributeValuesType)theEObject;
				Object result = caseReflectAttributeValuesType(reflectAttributeValuesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2010Package.REGISTER_FEDERATION_SYNCHRONIZATION_POINT_TYPE: {
				RegisterFederationSynchronizationPointType registerFederationSynchronizationPointType = (RegisterFederationSynchronizationPointType)theEObject;
				Object result = caseRegisterFederationSynchronizationPointType(registerFederationSynchronizationPointType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2010Package.REGISTER_OBJECT_INSTANCE_TYPE: {
				RegisterObjectInstanceType registerObjectInstanceType = (RegisterObjectInstanceType)theEObject;
				Object result = caseRegisterObjectInstanceType(registerObjectInstanceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2010Package.REGISTER_OBJECT_INSTANCE_WITH_REGIONS_TYPE: {
				RegisterObjectInstanceWithRegionsType registerObjectInstanceWithRegionsType = (RegisterObjectInstanceWithRegionsType)theEObject;
				Object result = caseRegisterObjectInstanceWithRegionsType(registerObjectInstanceWithRegionsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2010Package.RELEASE_MULTIPLE_OBJECT_INSTANCE_NAMES_TYPE: {
				ReleaseMultipleObjectInstanceNamesType releaseMultipleObjectInstanceNamesType = (ReleaseMultipleObjectInstanceNamesType)theEObject;
				Object result = caseReleaseMultipleObjectInstanceNamesType(releaseMultipleObjectInstanceNamesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2010Package.RELEASE_OBJECT_INSTANCE_NAME_TYPE: {
				ReleaseObjectInstanceNameType releaseObjectInstanceNameType = (ReleaseObjectInstanceNameType)theEObject;
				Object result = caseReleaseObjectInstanceNameType(releaseObjectInstanceNameType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2010Package.RELIABLE_TYPE: {
				ReliableType reliableType = (ReliableType)theEObject;
				Object result = caseReliableType(reliableType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2010Package.REMOVEOBJECTINSTANCE_TYPE: {
				RemoveobjectinstanceType removeobjectinstanceType = (RemoveobjectinstanceType)theEObject;
				Object result = caseRemoveobjectinstanceType(removeobjectinstanceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2010Package.REPORT_ATTRIBUTE_TRANSPORTATION_TYPE_TYPE: {
				ReportAttributeTransportationTypeType reportAttributeTransportationTypeType = (ReportAttributeTransportationTypeType)theEObject;
				Object result = caseReportAttributeTransportationTypeType(reportAttributeTransportationTypeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2010Package.REPORT_FEDERATION_EXECUTIONS_TYPE: {
				ReportFederationExecutionsType reportFederationExecutionsType = (ReportFederationExecutionsType)theEObject;
				Object result = caseReportFederationExecutionsType(reportFederationExecutionsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2010Package.REPORT_INTERACTION_TRANSPORTATION_TYPE_TYPE: {
				ReportInteractionTransportationTypeType reportInteractionTransportationTypeType = (ReportInteractionTransportationTypeType)theEObject;
				Object result = caseReportInteractionTransportationTypeType(reportInteractionTransportationTypeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2010Package.REQUEST_ATTRIBUTE_OWNERSHIP_ASSUMPTION_TYPE: {
				RequestAttributeOwnershipAssumptionType requestAttributeOwnershipAssumptionType = (RequestAttributeOwnershipAssumptionType)theEObject;
				Object result = caseRequestAttributeOwnershipAssumptionType(requestAttributeOwnershipAssumptionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2010Package.REQUEST_ATTRIBUTE_OWNERSHIP_RELEASE_TYPE: {
				RequestAttributeOwnershipReleaseType requestAttributeOwnershipReleaseType = (RequestAttributeOwnershipReleaseType)theEObject;
				Object result = caseRequestAttributeOwnershipReleaseType(requestAttributeOwnershipReleaseType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2010Package.REQUEST_ATTRIBUTE_TRANSPORTATION_TYPE_CHANGE_TYPE: {
				RequestAttributeTransportationTypeChangeType requestAttributeTransportationTypeChangeType = (RequestAttributeTransportationTypeChangeType)theEObject;
				Object result = caseRequestAttributeTransportationTypeChangeType(requestAttributeTransportationTypeChangeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2010Package.REQUEST_ATTRIBUTE_VALUE_UPDATE_TYPE: {
				RequestAttributeValueUpdateType requestAttributeValueUpdateType = (RequestAttributeValueUpdateType)theEObject;
				Object result = caseRequestAttributeValueUpdateType(requestAttributeValueUpdateType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2010Package.REQUEST_ATTRIBUTE_VALUE_UPDATE_WITH_REGIONS_TYPE: {
				RequestAttributeValueUpdateWithRegionsType requestAttributeValueUpdateWithRegionsType = (RequestAttributeValueUpdateWithRegionsType)theEObject;
				Object result = caseRequestAttributeValueUpdateWithRegionsType(requestAttributeValueUpdateWithRegionsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2010Package.REQUEST_DIVESTITURE_CONFIRMATION_TYPE: {
				RequestDivestitureConfirmationType requestDivestitureConfirmationType = (RequestDivestitureConfirmationType)theEObject;
				Object result = caseRequestDivestitureConfirmationType(requestDivestitureConfirmationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2010Package.REQUEST_FEDERATION_RESTORE_TYPE: {
				RequestFederationRestoreType requestFederationRestoreType = (RequestFederationRestoreType)theEObject;
				Object result = caseRequestFederationRestoreType(requestFederationRestoreType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2010Package.REQUEST_FEDERATION_SAVE_TYPE: {
				RequestFederationSaveType requestFederationSaveType = (RequestFederationSaveType)theEObject;
				Object result = caseRequestFederationSaveType(requestFederationSaveType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2010Package.REQUEST_INTERACTION_TRANSPORTATION_TYPE_CHANGE_TYPE: {
				RequestInteractionTransportationTypeChangeType requestInteractionTransportationTypeChangeType = (RequestInteractionTransportationTypeChangeType)theEObject;
				Object result = caseRequestInteractionTransportationTypeChangeType(requestInteractionTransportationTypeChangeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2010Package.REQUEST_RETRACTION_TYPE: {
				RequestRetractionType requestRetractionType = (RequestRetractionType)theEObject;
				Object result = caseRequestRetractionType(requestRetractionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2010Package.RESERVE_MULTIPLE_OBJECT_INSTANCE_NAMES_TYPE: {
				ReserveMultipleObjectInstanceNamesType reserveMultipleObjectInstanceNamesType = (ReserveMultipleObjectInstanceNamesType)theEObject;
				Object result = caseReserveMultipleObjectInstanceNamesType(reserveMultipleObjectInstanceNamesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2010Package.RESERVE_OBJECT_INSTANCE_NAME_TYPE: {
				ReserveObjectInstanceNameType reserveObjectInstanceNameType = (ReserveObjectInstanceNameType)theEObject;
				Object result = caseReserveObjectInstanceNameType(reserveObjectInstanceNameType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2010Package.RESIGN_FEDERATION_EXECUTION_TYPE: {
				ResignFederationExecutionType resignFederationExecutionType = (ResignFederationExecutionType)theEObject;
				Object result = caseResignFederationExecutionType(resignFederationExecutionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2010Package.RESIGN_SWITCH_TYPE: {
				ResignSwitchType resignSwitchType = (ResignSwitchType)theEObject;
				Object result = caseResignSwitchType(resignSwitchType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2010Package.RETRACT_TYPE: {
				RetractType retractType = (RetractType)theEObject;
				Object result = caseRetractType(retractType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2010Package.SECURITY_CLASSIFICATION_TYPE: {
				SecurityClassificationType securityClassificationType = (SecurityClassificationType)theEObject;
				Object result = caseSecurityClassificationType(securityClassificationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2010Package.SEND_INTERACTION_TYPE: {
				SendInteractionType sendInteractionType = (SendInteractionType)theEObject;
				Object result = caseSendInteractionType(sendInteractionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2010Package.SEND_INTERACTION_WITH_REGIONS_TYPE: {
				SendInteractionWithRegionsType sendInteractionWithRegionsType = (SendInteractionWithRegionsType)theEObject;
				Object result = caseSendInteractionWithRegionsType(sendInteractionWithRegionsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2010Package.SERVICE_UTILIZATION_TYPE: {
				ServiceUtilizationType serviceUtilizationType = (ServiceUtilizationType)theEObject;
				Object result = caseServiceUtilizationType(serviceUtilizationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2010Package.SET_AUTOMATIC_RESIGN_DIRECTIVE_TYPE: {
				SetAutomaticResignDirectiveType setAutomaticResignDirectiveType = (SetAutomaticResignDirectiveType)theEObject;
				Object result = caseSetAutomaticResignDirectiveType(setAutomaticResignDirectiveType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2010Package.SET_RANGE_BOUNDS_TYPE: {
				SetRangeBoundsType setRangeBoundsType = (SetRangeBoundsType)theEObject;
				Object result = caseSetRangeBoundsType(setRangeBoundsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2010Package.SHARING_TYPE: {
				SharingType sharingType = (SharingType)theEObject;
				Object result = caseSharingType(sharingType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2010Package.SIMPLE_DATA_TYPE: {
				SimpleDataType simpleDataType = (SimpleDataType)theEObject;
				Object result = caseSimpleDataType(simpleDataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2010Package.SIMPLE_DATA_TYPE1: {
				SimpleDataType1 simpleDataType1 = (SimpleDataType1)theEObject;
				Object result = caseSimpleDataType1(simpleDataType1);
				if (result == null) result = caseSimpleDataType(simpleDataType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2010Package.SIMPLE_DATA_TYPES_TYPE: {
				SimpleDataTypesType simpleDataTypesType = (SimpleDataTypesType)theEObject;
				Object result = caseSimpleDataTypesType(simpleDataTypesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2010Package.SIZE: {
				Size size = (Size)theEObject;
				Object result = caseSize(size);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2010Package.START_REGISTRATION_FOR_OBJECT_CLASS_TYPE: {
				StartRegistrationForObjectClassType startRegistrationForObjectClassType = (StartRegistrationForObjectClassType)theEObject;
				Object result = caseStartRegistrationForObjectClassType(startRegistrationForObjectClassType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2010Package.STOP_REGISTRATION_FOR_OBJECT_CLASS_TYPE: {
				StopRegistrationForObjectClassType stopRegistrationForObjectClassType = (StopRegistrationForObjectClassType)theEObject;
				Object result = caseStopRegistrationForObjectClassType(stopRegistrationForObjectClassType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2010Package.STRING: {
				org.sisostds.schemas.ieee1516._2010.String string = (org.sisostds.schemas.ieee1516._2010.String)theEObject;
				Object result = caseString(string);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2010Package.SUBSCRIBE_INTERACTION_CLASS_TYPE: {
				SubscribeInteractionClassType subscribeInteractionClassType = (SubscribeInteractionClassType)theEObject;
				Object result = caseSubscribeInteractionClassType(subscribeInteractionClassType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2010Package.SUBSCRIBE_INTERACTION_CLASS_WITH_REGIONS_TYPE: {
				SubscribeInteractionClassWithRegionsType subscribeInteractionClassWithRegionsType = (SubscribeInteractionClassWithRegionsType)theEObject;
				Object result = caseSubscribeInteractionClassWithRegionsType(subscribeInteractionClassWithRegionsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2010Package.SUBSCRIBE_OBJECT_CLASS_ATTRIBUTES_TYPE: {
				SubscribeObjectClassAttributesType subscribeObjectClassAttributesType = (SubscribeObjectClassAttributesType)theEObject;
				Object result = caseSubscribeObjectClassAttributesType(subscribeObjectClassAttributesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2010Package.SUBSCRIBE_OBJECT_CLASS_ATTRIBUTES_WITH_REGIONS_TYPE: {
				SubscribeObjectClassAttributesWithRegionsType subscribeObjectClassAttributesWithRegionsType = (SubscribeObjectClassAttributesWithRegionsType)theEObject;
				Object result = caseSubscribeObjectClassAttributesWithRegionsType(subscribeObjectClassAttributesWithRegionsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2010Package.SWITCHES_TYPE: {
				SwitchesType switchesType = (SwitchesType)theEObject;
				Object result = caseSwitchesType(switchesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2010Package.SWITCH_TYPE: {
				SwitchType switchType = (SwitchType)theEObject;
				Object result = caseSwitchType(switchType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2010Package.SYNCHRONIZATION_POINT_ACHIEVED_TYPE: {
				SynchronizationPointAchievedType synchronizationPointAchievedType = (SynchronizationPointAchievedType)theEObject;
				Object result = caseSynchronizationPointAchievedType(synchronizationPointAchievedType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2010Package.SYNCHRONIZATION_POINT_TYPE: {
				SynchronizationPointType synchronizationPointType = (SynchronizationPointType)theEObject;
				Object result = caseSynchronizationPointType(synchronizationPointType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2010Package.SYNCHRONIZATION_POINT_TYPE1: {
				SynchronizationPointType1 synchronizationPointType1 = (SynchronizationPointType1)theEObject;
				Object result = caseSynchronizationPointType1(synchronizationPointType1);
				if (result == null) result = caseSynchronizationPointType(synchronizationPointType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2010Package.SYNCHRONIZATIONS_TYPE: {
				SynchronizationsType synchronizationsType = (SynchronizationsType)theEObject;
				Object result = caseSynchronizationsType(synchronizationsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2010Package.TAGS_TYPE: {
				TagsType tagsType = (TagsType)theEObject;
				Object result = caseTagsType(tagsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2010Package.TAG_TYPE: {
				TagType tagType = (TagType)theEObject;
				Object result = caseTagType(tagType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2010Package.TIME_ADVANCE_GRANT_TYPE: {
				TimeAdvanceGrantType timeAdvanceGrantType = (TimeAdvanceGrantType)theEObject;
				Object result = caseTimeAdvanceGrantType(timeAdvanceGrantType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2010Package.TIME_ADVANCE_REQUEST_AVAILABLE_TYPE: {
				TimeAdvanceRequestAvailableType timeAdvanceRequestAvailableType = (TimeAdvanceRequestAvailableType)theEObject;
				Object result = caseTimeAdvanceRequestAvailableType(timeAdvanceRequestAvailableType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2010Package.TIME_ADVANCE_REQUEST_TYPE: {
				TimeAdvanceRequestType timeAdvanceRequestType = (TimeAdvanceRequestType)theEObject;
				Object result = caseTimeAdvanceRequestType(timeAdvanceRequestType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2010Package.TIME_CONSTRAINED_ENABLED_TYPE: {
				TimeConstrainedEnabledType timeConstrainedEnabledType = (TimeConstrainedEnabledType)theEObject;
				Object result = caseTimeConstrainedEnabledType(timeConstrainedEnabledType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2010Package.TIME_REGULATION_ENABLED_TYPE: {
				TimeRegulationEnabledType timeRegulationEnabledType = (TimeRegulationEnabledType)theEObject;
				Object result = caseTimeRegulationEnabledType(timeRegulationEnabledType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2010Package.TIME_STAMP_TYPE: {
				TimeStampType timeStampType = (TimeStampType)theEObject;
				Object result = caseTimeStampType(timeStampType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2010Package.TIME_TYPE: {
				TimeType timeType = (TimeType)theEObject;
				Object result = caseTimeType(timeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2010Package.TRANSPORTATIONS_TYPE: {
				TransportationsType transportationsType = (TransportationsType)theEObject;
				Object result = caseTransportationsType(transportationsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2010Package.TRANSPORTATION_TYPE: {
				TransportationType transportationType = (TransportationType)theEObject;
				Object result = caseTransportationType(transportationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2010Package.TRANSPORTATION_TYPE1: {
				TransportationType1 transportationType1 = (TransportationType1)theEObject;
				Object result = caseTransportationType1(transportationType1);
				if (result == null) result = caseTransportationType(transportationType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2010Package.TURN_INTERACTIONS_OFF_TYPE: {
				TurnInteractionsOffType turnInteractionsOffType = (TurnInteractionsOffType)theEObject;
				Object result = caseTurnInteractionsOffType(turnInteractionsOffType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2010Package.TURN_INTERACTIONS_ON_TYPE: {
				TurnInteractionsOnType turnInteractionsOnType = (TurnInteractionsOnType)theEObject;
				Object result = caseTurnInteractionsOnType(turnInteractionsOnType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2010Package.TURN_UPDATES_OFF_FOR_OBJECT_INSTANCE_TYPE: {
				TurnUpdatesOffForObjectInstanceType turnUpdatesOffForObjectInstanceType = (TurnUpdatesOffForObjectInstanceType)theEObject;
				Object result = caseTurnUpdatesOffForObjectInstanceType(turnUpdatesOffForObjectInstanceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2010Package.TURN_UPDATES_ON_FOR_OBJECT_INSTANCE_TYPE: {
				TurnUpdatesOnForObjectInstanceType turnUpdatesOnForObjectInstanceType = (TurnUpdatesOnForObjectInstanceType)theEObject;
				Object result = caseTurnUpdatesOnForObjectInstanceType(turnUpdatesOnForObjectInstanceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2010Package.TYPE_TYPE: {
				TypeType typeType = (TypeType)theEObject;
				Object result = caseTypeType(typeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2010Package.UNASSOCIATE_REGIONS_FOR_UPDATES_TYPE: {
				UnassociateRegionsForUpdatesType unassociateRegionsForUpdatesType = (UnassociateRegionsForUpdatesType)theEObject;
				Object result = caseUnassociateRegionsForUpdatesType(unassociateRegionsForUpdatesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2010Package.UNCONDITIONAL_ATTRIBUTE_OWNERSHIP_DIVESTITURE_TYPE: {
				UnconditionalAttributeOwnershipDivestitureType unconditionalAttributeOwnershipDivestitureType = (UnconditionalAttributeOwnershipDivestitureType)theEObject;
				Object result = caseUnconditionalAttributeOwnershipDivestitureType(unconditionalAttributeOwnershipDivestitureType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2010Package.UNPUBLISH_INTERACTION_CLASS_TYPE: {
				UnpublishInteractionClassType unpublishInteractionClassType = (UnpublishInteractionClassType)theEObject;
				Object result = caseUnpublishInteractionClassType(unpublishInteractionClassType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2010Package.UNPUBLISH_OBJECT_CLASS_ATTRIBUTES_TYPE: {
				UnpublishObjectClassAttributesType unpublishObjectClassAttributesType = (UnpublishObjectClassAttributesType)theEObject;
				Object result = caseUnpublishObjectClassAttributesType(unpublishObjectClassAttributesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2010Package.UNSUBSCRIBE_INTERACTION_CLASS_TYPE: {
				UnsubscribeInteractionClassType unsubscribeInteractionClassType = (UnsubscribeInteractionClassType)theEObject;
				Object result = caseUnsubscribeInteractionClassType(unsubscribeInteractionClassType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2010Package.UNSUBSCRIBE_INTERACTION_CLASS_WITH_REGIONS_TYPE: {
				UnsubscribeInteractionClassWithRegionsType unsubscribeInteractionClassWithRegionsType = (UnsubscribeInteractionClassWithRegionsType)theEObject;
				Object result = caseUnsubscribeInteractionClassWithRegionsType(unsubscribeInteractionClassWithRegionsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2010Package.UNSUBSCRIBE_OBJECT_CLASS_ATTRIBUTES_TYPE: {
				UnsubscribeObjectClassAttributesType unsubscribeObjectClassAttributesType = (UnsubscribeObjectClassAttributesType)theEObject;
				Object result = caseUnsubscribeObjectClassAttributesType(unsubscribeObjectClassAttributesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2010Package.UNSUBSCRIBE_OBJECT_CLASS_ATTRIBUTES_WITH_REGIONS_TYPE: {
				UnsubscribeObjectClassAttributesWithRegionsType unsubscribeObjectClassAttributesWithRegionsType = (UnsubscribeObjectClassAttributesWithRegionsType)theEObject;
				Object result = caseUnsubscribeObjectClassAttributesWithRegionsType(unsubscribeObjectClassAttributesWithRegionsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2010Package.UPDATE_ATTRIBUTE_VALUES_TYPE: {
				UpdateAttributeValuesType updateAttributeValuesType = (UpdateAttributeValuesType)theEObject;
				Object result = caseUpdateAttributeValuesType(updateAttributeValuesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2010Package.UPDATE_RATES_TYPE: {
				UpdateRatesType updateRatesType = (UpdateRatesType)theEObject;
				Object result = caseUpdateRatesType(updateRatesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2010Package.UPDATE_RATE_TYPE: {
				UpdateRateType updateRateType = (UpdateRateType)theEObject;
				Object result = caseUpdateRateType(updateRateType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2010Package.UPDATE_TYPE: {
				UpdateType updateType = (UpdateType)theEObject;
				Object result = caseUpdateType(updateType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2010Package.UPPER_BOUND_TYPE: {
				UpperBoundType upperBoundType = (UpperBoundType)theEObject;
				Object result = caseUpperBoundType(upperBoundType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2010Package.VALUE_TYPE: {
				ValueType valueType = (ValueType)theEObject;
				Object result = caseValueType(valueType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2010Package.VARIANT_RECORD_DATA_TYPE: {
				VariantRecordDataType variantRecordDataType = (VariantRecordDataType)theEObject;
				Object result = caseVariantRecordDataType(variantRecordDataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2010Package.VARIANT_RECORD_DATA_TYPE1: {
				VariantRecordDataType1 variantRecordDataType1 = (VariantRecordDataType1)theEObject;
				Object result = caseVariantRecordDataType1(variantRecordDataType1);
				if (result == null) result = caseVariantRecordDataType(variantRecordDataType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2010Package.VARIANT_RECORD_DATA_TYPES_TYPE: {
				VariantRecordDataTypesType variantRecordDataTypesType = (VariantRecordDataTypesType)theEObject;
				Object result = caseVariantRecordDataTypesType(variantRecordDataTypesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _2010Package.VARIANT_RECORD_ENCODING_TYPE: {
				VariantRecordEncodingType variantRecordEncodingType = (VariantRecordEncodingType)theEObject;
				Object result = caseVariantRecordEncodingType(variantRecordEncodingType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abort Federation Restore Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abort Federation Restore Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseAbortFederationRestoreType(AbortFederationRestoreType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abort Federation Save Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abort Federation Save Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseAbortFederationSaveType(AbortFederationSaveType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Alternative Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Alternative Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseAlternativeType(AlternativeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Announce Synchronization Point Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Announce Synchronization Point Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseAnnounceSynchronizationPointType(AnnounceSynchronizationPointType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Application Domain Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Application Domain Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseApplicationDomainType(ApplicationDomainType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Array Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Array Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseArrayDataType(ArrayDataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Array Data Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Array Data Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseArrayDataType1(ArrayDataType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Array Datatype Encoding Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Array Datatype Encoding Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseArrayDatatypeEncodingType(ArrayDatatypeEncodingType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Array Data Types Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Array Data Types Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseArrayDataTypesType(ArrayDataTypesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Array Data Types Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Array Data Types Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseArrayDataTypesType1(ArrayDataTypesType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Associate Regions For Updates Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Associate Regions For Updates Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseAssociateRegionsForUpdatesType(AssociateRegionsForUpdatesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute Ownership Acquisition If Available Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute Ownership Acquisition If Available Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseAttributeOwnershipAcquisitionIfAvailableType(AttributeOwnershipAcquisitionIfAvailableType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute Ownership Acquisition Notification Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute Ownership Acquisition Notification Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseAttributeOwnershipAcquisitionNotificationType(AttributeOwnershipAcquisitionNotificationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute Ownership Acquisition Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute Ownership Acquisition Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseAttributeOwnershipAcquisitionType(AttributeOwnershipAcquisitionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute Ownership Divestiture If Wanted Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute Ownership Divestiture If Wanted Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseAttributeOwnershipDivestitureIfWantedType(AttributeOwnershipDivestitureIfWantedType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute Ownership Release Denied Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute Ownership Release Denied Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseAttributeOwnershipReleaseDeniedType(AttributeOwnershipReleaseDeniedType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute Ownership Unavailable Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute Ownership Unavailable Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseAttributeOwnershipUnavailableType(AttributeOwnershipUnavailableType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attributes In Scope Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attributes In Scope Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseAttributesInScopeType(AttributesInScopeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attributes Out Of Scope Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attributes Out Of Scope Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseAttributesOutOfScopeType(AttributesOutOfScopeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseAttributeType(AttributeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseAttributeType1(AttributeType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Basic Data Representations Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Basic Data Representations Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseBasicDataRepresentationsType(BasicDataRepresentationsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Basic Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Basic Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseBasicDataType(BasicDataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Basic Data Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Basic Data Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseBasicDataType1(BasicDataType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cancel Attribute Ownership Acquisition Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cancel Attribute Ownership Acquisition Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseCancelAttributeOwnershipAcquisitionType(CancelAttributeOwnershipAcquisitionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cancel Negotiated Attribute Ownership Divestiture Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cancel Negotiated Attribute Ownership Divestiture Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseCancelNegotiatedAttributeOwnershipDivestitureType(CancelNegotiatedAttributeOwnershipDivestitureType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Capability Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Capability Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseCapabilityType(CapabilityType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cardinality Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cardinality Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseCardinalityType(CardinalityType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Change Attribute Order Type Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Change Attribute Order Type Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseChangeAttributeOrderTypeType(ChangeAttributeOrderTypeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Change Interaction Order Type Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Change Interaction Order Type Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseChangeInteractionOrderTypeType(ChangeInteractionOrderTypeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Commit Region Modifications Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Commit Region Modifications Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseCommitRegionModificationsType(CommitRegionModificationsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Confirm Attribute Ownership Acquisition Cancellation Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Confirm Attribute Ownership Acquisition Cancellation Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseConfirmAttributeOwnershipAcquisitionCancellationType(ConfirmAttributeOwnershipAcquisitionCancellationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Confirm Attribute Transportation Type Change Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Confirm Attribute Transportation Type Change Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseConfirmAttributeTransportationTypeChangeType(ConfirmAttributeTransportationTypeChangeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Confirm Divestiture Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Confirm Divestiture Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseConfirmDivestitureType(ConfirmDivestitureType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Confirm Federation Restoration Request Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Confirm Federation Restoration Request Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseConfirmFederationRestorationRequestType(ConfirmFederationRestorationRequestType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Confirm Interaction Transportation Type Change Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Confirm Interaction Transportation Type Change Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseConfirmInteractionTransportationTypeChangeType(ConfirmInteractionTransportationTypeChangeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Confirm Synchronization Point Registration Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Confirm Synchronization Point Registration Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseConfirmSynchronizationPointRegistrationType(ConfirmSynchronizationPointRegistrationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connection Lost Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connection Lost Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseConnectionLostType(ConnectionLostType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connect Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connect Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseConnectType(ConnectType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Create Federation Execution Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Create Federation Execution Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseCreateFederationExecutionType(CreateFederationExecutionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Create Region Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Create Region Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseCreateRegionType(CreateRegionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Types Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Types Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseDataTypesType(DataTypesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Delete Object Instance Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Delete Object Instance Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseDeleteObjectInstanceType(DeleteObjectInstanceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Delete Region Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Delete Region Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseDeleteRegionType(DeleteRegionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Destroy Federation Execution Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Destroy Federation Execution Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseDestroyFederationExecutionType(DestroyFederationExecutionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dimensions Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dimensions Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseDimensionsType(DimensionsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dimensions Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dimensions Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseDimensionsType1(DimensionsType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dimensions Type2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dimensions Type2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseDimensionsType2(DimensionsType2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dimension Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dimension Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseDimensionType(DimensionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dimension Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dimension Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseDimensionType1(DimensionType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Disable Asynchronous Delivery Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Disable Asynchronous Delivery Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseDisableAsynchronousDeliveryType(DisableAsynchronousDeliveryType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Disable Attribute Relevance Advisory Switch Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Disable Attribute Relevance Advisory Switch Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseDisableAttributeRelevanceAdvisorySwitchType(DisableAttributeRelevanceAdvisorySwitchType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Disable Attribute Scope Advisory Switch Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Disable Attribute Scope Advisory Switch Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseDisableAttributeScopeAdvisorySwitchType(DisableAttributeScopeAdvisorySwitchType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Disable Callbacks Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Disable Callbacks Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseDisableCallbacksType(DisableCallbacksType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Disable Interaction Relevance Advisory Switch Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Disable Interaction Relevance Advisory Switch Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseDisableInteractionRelevanceAdvisorySwitchType(DisableInteractionRelevanceAdvisorySwitchType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Disable Object Class Relevance Advisory Switch Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Disable Object Class Relevance Advisory Switch Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseDisableObjectClassRelevanceAdvisorySwitchType(DisableObjectClassRelevanceAdvisorySwitchType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Disable Time Constrained Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Disable Time Constrained Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseDisableTimeConstrainedType(DisableTimeConstrainedType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Disable Time Regulation Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Disable Time Regulation Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseDisableTimeRegulationType(DisableTimeRegulationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Disconnect Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Disconnect Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseDisconnectType(DisconnectType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Discover Object Instance Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Discover Object Instance Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseDiscoverObjectInstanceType(DiscoverObjectInstanceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseDocumentRoot(DocumentRoot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enable Asynchronous Delivery Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enable Asynchronous Delivery Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseEnableAsynchronousDeliveryType(EnableAsynchronousDeliveryType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enable Attribute Relevance Advisory Switch Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enable Attribute Relevance Advisory Switch Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseEnableAttributeRelevanceAdvisorySwitchType(EnableAttributeRelevanceAdvisorySwitchType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enable Attribute Scope Advisory Switch Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enable Attribute Scope Advisory Switch Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseEnableAttributeScopeAdvisorySwitchType(EnableAttributeScopeAdvisorySwitchType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enable Callbacks Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enable Callbacks Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseEnableCallbacksType(EnableCallbacksType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enable Interaction Relevance Advisory Switch Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enable Interaction Relevance Advisory Switch Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseEnableInteractionRelevanceAdvisorySwitchType(EnableInteractionRelevanceAdvisorySwitchType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enable Object Class Relevance Advisory Switch Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enable Object Class Relevance Advisory Switch Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseEnableObjectClassRelevanceAdvisorySwitchType(EnableObjectClassRelevanceAdvisorySwitchType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enable Time Constrained Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enable Time Constrained Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseEnableTimeConstrainedType(EnableTimeConstrainedType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enable Time Regulation Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enable Time Regulation Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseEnableTimeRegulationType(EnableTimeRegulationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Endian Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Endian Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseEndianType(EndianType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enumerated Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enumerated Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseEnumeratedDataType(EnumeratedDataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enumerated Data Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enumerated Data Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseEnumeratedDataType1(EnumeratedDataType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enumerated Data Types Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enumerated Data Types Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseEnumeratedDataTypesType(EnumeratedDataTypesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enumerator Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enumerator Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseEnumeratorType(EnumeratorType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Evoke Callback Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Evoke Callback Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseEvokeCallbackType(EvokeCallbackType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Evoke Multiple Callbacks Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Evoke Multiple Callbacks Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseEvokeMultipleCallbacksType(EvokeMultipleCallbacksType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Federate Restore Complete Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Federate Restore Complete Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseFederateRestoreCompleteType(FederateRestoreCompleteType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Federate Save Begun Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Federate Save Begun Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseFederateSaveBegunType(FederateSaveBegunType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Federate Save Complete Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Federate Save Complete Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseFederateSaveCompleteType(FederateSaveCompleteType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Federation Restore Begun Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Federation Restore Begun Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseFederationRestoreBegunType(FederationRestoreBegunType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Federation Restored Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Federation Restored Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseFederationRestoredType(FederationRestoredType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Federation Restore Status Response Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Federation Restore Status Response Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseFederationRestoreStatusResponseType(FederationRestoreStatusResponseType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Federation Saved Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Federation Saved Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseFederationSavedType(FederationSavedType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Federation Save Status Response Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Federation Save Status Response Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseFederationSaveStatusResponseType(FederationSaveStatusResponseType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Federation Synchronized Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Federation Synchronized Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseFederationSynchronizedType(FederationSynchronizedType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Field Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Field Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseFieldType(FieldType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fixed Record Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fixed Record Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseFixedRecordDataType(FixedRecordDataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fixed Record Data Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fixed Record Data Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseFixedRecordDataType1(FixedRecordDataType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fixed Record Data Types Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fixed Record Data Types Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseFixedRecordDataTypesType(FixedRecordDataTypesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fixed Record Encoding Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fixed Record Encoding Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseFixedRecordEncodingType(FixedRecordEncodingType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Flush Queue Request Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Flush Queue Request Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseFlushQueueRequestType(FlushQueueRequestType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Get Attribute Handle Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Get Attribute Handle Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseGetAttributeHandleType(GetAttributeHandleType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Get Attribute Name Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Get Attribute Name Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseGetAttributeNameType(GetAttributeNameType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Get Automatic Resign Directive Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Get Automatic Resign Directive Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseGetAutomaticResignDirectiveType(GetAutomaticResignDirectiveType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Get Available Dimensions For Class Attribute Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Get Available Dimensions For Class Attribute Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseGetAvailableDimensionsForClassAttributeType(GetAvailableDimensionsForClassAttributeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Get Available Dimensions For Interaction Class Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Get Available Dimensions For Interaction Class Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseGetAvailableDimensionsForInteractionClassType(GetAvailableDimensionsForInteractionClassType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Get Dimension Handle Set Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Get Dimension Handle Set Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseGetDimensionHandleSetType(GetDimensionHandleSetType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Get Dimension Handle Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Get Dimension Handle Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseGetDimensionHandleType(GetDimensionHandleType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Get Dimension Name Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Get Dimension Name Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseGetDimensionNameType(GetDimensionNameType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Get Dimension Upper Bound Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Get Dimension Upper Bound Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseGetDimensionUpperBoundType(GetDimensionUpperBoundType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Get Federate Handle Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Get Federate Handle Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseGetFederateHandleType(GetFederateHandleType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Get Federate Name Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Get Federate Name Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseGetFederateNameType(GetFederateNameType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Get Interaction Class Handle Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Get Interaction Class Handle Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseGetInteractionClassHandleType(GetInteractionClassHandleType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Get Interaction Class Name Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Get Interaction Class Name Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseGetInteractionClassNameType(GetInteractionClassNameType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Get Known Object Class Handle Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Get Known Object Class Handle Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseGetKnownObjectClassHandleType(GetKnownObjectClassHandleType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Get Object Class Handle Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Get Object Class Handle Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseGetObjectClassHandleType(GetObjectClassHandleType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Get Object Class Name Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Get Object Class Name Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseGetObjectClassNameType(GetObjectClassNameType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Get Object Instance Handle Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Get Object Instance Handle Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseGetObjectInstanceHandleType(GetObjectInstanceHandleType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Get Object Instance Name Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Get Object Instance Name Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseGetObjectInstanceNameType(GetObjectInstanceNameType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Get Order Name Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Get Order Name Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseGetOrderNameType(GetOrderNameType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Get Order Type Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Get Order Type Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseGetOrderTypeType(GetOrderTypeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Get Parameter Handle Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Get Parameter Handle Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseGetParameterHandleType(GetParameterHandleType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Get Parameter Name Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Get Parameter Name Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseGetParameterNameType(GetParameterNameType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Get Range Bounds Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Get Range Bounds Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseGetRangeBoundsType(GetRangeBoundsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Get Transportation Type Handle Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Get Transportation Type Handle Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseGetTransportationTypeHandleType(GetTransportationTypeHandleType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Get Transportation Type Name Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Get Transportation Type Name Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseGetTransportationTypeNameType(GetTransportationTypeNameType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Get Update Rate Value For Attribute Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Get Update Rate Value For Attribute Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseGetUpdateRateValueForAttributeType(GetUpdateRateValueForAttributeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Get Update Rate Value Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Get Update Rate Value Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseGetUpdateRateValueType(GetUpdateRateValueType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Glyph Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Glyph Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseGlyphType(GlyphType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Glyph Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Glyph Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseGlyphType1(GlyphType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Identification Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Identification Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseIdentificationType(IdentificationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Identifier Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Identifier Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseIdentifierType(IdentifierType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Id Reference Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Id Reference Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseIdReferenceType(IdReferenceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Inform Attribute Ownership Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Inform Attribute Ownership Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseInformAttributeOwnershipType(InformAttributeOwnershipType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Initiate Federate Restore Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Initiate Federate Restore Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseInitiateFederateRestoreType(InitiateFederateRestoreType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Initiate Federate Save Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Initiate Federate Save Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseInitiateFederateSaveType(InitiateFederateSaveType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interaction Class Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interaction Class Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseInteractionClassType(InteractionClassType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interaction Class Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interaction Class Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseInteractionClassType1(InteractionClassType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interactions Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interactions Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseInteractionsType(InteractionsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Is Attribute Owned By Federate Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Is Attribute Owned By Federate Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseIsAttributeOwnedByFederateType(IsAttributeOwnedByFederateType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Join Federation Execution Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Join Federation Execution Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseJoinFederationExecutionType(JoinFederationExecutionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Keyword Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Keyword Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseKeywordType(KeywordType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Federation Executions Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Federation Executions Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseListFederationExecutionsType(ListFederationExecutionsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Local Delete Object Instance Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Local Delete Object Instance Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseLocalDeleteObjectInstanceType(LocalDeleteObjectInstanceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lookahead Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lookahead Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseLookaheadType(LookaheadType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model Identification Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model Identification Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseModelIdentificationType(ModelIdentificationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseModelType(ModelType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Modification Date Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Modification Date Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseModificationDateType(ModificationDateType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Modify Lookahead Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Modify Lookahead Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseModifyLookaheadType(ModifyLookaheadType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Multiple Object Instance Names Reserved Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Multiple Object Instance Names Reserved Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseMultipleObjectInstanceNamesReservedType(MultipleObjectInstanceNamesReservedType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Negotiated Attribute Ownership Divestiture Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Negotiated Attribute Ownership Divestiture Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseNegotiatedAttributeOwnershipDivestitureType(NegotiatedAttributeOwnershipDivestitureType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Next Message Request Available Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Next Message Request Available Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseNextMessageRequestAvailableType(NextMessageRequestAvailableType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Next Message Request Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Next Message Request Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseNextMessageRequestType(NextMessageRequestType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Non Empty String1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Non Empty String1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseNonEmptyString1(NonEmptyString1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Normalize Federate Handle Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Normalize Federate Handle Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseNormalizeFederateHandleType(NormalizeFederateHandleType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Normalize Service Group Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Normalize Service Group Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseNormalizeServiceGroupType(NormalizeServiceGroupType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Notes Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Notes Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseNotesType(NotesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Note Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Note Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseNoteType(NoteType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object Class Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object Class Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseObjectClassType(ObjectClassType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object Class Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object Class Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseObjectClassType1(ObjectClassType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object Instance Name Reserved Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object Instance Name Reserved Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseObjectInstanceNameReservedType(ObjectInstanceNameReservedType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object Model Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object Model Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseObjectModelType(ObjectModelType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Objects Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Objects Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseObjectsType(ObjectsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Order Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Order Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseOrderType(OrderType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ownership Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ownership Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseOwnershipType(OwnershipType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseParameterType(ParameterType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseParameterType1(ParameterType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Poc Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Poc Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object casePocType(PocType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Poc Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Poc Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object casePocType1(PocType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Poc Type Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Poc Type Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object casePocTypeType(PocTypeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Provide Attribute Value Update Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Provide Attribute Value Update Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseProvideAttributeValueUpdateType(ProvideAttributeValueUpdateType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Publish Interaction Class Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Publish Interaction Class Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object casePublishInteractionClassType(PublishInteractionClassType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Publish Object Class Attributes Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Publish Object Class Attributes Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object casePublishObjectClassAttributesType(PublishObjectClassAttributesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Query Attribute Ownership Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Query Attribute Ownership Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseQueryAttributeOwnershipType(QueryAttributeOwnershipType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Query Attribute Transportation Type Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Query Attribute Transportation Type Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseQueryAttributeTransportationTypeType(QueryAttributeTransportationTypeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Query Federation Restore Status Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Query Federation Restore Status Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseQueryFederationRestoreStatusType(QueryFederationRestoreStatusType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Query Federation Save Status Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Query Federation Save Status Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseQueryFederationSaveStatusType(QueryFederationSaveStatusType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Query GALT Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Query GALT Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseQueryGALTType(QueryGALTType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Query Interaction Transportation Type Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Query Interaction Transportation Type Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseQueryInteractionTransportationTypeType(QueryInteractionTransportationTypeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Query LITS Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Query LITS Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseQueryLITSType(QueryLITSType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Query Logical Time Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Query Logical Time Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseQueryLogicalTimeType(QueryLogicalTimeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Query Lookahead Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Query Lookahead Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseQueryLookaheadType(QueryLookaheadType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rate Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rate Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseRateType(RateType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Receive Interaction Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Receive Interaction Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseReceiveInteractionType(ReceiveInteractionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reference Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reference Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseReferenceType(ReferenceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reflect Attribute Values Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reflect Attribute Values Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseReflectAttributeValuesType(ReflectAttributeValuesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Register Federation Synchronization Point Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Register Federation Synchronization Point Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseRegisterFederationSynchronizationPointType(RegisterFederationSynchronizationPointType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Register Object Instance Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Register Object Instance Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseRegisterObjectInstanceType(RegisterObjectInstanceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Register Object Instance With Regions Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Register Object Instance With Regions Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseRegisterObjectInstanceWithRegionsType(RegisterObjectInstanceWithRegionsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Release Multiple Object Instance Names Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Release Multiple Object Instance Names Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseReleaseMultipleObjectInstanceNamesType(ReleaseMultipleObjectInstanceNamesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Release Object Instance Name Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Release Object Instance Name Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseReleaseObjectInstanceNameType(ReleaseObjectInstanceNameType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reliable Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reliable Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseReliableType(ReliableType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Removeobjectinstance Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Removeobjectinstance Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseRemoveobjectinstanceType(RemoveobjectinstanceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Report Attribute Transportation Type Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Report Attribute Transportation Type Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseReportAttributeTransportationTypeType(ReportAttributeTransportationTypeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Report Federation Executions Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Report Federation Executions Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseReportFederationExecutionsType(ReportFederationExecutionsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Report Interaction Transportation Type Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Report Interaction Transportation Type Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseReportInteractionTransportationTypeType(ReportInteractionTransportationTypeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Request Attribute Ownership Assumption Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Request Attribute Ownership Assumption Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseRequestAttributeOwnershipAssumptionType(RequestAttributeOwnershipAssumptionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Request Attribute Ownership Release Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Request Attribute Ownership Release Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseRequestAttributeOwnershipReleaseType(RequestAttributeOwnershipReleaseType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Request Attribute Transportation Type Change Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Request Attribute Transportation Type Change Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseRequestAttributeTransportationTypeChangeType(RequestAttributeTransportationTypeChangeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Request Attribute Value Update Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Request Attribute Value Update Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseRequestAttributeValueUpdateType(RequestAttributeValueUpdateType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Request Attribute Value Update With Regions Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Request Attribute Value Update With Regions Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseRequestAttributeValueUpdateWithRegionsType(RequestAttributeValueUpdateWithRegionsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Request Divestiture Confirmation Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Request Divestiture Confirmation Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseRequestDivestitureConfirmationType(RequestDivestitureConfirmationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Request Federation Restore Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Request Federation Restore Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseRequestFederationRestoreType(RequestFederationRestoreType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Request Federation Save Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Request Federation Save Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseRequestFederationSaveType(RequestFederationSaveType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Request Interaction Transportation Type Change Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Request Interaction Transportation Type Change Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseRequestInteractionTransportationTypeChangeType(RequestInteractionTransportationTypeChangeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Request Retraction Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Request Retraction Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseRequestRetractionType(RequestRetractionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reserve Multiple Object Instance Names Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reserve Multiple Object Instance Names Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseReserveMultipleObjectInstanceNamesType(ReserveMultipleObjectInstanceNamesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reserve Object Instance Name Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reserve Object Instance Name Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseReserveObjectInstanceNameType(ReserveObjectInstanceNameType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resign Federation Execution Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resign Federation Execution Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseResignFederationExecutionType(ResignFederationExecutionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resign Switch Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resign Switch Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseResignSwitchType(ResignSwitchType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Retract Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Retract Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseRetractType(RetractType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Security Classification Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Security Classification Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseSecurityClassificationType(SecurityClassificationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Send Interaction Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Send Interaction Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseSendInteractionType(SendInteractionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Send Interaction With Regions Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Send Interaction With Regions Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseSendInteractionWithRegionsType(SendInteractionWithRegionsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Utilization Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Utilization Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseServiceUtilizationType(ServiceUtilizationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Set Automatic Resign Directive Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Set Automatic Resign Directive Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseSetAutomaticResignDirectiveType(SetAutomaticResignDirectiveType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Set Range Bounds Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Set Range Bounds Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseSetRangeBoundsType(SetRangeBoundsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sharing Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sharing Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseSharingType(SharingType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Simple Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Simple Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseSimpleDataType(SimpleDataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Simple Data Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Simple Data Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseSimpleDataType1(SimpleDataType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Simple Data Types Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Simple Data Types Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseSimpleDataTypesType(SimpleDataTypesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Size</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Size</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseSize(Size object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Start Registration For Object Class Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Start Registration For Object Class Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseStartRegistrationForObjectClassType(StartRegistrationForObjectClassType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Stop Registration For Object Class Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Stop Registration For Object Class Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseStopRegistrationForObjectClassType(StopRegistrationForObjectClassType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseString(org.sisostds.schemas.ieee1516._2010.String object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Subscribe Interaction Class Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Subscribe Interaction Class Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseSubscribeInteractionClassType(SubscribeInteractionClassType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Subscribe Interaction Class With Regions Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Subscribe Interaction Class With Regions Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseSubscribeInteractionClassWithRegionsType(SubscribeInteractionClassWithRegionsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Subscribe Object Class Attributes Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Subscribe Object Class Attributes Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseSubscribeObjectClassAttributesType(SubscribeObjectClassAttributesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Subscribe Object Class Attributes With Regions Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Subscribe Object Class Attributes With Regions Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseSubscribeObjectClassAttributesWithRegionsType(SubscribeObjectClassAttributesWithRegionsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Switches Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Switches Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseSwitchesType(SwitchesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Switch Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Switch Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseSwitchType(SwitchType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Synchronization Point Achieved Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Synchronization Point Achieved Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseSynchronizationPointAchievedType(SynchronizationPointAchievedType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Synchronization Point Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Synchronization Point Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseSynchronizationPointType(SynchronizationPointType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Synchronization Point Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Synchronization Point Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseSynchronizationPointType1(SynchronizationPointType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Synchronizations Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Synchronizations Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseSynchronizationsType(SynchronizationsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tags Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tags Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseTagsType(TagsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tag Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tag Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseTagType(TagType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Time Advance Grant Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time Advance Grant Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseTimeAdvanceGrantType(TimeAdvanceGrantType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Time Advance Request Available Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time Advance Request Available Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseTimeAdvanceRequestAvailableType(TimeAdvanceRequestAvailableType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Time Advance Request Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time Advance Request Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseTimeAdvanceRequestType(TimeAdvanceRequestType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Time Constrained Enabled Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time Constrained Enabled Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseTimeConstrainedEnabledType(TimeConstrainedEnabledType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Time Regulation Enabled Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time Regulation Enabled Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseTimeRegulationEnabledType(TimeRegulationEnabledType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Time Stamp Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time Stamp Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseTimeStampType(TimeStampType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Time Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseTimeType(TimeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transportations Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transportations Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseTransportationsType(TransportationsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transportation Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transportation Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseTransportationType(TransportationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transportation Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transportation Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseTransportationType1(TransportationType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Turn Interactions Off Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Turn Interactions Off Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseTurnInteractionsOffType(TurnInteractionsOffType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Turn Interactions On Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Turn Interactions On Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseTurnInteractionsOnType(TurnInteractionsOnType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Turn Updates Off For Object Instance Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Turn Updates Off For Object Instance Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseTurnUpdatesOffForObjectInstanceType(TurnUpdatesOffForObjectInstanceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Turn Updates On For Object Instance Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Turn Updates On For Object Instance Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseTurnUpdatesOnForObjectInstanceType(TurnUpdatesOnForObjectInstanceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseTypeType(TypeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unassociate Regions For Updates Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unassociate Regions For Updates Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseUnassociateRegionsForUpdatesType(UnassociateRegionsForUpdatesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unconditional Attribute Ownership Divestiture Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unconditional Attribute Ownership Divestiture Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseUnconditionalAttributeOwnershipDivestitureType(UnconditionalAttributeOwnershipDivestitureType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unpublish Interaction Class Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unpublish Interaction Class Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseUnpublishInteractionClassType(UnpublishInteractionClassType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unpublish Object Class Attributes Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unpublish Object Class Attributes Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseUnpublishObjectClassAttributesType(UnpublishObjectClassAttributesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unsubscribe Interaction Class Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unsubscribe Interaction Class Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseUnsubscribeInteractionClassType(UnsubscribeInteractionClassType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unsubscribe Interaction Class With Regions Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unsubscribe Interaction Class With Regions Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseUnsubscribeInteractionClassWithRegionsType(UnsubscribeInteractionClassWithRegionsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unsubscribe Object Class Attributes Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unsubscribe Object Class Attributes Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseUnsubscribeObjectClassAttributesType(UnsubscribeObjectClassAttributesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unsubscribe Object Class Attributes With Regions Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unsubscribe Object Class Attributes With Regions Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseUnsubscribeObjectClassAttributesWithRegionsType(UnsubscribeObjectClassAttributesWithRegionsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Update Attribute Values Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Update Attribute Values Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseUpdateAttributeValuesType(UpdateAttributeValuesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Update Rates Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Update Rates Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseUpdateRatesType(UpdateRatesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Update Rate Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Update Rate Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseUpdateRateType(UpdateRateType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Update Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Update Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseUpdateType(UpdateType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Upper Bound Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Upper Bound Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseUpperBoundType(UpperBoundType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseValueType(ValueType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variant Record Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variant Record Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseVariantRecordDataType(VariantRecordDataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variant Record Data Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variant Record Data Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseVariantRecordDataType1(VariantRecordDataType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variant Record Data Types Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variant Record Data Types Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseVariantRecordDataTypesType(VariantRecordDataTypesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variant Record Encoding Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variant Record Encoding Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseVariantRecordEncodingType(VariantRecordEncodingType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	public Object defaultCase(EObject object) {
		return null;
	}

} //_2010Switch
