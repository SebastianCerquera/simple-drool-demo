package com.javainuse;

import java.io.IOException;

import org.drools.compiler.compiler.DroolsParserException;
import org.drools.core.RuleBase;

import com.javainuse.model.CheckProductFacts;
import com.utils.RulesLoader;

public class ProductTest {

	public static void main(String[] args) throws DroolsParserException,
			IOException {
		
		RulesLoader executor = new RulesLoader();
		RuleBase ruleBase =  executor.loadRule("/rules/ProductRules.drl");
		
		CheckProductFacts facts = new CheckProductFacts(ruleBase);
		facts.checkFacts();
	}

}