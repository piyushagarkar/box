package com.ninescript.test.oops.demo3;

/**
 * 	
 * @author Piyush
 *
 */
	class Sample2{
		public void disp(char c) {
			System.out.println(c);
		}

		public void disp(int c) {
			System.out.println(c);
		}
	}

	class DisplayOverloading2 {
		public static void main(String args[]) {
			Sample2 obj = new Sample2();
			obj.disp('a');
			obj.disp(5);
		}
	}


