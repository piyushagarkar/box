//Created By Piyush
//this can also be use as return type
package com.ninescript.thisUse;

class A {

	A getA()
	{
		return this;
	}
		void msg()
		{
			System.out.println("Hello Java");
		}
}
		
		public class ThisUse5
		{
			public static void main(String[] args) {
				new A().getA().msg();
			}
		}
