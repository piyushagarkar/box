package com.ninescript.test.collection.vectordemo5;

import java.util.Vector;

/**
 * 
 * @author piyush
 *
 */

public class SearchAnElementInVectorExample {
	

	public static void main(String[] args) {
	

		
		Vector v = new Vector();

		
		v.add("1");
		v.add("2");
		v.add("3");
		v.add("4");
		v.add("5");
		v.add("1");
		v.add("2");

	
		
		boolean blnFound = v.contains("5");
		System.out.println("Does Vector contain 3 ? " + blnFound);
		
		int index=v.indexOf("5");
			if (  index  == -1)
				System.out.println("Vector does not contain 5");
			else
				System.out.println("Vector contains 5 at index :" + index);
			

			int lastIndex = v.lastIndexOf("2");
			
			if (lastIndex == -1)
				System.out.println("Vector does not contain 2");
			else
				System.out.println("Last occurrence of 2 in Vector is at index :" + lastIndex);

		
				
	
	}
	
}