package com.ninescript.test.wrapper.demo1;

public class JavaFloatIsNaNExample {
	
	public static void main(String[] args) {
		
		float f=(float)Math.sqrt(-10);
		boolean b=Float.isNaN(f);
		System.out.println(f);
		
		
		Float fObj = new Float(f);
		boolean b2 = fObj.isNaN();
		System.out.println(b2);
	
	}

}
