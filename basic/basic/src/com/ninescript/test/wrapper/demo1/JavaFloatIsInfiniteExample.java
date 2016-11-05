package com.ninescript.test.wrapper.demo1;

public class JavaFloatIsInfiniteExample {
	
	public static void main(String[] args) {
		
		float f= (float)1/0;
		boolean b1=Float.isInfinite(f);
		System.out.println(b1);
	
		Float fObj = new Float(f);
		boolean b2 = fObj.isInfinite();
		System.out.println(b2);

	
	}

}
