package com.utils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

import org.kie.api.runtime.rule.FactHandle;

public abstract class KieFacts<E> implements Facts<E>{
	
	private Map<Integer, FactHandle> handles;
	
	private KieSession kSession;
	
	public KieFacts() {
		handles = new HashMap<Integer, FactHandle>();
		
		KieServices ks = KieServices.Factory.get();
		KieContainer kContainer = ks.getKieClasspathContainer();
		
		//Get the session named kseesion-rule that we defined in kmodule.xml above.
		//Also by default the session returned is always stateful. 
		this.kSession = kContainer.newKieSession("ksession-rule");
	}
	
	protected abstract List<E> prepareFacts();
	
	public void updateFacts(List<E> newFacts) {
		for(Object entity: newFacts) {
			FactHandle handle = handles.get(entity.hashCode());
			if(handle == null) {
				handle = this.kSession.insert(entity);
				handles.put(entity.hashCode(), handle);
			} else {
				this.kSession.update(handle, entity);
			}
		}

		this.kSession.fireAllRules();
	}
	public List<E> checkFacts() {
		List<E> entities = prepareFacts();
		updateFacts(entities);
		
		return entities;
	}

}
