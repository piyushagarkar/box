

package com.ninescript.garbageCollection;

/**
 * 
 * @author Piyush
 *
 */

public class GarbageUse 
{
	public void finalize()
	{
		System.out.println("Finalize");
	}
	
	public static void main()
	{
		GarbageUse gu=new GarbageUse();
		//gu.finalize();
		GarbageUse gu1=new GarbageUse();
		//gu=null;
		//gu=null;
		
	}
	

}
