package com.sample.model;

public class Factor {
	
	private Double value;
	private String rating = "";
	
	public Factor() {}
	
	public Factor(Double value) {
		this.value = value;
	}

	public Double getValue() {
		return value;
	}

	public void setValue(Double value) {
		this.value = value;
	}
	
	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}
	
	public String getRange() {
		return null;
	}
	
	public void print() {
		System.out.println("Value: " + this.value);
		System.out.println("Rating: " + this.rating);
	}
}
