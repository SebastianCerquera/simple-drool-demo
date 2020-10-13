package com.sample.accounting;

import java.util.Date;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.google.common.base.Verify;
import com.utils.ComplexKieFacts;

/*
 * This scenario models the cashflow for a customer balance Account. It creates several facts that affect the account, 
 * it should update the balance using these	 facts.
 * 
 * There are several entities:
 * 
 * Account
 * CashFlow
 * AccountPeriod
 */

public class AccountComplexKie extends ComplexKieFacts<Account> {

	public List<Account> prepareFacts() {
		return Arrays.asList(new Account[] { new Account(1, 0.0), new Account(2, 500.0)});
	}

	@Override
	protected List<?> prepareUniverse() {
		List facts = new ArrayList();
		facts.add(new AccountPeriod(new Date(2019, 1, 1), new Date(2020, 1, 1)));
		facts.add(new CashFlow(CashFlowType.CREDIT, 1, new Date(2019, 5, 1), 100.0));
		facts.add(new CashFlow(CashFlowType.DEBIT, 2, new Date(2019, 6, 1), 100.0));
		return facts;
	}

	public List<Account> checkFacts() {
		List<Account> factors = super.checkFacts();

		Verify.verify(factors.get(0).getBalance() == 100.0);
		Verify.verify(factors.get(1).getBalance() == 400.0);

		return factors;
	}

}
