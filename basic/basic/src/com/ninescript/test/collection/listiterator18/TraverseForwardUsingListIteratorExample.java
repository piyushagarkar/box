package com.ninescript.test.collection.listiterator18;

import java.util.ListIterator;
import java.util.ArrayList;

/**
 * 
 * @author piyush
 *
 */
public class TraverseForwardUsingListIteratorExample {

	public static void main(String[] args) {
		
		ArrayList arrayList = new ArrayList();
		
		arrayList.add("1");
		arrayList.add("2");
		arrayList.add("3");
		arrayList.add("4");
		
		
		ListIterator listIterator = arrayList.listIterator();
		
		System.out.println("Traversing ArrayList in forward direction using ListIterator");
		while(listIterator.hasNext())
			System.out.println(listIterator.next());
	}
	
}
