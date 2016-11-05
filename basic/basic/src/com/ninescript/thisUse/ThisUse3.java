//Created By Piyush
//This can be passed as an argument in the method
package com.ninescript.thisUse;

public class ThisUse3 {

void m(ThisUse3 obj)
{
	System.out.println("Hello");
	}
void p()
{
	m(this);
	}
public static void main(String[] args) {
	ThisUse3 t=new ThisUse3();
	t.p();
	
}
}
