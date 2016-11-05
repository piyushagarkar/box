

package com.ninescript.inheritanceUse;

/**
 * 
 * @author Piyush
 *
 */

public class Employee1 
	{
		int id;
		String name;
		Address1 address1;
		
		void showEmployee()
		{
			System.out.println(id+" "+name);
			System.out.println(address1.city+" "+address1.state+" "+address1.country);
		}
		
		Employee1(int id, String name, Address1 address1)
		{
			this.id=id;
			this.name=name;
			this.address1=address1;
			
		}
		
		public static void main(String []dsf)
		{
			Address1 a1=new Address1("kolhapur","Maharashtra","India");
			Address1 a2=new Address1("Pune","Maharashtra","India");
			
			
			Employee1 e1=new Employee1(124,"Piyush",a1);
			Employee1 e2=new Employee1(544,"Rashmi",a2);
					e1.showEmployee();
					e2.showEmployee();
		}

	}



 class Address1 
{
	String city,state,country;
	
	 Address1 (String city,String state,String country)
	 {
		 this.city=city;
		 this.state=state;
		 this.country=country;
		 
	 }
	

}


