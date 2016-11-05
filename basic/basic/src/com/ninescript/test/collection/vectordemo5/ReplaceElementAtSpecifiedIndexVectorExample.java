/**
 * 
 */
package com.ninescript.test.collection.vectordemo5;

import java.util.Vector;


/**
 * @author piyush
 *
 */
public class ReplaceElementAtSpecifiedIndexVectorExample {

	public static void main(String[] args) {
		
		Vector v = new Vector();
		
		v.add("1");
		v.add("2");
		v.add("3");
		v.add("4");
		
		v.set(1, "REPLACED ELEMENT");
		
		System.out.println("Vector contains...");
		
		for (int index = 0; index < v.size(); index++)
			System.out.println(v.get(index));

	}
}
