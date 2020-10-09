package com.utils;

import java.util.List;

import org.drools.core.RuleBase;
import org.drools.core.WorkingMemory;

public abstract class CheckFacts<E> implements Facts<E>{
	
	protected RuleBase ruleBase;
	
	public CheckFacts(RuleBase ruleBase) {
		this.ruleBase = ruleBase;
	}
	
	protected abstract List<E> prepareFacts();
	
	public List<E> checkFacts() {
		WorkingMemory workingMemory = this.ruleBase.newStatefulSession();

		List<E> entities = prepareFacts();
		for(Object entity: entities) {
			workingMemory.insert(entity);
		}

		workingMemory.fireAllRules();
		
		return entities;
	}

}
