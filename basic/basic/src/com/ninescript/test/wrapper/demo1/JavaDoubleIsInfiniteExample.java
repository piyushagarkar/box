package com.ninescript.test.wrapper.demo1;

public class JavaDoubleIsInfiniteExample {
	
	public static void main(String[] args) {

		double d = (double) 4 / 0;
		boolean b1 = Double.isInfinite(d);
		System.out.println(b1);

	
		 
		Double dObj = new Double(d);
		boolean b2 = dObj.isInfinite();
		System.out.println(b2);

	}

}
