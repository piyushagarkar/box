/**
 * 
 */
package com.ninescript.test.collection.demo4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Vector;


/**
 * @author User 37
 *
 */
public class CopyElementsOfVectorToArrayListExample {

	public static void main(String[] args) {
		
		Vector v = new Vector();
		
		v.add("1");
		v.add("2");
		v.add("3");
		
		ArrayList arrayList = new ArrayList();
		
		arrayList.add("One");
		arrayList.add("Two");
		arrayList.add("Three");
		arrayList.add("Four");
		arrayList.add("Five");

		System.out.println("Befor Copy ArrayList Contais "+ arrayList);
		
		Collections.copy(arrayList, v);
		
		System.out.println("After Copy ArrayList Contains " + arrayList);
	}
}
