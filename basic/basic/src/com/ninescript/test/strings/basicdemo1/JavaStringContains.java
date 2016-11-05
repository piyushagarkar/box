package com.ninescript.test.strings.basicdemo1;

public class JavaStringContains {
	public static void main(String args[]) {
		String str1 = "Hello World";
		String str2 = "Hello";

		
		boolean blnFound = str1.contains(str2);
		System.out.println("String contains another string? : " + blnFound);

		
	}
}