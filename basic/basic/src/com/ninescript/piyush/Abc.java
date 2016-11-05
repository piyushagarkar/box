package com.ninescript.piyush;



class piyush{
	
	/*piyush(){
		System.out.println("Piyush");
	}*/
	
	private void show(){
		System.out.println("Piyush Show");
	}
	
	protected void show1(){
		show();
		System.out.println("Piyush show1");
	}
	
	public void shod(){
		show1();
		System.out.println("Piyush shod");
	}
}


class Pranav extends piyush{
	
	/*Pranav(){
		System.out.println("Pranav");
	}*/
	
	private void show(){
		System.out.println("Pranav Show");
	}
	
	protected void show1(){
		show();
		System.out.println("Pranav show1");
	}
	
	public void shod(){
		show1();
		System.out.println("Pranav shod");
	}

	
	
}
public class Abc extends Pranav{


	Pranav p = new Pranav();


	
}
