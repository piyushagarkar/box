package com.ninescript.superKey;

/**
 * 
 * @author piyush
 *
 */
/*
 * Super is used to invoke parent class method
 */

class Person{

	void show()
	{
		System.out.println("Piyush");
	}
	
}	

class Student extends Person{
	
	void show()
	{
		System.out.println("Wel-come");
	}
	
	void display(){
		
		
		super.show();
	}
	
	public static void main(String [] sdfd){
		Student S=new Student ();
			S.display();
	
	}
}
