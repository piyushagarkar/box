package com.ninescript.test.oops.demo9;

/**
 * 
 * @author piyush
 *
 */
class ConstructorDemo3 {
	private int var;
	
	
	public ConstructorDemo3() {
		// I just this add Default Constructor to remove the Compile time Error
	
	}

	public ConstructorDemo3(int num) {
		var = num;
		
	}

	public int getValue() {
		return var;
	}

	public static void main(String args[]) {
		ConstructorDemo3 myobj = new ConstructorDemo3();
		System.out.println("value of var is: " + myobj.getValue());
	}
}
