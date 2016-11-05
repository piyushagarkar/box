package com.ninescript.piyush;

import java.util.*;

public class ListIteratorUse {

	public static void main(String[] args) {
		
		LinkedList l = new LinkedList();
		
		l.add("Piyush");
		l.add("Ram");
		l.add("Rahul");
		l.add("Tushar");
		l.add("Neha");
		l.add("Rohit");
		l.add("Plash");
		
		
		System.out.println(l);
		
		ListIterator itr =l.listIterator();
		
		while(itr.hasNext()){
			String s=(String)itr.next();
			
			if(s.equals("Piyush")){
				itr.remove();
			}
			else if (s.equals("Tushar")){
				itr.add("Pranav");
			}
			else if (s.equals("Rohit")){
				itr.set("Plash");
			}
			
			//	System.out.println(l);
			
		}//System.out.println(l);
	}
}
