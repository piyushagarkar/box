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
public class ReverseOrderVectorExample {

	public static void main(String[] args) {


		Vector v = new Vector();


		v.add("A");
		v.add("B");
		v.add("C");
		v.add("D");
		v.add("E");

		System.out.println("Before Reverse Order, Vector Contains : " + v);


		Collections.reverse(v);

		System.out.println("After Reverse Order, Vector Contains : " + v);


	}

}