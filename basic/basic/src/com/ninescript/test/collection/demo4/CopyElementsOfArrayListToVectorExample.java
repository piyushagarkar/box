/**
 * 
 */
package com.ninescript.test.collection.demo4;

import java.util.Vector;
import java.util.ArrayList;
import java.util.Collections;

/**
 * @author User 37
 *
 */

public class CopyElementsOfArrayListToVectorExample {

	public static void main(String[] args) {
		
		ArrayList arrayList = new ArrayList();
		
		arrayList.add("1");
		arrayList.add("4");
		arrayList.add("2");
		arrayList.add("5");
		arrayList.add("3");

		Vector v = new Vector();
		
		v.add("A");
		v.add("B");
		v.add("D");
		v.add("E");
		v.add("F");
		v.add("G");
		v.add("H");

		System.out.println("Befor Copy Vector Contains " + v);
		
		Collections.copy(v, arrayList);
		
	
		System.out.println("AfterCopy Vector Contains " + v);
	}
}
