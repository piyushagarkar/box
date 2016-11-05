package com.ninescript.test.oops.demo4;

/**
 * 
 * @author piyush
 *
 */

class Cricket {
	
	public void type() {
		
		System.out.println(" Cricket is outdoor");
	}
}

class Game extends Cricket {
	

	public void type() {
		
		System.out.println(" Games can be Indoor & outdoor game");
	}

	public static void main(String[] args) {
		
		Cricket gm = new Cricket();
		Game ck = new Game();
		gm.type();
		ck.type();
		gm = ck; 
		gm.type(); 
	}
}


