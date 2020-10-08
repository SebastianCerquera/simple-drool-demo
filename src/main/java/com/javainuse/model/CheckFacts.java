package com.javainuse.model;

import java.util.Arrays;
import java.util.List;

import org.drools.core.RuleBase;
import org.drools.core.WorkingMemory;

import com.google.common.base.Verify;

public class CheckFacts {
	
	private List<Product> prepareFacts(){
		return Arrays.asList(new Product[]{
			new Product("gold"),
			new Product("diamond"),
		});
		
	}
	
	public WorkingMemory checkFacts(RuleBase ruleBase) {
		WorkingMemory workingMemory = ruleBase.newStatefulSession();

		List<Product> products = prepareFacts();
		for(Product product: products) {
			workingMemory.insert(product);
		}

		workingMemory.fireAllRules();
		
		Verify.verify(products.get(0).getDiscount() == 25);
		Verify.verify(products.get(1).getDiscount() == 15);
		
		return workingMemory;
	}

}
