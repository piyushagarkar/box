package com.ninescript.piyush;

import java.util.*;

/**
 * 
 * @author Piyush
 *
 */
public class IteratorUse {

	public static void main(String[] args) {

		ArrayList arr = new ArrayList();
		for(int i = 0; i <= 10; i++ ){
			arr.add(i);
		}

		System.out.println(arr);

		Iterator itr = arr.iterator();

		while(itr.hasNext()){

			Integer i = (Integer)itr.next();
			if(i % 2 == 0){
				itr.remove();
			}

			else{
				System.out.println(i);
			}

			//System.out.println(arr);
		}

	}

}
