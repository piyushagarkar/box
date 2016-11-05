package com.ninescript.test.variables;
/**
 * 
 * @author piyush
 *
 */
public class VariablesInJava {

	public String pageName;


	private int pageNumber;
	
	
	int instanceField;

	
	static String staticField;

	public void method() {
		
		final String localVariable = "Initial Value";
		System.out.println(localVariable);
	}

	
	public static void main(String args[]) {
		VariablesInJava obj = new VariablesInJava();

		
		System.out.println(obj.instanceField);

		
		System.out.println(obj.staticField);
		System.out.println(VariablesInJava.staticField);
		System.out.println(new VariablesInJava().instanceField);
	}
}
