package com.ninescript.test.staticDemo.staticblock;

import java.util.Random;

/**
 * 
 * @author piyush
 *
 */
public class StaticInitializer
{
	
	private static int array[];
    private static int length = 10;

    static {

        array = new int[length];
        Random rnd = new Random();

        for(int i=0; i < length; i++)
        array[i] = rnd.nextInt(100);
    }
}
