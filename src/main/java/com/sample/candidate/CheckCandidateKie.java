package com.sample.candidate;

import java.util.ArrayList;
import java.util.List;

import com.google.common.base.Verify;
import com.utils.KieFacts;

public class CheckCandidateKie extends KieFacts<Candidate>{
	
	public List<Candidate> prepareFacts() {
		List<Candidate> facts = new ArrayList<Candidate>();
		
		Skill javaSkill = new Skill("Java", 6);
		Candidate candidate = new Candidate(11, "Submitted", javaSkill);
		
		facts.add(candidate);
		
		return facts;
	}

	public List<Candidate> checkFacts() {
		List<Candidate> candidates = super.checkFacts();

		Verify.verify(candidates.get(0).getStatus() == "Testing");
		
		return candidates;
	}

}
