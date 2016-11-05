package com.ninescript.test.strings.basicdemo1;



public class JavaStringConcat {
	
	public static void main(String args[]) {
		/*
		 * String concatenation can be done in several ways in Java.
		 */

		String str1 = "Piyush ";
		String str2 = " Agarkar ";

		// 1. Using + operator
		String str3 = str1 + str2;
		System.out.println("String concat using + operator : " + str3);

		

		// 2. Using String.concat() method
		String str4 = str1.concat(str2);
		System.out.println("String concat using String concat method : " + str4);

		// 3. Using StringBuffer.append method
		String str5 = new StringBuffer().append(str1).append(str2).toString();
		System.out.println("String concat using StringBuffer append method : " + str5);
	}

}
