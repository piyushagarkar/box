package com.ninescript.test.collection.vectordemo5;

import java.util.Vector;
import java.util.Collections;
/**
 * 
 * @author piyush
 *
 */
public class SortJavaVectorExample {

	public static void main(String[] args) {
		
		
		Vector v = new Vector();

			
				v.add("1");
				v.add("3");
				v.add("5");
				v.add("2");
				v.add("4");

			
				Collections.sort(v);

				
				System.out.println("Vector elements after sorting in ascending order : ");
				for (int i = 0; i < v.size(); i++)
					System.out.println(v.get(i));

			
	}
}
