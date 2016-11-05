package com.ninescript.test.collection.arraydemo3;

import java.util.Arrays;

public class CompareByteArraysExample {

	public static void main(String[] args) {
		
		byte [] bytArray1 = new byte [] {7, 25, 12 };
		byte [] bytArray2 = new byte [] {7, 25, 12 };
		
		boolean  bytResult = Arrays.equals(bytArray1, bytArray2 );
		System.out.println(bytResult);
	}
	
}
