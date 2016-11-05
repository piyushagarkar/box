package com.ninescript.piyush;

public class SimpleEx {

	
	public static void main(String[] args) {
	
	

		try{
			int a=65/0;
		}
		catch(Exception e){
			
			System.out.println("Exception"+ e);
		}
		
		//System.exit(0);

		finally{
			System.out.println("From Finally");

			System.exit(0);
		}
		}
}
