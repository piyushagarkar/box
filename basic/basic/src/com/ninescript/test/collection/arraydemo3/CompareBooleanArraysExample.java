package com.ninescript.test.collection.arraydemo3;

import java.util.Arrays;

/**
 * 
 * @author Piyush
 *
 */

public class CompareBooleanArraysExample {

	public static void main(String[] args) {
		
		
		boolean[] blnArray1 = new  boolean [] { true, false, true };
		boolean[] blnArray2 = new boolean[] { true, false, true };

		boolean blnResult = Arrays.equals(blnArray1, blnArray1);
		System.out.println(blnResult);
	
	}
	
}
