/*
 * generated by Xtext 2.12.0
 */
package com.cohesionforce.hla.dsl.serializer;

import com.cohesionforce.hla.dsl.omt.Accuracy;
import com.cohesionforce.hla.dsl.omt.AccuracyCondition;
import com.cohesionforce.hla.dsl.omt.Attribute;
import com.cohesionforce.hla.dsl.omt.Cardinality;
import com.cohesionforce.hla.dsl.omt.ComplexComponent;
import com.cohesionforce.hla.dsl.omt.ComplexDataType;
import com.cohesionforce.hla.dsl.omt.DataType;
import com.cohesionforce.hla.dsl.omt.Description;
import com.cohesionforce.hla.dsl.omt.Dimension;
import com.cohesionforce.hla.dsl.omt.DimensionRange;
import com.cohesionforce.hla.dsl.omt.DimensionSet;
import com.cohesionforce.hla.dsl.omt.DimensionSetMember;
import com.cohesionforce.hla.dsl.omt.EnumeratedDataType;
import com.cohesionforce.hla.dsl.omt.Enumeration;
import com.cohesionforce.hla.dsl.omt.FieldName;
import com.cohesionforce.hla.dsl.omt.HLAOMT_DIF_v1_3;
import com.cohesionforce.hla.dsl.omt.Interaction;
import com.cohesionforce.hla.dsl.omt.Lookahead;
import com.cohesionforce.hla.dsl.omt.Note;
import com.cohesionforce.hla.dsl.omt.NoteRef;
import com.cohesionforce.hla.dsl.omt.ObjectModel;
import com.cohesionforce.hla.dsl.omt.OmtPackage;
import com.cohesionforce.hla.dsl.omt.Position;
import com.cohesionforce.hla.dsl.omt.Resolution;
import com.cohesionforce.hla.dsl.omt.RoutingSpace;
import com.cohesionforce.hla.dsl.omt.SuperClass;
import com.cohesionforce.hla.dsl.omt.SuperInteraction;
import com.cohesionforce.hla.dsl.omt.TimeRepresentation;
import com.cohesionforce.hla.dsl.omt.Units;
import com.cohesionforce.hla.dsl.services.OmtGrammarAccess;
import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public abstract class AbstractOmtSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private OmtGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == OmtPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case OmtPackage.ACCURACY:
				sequence_Accuracy(context, (Accuracy) semanticObject); 
				return; 
			case OmtPackage.ACCURACY_CONDITION:
				sequence_AccuracyCondition(context, (AccuracyCondition) semanticObject); 
				return; 
			case OmtPackage.ATTRIBUTE:
				sequence_Attribute(context, (Attribute) semanticObject); 
				return; 
			case OmtPackage.CARDINALITY:
				sequence_Cardinality(context, (Cardinality) semanticObject); 
				return; 
			case OmtPackage.CLASS:
				sequence_Class(context, (com.cohesionforce.hla.dsl.omt.Class) semanticObject); 
				return; 
			case OmtPackage.COMPLEX_COMPONENT:
				sequence_ComplexComponent(context, (ComplexComponent) semanticObject); 
				return; 
			case OmtPackage.COMPLEX_DATA_TYPE:
				sequence_ComplexDataType(context, (ComplexDataType) semanticObject); 
				return; 
			case OmtPackage.DATA_TYPE:
				sequence_DataType(context, (DataType) semanticObject); 
				return; 
			case OmtPackage.DESCRIPTION:
				sequence_Description(context, (Description) semanticObject); 
				return; 
			case OmtPackage.DIMENSION:
				sequence_Dimension(context, (Dimension) semanticObject); 
				return; 
			case OmtPackage.DIMENSION_RANGE:
				sequence_DimensionRange(context, (DimensionRange) semanticObject); 
				return; 
			case OmtPackage.DIMENSION_SET:
				sequence_DimensionSet(context, (DimensionSet) semanticObject); 
				return; 
			case OmtPackage.DIMENSION_SET_MEMBER:
				sequence_DimensionSetMember(context, (DimensionSetMember) semanticObject); 
				return; 
			case OmtPackage.ENUMERATED_DATA_TYPE:
				sequence_EnumeratedDataType(context, (EnumeratedDataType) semanticObject); 
				return; 
			case OmtPackage.ENUMERATION:
				sequence_Enumeration(context, (Enumeration) semanticObject); 
				return; 
			case OmtPackage.FIELD_NAME:
				sequence_FieldName(context, (FieldName) semanticObject); 
				return; 
			case OmtPackage.HLAOMT_DIF_V1_3:
				sequence_HLAOMT_DIF_v1_3(context, (HLAOMT_DIF_v1_3) semanticObject); 
				return; 
			case OmtPackage.INTERACTION:
				sequence_Interaction(context, (Interaction) semanticObject); 
				return; 
			case OmtPackage.LOOKAHEAD:
				sequence_Lookahead(context, (Lookahead) semanticObject); 
				return; 
			case OmtPackage.NOTE:
				sequence_Note(context, (Note) semanticObject); 
				return; 
			case OmtPackage.NOTE_REF:
				sequence_NoteRef(context, (NoteRef) semanticObject); 
				return; 
			case OmtPackage.OBJECT_MODEL:
				sequence_ObjectModel(context, (ObjectModel) semanticObject); 
				return; 
			case OmtPackage.PARAMETER:
				sequence_Parameter(context, (com.cohesionforce.hla.dsl.omt.Parameter) semanticObject); 
				return; 
			case OmtPackage.POSITION:
				sequence_Position(context, (Position) semanticObject); 
				return; 
			case OmtPackage.RESOLUTION:
				sequence_Resolution(context, (Resolution) semanticObject); 
				return; 
			case OmtPackage.ROUTING_SPACE:
				sequence_RoutingSpace(context, (RoutingSpace) semanticObject); 
				return; 
			case OmtPackage.SUPER_CLASS:
				sequence_SuperClass(context, (SuperClass) semanticObject); 
				return; 
			case OmtPackage.SUPER_INTERACTION:
				sequence_SuperInteraction(context, (SuperInteraction) semanticObject); 
				return; 
			case OmtPackage.TIME_REPRESENTATION:
				sequence_TimeRepresentation(context, (TimeRepresentation) semanticObject); 
				return; 
			case OmtPackage.UNITS:
				sequence_Units(context, (Units) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     AccuracyCondition returns AccuracyCondition
	 *
	 * Constraint:
	 *     (accuracyCondition=STRING accuracyConditionNote=NoteRef?)
	 */
	protected void sequence_AccuracyCondition(ISerializationContext context, AccuracyCondition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Accuracy returns Accuracy
	 *
	 * Constraint:
	 *     (accuracy=STRING accuracyNote=NoteRef?)
	 */
	protected void sequence_Accuracy(ISerializationContext context, Accuracy semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ClassComponent returns Attribute
	 *     Attribute returns Attribute
	 *
	 * Constraint:
	 *     (
	 *         name=STRING 
	 *         nameNote=NoteRef? 
	 *         dataType=DataType? 
	 *         cardinality=Cardinality? 
	 *         units=Units? 
	 *         resolution=Resolution? 
	 *         accuracy=Accuracy? 
	 *         accuracyCondition=AccuracyCondition? 
	 *         (updateType=ATT_UpdateType updateTypeNote=NoteRef?)? 
	 *         (updateCondition=STRING updateConditionNote=NoteRef?)? 
	 *         (transferAccept=ATT_TransferAccept transferAcceptNote=NoteRef?)? 
	 *         (updateReflect=ATT_UpdateReflect updateReflectNote=NoteRef?)? 
	 *         description=Description? 
	 *         routingSpace=STRING?
	 *     )
	 */
	protected void sequence_Attribute(ISerializationContext context, Attribute semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Cardinality returns Cardinality
	 *
	 * Constraint:
	 *     (cardinality=STRING cardinalityNote=NoteRef?)
	 */
	protected void sequence_Cardinality(ISerializationContext context, Cardinality semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     OMTComponent returns Class
	 *     Class returns Class
	 *
	 * Constraint:
	 *     (
	 *         id=INT 
	 *         name=STRING 
	 *         note=NoteRef? 
	 *         isMOMClass=IsMOMClass? 
	 *         description=Description? 
	 *         components+=ClassComponent*
	 *     )
	 */
	protected void sequence_Class(ISerializationContext context, com.cohesionforce.hla.dsl.omt.Class semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ComplexComponent returns ComplexComponent
	 *
	 * Constraint:
	 *     (
	 *         position=Position? 
	 *         fieldName=FieldName 
	 *         dataType=DataType? 
	 *         cardinality=Cardinality? 
	 *         units=Units? 
	 *         resolution=Resolution? 
	 *         accuracy=Accuracy? 
	 *         accuracyCondition=AccuracyCondition?
	 *     )
	 */
	protected void sequence_ComplexComponent(ISerializationContext context, ComplexComponent semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     OMTComponent returns ComplexDataType
	 *     ComplexDataType returns ComplexDataType
	 *     TypeReference returns ComplexDataType
	 *
	 * Constraint:
	 *     (name=STRING note=NoteRef? (isMOMComplexDataType='TRUE' | isMOMComplexDataType='FALSE')? components+=ComplexComponent+)
	 */
	protected void sequence_ComplexDataType(ISerializationContext context, ComplexDataType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     DataType returns DataType
	 *
	 * Constraint:
	 *     ((refType=[TypeReference|STRING] | dataType=BASE_DATA_TYPE) dataTypeNode=NoteRef?)
	 */
	protected void sequence_DataType(ISerializationContext context, DataType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Description returns Description
	 *
	 * Constraint:
	 *     description=STRING
	 */
	protected void sequence_Description(ISerializationContext context, Description semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, OmtPackage.Literals.DESCRIPTION__DESCRIPTION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, OmtPackage.Literals.DESCRIPTION__DESCRIPTION));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getDescriptionAccess().getDescriptionSTRINGTerminalRuleCall_2_0(), semanticObject.getDescription());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     DimensionDomain returns DimensionRange
	 *     DimensionRange returns DimensionRange
	 *
	 * Constraint:
	 *     (minimum=STRING note=NoteRef? maximum=STRING?)
	 */
	protected void sequence_DimensionRange(ISerializationContext context, DimensionRange semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     DimensionSetMember returns DimensionSetMember
	 *
	 * Constraint:
	 *     value=STRING
	 */
	protected void sequence_DimensionSetMember(ISerializationContext context, DimensionSetMember semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, OmtPackage.Literals.DIMENSION_SET_MEMBER__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, OmtPackage.Literals.DIMENSION_SET_MEMBER__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getDimensionSetMemberAccess().getValueSTRINGTerminalRuleCall_2_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     DimensionDomain returns DimensionSet
	 *     DimensionSet returns DimensionSet
	 *
	 * Constraint:
	 *     (members+=DimensionSetMember+ note=NoteRef?)
	 */
	protected void sequence_DimensionSet(ISerializationContext context, DimensionSet semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Dimension returns Dimension
	 *
	 * Constraint:
	 *     (
	 *         name=STRING 
	 *         nameNote=NoteRef? 
	 *         (type=[TypeReference|STRING] | dataType=BASE_DATA_TYPE) 
	 *         typeNote=NoteRef? 
	 *         domain=DimensionDomain 
	 *         (units=STRING unitsNote=NoteRef?)? 
	 *         function=STRING 
	 *         functionNote=NoteRef?
	 *     )
	 */
	protected void sequence_Dimension(ISerializationContext context, Dimension semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     OMTComponent returns EnumeratedDataType
	 *     EnumeratedDataType returns EnumeratedDataType
	 *     TypeReference returns EnumeratedDataType
	 *
	 * Constraint:
	 *     (name=STRING note=NoteRef? (isMOMEnumeratedDataType='TRUE' | isMOMEnumeratedDataType='FALSE')? literals+=Enumeration+)
	 */
	protected void sequence_EnumeratedDataType(ISerializationContext context, EnumeratedDataType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Enumeration returns Enumeration
	 *
	 * Constraint:
	 *     (literal=STRING enumeratorNote=NoteRef? value=INT representationNote=NoteRef?)
	 */
	protected void sequence_Enumeration(ISerializationContext context, Enumeration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     FieldName returns FieldName
	 *
	 * Constraint:
	 *     (name=AnyString fieldNameNote=NoteRef?)
	 */
	protected void sequence_FieldName(ISerializationContext context, FieldName semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     HLAOMT_DIF_v1_3 returns HLAOMT_DIF_v1_3
	 *
	 * Constraint:
	 *     (name=AnyText version=AnyText type=AnyText objectModels+=ObjectModel+)
	 */
	protected void sequence_HLAOMT_DIF_v1_3(ISerializationContext context, HLAOMT_DIF_v1_3 semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     OMTComponent returns Interaction
	 *     Interaction returns Interaction
	 *
	 * Constraint:
	 *     (
	 *         id=INT 
	 *         name=STRING 
	 *         nameNote=NoteRef? 
	 *         type=ISRType 
	 *         typeNote=NoteRef? 
	 *         (isMOMInteraction='TRUE' | isMOMInteraction='FALSE')? 
	 *         description+=Description 
	 *         routingSpace=[RoutingSpace|STRING]? 
	 *         components+=InteractionComponent*
	 *     )
	 */
	protected void sequence_Interaction(ISerializationContext context, Interaction semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Lookahead returns Lookahead
	 *
	 * Constraint:
	 *     (units=STRING unitsNote=NoteRef? dataType=STRING typeNote=NoteRef? (operator=STRING operatorNote=NoteRef?)?)
	 */
	protected void sequence_Lookahead(ISerializationContext context, Lookahead semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     NoteRef returns NoteRef
	 *
	 * Constraint:
	 *     (refs+=INT refs+=INT*)
	 */
	protected void sequence_NoteRef(ISerializationContext context, NoteRef semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     OMTComponent returns Note
	 *     Note returns Note
	 *
	 * Constraint:
	 *     (ID=INT text=STRING)
	 */
	protected void sequence_Note(ISerializationContext context, Note semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, OmtPackage.Literals.NOTE__ID) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, OmtPackage.Literals.NOTE__ID));
			if (transientValues.isValueTransient(semanticObject, OmtPackage.Literals.NOTE__TEXT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, OmtPackage.Literals.NOTE__TEXT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getNoteAccess().getIDINTTerminalRuleCall_4_0(), semanticObject.getID());
		feeder.accept(grammarAccess.getNoteAccess().getTextSTRINGTerminalRuleCall_8_0(), semanticObject.getText());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ObjectModel returns ObjectModel
	 *
	 * Constraint:
	 *     (
	 *         name=STRING 
	 *         version=STRING 
	 *         type=MOD_Type? 
	 *         purpose=STRING? 
	 *         domain=STRING? 
	 *         sponsor=STRING? 
	 *         pocHonorific=STRING? 
	 *         pocFirstName=STRING? 
	 *         pocLastName=STRING? 
	 *         pocOrgName=STRING? 
	 *         pocPhone=STRING? 
	 *         pocEmail=STRING? 
	 *         modificationDate=TEXT? 
	 *         momVersion=STRING? 
	 *         timeRepresentation=TimeRepresentation? 
	 *         lookAhead=Lookahead? 
	 *         omtComponents+=OMTComponent*
	 *     )
	 */
	protected void sequence_ObjectModel(ISerializationContext context, ObjectModel semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     InteractionComponent returns Parameter
	 *     Parameter returns Parameter
	 *
	 * Constraint:
	 *     (
	 *         name=STRING 
	 *         nameNote=NoteRef? 
	 *         dataType=DataType? 
	 *         cardinality=Cardinality? 
	 *         units=Units? 
	 *         resolution=Resolution? 
	 *         accuracy=Accuracy? 
	 *         accuracyCondition=AccuracyCondition? 
	 *         description=Description?
	 *     )
	 */
	protected void sequence_Parameter(ISerializationContext context, com.cohesionforce.hla.dsl.omt.Parameter semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Position returns Position
	 *
	 * Constraint:
	 *     position=STRING
	 */
	protected void sequence_Position(ISerializationContext context, Position semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, OmtPackage.Literals.POSITION__POSITION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, OmtPackage.Literals.POSITION__POSITION));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getPositionAccess().getPositionSTRINGTerminalRuleCall_2_0(), semanticObject.getPosition());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Resolution returns Resolution
	 *
	 * Constraint:
	 *     (resolution=STRING resolutionNote=NoteRef?)
	 */
	protected void sequence_Resolution(ISerializationContext context, Resolution semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     OMTComponent returns RoutingSpace
	 *     RoutingSpace returns RoutingSpace
	 *
	 * Constraint:
	 *     (name=STRING note=NoteRef? dimensions+=Dimension*)
	 */
	protected void sequence_RoutingSpace(ISerializationContext context, RoutingSpace semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ClassComponent returns SuperClass
	 *     SuperClass returns SuperClass
	 *
	 * Constraint:
	 *     superClass=INT
	 */
	protected void sequence_SuperClass(ISerializationContext context, SuperClass semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, OmtPackage.Literals.SUPER_CLASS__SUPER_CLASS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, OmtPackage.Literals.SUPER_CLASS__SUPER_CLASS));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getSuperClassAccess().getSuperClassINTTerminalRuleCall_2_0(), semanticObject.getSuperClass());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     InteractionComponent returns SuperInteraction
	 *     SuperInteraction returns SuperInteraction
	 *
	 * Constraint:
	 *     ID=INT
	 */
	protected void sequence_SuperInteraction(ISerializationContext context, SuperInteraction semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, OmtPackage.Literals.SUPER_INTERACTION__ID) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, OmtPackage.Literals.SUPER_INTERACTION__ID));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getSuperInteractionAccess().getIDINTTerminalRuleCall_2_0(), semanticObject.getID());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     TimeRepresentation returns TimeRepresentation
	 *
	 * Constraint:
	 *     (
	 *         units=STRING 
	 *         unitsNote=NoteRef? 
	 *         min=STRING 
	 *         minNote=NoteRef? 
	 *         max=STRING 
	 *         maxNote=NoteRef? 
	 *         initial=STRING 
	 *         initialNote=NoteRef? 
	 *         dataType=STRING 
	 *         typeNote=NoteRef? 
	 *         (operators=STRING operatorsNote=NoteRef?)?
	 *     )
	 */
	protected void sequence_TimeRepresentation(ISerializationContext context, TimeRepresentation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Units returns Units
	 *
	 * Constraint:
	 *     (units=AnyString unitsNote=NoteRef?)
	 */
	protected void sequence_Units(ISerializationContext context, Units semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
