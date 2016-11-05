package com.ninescript.piyush;

public class StaticUse {

	
	static int s=40;
	int a=20;
	
	void show(){
		System.out.println(s);
		System.out.println(a);
	}
	
	void dataShow(){
		s=44;
		a=20;
		System.out.println(s);
		System.out.println(a);
		s++;
		a++;
		System.out.println(s);
		System.out.println(a);
	}
	
	
	public static void main(String[] args) {
		new StaticUse().show();
		new StaticUse().dataShow();
	
	}
	
}
