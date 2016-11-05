package com.ninescript.test.wrapper.demo1;

public class GenerateRandomNumbers {
	
	
	public static void main(String[] args) {
		
		System.out.println("Random numbers between 0.0 and 1.0 are,");
		for (int i = 0; i < 5; i++)
			System.out.println("Random Number [" + (i + 1) + "] : " + Math.random());

		
		System.out.println("Random numbers between 1 and 100 are,");
		for (int i = 0; i < 5; i++)
			System.out.println("Random Number [" + (i + 1) + "] : " + (int) (Math.random() * 100));
	}

}
