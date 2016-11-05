
package com.ninescript.operaters;

/**
 * 
 * @author Piyush
 *
 */

public class opertersUse1 {
	//Relation Operators USe

	public static void main(String[] args) {
		System.out.println(10>58);
		System.out.println(10<58);
		System.out.println(10==58);
		System.out.println(10>=58);
		System.out.println(10<=58);
		System.out.println(10!=58);
		
		//Boolean Operator
		int i=50;
		if( i>10 & i++ <54);
		
		//Ternary Operator
		int a=54,b=56;
		int m =a<b?a:b;
		System.out.println(m);
		
		//Assignment Operators 
		
		
		int q,w,e;
		q=w=e=458;
		System.out.println(q);
		System.out.println(w);//All q w e variable have sdame value
		System.out.println(e);
		
		// Compound Statement 
		int sum=50 ,x=100;
		 sum +=x;
		 System.out.println(sum);
		 
		 //Type Casting 
		 
		 int d='x';
		 System.out.println(d);//implicit type casting ;
		 
		 double d1=145;
		 System.out.println(d1);
		 
		 
		int d3=(int)54.25; //Shows error for conversion can not convert value small to large we explicit casting
		System.out.println(d3);
		
		
		
		//Boolean Logical Operators &,|,^,!  Short circuit operatores && ||
		int tt=10,f1=20;
		if(tt>5 & f1<tt)
		{
			System.out.println("true");
		}
		else{
			System.out.println("false");
		}
		
		
	}

}
