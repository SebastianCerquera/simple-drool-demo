package com.utils;

import java.util.List;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

public abstract class KieFacts<E> implements Facts<E>{
	
	protected abstract List<E> prepareFacts();
	
	public List<E> checkFacts() {
		KieServices ks = KieServices.Factory.get();
		KieContainer kContainer = ks.getKieClasspathContainer();
		
		//Get the session named kseesion-rule that we defined in kmodule.xml above.
		//Also by default the session returned is always stateful. 
		KieSession kSession = kContainer.newKieSession("ksession-rule");

		List<E> entities = prepareFacts();
		for(Object entity: entities) {
			kSession.insert(entity);
		}

		kSession.fireAllRules();
		
		return entities;
	}

}
