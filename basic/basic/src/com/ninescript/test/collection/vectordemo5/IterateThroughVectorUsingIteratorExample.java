package com.ninescript.test.collection.vectordemo5;

import java.util.Vector;
import java.util.Iterator;

/**
 * 
 * @author Piyush
 *
 */
public class IterateThroughVectorUsingIteratorExample {

	public static void main(String[] args) {
		
		Vector v = new Vector();
		v.add("1");
		v.add("2");
		v.add("3");
		v.add("4");
		v.add("5");
		
		Iterator itr = v.iterator();
		
		System.out.println("Iterating through Vector elements...");
		while (itr.hasNext())
			System.out.println(itr.next());

		
		
	}
}
