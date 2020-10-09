package com.utils;

import java.util.List;

import org.drools.core.RuleBase;
import org.drools.core.WorkingMemory;

public abstract class CheckFacts<E> implements Facts<E>{
	
	private WorkingMemory workingMemory;
	
	public CheckFacts(RuleBase ruleBase) {
		this.workingMemory = ruleBase.newStatefulSession();
	}
	
	protected abstract List<E> prepareFacts();
	
	public void updateFacts(List<E> newFacts) {
		for(Object entity: newFacts) {
			workingMemory.insert(entity);
		}
	}
	
	public List<E> checkFacts() {
		List<E> entities = prepareFacts();
		updateFacts(entities);

		workingMemory.fireAllRules();
		
		return entities;
	}

}
