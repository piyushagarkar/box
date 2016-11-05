package com.ninescript.test.oops.demo1;


/**
 * @author Piyush
 */


public class Bird extends Animal{
	public Bird(){
		
		super();
		System.out.println("A new Bird has been Created ");
	}

	public void sleep(){
		System.out.println("Bird Sleeps");
	}
	
	public void eat(){
		System.out.println("Bird eats");
	}
}
