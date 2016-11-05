package com.ninescript.test.Exception.demo1;

public class ExampleDemonstratingThrow {
	
	public static void main(String[] args) {
		
		avg();
	}

	static void avg(){
		
		try {
			
			throw new ArithmeticException("demo");
			
		}
		
		catch(ArithmeticException e){
			System.out.println("Exception Found");
		}
	}
}
