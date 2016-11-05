package com.ninescript.test.strings.builderdemo2;

public class JavaStringBufferSetLengthExample {

	public static void main(String[] args) {

		// create StringBuffer object
		StringBuffer sbf = new StringBuffer("StringBuffer setLength method example");


		sbf.setLength(12);
		System.out.println("StringBuffer contents: " + sbf);

		sbf.setLength(0);
		System.out.println("StringBuffer contents deleted:" + sbf);

	}
}
