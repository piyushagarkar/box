/**
 * 
 */
package com.ninescript.piyush;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @author User 37
 *
 */
public class QueueDemo {

	public static void main(String[] args) {
		
		PriorityQueue priorityQueue = new PriorityQueue();
		
		//priorityQueue.poll();
		//priorityQueue.peek();
		
		//for(int i = 0 ; i < 10 ; i++)
			//priorityQueue.offer(i);
		
		//System.out.println(priorityQueue);
		
		
		priorityQueue.offer("A");
		priorityQueue.offer("A");
		
		priorityQueue.offer("T");
		
		priorityQueue.offer("R");
		
		priorityQueue.offer("g");
		
		priorityQueue.offer("f");
		
		
		System.out.println(priorityQueue);
	}
}
