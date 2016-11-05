/**
 * 
 */
package com.ninescript.test.collection.listiterator18;

import java.util.ArrayList;
import java.util.ListIterator;

/**
 * @author User 37
 *
 */
public class TraverseReverseUsingListIteratorExample {

	public static void main(String[] args) {
		
		ArrayList arrayList = new ArrayList();
		
		arrayList.add("1");
		arrayList.add("2");
		arrayList.add("3");
		arrayList.add("4");
		arrayList.add("5");
		
		ListIterator listIterator = arrayList.listIterator();
		
		System.out.println("Traversing ArrayList in forward direction  using ListIterator");
		while(listIterator.hasNext())
			System.out.println(listIterator.next());
				
	}
}
