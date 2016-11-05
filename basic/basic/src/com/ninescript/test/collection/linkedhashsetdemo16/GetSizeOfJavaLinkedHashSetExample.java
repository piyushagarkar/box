package com.ninescript.test.collection.linkedhashsetdemo16;

import java.util.LinkedHashSet;

public class GetSizeOfJavaLinkedHashSetExample {

	public static void main(String[] args) {
		
		LinkedHashSet lhashset = new LinkedHashSet ();
		
		lhashset.add(new Integer("1"));
		lhashset.add(new Integer("2"));
		lhashset.add(new Integer("3"));
		
		System.out.println("Size of LinkedHashSet after addition : " + lhashset.size());

	
		lhashset.remove(new Integer("1"));
		System.out.println("Size of LinkedHashSet after removal : " + lhashset.size());
	}
}
