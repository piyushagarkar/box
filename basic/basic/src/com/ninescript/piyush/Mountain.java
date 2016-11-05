package com.ninescript.piyush;

 class One {
 public One foo() { return this; } }
 class Two extends One {
 public One foo() { return this; }
 } class Three extends Two {
	 public static void main(String[] args) {
		 
	 }	
 // insert method here
	 
	// A. public void foo() {}
	// B. public int foo() { return 3; }
	// C. public Two foo() { return this; }
	// D. public One foo() { return this; }
	//  public Object foo() { return this; }
 }

