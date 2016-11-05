/**
 * 
 */
package com.ninescript.test.collection.comparatordemo11;


import java.util.Vector;
import java.util.Enumeration;

/**
 * @author User 37
 *
 */


public class EnumerateThroughVectorExample {

	public static void main(String[] args) {

		Vector v = new Vector();


		v.add("One");
		v.add("Two");
		v.add("Three");
		v.add("Four");


		Enumeration e = v.elements();



		System.out.println("Elements of the Vector are : ");

		while (e.hasMoreElements())
			System.out.println(e.nextElement());
	}
}

