package com.ninescript.test.collection.vectordemo5;

import java.util.Vector;
/**
 * 
 * @author Piyush
 *
 */

public class RemoveElementFromVectorByIndexExample {

	public static void main(String[] args) {
		
		Vector v = new Vector();
		
		v.add("1");
		v.add("2");
		v.add("3");
		v.add("4");
		v.add("5");
		
		Object obj = v.remove(1);
		
		System.out.println(obj + " is removed from Vector");
		
		System.out.println("Vector contents after remove call...");
		
		for (int index = 0; index < v.size(); index++)
			System.out.println(v.get(index));

		
		v.removeElementAt(2);

		System.out.println("Vector contents after removeElementAt call...");
		
		for (int index = 0; index < v.size(); index++)
			System.out.println(v.get(index));

	}
}
