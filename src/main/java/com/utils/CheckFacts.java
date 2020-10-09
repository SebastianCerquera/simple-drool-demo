package com.utils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.drools.core.RuleBase;
import org.drools.core.WorkingMemory;
import org.kie.api.runtime.rule.FactHandle;

public abstract class CheckFacts<E> implements Facts<E>{
	
	private WorkingMemory workingMemory;
	
	private Map<Integer, FactHandle> handles;
	
	public CheckFacts(RuleBase ruleBase) {
		this.workingMemory = ruleBase.newStatefulSession();
		
		handles = new HashMap<Integer, FactHandle>();
	}
	
	protected abstract List<E> prepareFacts();
	
	public void updateFacts(List<E> newFacts) {
		
		for(Object entity: newFacts) {
			FactHandle handle = handles.get(entity.hashCode());
			if(handle == null) {
				handle = this.workingMemory.insert(entity);
				handles.put(entity.hashCode(), handle);
			} else {
				this.workingMemory.update(handle, entity);
			}
		}
		
		workingMemory.fireAllRules();
	}
	
	public List<E> checkFacts() {
		List<E> entities = prepareFacts();
		updateFacts(entities);
		
		return entities;
	}

}
