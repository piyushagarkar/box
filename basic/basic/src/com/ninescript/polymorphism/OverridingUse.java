package com.ninescript.polymorphism;

/**
 * 
 * @author Piyush
 *
 */

public class OverridingUse {
	
		public void show()
	{
		System.out.println("In Null Method parameter");
	}
	
	public int show(int a)
	{
		System.out.println("From Single paramter method from class OverridingUse"+"  "+a);
		return(a);
	}

}
