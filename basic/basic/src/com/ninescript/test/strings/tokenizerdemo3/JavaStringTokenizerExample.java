package com.ninescript.test.strings.tokenizerdemo3;

import java.util.StringTokenizer;

public class JavaStringTokenizerExample {
	
	public static void main(String[] args) {
		
		StringTokenizer st= new StringTokenizer("Java String Tokenizer Example");
		
		while(st.hasMoreTokens())
			System.out.println(st.nextToken());
		
		

	}
}
