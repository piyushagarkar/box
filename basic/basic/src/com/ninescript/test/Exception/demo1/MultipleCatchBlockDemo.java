package com.ninescript.test.Exception.demo1;

public class MultipleCatchBlockDemo {
	
	public static void main(String[] args) {
		
		try{
			
			int arr[] = {1,2,3};
			arr[2] = 3/0;
			
		}
		
		
		catch(ArrayIndexOutOfBoundsException ae){
			
			System.out.println("Array Index Out OF Bounds");
			
		}
		

		catch(ArithmeticException e){
			System.out.println("Divide By Zero");
		}
	}

}
