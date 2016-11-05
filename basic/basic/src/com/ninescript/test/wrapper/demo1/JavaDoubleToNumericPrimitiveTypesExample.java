package com.ninescript.test.wrapper.demo1;

public class JavaDoubleToNumericPrimitiveTypesExample {
	
	public static void main(String[] args) {
		
		Double dObj=new Double("12.03");
		
		byte b = dObj.byteValue();
		System.out.println(b);
		
		short s=dObj.shortValue();
		System.out.println(s);
		
		int i=dObj.intValue();
		System.out.println(i);
		
		float f =dObj.floatValue();
		System.out.println(f);

		double db=dObj.doubleValue();
				System.out.println(db);
	}

}
