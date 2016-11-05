/**
 * 
 */
package com.ninescript.test.collection.demo4;

import java.util.Collections;
import java.util.ArrayList;

/**
 * @author User 37
 *
 */

public class ReplaceAllElementsOfArrayListExample {

	public static void main(String[] args) {
		
		ArrayList arrayList = new ArrayList();
		
		arrayList.add("A");
		arrayList.add("B");
		arrayList.add("D");

		System.out.println("Before replacement, ArrayList contains : " + arrayList);


		Collections.fill(arrayList, "REPLACED");
		
		System.out.println("After replacement, ArrayList contains : " + arrayList);

	}
}
