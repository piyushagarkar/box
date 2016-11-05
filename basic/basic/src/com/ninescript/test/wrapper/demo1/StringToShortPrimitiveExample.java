package com.ninescript.test.wrapper.demo1;

public class StringToShortPrimitiveExample {
	
	public static void main(String[] args) {
		
		String str = new String("10");

		
		short s = Short.parseShort(str);
		System.out.println(s);
	}

}
