package com.ninescript.test.strings.basicdemo1;


/**
 * 
 * @author Piyush
 *
 */

public class RemoveLeadingTrailingSpace {

	public static void main(String[] args) {

		String str = "   String Trim Example   ";

		

		String strTrimmed = str.trim();

		System.out.println("Original String is: " + str);
		System.out.println("Removed Leading and trailing space");
		System.out.println("New String is: " + strTrimmed);
	}
}