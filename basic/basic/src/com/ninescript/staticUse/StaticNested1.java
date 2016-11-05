package com.ninescript.staticUse;

public class StaticNested1 

{
	int a=10;
		
		class ABC
		{
			int b=1001;
			void abcShow()
			{
				System.out.println("From ABC Class abcShow Method");
				
			}
		
		
			class XYZ
			{
				int c=55;
				void xyzShow()
				{
					System.out.println("From XYZ CLass xyzShow");
				}
			}
		}
			
			void show()
			{
				System.out.println("From main Outer class");
			}
	
	

}
