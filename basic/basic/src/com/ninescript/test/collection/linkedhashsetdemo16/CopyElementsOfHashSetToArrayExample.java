package com.ninescript.test.collection.linkedhashsetdemo16;

import java.util.LinkedHashSet;

import org.w3c.dom.ls.LSException;


public class CopyElementsOfHashSetToArrayExample {

	
	public static void main(String[] args) {
		
		
		LinkedHashSet lhashSet = new LinkedHashSet();
		
		lhashSet.add(new Integer("1"));
		lhashSet.add(new Integer("2"));
		lhashSet.add(new Integer("3"));
		
		Object [] array = lhashSet.toArray();
		
		System.out.println("LinkedHashSet elements are copied into an Array. Now Array Contains..");
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
}


