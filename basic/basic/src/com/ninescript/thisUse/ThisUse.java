//Created By Piyush
package com.ninescript.thisUse;

//This can be use to invoke current class constructor
public class ThisUse {

int id; String name;
	
	ThisUse()
	{
		System.out.println("This IS default");
	}
	
	void ThisUSe(int id, String name)
	{
		this.id=id;
		this.name=name;
		
	}
	
	void display()
	{
		System.out.println(id+" "+name);
	}
 
	public static void main(String[] args) {
		ThisUse t = new ThisUse();
		t.display();
		t.ThisUSe(125,"Piyu");
		t.display();
	}
}

