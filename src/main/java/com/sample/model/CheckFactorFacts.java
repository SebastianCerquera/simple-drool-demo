package com.sample.model;

import java.util.Arrays;
import java.util.List;

import org.drools.core.RuleBase;

import com.google.common.base.Verify;
import com.utils.CheckFacts;

public class CheckFactorFacts extends CheckFacts<Factor>{

	public List<Factor> prepareFacts() {
		return Arrays.asList(new Factor[]{
			new Factor(0.3),
			new Factor(1.0),
			new Factor(1.6),
			new Factor(2.0),
			new Factor(2.4)
		});
	}

	public List<Factor> checkFacts(RuleBase ruleBase) {
		List<Factor> factors = super.checkFacts(ruleBase);

		Verify.verify(factors.get(0).getRating() == "Aaa+");
		Verify.verify(factors.get(1).getRating() == "Aaa");
		Verify.verify(factors.get(2).getRating() == "Aa1");
		Verify.verify(factors.get(3).getRating() == "Aa2");
		Verify.verify(factors.get(4).getRating() == "Aa3");
		
		return factors;
	}

}
