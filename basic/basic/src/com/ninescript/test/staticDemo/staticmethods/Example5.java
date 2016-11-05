package com.ninescript.test.staticDemo.staticmethods;

public class Example5
{

	static int i;
	   static String s;
	   
	   
	   public static void main(String args[]) //Its a Static Method
	   {
	       Example5 obj=new Example5();
	       
	       //Static variables accessed using object obj
	       
	       System.out.println("i:"+obj.i);
	       System.out.println("s:"+obj.s);
	   }
	

}
