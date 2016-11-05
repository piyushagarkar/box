package com.ninescript.test.strings.builderdemo2;


public class JavaStringBufferSubStringExample {

	public static void main(String[] args) {
		
		// create StringBuffer object
		StringBuffer sb = new StringBuffer("Java StringBuffer SubString Example");
		System.out.println("Original Text : " + sb);

	
		String strPart1 = sb.substring(5);
		System.out.println("Substring 1 : " + strPart1);

		
		String strPart2 = sb.substring(0, 17);
		System.out.println("Substring 2 : " + strPart2);

		

	}
}
