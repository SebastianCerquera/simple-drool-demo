package com.javainuse.model;

import java.util.Arrays;
import java.util.List;

import org.drools.core.RuleBase;
import org.drools.core.WorkingMemory;

import com.google.common.base.Verify;
import com.utils.CheckFacts;

/*
 * The scenario models a jewelry store that is implemented a series of discounts looking to	
 * attract new costumers, the promotion applies over two kind of products:
 * 
 * If the product is made of gold  the discount should be a 25%
 * If the prodcut is made of diamonds the disciunt should be a 15%
 * 
 * This implementation manually loads the rules from a file. 
 */

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
