package com.ninescript.test.wrapper.demo1;

public class ConvertBinaryToDecimalNumber {

	
	public static void main(String[] args) {
		
		String stringBinaeryNumber="1010101";
		
		int decimalNumber=Integer.parseInt(stringBinaeryNumber,2);
		System.out.println("Binary Number is Converted into Decimal Number");
		System.out.println("vale of Decimal Number is "+ decimalNumber);
	}
}
