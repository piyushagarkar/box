package com.ninescript.staticUse;

public class   StaticNested 

{
	
	static int a=100;

		static class  InnerClass
		{
			
			int b=500;
			
			void innerShow()
			{
				System.out.println("From Inner Class ");
				System.out.println(b);
			}
			
		}
		
			void outerShow()
			{
					
				System.out.println("From Outer Class ");
				System.out.println(a);
				InnerClass in=new InnerClass();
				System.out.println(in.b);
				in.innerShow();
			}

				public static void main(String []as)
				{
					//StaticNested sn=new StaticNested();
					System.out.println(StaticNested.a);
					
					//sn.outerShow();
					//StaticNested.InnerClass in1=sn.new InnerClass(); 
				//	in1.innerShow();
					StaticNested. InnerClass in=new StaticNested .InnerClass();
					in.innerShow();
				}
}

