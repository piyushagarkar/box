//Created By Piyush
//This Can be passed as an argument in the constructor call
package com.ninescript.thisUse;

public class ThisUse4 {

	A4 obj;
		
			ThisUse4(A4 obj)
				{
					this.obj=obj;
				}
	
					void display()
						{
							System.out.println(obj.data);
						}
		
}

 class A4
{
	int data=10;
	A4()
	{
		ThisUse4 b=new ThisUse4(this);
		b.display();
	}
	public static void main(String[] args) {
		A4 a=new A4();
	}
	}


