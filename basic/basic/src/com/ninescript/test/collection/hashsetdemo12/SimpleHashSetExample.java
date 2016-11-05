package com.ninescript.test.collection.hashsetdemo12;

import java.util.HashSet;


public class SimpleHashSetExample {

	public static void main(String[] args) {
		
		HashSet hSet = new HashSet();

		hSet.add(5);
		hSet.add(new Integer("1"));
		hSet.add(new Integer("2"));
		hSet.add(new Integer("3"));

		
		System.out.println("HashSet contains.." + hSet);

		
	}
	
}
