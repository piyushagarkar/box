package com.ninescript.test.oops.demo8;


/**
 * 
 * @author Piyush
 *
 */

class MyClass {
	
	interface MyInterfaceB {
		
		void myMethod();
	}
}

class NestedInterfaceDemo2 implements MyClass.MyInterfaceB {
	
	public void myMethod() {
		
		System.out.println("Nested interface method");
	}

	public static void main(String args[]) {
		
		MyClass.MyInterfaceB obj = new NestedInterfaceDemo2();
		obj.myMethod();
	}
}

