package com.ninescript.test.strings.builderdemo2;

public class StrinBufferResetExample {

	public static void main(String[] args) {

		// create StringBuffer object
		StringBuffer sbf = new StringBuffer("Hello World!");

		System.out.println("StringBuffer content: " + sbf);


		sbf.delete(0, sbf.length());

		System.out.println("StringBuffer content after reset:" + sbf);
	}
}

