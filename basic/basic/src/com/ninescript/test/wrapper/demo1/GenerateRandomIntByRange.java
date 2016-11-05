package com.ninescript.test.wrapper.demo1;

public class GenerateRandomIntByRange {
	
	
	public static void main(String[] args) {
		
		int random = (int) (Math.random() * 10) + 5;
		System.out.println(random);
	
		int random1 = (int) (Math.random() * 1000) - 5;
		System.out.println(random);
	}

}
