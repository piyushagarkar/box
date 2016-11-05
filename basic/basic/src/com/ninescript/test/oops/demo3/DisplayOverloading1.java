package com.ninescript.test.oops.demo3;

/**
 * 
 * @author piyush
 *
 */

 class Sample {

	public void disp(char c) {
		
		System.out.println(c);
	}

	public void disp(char c, int num) {
		
		System.out.println(c + " " + num);
	}
}

public class  DisplayOverloading1 {
	
	public static void main(String args[]) {
		
		Sample obj = new Sample();
		obj.disp('a');
		obj.disp('a', 10);
	}
}
