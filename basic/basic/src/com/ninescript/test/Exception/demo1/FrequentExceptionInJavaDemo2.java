package com.ninescript.test.Exception.demo1;

public class FrequentExceptionInJavaDemo2 {
	
	public static void main(String[] args) {
		
		try{
			int a[]= new int[10];
			a[11]=9;
					
		}
		
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Array Index Out Of Bound Exception");
		}
	}

}
