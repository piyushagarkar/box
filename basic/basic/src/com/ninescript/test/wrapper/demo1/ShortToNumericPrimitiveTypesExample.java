package com.ninescript.test.wrapper.demo1;

public class ShortToNumericPrimitiveTypesExample {

	public static void main(String[] args) {
		
	
		Short sObj = new Short("10");
		
		byte b = sObj.byteValue();
		System.out.println(b);

		
		short s = sObj.shortValue();
		System.out.println(s);

		
		int i = sObj.intValue();
		System.out.println(i);

		
		float f = sObj.floatValue();
		System.out.println(f);

		
		double d = sObj.doubleValue();
		System.out.println(d);

		
		long l = sObj.longValue();
		System.out.println(l);

	}

}