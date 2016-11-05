package com.ninescript.test.strings.basicdemo1;

public class SearchStringExample {

	public static void main(String[] args) {
		// declare a String object
		String strOrig = "Hello world Hello World";

		
		int intIndex = strOrig.indexOf("Hello");

		if (intIndex == -1) {
			System.out.println("Hello not found");
		} else {
			System.out.println("Found Hello at index " + intIndex);
		}

	

		int positionIndex = strOrig.indexOf("Hello", 11);
		System.out.println("Index of Hello after 11 is " + positionIndex);

		int lastIndex = strOrig.lastIndexOf("Hello");
		System.out.println("Last occurrence of Hello is at index " + lastIndex);

	}
}