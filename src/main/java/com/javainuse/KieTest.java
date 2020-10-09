package com.javainuse;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

import com.javainuse.model.Product;

public class KieTest {

	public static final void main(String[] args) {

		try {
			KieServices ks = KieServices.Factory.get();
			KieContainer kContainer = ks.getKieClasspathContainer();
			
			//Get the session named kseesion-rule that we defined in kmodule.xml above.
			//Also by default the session returned is always stateful. 
			KieSession kSession = kContainer.newKieSession("ksession-rule");

			Product product = new Product();
			product.setType("gold");

			kSession.insert(product);
			kSession.fireAllRules();

			System.out.println(
					"The discount for the jewellery product " + product.getType() + " is " + product.getDiscount());

		} catch (Throwable t) {
			t.printStackTrace();
		}
	}
}
