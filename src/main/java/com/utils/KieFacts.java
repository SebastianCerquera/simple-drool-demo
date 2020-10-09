package com.utils;

import java.util.List;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

public abstract class KieFacts<E> implements Facts<E>{
	
	private KieSession kSession;
	
	public KieFacts() {
		KieServices ks = KieServices.Factory.get();
		KieContainer kContainer = ks.getKieClasspathContainer();
		
		//Get the session named kseesion-rule that we defined in kmodule.xml above.
		//Also by default the session returned is always stateful. 
		this.kSession = kContainer.newKieSession("ksession-rule");
	}
	
	protected abstract List<E> prepareFacts();
	
	public void updateFacts(List<E> newFacts) {
		for(Object entity: newFacts) {
			this.kSession.insert(entity);
		}
	}
	public List<E> checkFacts() {
		List<E> entities = prepareFacts();
		updateFacts(entities);

		this.kSession.fireAllRules();
		
		return entities;
	}

}
