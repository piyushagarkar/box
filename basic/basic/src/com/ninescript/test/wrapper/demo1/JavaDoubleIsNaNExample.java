package com.ninescript.test.wrapper.demo1;

public class JavaDoubleIsNaNExample {
	public static void main(String[] args) {

		
		double d = Math.sqrt(-10);
		boolean b1 = Double.isNaN(d);
		System.out.println(b1);

	
		Double dObj = new Double(d);
		boolean b2 = dObj.isNaN();
		System.out.println(b2);
	}

}
