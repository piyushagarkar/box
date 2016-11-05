package com.ninescript.test.collection.vectordemo5;

import java.util.Vector;
import java.util.ArrayList;

/**
 * 
 * @author Piyush
 *
 */

public class InsertAllElementsOfOtherCollectionToVectorExample {

	public static void main(String[] args) {
		
		Vector v = new Vector ();
		
		v.add("1");
		v.add("2");
		v.add("3");
		v.add("4");
	
			ArrayList arrayList = new ArrayList();
	
						arrayList.add("5");
						arrayList.add("6");
						
						v.addAll(1, arrayList);
						
						System.out.println("After inserting all elements of ArrayList at index 1, Vector contains..");
						  
						
							for (int i = 0; i < v.size();i++) {
								
								System.out.println(v.get(i));
								
								
								
							}
						
	}
}
