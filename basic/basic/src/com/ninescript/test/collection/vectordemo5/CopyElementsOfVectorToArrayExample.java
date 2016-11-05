package com.ninescript.test.collection.vectordemo5;

import java.util.Vector;

/**
 * 
 * @author Piyush
 *
 */

public class CopyElementsOfVectorToArrayExample {

	public static void main(String[] args) {
		
		Vector v =new Vector();
		
		v.add("1");
		v.add("2");
		v.add("3");
		v.add("4");
		v.add("5");
		v.add("6");
		
		Object [] arrObj = new Object[6];
		v.copyInto(arrObj);
		
		System.out.println("Vector elements are copied into an Array. Now Array Contains..");
		   for (int i = 0; i < arrObj.length; i++) {
			System.out.println(arrObj[i]);
			
		}
		
		
	}
}
