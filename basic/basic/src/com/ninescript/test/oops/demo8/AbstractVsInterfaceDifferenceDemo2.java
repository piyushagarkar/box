package com.ninescript.test.oops.demo8;

/**
 * 
 * @author piyush
 *
 */

// first interface
interface Example11 {
	
	public void display1();
}

// second interface
interface Example22 {
	
	public void display2();
}

// This interface is extending both the above interfaces
interface Example33 extends Example11, Example22 {
	
}

class Example44 implements Example33 {
	
	public void display1() {
		
		System.out.println("display2 method");
	}

	public void display2() {
		
		System.out.println("display3 method");
	}
}

class AbstractVsInterfaceDifferenceDemo2 {
	
	public static void main(String args[]) {
		
		Example44 obj = new Example44();
		obj.display1();
	}
}

