package com.ninescript.test.collection.demo4;

import java.util.Vector;
import java.util.Collections;

/**
 * 
 * @author User 37
 *
 */

public class ShuffleElementsOfVectorExample {

	public static void main(String[] args) {


		Vector v = new Vector();


		v.add("1");
		v.add("2");
		v.add("3");
		v.add("4");
		v.add("5");

		System.out.println("Before shuffling, Vector contains : " + v);



		Collections.shuffle(v);

		System.out.println("After shuffling, Vector contains : " + v);

	}
}

