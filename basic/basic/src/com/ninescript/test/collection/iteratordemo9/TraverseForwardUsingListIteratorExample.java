package com.ninescript.test.collection.iteratordemo9;

import java.util.ArrayList;
import java.util.ListIterator;


public class TraverseForwardUsingListIteratorExample {

	public static void main(String[] args) {
		
		ArrayList aList = new ArrayList();
		
		aList.add("1");
		aList.add("2");
		aList.add("3");
		aList.add("4");
		
		ListIterator listIterator = aList.listIterator();
		
		System.out.println("Traversing ArrayList in forward direction using ListIterator");
		while(listIterator.hasNext())
			System.out.println(listIterator.next());
		
	}
}
