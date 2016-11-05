package com.ninescript.test.strings.tokenizerdemo3;

import java.util.StringTokenizer;

public class StringTokenizerReturnDelimiterExample {
	
	public static void main(String[] args) {
		
		StringTokenizer st = new StringTokenizer("Java|StringTokenizer|Example 1", "|", true);

		
		while (st.hasMoreTokens())
			System.out.println(st.nextToken("|"));
		
		
	}

}
