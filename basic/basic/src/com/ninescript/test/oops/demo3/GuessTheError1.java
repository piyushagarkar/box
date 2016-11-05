package com.ninescript.test.oops.demo3;


	class Sample4 {
		
		public int myMethod(int num1, int num2) {
			
			System.out.println("First myMethod of class Demo");
			return num1 + num2;
		}

		/**public int myMethod(int var1, int var2) {
			
			System.out.println("Second myMethod of class Demo");
			return var1 - var2;
		}**/
	}

	class  GuessTheError1 {
		
				public static void main(String args[]) {
					
					Sample4 obj1 = new Sample4();
					obj1.myMethod(10, 10);
					obj1.myMethod(20, 12);
		}
	}



