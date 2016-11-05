package com.ninescript.test.collection.arraydemo3;

import java.util.*;

/**
 * 
 * @author Piyush
 *
 */

public class CompareLongArraysExample {
 
	public static void main(String[] args) {
		
		long [] longArray1 = new long [] {564, 4654, 6546,6464, 6546546,};
		long [] longArray2 = new long [] {564, 4654, 6546,6464, 6546546,};
	
		boolean longResult = Arrays.equals(longArray1, longArray2);
		System.out.println("Is two Long Arrays Are equle : " + longResult);
		
	}
}
