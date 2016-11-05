package com.ninescript.test.strings.basicdemo1;

public class JavaStringToStringArrayExample {

	public static void main(String args[]) {

		// String which we want to convert to String array
		String str = "Java String to String Array Example";

		

		String strArray[] = str.split(" ");

		System.out.println("String converted to String array");

		// print elements of String array
		for (int i = 0; i < strArray.length; i++) {
			System.out.println(strArray[i]);
		}
	}

}