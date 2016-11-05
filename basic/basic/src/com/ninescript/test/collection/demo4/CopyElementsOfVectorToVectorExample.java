/**
 * 
 */
package com.ninescript.test.collection.demo4;

import java.util.Collections;
import java.util.Vector;

/**
 * @author piyush
 *
 */

public class CopyElementsOfVectorToVectorExample {

	public static void main(String[] args) {

		Vector v1 = new Vector();
		v1.add("1");
		v1.add("2");
		v1.add("3");


		Vector v2 = new Vector();
		v2.add("One");
		v2.add("Two");
		v2.add("Three");
		v2.add("Four");
		v2.add("Five");


		System.out.println("Befor Copy,  Second Vector Contains : " + v2);

		Collections.copy(v2, v1);


		System.out.println("After copy, Second Vector Contains : " + v2);


	}
}
