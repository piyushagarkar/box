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

public class SwapElementsOfArrayListExample {

	public static void main(String[] args) {


		ArrayList arrayList = new ArrayList();


		arrayList.add("A");
		arrayList.add("B");
		arrayList.add("C");
		arrayList.add("D");
		arrayList.add("E");

		System.out.println("Before swaping, ArrayList contains : " + arrayList);


		Collections.swap(arrayList, 0, 4);

		System.out.println("After swaping, ArrayList contains : " + arrayList);

	}
}


