package com.ninescript.test.wrapper.demo1;

public class JavaStringToDoubleExample {
	
	public static void main(String[] args) {
		
		
				// 1. Construct Double using constructor.
				Double dObj1 = new Double("100.564");
				System.out.println(dObj1);

				// 2. Use valueOf method of Double class. This method is static.
				String str1 = "100.476";
				Double dObj2 = Double.valueOf(str1);
				System.out.println(dObj2);

				
				String str2 = "76.39";
				double d = Double.parseDouble(str2);
				System.out.println(d);

				

	}

}
