package com.ninescript.test.oops.demo8;

/**
 * 
 * @author Piyush
 *
 */

// Interface
interface Multiply {
	
	// abstract methods
	public abstract int multiplyTwo(int n1, int n2);

	
	int multiplyThree(int n1, int n2, int n3);

	
}

class AbstractDemo3 implements Multiply {
	
	public int multiplyTwo(int num1, int num2) {
		
		return num1 * num2;
	}

	public int multiplyThree(int num1, int num2, int num3) {
		
		return num1 * num2 * num3;
	}

	public static void main(String args[]) {
		
		AbstractDemo3 obj = new AbstractDemo3();
		System.out.println(obj.multiplyTwo(3, 7));
		System.out.println(obj.multiplyThree(1, 9, 0));
	}
}

