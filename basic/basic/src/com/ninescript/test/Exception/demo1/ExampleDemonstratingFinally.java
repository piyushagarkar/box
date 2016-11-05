package com.ninescript.test.Exception.demo1;

public class ExampleDemonstratingFinally {
	
	public static void main(String[] args) {
		
		int a[] = new int[5];
		System.out.println("Out Of Try ");
		
		try{
			System.out.println("Invalid Access To Element at 7 " + a[7]);
			
		}
		
		finally {
					System.out.println("Finally Is Always Executed ");
			}
	
	}

}


