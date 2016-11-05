package com.ninescript.piyush;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.Iterator;





import javax.swing.plaf.basic.BasicScrollPaneUI.HSBChangeListener;

/**
 * 
 * @author Piyush
 *
 */
public class HashMapUse {

	public static void main(String[] args) {

		HashMap hashMap= new HashMap();

		hashMap.put("Piyush",800);
		hashMap.put("Rohit", 700);
		hashMap.put("Venkatesh", 200);
		hashMap.put("Nagarajnua", 500);

		//hashMap.put("Nagarajnua12", 500);

		//System.out.println(hashMap);

		System.out.println(hashMap.put("Rohit", 700));


		System.out.println();
		System.out.println();
		System.out.println("---------------------------");


		Set S = hashMap.keySet();

		//System.out.println("Hash Map Key In Set : " + S);

		Collection C= hashMap.values();

		System.out.println("Hash Map Values In Collection: "+C);


		Set S1 = hashMap.entrySet();
		//System.out.println("Hash Map Keys And Values In Set Form : " + S1);


		Iterator itr = S1.iterator();

		while(itr.hasNext())
		{
			Map.Entry M1=  (Map.Entry)itr.next();

		//	System.out.println(M1.getKey() + "------------" + M1.getValue());
		
			
		
		
			if(M1.getKey().equals("Nagarajnua")!=false)
			
			{
				System.out.println(M1.setValue(1000));
					
			}
			
			System.out.println(M1);
	}
		
		
	}
}
