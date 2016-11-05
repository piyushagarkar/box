package com.ninescript.test.wrapper.demo1;

public class JavaStringToBoolean {

	public static void main(String[] args) {
	
		String str="false";
		
		Boolean obj=new Boolean(str);
		System.out.println(obj);
		
		Boolean b=Boolean.valueOf(str);
		System.out.println(b);
		
		
	}

}
