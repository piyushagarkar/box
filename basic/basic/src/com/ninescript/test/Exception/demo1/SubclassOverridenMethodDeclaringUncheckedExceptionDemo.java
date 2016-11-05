package com.ninescript.test.Exception.demo1;

import java.io.*;

 	class SuperClass1{
 		
 		void show(){
 			System.out.println("Parent Class");
 		}
 	}
 	
public class SubclassOverridenMethodDeclaringUncheckedExceptionDemo  extends SuperClass1{

	void show() throws ArrayIndexOutOfBoundsException   
	{
		System.out.println("Child Classs");
		
		
	}
	
	public static void main(String[] args) {
		
		SuperClass1 s = new SubclassOverridenMethodDeclaringUncheckedExceptionDemo();
		s.show();
		
	}
	
}
