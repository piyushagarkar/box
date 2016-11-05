package com.ninescript.accessModifiers;

/**
 * 
 * @author Piyush
 *
 */

class a// private class is not valid 
{
	 int data=40;//private member are accesble only in same class 
	 void  msg()
	{
		System.out.println("Hello piyush");
	}
}
 class PrivateUse {
	 

	public static void main(String[] args) 
	{
			a obj=new a();
			System.out.println(obj.data);
			obj.msg();
	}
}