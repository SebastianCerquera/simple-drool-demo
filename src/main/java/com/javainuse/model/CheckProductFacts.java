package com.javainuse.model;

import java.util.Arrays;
import java.util.List;

import org.drools.core.RuleBase;
import org.drools.core.WorkingMemory;

import com.google.common.base.Verify;
import com.utils.CheckFacts;

public class CheckProductFacts extends CheckFacts<Product> {
	
	public CheckProductFacts(RuleBase ruleBase) {
		super(ruleBase);
	}
	
	public List<Product> prepareFacts(){
		return Arrays.asList(new Product[]{
			new Product("gold"),
			new Product("diamond"),
		});
	}
	
	public List<Product>  checkFacts() {
		List<Product> products = super.checkFacts();

		Verify.verify(products.get(0).getDiscount() == 25);
		Verify.verify(products.get(1).getDiscount() == 15);
		
		return products;
	}

}
