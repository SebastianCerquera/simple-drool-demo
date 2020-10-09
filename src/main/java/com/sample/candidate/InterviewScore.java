package com.sample.candidate;

public class InterviewScore {
	
	private Double speakExperience;
	
	private Double problemSolving;
	
	private Double communication;
	
	public InterviewScore() {}
	
	public InterviewScore(Double speakExperience, Double problemSolving, Double communication) {
		this.speakExperience = speakExperience;
		this.problemSolving = problemSolving;
		this.communication = communication;
	}

	public Double getSpeakExperience() {
		return speakExperience;
	}

	public void setSpeakExperience(Double speakExperience) {
		this.speakExperience = speakExperience;
	}

	public Double getProblemSolving() {
		return problemSolving;
	}

	public void setProblemSolving(Double problemSolving) {
		this.problemSolving = problemSolving;
	}

	public Double getCommunication() {
		return communication;
	}

	public void setCommunication(Double communication) {
		this.communication = communication;
	}

}
