package com.ninescript.test.collection.arraydemo3;

import java.util.Arrays;

/**
 * 
 * @author Piyush
 *
 */

public class CompareFloatArraysExample {

	public static void main(String[] args) {
		
		float [] floArray1 = new float [] {245.23f, 2546.2255f,322.22f, 355.22f};
		float [] floArray2 = new float [] {245.23f, 2546.2255f,322.22f, 355.22f};
		
		boolean floResult = Arrays.equals(floArray1, floArray2);
		System.out.println("IS the two float Arrays Are equles : " + floResult);
	
	}
}
