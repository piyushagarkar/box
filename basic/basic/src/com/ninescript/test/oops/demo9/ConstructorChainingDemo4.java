package com.ninescript.test.oops.demo9;

/**
 * 
 * @author Piyush
 *
 */

class Human {
	
	String s1, s2;

	public Human() {
		
		s1 = "Super class";
		s2 = "Parent class";
	}

	public Human(String str) {
		
		s1 = str;
		s2 = str;
	}
}

class Boy extends Human {
	
	public Boy() {
		
	s2 = "Child class";
	}
	public Boy(String str) 
	{
		super(str);
	}

	public void disp() {
		
		System.out.println("String 1 is: " + s1);
		System.out.println("String 2 is: " + s2);
	}

}

class ConstructorChainingDemo4 {
	
	public static void main(String args[]) {
		
		Boy obj = new Boy();
		Boy obj1 = new Boy("Piyush");
		obj.disp();
		obj1.disp();
	}
}

