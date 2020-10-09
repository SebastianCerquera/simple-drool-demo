package com.javainuse.model;

import java.util.Arrays;
import java.util.List;

import com.google.common.base.Verify;
import com.utils.KieFacts;

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
