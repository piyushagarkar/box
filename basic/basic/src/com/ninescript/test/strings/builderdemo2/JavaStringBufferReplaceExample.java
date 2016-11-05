package com.ninescript.test.strings.builderdemo2;

public class JavaStringBufferReplaceExample {

	public static void main(String[] args) {

		// Create the StringBuffer object
		StringBuffer sb = new StringBuffer("Hello World");
		System.out.println("Original Text : " + sb);

		sb.replace(0, 5, "Hi");
		System.out.println("Replaced Text : " + sb);

	}
}