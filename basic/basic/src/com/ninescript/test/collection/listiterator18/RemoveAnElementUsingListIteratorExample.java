/**
 * 
 */
package com.ninescript.test.collection.listiterator18;

import java.util.ListIterator;
import java.util.ArrayList;

/**
 * @author User 37
 *
 */
public class RemoveAnElementUsingListIteratorExample {

	public static void main(String[] args) {
		
		ArrayList aList = new ArrayList();

		
		aList.add("1");
		aList.add("2");
		aList.add("3");
		aList.add("4");
		aList.add("5");

		
		ListIterator listIterator = aList.listIterator();

		

		listIterator.next();
		listIterator.next();

				listIterator.remove();
		

		System.out.println("After removing 2, ArrayList contains");
		for (int intIndex = 0; intIndex < aList.size(); intIndex++)
			System.out.println(aList.get(intIndex));

	}
}
