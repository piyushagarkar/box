package com.ninescript.test.strings.builderdemo2;

public class JavaStringBufferAppendNewLineExample {
	
	public static void main(String args[]) {
		
		StringBuffer sbf = new StringBuffer("This is the first line.");
		sbf.append(System.getProperty("line.separator"));
		sbf.append("This is second line.");

		System.out.println(sbf);

	}
}