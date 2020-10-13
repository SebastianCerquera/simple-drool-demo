package com.javainuse.model;

import java.util.Arrays;
import java.util.List;

import com.google.common.base.Verify;
import com.utils.KieFacts;

/*
 * The scenario models a jewelry store that is implementing a series of discounts looking to	
 * attract new costumers, the offer applies over two kind of products:
 * 
 * If the product is made of gold  the discount should be a 25%
 * If the product is made of diamonds the discount should be a 15%
 * 
 * This implementation uses a KieSession to to hold the rules for the scenario. 
 */

public class CheckProductKie extends KieFacts<Product> {

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
