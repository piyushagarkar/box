package com.ninescript.piyush;

public class NestedTryCatch {

	public static void main(String[] args) {


		try{

			try{
					int a=25/0;

					System.out.println("Going to Disagree");
				}

			catch(Exception e){

					System.out.println(e);

				}

			try{
					int a[]= new int [5];
					System.out.println(a[10]);

					String str = "Piyush";
					System.out.println(str.charAt(10));

				}
			
				catch(Exception e){
				
					System.out.println(e);

					}
		}
			
			catch(Exception e){

				}
		
	}



}
