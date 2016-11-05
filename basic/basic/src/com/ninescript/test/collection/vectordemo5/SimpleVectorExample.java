package com.ninescript.test.collection.vectordemo5;

import java.util.Vector;


public class SimpleVectorExample {

	public static void main(String[] args) {
		
		Vector v = new Vector();
		
		v.add("1");
		v.add("2");
		v.add("3");
		
		System.out.println("Getting elements of Vector");
		System.out.println(v.get(0));
		System.out.println(v.get(1));
		System.out.println(v.get(2));
	
		
	}
}
