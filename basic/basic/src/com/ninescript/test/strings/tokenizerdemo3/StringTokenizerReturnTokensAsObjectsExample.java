package com.ninescript.test.strings.tokenizerdemo3;


import java.util.StringTokenizer;

public class StringTokenizerReturnTokensAsObjectsExample {

	public static void main(String[] args) {
		

		StringTokenizer st = new StringTokenizer("Java StringTokenizer Example");

			
		
		
			while (st.hasMoreElements()) {
			System.out.println(st.nextElement());
		}
	}
}
