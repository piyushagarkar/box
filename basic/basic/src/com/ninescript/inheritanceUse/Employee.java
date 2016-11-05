
package com.ninescript.inheritanceUse;
/**
 * 
 * @author Piyush
 *
 */

public class Employee 
{
	int id;
	String name;
	Address address;
	
	void showEmployee()
	{
		System.out.println(id+" "+name);
		System.out.println(address.city+" "+address.state+" "+address.country);
	}
	
	Employee(int id, String name, Address address)
	{
		this.id=id;
		this.name=name;
		this.address=address;
		
	}
	
	public static void main(String []dsf)
	{
		Address a1=new Address("kolhapur","Maharashtra","India");
		Address a2=new Address("Pune","Maharashtra","India");
		
		
		Employee e1=new Employee(124,"Piyush",a1);
		Employee e2=new Employee(544,"Rashmi",a2);
				e1.showEmployee();
				e2.showEmployee();
	}

}



	
