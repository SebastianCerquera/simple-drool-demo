package com.utils;

import java.util.List;

public interface Facts<E> {
	
	public void updateFacts(List<E> newFacts);

	public List<E> checkFacts();
}
