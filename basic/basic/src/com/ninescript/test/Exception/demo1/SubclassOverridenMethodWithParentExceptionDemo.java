package com.ninescript.test.Exception.demo1;

import java.io.*;

class SuperClass3{
	void show () throws ArithmeticException{
		
		System.out.println("parent Class");
		
	}
}

public class SubclassOverridenMethodWithParentExceptionDemo  extends SuperClass3{
	void show() //throws Exception // Compile time Error
	{
		System.out.println("child class");
	}

	public static void main(String[] args) {
		try {
			SuperClass3 s = new SubclassOverridenMethodWithParentExceptionDemo();
			s.show();
		} catch (Exception e) {
		}
	}
}
