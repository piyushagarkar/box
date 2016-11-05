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
public class ReplaceAllVectorExample {

	public static void main(String[] args) {
		
		Vector v = new Vector();

		
		v.add("A");
		v.add("B");
		v.add("A");
		v.add("C");
		v.add("D");

		System.out.println("Vector Contains : " + v);


		Collections.replaceAll(v, "A", "Piyush");

		System.out.println("After Replace All, Vector Contains : " + v);
	
	}
}
