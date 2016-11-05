package com.ninescript.test.collection.treesetdemo6;

import java.util.TreeSet;

/**
 * 
 * @author User 37
 *
 */
public class SimpleJavaTreeSetExample {

	public static void main(String[] args) {
		
		TreeSet tSet = new TreeSet();

		tSet.add(new Integer("1"));
		tSet.add(new Integer("2"));
		tSet.add(new Integer("3"));

		System.out.println("Tree Set Contain " + tSet);
		
	}
	
}
