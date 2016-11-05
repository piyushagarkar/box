package com.ninescript.test.Exception.demo1;

public class FrequentExceptionInJavaDemo3 {
	public static void main(String[] args) {
		
		try{
				int num = Integer.parseInt("XYZ");
				System.out.println(num);
				
			}
		
		catch(NumberFormatException ne){
			System.out.println("Number Format Exception Found");
		}

	}
}
