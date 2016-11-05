package com.ninescript.test.strings.basicdemo1;

public class StringReverseExample {
	
	public static void main(String args[]) {
	
		
		String strOriginal = "Piyush Agarkar";
		System.out.println("Original String : " + strOriginal);

		

		strOriginal = new StringBuffer(strOriginal).reverse().toString();

		System.out.println("Reversed String : " + strOriginal);
	}


}
