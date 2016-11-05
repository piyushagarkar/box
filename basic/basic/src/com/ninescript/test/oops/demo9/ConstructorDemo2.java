package com.ninescript.test.oops.demo9;

/**
 * 
 * @author Piyush
 *
 */
class ConstructorDemo2 {
	private int var;

	public ConstructorDemo2() {
		
		// code for default one
		var = 10;
	}

	public ConstructorDemo2(int num) {
		
		// code for parameterized one
		var = num;
	}

	public int getValue() {
		
		return var;
	}

	public static void main(String args[]) {
		
		ConstructorDemo2 obj2 = new ConstructorDemo2();
		System.out.println("var is: " + obj2.getValue());
	
	}
}







