package com.ninescript.test.wrapper.demo1;
/**
 * 
 * @author Piyush
 *
 */

public class ConvertIntToOctalExample {

	public static void main(String[] args) {
	
		int i=548;
		
		String str=Integer.toOctalString(i);
		System.out.println("Decimal Number is converted to Octal Number is");
		System.out.println("Octal Value of "+i+" is "+" "+str);
	}

}
