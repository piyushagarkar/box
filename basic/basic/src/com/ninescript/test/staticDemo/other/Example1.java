package com.ninescript.test.staticDemo.other;

/**
 * 
 * @author piyush
 *
 */
public class Example1 
{

	  static class X
	  {
	      static String str="Inside Class X";
	  }
	  
	  public static void main(String args[])
	  {
	      X.str="Inside Class Example1";
	      System.out.println("String stored in str is- "+ X.str);
	  }

}
