package com.ninescript.test.Exception.demo1;

public class ExampleDemonstratingThrows {
	
	static void check() throws ArithmeticException{
		
		System.out.println("Inside Check Function");
		throw new ArithmeticException("demo");
	
	}
	
	public static void main(String[] args) {
		
		try{
			check();
			
		} 
		
		catch(ArithmeticException e){
			
			System.out.println("caught " + e);
			
		}
	}
	

}
