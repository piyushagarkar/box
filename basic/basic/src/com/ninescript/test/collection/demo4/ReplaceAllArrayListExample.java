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
public class ReplaceAllArrayListExample {

	public static void main(String[] args) {
		
		ArrayList arrayList = new ArrayList();

		arrayList.add("A");
		arrayList.add("B");
		arrayList.add("A");
		arrayList.add("C");
		arrayList.add("D");

		System.out.println("ArrayList Contains : " + arrayList);
		
		Collections.replaceAll(arrayList, "A", "Replace All");
		
		System.out.println("After Replace All, ArrayList Contains : " + arrayList);
	

	}
}
