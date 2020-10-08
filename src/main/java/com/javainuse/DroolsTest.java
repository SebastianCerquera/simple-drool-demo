package com.javainuse;

import java.io.IOException;

import org.drools.compiler.compiler.DroolsParserException;
import org.drools.core.RuleBase;

import com.javainuse.model.CheckFacts;
import com.utils.DroolsExecutor;

public class DroolsTest {

	public static void main(String[] args) throws DroolsParserException,
			IOException {
		
		DroolsExecutor executor = new DroolsExecutor();
		RuleBase ruleBase =  executor.loadRule("/com/rule/Rules.drl");
		
		CheckFacts facts = new CheckFacts();
		facts.checkFacts(ruleBase);
	}

}