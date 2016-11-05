package com.ninescript.test.collection.treesetdemo6;

import java.util.TreeSet;


public class CheckValueOfTreeSetExample {

	public static void main(String[] args) {
		
		TreeSet tSet = new TreeSet();
		
		
		tSet.add("1");
		tSet.add("2");
		tSet.add("3");
		tSet.add("4");
		
		boolean blnExists = tSet.contains("3");
		System.out.println("3 exists in TreeSet: "+ blnExists);
		
	}
}
