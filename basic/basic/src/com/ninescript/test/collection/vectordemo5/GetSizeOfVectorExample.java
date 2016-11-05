package com.ninescript.test.collection.vectordemo5;

import java.util.Vector;


/**
 * 
 * @author Piyush
 *
 */
public class GetSizeOfVectorExample {

	public static void main(String[] args) {
		
		Vector v = new Vector();
		
		v.add("1");
		v.add("2");
		v.add("3");

		int totalElements = v.size();
		
		System.out.println("Size Of Vector :" +totalElements);
		
		System.out.println("Vector contains...");
		
		
		for (int i = 0; i < totalElements; i++) {
			
			System.out.println(v.get(i));
		}
	}
}
