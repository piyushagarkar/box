package com.ninescript.test.Exception.demo1;

class Test extends Exception {
	private int ex;

	 Test(int a) {
		ex = a;
	}

	public String toString() {
		return "MyException[" + ex + "] is less than zero";
	}
}

class UserDefinedExceptionDemo {
	static void sum(int a, int b) throws  Test {
		
		if (a < 0) {
			
			throw new  Test (a);
		} else {
			
			System.out.println(a + b);
		}
	}

	public static void main(String[] args) {
		
		try {
			
			sum(-10, 10);
		} 
		
		catch ( Test me) {
			
			System.out.println(me);
		}
	}
}