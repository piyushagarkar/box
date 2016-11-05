package com.ninescript.test.Exception.demo1;

public class FrequentExceptionInJavaDemo1 {

	public static void main(String[] args) {

		try{
			int num1 = 30, num2 = 0;
			int output = num1/num2;
			System.out.println("Result " + output);

		}

		catch (ArithmeticException e){
			
			System.out.println("Exception Found : You can't Divdie By Zero");
			
		}

	}



}
