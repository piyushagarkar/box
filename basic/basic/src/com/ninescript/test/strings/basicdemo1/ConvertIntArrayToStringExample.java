package com.ninescript.test.strings.basicdemo1;

import java.util.Arrays;

public class ConvertIntArrayToStringExample {

	public static void main(String args[]) {

		// int array
		int[] intNumbers = new int[] { 1, 2, 3, 4, 5 };

		

		// create new StringBuffer object
		StringBuffer sbfNumbers = new StringBuffer();

		// define the separator you want in the string. This example uses space.
		String strSeparator = " ";

		if (intNumbers.length > 0) {

			// we do not want leading space for first element
			sbfNumbers.append(intNumbers[0]);

			
			for (int i = 1; i < intNumbers.length; i++) {
				sbfNumbers.append(strSeparator).append(intNumbers[i]);
			}

		}

		System.out.println("int array converted to String using for loop");

		// finally convert StringBuffer to String using toString method
		System.out.println(sbfNumbers.toString());

		

		String strNumbers = Arrays.toString(intNumbers);

		System.out.println("String generated from Arrays.toString method: " + strNumbers);

		// you can use replaceAll method to replace brackets and commas
		
		strNumbers = strNumbers.replaceAll(", ", strSeparator).replace("[", "").replace("]", "");

		System.out.println("Final String: " + strNumbers);
	}
}
