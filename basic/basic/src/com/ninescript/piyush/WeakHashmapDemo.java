/**
 * 
 */
package com.ninescript.piyush;

import java.util.HashMap;
import java.util.WeakHashMap;

/**
 * @author User 37
 *
 */
public class WeakHashmapDemo {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		WeakHashMap hashMap = new WeakHashMap();
		Temp t = new Temp();
		
		hashMap.put(t,"Piyush");
		System.out.println(hashMap);
		
		t= null;
		System.gc();
		Thread.sleep(5000);
		System.out.println(hashMap);
		
	
	}
	
}


	class Temp{
		
		public String toString(){
			return ("temp");
			
		}
		
		public void finalize(){
			
			System.out.println("Finalize Called");
			
		}
		
		
	}

