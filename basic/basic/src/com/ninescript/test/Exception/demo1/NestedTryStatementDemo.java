package com.ninescript.test.Exception.demo1;

public class NestedTryStatementDemo {

	public static void main(String[] args) {

		try{

			int arr [] = {5,0,2,3};
			try{

				int x = arr[3]/arr[1];
			}

			catch(ArithmeticException e){

				System.out.println("Divide By Zero");
			}

			arr[4]=3;

		}	catch(ArrayIndexOutOfBoundsException aw){
				System.out.println("Array Index Out Of Bounds");
			}

		}

	}
	


