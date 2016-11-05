package com.ninescript.test.collection.arraydemo3;

import java.util.Arrays;

/**
 * 
 * @author Piyush
 *
 */

public class CompareShortArraysExample {

	public static void main(String[] args) {
		
		short [] shrtArray1 = new short [] {12,45,253,22};
		short [] shrtArray2 = new short [] {12,45,253,22};
		
		boolean shrtResult = Arrays.equals(shrtArray1, shrtArray2);
		System.out.println("Is the Two Short Arrays Are equles : "+ shrtResult);
	}
}
