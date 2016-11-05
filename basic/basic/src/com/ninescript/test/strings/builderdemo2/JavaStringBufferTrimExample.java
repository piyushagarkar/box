package com.ninescript.test.strings.builderdemo2;


public class JavaStringBufferTrimExample {

	public static void main(String[] args) {

		// create StringBuffer object
		StringBuffer sbf = new StringBuffer("   Hello World  !  ");

		

		String str = sbf.toString().trim();

		System.out.println("StringBuffer trim: \"" + str + "\"");


		System.out.println("\"" + trim(sbf) + "\"");
	}

	private static String trim(StringBuffer sbf) {

		int start, end;

		// find the first character which is not space
		for (start = 0; start < sbf.length(); start++) {
			if (sbf.charAt(start) != ' ')
				break;
		}

		// find the last character which is not space
		for (end = sbf.length(); end > start; end--) {
			if (sbf.charAt(end - 1) != ' ')
				break;
		}

		return sbf.substring(start, end);

	}
}

