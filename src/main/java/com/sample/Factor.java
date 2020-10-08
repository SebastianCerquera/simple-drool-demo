package com.sample;

public class Factor {
	
	private float value;
	private String rating = "";

	public float getValue() {
		return value;
	}

	public void setValue(float value) {
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
