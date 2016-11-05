package com.ninescript.test.collection.linkedhashsetdemo16;

import java.util.LinkedHashSet;

public class CheckElementLinkedHashSetExample {

	public static void main(String[] args) {
		
		LinkedHashSet lhashSet = new LinkedHashSet();
		
		
		lhashSet.add(new Integer("1"));
		lhashSet.add(new Integer("2"));
		lhashSet.add(new Integer("3"));
		
		
		boolean blnExists = lhashSet.contains(new Integer("3"));
		System.out.println("3 exists in LinkedHashSet ? : " + blnExists);
	}
}
