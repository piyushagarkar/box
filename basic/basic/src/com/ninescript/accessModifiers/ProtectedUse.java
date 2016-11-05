package com.ninescript.accessModifiers;

import com.ninescript.Enum.*;

/**
 * 
 * @author Piyush
 *
 */

public class ProtectedUse extends ForProtectedUse
{

	public static void main(String[] args)
	{
		ProtectedUse a= new ProtectedUse();
		
		System.out.println(a.b);

		a.msg();
	}
}
