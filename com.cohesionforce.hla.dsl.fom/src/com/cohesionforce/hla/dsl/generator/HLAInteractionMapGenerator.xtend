package com.cohesionforce.hla.dsl.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess2
import com.cohesionforce.hla.dsl.fom.Fed
import com.cohesionforce.hla.dsl.fom.InteractionClass

class HLAInteractionMapGenerator {
	
	def generateMap(Resource resource, IFileSystemAccess2 fsa) {
		
		fsa.generateFile(
			"com/cohesionforce/hla/HLAInteractionMap.java", '''
					
			package com.cohesionforce.hla;
			
			import java.io.File;
			import java.util.Collection;
			import java.util.HashMap;
			import java.util.Map;
			
			import com.cohesionforce.hla.interactions.*;
			import com.cohesionforce.hla.interactions.avro.*;
			
			import hla.rti.RTIambassador;
			import hla.rti.RTIexception;
			import hla.rti.jlc.RtiFactory;

			public class HLAInteractionMap {
				
				private Map<Integer, AvroInteractionWrapper<?>> classMap = new HashMap<>();
				private Map<Integer, LogWriter<?>> writerMap = new HashMap<>();
				private Map<Integer, KafkaWriter<?>> kafkaMap = new HashMap<>();
				
				public void buildClassMap(RTIambassador rtiamb, ThreadGroup threadGroup) {
					
					File logDir = new File("log/interactions");
					logDir.mkdirs();
					
					AvroInteractionWrapper<?> wrapper = null;
					LogWriter<?> writer = null;
					KafkaWriter<?> kafka = null;
					int classHandle = 0;
					
					«FOR fed: resource.contents.filter(Fed)»
						«FOR intClass: fed.classes.filter(InteractionClass)»
						«intClass.genInteractionInit»
						«ENDFOR»
					«ENDFOR»
				}
				
				public AvroInteractionWrapper<?> getWrapper(int index) {
					return classMap.get(index);
				}
				
				public Collection<LogWriter<?>> getWriters() {
					return writerMap.values();
				}
				
				public LogWriter<?> getWriter(int index) {
					return writerMap.get(index);
				}

				public KafkaWriter<?> getKafka(int index) {
					return kafkaMap.get(index);
				}
			
				public Collection<KafkaWriter<?>> getKafkas() {
					return kafkaMap.values();
				}			
			}
			''')
	}
	
	def CharSequence genInteractionInit(InteractionClass interactionClass) { '''
		try {
			wrapper = new «interactionClass.ref.name.strip»Interaction();
			classHandle = wrapper.init(rtiamb);
			classMap.put(classHandle, wrapper);
			writer = new LogWriter<«interactionClass.ref.name.strip»>(threadGroup, "log/interactions/«interactionClass.ref.name.strip».avro", «interactionClass.ref.name.strip».getClassSchema());
			writerMap.put(classHandle, writer);
			kafka = new KafkaWriter<«interactionClass.ref.name.strip»>(threadGroup, "«interactionClass.ref.name.strip»", «interactionClass.ref.name.strip».getClassSchema());
			kafkaMap.put(classHandle, kafka);
		} catch(RTIexception e) {
			e.printStackTrace();
		}
		«FOR intClass: interactionClass.classes.filter(InteractionClass)»
		«intClass.genInteractionInit»
		«ENDFOR»
	'''
	}
	
	def String strip(String string) {
		return string.replace("\"","")
	}
	
	
}