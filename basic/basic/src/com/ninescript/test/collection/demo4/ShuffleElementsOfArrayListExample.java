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
public class ShuffleElementsOfArrayListExample {

	public static void main(String[] args) {


		ArrayList arrayList = new ArrayList();


		arrayList.add("A");
		arrayList.add("B");
		arrayList.add("C");
		arrayList.add("D");
		arrayList.add("E");

		System.out.println("Before shuffling, ArrayList contains : " + arrayList);



		Collections.shuffle(arrayList);

		System.out.println("After shuffling, ArrayList contains : " + arrayList);

	}
}

