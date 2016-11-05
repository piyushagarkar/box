package com.ninescript.test.collection.arraydemo3;

import java.util.Arrays;

/**
 * 
 * @author Piyush
 *
 */

public class CompareDoubleArraysExample {

	public static void main(String[] args) {
		
		double []  doubArray1 = new double [] {121.21,  654.21, 6546.121 ,454.23};
		double []  doubArray2 = new double [] {121.21,  654.21, 6546.121 ,454.23};
		
		
		boolean doubResult  = Arrays.equals(doubArray1, doubArray2);
		System.out.println("aAre two Double array are equles: " + doubResult);
		
	}
}
