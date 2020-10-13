package com.javainuse.model;

/*
 * Each jewelery product has 2 fields a type: the component that the jewel is made of and the discount.
 *  
 * The discount is modeled using a integer and the product using an string name.
 */

public class Product {

	private String type;
	private int discount;
	
	public Product() {}
	
	public Product(String type) {
		this.type = type;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getDiscount() {
		return discount;
	}

	public void setDiscount(int discount) {
		this.discount = discount;
	}

}