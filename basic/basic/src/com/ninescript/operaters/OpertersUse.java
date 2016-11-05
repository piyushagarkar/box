package com.ninescript.operaters;

/**
 * 
 * @author Piyush
 *
 */

public class OpertersUse {

	//use of arithmetic Operators
	
	public static void main(String[] args) {
		int b=100;				//Local variable
		System.out.println(b); 	//print Original Value
		int c = b++;			//post increment
		System.out.println(c);	
		c=++b;						//Per increment
		System.out.println(c);
		c=--b;						//post decrement
		System.out.println(c);
		c=b--;						//post decrement
		System.out.println(c);

	
	}
}
