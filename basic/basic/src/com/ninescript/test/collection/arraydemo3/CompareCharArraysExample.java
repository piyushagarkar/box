package com.ninescript.test.collection.arraydemo3;

import java.util.Arrays;

/**
 * 
 * @author Piyush
 *
 */

public class CompareCharArraysExample {

	public static void main(String[] args) {
		
	
	char []  chrArray1 = new char [] {'d', 'f', 'g','a','o' }; 
	char []  chrArray2 = new char [] {'d', 'f', 'g','a','o' };

	boolean chrResult = Arrays.equals(chrArray1, chrArray2);
	System.out.println(chrResult);

	}

}