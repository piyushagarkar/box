package com.ninescript.test.collection.hashsetdemo12;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class CopyElementsOfHashSetToArrayExample {

	
	public static void main(String[] args) {
		
		HashSet hSet = new HashSet();
		
		
	
		hSet.add(new Integer("1"));
		hSet.add(new Integer("2"));
		hSet.add(new Integer("3"));
		
		Object [] arry = hSet.toArray();
		
		System.out.println("HashSet elements are copied into an Array. Now Array Contains..");
		for (int i = 0; i < arry.length; i++) {
			
			System.out.println(arry[i]);
		}
	}
}
