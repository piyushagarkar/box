package com.ninescript.test.strings.basicdemo1;

public class JavaStringArray {
	public static void main(String args[]) {

		
		String[] myFirstStringArray = new String[] { "String 1", "String 2", "String 3" };

		// first declare String array
		String[] mySecondStringArray = new String[3];

		

		// Now Assign individual String array elements
		mySecondStringArray[0] = "String 1";
		mySecondStringArray[1] = "String 2";
		mySecondStringArray[2] = "String 3";

	

		// this will retrieve second element of first String array
		System.out.println(myFirstStringArray[1]);

		// iterate the String array using loop
		for (int i = 0; i < mySecondStringArray.length; i++) {
			System.out.println(mySecondStringArray[i]);
		}
	}
}
