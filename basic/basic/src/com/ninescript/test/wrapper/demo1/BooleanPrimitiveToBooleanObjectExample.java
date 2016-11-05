package com.ninescript.test.wrapper.demo1;
/**
 * 
 * @author Piyush
 *
 */

public class BooleanPrimitiveToBooleanObjectExample {

	public static void main(String[] args) {
		
		boolean b=true;
		
		//By Using Constructor
		Boolean b1=new Boolean(b);
		System.out.println(b1);

		//using ValueOf method of boolean
		Boolean b2= Boolean.valueOf(b);
		System.out.println(b2);
	}
}
