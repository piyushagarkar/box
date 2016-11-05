package com.ninescript.piyush;


public class UseInterface implements interface1{
	
	
	public void show()
	{
	System.out.println("Interface method");
	}
	
	public void showData(int c){
		//this.c=c;
		System.out.println(c);
	}



	public static void main(String[] args) {
		
		UseInterface u=new UseInterface();
		u.show();
		u.showData(20);
	}

}