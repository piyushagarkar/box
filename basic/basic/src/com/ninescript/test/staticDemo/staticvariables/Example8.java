package com.ninescript.test.staticDemo.staticvariables;

public class Example8
{
	static int Var1 = 77; // Static integer variable
	String Var2;// non-static string variable

public static void main(String args[]) {
	
	Example8 ob1 = new Example8();
	Example8 ob2 = new Example8();
	
	ob1.Var1 = 88;
	ob1.Var2 = "I'm Object1";
	ob2.Var2 = "I'm Object2";
	
	System.out.println("ob1 integer:" + ob1.Var1);
	System.out.println("ob1 String:" + ob1.Var2);
	System.out.println("ob2 integer:" + ob2.Var1);
	System.out.println("ob2 STring:" + ob2.Var2);
}

}
