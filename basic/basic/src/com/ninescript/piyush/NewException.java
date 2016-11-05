package com.ninescript.piyush;

public class NewException {
	
  public static void asd() throws InterruptedException {
		  
	  System.out.println("Just 4 Fun");
		 
	  throw new InterruptedException();
		  }

			public static void main(String[] args) {
				
				try {
					asd();
				} catch (InterruptedException e) {
				
					e.printStackTrace();
				}
				
	}
	

}