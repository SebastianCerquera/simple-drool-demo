package com.sample.accounting;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.google.common.base.Verify;
import com.utils.ComplexKieFacts;

public class AccountComplexKie extends ComplexKieFacts<Account>{
	
	public List<Account> prepareFacts() {
		return Arrays.asList(new Account[]{
			new Account(1, 0.0),
		});
	}
	
	@Override
	protected List<?> prepareUniverse() {
		List facts = new ArrayList();
		facts.add(
				new AccountPeriod(
				   new Date(2019, 1, 1),
				   new Date(2020, 1, 1)
				)
			);
		return facts;
	}

	public List<Account> checkFacts() {
		List<Account> factors = super.checkFacts();

		Verify.verify(factors.get(0).getBalance() == 0);
		
		return factors;
	}


}
