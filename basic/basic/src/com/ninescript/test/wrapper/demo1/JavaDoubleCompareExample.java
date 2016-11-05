package com.ninescript.test.wrapper.demo1;

public class JavaDoubleCompareExample {

	public static void main(String[] args) {



		double d1 = 5.35;
		double d2 = 5.34;
		int i1 = Double.compare(d1, d2);

		if (i1 > 0) {
			
			System.out.println("First is grater");
		} 
		else if (i1 < 0) {
		
			System.out.println("Second is grater");
		} 
		else {
		
			System.out.println("Both are equal");
		}


		Double dObj1 = new Double("5.35");
		Double dObj2 = new Double("5.34");
		int i2 = dObj1.compareTo(dObj2);

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
