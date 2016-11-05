package com.ninescript.test.collection.linkedhashsetdemo16;

import java.util.LinkedHashSet;


public class RemoveAllElementsFromLinkedHashSetExample {

	
	public static void main(String[] args) {
		
		LinkedHashSet lhashSet = new LinkedHashSet();
		
		lhashSet.add(new Integer("1"));
		lhashSet.add(new Integer("2"));
		lhashSet.add(new Integer("3"));
		
		System.out.println("Linked List Befor Removel "+ lhashSet);
		
		lhashSet.clear();
		
		System.out.println("Is LinkedHashSet empty ? " + lhashSet.isEmpty());
		
	}
}
