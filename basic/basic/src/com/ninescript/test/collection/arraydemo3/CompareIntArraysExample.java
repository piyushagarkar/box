package com.ninescript.test.collection.arraydemo3;

import java.util.*;

/**
 * 
 * @author piyush
 *
 */

	public class CompareIntArraysExample {
		
		public static void main(String[] args) {
	
				int [] intArray1 = new int []{ 25, 54, 565, 245, 25,55};
				int [] intArray2 = new int []{ 25, 54, 565, 245, 25,55};	
				
				boolean intResult = Arrays.equals(intArray1, intArray2);
				System.out.println("IS the Two integers array are equle : " + intResult);
		
	}
}
