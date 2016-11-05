package com.ninescript.piyush;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class HashSetDemo {



	public static void main(String[] args) {
		
		HashSet h = new HashSet();
		
		LinkedHashSet l = new LinkedHashSet();

		l.add("Piyush");
		l.add("h");
		l.add(5);
		l.add(645);
		l.add(null);
		System.out.println(l);
		System.out.println(l.add("h"));
		
		System.out.println(l.size());
	
				h.add("Piyush");
				h.add("h");
				h.add(5);
				h.add(645);
				h.add(null);
			
				System.out.println(h.add("h"));
				System.out.println(h);
							
				System.out.println(h.size());
				
				
	}
}
