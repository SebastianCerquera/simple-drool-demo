package com.sample.candidate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.google.common.base.Verify;
import com.utils.KieFacts;

/*
 *  This use case models the hiring process for a software engineer. The scenario is stateful so the facts 
 *  are updated as the process goes on, these are the steps:
 * 
 * Check Experience
 * Coding Test
 * Coding Interview
 * Project Interview
 * 
 */

public class CheckCandidateKie extends KieFacts<Candidate>{
	
	public List<Candidate> prepareFacts() {
		List<Candidate> facts = new ArrayList<Candidate>();
		
		Skill javaSkill = new Skill("Java", 6);
		Candidate candidate = new Candidate(1, 11, "Submitted", javaSkill);
		
		facts.add(candidate);
		
		return facts;
	}

	public List<Candidate> checkFacts() {
		List<Candidate> candidates = super.checkFacts();
		
		Candidate candidate = candidates.get(0);
		Verify.verify(candidate.getStatus() == "Testing");
		
		// Checks the interview results
		TestScore testScore = new TestScore(1.0, 1.0, 1.0);
		candidate.setTestScore(testScore);
		super.updateFacts(Arrays.asList(new Candidate[]{
				candidate
		}));
		
		Verify.verify(candidate.getStatus() == "Interview");
		
		// Checks the interview results
		InterviewScore interviewScore = new InterviewScore(1.0, 1.0, 1.0);
		candidate.setInterviewScore(interviewScore);
		super.updateFacts(Arrays.asList(new Candidate[]{
				candidate
		}));
		
		Verify.verify(candidate.getStatus() == "Project");
		
		// Checks the project results
		ProjectScore projectScore = new ProjectScore(1.0, 1.0, 1.0);
		candidate.setProjectScore(projectScore);
		super.updateFacts(Arrays.asList(new Candidate[]{
				candidate
		}));
		
		Verify.verify(candidate.getStatus() == "Hiring");
		
		return candidates;
	}

}
