package com.ninescript.piyush;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.RandomAccess;

import com.ninescript.test.strings.basicdemo1.RemoveLeadingTrailingSpace;

public class SimpaleCollection {

	
	public static void main(String[] args) {
		
		
		ArrayList l = new ArrayList<>();
		
		l.add("A");
		l.add("Piyush");
		l.add("T");
		l.add(2542);
		l.add(54555);
		l.add("A");
		l.add(null);
		System.out.println(l);
		
		//l.remove("A");
		//System.out.println(l);
		
	//	l.remove(3);
	//	System.out.println(l);
		

		l.remove("2542");
		System.out.println(l);
	
		
		ArrayList l1 = new ArrayList();
		LinkedList l2 = new LinkedList();
		
		System.out.println(l1 instanceof Serializable);
		System.out.println(l1 instanceof Cloneable);
		
		System.out.println(l2 instanceof Serializable);
		System.out.println(l2 instanceof Cloneable);
				
		System.out.println(l1 instanceof RandomAccess);
		System.out.println(l2 instanceof RandomAccess);
						
		System.out.println(l1 );
		
	}
}
