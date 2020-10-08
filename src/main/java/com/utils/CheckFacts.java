package com.utils;

import java.util.List;

import org.drools.core.RuleBase;
import org.drools.core.WorkingMemory;

public abstract class CheckFacts<E> {
	
	protected abstract List<E> prepareFacts();
	
	public List<E> checkFacts(RuleBase ruleBase) {
		WorkingMemory workingMemory = ruleBase.newStatefulSession();

		List<E> entities = prepareFacts();
		for(Object entity: entities) {
			workingMemory.insert(entity);
		}

		workingMemory.fireAllRules();
		
		return entities;
	}

}
