package com.ninescript.test.strings.basicdemo1;

public class JavaStringValueOfExample {

	public static void main(String args[]) {

	
		int i = 10;
		float f = 10.0f;
		long l = 10;
		double d = 10.0d;
		char c = 'a';
		boolean b = true;
		Object o = new String("Hello World");

		/* convert int to String */
		System.out.println(String.valueOf(i));
		
		/* convert float to String */
		System.out.println(String.valueOf(f));
		
		/* convert long to String */
		System.out.println(String.valueOf(l));
		
		/* convert double to String */
		System.out.println(String.valueOf(d));
		
		/* convert char to String */
		System.out.println(String.valueOf(c));
		
		/* convert boolean to String */
		System.out.println(String.valueOf(b));
		
		/* convert Object to String */
		System.out.println(String.valueOf(o));

	}

}
