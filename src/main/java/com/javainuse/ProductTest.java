package com.javainuse;

import java.io.IOException;

import org.drools.compiler.compiler.DroolsParserException;
import org.drools.core.RuleBase;

import com.javainuse.model.CheckProductFacts;
import com.utils.DroolsExecutor;

public class ProductTest {

	public static void main(String[] args) throws DroolsParserException,
			IOException {
		
		DroolsExecutor executor = new DroolsExecutor();
		RuleBase ruleBase =  executor.loadRule("/com/rule/ProductRules.drl");
		
		CheckProductFacts facts = new CheckProductFacts();
		facts.checkFacts(ruleBase);
	}

}