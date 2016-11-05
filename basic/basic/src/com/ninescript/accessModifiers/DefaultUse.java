
package com.ninescript.accessModifiers;

/**
 * 
 * @author Piyush
 *
 */
	class a2 {
		void msg()
		{
			System.out.println("Piyush");
		}
}
	class DefaultUse
	{
		public static void main(String args[])
		{
			a2 a1= new a2();
			a1.msg();
		}
	}
