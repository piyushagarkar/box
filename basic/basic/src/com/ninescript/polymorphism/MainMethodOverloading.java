package com.ninescript.polymorphism;

/**
 * 
 * @author Piyush
 *
 */

public class MainMethodOverloading {

	
	public static void main()
	
	{
		System.out.println("NUll Main method");
	}

	public static void main(String asd)
	{
		System.out.println("IN Parameter Sting"+"  "+asd);
	}

	
	public static void main(int a)
	{
		System.out.println("IN Prameter"+"  "+a);
	
		//MainMethodOverloading m=new MainMethodOverloading();
		//main(10);
		//main("Piyush");
		
	}
	
	public static void main(String asd[])
	{
		
		main(10);
		//main();
		//main("Piyush");
		//System.out.println("IN Parameter");
	
		
	}

				
	
}


