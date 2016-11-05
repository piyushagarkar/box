package com.ninescript.test.wrapper.demo1;

public class IntegerToNumericPrimitiveTypesExample {
	
	public static void main(String[] args) {
		
		
		Integer i=new Integer("10");
		
		byte  b=i.byteValue();
		System.out.println(b);

	short s=i.shortValue();
	System.out.println(s);
	
	long l=i.longValue();
	System.out.println(l);
	
	
	float f=i.floatValue();
			System.out.println(f);
	}

}
