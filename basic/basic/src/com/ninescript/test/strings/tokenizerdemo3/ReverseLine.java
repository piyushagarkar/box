package com.ninescript.test.strings.tokenizerdemo3;

import java.util.StringTokenizer;

public class ReverseLine {
	
	public static void main(String[] args) {
		
		String strLine = "Java Reverse String Line by Line Example ";
		
		System.out.println( "                              Java Reverse String Line by Line Example ");
		
		StringTokenizer st = new StringTokenizer(strLine, " ");
		
		String strReversedLine = " ";
		
		while (st.hasMoreElements()) {
		
			strReversedLine = st.nextToken() + " " + strReversedLine; 
			
		}

		System.out.println("Reversed String by Words is  : "+ strReversedLine);
	}

}
