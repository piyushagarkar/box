package com.ninescript.test.strings.basicdemo1;

import java.util.Arrays;


public class SortStringArrayExample {

	public static void main(String args[]) {

		// String array
		String[] strNames = new String[] { "John", "alex", "Chris", "williams", "Mark", "Bob" };

		

		// sort String array using sort method
		Arrays.sort(strNames);

		System.out.println("String array sorted (case sensitive)");

		// print sorted elements
		for (int i = 0; i < strNames.length; i++) {
			System.out.println(strNames[i]);
		}

		
		// case insensitive sort
		Arrays.sort(strNames);

		System.out.println("String array sorted (case insensitive)");
		
		// print sorted elements again
		for (int i = 0; i < strNames.length; i++) {
			System.out.println(strNames[i]);
		}

	}
}
