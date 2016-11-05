package com.ninescript.test.collection.hashsetdemo12;

import java.util.HashSet;


public class RemoveAllElementsFromHashSetExample {

	public static void main(String[] args) {
		
	
			HashSet hSet = new HashSet();


			hSet.add(new Integer("1"));
			hSet.add(new Integer("2"));
			hSet.add(new Integer("3"));

			System.out.println("HashSet before removal : " + hSet);
			
			hSet.clear();
			System.out.println("Hash SEt After Removal" + hSet.isEmpty());
			
	}

	
}