package com.ninescript.test.oops.demo4;

/**
 * 
 * @author Piyush
 *
 */

class Animal1 {
	
	public static void testClassMethod() {
		
		System.out.println("The static method in Animal1");
	}

	public void testInstanceMethod() {
		
		System.out.println("The instance method in Animal1");
	}
}


public class Cat extends Animal1 {
	
	public static void testClassMethod() {
		
		System.out.println("The static method in Cat");
	}

	public void testInstanceMethod() {
		
		System.out.println("The instance method in Cat");
	}

	public static void main(String[] args) {
		
		Cat myCat = new Cat();
		Animal1 myAnimal = myCat;
		Animal1.testClassMethod();
		myAnimal.testInstanceMethod();
	}
}




