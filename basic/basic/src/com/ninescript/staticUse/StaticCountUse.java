package com.ninescript.staticUse;

public class StaticCountUse
{
     
     static int count=0;//will get memory when instance is created  
      
    StaticCountUse()
    {  
    	count++;  
    	System.out.println(count);  
    }  
      
    public static void main(String args[])
    {  
      
    	StaticCountUse sc=new StaticCountUse(); 
    	//sc.StaticCountUse();
    StaticCountUse sc1=new StaticCountUse();  
    	StaticCountUse sc2=new StaticCountUse(); 
    	
    	
      
    }  
 

}
