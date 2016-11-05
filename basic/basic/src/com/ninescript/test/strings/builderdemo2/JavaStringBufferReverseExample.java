package com.ninescript.test.strings.builderdemo2;

public class JavaStringBufferReverseExample {

	public static void main(String[] args) {

		// create StringBuffer object
		StringBuffer sb = new StringBuffer("Java StringBuffer Reverse Example");
		System.out.println("Original StringBuffer Content : " + sb);

		// To reverse the content of the StringBuffer use reverse method
		sb.reverse();
		System.out.println("Reversed StringBuffer Content : " + sb);
	}
}
