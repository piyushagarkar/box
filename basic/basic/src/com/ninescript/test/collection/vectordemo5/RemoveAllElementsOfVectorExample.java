/**
 * 
 */
package com.ninescript.test.collection.vectordemo5;

import java.util.Vector;



/**
 * @author User 37
 *
 */
public class RemoveAllElementsOfVectorExample {

	public static void main(String[] args) {
		
		Vector v = new Vector();
		
		v.add("1");
		v.add("2");
		v.add("3");
		
		System.out.println("Size of Vector before removing elements : " + v.size());
		
		v.clear();
		
		System.out.println("Size of Vector after removing elements : " + v.size());

	}
}
