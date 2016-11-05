package com.ninescript.test.strings.builderdemo2;


public class JavaStringBufferToStringExample {

	public static void main(String args[]) {

		// create StringBuffer object
		StringBuffer sbf = new StringBuffer("Hello World!");

		

		String str = sbf.toString();

		System.out.println("StringBuffer to String: " + str);
	}
}