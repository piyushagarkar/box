package com.ninescript.piyush;

import java.io.EOFException;
import java.io.IOException;

public class Exception1 {

	
	public static void main(String[] args) {
		
		try{
			
			doStuff();
			
		}
		catch(Exception e){
			
			System.out.println("Exception Caught Exception");
		}
	}
	
	 static void  doStuff() throws EOFException{
	
		System.out.println("befor More Stuff Method");
		//moreStuff();
		System.out.println("After Mor Stuff Method");
	}
	
	 static void moreStuff() throws IOException,ArithmeticException,ArrayIndexOutOfBoundsException{
			
		System.out.println("More StuffMethod");
	}
	
}
