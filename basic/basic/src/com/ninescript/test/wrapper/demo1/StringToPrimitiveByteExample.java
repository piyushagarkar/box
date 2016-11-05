package com.ninescript.test.wrapper.demo1;

public class StringToPrimitiveByteExample {

	public static void main(String[] args) {
	
		String str = new String("10");

	
		byte b = Byte.parseByte(str);
		System.out.println(b);
	}
}
