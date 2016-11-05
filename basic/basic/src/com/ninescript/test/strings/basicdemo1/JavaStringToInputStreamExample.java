package com.ninescript.test.strings.basicdemo1;

import java.io.ByteArrayInputStream;
import java.io.InputStream;


public class JavaStringToInputStreamExample {
	public static void main(String args[]) {

		String str1 = "Java convert String to InputStream Example";

		// convert string to bytes first using getBytes method of String class.
		byte[] bytes = str1.getBytes();



		InputStream inputStream = new ByteArrayInputStream(bytes);
	}
}
