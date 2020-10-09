package com.sample;

import java.io.IOException;

import org.drools.compiler.compiler.DroolsParserException;
import org.drools.core.RuleBase;

import com.sample.model.CheckFactorFacts;
import com.utils.DroolsExecutor;

public class FactorTest {

	public static void main(String[] args) throws DroolsParserException, IOException {

		DroolsExecutor executor = new DroolsExecutor();
		RuleBase ruleBase = executor.loadRule("/com/rule/FactorRules.drl");

		CheckFactorFacts facts = new CheckFactorFacts(ruleBase);
		facts.checkFacts();
	}

}
