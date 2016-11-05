package com.ninescript.test.Exception.demo1;

public class FrequentExceptionInJavaDemo5 {
	
	public static void main(String[] args) {
		
		try{
			
			String str = null;
			System.out.println(str.length());
			
		}
		
		catch(NullPointerException ne){
			
			System.out.println("Null Pointer Exception ");
			
		}
	}

}
