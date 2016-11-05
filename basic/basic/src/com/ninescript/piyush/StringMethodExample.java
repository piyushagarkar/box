package com.ninescript.piyush;

public class StringMethodExample {
	
	
	
	public static void main(String[] args) {
		
		String s=" Piyush ";	
		System.out.println(" Piyush ");
		
		//String Upper Case
		System.out.println("ToupperCase");
		System.out.println(s.toUpperCase());
		System.out.println();
		
		//String LoweCase
		System.out.println("LowerCase");
		System.out.println(s.toLowerCase());
		System.out.println();
		
		//Use of String Trim 
		System.out.println("Trim");
		System.out.println(s.trim());
		
		// Java String endsWith and startWith
		System.out.println("Sting Starts withv pi ");
		System.out.println(s.startsWith("Pi"));
		System.out.println("String Ends With h");
		System.out.println(s.endsWith("h"));
		System.out.println();
		
		//Java Length 
		System.out.println("Length Of String");
		System.out.println(s.length());
		System.out.println();
		
		//java String intern
		System.out.println("Intern");
		String s2=s.intern();
		System.out.println(s2);
		System.out.println();
		
		//java String valueOf
		System.out.println("Value of convert int value into Sting");
			int a=10;
		System.out.println(s.valueOf(a));
		System.out.println(s.valueOf(s));
		System.out.println();
		
		//String Replace
		System.out.println("Piyush Replace By Rohit");
	    String ss=s.replace("Piyush", "Rohit");		
	    System.out.println(ss);
	    System.out.println();
	}

}
