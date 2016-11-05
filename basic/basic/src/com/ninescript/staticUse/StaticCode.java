//Created By Piyush
package com.ninescript.staticUse;

public class StaticCode 
{
	static int a;//static variable or class variable
	
	static void m()//static method
	{
		System.out.println("This is Static Method");
	}
	
	
			{//Instates block
					System.out.println("Instaestion Block");//Each Time you create a object it will execute
			}
		
	void ma()//non static method
		{
			System.out.println("This is Non Static Block");
			
		}
		
			public static void main(String as[])//main method
			{
				System.out.println((StaticCode.a));
				m();
				//StaticCode s=new StaticCode();
				//StaticCode s1=new StaticCode();
				//s.ma();
				//s1.ma();
			}
}


