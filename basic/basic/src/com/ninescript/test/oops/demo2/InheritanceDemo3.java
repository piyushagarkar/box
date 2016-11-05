package com.ninescript.test.oops.demo2;


/**
 * @author Piyush
 */
	class AA {
	
		public void methodA() {
		
			System.out.println("method of class A");
		}
	}

	class BB extends AA {
		
		public void methodB() {
			
		System.out.println("method of class B");
		}
	}

	class CC extends AA {
		
		public void methodC() {
			
			System.out.println("method of class C");
		}
	}

	class DD extends AA {
		
		public void methodD() {
			
			System.out.println("method of class D");
		}
	}

	class InheritanceDemo3 {
		
		public void methodB() {
			
			System.out.println("method of class B");
		}

		public static void main(String args[]) {
			
			BB obj1 = new BB();
			CC obj2 = new CC();
			DD obj3 = new DD();
			obj1.methodA();
			obj2.methodA();
			obj3.methodA();
		}
	}


