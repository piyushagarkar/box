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
public class BinarySearchVectorExample {

	public static void main(String[] args) {
		
		Vector v = new Vector();
		
		
				v.add("A");
				v.add("B");
				v.add("D");
				v.add("E");
				v.add("F");

				Collections.sort(v);
				System.out.println("Sorted Vector contains : " + v);
				
				int index = Collections.binarySearch(v, "D");
				

				System.out.println("Element found at : " + index);
			
	}
}
