package com.ninescript.test.Exception.demo1;

import java.util.Scanner;


public class DivisionWithoutExceptionHandling {

	public static void main(String[] args) {
		
		int a, b, result;
		
	 Scanner input = new Scanner(System.in);
	 System.out.println("Input The Two Integers");
	 
	 a = input.nextInt();
	 b = input.nextInt();
	
	 result = a/b;
	 
	 System.out.println("Result IS : " + result);
	 
	 
	}
}
