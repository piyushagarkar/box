
package com.ninescript.piyush;
	
	import java.util.*;

	public class LinkedListDemo {

	   public static void main(String args[]) {
	     
	      LinkedList ll = new LinkedList();
	      
	    System.out.println(  ll.hashCode());
	     
	      ll.add("F");
	      ll.add("B");
	      ll.add("D");
	      ll.add("E");
	      ll.add("C");
	      ll.addLast("Z");
	      ll.addFirst("A");
	      ll.add(1, "A2");
	      System.out.println("Original contents of Linked List: " + ll);

	      
	      ll.remove("F");
	      ll.remove(2);
	      System.out.println("Contents of LinkedList after deletion F & 2 : " + ll);
	      
	      
	      ll.removeFirst();
	      ll.removeLast();
	      System.out.println("LinkedList after deleting first and last: " + ll);

	      Object val = ll.get(2);
	      ll.set(2, (String) val + " Changed");
	      System.out.println("LinkedList after change: " + ll);
	      
	      
	      System.out.println(ll.hashCode());
	   }
	}


