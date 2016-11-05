package com.ninescript.piyush;

import java.util.IdentityHashMap;

public class IdentyHashMapDemo {

	public static void main(String[] args) {
		
		IdentityHashMap iMaP = new IdentityHashMap();		
		Integer i1 = new Integer(10);
		Integer i2 = new Integer(10);
		
		iMaP.put(i1,"Piyush");
		iMaP.put(i2, "PraThamesh");
		
		System.out.println(iMaP);
		
	}
	
}
