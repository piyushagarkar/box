package com.ninescript.test.oops.demo4;

/**
 * 
 * @author Piyush
 *
 */

class ParentX {
	
}

class Child1 extends ParentX {
	
}

class Child2 extends ParentX {
	
}


class instanceofDemo2 {

	public static void main(String[] args) {
		
		ParentX p = new ParentX();
		Child1 c1 = new Child1();
		Child2 c2 = new Child2();

		System.out.println(c1 instanceof ParentX); // true
		System.out.println(c2 instanceof ParentX); // true
		System.out.println(p instanceof Child1); // false
		System.out.println(p instanceof Child2); // false

		p = c1;
		System.out.println(p instanceof Child1); // true
		System.out.println(p instanceof Child2); // false

		p = c2;
		System.out.println(p instanceof Child1); // false
		System.out.println(p instanceof Child2); // true

	}
}

