package com.ninescript.test.strings.basicdemo1;

import java.util.ArrayList;
import java.util.Arrays;


public class JavaStringToArrayList {
	public static void main(String args[]) {

		// String object having values, separated by ","
		String strNumbers = "1,2,3,4,5";

		String[] strValues = strNumbers.split(",");

		/*
		 * Use asList method of Arrays class to convert Java String array to
		 * ArrayList
		 */
		ArrayList<String> aListNumbers = new ArrayList<String>(Arrays.asList(strValues));

		System.out.println("Java String converted to ArrayList: " + aListNumbers);
	}
}
