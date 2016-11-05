package com.ninescript.test.wrapper.demo1;

public class FindAbsoluteValueExample {
	
	public static void main(String[] args) {
		
		int i=5;
		int j=-10;
		System.out.println("Absolute Value Of Integers");
		System.out.println("Absolute Value of integer  "+i+" is "+Math.abs(i));
		System.out.println("Absolute Value of integer  "+j+" is "+Math.abs(j));
		System.out.println();
	
		float f=23.23f;
		float f1=-23.22f;
		System.out.println("Absoulte Value of Float");
		System.out.println("Absolute Value of Float  "+f+" is "+Math.abs(f));
		System.out.println("Absolute Value of Float  "+f1+" is "+Math.abs(f1));
		System.out.println();
		
		long l=452748;
		long l1=-245252;
		System.out.println("Absoulte Value of Long");
		System.out.println("Absolute Value of Long  "+l+" is "+Math.abs(l));
		System.out.println("Absolute Value of Long  "+l1+" is "+Math.abs(l1));
		System.out.println();
	
		double d=245.544d;
		double d1=-455.555d;
		System.out.println("Absoulte Value of Double");
		System.out.println("Absolute Value of Double  "+d+" is "+Math.abs(d));
		System.out.println("Absolute Value of Double  "+d1+" is "+Math.abs(d1));
	}

}
