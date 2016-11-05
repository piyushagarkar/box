//Created By Piyush
package com.ninescript.staticVariables;

public class StaticVariables {
	
	int n=20;//Instance Variable
	static int b=50;//Static Variable
	
	public static void main(String[] args) {
		StaticVariables sv = new StaticVariables();
			int a=555;		//Local Variable	
		System.out.println(sv.n);
		System.out.println(b);
		System.out.println(a);
		
		
	}

}
