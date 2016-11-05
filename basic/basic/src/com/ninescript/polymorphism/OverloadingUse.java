
package com.ninescript.polymorphism;

/**
 * 
 * @author Piyush
 *
 */

public class OverloadingUse {

	void show()//Show is OverLoaded
	{
		System.out.println("Null Method");
	}
	int show(int a)//Show is OverLoaded
	{
		System.out.println(a);
		return a;
		
	}
	
	long show(long a)//Show is OverLoaded
	{
		System.out.println("NO Pass ");
		return a;
	}

	public static void main(String ds[])
	{
		OverloadingUse o=new OverloadingUse();
		o.show();
		o.show(5);
		o.show(10544435435434L);
		
	}
}

