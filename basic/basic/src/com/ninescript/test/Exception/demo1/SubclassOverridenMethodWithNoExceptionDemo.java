package com.ninescript.test.Exception.demo1;



class Super {
	
	void show() throws Exception {
		
		System.out.println("parent class");
	}
}



public class SubclassOverridenMethodWithNoExceptionDemo extends Super {
	
	void show() 
	{
		System.out.println("child class");
	}


	public static void main(String[] args) {
		
		try {
					Super s = new SubclassOverridenMethodWithNoExceptionDemo();
					s.show();
			} catch (Exception e)
				{
			
				}
		}
}

	


