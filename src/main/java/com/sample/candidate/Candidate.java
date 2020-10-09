package com.sample.candidate;

public class Candidate {
	
	private Integer id;
	
	private String status;
	
	private Integer yrsExperience;
	
	private Skill skill;
	
	private TestScore testScore;
	
	private InterviewScore interviewScore;
	
	private ProjectScore projectScore;
	
	public Candidate(Integer id) {
		this.id = id;
	}
	
	public Candidate(Integer id, Integer yrsExperience, String status, Skill skill) {
		this(id);
		
		this.yrsExperience = yrsExperience;
		this.skill = skill;
		this.status = status;
	}

	public TestScore getTestScore() {
		return testScore;
	}

	public void setTestScore(TestScore testScore) {
		this.testScore = testScore;
	}

	public InterviewScore getInterviewScore() {
		return interviewScore;
	}

	public void setInterviewScore(InterviewScore interviewScore) {
		this.interviewScore = interviewScore;
	}

	public ProjectScore getProjectScore() {
		return projectScore;
	}

	public void setProjectScore(ProjectScore projectScore) {
		this.projectScore = projectScore;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Integer getYrsExperience() {
		return yrsExperience;
	}

	public void setYrsExperience(Integer yrsExperience) {
		this.yrsExperience = yrsExperience;
	}

	public Skill getSkill() {
		return skill;
	}

	public void setSkill(Skill skill) {
		this.skill = skill;
	}
	
	@Override
	public boolean equals(Object obj) {
		return this.id == ((Candidate) obj).id;
	}
	
	@Override
	public int hashCode() {
		return super.hashCode();
	}
	
}
