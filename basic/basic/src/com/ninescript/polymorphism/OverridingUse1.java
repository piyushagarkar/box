
package com.ninescript.polymorphism;

/**
 * 
 * @author Piyush
 *
 */

public class OverridingUse1 extends OverridingUse {
	
	public int show(int a)
	{
		System.out.println("From Single paramter method from class OverridingUse1"+"  "+a);
			return a;
	}
	
	public static void main(String []sdf)
	{
		OverridingUse o = new OverridingUse();
		OverridingUse o1 = new OverridingUse1();
		o.show(10);
		o1.show(10);
		o1.show();
		
	}
}
