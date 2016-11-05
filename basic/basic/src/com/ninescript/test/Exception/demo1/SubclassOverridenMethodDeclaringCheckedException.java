package com.ninescript.test.Exception.demo1;

import java.io.*;

class SuperClass{
	
	void show(){
	
		System.out.println("Parent Class");
	}
}

public class SubclassOverridenMethodDeclaringCheckedException  extends SuperClass {
	
	void show() //throws IOException 
	{
		System.out.println("parent class");
	}

	public static void main(String[] args) {
		SuperClass s = new SubclassOverridenMethodDeclaringCheckedException();
		s.show();
	}
}
