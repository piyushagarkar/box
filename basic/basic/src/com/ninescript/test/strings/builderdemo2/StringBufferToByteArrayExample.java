package com.ninescript.test.strings.builderdemo2;


public class StringBufferToByteArrayExample {

	public static void main(String[] args) {

		// create StringBuffer object
		StringBuffer sbf = new StringBuffer("Java StringBuffer To byte array example");

		
		byte bytes[] = sbf.toString().getBytes();

		System.out.println("StringBuffer converted to byte array");
	}
}
