package com.ninescript.test.collection.linkedhashsetdemo16;

import java.util.LinkedHashSet;

public class RemoveSpecifiedElementFromLinkedHashSetExample {

	public static void main(String[] args) {
		
	
		LinkedHashSet lhashSet = new LinkedHashSet();
		
		lhashSet.add(new  Integer("1"));
		lhashSet.add(new  Integer("2"));
		lhashSet.add(new  Integer("3"));
		
		

		System.out.println("LinkedHashSet before removal : " + lhashSet);

		
			
		boolean blnRemoved = lhashSet.remove(new Integer("2"));
		System.out.println("Was 2 removed from LinkedHashSet ? " + blnRemoved);

		System.out.println("LinkedHashSet after removal : " + lhashSet);
	
		
	}
}
