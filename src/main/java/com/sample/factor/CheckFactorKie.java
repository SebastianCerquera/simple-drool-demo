package com.sample.factor;

import java.util.Arrays;
import java.util.List;

import com.google.common.base.Verify;
import com.utils.KieFacts;

public class CheckFactorKie extends KieFacts<Factor>{
	
	public List<Factor> prepareFacts() {
		return Arrays.asList(new Factor[]{
			new Factor(0.3),
			new Factor(1.0),
			new Factor(1.6),
			new Factor(2.0),
			new Factor(2.4)
		});
	}

	public List<Factor> checkFacts() {
		List<Factor> factors = super.checkFacts();

		Verify.verify(factors.get(0).getRating() == "Aaa+");
		Verify.verify(factors.get(1).getRating() == "Aaa");
		Verify.verify(factors.get(2).getRating() == "Aa1");
		Verify.verify(factors.get(3).getRating() == "Aa2");
		Verify.verify(factors.get(4).getRating() == "Aa3");
		
		return factors;
	}

}
