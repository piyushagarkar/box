package com.ninescript.superKey;

/**
 * 
 * @author Piyush
 *
 */

/*
 * Super is used to invoke Parent class instance
 * variable
 */

class Vehical{

	int Speed=50;
}

public class Bike extends  Vehical {

	int Speed=100;
	void show()
	{
		System.out.println(super.Speed); // When Super is used then Parent class variable is displayed

	}
	
	public static void main(String[] args){
		Bike B=new Bike();
		B.show();
	}
}


