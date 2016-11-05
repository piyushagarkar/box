package com.ninescript.piyush;


class SuperA{

	private int a=30;

	class SuperB{

		void show(){
			
		
			System.out.println("Value OF A "+ a);
		}
	}
	
}


class ASDD  extends SuperA  {
	public static void main(String[] args) {
		
	
		SuperA a = new SuperA();
		
	SuperB b=a.new SuperB(); 
			b.show();
}

}
