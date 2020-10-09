package com.sample.candidate;

public class Skill {

	private String name;
	
	private Integer yrsExperience;
	
	public Skill() {}
	
	public Skill(String name, Integer yrsExperience) {
		this.name = name;
		this.yrsExperience = yrsExperience;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getYrsExperience() {
		return yrsExperience;
	}

	public void setYrsExperience(Integer yrsExperience) {
		this.yrsExperience = yrsExperience;
	}
	
}
