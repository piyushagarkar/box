package com.ninescript.test.Exception.demo1;

public class ExceptionsTest {
	
	public static void main(String[] args) {
		
		String Languages [] = {"c", "c++", "Python ", "Peral", "Java" };
		
		try{
			
			for(int c = 0; c<=5; c++){
				
				System.out.println(Languages[c]);
			}
			
		}
			catch (Exception e){
				
				System.out.println("Exception Caught");
			}
		
	}

}
