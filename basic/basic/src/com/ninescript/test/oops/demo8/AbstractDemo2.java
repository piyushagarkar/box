package com.ninescript.test.oops.demo8;

abstract class Sum {
	
	// abstract methods
	public abstract int SumOfTwo(int n1, int n2);

	public abstract int SumOfThree(int n1, int n2, int n3);

	// Regular method
	public void disp() {
		
		System.out.println("Method of class Sum");
	}
}

class AbstractDemo2 extends Sum {
	
	public int SumOfTwo(int num1, int num2) {
		
		return num1 + num2;
	}

	public int SumOfThree(int num1, int num2, int num3) {
		
		return num1 + num2 + num3;
	}

	public static void main(String args[]) {
		
		AbstractDemo2 obj = new AbstractDemo2();
		System.out.println(obj.SumOfTwo(3, 7));
		System.out.println(obj.SumOfThree(4, 3, 19));
		obj.disp();
	}
}

