package com.ninescript.test.collection.vectordemo5;

import java.util.Vector;
import java.util.ArrayList;

/**
 * 
 * @author Piyush
 *
 */
public class AppendAllElementsOfOtherCollectionToVectorExample {

	public static void main(String[] args) {
		

			Vector v  = new Vector();
			
			v.add("1");
			v.add("2");
			v.add("3");
			
			ArrayList arrayList = new ArrayList();
			arrayList.add("4");
			arrayList.add("5");
			
			v.addAll(arrayList);
			   System.out.println("After appending all elements of ArrayList, Vector contains..");
			   for (int i = 0; i < v.size(); i++) {
				System.out.println(i);
				
				
			}
			
		
		
	}
	
}
