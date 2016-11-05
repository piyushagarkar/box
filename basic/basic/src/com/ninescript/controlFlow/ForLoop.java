package com.ninescript.controlFlow;

/**
 * 
 * @author Piyush
 *
 */
public class ForLoop 
{

	public static void main(String[] args)
	{
		
	/*	//for(;;);
		for(int i=0;i<=10;i++)
		{
			System.out.println(i);
		}*/
		
		/*for(int i=0;i<=10;i++)
		{
			if(i==5)
				break;
			//System.out.println(i);
		continue;
			//System.out.println("Java");
		}*/
		
		
		int a[]={1,2,3,4,5,7};
		//for(int x=0; x<a.length;x++)
			//System.out.println(a[x]);
		for (int n:a)
			System.out.println(n);
	}
}
