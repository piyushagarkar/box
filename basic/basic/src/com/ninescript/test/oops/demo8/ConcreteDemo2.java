package com.ninescript.test.oops.demo8;

/**
 * 
 * @author Piyush
 *
 */

abstract class MyAbstractClass {
	
	public void DisplayMessage1() {
		
		System.out.println("Concrete method of abstract class");
	}

	abstract public void DisplayMessage2();
}

class ConcreteDemo2 extends MyAbstractClass {
	

	public static void main(String args[]) {
		
		ConcreteDemo2 obj = new ConcreteDemo2();
		obj.DisplayMessage2();
	}

	
	
	public void DisplayMessage2() {
		
		System.out.println("I'm overriding abstract method");
	}
}