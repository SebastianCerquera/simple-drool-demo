package com.sample.candidate;

public class ProjectScore {
	
	private Double completeness;
	
	private Double architecture;
	
	private Double gui;

	public ProjectScore() {}
	
	public ProjectScore(Double completeness, Double architecture, Double gui) {
		this.completeness = completeness;
		this.architecture = architecture;
		this.gui = gui;
	}
	
	public Double getCompleteness() {
		return completeness;
	}

	public void setCompleteness(Double completeness) {
		this.completeness = completeness;
	}

	public Double getArchitecture() {
		return architecture;
	}

	public void setArchitecture(Double architecture) {
		this.architecture = architecture;
	}

	public Double getGui() {
		return gui;
	}

	public void setGui(Double gui) {
		this.gui = gui;
	}

}
