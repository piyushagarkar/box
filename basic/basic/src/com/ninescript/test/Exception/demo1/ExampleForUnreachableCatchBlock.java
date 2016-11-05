package com.ninescript.test.Exception.demo1;

public class ExampleForUnreachableCatchBlock {
	
	public static void main(String[] args) {
		
		try{
			int arr[] = {1,2,3};
			arr[2] = 3/0;
		}
		
		catch (Exception e){
			System.out.println("Genric Exception");
		}
		
	/*	catch(ArrayIndexOutOfBoundsException ar){
			System.out.println("Array Index Out Of Bound Exception");
		}*/
	}

}
