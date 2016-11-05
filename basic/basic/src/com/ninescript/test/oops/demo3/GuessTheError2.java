package com.ninescript.test.oops.demo3;

/**
 * 
 * @author Piyush
 *
 */

class Sample5  {
	
	public double myMethod(int num1, int num2) {
		
		System.out.println("First myMethod of class Demo");
		return num1 + num2;
	}

	/**public int myMethod(int var1, int var2) {
		
		System.out.println("Second myMethod of class Demo");
		return var1 - var2;
	}**/
}

class GuessTheError2 {
	
	public static void main(String args[]) {
		
		Sample5 obj2 = new Sample5();
		obj2.myMethod(10, 10);
		//obj2.myMethod(20, 12);
	}
}

/**
 * Error is same as GuessThe Error 1
 * Doesn't matter what is return value in method overloading
 */
 
