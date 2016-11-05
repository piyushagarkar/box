/**
 * 
 */
package com.ninescript.test.collection.vectordemo5;

import java.util.Vector;
import java.util.ListIterator;


/**
 * @author User 37
 *
 */
public class IterateThroughVectorUsingListIteratorExample {

	public static void main(String[] args) {
		
		Vector v = new Vector();
		
		v.add("1");
		v.add("2");
		v.add("3");
		v.add("4");
		v.add("5");

		ListIterator itr = v. listIterator() ;
		
		System.out.println("Iterating through Vector elements in forward direction...");
		while (itr.hasNext())
			System.out.println(itr.next());

		
		System.out.println("Iterating through Vector elements in backward direction...");
		while (itr.hasPrevious())
			System.out.println(itr.previous());

	
		
		
	}
}
