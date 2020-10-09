package com.sample.candidate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.google.common.base.Verify;
import com.utils.KieFacts;

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
		
		/* 
		InterviewScore interviewScore = new InterviewScore(1.0, 1.0, 1.0);
		candidate.setInterviewScore(interviewScore);
		candidate.setStatus("Interview");
		super.updateFacts(Arrays.asList(new Candidate[]{}));
		*/
		
		//Verify.verify(candidate.getStatus() == "Project");
		
		// setters
		
		//Verify.verify(candidate.getStatus() == "Hiring");
		
		return candidates;
	}

}
