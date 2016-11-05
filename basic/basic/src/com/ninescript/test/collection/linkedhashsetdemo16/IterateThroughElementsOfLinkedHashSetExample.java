package com.ninescript.test.collection.linkedhashsetdemo16;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class IterateThroughElementsOfLinkedHashSetExample {

	public static void main(String[] args) {
		
		LinkedHashSet lhashSet = new LinkedHashSet();
		
		lhashSet.add(new Integer("1"));
		lhashSet.add(new Integer("2"));
		lhashSet.add(new Integer("3"));
		
		Iterator itr = lhashSet.iterator();
		
		while (itr.hasNext()) 
			System.out.println(itr.next());
			
		
			
		
	}
}
