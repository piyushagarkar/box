package com.ninescript.finalKey;

/**
 * 
 * @author Piyush
 *
 */

/*
 * Final Metod Used
 */

class Bike1 
{
	
	final void show()
	{
		System.out.println("From Final method");
	}
}

public class Honda extends Bike1{
	
	void show1()
	{
		
	}
	
	public static void main(String asd[]){
	
		new Honda().show();
	}
}
