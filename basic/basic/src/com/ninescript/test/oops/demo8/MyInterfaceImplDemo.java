package com.ninescript.test.oops.demo8;

/**
 * 
 * @author Piyush
 *
 */
interface MyInterface1 {
	
	public void method1();

	public void method2();
}

class MyInterfaceImplDemo implements MyInterface1 {
	
	public void method1() {
		
		System.out.println("implementation of method1");
	}

	public void method2() {
		
		System.out.println("implementation of method2");
	}

	public static void main(String arg[]) {
		
		MyInterfaceImplDemo obj = new MyInterfaceImplDemo();
		obj.method1();
	}
}
