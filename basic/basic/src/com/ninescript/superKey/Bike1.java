package com.ninescript.superKey;

/**
 * 
 * @author Piyush
 *
 */

 /*
  * Super is invoked to parent class constructor 
  */
class Vehical1{

	Vehical1()
	{
		System.out.println("Vehical is running");
	}
}

public class Bike1 extends Vehical1{

	Bike1()
	{	
		super();
		//System.out.println("Bike Is running");
	}
	
	public static void main(String []asd){
		
		Bike1 B=new Bike1();
		
	
}

	
	
}
