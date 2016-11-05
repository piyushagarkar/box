//Created By Piyush
package com.ninescript.thisUse;
//This Key word can be use to invoke current class method implicit
public class ThisUse1 {
	
	void a()
	{
		System.out.println("Hello");
	}
	
	void n()
	{
		this.a();
	}

	public static void main(String[] args) {
		
		ThisUse1 t=new ThisUse1();
		//new ThisUse1.n();
		t.n();
	t.a();
	}
}
