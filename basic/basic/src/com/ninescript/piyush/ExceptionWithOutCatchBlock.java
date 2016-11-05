package com.ninescript.piyush;

public class ExceptionWithOutCatchBlock {

	
	public static void main(String[] args) {
		
		try {
			int a=40,b=54;
				int c= a/0;
			System.out.println(a+b);
		}
		
		catch(Exception e){
			
		}
		
		finally{
			System.out.println("This is Finally");
			
		}
		
		
		try{
			
		}catch(Exception a){
			
			
		}
	}
}
