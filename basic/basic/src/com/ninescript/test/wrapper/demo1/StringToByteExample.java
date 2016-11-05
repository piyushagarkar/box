package com.ninescript.test.wrapper.demo1;

public class StringToByteExample {
	
	public static void main(String[] args) {

		
		Byte bObj1 = new Byte("100");
		System.out.println(bObj1);

		
		String str = "100";
		Byte bObj2 = Byte.valueOf(str);
		System.out.println(bObj2);

		

	}

}
