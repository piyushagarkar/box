/**
 * 
 */
package com.ninescript.test.collection.demo4;


import java.util.ArrayList;
import java.util.Collections;


/**
 * @author User 37
 *
 */
public class ReverseOrderArrayListExample {

	public static void main(String[] args) {
		
		ArrayList arrayList = new ArrayList();

		
		arrayList.add("A");
		arrayList.add("B");
		arrayList.add("C");
		arrayList.add("D");
		arrayList.add("E");

		System.out.println("Before Reverse Order, ArrayList Contains : " + arrayList);


		Collections.reverse(arrayList);

		System.out.println("After Reverse Order, ArrayList Contains : " + arrayList);

	}
}
