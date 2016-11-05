

package com.ninescript.controlFlow;

/**
 * 
 * @author Piyush
 *
 */

public class MainInClass

{
	public static void main(String[] args)
	
	{
 	class p
		{	
 			int a;
			void mmain()
			{
				System.out.println("From Main Method Class");
			}
			
		}

		p p1=new p();
		p1.mmain();
		System.out.println(p1.a);
	}

}
