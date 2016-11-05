package com.ninescript.test.Exception.demo1;

import java.util.Scanner;

public class DivisionWithExceptionHandling {

	
	public static void main(String[] args) {
		
		int a, b, result;
		
		Scanner input = new Scanner(System.in);
		System.out.println("First two Integers");
		
		a = input.nextInt();
		b = input.nextInt();
		
		try{
			
			result =a/b;
			System.out.println("Result is : " + result);
			
		}
		
		catch(ArithmeticException e){
			
				System.out.println("Exception Caught By Divisoin By Zero");
						
			}
		
		  
		
	}
}
