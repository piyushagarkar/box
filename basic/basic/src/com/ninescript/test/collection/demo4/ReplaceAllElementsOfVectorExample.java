/**
 * 
 */
package com.ninescript.test.collection.demo4;

import java.util.Vector;
import java.util.Collections;

/**
 * @author User 37
 *
 */
public class ReplaceAllElementsOfVectorExample {

	public static void main(String[] args) {
		
		Vector v = new Vector();
		

		v.add("A");
		v.add("B");
		v.add("D");
		
		
		System.out.println("Before replacement, Vector contains : " + v);

		Collections.fill(v, "REPLACED");

		System.out.println("After replacement, Vector contains : " + v);

	}
}
