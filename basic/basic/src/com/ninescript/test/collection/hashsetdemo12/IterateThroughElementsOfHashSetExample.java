package com.ninescript.test.collection.hashsetdemo12;

import java.util.HashSet;
import java.util.Iterator;

public class IterateThroughElementsOfHashSetExample {

	public static void main(String[] args) {
		
		HashSet hSet = new HashSet();
		
		hSet.add(new Integer("1"));
		hSet.add(new Integer("2"));
		hSet.add(new Integer("3"));

		System.out.println(hSet);
		
		Iterator itr = hSet.iterator();
		
		System.out.println("Hash Contains ");
		while (itr.hasNext())
			System.out.println(itr.next());
	}
}
