/**
 * 
 */
package com.ninescript.test.collection.vectordemo5;

import java.util.Vector;

/**
 * @author Piyush
 *
 */
public class SetSizeOfJavaVectorExample {
	
	public static void main(String[] args) {
	
		Vector v = new Vector();
		
			v.add("1");
			v.add("2");
			v.add("3");
			v.add("4");
			v.add("5");

			v.setSize(3);
			
			System.out.println("Vector elements after setting size to 3");
			for (int index = 0; index < v.size(); index++)
				System.out.println(v.get(index));

		
			v.setSize(5);

			
			System.out.println("Vector elements after setting size to 5");
			for (int index = 0; index < v.size(); index++)
				System.out.println(v.get(index));

			
	}

}
