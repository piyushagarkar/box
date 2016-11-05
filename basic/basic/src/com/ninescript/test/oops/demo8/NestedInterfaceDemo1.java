package com.ninescript.test.oops.demo8;

/**
 * 
 * @author Piyush
 *
 */
interface MyInterfaceA {
	void display();

	interface MyInterfaceB {
		void myMethod();
	}
}

class NestedInterfaceDemo1 implements MyInterfaceA.MyInterfaceB {
	
	public void myMethod() {
		
		System.out.println("Nested interface method");
	}

	public static void main(String args[]) {
		
		MyInterfaceA.MyInterfaceB obj = new NestedInterfaceDemo1();
		obj.myMethod();
	}
}

