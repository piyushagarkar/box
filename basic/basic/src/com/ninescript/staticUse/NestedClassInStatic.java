package com.ninescript.staticUse;

 class NestedClassInStatic
{

	int num;
	
		static class x
		{
		static String sp="Inside Class";
		
		//num=200;
		int i=200;	
			/*{
				System.out.println(p);
			}*/
			}
		
		
			public static void main(String[] args)
			{
			//	NestedClassInStatic n=new NestedClassInStatic();
				NestedClassInStatic.x x1=new x();
				
			}
}
