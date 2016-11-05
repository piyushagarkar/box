package com.ninescript.test.strings.basicdemo1;

public class StringCompare {
	
	public static void main(String[] args)
	{

	
	String s1 ="piyush";//String Constant pool
	String s2="PIYUSH"; 
	String s3="PIYUSH";
	String s4="piyush";
	
	String s5=new String("piyush");//@heap Storage.
	String s6=new String ("PIYUSH");
	String s7=new String ("PIYUSH");
	String s8=new String ("piyush");
	
	//String Compare by == operator
	System.out.println(s1==s4);
	System.out.println(s1==s2);
	System.out.println(s6==s8);
	System.out.println(s7==s8);
	System.out.println(s1==s8);
							
	//compare with equals() 
	System.out.println(s1.equals(s4));
	System.out.println(s1.equals(s2));
	System.out.println(s6.equals(s8));
	System.out.println(s7.equals(s8));
	System.out.println(s1.equals(s8));
	
	//Compare with compareTo()	
	System.out.println(s1.compareTo(s4));
	System.out.println(s1.compareTo(s2));
	System.out.println(s6.compareTo(s8));
	System.out.println(s7.compareTo(s8));
	System.out.println(s1.compareTo(s8));
	}
}