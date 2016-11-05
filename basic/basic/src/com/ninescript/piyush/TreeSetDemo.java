package com.ninescript.piyush;

import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		
		TreeSet t = new TreeSet();
		
		/*
		 
		 t.add(new StringBuffer("PP"));
		t.add(new StringBuffer("SD"));
		
		*/
		
		
		
		
		t.add("A");
		t.add("a");
		t.add("B");
		t.add("Z");
		t.add("w");
		t.add("T");
		t.add("j");
		t.add("K");
		t.add("A");
	
		
	/*	t.add("Piyush");
		t.add("putt");
		t.add("ROHIT");
		t.add("RRR");
	*/
		System.out.println(t.first());

		System.out.println(t.last());
		

		System.out.println(t.headSet("j"));
		

		System.out.println(t.tailSet("j"));
		
		
		System.out.println(t.comparator());
		
		//System.out.println(t.subSet("j", "a"));
		//System.out.println(t);
		
		
		
	}
}
