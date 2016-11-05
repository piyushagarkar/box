package com.ninescript.test.wrapper.demo1;

public class ConvertOctalToDecimalNumber {
	
	public static void main(String[] args) {
		
	
	String str="20";

		
			int decimalNumber = Integer.parseInt(str, 8);
			System.out.println("Octal number converted to decimal number");
			System.out.println("Decimal number is : " + decimalNumber);
	}
}
