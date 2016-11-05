package com.ninescript.test.wrapper.demo1;

public class JavaFloatToNumericPrimitiveTypesExample {
	
	public static void main(String[] args) {
		
		Float f= new Float("21.32");
		// use byteValue method of Float class to convert it into byte type.
		byte b= f.byteValue();
		System.out.println(b);
		
		short s =f.shortValue();
		System.out.println(s);
		
		int i= f.intValue();
		System.out.println(i);
		
		long l= f.longValue();
		System.out.println(l);
		
		float f1=f.floatValue();
		System.out.println(f1);
		
		double d=f.doubleValue();
		System.out.println(d);
		
	}

}
