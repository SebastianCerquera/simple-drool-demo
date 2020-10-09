package com.utils;

import java.util.List;

/*
 * It seems that there is handle for each rule, to be able to update a rule a will nned to use the handle+
 * https://stackoverflow.com/questions/16169715/drools-java-update
 */

public interface Facts<E> {
	
	public void updateFacts(List<E> newFacts);

	public List<E> checkFacts();
}
