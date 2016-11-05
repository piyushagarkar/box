package com.ninescript.finalKey;

/**
 * 
 * @author Piyush
 *
 */

/*
 * Final Variable is Re declared at constructor
 * Final Static is Re declared at Static Block
 */

public class BikeTo {  
	
	final int a;
	final static int b;
	
	  BikeTo(){
		a=10;
	  }
	
	static{
		b=50;
	}
	
	public static void main(String[] args) {
		System.out.println(new BikeTo().a);
		System.out.println(b);
	}
	
}
	
	


