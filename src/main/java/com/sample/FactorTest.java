package com.sample;

import java.io.IOException;

import org.drools.compiler.compiler.DroolsParserException;
import org.drools.core.RuleBase;

import com.sample.model.CheckFactorFacts;
import com.utils.RulesLoader;

public class FactorTest {

	public static void main(String[] args) throws DroolsParserException, IOException {

		RulesLoader executor = new RulesLoader();
		RuleBase ruleBase = executor.loadRule("/rules/FactorRules.drl");

		CheckFactorFacts facts = new CheckFactorFacts(ruleBase);
		facts.checkFacts();
	}

}
