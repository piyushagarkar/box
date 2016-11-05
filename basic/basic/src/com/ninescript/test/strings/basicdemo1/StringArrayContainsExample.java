package com.ninescript.test.strings.basicdemo1;

import java.util.Arrays;

public class StringArrayContainsExample {
	
	public static void main(String args[]) {

		// String array
		String[] strMonths = new String[] { "January", "February", "March", "April", "May" };

		// Strings to find
		String strFind1 = "March";
		String strFind2 = "December";

		

		boolean contains = false;

		// iterate the String array
		for (int i = 0; i < strMonths.length; i++) {

			// check if string array contains the string
			if (strMonths[i].equals(strFind1)) {

				// string found
				contains = true;
				break;

			}
		}

		if (contains) {
			System.out.println("String array contains String " + strFind1);
		} else {
			System.out.println("String array does not contain String " + strFind1);
		}

		

		contains = Arrays.asList(strMonths).contains(strFind1);
		System.out.println("Does String array contain " + strFind1 + "? " + contains);

		contains = Arrays.asList(strMonths).contains(strFind2);
		System.out.println("Does String array contain " + strFind2 + "? " + contains);

	}

}
