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
public class BinarySearchArrayListExample {

	public static void main(String[] args) {

		ArrayList arrayList = new ArrayList();

		arrayList.add("1");
		arrayList.add("4");
		arrayList.add("2");
		arrayList.add("5");
		arrayList.add("3");

		Collections.sort(arrayList);
		System.out.println("Sorted ArrayList contains : " + arrayList);

		int index = Collections.binarySearch(arrayList, "4");

		System.out.println("Element found at : " + index);


	}
}
