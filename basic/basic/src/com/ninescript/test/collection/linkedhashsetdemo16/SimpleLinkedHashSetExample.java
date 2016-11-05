package com.ninescript.test.collection.linkedhashsetdemo16;

import java.util.LinkedHashSet;

public class SimpleLinkedHashSetExample {

	public static void main(String[] args) {

		LinkedHashSet lhashSet = new LinkedHashSet();


		lhashSet.add(new Integer("1"));
		lhashSet.add(new Integer("2"));
		lhashSet.add(new Integer("3"));


		System.out.println("LinkedHashSet contains.." + lhashSet);  
	}
}


