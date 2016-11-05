package com.ninescript.piyush;


class Loopy {

	public static void main(String[] args) {

	/*	int[] x = {7,6,5,4,3,2,1};

		// insert code here 
		
	//	for(int y : x) 
			
			//for(int y=0, z=0; z<x.length; z++) {
				
			//	y = x[z]; 
			
			
			int y = 0; for(int z=0; z<x.length; z++) { y = x[z];
			
			
			

		System.out.print(y + " ");}*/
		
		
		
		
		
		
			try{
			
				int a= 30/0;
			System.out.println("/ is "+ a);
						
			}
			
			catch(NullPointerException e){
				
					e.printStackTrace();
				System.out.println("Exception caught");
			}
			
			finally{
			
				System.out.println("From Finaaly Block");
			}
			
			
			
			
	}

	
} 
