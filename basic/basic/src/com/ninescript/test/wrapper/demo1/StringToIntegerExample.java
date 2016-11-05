package com.ninescript.test.wrapper.demo1;

public class StringToIntegerExample {
	
	public static void main(String[] args) {

		
		Integer intObj1 = new Integer("100");
		System.out.println(intObj1);

	
		String str = "100";
		Integer intObj2 = Integer.valueOf(str);
		System.out.println(intObj2);

		

	}

}
