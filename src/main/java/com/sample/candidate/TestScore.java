package com.sample.candidate;

public class TestScore {

	private Double theory;
	
	private Double syntax;
	
	private Double problemSolving;
	
	public TestScore() {}

	public TestScore(Double theory, Double syntax, Double problemSolving) {
		this.theory = theory;
		this.syntax = syntax;
		this.problemSolving = problemSolving;
	}

	public Double getTheory() {
		return theory;
	}

	public void setTheory(Double theory) {
		this.theory = theory;
	}

	public Double getSyntax() {
		return syntax;
	}

	public void setSyntax(Double syntax) {
		this.syntax = syntax;
	}

	public Double getProblemSolving() {
		return problemSolving;
	}

	public void setProblemSolving(Double problemSolving) {
		this.problemSolving = problemSolving;
	}
	
}
