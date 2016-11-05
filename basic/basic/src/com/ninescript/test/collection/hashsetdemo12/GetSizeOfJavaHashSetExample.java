package com.ninescript.test.collection.hashsetdemo12;

import java.util.HashSet;

public class GetSizeOfJavaHashSetExample {

	public static void main(String[] args) {
		
		
		HashSet hSet = new HashSet();

		
		hSet.add(new Integer("1"));
		hSet.add(new Integer("2"));
		hSet.add(new Integer("3"));
		
		System.out.println("Size of HashSet after addition : " + hSet.size());

			
		hSet.remove(new Integer("2"));
		
		System.out.println("Size of HashSet after removal : " + hSet.size());
		
	}
}


