package com.ninescript.test.wrapper.demo1;

public class JavaFloatCompareExample {

public static void main(String[] args) {
	

	float f=12.23f;
	float f1=25.32f;

	int i = Float.compare(f, f1);

			if(i>0)
			{
				System.out.println("First One Is grater Number");
			}
			else if(i<0)
			{
				System.out.println("Second One Is  greter number");
			}
			else
			{
				System.out.println("Equal Number");
			}
			
			
			Float fObj1 = new Float("5.35");
			Float fObj2 = new Float("5.34");
		
			int i2 = fObj1.compareTo(fObj2);

			if (i2 > 0) {
				
				System.out.println("First is grater");
			}
			
			else if (i2 < 0) {
				
				System.out.println("Second is grater");
			}
			
			else {
				
				System.out.println("Both are equal");
			}

		}
}


