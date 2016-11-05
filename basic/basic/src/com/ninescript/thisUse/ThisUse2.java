//Created By Piyush
//This can be used to Refer Current class instance variable
package com.ninescript.thisUse;

public class ThisUse2 {
	int id; String name;

	ThisUse2(int id, String name)
	{
		this.id=id;
		this.name=name;
		
	}
	void show()
	{
		System.out.println(id+" "+name);
	}
		public static void main(String[] args) {
	
			ThisUse2 t=new ThisUse2(123,"Ram");
			t.show();
			
}
}

