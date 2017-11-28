package com.cohesionforce.hla.dsl.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess2
import com.cohesionforce.hla.dsl.fom.AttributeClass
import com.cohesionforce.hla.dsl.fom.Fed

class HLAClassMapGenerator {
	
	def generateMap(Resource resource, IFileSystemAccess2 fsa) {
		
		fsa.generateFile(
			"com/cohesionforce/hla/HLAClassMap.java", '''
					
			package com.cohesionforce.hla;
			
			import java.util.Collection;
			import java.util.HashMap;
			import java.util.Map;
			
			import com.cohesionforce.hla.classes.*;
			import com.cohesionforce.hla.classes.avro.*;
			import com.cohesionforce.hla.classes.avro.Package;
			
			import hla.rti.RTIambassador;
			import hla.rti.RTIexception;
			import hla.rti.jlc.RtiFactory;

			public class HLAClassMap {
				
				private Map<Integer, AvroWrapper<?>> classMap = new HashMap<>();
				private Map<Integer, LogWriter<?>> writerMap = new HashMap<>();
				private Map<Integer, KafkaWriter<?>> kafkaMap = new HashMap<>();
				
				public void buildClassMap(RtiFactory factory, RTIambassador rtiamb, ThreadGroup threadGroup) {
					AvroWrapper<?> wrapper = null;
					LogWriter<?> writer = null;
					KafkaWriter<?> kafka = null;
					int classHandle = 0;
					
					«FOR fed: resource.contents.filter(Fed)»
						«FOR attrClass: fed.classes.filter(AttributeClass)»
						«attrClass.genClassInit»
						«ENDFOR»
					«ENDFOR»
				}
				
				public AvroWrapper<?> getWrapper(int index) {
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
	
	def CharSequence genClassInit(AttributeClass attributeClass) { '''
		try {
			wrapper = new «attributeClass.ref.name.strip»Class();
			classHandle = wrapper.init(factory, rtiamb);
			classMap.put(classHandle, wrapper);
			writer = new LogWriter<«attributeClass.ref.name.strip»>(threadGroup, "log/«attributeClass.ref.name.strip».avro", «attributeClass.ref.name.strip».getClassSchema());
			writerMap.put(classHandle, writer);
			kafka = new KafkaWriter<«attributeClass.ref.name.strip»>(threadGroup, "«attributeClass.ref.name.strip»", «attributeClass.ref.name.strip».getClassSchema());
			kafkaMap.put(classHandle, kafka);
		} catch(RTIexception e) {
			e.printStackTrace();
		}
		«FOR attrClass: attributeClass.classes.filter(AttributeClass)»
		«attrClass.genClassInit»
		«ENDFOR»
	'''
	}
	
	def String strip(String string) {
		return string.replace("\"","")
	}
	
	
}