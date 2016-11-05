package com.ninescript.test.Exception.demo1;

class SuperClass2 {
	
	void show() throws Exception {
	
		System.out.println("parent class");
	}
}

public class SubclassOverridenMethodWithSameExceptionDemo extends SuperClass2 {
	
	void show() throws Exception
	{
		System.out.println("child class");
	}

	public static void main(String[] args) {
		try {
			
			SuperClass2 s = new SubclassOverridenMethodWithSameExceptionDemo();
			s.show();
		} 
		catch (Exception e) {
		
		}
	}
}
